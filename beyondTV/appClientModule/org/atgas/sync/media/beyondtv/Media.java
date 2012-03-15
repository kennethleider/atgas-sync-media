package org.atgas.sync.media.beyondtv;

import java.io.File;
import java.util.Map;

import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;

public class Media {
   public final boolean watched;
   public final String seriesName;
   public File file;

   public Media(String seriesName,
                boolean watched) {
      this.seriesName = seriesName;
      this.watched = watched;
   }
   
   public static Media build(PVSPropertyBag bag) {
      Map<String, String> properties = PropertyConverter.convert(bag);
      return new Media(properties.get("Title"),
                       properties.get("Watched").equals("True"));
   }
}
