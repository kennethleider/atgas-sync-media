/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.sync.media.tvdb;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.atgas.store.Relationship;
import org.atgas.store.Thing;
import org.springframework.util.MultiValueMap;

/**
 *
 * @author ken
 */
public class SeriesMatcher {
    private static final Logger LOG = Logger.getLogger(SeriesMatcher.class.getName());

    private static class Result implements Comparable<Result> {
        final int match;
        final Thing thing;

        private Result(int match, Thing thing) {
            this.match = match;
            this.thing = thing;
        }

        @Override
        public int compareTo(Result o) {
            return Double.compare(match, o.match);
        }
    }
        
    private final Map<String, Thing> tvdbSeries = new HashMap<>();
    private final Map<String, List<Thing>> tvdbEpisodes;
    
    private static final int EXACT_MATCH = 1000;
    private static final int NO_MATCH = 0;
    
    

    public SeriesMatcher(Collection<Thing> tvdbSeries, Map<String, List<Thing>> tvdbEpisodes) {
        for(Thing series : tvdbSeries) {
            this.tvdbSeries.put(series.getID(), series);
        }

        this.tvdbEpisodes = tvdbEpisodes;
    }
    
     public void match(Thing sourceSeries, Collection<Thing> sourceEpisodes) throws Exception {
        LOG.log(Level.INFO, "Discovering TVDB information for: {0}", sourceSeries.getString("title"));
        
        for (Thing possibleMatch : tvdbSeries.values()) {
            if (sourceSeries.getID().equals(possibleMatch.getID()) ||
                sourceSeries.get("imdb-id").equals(possibleMatch.get("imdbID")) ||
                sourceSeries.get("zap2it-id").equals(possibleMatch.get("zap2itID"))) {
                
                LOG.log(Level.WARNING, "Matched episodes of source series to tvdb series: {0} -> {1}",
                    new Object[] { sourceSeries.getString("title"), possibleMatch.getString("title") });
                unRelate(possibleMatch);
                relate(sourceSeries, possibleMatch);
                relate(sourceEpisodes, tvdbEpisodes.get(possibleMatch.getID()));
                return;
            }  
        }
        
        NavigableSet<Result> bestMatches = findBestSeriesMatches(sourceEpisodes);
        Thing bestMatch = selectBestSeriesMatch(sourceSeries, bestMatches);
                
        if (bestMatch != null) {
            relate(sourceSeries, bestMatch);
            relate(sourceEpisodes, tvdbEpisodes.get(bestMatch.getID()));                        
        } else {
            for (Result result : bestMatches) {
                relate(sourceSeries, result.thing);                
            }
        }
    }

     private NavigableSet<Result> findBestSeriesMatches(Collection<Thing> sourceEpisodes) throws Exception {
         TreeSet<Result> retval = new TreeSet<>();
         for (Map.Entry<String, List<Thing>> possibleMatch : tvdbEpisodes.entrySet()) {
             int match = computeMatchValue(sourceEpisodes, possibleMatch.getValue());
             if(match != NO_MATCH) {
                 retval.add(new Result(match, tvdbSeries.get(possibleMatch.getKey())));
             }             
         }
         
         return retval;
    }
     
    private Thing selectBestSeriesMatch(Thing series, NavigableSet<Result> possibleSeries) {
        if (possibleSeries.isEmpty()) {
            LOG.log(Level.WARNING, "Could not match any episodes for series {0}", series.getString("title"));
            return null;
        } else { 
            final Result bestMatch = possibleSeries.last();
            if (possibleSeries.size() > 1) {
                LOG.log(Level.WARNING, "Multiple tvdb series match the episodes for source series {0}", series.getString("title"));
                if (bestMatch.match < 3 * possibleSeries.headSet(bestMatch).last().match) { 
                    return null;
                }
            }
            LOG.log(Level.WARNING, "Matched episodes of source series to tvdb series: {0} -> {1}", 
                    new Object[] { series.getString("title"), bestMatch.thing.getString("title") });
            return bestMatch.thing;
        } 
    } 

    private int computeMatchValue(Collection<Thing> sourceEpisodes, List<Thing> tvdbEpisodes) {
        int retval = 0;
        for (Thing source: sourceEpisodes) {
            NavigableSet<Result> matches = findBestMatches(source, tvdbEpisodes);
            if (!matches.isEmpty()) {
                retval += matches.first().match;
            }
        }
        
        return retval;
    }
    
    private NavigableSet<Result> findBestMatches(Thing sourceEpisode, List<Thing> tvdbEpisodes) {
        TreeSet<Result> retval = new TreeSet<>();
        for (Thing possibleMatch: tvdbEpisodes) {
            int match = computeMatchValue(sourceEpisode, possibleMatch);
            if (match != NO_MATCH) {
                retval.add(new Result(match, possibleMatch));
            }
        }
        
        return retval;
    }
    
    private int computeMatchValue(Thing sourceEpisode, Thing tvdbEpisode) {
        if (sourceEpisode.get("imdb-id").equals(tvdbEpisode.get("imdbID")) ||
                sourceEpisode.get("zap2it-id").equals(tvdbEpisode.get("zap2itID"))) {   
            return EXACT_MATCH;            
        }     

        /*
        if (episode == null) {
            episode = findByTitle(title);
        }

        if (episode == null) {
            episode = findByOriginalAirDate(originalAirDate);
        }        
        */
        
        return NO_MATCH;
    }
    
    private void relate(Collection<Thing> sourceEpisodes, List<Thing> tvdbEpisodes) {
        for (Thing source: sourceEpisodes) {
            NavigableSet<Result> matches = findBestMatches(source, tvdbEpisodes);
            if (matches.isEmpty()) {
                LOG.log(Level.WARNING, "Could not match any episodes for episode {0}", source.getString("title"));
            } else { 
                final Result bestMatch = matches.first();
                
                if (bestMatch.match == EXACT_MATCH || matches.size() == 1) {
                    LOG.log(Level.WARNING, "Matched episode of source series to tvdb series: {0} -> {1}", 
                            new Object[] { source.getString("title"), bestMatch.thing.getString("title") });
                    relate(source, bestMatch.thing);
                } else {
                    LOG.log(Level.WARNING, "Multiple tvdb epideos match source episodes {0}", source.getString("title"));
                    for (Result result : matches) {
                        relate(source, result.thing);                        
                    }
                }
            }
        }             
    }

    private void relate(Thing sourceThing, Thing tvdbThing) {
        Relationship sourceRelationship = sourceThing.getRelationships(TVDBMatcher.SOURCE_TYPE).iterator().next();
        tvdbThing.addRelationship(sourceRelationship);
    }
    
    private void unRelate(Thing tvdbThing) {
        for(Relationship relationship : tvdbThing.getRelationships(TVDBMatcher.SOURCE_TYPE)) {
            tvdbThing.removeRelationship(relationship);
        }
    }
    
    
}
