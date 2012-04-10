package org.atgas.sync.media.tvdb;

import java.net.URI;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="Series")
public class Series {

   @XmlElement(name="seriesid")
   private int tvdbID;
   
   @XmlElement(name="language")
   private String language;
   
   @XmlElement(name="SeriesName")
   private String name;
   
   @XmlElement(name="banner")
   private URI bannerPath;
   
   @XmlElement(name="Overview")
   private String overview;
   
   @XmlElement(name="FirstAired")
   @XmlJavaTypeAdapter(value=DateAdapter.class)
   private Date firstAired;
   
   @XmlElement(name="IMDB_ID")
   private String imdbID;
   
   @XmlElement(name="zap2it_id")
   private String zap2itID;
   
   public int getTvdbID() {
      return tvdbID;
   }

   public String getTitle() {
      return name;
   }
   
   public String getZap2itID() {
	return zap2itID;
   }
   
   public String getImdbID() {
       return imdbID;
   }
   
   public Date getFirstAired() {
	return firstAired;
   }
   
   public String getLanguage() {
       return language;
   }
   
   public String getOverview() {
       return overview;
   }

    public URI getBannerPath() {
        return bannerPath;
    }
}
