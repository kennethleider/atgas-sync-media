
package org.atgas.media.beyondtv.webservices.btvlibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetMediaByFullNameResult" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "getMediaByFullNameResult"
})
@XmlRootElement(name = "GetMediaByFullNameResponse")
public class GetMediaByFullNameResponse {

    @XmlElement(name = "GetMediaByFullNameResult")
    protected PVSPropertyBag getMediaByFullNameResult;

    /**
     * Gets the value of the getMediaByFullNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getGetMediaByFullNameResult() {
        return getMediaByFullNameResult;
    }

    /**
     * Sets the value of the getMediaByFullNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setGetMediaByFullNameResult(PVSPropertyBag value) {
        this.getMediaByFullNameResult = value;
    }

}
