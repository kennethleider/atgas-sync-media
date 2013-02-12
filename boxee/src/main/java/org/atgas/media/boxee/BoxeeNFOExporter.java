/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.media.boxee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.atgas.core.Relationship;
import org.atgas.core.Thing;
import org.atgas.core.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 *
 * @author ken
 */
public class BoxeeNFOExporter implements Runnable {
    private static final Logger LOG = Logger.getLogger(BoxeeNFOExporter.class.getName());
    public static final String FILE_STANDARD_ID= "c5919cbf-fbf3-4250-96e6-3fefae51ffc5";
    public static final String TVDB_EPISODE_ID = "037ad1e7-38b9-451d-ae73-61338ba4f3ea";
    
    @Autowired
    private final Store store;

    public BoxeeNFOExporter(Store store) {
        this.store = store;
    }
        
    
    @Override
    public void run() {
        Collection<Thing> things = new ArrayList<>();
        Map<Thing, List<Thing>> episodeToFiles = pairEpisodeToFiles(things);
        
        for (Map.Entry<Thing, List<Thing>> entry : episodeToFiles.entrySet()) {
            Thing episode = entry.getKey();
            String nfo = generateNFO(episode);
            for (Thing file : entry.getValue()) {
                createNFOFile(file, nfo);
            }                        
        }
    }
    
    private Map<Thing, List<Thing>> pairEpisodeToFiles(Collection<Thing> things) {
        Map<String, Thing> lookup = new HashMap<>();
        
        for(Thing thing : things) {
            lookup.put(thing.getID(), thing);
        }
        
        MultiValueMap<Thing, Thing> retval = new LinkedMultiValueMap<>();
        for (Thing thing : things) {
            if (thing.getStandardID().equals(TVDB_EPISODE_ID)) {
                for(Relationship relationship : thing.getRelationships(FILE_STANDARD_ID)) {
                    Thing file = lookup.get(relationship.getTargetID());
                    if (file != null) {
                        retval.add(thing, file);
                    }
                }
            }
        }

        return retval;
    }

    private String generateNFO(Thing episode) {
        return String.format("<episodedetails>\n   <id>%1s</id>\n</episodedetails>", episode.getString("tvdbID"));
    }

    private void createNFOFile(Thing file, String nfo) {
        FileOutputStream out = null;
        try {
            String path = file.getString("path");
            String nfoPath = path.substring(0, path.lastIndexOf(".")) + ".nfo";
            out = new FileOutputStream(nfoPath);
            out.write(nfo.getBytes());
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                LOG.log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
