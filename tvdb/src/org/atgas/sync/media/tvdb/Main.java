package org.atgas.sync.media.tvdb;

import java.util.List;

public class Main {

   /**
    * @param args
    * @throws Exception 
    */
   public static void main(String[] args) throws Exception {
      Session session = Session.create("950449EF1450CC0A");
      
      Series series = session.getSeriesByName("Law").get(0);
      
      List<Episode> episodes = session.extractEpisodes(session.downloadSeriesDetails(series));
      
      for (Episode episode : episodes) {
         System.out.println(episode.getName());
      }

   }

}
