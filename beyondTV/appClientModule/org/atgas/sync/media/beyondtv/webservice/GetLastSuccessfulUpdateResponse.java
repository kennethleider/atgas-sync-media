
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
 *         &lt;element name="GetLastSuccessfulUpdateResult" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
    "getLastSuccessfulUpdateResult"
})
@XmlRootElement(name = "GetLastSuccessfulUpdateResponse")
public class GetLastSuccessfulUpdateResponse {

    @XmlElement(name = "GetLastSuccessfulUpdateResult", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger getLastSuccessfulUpdateResult;

    /**
     * Gets the value of the getLastSuccessfulUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGetLastSuccessfulUpdateResult() {
        return getLastSuccessfulUpdateResult;
    }

    /**
     * Sets the value of the getLastSuccessfulUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGetLastSuccessfulUpdateResult(BigInteger value) {
        this.getLastSuccessfulUpdateResult = value;
    }

}
