
package com.snapstream.webservice;

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
 *         &lt;element name="GetCountResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "getCountResult"
})
@XmlRootElement(name = "GetCountResponse")
public class GetCountResponse {

    @XmlElement(name = "GetCountResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getCountResult;

    /**
     * Gets the value of the getCountResult property.
     * 
     */
    public long getGetCountResult() {
        return getCountResult;
    }

    /**
     * Sets the value of the getCountResult property.
     * 
     */
    public void setGetCountResult(long value) {
        this.getCountResult = value;
    }

}
