
package org.atgas.sync.media.beyondtv.webservices.btvlibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;


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
 *         &lt;element name="GetDriveInformationByNameResult" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "getDriveInformationByNameResult"
})
@XmlRootElement(name = "GetDriveInformationByNameResponse")
public class GetDriveInformationByNameResponse {

    @XmlElement(name = "GetDriveInformationByNameResult")
    protected PVSPropertyBag getDriveInformationByNameResult;

    /**
     * Gets the value of the getDriveInformationByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getGetDriveInformationByNameResult() {
        return getDriveInformationByNameResult;
    }

    /**
     * Sets the value of the getDriveInformationByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setGetDriveInformationByNameResult(PVSPropertyBag value) {
        this.getDriveInformationByNameResult = value;
    }

}
