
package org.atgas.media.beyondtv.webservices.btvlivetvmanager;

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
 *         &lt;element name="NewSourceSessionOnChannelResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "newSourceSessionOnChannelResult"
})
@XmlRootElement(name = "NewSourceSessionOnChannelResponse")
public class NewSourceSessionOnChannelResponse {

    @XmlElement(name = "NewSourceSessionOnChannelResult", required = true)
    protected String newSourceSessionOnChannelResult;

    /**
     * Gets the value of the newSourceSessionOnChannelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSourceSessionOnChannelResult() {
        return newSourceSessionOnChannelResult;
    }

    /**
     * Sets the value of the newSourceSessionOnChannelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSourceSessionOnChannelResult(String value) {
        this.newSourceSessionOnChannelResult = value;
    }

}
