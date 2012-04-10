package org.atgas.sync.media.tvdb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.atgas.store.ProxyRelationship;
import org.atgas.store.Thing;
import org.atgas.store.ThingBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Session {
   private final String apiKey;
   private final Mirror mirror;

   public Session(String apiKey, Mirror mirror) {
      this.apiKey = apiKey;
      this.mirror = mirror;
   }

   public List<Thing> getSeriesByName(String seriesName) throws Exception {
      URI uri = new URI(mirror.getPath().getScheme(), 
                        mirror.getPath().getUserInfo(), 
                        mirror.getPath().getHost(), 
                        mirror.getPath().getPort(), 
                        "/api/GetSeries.php", 
                        "seriesname=" + seriesName, 
                        null);
      
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true); 
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse(uri.toURL().openConnection().getInputStream());

      XPath xpath = XPathFactory.newInstance().newXPath();

      Unmarshaller u = JAXBContext.newInstance( Series.class ).createUnmarshaller();
      NodeList nodes = (NodeList) xpath.compile("//Data/Series").evaluate(doc, XPathConstants.NODESET);
      
      List<Thing> retval = new ArrayList<>(nodes.getLength());
      for (int i = 0; i < nodes.getLength(); i++) {
         Series series = (Series) u.unmarshal(nodes.item(i));
         retval.add(ThingBuilder.build(TVDBMatcher.SERIES_ID, TVDBMatcher.TVDB_SOURCE_ID, series));
      }
      
      return retval;
   }
   
   public Thing getSeriesByID(Thing sourceSeries) throws Exception {
       String id = sourceSeries.getString("zap2it-id");
       String parameter = "zap2it";
       
       if (id != null || id.isEmpty()) {
           id = sourceSeries.getString("imdb-id");
           parameter = "imdbid";
       }
       
       URI uri = new URI(mirror.getPath().getScheme(),
               mirror.getPath().getUserInfo(),
               mirror.getPath().getHost(),
               mirror.getPath().getPort(),
               "/api/GetSeriesByRemoteID.php",
               parameter + "=" + id,
               null);
       
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       factory.setNamespaceAware(true);
       DocumentBuilder builder = factory.newDocumentBuilder();
       Document doc = builder.parse(uri.toURL().openConnection().getInputStream());
       
       XPath xpath = XPathFactory.newInstance().newXPath();
       
       Unmarshaller u = JAXBContext.newInstance( Series.class ).createUnmarshaller();
       NodeList nodes = (NodeList) xpath.compile("//Data/Series").evaluate(doc, XPathConstants.NODESET);
       
       if (nodes.getLength() == 1) {
           Series series = (Series) u.unmarshal(nodes.item(0));
           return ThingBuilder.build(TVDBMatcher.SERIES_ID, TVDBMatcher.TVDB_SOURCE_ID, series);
       }
       
       return null;
   }
   
   public File downloadSeriesDetails(String tvdbID) throws Exception {
      URI uri = new URI(mirror.getPath().getScheme(), 
                        mirror.getPath().getUserInfo(), 
                        mirror.getPath().getHost(), 
                        mirror.getPath().getPort(), 
                        "/api/" + apiKey + "/series/" + tvdbID + "/all/en.zip",
                        null, 
                        null);
      
      File file = new File("tvdb/" + tvdbID + ".zip");
      if (file.exists()) {
    	  return file;
      }
      file.getParentFile().mkdirs();
      System.out.println("Downloading " + tvdbID + " to " + file.getAbsolutePath());
      
      URLConnection openConnection = uri.toURL().openConnection();
      InputStream in = openConnection.getInputStream();
      FileOutputStream out = new FileOutputStream(file);
      
      byte[] buffer = new byte[153600];
      int totalBytesRead = 0;
      int bytesRead = 0;

      long startTime = System.currentTimeMillis();
      while ((bytesRead = in.read(buffer)) > 0)
      { 
          out.write(buffer, 0, bytesRead);
          buffer = new byte[153600];
          totalBytesRead += bytesRead;
      }
          
      long endTime = System.currentTimeMillis();
          
      System.out.println("Done. " + (new Integer(totalBytesRead).toString()) + " bytes read (" + (new Long(endTime - startTime).toString()) + " millseconds).\n");
      in.close();
      out.close();

      return file;
   }
   
   public List<Thing> extractEpisodes(Thing series) throws Exception {       
      ZipFile zip = new ZipFile(downloadSeriesDetails(series.getString("tvdbID")));
      ZipEntry entry = zip.getEntry("en.xml");
      
      
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true); 
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse(zip.getInputStream(entry));

      XPath xpath = XPathFactory.newInstance().newXPath();

      Unmarshaller u = JAXBContext.newInstance( Episode.class ).createUnmarshaller();
      NodeList nodes = (NodeList) xpath.compile("//Episode").evaluate(doc, XPathConstants.NODESET);
      
      List<Thing> retval = new ArrayList<>(nodes.getLength());
      for (int i = 0; i < nodes.getLength(); i++) {
          Episode episode = (Episode) u.unmarshal(nodes.item(i));
          final Thing thing = ThingBuilder.build(TVDBMatcher.EPISODE_ID, TVDBMatcher.TVDB_SOURCE_ID, episode);
          thing.addRelationship(new ProxyRelationship("series", series));
          retval.add(thing);
      }
      
      return retval;
   }
   
   
   public static Session create(String apiKey) throws Exception {
      URI uri = new URI("http://www.thetvdb.com/api/" + apiKey + "/mirrors.xml");
      URLConnection connection = uri.toURL().openConnection();

      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true); 
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse(connection.getInputStream());

      XPath xpath = XPathFactory.newInstance().newXPath();

      Unmarshaller u = JAXBContext.newInstance( Mirror.class ).createUnmarshaller();
      NodeList nodes = (NodeList) xpath.compile("//Mirrors/Mirror").evaluate(doc, XPathConstants.NODESET);
      
      List<Mirror> mirrors = new ArrayList<Mirror>(nodes.getLength());
      for (int i = 0; i < nodes.getLength(); i++) {
         mirrors.add((Mirror) u.unmarshal(nodes.item(i)));
      }
      
      Mirror mirror = mirrors.get(new Random().nextInt(mirrors.size()));

      return new Session(apiKey, mirror);
      
   }
}
