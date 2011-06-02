
package org.atgas.sync.media.beyondTV.webservices.btvlicensemanager;

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
 *         &lt;element name="GetPermissionsForTicketResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPermissionsForTicketResult"
})
@XmlRootElement(name = "GetPermissionsForTicketResponse")
public class GetPermissionsForTicketResponse {

    @XmlElement(name = "GetPermissionsForTicketResult")
    protected String getPermissionsForTicketResult;

    /**
     * Gets the value of the getPermissionsForTicketResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPermissionsForTicketResult() {
        return getPermissionsForTicketResult;
    }

    /**
     * Sets the value of the getPermissionsForTicketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPermissionsForTicketResult(String value) {
        this.getPermissionsForTicketResult = value;
    }

}
