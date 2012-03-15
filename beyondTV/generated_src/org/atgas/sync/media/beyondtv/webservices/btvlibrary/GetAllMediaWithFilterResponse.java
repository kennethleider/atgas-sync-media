
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
 *         &lt;element name="GetAllMediaWithFilterResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getAllMediaWithFilterResult"
})
@XmlRootElement(name = "GetAllMediaWithFilterResponse")
public class GetAllMediaWithFilterResponse {

    @XmlElement(name = "GetAllMediaWithFilterResult")
    protected ArrayOfPVSPropertyBag getAllMediaWithFilterResult;

    /**
     * Gets the value of the getAllMediaWithFilterResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetAllMediaWithFilterResult() {
        return getAllMediaWithFilterResult;
    }

    /**
     * Sets the value of the getAllMediaWithFilterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetAllMediaWithFilterResult(ArrayOfPVSPropertyBag value) {
        this.getAllMediaWithFilterResult = value;
    }

}
