
package org.atgas.sync.media.beyondtv.webservices.btvlibrary;

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
 *         &lt;element name="GetItemsByFolderWithFilterResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getItemsByFolderWithFilterResult"
})
@XmlRootElement(name = "GetItemsByFolderWithFilterResponse")
public class GetItemsByFolderWithFilterResponse {

    @XmlElement(name = "GetItemsByFolderWithFilterResult")
    protected ArrayOfPVSPropertyBag getItemsByFolderWithFilterResult;

    /**
     * Gets the value of the getItemsByFolderWithFilterResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetItemsByFolderWithFilterResult() {
        return getItemsByFolderWithFilterResult;
    }

    /**
     * Sets the value of the getItemsByFolderWithFilterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetItemsByFolderWithFilterResult(ArrayOfPVSPropertyBag value) {
        this.getItemsByFolderWithFilterResult = value;
    }

}
