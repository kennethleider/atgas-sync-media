package org.atgas.media.beyondtv;

import java.util.HashMap;
import java.util.Map;
import org.atgas.media.beyondtv.webservices.types.PVSProperty;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;

public class PropertyConverter {
   public Map<String, String> convert(PVSPropertyBag bag) {
      Map<String, String> retval = new HashMap<String, String>();
      for (PVSProperty pvsProperty : bag.getProperties().getPVSProperty()) {
         retval.put(pvsProperty.getName(), pvsProperty.getValue());
      }
      
      return retval;
   }
}
