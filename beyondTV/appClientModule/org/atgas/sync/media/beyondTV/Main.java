package org.atgas.sync.media.beyondTV;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.atgas.sync.media.beyondTV.webservices.BTVLicenseManager;
import org.atgas.sync.media.beyondTV.webservices.BTVLicenseManagerSoap;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;

public class Main {

   public static String DEFAULT_CONFIG_FILE = Main.class.getName() + ".properties";
   private static Logger LOG = Logger.getLogger(Main.class.getName());

   public static void main(String[] args) {
      Properties config = loadConfiguration(args);
      
      if (config != null) {
         BTVLicenseManager manager = new BTVLicenseManager();
         BTVLicenseManagerSoap client = manager.getBTVLicenseManagerSoap();
         PVSPropertyBag logon = client.logon(config.getProperty(Configuration.LICENSE.propertyName),
                                             config.getProperty(Configuration.USERNAME.propertyName),
                                             config.getProperty(Configuration.PASSWORD.propertyName));
      }
   }

   // TODO commons-configuration
   private static Properties loadConfiguration(String[] args) {
      File configFile = new File(DEFAULT_CONFIG_FILE);
      if (args.length > 0) {
         configFile = new File(args[0]);
      } else {
         LOG.config("Using default configuration file");
      }

      try {
         
         if (configFile.exists()) {
            LOG.config("Loading configuration from " + configFile.getAbsolutePath());
            Properties props = new Properties();
            props.load(new FileInputStream(configFile));
            
            boolean illegalConfiguration = false;
            for (Configuration config : Configuration.values()) {
               if (config.required && !props.containsKey(config.propertyName) && config.defaultValue == null) {
                  LOG.severe("Missing required configuration property: " + config.propertyName);
                  illegalConfiguration = true;
               }
            }
            
            if (!illegalConfiguration) {
               return props;
            }
         } else {
            LOG.severe("Configuration file does not exist : " + configFile.getAbsolutePath());
         }

      } catch (IOException e) {
         LOG.severe("Failed to load configuration: " + e.getLocalizedMessage());
      }
      
      return null;
   }
}
