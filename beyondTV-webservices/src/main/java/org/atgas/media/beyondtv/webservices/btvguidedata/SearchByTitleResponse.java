
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
 *         &lt;element name="SearchByTitleResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "searchByTitleResult"
})
@XmlRootElement(name = "SearchByTitleResponse")
public class SearchByTitleResponse {

    @XmlElement(name = "SearchByTitleResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long searchByTitleResult;

    /**
     * Gets the value of the searchByTitleResult property.
     * 
     */
    public long getSearchByTitleResult() {
        return searchByTitleResult;
    }

    /**
     * Sets the value of the searchByTitleResult property.
     * 
     */
    public void setSearchByTitleResult(long value) {
        this.searchByTitleResult = value;
    }

}
