
package com.snapstream.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.snapstream.types.PVSPropertyBag;


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
 *         &lt;element name="GetFirstEpisodeByStationAndSeriesID2Result" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "getFirstEpisodeByStationAndSeriesID2Result"
})
@XmlRootElement(name = "GetFirstEpisodeByStationAndSeriesID2Response")
public class GetFirstEpisodeByStationAndSeriesID2Response {

    @XmlElement(name = "GetFirstEpisodeByStationAndSeriesID2Result")
    protected PVSPropertyBag getFirstEpisodeByStationAndSeriesID2Result;

    /**
     * Gets the value of the getFirstEpisodeByStationAndSeriesID2Result property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getGetFirstEpisodeByStationAndSeriesID2Result() {
        return getFirstEpisodeByStationAndSeriesID2Result;
    }

    /**
     * Sets the value of the getFirstEpisodeByStationAndSeriesID2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setGetFirstEpisodeByStationAndSeriesID2Result(PVSPropertyBag value) {
        this.getFirstEpisodeByStationAndSeriesID2Result = value;
    }

}
