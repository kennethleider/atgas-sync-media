
package org.atgas.sync.media.beyondtv.webservices.btvlicensemanager;

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
 *         &lt;element name="RenewLogonSessionResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "renewLogonSessionResult"
})
@XmlRootElement(name = "RenewLogonSessionResponse")
public class RenewLogonSessionResponse {

    @XmlElement(name = "RenewLogonSessionResult")
    protected boolean renewLogonSessionResult;

    /**
     * Gets the value of the renewLogonSessionResult property.
     * 
     */
    public boolean isRenewLogonSessionResult() {
        return renewLogonSessionResult;
    }

    /**
     * Sets the value of the renewLogonSessionResult property.
     * 
     */
    public void setRenewLogonSessionResult(boolean value) {
        this.renewLogonSessionResult = value;
    }

}
