package org.atgas.sync.media.beyondtv.commands;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.atgas.sync.boxee.Series;
import org.atgas.sync.boxee.VideoFile;
import org.atgas.sync.media.beyondtv.BTVSession;
import org.atgas.sync.media.beyondtv.PropertyConverter;
import org.atgas.sync.media.beyondtv.webservices.BTVLibrary;
import org.atgas.sync.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;
import org.atgas.sync.media.tvdb.Episode;
import org.atgas.sync.media.tvdb.Session;

import sun.util.resources.CalendarData_ar;

public class BoxeeImport extends AbstractSeriesCommand<TVDBLookupResults> {
	private static final Logger LOG = Logger.getLogger(BoxeeImport.class.getName());
	private EntityManager em;
	private Session tvdbSession;
	private final Properties idMappings;

	public BoxeeImport(BTVSession session, Properties idMappings) throws Exception {
		super(session);
		this.idMappings = idMappings;
		em = Persistence.createEntityManagerFactory("BoxeeDBAccess").createEntityManager();
		tvdbSession = Session.create("950449EF1450CC0A");
	}
	
	@Override
	public void invoke(PVSPropertyBag item) throws Exception {
		Map<String, String> btvSeriesProps = PropertyConverter.convert(item);
		
		BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();
		List<Map<String, String>> btvEpisodeProps = PropertyConverter.convert(library.getItemsBySeries(session.ticket, btvSeriesProps.get("Name")));
		Map<String, VideoFile> currentlyStoredEpisodes = loadBoxeeEpisodes(btvEpisodeProps);
		
		if (btvEpisodeProps.size() == currentlyStoredEpisodes.size()) {
			LOG.info("BTV Series \"" + btvSeriesProps.get("Name") + "\" is fully transfered");
		} else {
			LOG.info("Beginning transfer of episodes from BTV Series \"" + btvSeriesProps.get("Name") + "\"");
		}
		
		org.atgas.sync.media.tvdb.Series tvdbSeriesID = null;
		if (currentlyStoredEpisodes.isEmpty()) {
			tvdbSeriesID = determineSeriesFromTVDB(btvSeriesProps, btvEpisodeProps);
		} else {
			Map<Series, Integer> seriesCount = countBoxeeSeries(currentlyStoredEpisodes);
			if (seriesCount.size() == 1) {
				tvdbSeriesID = loadSeriesFromTVDB(seriesCount.keySet().iterator().next());
			} else {
				LOG.warning("BTV series maps to multiple Boxee series.  Will purge current episode, and reattempt transfer");
				deleteBoxeeEpisodes(currentlyStoredEpisodes);
				tvdbSeriesID = determineSeriesFromTVDB(btvSeriesProps, btvEpisodeProps);
			}
		}
		
		if (tvdbSeriesID != null) { 
			Map<String, Map<String, String>> transferredProps = new HashMap<String, Map<String,String>>();
			List<Map<String, String>> unTransferredProps = new ArrayList<Map<String,String>>();
			for (Map<String, String> episodeProps : btvEpisodeProps) {
				String path = episodeProps.get("FullName");
				if (!currentlyStoredEpisodes.containsKey(toBoxeePath(path))) {
					unTransferredProps.add(episodeProps);
				} else {
					transferredProps.put(path, episodeProps);
				}
			}
			
			Map<String, Episode> bTVtoTVDBMap = createBTVtoTVDBMap(tvdbSeriesID, btvSeriesProps, unTransferredProps, currentlyStoredEpisodes.values());
			
			if (!transferredProps.isEmpty()) {
				LOG.info("BTV Series \"" + btvSeriesProps.get("Name") + "\" will update " + transferredProps.size() + " episodes.");
			}
			Series boxeeSeries = createBoxeeSeries(tvdbSeriesID, btvSeriesProps);
			updateVideoFiles(boxeeSeries, currentlyStoredEpisodes, transferredProps, bTVtoTVDBMap);

			if (!unTransferredProps.isEmpty()) {
				LOG.info("BTV Series \"" + btvSeriesProps.get("Name") + "\" will transfer " + unTransferredProps.size() + " episodes.");
			}
			storeBoxeeEpisodes(createVideoFiles(boxeeSeries, unTransferredProps, bTVtoTVDBMap));
		}
	}



	private org.atgas.sync.media.tvdb.Series loadSeriesFromTVDB(Series series) throws Exception {
		String title = series.getTitle();
		int tvdbID = Integer.parseInt(series.get_strPath_());
		
		for (String word : title.split("\\s+")) {
			List<org.atgas.sync.media.tvdb.Series> matches = tvdbSession.getSeriesByName(word);
			for (org.atgas.sync.media.tvdb.Series tvdbSeries : matches) {
				if (tvdbSeries.getTvdbID() == tvdbID) {
					return tvdbSeries;
				}	
			}
		}
	
		return null;
	}

	private org.atgas.sync.media.tvdb.Series determineSeriesFromTVDB(Map<String, String> btvSeriesProps, List<Map<String, String>> btvEpisodeProps) throws Exception {
		String title = btvSeriesProps.get("Name");
		
		Map<Integer, org.atgas.sync.media.tvdb.Series> tvdbSeries = new HashMap<Integer, org.atgas.sync.media.tvdb.Series>();
		for (String word : title.split("\\s+")) {
			List<org.atgas.sync.media.tvdb.Series> matches = tvdbSession.getSeriesByName(word);
			for (org.atgas.sync.media.tvdb.Series series : matches) {
				tvdbSeries.put(series.getTvdbID(), series);				
			}
		}
		
		// If we can match the Zap2It id then we are done.
		String id = btvSeriesProps.get("SeriesKey");
		for (org.atgas.sync.media.tvdb.Series match : tvdbSeries.values()) {
			if (match.getZap2itID() != null && match.getZap2itID().endsWith(id)) {
				return match;
			}	
		}
		
		// Load up all the TVDB episodes
		List<Episode> allEpisodes = new ArrayList<Episode>();
		for (org.atgas.sync.media.tvdb.Series match : tvdbSeries.values()) {
			try {
				allEpisodes.addAll(tvdbSession.extractEpisodes(tvdbSession.downloadSeriesDetails(match)));
			} catch (Exception e) {
				LOG.warning("Could not download episodes for " + match.getName());
			}
		}

		Map<String, Episode> tvdbEpisodes = new HashMap<String, Episode>();
		for (Map<String, String> episodeProps : btvEpisodeProps) {
			Episode tvdbEpisode = determineEpisodeFromTVDB(episodeProps, allEpisodes);
			if (tvdbEpisode != null) {
				tvdbEpisodes.put(toBoxeePath(episodeProps.get("FullName")), tvdbEpisode);
			}
		}
		
		Map<Integer, Integer> possibleSeries = countTVDBSeries(tvdbEpisodes);
		if (possibleSeries.isEmpty()){
			LOG.warning("Could not match any episodes for " + title);
			return null;
		} else if (possibleSeries.size() == 1) {
			Entry<Integer, Integer> entry = possibleSeries.entrySet().iterator().next();
			double percent = (100.0 * entry.getValue()) / btvEpisodeProps.size();
			LOG.warning("Choosing tvdb series " + entry.getKey() + " that matches " + percent + "% of episodes");
			return tvdbSeries.get(entry.getKey());
		} else {
			LOG.warning("Multiple tvdb series match the episodes for beyondTV series " + title);
			int max = 0;
			int nextMax = 0;
			for (Entry<Integer, Integer> entry : possibleSeries.entrySet()) {
				org.atgas.sync.media.tvdb.Series series = tvdbSeries.get(entry.getKey());
				LOG.warning("\t" + series.getTvdbID() + "\t" + series.getName() + "\t" + series.getFirstAired() + "\t" + entry.getValue());
				if (entry.getValue() > max) {
					nextMax = max;
					max = entry.getValue();
				}
			}
			
			if (max >= 3 * nextMax) {
				for (Entry<Integer, Integer> entry : possibleSeries.entrySet()) {
					if (entry.getValue() == max) {
						org.atgas.sync.media.tvdb.Series series = tvdbSeries.get(entry.getKey());
						LOG.warning("Using \t" + series.getName() );
						return series;
					}
				}
			}

			return null;
		}
	}

	private Episode determineEpisodeFromTVDB(Map<String, String> episodeProps, List<Episode> allEpisodes) {
		String zap2ItID = episodeProps.get("EPGID");
		String title = episodeProps.get("EpisodeTitle");
		Episode episode = getEpisodeByID(allEpisodes, zap2ItID);
		
		if (episode == null) { 
			episode = getEpisodeByName(allEpisodes, title);
		}	
		
		return episode;
	}
	
	private Episode determineEpisodeFromTVDBWithKnownSeries(Map<String, String> episodeProps, List<Episode> allEpisodes) {
		String zap2ItID = episodeProps.get("EPGID");
		String title = episodeProps.get("EpisodeTitle");
		Episode episode = getEpisodeByID(allEpisodes, zap2ItID);
		
		if (episode == null) { 
			episode = getEpisodeByName(allEpisodes, title);
		}	
		
		if (episode == null) {
			episode = getEpisodeByDate(allEpisodes, episodeProps.get("OriginalAirDate"));
		}
		if (episode == null) {
			LOG.warning("Unable to match beyondTV episode to TVDB episode: " + zap2ItID + "\t" + title);
		}
		return episode;
	}
	
	private Episode getEpisodeByName(List<Episode> episodes, String name) {
		Episode retval = null;
		if (name == null) return null;
		name = name.trim();
		for (Episode episode : episodes) {
			if (episode.getName().trim().equalsIgnoreCase(name)) {
				if (retval == null) {
					retval = episode;
				} else {
					return null;
				}
			}
		}
		
		return retval;
	}

	private org.atgas.sync.media.tvdb.Episode getEpisodeByID(List<org.atgas.sync.media.tvdb.Episode> episodes, String id) {
		String tvdbID = idMappings.getProperty(id);
		if (tvdbID != null) {
			LOG.fine("Using user defined mapping.  BTV id \"" + id + "\" = TVDB id \"" + tvdbID + "\"");
			for (Episode episode : episodes) {
				int parsed = Integer.parseInt(tvdbID);
				if (episode.getId() == parsed) {
					return episode;
				}
			}
		}
		
		for (Episode episode : episodes) {
			if (episode.getZap2itID() != null) {
				if (episode.getZap2itID().equals(id)) {
					return episode;
				}
			}
		}
		
		return null;
	}
	
	private org.atgas.sync.media.tvdb.Episode getEpisodeByDate(List<org.atgas.sync.media.tvdb.Episode> episodes, String firstAired) {
		Episode retval = null;
		try {
			Date date = new SimpleDateFormat("yyyyMMdd").parse(firstAired);
			for (Episode episode : episodes) {
				if (episode.getFirstAired() != null && episode.getFirstAired().equals(date)) {
					if (retval == null) {
						retval = episode;
					} else if (!retval.getProductionCode().equals(episode.getProductionCode())){
						return null;
					}
					
				}
			}
		} catch (Exception e) {
			LOG.severe(e.toString());
		}
		return retval;
	}

	private Map<Series, Integer> countBoxeeSeries(Map<String, VideoFile> currentlyStoredEpisodes) {
		Map<Series, Integer> retval = new HashMap<Series, Integer>();
		for (VideoFile file : currentlyStoredEpisodes.values()) {
			Series series = file.getSeries();
			if(retval.containsKey(series)) {
				retval.put(series, retval.get(series) + 1);
			} else {
				retval.put(series, 1);
			}
		}
		
		return retval;
	}
	
	private Map<Integer, Integer> countTVDBSeries(Map<String, Episode> tvdbEpisodes) {
		Map<Integer, Integer> retval = new HashMap<Integer, Integer>();
		for (Episode episode : tvdbEpisodes.values()) {
			int seriesID = episode.getSeriesID();
			if(retval.containsKey(seriesID)) {
				retval.put(seriesID, retval.get(seriesID) + 1);
			} else {
				retval.put(seriesID, 1);
			}
		}

		return retval;
	}

	private Map<String, VideoFile> loadBoxeeEpisodes(List<Map<String, String>> btvEpisodeProps) {
		Query query = em.createQuery("Select v FROM VideoFile v where v.path in ?1");
		List<String> boxeePaths = new ArrayList<String>();
		for (Map<String, String> episodeProps : btvEpisodeProps) {
			boxeePaths.add(toBoxeePath(episodeProps.get("FullName")));
		}
		
		query.setParameter(1, boxeePaths);
		List<VideoFile> resultList = query.getResultList();
		Map<String, VideoFile> retval = new HashMap<String, VideoFile>();
		for (VideoFile file : resultList) {
			retval.put(file.getPath(), file);
		}
		
		em.getTransaction().begin();
		for (VideoFile file : resultList) {
			retval.put(file.getPath(), file);
			em.remove(file);
		}		
		em.getTransaction().commit();
		retval.clear();
		return retval;
	}
	
	private void storeBoxeeEpisodes(Map<String, VideoFile> currentlyStoredEpisodes) {
		for (VideoFile video : currentlyStoredEpisodes.values()) {
			em.getTransaction().begin();
			em.persist(video);		
			em.getTransaction().commit();			
			LOG.fine("Storing \"" + video.getPath() + "\" in dataabse");
		}
	}
	
	private void deleteBoxeeEpisodes(Map<String, VideoFile> currentlyStoredEpisodes) {
		for (VideoFile video : currentlyStoredEpisodes.values()) {
			em.getTransaction().begin();
			em.remove(video);		
			em.getTransaction().commit();			
			LOG.fine("Deleting \"" + video.getPath() + "\" from dataabse");
		}
	}

	private String toBoxeePath(String string) {
		 return "smb:" + string;
	}

	private int toBoxeeDate(String string) {
		StringBuffer retval = new StringBuffer(string);
		retval.setLength(10);
		return Integer.parseInt(retval.toString());

	}

	private Map<String, Episode> createBTVtoTVDBMap(org.atgas.sync.media.tvdb.Series tvdbSeries,
	                                                Map<String, String> btvSeriesProps, 
	                                                List<Map<String, String>> btvEpisodeProps,
	                                                Collection<VideoFile> videoFiles) throws Exception {
		// Load up all the TVDB episodes		
		List<Episode> allEpisodes = tvdbSession.extractEpisodes(tvdbSession.downloadSeriesDetails(tvdbSeries));

		Map<String, Episode> retval = new HashMap<String, Episode>();
		
		for (VideoFile video : videoFiles) {
			for (Iterator iterator = allEpisodes.iterator(); iterator.hasNext();) {
				Episode episode = (Episode) iterator.next();
				if (episode.getEpisodeNumber() == video.getiEpisode()) {
					retval.put(video.getstrBoxeeId(), episode);
					//iterator.remove();
				}
				
			}
		}

		int size = 0;
		do {
			size = retval.size();
			for (Map<String, String> episodeProps : btvEpisodeProps) {
				String id = episodeProps.get("EPGID");
				if (!retval.containsKey(id)) {
					Episode tvdbEpisode = determineEpisodeFromTVDBWithKnownSeries(episodeProps, allEpisodes);
					if (tvdbEpisode != null) {
						retval.put(id, tvdbEpisode);
						allEpisodes.remove(tvdbEpisode);						
					}
				}
			}
		} while (retval.size() != size);
	      
		return retval;
	}	
	
	private Series createBoxeeSeries(org.atgas.sync.media.tvdb.Series tvdbSeries, 
			Map<String, String> btvSeriesProps) {
		Query query = em.createQuery("Select s FROM Series s where s._strPath_ = ?1");
		query.setParameter(1, "" + tvdbSeries.getTvdbID());
		List<Series> queryResults = (List<Series>) query.getResultList();
		
		Series boxeeSeries = new Series();
		if (queryResults.isEmpty()) {
			query = em.createQuery("Select s FROM Series s where s.title = ?1");
			query.setParameter(1, "" + tvdbSeries.getName());
			queryResults = (List<Series>) query.getResultList();
			
			if (queryResults.isEmpty()) {
				String genre = btvSeriesProps.get("Genre");
				if (genre != null) {
					boxeeSeries.set_strGenre_(genre.replace('/', ','));
				}
				boxeeSeries.setTitle(tvdbSeries.getName());
				boxeeSeries.set_strPath_("" + tvdbSeries.getTvdbID());
				em.getTransaction().begin();
				em.persist(boxeeSeries);
				boxeeSeries.set_strBoxeeId_(boxeeSeries.get_idSeries_());			
				em.getTransaction().commit();
			} else {
				boxeeSeries = queryResults.get(0);
				em.getTransaction().begin();
				boxeeSeries.set_strPath_("" + tvdbSeries.getTvdbID());			
				em.getTransaction().commit();
			}
		} else {
			boxeeSeries = queryResults.get(0);
		}		
		
		return boxeeSeries;
	}
	
	private void updateVideoFiles(Series boxeeSeries,
			Map<String, VideoFile> currentlyStoredEpisodes,	
			Map<String, Map<String, String>> transferredProps, 
			Map<String, Episode> bTVtoTVDBMap) throws Exception {			
		for (VideoFile videoFile : currentlyStoredEpisodes.values()) {
			Map<String, String> episodeProps = transferredProps.get(videoFile.getPath());
			if (episodeProps != null) {
				Episode tvdbEpisode = bTVtoTVDBMap.get(episodeProps.get("EPGID"));
				if (tvdbEpisode != null) {
					em.getTransaction().begin();
					createVideoFile(videoFile, episodeProps, tvdbEpisode, boxeeSeries);
					em.getTransaction().commit();
				}
			}
		}
	}
	
	private Map<String, VideoFile> createVideoFiles(Series boxeeSeries, 
	                                                List<Map<String, String>> unTransferredProps, 
	                                                Map<String, Episode> bTVtoTVDBMap) throws Exception {		
		Map<String, VideoFile> retval = new HashMap<String, VideoFile>();
		
		for (Map<String, String> episodeProps : unTransferredProps) {
			Episode tvdbEpisode = bTVtoTVDBMap.get(episodeProps.get("EPGID"));
			if (tvdbEpisode != null) {
				VideoFile videoFile = new VideoFile();
				createVideoFile(videoFile, episodeProps, tvdbEpisode, boxeeSeries);
				retval.put(videoFile.getPath(), videoFile);
			}
		}
		
		return retval;
	}

	private VideoFile createVideoFile(VideoFile video, Map<String, String> map, Episode episode, Series series) {

		video.setiDateAdded(toBoxeeDate(map.get("Added")));
		video.setiDateModified(toBoxeeDate(map.get("LastWriteTime")));
		video.setiDropped(0);
		video.setIDFile(1);
		video.setidFolder(0);
		video.setiDuration(Long.parseLong(map.get("Length")));
		video.setiEpisode(episode.getEpisodeNumber());
		video.setiHasMetadata(0);
		video.setiPopularity(0);
		video.setiRating(0);
		video.setiReleaseDate(0);
		video.setiSeason(episode.getSeason());
		if (episode.getFirstAired() != null) {
			Calendar firstAired = Calendar.getInstance();
			firstAired.setTime(episode.getFirstAired());
			video.setiYear(firstAired.get(Calendar.YEAR));
			long seconds = episode.getFirstAired().getTime() / 1000;
			int days = (int)(seconds / 86400);
			video.setiReleaseDate(days);
		}
		video.setSeries(series);
		video.setstrBoxeeId(map.get("EPGID"));
		video.setstrCover(null);
		video.setstrDescription(map.get("EpisodeDescription"));
		video.setstrExtDescription(map.get("EpisodeDescription"));
		video.setstrGenre(map.get("Genre"));
		video.setstrLanguage("");
		video.setstrMPAARating("");
		video.setstrPath(toBoxeePath(map.get("FullName")));
		video.setstrShowTitle(map.get("EpisodeTitle"));
		video.setstrTagLine("");
		video.setstrTitle(map.get("EpisodeTitle"));
		video.setstrType(null);
		return video;
	}

	@Override
	protected void performEpisodeOperation(TVDBLookupResults seriesResult,
			Map<String, String> convert) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected TVDBLookupResults performSeriesOperation(Map<String, String> item)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
