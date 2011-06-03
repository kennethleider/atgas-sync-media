
package org.atgas.sync.media.beyondtv.webservices.btvscheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsSeriesManagedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isSeriesManagedResult"
})
@XmlRootElement(name = "IsSeriesManagedResponse")
public class IsSeriesManagedResponse {

    @XmlElement(name = "IsSeriesManagedResult")
    protected boolean isSeriesManagedResult;

    /**
     * Gets the value of the isSeriesManagedResult property.
     * 
     */
    public boolean isIsSeriesManagedResult() {
        return isSeriesManagedResult;
    }

    /**
     * Sets the value of the isSeriesManagedResult property.
     * 
     */
    public void setIsSeriesManagedResult(boolean value) {
        this.isSeriesManagedResult = value;
    }

}
