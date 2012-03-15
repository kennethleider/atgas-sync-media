
package org.atgas.media.beyondtv.webservices.btvscheduler;

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
 *         &lt;element name="GetUpcomingRecordingsResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getUpcomingRecordingsResult"
})
@XmlRootElement(name = "GetUpcomingRecordingsResponse")
public class GetUpcomingRecordingsResponse {

    @XmlElement(name = "GetUpcomingRecordingsResult")
    protected ArrayOfPVSPropertyBag getUpcomingRecordingsResult;

    /**
     * Gets the value of the getUpcomingRecordingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetUpcomingRecordingsResult() {
        return getUpcomingRecordingsResult;
    }

    /**
     * Sets the value of the getUpcomingRecordingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetUpcomingRecordingsResult(ArrayOfPVSPropertyBag value) {
        this.getUpcomingRecordingsResult = value;
    }

}
