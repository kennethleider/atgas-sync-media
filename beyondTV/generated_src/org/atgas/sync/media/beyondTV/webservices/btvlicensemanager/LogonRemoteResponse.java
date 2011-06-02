
package org.atgas.sync.media.beyondTV.webservices.btvlicensemanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;


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
 *         &lt;element name="LogonRemoteResult" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "logonRemoteResult"
})
@XmlRootElement(name = "LogonRemoteResponse")
public class LogonRemoteResponse {

    @XmlElement(name = "LogonRemoteResult")
    protected PVSPropertyBag logonRemoteResult;

    /**
     * Gets the value of the logonRemoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getLogonRemoteResult() {
        return logonRemoteResult;
    }

    /**
     * Sets the value of the logonRemoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setLogonRemoteResult(PVSPropertyBag value) {
        this.logonRemoteResult = value;
    }

}
