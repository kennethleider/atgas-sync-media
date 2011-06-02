package org.atgas.sync.media.beyondTV.commands;

import java.util.Map;

import org.atgas.sync.media.beyondTV.PropertyConverter;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;

public class WatchedCommand implements Command<PVSPropertyBag> {

   @Override
   public void invoke(PVSPropertyBag bag) throws Exception {
      Map<String, String> properties = PropertyConverter.convert(bag);
      System.out.println(properties.get("File")+ "," + properties.get("Watched"));
   }

}
