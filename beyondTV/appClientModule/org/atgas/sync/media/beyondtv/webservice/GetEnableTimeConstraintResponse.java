
package com.snapstream.webservice;

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
 *         &lt;element name="GetEnableTimeConstraintResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getEnableTimeConstraintResult"
})
@XmlRootElement(name = "GetEnableTimeConstraintResponse")
public class GetEnableTimeConstraintResponse {

    @XmlElement(name = "GetEnableTimeConstraintResult")
    protected int getEnableTimeConstraintResult;

    /**
     * Gets the value of the getEnableTimeConstraintResult property.
     * 
     */
    public int getGetEnableTimeConstraintResult() {
        return getEnableTimeConstraintResult;
    }

    /**
     * Sets the value of the getEnableTimeConstraintResult property.
     * 
     */
    public void setGetEnableTimeConstraintResult(int value) {
        this.getEnableTimeConstraintResult = value;
    }

}
