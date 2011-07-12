package org.atgas.store.neo4j;

import org.atgas.store.Store;
import org.junit.Test;

public class StoreFactoryTest {

	@Test
	public void testCreate() {
		Store store = new StoreFactory().create();
		store.query(query)
		store.close();
	}

}
