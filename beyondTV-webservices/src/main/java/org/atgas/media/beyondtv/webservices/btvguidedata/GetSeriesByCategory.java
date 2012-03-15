
package org.atgas.media.beyondtv.webservices.btvguidedata;

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
 *         &lt;element name="bstrCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bstrSubcategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "bstrCategory",
    "bstrSubcategory"
})
@XmlRootElement(name = "GetSeriesByCategory")
public class GetSeriesByCategory {

    protected String authTicket;
    protected String bstrCategory;
    protected String bstrSubcategory;

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
     * Gets the value of the bstrCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrCategory() {
        return bstrCategory;
    }

    /**
     * Sets the value of the bstrCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrCategory(String value) {
        this.bstrCategory = value;
    }

    /**
     * Gets the value of the bstrSubcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrSubcategory() {
        return bstrSubcategory;
    }

    /**
     * Sets the value of the bstrSubcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrSubcategory(String value) {
        this.bstrSubcategory = value;
    }

}
