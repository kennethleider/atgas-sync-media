
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
 *         &lt;element name="RemoveByNameResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "removeByNameResult"
})
@XmlRootElement(name = "RemoveByNameResponse")
public class RemoveByNameResponse {

    @XmlElement(name = "RemoveByNameResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long removeByNameResult;

    /**
     * Gets the value of the removeByNameResult property.
     * 
     */
    public long getRemoveByNameResult() {
        return removeByNameResult;
    }

    /**
     * Sets the value of the removeByNameResult property.
     * 
     */
    public void setRemoveByNameResult(long value) {
        this.removeByNameResult = value;
    }

}
