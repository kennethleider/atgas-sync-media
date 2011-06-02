package org.atgas.sync.media.beyondTV.commands;

import java.util.Map;

import org.atgas.sync.media.beyondTV.PropertyConverter;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;

public class DumpCommand implements Command<PVSPropertyBag>{

   @Override
   public void invoke(PVSPropertyBag bag) throws Exception {
      for (Map.Entry<String, String> entry : PropertyConverter.convert(bag).entrySet()) {
         System.out.println(entry.getKey() + "," + entry.getValue());
      }
      
      System.out.println();
   }

}
