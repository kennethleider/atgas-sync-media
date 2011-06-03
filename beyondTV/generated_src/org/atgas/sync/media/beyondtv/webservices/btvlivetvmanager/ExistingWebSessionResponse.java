
package org.atgas.sync.media.beyondtv.webservices.btvlivetvmanager;

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
 *         &lt;element name="ExistingWebSessionResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "existingWebSessionResult"
})
@XmlRootElement(name = "ExistingWebSessionResponse")
public class ExistingWebSessionResponse {

    @XmlElement(name = "ExistingWebSessionResult", required = true)
    protected String existingWebSessionResult;

    /**
     * Gets the value of the existingWebSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingWebSessionResult() {
        return existingWebSessionResult;
    }

    /**
     * Sets the value of the existingWebSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingWebSessionResult(String value) {
        this.existingWebSessionResult = value;
    }

}
