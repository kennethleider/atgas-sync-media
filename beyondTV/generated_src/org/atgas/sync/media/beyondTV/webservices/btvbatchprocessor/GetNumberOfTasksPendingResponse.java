
package org.atgas.sync.media.beyondTV.webservices.btvbatchprocessor;

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
 *         &lt;element name="GetNumberOfTasksPendingResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "getNumberOfTasksPendingResult"
})
@XmlRootElement(name = "GetNumberOfTasksPendingResponse")
public class GetNumberOfTasksPendingResponse {

    @XmlElement(name = "GetNumberOfTasksPendingResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getNumberOfTasksPendingResult;

    /**
     * Gets the value of the getNumberOfTasksPendingResult property.
     * 
     */
    public long getGetNumberOfTasksPendingResult() {
        return getNumberOfTasksPendingResult;
    }

    /**
     * Sets the value of the getNumberOfTasksPendingResult property.
     * 
     */
    public void setGetNumberOfTasksPendingResult(long value) {
        this.getNumberOfTasksPendingResult = value;
    }

}
