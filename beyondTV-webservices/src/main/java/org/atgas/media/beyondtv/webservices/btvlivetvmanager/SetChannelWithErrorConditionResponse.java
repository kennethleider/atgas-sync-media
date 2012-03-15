
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
 *         &lt;element name="SetChannelWithErrorConditionResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "setChannelWithErrorConditionResult"
})
@XmlRootElement(name = "SetChannelWithErrorConditionResponse")
public class SetChannelWithErrorConditionResponse {

    @XmlElement(name = "SetChannelWithErrorConditionResult")
    protected int setChannelWithErrorConditionResult;

    /**
     * Gets the value of the setChannelWithErrorConditionResult property.
     * 
     */
    public int getSetChannelWithErrorConditionResult() {
        return setChannelWithErrorConditionResult;
    }

    /**
     * Sets the value of the setChannelWithErrorConditionResult property.
     * 
     */
    public void setSetChannelWithErrorConditionResult(int value) {
        this.setChannelWithErrorConditionResult = value;
    }

}
