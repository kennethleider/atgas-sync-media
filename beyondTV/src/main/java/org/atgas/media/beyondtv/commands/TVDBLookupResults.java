package org.atgas.sync.media.beyondtv.commands;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.atgas.sync.media.tvdb.*;

public class TVDBLookupResults {
	public final Map<Integer, Series> series;
	public final int seriesID;
	public final List<Episode> episodes;
	
	public TVDBLookupResults(Map<Integer, Series> series, List<Episode> episodes, int seriesID) {
		this.series = Collections.unmodifiableMap(series);
		this.episodes =  Collections.unmodifiableList(episodes);
		this.seriesID = seriesID;		
	}
}
