
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
 *         &lt;element name="GetNextAttemptedUpdateResult" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
    "getNextAttemptedUpdateResult"
})
@XmlRootElement(name = "GetNextAttemptedUpdateResponse")
public class GetNextAttemptedUpdateResponse {

    @XmlElement(name = "GetNextAttemptedUpdateResult", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger getNextAttemptedUpdateResult;

    /**
     * Gets the value of the getNextAttemptedUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGetNextAttemptedUpdateResult() {
        return getNextAttemptedUpdateResult;
    }

    /**
     * Sets the value of the getNextAttemptedUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGetNextAttemptedUpdateResult(BigInteger value) {
        this.getNextAttemptedUpdateResult = value;
    }

}
