
package org.atgas.sync.media.beyondtv.webservices.btvbatchprocessor;

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
 *         &lt;element name="IsTranscodingResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "isTranscodingResult"
})
@XmlRootElement(name = "IsTranscodingResponse")
public class IsTranscodingResponse {

    @XmlElement(name = "IsTranscodingResult")
    protected int isTranscodingResult;

    /**
     * Gets the value of the isTranscodingResult property.
     * 
     */
    public int getIsTranscodingResult() {
        return isTranscodingResult;
    }

    /**
     * Sets the value of the isTranscodingResult property.
     * 
     */
    public void setIsTranscodingResult(int value) {
        this.isTranscodingResult = value;
    }

}
