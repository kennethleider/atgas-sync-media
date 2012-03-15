
package org.atgas.media.beyondtv.webservices.btvguidedata;

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
 *         &lt;element name="GetEpisodesByKeywordWithLimitResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getEpisodesByKeywordWithLimitResult"
})
@XmlRootElement(name = "GetEpisodesByKeywordWithLimitResponse")
public class GetEpisodesByKeywordWithLimitResponse {

    @XmlElement(name = "GetEpisodesByKeywordWithLimitResult")
    protected ArrayOfPVSPropertyBag getEpisodesByKeywordWithLimitResult;

    /**
     * Gets the value of the getEpisodesByKeywordWithLimitResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetEpisodesByKeywordWithLimitResult() {
        return getEpisodesByKeywordWithLimitResult;
    }

    /**
     * Sets the value of the getEpisodesByKeywordWithLimitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetEpisodesByKeywordWithLimitResult(ArrayOfPVSPropertyBag value) {
        this.getEpisodesByKeywordWithLimitResult = value;
    }

}
