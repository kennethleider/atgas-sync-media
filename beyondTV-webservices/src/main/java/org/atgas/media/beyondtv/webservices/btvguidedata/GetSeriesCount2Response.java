
package org.atgas.media.beyondtv.webservices.btvguidedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetSeriesCount2Result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "getSeriesCount2Result"
})
@XmlRootElement(name = "GetSeriesCount2Response")
public class GetSeriesCount2Response {

    @XmlElement(name = "GetSeriesCount2Result")
    @XmlSchemaType(name = "unsignedInt")
    protected long getSeriesCount2Result;

    /**
     * Gets the value of the getSeriesCount2Result property.
     * 
     */
    public long getGetSeriesCount2Result() {
        return getSeriesCount2Result;
    }

    /**
     * Sets the value of the getSeriesCount2Result property.
     * 
     */
    public void setGetSeriesCount2Result(long value) {
        this.getSeriesCount2Result = value;
    }

}
