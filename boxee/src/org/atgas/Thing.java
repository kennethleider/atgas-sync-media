package org.atgas;
import java.util.UUID;



public abstract class Thing implements Cloneable {
   private String id;
   private final String standardID;
   private final String sourceID;

   public Thing(Thing copy) {
      id = copy.id;
      standardID = copy.standardID;
      sourceID = copy.sourceID;
   }
   
   public Thing(String standardID, String sourceID) {
      this.standardID = standardID;
      this.sourceID = sourceID;
   }
   
   public Thing(String standardID, Source source) {
      this.standardID = standardID;
      this.sourceID = source.getID();
   }

   public Thing assignId(UUID id) {
      Thing clone = this.clone();
      clone.id = id.toString();
      
      return clone;
   }
   
   @Override
   protected Thing clone() {
      try {
         return (Thing) super.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return null;
   }

   public String getID() {
      return id;
   }

   public String getStandardID() {
      return standardID;
   }

   public String getSourceID() {
      return sourceID;
   }
}
