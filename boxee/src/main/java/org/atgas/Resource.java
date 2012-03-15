package org.atgas;

import java.net.URL;

public class Resource extends Thing {

   public static final String STANDARD_ID = "";
   private final URL location;
   
   public Resource(Resource copy) {
      super(copy);
      this.location = copy.location;
   }
   
   public Resource(String sourceID, URL location) {
      super(STANDARD_ID, sourceID);
      this.location = location;
   }
   
   public Resource(Source source, URL location) {
      super(STANDARD_ID, source);
      this.location = location;
   }
}
