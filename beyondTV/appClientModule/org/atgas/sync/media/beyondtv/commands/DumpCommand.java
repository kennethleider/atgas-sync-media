package org.atgas.sync.media.beyondtv.commands;

import java.util.Map;

import org.atgas.sync.media.beyondtv.PropertyConverter;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;

public class DumpCommand implements Command<PVSPropertyBag>{

   @Override
   public void invoke(PVSPropertyBag bag) throws Exception {
      for (Map.Entry<String, String> entry : PropertyConverter.convert(bag).entrySet()) {
         System.out.println(entry.getKey() + "," + entry.getValue());
      }
      
      System.out.println();
   }

}
