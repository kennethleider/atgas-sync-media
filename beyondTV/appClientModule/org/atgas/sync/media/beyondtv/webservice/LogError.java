
package com.snapstream.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="authTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ulErrorCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="bUnique" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bUniqueDesc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bstrErrStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ulErrorCode",
    "bUnique",
    "bUniqueDesc",
    "bstrErrStr"
})
@XmlRootElement(name = "LogError")
public class LogError {

    protected String authTicket;
    @XmlSchemaType(name = "unsignedInt")
    protected long ulErrorCode;
    protected int bUnique;
    protected int bUniqueDesc;
    protected String bstrErrStr;

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
     * Gets the value of the ulErrorCode property.
     * 
     */
    public long getUlErrorCode() {
        return ulErrorCode;
    }

    /**
     * Sets the value of the ulErrorCode property.
     * 
     */
    public void setUlErrorCode(long value) {
        this.ulErrorCode = value;
    }

    /**
     * Gets the value of the bUnique property.
     * 
     */
    public int getBUnique() {
        return bUnique;
    }

    /**
     * Sets the value of the bUnique property.
     * 
     */
    public void setBUnique(int value) {
        this.bUnique = value;
    }

    /**
     * Gets the value of the bUniqueDesc property.
     * 
     */
    public int getBUniqueDesc() {
        return bUniqueDesc;
    }

    /**
     * Sets the value of the bUniqueDesc property.
     * 
     */
    public void setBUniqueDesc(int value) {
        this.bUniqueDesc = value;
    }

    /**
     * Gets the value of the bstrErrStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrErrStr() {
        return bstrErrStr;
    }

    /**
     * Sets the value of the bstrErrStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrErrStr(String value) {
        this.bstrErrStr = value;
    }

}
