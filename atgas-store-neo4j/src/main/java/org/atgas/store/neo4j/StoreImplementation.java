package org.atgas.store.neo4j;

import java.util.Map.Entry;
import java.util.Set;

import org.atgas.store.Relationship;
import org.atgas.store.Store;
import org.atgas.store.Thing;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.index.Index;

class StoreImplementation implements Store {
	private final GraphDatabaseService database;

	public StoreImplementation(GraphDatabaseService database) {
		this.database = database;
	}
	
	@Override
	public void addThings(Thing... things) {
		Transaction tx = database.beginTx();
		try {
			Index<Node> index = database.index().forNodes("atgasID");
			for (Thing thing : things) {
				
				Node node = findByID(thing.sourceID);
				// The id, source and standard cannot change once set.
				if (node == null) {
					node = database.createNode();
					node.setProperty("atgas", thing.getId());
					index.add(node, "id", thing.getId());
					index.add(node, "source", thing.sourceID);
					index.add(node, "standard", thing.standardID);
					Node source = findByID(thing.sourceID);
					if (source != null) {
						node.createRelationshipTo(source, AtgasRelationshipType.Source);
					}
					
					Node standard = findByID(thing.standardID);
					if (standard != null) {
						node.createRelationshipTo(standard, AtgasRelationshipType.Standard);
					}
				}
				
				// Always update the properties
				for (Entry<String, String> property : thing.getPropertyValues()) {
					node.setProperty(property.getKey(), property.getValue());
				}
				
			}
			tx.success();
		} finally {
			tx.finish();
		}
		// TODO Auto-generated method stub
		
	}

	private Node findByID(String sourceID) {
		Index<Node> index = database.index().forNodes("atgas");
		return index.get("id", sourceID).getSingle();
	}

	@Override
	public void removeThings(Thing... things) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRelationships(Relationship... relationships) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRelationships(Relationship... relationships) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Thing> query(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Thing> query(String query, String queryLanguage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> supportedQueryLanguages() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void close() {
		database.shutdown();
	}
	
	@Override
	protected void finalize() throws Throwable {
		close();   
	}

}
