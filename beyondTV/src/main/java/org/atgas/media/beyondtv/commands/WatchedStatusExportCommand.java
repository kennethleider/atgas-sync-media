package org.atgas.sync.media.beyondtv.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Properties;

import org.atgas.sync.media.beyondtv.Configuration;
import org.atgas.sync.media.beyondtv.PropertyConverter;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;

public class WatchedStatusExportCommand implements Command<PVSPropertyBag> {

   private String seperator;
   private String importFile;
private PrintStream out;

   public WatchedStatusExportCommand(Properties config) throws FileNotFoundException {
	   seperator = config.getProperty(Configuration.FIELD_SEPERATOR.propertyName, 
	                                  Configuration.FIELD_SEPERATOR.defaultValue);
	   importFile = config.getProperty(Configuration.WATCHED_STATUS_FILE.propertyName, 
		                               Configuration.WATCHED_STATUS_FILE.defaultValue);
	   
	   out = new PrintStream(new File(importFile));
	   
	}

   @Override
   public void invoke(PVSPropertyBag bag) throws Exception {
      Map<String, String> properties = PropertyConverter.convert(bag);
      out.println(properties.get("Name")+ seperator + properties.get("Watched") + seperator + properties.get("LastPosition"));
      out.flush();
   }

}
