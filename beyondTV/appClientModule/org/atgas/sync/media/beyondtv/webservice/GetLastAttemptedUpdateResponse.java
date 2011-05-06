
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
 *         &lt;element name="GetLastAttemptedUpdateResult" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
    "getLastAttemptedUpdateResult"
})
@XmlRootElement(name = "GetLastAttemptedUpdateResponse")
public class GetLastAttemptedUpdateResponse {

    @XmlElement(name = "GetLastAttemptedUpdateResult", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger getLastAttemptedUpdateResult;

    /**
     * Gets the value of the getLastAttemptedUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGetLastAttemptedUpdateResult() {
        return getLastAttemptedUpdateResult;
    }

    /**
     * Sets the value of the getLastAttemptedUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGetLastAttemptedUpdateResult(BigInteger value) {
        this.getLastAttemptedUpdateResult = value;
    }

}
