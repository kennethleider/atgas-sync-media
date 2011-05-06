
package com.snapstream.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="authTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bstrSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bstrOldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bstrNewValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "authTicket",
    "bstrSetting",
    "bstrOldValue",
    "bstrNewValue"
})
@XmlRootElement(name = "WriteChange")
public class WriteChange {

    protected String authTicket;
    protected String bstrSetting;
    protected String bstrOldValue;
    protected String bstrNewValue;

    /**
     * Gets the value of the authTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTicket() {
        return authTicket;
    }

    /**
     * Sets the value of the authTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTicket(String value) {
        this.authTicket = value;
    }

    /**
     * Gets the value of the bstrSetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrSetting() {
        return bstrSetting;
    }

    /**
     * Sets the value of the bstrSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrSetting(String value) {
        this.bstrSetting = value;
    }

    /**
     * Gets the value of the bstrOldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrOldValue() {
        return bstrOldValue;
    }

    /**
     * Sets the value of the bstrOldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrOldValue(String value) {
        this.bstrOldValue = value;
    }

    /**
     * Gets the value of the bstrNewValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrNewValue() {
        return bstrNewValue;
    }

    /**
     * Sets the value of the bstrNewValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrNewValue(String value) {
        this.bstrNewValue = value;
    }

}
