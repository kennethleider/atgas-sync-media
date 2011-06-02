
package org.atgas.sync.media.beyondTV.webservices.btvlivetvmanager;

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
 *         &lt;element name="NewSessionWithErrorConditionResult" type="{http://www.snapstream.com/WebService}ArrayOfAnyType" minOccurs="0"/>
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
    "newSessionWithErrorConditionResult"
})
@XmlRootElement(name = "NewSessionWithErrorConditionResponse")
public class NewSessionWithErrorConditionResponse {

    @XmlElement(name = "NewSessionWithErrorConditionResult")
    protected ArrayOfAnyType newSessionWithErrorConditionResult;

    /**
     * Gets the value of the newSessionWithErrorConditionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getNewSessionWithErrorConditionResult() {
        return newSessionWithErrorConditionResult;
    }

    /**
     * Sets the value of the newSessionWithErrorConditionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setNewSessionWithErrorConditionResult(ArrayOfAnyType value) {
        this.newSessionWithErrorConditionResult = value;
    }

}
