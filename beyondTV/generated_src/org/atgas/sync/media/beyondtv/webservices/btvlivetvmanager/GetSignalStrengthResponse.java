
package org.atgas.sync.media.beyondtv.webservices.btvlivetvmanager;

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
 *         &lt;element name="GetSignalStrengthResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getSignalStrengthResult"
})
@XmlRootElement(name = "GetSignalStrengthResponse")
public class GetSignalStrengthResponse {

    @XmlElement(name = "GetSignalStrengthResult")
    protected int getSignalStrengthResult;

    /**
     * Gets the value of the getSignalStrengthResult property.
     * 
     */
    public int getGetSignalStrengthResult() {
        return getSignalStrengthResult;
    }

    /**
     * Sets the value of the getSignalStrengthResult property.
     * 
     */
    public void setGetSignalStrengthResult(int value) {
        this.getSignalStrengthResult = value;
    }

}
