
package org.atgas.sync.media.beyondtv.webservices.btvsettings;

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
 *         &lt;element name="GetOEMCodeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getOEMCodeResult"
})
@XmlRootElement(name = "GetOEMCodeResponse")
public class GetOEMCodeResponse {

    @XmlElement(name = "GetOEMCodeResult")
    protected int getOEMCodeResult;

    /**
     * Gets the value of the getOEMCodeResult property.
     * 
     */
    public int getGetOEMCodeResult() {
        return getOEMCodeResult;
    }

    /**
     * Sets the value of the getOEMCodeResult property.
     * 
     */
    public void setGetOEMCodeResult(int value) {
        this.getOEMCodeResult = value;
    }

}
