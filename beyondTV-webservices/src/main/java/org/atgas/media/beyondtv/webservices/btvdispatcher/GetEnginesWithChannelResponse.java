
package org.atgas.media.beyondtv.webservices.btvdispatcher;

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
 *         &lt;element name="GetEnginesWithChannelResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getEnginesWithChannelResult"
})
@XmlRootElement(name = "GetEnginesWithChannelResponse")
public class GetEnginesWithChannelResponse {

    @XmlElement(name = "GetEnginesWithChannelResult")
    protected ArrayOfPVSPropertyBag getEnginesWithChannelResult;

    /**
     * Gets the value of the getEnginesWithChannelResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetEnginesWithChannelResult() {
        return getEnginesWithChannelResult;
    }

    /**
     * Sets the value of the getEnginesWithChannelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetEnginesWithChannelResult(ArrayOfPVSPropertyBag value) {
        this.getEnginesWithChannelResult = value;
    }

}
