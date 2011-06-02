package org.atgas.sync.media.beyondTV;

import java.util.HashMap;
import java.util.Map;

import org.atgas.sync.media.beyondTV.webservices.types.PVSProperty;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;

public class PropertyConverter {
   public static Map<String, String> convert(PVSPropertyBag bag) {
      Map<String, String> retval = new HashMap<String, String>();
      for (PVSProperty pvsProperty : bag.getProperties().getPVSProperty()) {
         retval.put(pvsProperty.getName(), pvsProperty.getValue());
      }
      
      return retval;
   }
}
