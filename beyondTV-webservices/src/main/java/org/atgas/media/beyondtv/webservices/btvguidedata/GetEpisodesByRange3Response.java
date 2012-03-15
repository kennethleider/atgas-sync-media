
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
 *         &lt;element name="GetEpisodesByRange3Result" type="{http://www.snapstream.com/WebService}ArrayOfArrayOfString" minOccurs="0"/>
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
    "getEpisodesByRange3Result"
})
@XmlRootElement(name = "GetEpisodesByRange3Response")
public class GetEpisodesByRange3Response {

    @XmlElement(name = "GetEpisodesByRange3Result")
    protected ArrayOfArrayOfString getEpisodesByRange3Result;

    /**
     * Gets the value of the getEpisodesByRange3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public ArrayOfArrayOfString getGetEpisodesByRange3Result() {
        return getEpisodesByRange3Result;
    }

    /**
     * Sets the value of the getEpisodesByRange3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public void setGetEpisodesByRange3Result(ArrayOfArrayOfString value) {
        this.getEpisodesByRange3Result = value;
    }

}
