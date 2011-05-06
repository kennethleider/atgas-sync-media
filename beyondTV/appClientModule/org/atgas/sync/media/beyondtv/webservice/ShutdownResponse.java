
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
 *         &lt;element name="ShutdownResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "shutdownResult"
})
@XmlRootElement(name = "ShutdownResponse")
public class ShutdownResponse {

    @XmlElement(name = "ShutdownResult")
    protected boolean shutdownResult;

    /**
     * Gets the value of the shutdownResult property.
     * 
     */
    public boolean isShutdownResult() {
        return shutdownResult;
    }

    /**
     * Sets the value of the shutdownResult property.
     * 
     */
    public void setShutdownResult(boolean value) {
        this.shutdownResult = value;
    }

}
