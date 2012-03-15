package org.atgas.sync.boxee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager em = 
			Persistence.createEntityManagerFactory("BoxeeDBAccess").createEntityManager();
		
		
		VideoFile video = new VideoFile();
		video.setiDateAdded(0);
		video.setiDateModified(0);
		video.setiDropped(0);
		video.setIDFile(1);
		video.setidFolder(4);
		video.setiDuration(0);
		video.setiEpisode(1);
		video.setiHasMetadata(0);
		video.setiPopularity(0);
		video.setiRating(0);
		video.setiReleaseDate(0);
		video.setiSeason(3);
		video.setiYear(1996);
		video.setSeries(null);
		video.setstrBoxeeId("BTV-1234");
		video.setstrCover(null);
		video.setstrCredits("Ken made this");
		video.setstrDescription("Something something something");
		video.setstrExtDescription("Extended Description");
		video.setstrGenre("Animation");
		video.setstrLanguage("English");
		video.setstrMPAARating("G");
		video.setstrPath("V:\\Recorded\\BeyondTV\\Everybody Loves Raymond-2011-06-01-0-1.mp4");
		video.setstrShowTitle("Show Title");
		video.setstrTagLine("Tagline");
		video.setstrTitle("Meant to Be");
		video.setstrType(null);
		Series series = new Series();
		series.set_iVirtual_(0);
		series.set_iYear_(1999);
		series.set_strBoxeeId_(19);
		series.set_strDescription_("Based on the comedy of Ray Ramano");
		series.set_strGenre_("comedy");
		series.setTitle("Everybody Loves Raymond");
		video.setSeries(series);
		
		
		
		
	     em.getTransaction().begin();
	     em.persist(video); 
	     em.getTransaction().commit();
		
		List<VideoFile> resultList = 
			em.createQuery("SELECT v from VideoFile v").getResultList();
		
		for (VideoFile videoFile : resultList) {
			System.out.println(videoFile.getPath());
			//System.out.println(videoFile.getSeries().get_strTitle_());

		}
	}

}
