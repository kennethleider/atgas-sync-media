/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.sync.media.tvdb.translator;

import java.util.Collection;
import java.util.concurrent.Callable;
import org.atgas.store.Thing;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ken
 */
public class BeyondTVTranslator implements Callable<Thing> {
       
    @Autowired
    private final Callable<Collection<Thing>> sourceCollector;

    public BeyondTVTranslator(Callable<Collection<Thing>> sourceCollector) {
        this.sourceCollector = sourceCollector;
    }
    
    @Override
    public Thing call() throws Exception {
        
        
        return null;
    }
    
}
