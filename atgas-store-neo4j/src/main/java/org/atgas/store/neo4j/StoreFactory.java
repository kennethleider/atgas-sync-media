package org.atgas.store.neo4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.atgas.store.BuiltIns;
import org.atgas.store.Store;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.kernel.EmbeddedGraphDatabase;

public class StoreFactory {
    private static final String DB_PATH = "repository/neo4j";
    private static final Map<String, String> OPTIONS = Collections.singletonMap("allow_store_upgrade","true");
    String greeting;
    GraphDatabaseService graphDb;
    Node firstNode;
    Node secondNode;
    Relationship relationship;

    private static void registerShutdownHook( final GraphDatabaseService graphDb )
    {
        // Registers a shutdown hook for the Neo4j instance so that it
        // shuts down nicely when the VM exits (even if you "Ctrl-C" the
        // running example before it's completed)
        Runtime.getRuntime().addShutdownHook( new Thread()
        {
            @Override
            public void run()
            {
                graphDb.shutdown();
            }
        } );
    }

    public Store create() {
        EmbeddedGraphDatabase database = new EmbeddedGraphDatabase( DB_PATH, OPTIONS);
        registerShutdownHook( database );

        StoreImplementation retval = new StoreImplementation(database);
        retval.addThings(BuiltIns.getBuiltInThings());
        return retval;
    }
}
