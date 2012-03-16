
package org.atgas.sync.media.beyondtv.webservices.btvbatchprocessor;

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
 *         &lt;element name="GetTimeConstraintResult" type="{http://www.snapstream.com/WebService}ArrayOfString" minOccurs="0"/>
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
    "getTimeConstraintResult"
})
@XmlRootElement(name = "GetTimeConstraintResponse")
public class GetTimeConstraintResponse {

    @XmlElement(name = "GetTimeConstraintResult")
    protected ArrayOfString getTimeConstraintResult;

    /**
     * Gets the value of the getTimeConstraintResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetTimeConstraintResult() {
        return getTimeConstraintResult;
    }

    /**
     * Sets the value of the getTimeConstraintResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetTimeConstraintResult(ArrayOfString value) {
        this.getTimeConstraintResult = value;
    }

}
