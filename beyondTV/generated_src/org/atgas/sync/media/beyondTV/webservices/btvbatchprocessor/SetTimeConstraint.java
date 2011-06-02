
package org.atgas.sync.media.beyondTV.webservices.btvbatchprocessor;

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
 *         &lt;element name="bstrStartXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bstrEndXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "bstrStartXml",
    "bstrEndXml"
})
@XmlRootElement(name = "SetTimeConstraint")
public class SetTimeConstraint {

    protected String authTicket;
    protected String bstrStartXml;
    protected String bstrEndXml;

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
     * Gets the value of the bstrStartXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrStartXml() {
        return bstrStartXml;
    }

    /**
     * Sets the value of the bstrStartXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrStartXml(String value) {
        this.bstrStartXml = value;
    }

    /**
     * Gets the value of the bstrEndXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrEndXml() {
        return bstrEndXml;
    }

    /**
     * Sets the value of the bstrEndXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrEndXml(String value) {
        this.bstrEndXml = value;
    }

}
