
package org.atgas.media.beyondtv.webservices.btvlibrary;

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
 *         &lt;element name="GetFoldersByRangeResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFoldersByRangeResult",
    "totalCount"
})
@XmlRootElement(name = "GetFoldersByRangeResponse")
public class GetFoldersByRangeResponse {

    @XmlElement(name = "GetFoldersByRangeResult")
    protected ArrayOfPVSPropertyBag getFoldersByRangeResult;
    protected int totalCount;

    /**
     * Gets the value of the getFoldersByRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetFoldersByRangeResult() {
        return getFoldersByRangeResult;
    }

    /**
     * Sets the value of the getFoldersByRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetFoldersByRangeResult(ArrayOfPVSPropertyBag value) {
        this.getFoldersByRangeResult = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

}
