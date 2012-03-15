
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
 *         &lt;element name="authTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hide" type="{http://www.snapstream.com/WebService}LibraryHideOption"/>
 *         &lt;element name="sort" type="{http://www.snapstream.com/WebService}LibrarySort"/>
 *         &lt;element name="order" type="{http://www.snapstream.com/WebService}LibrarySortOrder"/>
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
    "series",
    "hide",
    "sort",
    "order"
})
@XmlRootElement(name = "GetItemsBySeriesWithFilter")
public class GetItemsBySeriesWithFilter {

    protected String authTicket;
    protected String series;
    @XmlElement(required = true)
    protected LibraryHideOption hide;
    @XmlElement(required = true)
    protected LibrarySort sort;
    @XmlElement(required = true)
    protected LibrarySortOrder order;

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
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeries(String value) {
        this.series = value;
    }

    /**
     * Gets the value of the hide property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryHideOption }
     *     
     */
    public LibraryHideOption getHide() {
        return hide;
    }

    /**
     * Sets the value of the hide property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryHideOption }
     *     
     */
    public void setHide(LibraryHideOption value) {
        this.hide = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link LibrarySort }
     *     
     */
    public LibrarySort getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibrarySort }
     *     
     */
    public void setSort(LibrarySort value) {
        this.sort = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link LibrarySortOrder }
     *     
     */
    public LibrarySortOrder getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibrarySortOrder }
     *     
     */
    public void setOrder(LibrarySortOrder value) {
        this.order = value;
    }

}
