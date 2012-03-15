package org.atgas;

import java.util.UUID;

public abstract class Source extends Thing {

   public Source(String standardID, Source source) {
      super(standardID, source);
   }
   
   public Source(String standardID, String sourceID) {
      super(standardID, sourceID);
   }

   public Source(Source copy) {
      super(copy);
   }
}
