
package com.snapstream.webservice;

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
 *         &lt;element name="GetSeriesByKeywordWithLimitResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getSeriesByKeywordWithLimitResult"
})
@XmlRootElement(name = "GetSeriesByKeywordWithLimitResponse")
public class GetSeriesByKeywordWithLimitResponse {

    @XmlElement(name = "GetSeriesByKeywordWithLimitResult")
    protected ArrayOfPVSPropertyBag getSeriesByKeywordWithLimitResult;

    /**
     * Gets the value of the getSeriesByKeywordWithLimitResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetSeriesByKeywordWithLimitResult() {
        return getSeriesByKeywordWithLimitResult;
    }

    /**
     * Sets the value of the getSeriesByKeywordWithLimitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetSeriesByKeywordWithLimitResult(ArrayOfPVSPropertyBag value) {
        this.getSeriesByKeywordWithLimitResult = value;
    }

}
