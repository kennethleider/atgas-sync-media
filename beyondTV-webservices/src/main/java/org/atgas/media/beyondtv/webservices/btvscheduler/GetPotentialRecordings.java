
package org.atgas.media.beyondtv.webservices.btvscheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;


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
 *         &lt;element name="authTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bag" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "authTicket",
    "bag"
})
@XmlRootElement(name = "GetPotentialRecordings")
public class GetPotentialRecordings {

    protected String authTicket;
    protected PVSPropertyBag bag;

    /**
     * Gets the value of the authTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTicket() {
        return authTicket;
    }

    /**
     * Sets the value of the authTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTicket(String value) {
        this.authTicket = value;
    }

    /**
     * Gets the value of the bag property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getBag() {
        return bag;
    }

    /**
     * Sets the value of the bag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setBag(PVSPropertyBag value) {
        this.bag = value;
    }

}
