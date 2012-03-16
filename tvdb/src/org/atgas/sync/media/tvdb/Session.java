package org.atgas.sync.media.tvdb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.util.ArrayList;
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

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Session {
   private final String apiKey;
   private final Mirror mirror;
   private ZipFile zip;

   public Session(String apiKey, Mirror mirror) {
      this.apiKey = apiKey;
      this.mirror = mirror;
   }

   public List<Series> getSeriesByName(String seriesName) throws Exception {
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
      
      List<Series> retval = new ArrayList<Series>(nodes.getLength());
      for (int i = 0; i < nodes.getLength(); i++) {
         retval.add((Series) u.unmarshal(nodes.item(i)));
      }
      
      return retval;
   }
   
   public File downloadSeriesDetails(Series series) throws Exception {
      URI uri = new URI(mirror.getPath().getScheme(), 
                        mirror.getPath().getUserInfo(), 
                        mirror.getPath().getHost(), 
                        mirror.getPath().getPort(), 
                        "/api/" + apiKey + "/series/" + series.getTvdbID() + "/all/en.zip",
                        null, 
                        null);
      
      File file = new File("tvdb/" + series.getTvdbID() + ".zip");
      if (file.exists()) {
    	  return file;
      }
      file.getParentFile().mkdirs();
      System.out.println("Downloading " + series.getName() + " to " + file.getAbsolutePath());
      
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
   
   public List<Episode> extractEpisodes(File zipFile) throws Exception {
      ZipFile zip = new ZipFile(zipFile);
      ZipEntry entry = zip.getEntry("en.xml");
      
      
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true); 
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse(zip.getInputStream(entry));

      XPath xpath = XPathFactory.newInstance().newXPath();

      Unmarshaller u = JAXBContext.newInstance( Episode.class ).createUnmarshaller();
      NodeList nodes = (NodeList) xpath.compile("//Episode").evaluate(doc, XPathConstants.NODESET);
      
      List<Episode> retval = new ArrayList<Episode>(nodes.getLength());
      for (int i = 0; i < nodes.getLength(); i++) {
         retval.add((Episode) u.unmarshal(nodes.item(i)));
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
