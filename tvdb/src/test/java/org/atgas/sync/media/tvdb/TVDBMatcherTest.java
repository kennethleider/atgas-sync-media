/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.sync.media.tvdb;

import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.atgas.store.JSONCollector;
import org.atgas.store.Store;
import org.atgas.store.neo4j.StoreFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ken
 */
public class TVDBMatcherTest {
    
    public TVDBMatcherTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testSomeMethod() throws Exception {
        Session session = Session.create("950449EF1450CC0A");
        JSONCollector source = new JSONCollector(getClass().getResourceAsStream("imdb.json"));
        Store store = StoreFactory.create();
        TVDBMatcher collector = new TVDBMatcher(source, session, store);
        store.addThings(collector.call().getAdds());
        store.close();
    }
    
}
