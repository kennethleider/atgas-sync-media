
package org.atgas.media.beyondtv.webservices.btvexpiration;

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
 *         &lt;element name="GetShowLimitsByGuidResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getShowLimitsByGuidResult"
})
@XmlRootElement(name = "GetShowLimitsByGuidResponse")
public class GetShowLimitsByGuidResponse {

    @XmlElement(name = "GetShowLimitsByGuidResult")
    protected int getShowLimitsByGuidResult;

    /**
     * Gets the value of the getShowLimitsByGuidResult property.
     * 
     */
    public int getGetShowLimitsByGuidResult() {
        return getShowLimitsByGuidResult;
    }

    /**
     * Sets the value of the getShowLimitsByGuidResult property.
     * 
     */
    public void setGetShowLimitsByGuidResult(int value) {
        this.getShowLimitsByGuidResult = value;
    }

}
