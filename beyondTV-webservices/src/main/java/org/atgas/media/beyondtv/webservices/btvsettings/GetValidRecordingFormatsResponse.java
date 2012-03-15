
package org.atgas.media.beyondtv.webservices.btvsettings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetValidRecordingFormatsResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "getValidRecordingFormatsResult"
})
@XmlRootElement(name = "GetValidRecordingFormatsResponse")
public class GetValidRecordingFormatsResponse {

    @XmlElement(name = "GetValidRecordingFormatsResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getValidRecordingFormatsResult;

    /**
     * Gets the value of the getValidRecordingFormatsResult property.
     * 
     */
    public long getGetValidRecordingFormatsResult() {
        return getValidRecordingFormatsResult;
    }

    /**
     * Sets the value of the getValidRecordingFormatsResult property.
     * 
     */
    public void setGetValidRecordingFormatsResult(long value) {
        this.getValidRecordingFormatsResult = value;
    }

}
