/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.sync.media.tvdb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.atgas.core.Change;
import org.atgas.core.Store;
import org.atgas.core.Thing;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ken
 */
public class TVDBCollector implements Callable<Change> {
    private static final Logger LOG = Logger.getLogger(TVDBCollector.class.getName());
    
    private static final String QUERY = "start series = node:atgas(standard = \"%1s\") where series.tvdbID=\"%2s\" return series";
   
    
    private final Callable<Change> sourceCollector;
    
    @Autowired
    private final Session session;
    
    @Autowired
    private final Store store;
    
    public TVDBCollector(Callable<Change> sourceCollector, Session session, Store store) {
        this.sourceCollector = sourceCollector;
        this.session = session;
        this.store = store;
    }

    @Override
    public Change call() throws Exception {
        Change source = sourceCollector.call();
        Change retval = new Change();
        
        for (Thing thing : source.getAdds()) {
            switch (thing.getStandardID()) {
                case TVDBMatcher.SOURCE_SERIES_ID:
                    Collection<Thing> series = loadSeries(thing);
                    Collection<Thing> episodes = loadEpisodes(series);
                    retval.add(series);
                    retval.add(episodes);
            }
        }        
        
        return retval;
    }
   
    private Collection<Thing> loadSeries(Thing source) throws Exception {
        Collection<Thing> retval = new ArrayList<>();
        Thing series = session.getSeriesByID(source);
        if (series != null) {
            retval.add(series);
        } else {
            // Otherwise get all the possible titles
            String title = source.getString("title");
            for (String word : title.split("\\s+")) {
                retval.addAll(session.getSeriesByName(word));
            }
        }
        
        return updateCurrent(retval, TVDBMatcher.SERIES_ID);
    }
    
    private Collection<Thing> loadEpisodes(Collection<Thing> tvdbSeries) {
        Collection<Thing> retval = new ArrayList<>();
        for (Thing series : tvdbSeries) {
            try {
                retval.addAll(session.extractEpisodes(series));
            } catch (Exception e) {
                LOG.log(Level.WARNING, "Could not download episodes for {0}", series.get("name"));
            }
        }        
        
        return updateCurrent(retval, TVDBMatcher.EPISODE_ID);
    }

    
    private Collection<Thing> updateCurrent(Collection<Thing> things, String standard) {
        Collection<Thing> retval = new ArrayList<>();
        for (Thing thing : things) {      
            String query = String.format(QUERY, standard, thing.getString("tvdbID"));
            Set<Thing> stored = store.query(query);
            if (!stored.isEmpty()) {
                Thing current = stored.iterator().next();
                for(String key : current.getProperties()) {
                    current.unsetProperty(key);
                }
                
                for (String key : thing.getProperties()) {
                    current.setProperty(key, thing.get(key));
                }
                
                retval.add(current);
            } else {
                retval.add(thing);
            }
        }
        return things;
    }
    
}
