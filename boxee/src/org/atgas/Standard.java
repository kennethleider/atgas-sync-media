package org.atgas;

public abstract class Standard extends Thing {
   
   public static final String STANDARD_ID = "";
   
   private final String name;
   private final int version;
   private final String description;
   
   public Standard(String standardID, Source source) {
      super(standardID, source);
   }
   public Standard(String standardID, String sourceID) {
      super(standardID, sourceID);
      // TODO Auto-generated constructor stub
   }
   public Standard(Standard copy) {
      super(copy);
      name = copy.name;
      version = copy.version;
      description = copy.description;
   }
   
   
   
}
