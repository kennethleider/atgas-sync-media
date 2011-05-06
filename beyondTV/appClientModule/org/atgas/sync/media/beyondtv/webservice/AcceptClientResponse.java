
package com.snapstream.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="oldClientToken" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="clientToken" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "oldClientToken",
    "clientToken"
})
@XmlRootElement(name = "AcceptClientResponse")
public class AcceptClientResponse {

    protected byte[] oldClientToken;
    protected byte[] clientToken;

    /**
     * Gets the value of the oldClientToken property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOldClientToken() {
        return oldClientToken;
    }

    /**
     * Sets the value of the oldClientToken property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOldClientToken(byte[] value) {
        this.oldClientToken = ((byte[]) value);
    }

    /**
     * Gets the value of the clientToken property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClientToken() {
        return clientToken;
    }

    /**
     * Sets the value of the clientToken property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setClientToken(byte[] value) {
        this.clientToken = ((byte[]) value);
    }

}
