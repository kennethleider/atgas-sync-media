
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
 *         &lt;element name="SearchByTitle2Result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "searchByTitle2Result"
})
@XmlRootElement(name = "SearchByTitle2Response")
public class SearchByTitle2Response {

    @XmlElement(name = "SearchByTitle2Result")
    @XmlSchemaType(name = "unsignedInt")
    protected long searchByTitle2Result;

    /**
     * Gets the value of the searchByTitle2Result property.
     * 
     */
    public long getSearchByTitle2Result() {
        return searchByTitle2Result;
    }

    /**
     * Sets the value of the searchByTitle2Result property.
     * 
     */
    public void setSearchByTitle2Result(long value) {
        this.searchByTitle2Result = value;
    }

}
