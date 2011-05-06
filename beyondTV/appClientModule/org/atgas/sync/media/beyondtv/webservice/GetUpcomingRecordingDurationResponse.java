
package com.snapstream.webservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetUpcomingRecordingDurationResult" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
    "getUpcomingRecordingDurationResult"
})
@XmlRootElement(name = "GetUpcomingRecordingDurationResponse")
public class GetUpcomingRecordingDurationResponse {

    @XmlElement(name = "GetUpcomingRecordingDurationResult", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger getUpcomingRecordingDurationResult;

    /**
     * Gets the value of the getUpcomingRecordingDurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGetUpcomingRecordingDurationResult() {
        return getUpcomingRecordingDurationResult;
    }

    /**
     * Sets the value of the getUpcomingRecordingDurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGetUpcomingRecordingDurationResult(BigInteger value) {
        this.getUpcomingRecordingDurationResult = value;
    }

}
