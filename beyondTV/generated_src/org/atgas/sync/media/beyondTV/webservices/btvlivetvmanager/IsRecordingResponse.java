
package org.atgas.sync.media.beyondTV.webservices.btvlivetvmanager;

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
 *         &lt;element name="IsRecordingResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isRecordingResult"
})
@XmlRootElement(name = "IsRecordingResponse")
public class IsRecordingResponse {

    @XmlElement(name = "IsRecordingResult")
    protected boolean isRecordingResult;

    /**
     * Gets the value of the isRecordingResult property.
     * 
     */
    public boolean isIsRecordingResult() {
        return isRecordingResult;
    }

    /**
     * Sets the value of the isRecordingResult property.
     * 
     */
    public void setIsRecordingResult(boolean value) {
        this.isRecordingResult = value;
    }

}
