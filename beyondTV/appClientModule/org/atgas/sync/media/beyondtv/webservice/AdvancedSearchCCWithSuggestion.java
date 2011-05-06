
package com.snapstream.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="authTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="search" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="titleSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="descSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ccSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="highlightStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highlightEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suggestionStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suggestionEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "authTicket",
    "search",
    "pageNumber",
    "resultsPerPage",
    "titleSearch",
    "descSearch",
    "ccSearch",
    "highlightStart",
    "highlightEnd",
    "suggestionStart",
    "suggestionEnd"
})
@XmlRootElement(name = "AdvancedSearchCCWithSuggestion")
public class AdvancedSearchCCWithSuggestion {

    protected String authTicket;
    protected String search;
    protected int pageNumber;
    protected int resultsPerPage;
    protected boolean titleSearch;
    protected boolean descSearch;
    protected boolean ccSearch;
    protected String highlightStart;
    protected String highlightEnd;
    protected String suggestionStart;
    protected String suggestionEnd;

    /**
     * Gets the value of the authTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTicket() {
        return authTicket;
    }

    /**
     * Sets the value of the authTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTicket(String value) {
        this.authTicket = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearch(String value) {
        this.search = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the resultsPerPage property.
     * 
     */
    public int getResultsPerPage() {
        return resultsPerPage;
    }

    /**
     * Sets the value of the resultsPerPage property.
     * 
     */
    public void setResultsPerPage(int value) {
        this.resultsPerPage = value;
    }

    /**
     * Gets the value of the titleSearch property.
     * 
     */
    public boolean isTitleSearch() {
        return titleSearch;
    }

    /**
     * Sets the value of the titleSearch property.
     * 
     */
    public void setTitleSearch(boolean value) {
        this.titleSearch = value;
    }

    /**
     * Gets the value of the descSearch property.
     * 
     */
    public boolean isDescSearch() {
        return descSearch;
    }

    /**
     * Sets the value of the descSearch property.
     * 
     */
    public void setDescSearch(boolean value) {
        this.descSearch = value;
    }

    /**
     * Gets the value of the ccSearch property.
     * 
     */
    public boolean isCcSearch() {
        return ccSearch;
    }

    /**
     * Sets the value of the ccSearch property.
     * 
     */
    public void setCcSearch(boolean value) {
        this.ccSearch = value;
    }

    /**
     * Gets the value of the highlightStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighlightStart() {
        return highlightStart;
    }

    /**
     * Sets the value of the highlightStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighlightStart(String value) {
        this.highlightStart = value;
    }

    /**
     * Gets the value of the highlightEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighlightEnd() {
        return highlightEnd;
    }

    /**
     * Sets the value of the highlightEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighlightEnd(String value) {
        this.highlightEnd = value;
    }

    /**
     * Gets the value of the suggestionStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestionStart() {
        return suggestionStart;
    }

    /**
     * Sets the value of the suggestionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestionStart(String value) {
        this.suggestionStart = value;
    }

    /**
     * Gets the value of the suggestionEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestionEnd() {
        return suggestionEnd;
    }

    /**
     * Sets the value of the suggestionEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestionEnd(String value) {
        this.suggestionEnd = value;
    }

}
