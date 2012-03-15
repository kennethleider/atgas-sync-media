
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
 *         &lt;element name="AdvancedSearchCCCountWithSuggestionResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "advancedSearchCCCountWithSuggestionResult",
    "suggestion",
    "suggestionFormatted"
})
@XmlRootElement(name = "AdvancedSearchCCCountWithSuggestionResponse")
public class AdvancedSearchCCCountWithSuggestionResponse {

    @XmlElement(name = "AdvancedSearchCCCountWithSuggestionResult")
    protected int advancedSearchCCCountWithSuggestionResult;
    protected String suggestion;
    protected String suggestionFormatted;

    /**
     * Gets the value of the advancedSearchCCCountWithSuggestionResult property.
     * 
     */
    public int getAdvancedSearchCCCountWithSuggestionResult() {
        return advancedSearchCCCountWithSuggestionResult;
    }

    /**
     * Sets the value of the advancedSearchCCCountWithSuggestionResult property.
     * 
     */
    public void setAdvancedSearchCCCountWithSuggestionResult(int value) {
        this.advancedSearchCCCountWithSuggestionResult = value;
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
