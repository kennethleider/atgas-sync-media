package org.atgas.sync.media.tvdb;

import java.net.URI;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Mirror")
public class Mirror {
   @XmlElement(name="id", required=true, nillable=false)
   private long id;
   
   @XmlElement(name="mirrorpath", required=true, nillable=false)
   private URI path;
   
   @XmlElement(name="typemask", required=true, nillable=false)
   private int typeMask;
   
   
   public URI getPath() {
      return path;
   }
}
