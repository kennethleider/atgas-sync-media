
package org.atgas.media.beyondtv.webservices.btvsettings;

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
 *         &lt;element name="GetUnifiedLineupResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getUnifiedLineupResult"
})
@XmlRootElement(name = "GetUnifiedLineupResponse")
public class GetUnifiedLineupResponse {

    @XmlElement(name = "GetUnifiedLineupResult")
    protected String getUnifiedLineupResult;

    /**
     * Gets the value of the getUnifiedLineupResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetUnifiedLineupResult() {
        return getUnifiedLineupResult;
    }

    /**
     * Sets the value of the getUnifiedLineupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetUnifiedLineupResult(String value) {
        this.getUnifiedLineupResult = value;
    }

}
