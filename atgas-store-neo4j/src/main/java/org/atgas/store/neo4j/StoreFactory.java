package org.atgas.store.neo4j;

import org.atgas.store.BuiltIns;
import org.atgas.store.Store;
import org.neo4j.kernel.EmbeddedGraphDatabase;

public class StoreFactory {

	public Store create() {
		EmbeddedGraphDatabase database = new EmbeddedGraphDatabase("repository/neo4j");
		StoreImplementation retval = new StoreImplementation(database);
		retval.addThings(BuiltIns.getBuiltInThings());
		return retval;
	}
}
