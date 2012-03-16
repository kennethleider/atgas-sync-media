
package org.atgas.sync.media.beyondtv.webservices.btvsettings;

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
 *         &lt;element name="GetUnifiedLineupDisplayedChannelsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getUnifiedLineupDisplayedChannelsResult"
})
@XmlRootElement(name = "GetUnifiedLineupDisplayedChannelsResponse")
public class GetUnifiedLineupDisplayedChannelsResponse {

    @XmlElement(name = "GetUnifiedLineupDisplayedChannelsResult")
    protected String getUnifiedLineupDisplayedChannelsResult;

    /**
     * Gets the value of the getUnifiedLineupDisplayedChannelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetUnifiedLineupDisplayedChannelsResult() {
        return getUnifiedLineupDisplayedChannelsResult;
    }

    /**
     * Sets the value of the getUnifiedLineupDisplayedChannelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetUnifiedLineupDisplayedChannelsResult(String value) {
        this.getUnifiedLineupDisplayedChannelsResult = value;
    }

}
