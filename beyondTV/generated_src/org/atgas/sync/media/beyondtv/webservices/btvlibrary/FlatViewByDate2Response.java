
package org.atgas.sync.media.beyondtv.webservices.btvlibrary;

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
 *         &lt;element name="FlatViewByDate2Result" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "flatViewByDate2Result"
})
@XmlRootElement(name = "FlatViewByDate2Response")
public class FlatViewByDate2Response {

    @XmlElement(name = "FlatViewByDate2Result")
    protected ArrayOfPVSPropertyBag flatViewByDate2Result;

    /**
     * Gets the value of the flatViewByDate2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getFlatViewByDate2Result() {
        return flatViewByDate2Result;
    }

    /**
     * Sets the value of the flatViewByDate2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setFlatViewByDate2Result(ArrayOfPVSPropertyBag value) {
        this.flatViewByDate2Result = value;
    }

}
