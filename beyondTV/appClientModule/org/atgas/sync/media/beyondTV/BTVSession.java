package org.atgas.sync.media.beyondTV;

import java.util.Properties;

import org.atgas.sync.media.beyondTV.webservices.BTVLicenseManager;
import org.atgas.sync.media.beyondTV.webservices.BTVLicenseManagerSoap;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;

public class BTVSession {
   public final String ticket;
   private final BTVLicenseManagerSoap manager;
   
   private BTVSession(BTVLicenseManagerSoap manager, String ticket) {
      this.manager = manager;
      this.ticket = ticket;
   }
   
   
   
   public static BTVSession connect(Properties config) {
      return connect(config.getProperty(Configuration.LICENSE.propertyName),
                     config.getProperty(Configuration.USERNAME.propertyName),
                     config.getProperty(Configuration.PASSWORD.propertyName));
   }

   private static BTVSession connect(String networkLicense, String username, String password) {
      BTVLicenseManagerSoap manager = new BTVLicenseManager().getBTVLicenseManagerSoap();
      PVSPropertyBag logon = manager.logon(networkLicense, username, password);
      
      String ticket = PropertyConverter.convert(logon).get("AuthTicket");
      return new BTVSession(manager, ticket);
   }
}
