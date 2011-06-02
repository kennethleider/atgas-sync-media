
package org.atgas.sync.media.beyondTV.webservices.btvexpiration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;


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
 *         &lt;element name="GetDriveLimitsByNameResult" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "getDriveLimitsByNameResult"
})
@XmlRootElement(name = "GetDriveLimitsByNameResponse")
public class GetDriveLimitsByNameResponse {

    @XmlElement(name = "GetDriveLimitsByNameResult")
    protected PVSPropertyBag getDriveLimitsByNameResult;

    /**
     * Gets the value of the getDriveLimitsByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getGetDriveLimitsByNameResult() {
        return getDriveLimitsByNameResult;
    }

    /**
     * Sets the value of the getDriveLimitsByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setGetDriveLimitsByNameResult(PVSPropertyBag value) {
        this.getDriveLimitsByNameResult = value;
    }

}
