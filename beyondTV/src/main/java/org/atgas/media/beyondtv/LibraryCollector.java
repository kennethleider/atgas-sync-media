/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.media.beyondtv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import org.atgas.media.beyondtv.webservices.BTVLibrary;
import org.atgas.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.media.beyondtv.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.media.beyondtv.webservices.types.PVSProperty;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ken
 */
public class LibraryCollector implements Callable<Collection<String>> {
   private static final Logger LOG = Logger.getLogger(LibraryCollector.class.getName());
   
    @Autowired
    private final BTVSession session;
    
    public LibraryCollector(BTVSession session) {
        this.session = session;
    }
    
    public Collection<String> call() throws Exception {
        List<String> retval = new ArrayList<String>();
        BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();

        int index = 0;
        int count = 100;
        boolean done = false;
        do {
            ArrayOfPVSPropertyBag bags = library.flatViewByDate2(session.ticket, index, count);

            for (PVSPropertyBag bag : bags.getPVSPropertyBag()) {
                try {
                    retval.add(toJson(bag));
                } catch (Exception e) {
                    LOG.log(Level.WARNING, "Unable to convert property bag to json: {1}: {2}", new Object[]{bag, e.getLocalizedMessage()});
                }
            }

            if (bags.getPVSPropertyBag().size() < count) {
                done = true;
            }
        } while (!done);
        
        return retval;
    }

    private String toJson(PVSPropertyBag bag) throws JSONException {
        JSONObject object = new JSONObject();

        for (PVSProperty pvsProperty : bag.getProperties().getPVSProperty()) {
            object.put(pvsProperty.getName(), pvsProperty.getValue());
        }
        
        return object.toString(3);
    }
}
