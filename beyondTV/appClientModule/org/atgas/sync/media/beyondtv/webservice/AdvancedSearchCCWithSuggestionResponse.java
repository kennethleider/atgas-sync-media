
package com.snapstream.webservice;

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
 *         &lt;element name="AdvancedSearchCCWithSuggestionResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suggestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suggestionFormatted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "advancedSearchCCWithSuggestionResult",
    "numberOfPages",
    "numberOfResults",
    "suggestion",
    "suggestionFormatted"
})
@XmlRootElement(name = "AdvancedSearchCCWithSuggestionResponse")
public class AdvancedSearchCCWithSuggestionResponse {

    @XmlElement(name = "AdvancedSearchCCWithSuggestionResult")
    protected ArrayOfPVSPropertyBag advancedSearchCCWithSuggestionResult;
    protected int numberOfPages;
    protected int numberOfResults;
    protected String suggestion;
    protected String suggestionFormatted;

    /**
     * Gets the value of the advancedSearchCCWithSuggestionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getAdvancedSearchCCWithSuggestionResult() {
        return advancedSearchCCWithSuggestionResult;
    }

    /**
     * Sets the value of the advancedSearchCCWithSuggestionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setAdvancedSearchCCWithSuggestionResult(ArrayOfPVSPropertyBag value) {
        this.advancedSearchCCWithSuggestionResult = value;
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

    /**
     * Gets the value of the suggestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * Sets the value of the suggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestion(String value) {
        this.suggestion = value;
    }

    /**
     * Gets the value of the suggestionFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestionFormatted() {
        return suggestionFormatted;
    }

    /**
     * Sets the value of the suggestionFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestionFormatted(String value) {
        this.suggestionFormatted = value;
    }

}
