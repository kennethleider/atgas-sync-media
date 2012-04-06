package org.atgas.sync.media.tvdb;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="Episode")
public class Episode {
   
   @XmlElement(name="id")
   private int tvdbID;
   
   @XmlElement(name="Director")
   private String director;

   @XmlElement(name="EpisodeName")
   private String name;

   @XmlElement(name="EpisodeNumber")
   private int episodeNumber;
   
   @XmlElement(name="FirstAired")
   @XmlJavaTypeAdapter(value=DateAdapter.class)
   private Date firstAired;
   
   @XmlElement(name="IMDB_ID")
   private String imdbID = "";
   
   @XmlElement(name="zap2it_id")
   private String zap2itID = "";   

   @XmlElement(name="Language")
   private String language;
   
   @XmlElement(name="Overview")
   private String overview;
   
   @XmlElement(name="ProductionCode")
   private String productionCode;

   @XmlElement(name="SeasonNumber")
   private int season;

   @XmlElement(name="seriesid")
   private int seriesID;
   
   @XmlElement(name="seasonid")
   private int seasonID;

   public int getTvdbID() {
       return tvdbID;
   }	
   
   public String getTitle() {
      return name;
   }
     
   public String getZap2itID() {
	return zap2itID;
   }	
   
   public int getSeriesID() {
	return seriesID;
   }
   
   public int getSeason() {
	return season;
   }
   
   public int getEpisodeNumber() {
	return episodeNumber;
   }
   
   public Date getFirstAired() {
	return firstAired;
   }	
   
   public String getProductionCode() {
	return productionCode;
   }	
   
   public String getImdbID() {
       return imdbID;
   }

    public String getDirector() {
        return director;
    }
    
    public String getLanguage() {
        return language;
    }

    public String getOverview() {
        return overview;
    }

    public int getSeasonID() {
        return seasonID;
    }
   
}
