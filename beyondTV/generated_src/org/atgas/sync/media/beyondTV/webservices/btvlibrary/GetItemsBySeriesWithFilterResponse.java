
package org.atgas.sync.media.beyondTV.webservices.btvlibrary;

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
 *         &lt;element name="GetItemsBySeriesWithFilterResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getItemsBySeriesWithFilterResult"
})
@XmlRootElement(name = "GetItemsBySeriesWithFilterResponse")
public class GetItemsBySeriesWithFilterResponse {

    @XmlElement(name = "GetItemsBySeriesWithFilterResult")
    protected ArrayOfPVSPropertyBag getItemsBySeriesWithFilterResult;

    /**
     * Gets the value of the getItemsBySeriesWithFilterResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetItemsBySeriesWithFilterResult() {
        return getItemsBySeriesWithFilterResult;
    }

    /**
     * Sets the value of the getItemsBySeriesWithFilterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetItemsBySeriesWithFilterResult(ArrayOfPVSPropertyBag value) {
        this.getItemsBySeriesWithFilterResult = value;
    }

}
