/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.sync.media.tvdb;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import org.atgas.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;

/**
 *
 * @author ken
 */
public class TVDBMatcher implements Callable<Change> {
    private static final Logger LOG = Logger.getLogger(TVDBMatcher.class.getName());
    public static final String SOURCE_SERIES_ID = "5ed8fd15-92e0-49c6-9f3b-18c6598138d5";
    public static final String SOURCE_EPISODE_ID = "22d5f8d5-01b4-4fce-a9aa-91b42633839c";
    public static final String TVDB_SOURCE_ID = "00747dcf-5c6d-4d91-9b17-e743d99aeb0b";
    public static final String SERIES_ID = "2b81e7a5-7a65-459e-9462-966065f3ec51";
    public static final String EPISODE_ID = "037ad1e7-38b9-451d-ae73-61338ba4f3ea";
    public static final RelationshipType SOURCE_TYPE = new RelationshipType("same");
    
    private static final String SERIES_QUERY = 
            String.format("start series = node:atgas(id = \"%%1s\") match series-[:`%1s`]-tvdb where tvdb.`atgas-standard`=\"%2s\" return tvdb", SOURCE_TYPE.name(), SERIES_ID);
   
    private static final String EPISODE_QUERY = 
            String.format("start series = node:atgas(id = \"%%1s\") match series-[:`%1s`]-tvdb where tvdb.`atgas-standard`=\"%2s\" return tvdb", SOURCE_TYPE.name(), EPISODE_ID);
   
    private final Callable<Change> sourceCollector;
    
    
    @Autowired
    private final Store store;
    
    @Autowired
    private final Session session;

    public TVDBMatcher() {
        sourceCollector = null;
        session = null;
        store = null;
    }
    
    public TVDBMatcher(Callable<Change> sourceCollector, Session session, Store store) {
        this.sourceCollector = sourceCollector;
        this.session = session;
        this.store = store;
    }
    
    @Override
    public Change call() throws Exception {
        Change source = getSourceCollector().call();
        Map<String, List<Thing>> toMatch = groupByStandard(source.getAdds());
      
        Change retval = new Change();
        
        for (Map.Entry<String, List<Thing>> entry : toMatch.entrySet()) {
            if (!entry.getKey().equals(SOURCE_SERIES_ID) && !entry.getKey().equals(SOURCE_EPISODE_ID)) {
                retval.add(entry.getValue());
            }
        }
                
        Map<Thing, Thing> matchedSeries = findMatchedSeries(toMatch.get(SOURCE_SERIES_ID));
        Map<Thing, Thing> matchedEpisodes = findMatchedEpisodes(toMatch.get(SOURCE_EPISODE_ID));        
        Set<Thing> unmatchedSeries = findUnmatched(toMatch.get(SOURCE_SERIES_ID), matchedSeries);
        Map<String, List<Thing>> unmatchedEpisodes = groupBySeries(findUnmatched(toMatch.get(SOURCE_EPISODE_ID), matchedEpisodes));
        
        Callable<Change> downloader = new TVDBCollector(new ChangeCollector(unmatchedSeries, null, null), session, store);
        Map<String, List<Thing>> downloads = groupByStandard(downloader.call().getAdds());
        
        retval.add(downloads.get(SERIES_ID));
        retval.add(downloads.get(EPISODE_ID));
        
        for (Thing thing : unmatchedSeries) {
            SeriesMatcher matcher = new SeriesMatcher(downloads.get(SERIES_ID), groupBySeries(downloads.get(EPISODE_ID)));
            matcher.match(thing, unmatchedEpisodes.get(thing.getID()));
        }

        return retval;
    }
    
    private Map<Thing, Thing> findMatchedSeries(Collection<Thing> sourceSeries) {
        Map<Thing, Thing> retval = new HashMap<>();
        for (Thing source : sourceSeries) {           
            String sourceID = source.getRelationships(SOURCE_TYPE).iterator().next().getDestinationID();
            Set<Thing> stored = store.query(String.format(SERIES_QUERY, sourceID));
            if (stored.size() == 1) {
                retval.put(source, stored.iterator().next());
            }
        }
        
        return retval;
    }
    
    private Set<Thing> findUnmatched(Collection<Thing> source, Map<Thing, Thing> matched) {
        Set<Thing> retval = new LinkedHashSet<>();
        for (Thing thing : source) {
            if (!matched.containsKey(thing)) {
                retval.add(thing);
            }
        }
        
        return retval;
    }


    private Map<Thing, Thing> findMatchedEpisodes(Collection<Thing> episodes) {
        Map<Thing, Thing> retval = new HashMap<>();
        for (Thing source : episodes) {
            String sourceID = source.getRelationships(SOURCE_TYPE).iterator().next().getDestinationID();
            Set<Thing> stored = store.query(String.format(EPISODE_QUERY, sourceID));
            if (stored.size() == 1) {             
                retval.put(source, stored.iterator().next());
            }
        }
        
        return retval;
    }


    
    private Callable<Change> getSourceCollector() {
        return sourceCollector;
    }

    private Map<String, List<Thing>> groupByStandard(Collection<Thing> things) {
        LinkedMultiValueMap<String, Thing> retval = new LinkedMultiValueMap<>();
        
        for(Thing thing : things) {
            retval.add(thing.getStandardID(), thing);
        }

        return retval;
    }
    
    private Map<String, List<Thing>> groupBySeries(Collection<Thing> things) {
        LinkedMultiValueMap<String, Thing> retval = new LinkedMultiValueMap<>();
        
        for(Thing thing : things) {
            for (Relationship relationship : thing.getRelationships(SOURCE_SERIES_ID)) {
                retval.add(relationship.getTargetID(), thing);
            }
            
            for (Relationship relationship : thing.getRelationships(SERIES_ID)) {
                retval.add(relationship.getTargetID(), thing);
            }
        }

        return retval;
    }
}
