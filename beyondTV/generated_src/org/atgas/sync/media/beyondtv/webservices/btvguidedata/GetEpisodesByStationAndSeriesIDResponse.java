
package org.atgas.sync.media.beyondtv.webservices.btvguidedata;

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
 *         &lt;element name="GetEpisodesByStationAndSeriesIDResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getEpisodesByStationAndSeriesIDResult"
})
@XmlRootElement(name = "GetEpisodesByStationAndSeriesIDResponse")
public class GetEpisodesByStationAndSeriesIDResponse {

    @XmlElement(name = "GetEpisodesByStationAndSeriesIDResult")
    protected ArrayOfPVSPropertyBag getEpisodesByStationAndSeriesIDResult;

    /**
     * Gets the value of the getEpisodesByStationAndSeriesIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetEpisodesByStationAndSeriesIDResult() {
        return getEpisodesByStationAndSeriesIDResult;
    }

    /**
     * Sets the value of the getEpisodesByStationAndSeriesIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetEpisodesByStationAndSeriesIDResult(ArrayOfPVSPropertyBag value) {
        this.getEpisodesByStationAndSeriesIDResult = value;
    }

}