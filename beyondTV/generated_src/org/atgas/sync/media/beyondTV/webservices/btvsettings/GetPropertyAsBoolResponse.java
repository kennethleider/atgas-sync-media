
package org.atgas.sync.media.beyondTV.webservices.btvsettings;

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
 *         &lt;element name="GetPropertyAsBoolResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "getPropertyAsBoolResult"
})
@XmlRootElement(name = "GetPropertyAsBoolResponse")
public class GetPropertyAsBoolResponse {

    @XmlElement(name = "GetPropertyAsBoolResult")
    protected boolean getPropertyAsBoolResult;

    /**
     * Gets the value of the getPropertyAsBoolResult property.
     * 
     */
    public boolean isGetPropertyAsBoolResult() {
        return getPropertyAsBoolResult;
    }

    /**
     * Sets the value of the getPropertyAsBoolResult property.
     * 
     */
    public void setGetPropertyAsBoolResult(boolean value) {
        this.getPropertyAsBoolResult = value;
    }

}
