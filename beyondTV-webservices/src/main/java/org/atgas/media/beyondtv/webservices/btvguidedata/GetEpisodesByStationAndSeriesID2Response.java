
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
 *         &lt;element name="GetEpisodesByStationAndSeriesID2Result" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getEpisodesByStationAndSeriesID2Result"
})
@XmlRootElement(name = "GetEpisodesByStationAndSeriesID2Response")
public class GetEpisodesByStationAndSeriesID2Response {

    @XmlElement(name = "GetEpisodesByStationAndSeriesID2Result")
    protected ArrayOfPVSPropertyBag getEpisodesByStationAndSeriesID2Result;

    /**
     * Gets the value of the getEpisodesByStationAndSeriesID2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetEpisodesByStationAndSeriesID2Result() {
        return getEpisodesByStationAndSeriesID2Result;
    }

    /**
     * Sets the value of the getEpisodesByStationAndSeriesID2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetEpisodesByStationAndSeriesID2Result(ArrayOfPVSPropertyBag value) {
        this.getEpisodesByStationAndSeriesID2Result = value;
    }

}
