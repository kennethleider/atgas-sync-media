
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
 *         &lt;element name="AdvancedSearchCCResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "advancedSearchCCResult",
    "numberOfPages",
    "numberOfResults"
})
@XmlRootElement(name = "AdvancedSearchCCResponse")
public class AdvancedSearchCCResponse {

    @XmlElement(name = "AdvancedSearchCCResult")
    protected ArrayOfPVSPropertyBag advancedSearchCCResult;
    protected int numberOfPages;
    protected int numberOfResults;

    /**
     * Gets the value of the advancedSearchCCResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getAdvancedSearchCCResult() {
        return advancedSearchCCResult;
    }

    /**
     * Sets the value of the advancedSearchCCResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setAdvancedSearchCCResult(ArrayOfPVSPropertyBag value) {
        this.advancedSearchCCResult = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     */
    public void setNumberOfPages(int value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the numberOfResults property.
     * 
     */
    public int getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Sets the value of the numberOfResults property.
     * 
     */
    public void setNumberOfResults(int value) {
        this.numberOfResults = value;
    }

}
