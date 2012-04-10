/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.media.beyondtv;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.atgas.media.beyondtv.webservices.BTVLibrary;
import org.atgas.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.media.beyondtv.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.media.beyondtv.webservices.types.PVSProperty;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;
import org.atgas.store.Change;
import org.atgas.store.ProxyRelationship;
import org.atgas.store.Thing;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ken
 */
public class LibraryCollector implements Callable<Change> {
    private static final Logger LOG = Logger.getLogger(LibraryCollector.class.getName());
    
    private static final String SERIES_STANDARD_ID = "c7fb8441-d5db-4113-8af0-e4ba0c3f51fd";
    private static final String EPISODE_STANDARD_ID = "a99a8588-93df-4811-8403-fe22c70fa00a";
    private static final String SOURCE_ID = "6dbb5efa-7cf4-4b12-8799-f0176f09b5db";
    private static final String FILE_STANDARD_ID= "c5919cbf-fbf3-4250-96e6-3fefae51ffc5";
    
    @Autowired
    private final BTVSession session;

    public LibraryCollector(BTVSession session) {
        this.session = session;
    }
    
    @Override
    public Change call() throws Exception {
        BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();
        Change retval = new Change();

        for (PVSPropertyBag bag : library.getSeries(session.ticket).getPVSPropertyBag()) {
            final Thing series = createSeries(bag);
            retval.add(series);
                        
            ArrayOfPVSPropertyBag episodeBags = library.getItemsBySeries(session.ticket, series.getString("Name"));            
            Map<String, Thing> episodes = createEpisodeThings(episodeBags, series);
            List<Thing> files = createFileThings(episodeBags, episodes);
            retval.add(episodes.values());
            retval.add(files);
        }
      
        return retval;
    }

    private Map<String, Thing> createEpisodeThings(ArrayOfPVSPropertyBag episodeBags, Thing series) {
        Map<String, Thing> retval = new HashMap<>();

        for (PVSPropertyBag bag : episodeBags.getPVSPropertyBag()) {            
            Thing episode = createEpisode(bag);
            episode.addRelationship(new ProxyRelationship("series", series));
            retval.put(episode.getString("EPGID"), episode);
        }
        
        return retval;
    }

    private List<Thing> createFileThings(ArrayOfPVSPropertyBag episodeBags, Map<String, Thing> episodes) {
         List<Thing> retval = new ArrayList<>();

        for (PVSPropertyBag bag : episodeBags.getPVSPropertyBag()) {
            Map<String, String> properties = PropertyConverter.convert(bag);
            Thing file = createFile(properties);
            Thing episode = episodes.get(properties.get("EPGID"));
            episode.addRelationship(new ProxyRelationship("location", file));
        }
        
        return retval;
    }
    
    private Thing createSeries(PVSPropertyBag bag) {
        Thing retval = new Thing(SERIES_STANDARD_ID, SOURCE_ID);

        for (PVSProperty pvsProperty : bag.getProperties().getPVSProperty()) {
            retval.setProperty(pvsProperty.getName(), pvsProperty.getValue());
        }
        
        return retval;
    }
    
    private Thing createEpisode(PVSPropertyBag bag) {
        Thing retval = new Thing(EPISODE_STANDARD_ID, SOURCE_ID);

        for (PVSProperty pvsProperty : bag.getProperties().getPVSProperty()) {
            retval.setProperty(pvsProperty.getName(), pvsProperty.getValue());
        }
        
        return retval;
    }
    
    private Thing createFile(Map<String, String> properties) {
        Thing retval = new Thing(FILE_STANDARD_ID, SOURCE_ID);

        for (Map.Entry<String, String> property : properties.entrySet()) {
            retval.setProperty(property.getKey(), property.getValue());
        }
        
        return retval;
    }
}
