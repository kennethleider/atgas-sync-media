package org.atgas.store.neo4j;

import org.neo4j.graphdb.RelationshipType;

enum AtgasRelationshipType implements RelationshipType {
	Source,
	Standard
}
