package org.atgas.sync.media.beyondtv.commands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import org.atgas.sync.media.beyondtv.BTVSession;
import org.atgas.sync.media.beyondtv.Configuration;
import org.atgas.sync.media.beyondtv.Main;
import org.atgas.sync.media.beyondtv.PropertyConverter;
import org.atgas.sync.media.beyondtv.webservices.BTVLibrary;
import org.atgas.sync.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;

public class WatchedStatusImportCommand implements Command<PVSPropertyBag> {

	private static final Logger LOG = Logger.getLogger(WatchedStatusImportCommand.class.getName());
   private final Map<String, Map<String, String>> lookup = 
	   new HashMap<String, Map<String, String>>();
   private final BTVSession session;
   private final BTVLibrarySoap library;


   public WatchedStatusImportCommand(BTVSession session, Properties config) throws IOException {
	   String seperator = config.getProperty(Configuration.FIELD_SEPERATOR.propertyName, 
	                                         Configuration.FIELD_SEPERATOR.defaultValue);
	   String importFile = config.getProperty(Configuration.WATCHED_STATUS_FILE.propertyName, 
		                                      Configuration.WATCHED_STATUS_FILE.defaultValue);
	   
	   BufferedReader in = new BufferedReader(new FileReader(importFile));
	   for (String line = in.readLine(); line != null; line = in.readLine()) {
		   String[] fields = line.split(seperator);
		   if (fields.length > 1 && Boolean.parseBoolean(fields[1])) {
			   Map fieldMap = new HashMap<String, String>();
			   fieldMap.put("Watched", fields[1]);
			   if (fields.length > 2) {
				   fieldMap.put("LastPosition", fields[2]);
			   }
			   lookup.put(fields[0], fieldMap);
		   }
	   }
	   
	   this.session = session;
       library = new BTVLibrary().getBTVLibrarySoap();
	}


   @Override
   public void invoke(PVSPropertyBag bag) throws Exception {
      Map<String, String> properties = PropertyConverter.convert(bag);
      
      Map<String, String> newProps = lookup.get(properties.get("Name"));
      if (newProps != null) {
    	  properties.putAll(newProps);

          library.editMedia(session.ticket, properties.get("FullName"), PropertyConverter.convert(properties));
          LOG.info("Setting " + properties.get("FullName")+ " as Watched");
      }
   }

}
