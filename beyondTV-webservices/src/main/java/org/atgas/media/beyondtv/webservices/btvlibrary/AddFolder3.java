
package org.atgas.media.beyondtv.webservices.btvlibrary;

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
 *         &lt;element name="sFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bRecurse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bManaged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "sFolder",
    "bRecurse",
    "bManaged"
})
@XmlRootElement(name = "AddFolder3")
public class AddFolder3 {

    protected String authTicket;
    protected String sFolder;
    protected boolean bRecurse;
    protected boolean bManaged;

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
     * Gets the value of the sFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFolder() {
        return sFolder;
    }

    /**
     * Sets the value of the sFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFolder(String value) {
        this.sFolder = value;
    }

    /**
     * Gets the value of the bRecurse property.
     * 
     */
    public boolean isBRecurse() {
        return bRecurse;
    }

    /**
     * Sets the value of the bRecurse property.
     * 
     */
    public void setBRecurse(boolean value) {
        this.bRecurse = value;
    }

    /**
     * Gets the value of the bManaged property.
     * 
     */
    public boolean isBManaged() {
        return bManaged;
    }

    /**
     * Sets the value of the bManaged property.
     * 
     */
    public void setBManaged(boolean value) {
        this.bManaged = value;
    }

}
