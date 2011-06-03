
package org.atgas.sync.media.beyondtv.webservices.btvscheduler;

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
 *         &lt;element name="GetPotentialScheduleAtPriorityResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBagArray" minOccurs="0"/>
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
    "getPotentialScheduleAtPriorityResult"
})
@XmlRootElement(name = "GetPotentialScheduleAtPriorityResponse")
public class GetPotentialScheduleAtPriorityResponse {

    @XmlElement(name = "GetPotentialScheduleAtPriorityResult")
    protected ArrayOfPVSPropertyBagArray getPotentialScheduleAtPriorityResult;

    /**
     * Gets the value of the getPotentialScheduleAtPriorityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBagArray }
     *     
     */
    public ArrayOfPVSPropertyBagArray getGetPotentialScheduleAtPriorityResult() {
        return getPotentialScheduleAtPriorityResult;
    }

    /**
     * Sets the value of the getPotentialScheduleAtPriorityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBagArray }
     *     
     */
    public void setGetPotentialScheduleAtPriorityResult(ArrayOfPVSPropertyBagArray value) {
        this.getPotentialScheduleAtPriorityResult = value;
    }

}
