
package org.atgas.sync.media.beyondtv.webservices.btvscheduler;

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
 *         &lt;element name="GetNextRecordingResult" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "getNextRecordingResult"
})
@XmlRootElement(name = "GetNextRecordingResponse")
public class GetNextRecordingResponse {

    @XmlElement(name = "GetNextRecordingResult")
    protected PVSPropertyBag getNextRecordingResult;

    /**
     * Gets the value of the getNextRecordingResult property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getGetNextRecordingResult() {
        return getNextRecordingResult;
    }

    /**
     * Sets the value of the getNextRecordingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setGetNextRecordingResult(PVSPropertyBag value) {
        this.getNextRecordingResult = value;
    }

}
