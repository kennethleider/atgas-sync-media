package org.atgas.sync.media.beyondTV.drivers;

import java.util.logging.Logger;

import org.atgas.sync.media.beyondTV.BTVSession;
import org.atgas.sync.media.beyondTV.commands.Command;
import org.atgas.sync.media.beyondTV.webservices.BTVLibrary;
import org.atgas.sync.media.beyondTV.webservices.BTVLibrarySoap;
import org.atgas.sync.media.beyondTV.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;

public class LibraryDriver {
   private static final Logger LOG = Logger.getLogger(LibraryDriver.class.getName());
   
   public void execute(BTVSession session, Command<PVSPropertyBag> command) {
      BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();
      
      int index = 0;
      int count = 100;
      boolean done = false;
      do {
         ArrayOfPVSPropertyBag bags = library.flatViewByDate2(session.ticket, index, count);
         
         for (PVSPropertyBag bag : bags.getPVSPropertyBag()) {
            try {
               command.invoke(bag);
            } catch (Exception e) {
               LOG.warning("Unable to execute " + command + " on " + bag + ": " + e.getLocalizedMessage());
            }
         }
         
         if (bags.getPVSPropertyBag().size() < count) {
            done = true;
         }
      } while (!done);
   }
}
