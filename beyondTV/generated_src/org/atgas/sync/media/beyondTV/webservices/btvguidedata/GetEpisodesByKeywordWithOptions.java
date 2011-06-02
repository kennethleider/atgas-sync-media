
package org.atgas.sync.media.beyondTV.webservices.btvguidedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="authTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titleSearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descSearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actorSearch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "keyword",
    "titleSearch",
    "descSearch",
    "actorSearch",
    "limit"
})
@XmlRootElement(name = "GetEpisodesByKeywordWithOptions")
public class GetEpisodesByKeywordWithOptions {

    protected String authTicket;
    protected String keyword;
    protected int titleSearch;
    protected int descSearch;
    protected int actorSearch;
    @XmlSchemaType(name = "unsignedInt")
    protected long limit;

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
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the titleSearch property.
     * 
     */
    public int getTitleSearch() {
        return titleSearch;
    }

    /**
     * Sets the value of the titleSearch property.
     * 
     */
    public void setTitleSearch(int value) {
        this.titleSearch = value;
    }

    /**
     * Gets the value of the descSearch property.
     * 
     */
    public int getDescSearch() {
        return descSearch;
    }

    /**
     * Sets the value of the descSearch property.
     * 
     */
    public void setDescSearch(int value) {
        this.descSearch = value;
    }

    /**
     * Gets the value of the actorSearch property.
     * 
     */
    public int getActorSearch() {
        return actorSearch;
    }

    /**
     * Sets the value of the actorSearch property.
     * 
     */
    public void setActorSearch(int value) {
        this.actorSearch = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public long getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(long value) {
        this.limit = value;
    }

}
