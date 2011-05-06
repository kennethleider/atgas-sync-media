
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
 *         &lt;element name="GetEpisodesByRange2Result" type="{http://www.snapstream.com/WebService}ArrayOfArrayOfString" minOccurs="0"/>
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
    "getEpisodesByRange2Result"
})
@XmlRootElement(name = "GetEpisodesByRange2Response")
public class GetEpisodesByRange2Response {

    @XmlElement(name = "GetEpisodesByRange2Result")
    protected ArrayOfArrayOfString getEpisodesByRange2Result;

    /**
     * Gets the value of the getEpisodesByRange2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public ArrayOfArrayOfString getGetEpisodesByRange2Result() {
        return getEpisodesByRange2Result;
    }

    /**
     * Sets the value of the getEpisodesByRange2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public void setGetEpisodesByRange2Result(ArrayOfArrayOfString value) {
        this.getEpisodesByRange2Result = value;
    }

}
