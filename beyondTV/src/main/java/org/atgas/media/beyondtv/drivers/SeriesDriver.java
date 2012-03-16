package org.atgas.sync.media.beyondtv.drivers;

import java.util.Map;
import java.util.logging.Logger;

import org.atgas.sync.media.beyondtv.BTVSession;
import org.atgas.sync.media.beyondtv.PropertyConverter;
import org.atgas.sync.media.beyondtv.commands.Command;
import org.atgas.sync.media.beyondtv.webservices.BTVLibrary;
import org.atgas.sync.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.sync.media.beyondtv.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;

public class SeriesDriver {
   private static final Logger LOG = Logger.getLogger(SeriesDriver.class.getName());
   
   public void execute(BTVSession session, Command<PVSPropertyBag> command) {
      BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();
      
      ArrayOfPVSPropertyBag series = library.getSeries(session.ticket);

      for (PVSPropertyBag bag : series.getPVSPropertyBag()) {
    	  try {
    		  command.invoke(bag);
    	  } catch (Exception e) {
    		  Map<String, String> convert = PropertyConverter.convert(bag);
    		  LOG.warning("Unable to execute " + command + " on " + bag + ": " + e);
    		  e.printStackTrace();
    	  }
      }

   }
}
