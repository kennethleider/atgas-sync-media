
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
 *         &lt;element name="CanChangePasswordResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "canChangePasswordResult"
})
@XmlRootElement(name = "CanChangePasswordResponse")
public class CanChangePasswordResponse {

    @XmlElement(name = "CanChangePasswordResult")
    protected boolean canChangePasswordResult;

    /**
     * Gets the value of the canChangePasswordResult property.
     * 
     */
    public boolean isCanChangePasswordResult() {
        return canChangePasswordResult;
    }

    /**
     * Sets the value of the canChangePasswordResult property.
     * 
     */
    public void setCanChangePasswordResult(boolean value) {
        this.canChangePasswordResult = value;
    }

}
