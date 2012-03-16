package org.atgas.sync.media.tvdb;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date>{

   private static final SimpleDateFormat FORMAT;

   static {
      FORMAT = new SimpleDateFormat("yyyy-MM-dd");
   }
   @Override
   public String marshal(Date arg0) throws Exception {
      return FORMAT.format(arg0);
   }

   @Override
   public Date unmarshal(String arg0) throws Exception {
      return FORMAT.parse(arg0);
   }

}
