
package org.atgas.media.beyondtv.webservices.btvscheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;


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
 *         &lt;element name="GetJobByGUIDResult" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "getJobByGUIDResult"
})
@XmlRootElement(name = "GetJobByGUIDResponse")
public class GetJobByGUIDResponse {

    @XmlElement(name = "GetJobByGUIDResult")
    protected PVSPropertyBag getJobByGUIDResult;

    /**
     * Gets the value of the getJobByGUIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getGetJobByGUIDResult() {
        return getJobByGUIDResult;
    }

    /**
     * Sets the value of the getJobByGUIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setGetJobByGUIDResult(PVSPropertyBag value) {
        this.getJobByGUIDResult = value;
    }

}
