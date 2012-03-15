package org.atgas;


public class Relationship extends Thing {
   private String description;
   private String sourceID;
   private String targetID;
   
   public String getDescription() {
      return description;
   }
   
   public void setDescription(String description) {
      this.description = description;
   }
   
   public String getSource() {
      return sourceID;
   }
   
   public void setSource(Thing source) {
      this.sourceID = source.getID();
   }
   
   public void setSource(String source) {
      this.sourceID = source;
   }   
   
   public String getTarget() {
      return targetID;
   }
   
   public void setTarget(Thing target) {
      this.targetID = target.getID();
   }
   
   public void setTarget(String target) {
      this.targetID = target;
   } 
}
