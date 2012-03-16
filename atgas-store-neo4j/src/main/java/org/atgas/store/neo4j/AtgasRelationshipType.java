package org.atgas.store.neo4j;

import org.neo4j.graphdb.RelationshipType;

public class AtgasRelationshipType implements RelationshipType {
    
    private final String name;

    AtgasRelationshipType(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
