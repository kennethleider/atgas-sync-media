package org.atgas.sync.media.beyondtv;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.atgas.sync.media.beyondtv.commands.BoxeeImport;
import org.atgas.sync.media.beyondtv.commands.DumpCommand;
import org.atgas.sync.media.beyondtv.commands.WatchedStatusExportCommand;
import org.atgas.sync.media.beyondtv.commands.WatchedStatusImportCommand;
import org.atgas.sync.media.beyondtv.drivers.LibraryDriver;
import org.atgas.sync.media.beyondtv.drivers.SeriesDriver;

public class Main {

   public static final String DEFAULT_CONFIG_FILE = Main.class.getName() + ".properties";
   private static final Logger LOG = Logger.getLogger(Main.class.getName());

   public static void main(String[] args) throws Exception{
      Properties config = loadConfiguration(args);
      
      if (config != null) {
         BTVSession session = BTVSession.connect(config);
         LibraryDriver driver = new LibraryDriver();
         String command = config.getProperty(Configuration.COMMAND.propertyName);
         if ("import".equals(command)) {
        	 driver.execute(session, new WatchedStatusImportCommand(session, config));
         } else if ("export".equals(command)) {
        	 driver.execute(session, new WatchedStatusExportCommand(config));
         } else if ("dump".equals(command)) {
        	 driver.execute(session, new DumpCommand());
         } else if ("transfer".equals(command)) {
        	 SeriesDriver sd = new SeriesDriver();
        	 Properties idMappings = new Properties();
        	 idMappings.load(new FileInputStream("btv_tvdb_mappings.properties"));
        	 sd.execute(session, new BoxeeImport(session, idMappings));
         }
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
