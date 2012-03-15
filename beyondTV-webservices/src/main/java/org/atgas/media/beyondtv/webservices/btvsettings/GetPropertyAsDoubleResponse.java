
package org.atgas.media.beyondtv.webservices.btvsettings;

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
 *         &lt;element name="GetPropertyAsDoubleResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "getPropertyAsDoubleResult"
})
@XmlRootElement(name = "GetPropertyAsDoubleResponse")
public class GetPropertyAsDoubleResponse {

    @XmlElement(name = "GetPropertyAsDoubleResult")
    protected double getPropertyAsDoubleResult;

    /**
     * Gets the value of the getPropertyAsDoubleResult property.
     * 
     */
    public double getGetPropertyAsDoubleResult() {
        return getPropertyAsDoubleResult;
    }

    /**
     * Sets the value of the getPropertyAsDoubleResult property.
     * 
     */
    public void setGetPropertyAsDoubleResult(double value) {
        this.getPropertyAsDoubleResult = value;
    }

}
