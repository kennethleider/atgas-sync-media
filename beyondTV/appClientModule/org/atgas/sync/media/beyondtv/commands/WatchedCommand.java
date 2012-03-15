package org.atgas.sync.media.beyondtv.commands;

import java.util.Map;

import org.atgas.sync.media.beyondtv.PropertyConverter;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;

public class WatchedCommand implements Command<PVSPropertyBag> {

   @Override
   public void invoke(PVSPropertyBag bag) throws Exception {
      Map<String, String> properties = PropertyConverter.convert(bag);
      System.out.println(properties.get("Name")+ "," + properties.get("Watched") + "," + properties.get("LastPosition"));
   }

}
