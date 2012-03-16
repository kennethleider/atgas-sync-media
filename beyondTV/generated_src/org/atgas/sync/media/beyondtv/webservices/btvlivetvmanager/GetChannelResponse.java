
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
 *         &lt;element name="GetChannelResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getChannelResult"
})
@XmlRootElement(name = "GetChannelResponse")
public class GetChannelResponse {

    @XmlElement(name = "GetChannelResult")
    protected String getChannelResult;

    /**
     * Gets the value of the getChannelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetChannelResult() {
        return getChannelResult;
    }

    /**
     * Sets the value of the getChannelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetChannelResult(String value) {
        this.getChannelResult = value;
    }

}
