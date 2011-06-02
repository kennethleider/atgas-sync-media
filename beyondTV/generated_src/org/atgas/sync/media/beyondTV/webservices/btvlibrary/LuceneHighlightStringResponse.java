
package org.atgas.sync.media.beyondTV.webservices.btvlibrary;

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
 *         &lt;element name="LuceneHighlightStringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "luceneHighlightStringResult"
})
@XmlRootElement(name = "LuceneHighlightStringResponse")
public class LuceneHighlightStringResponse {

    @XmlElement(name = "LuceneHighlightStringResult")
    protected String luceneHighlightStringResult;

    /**
     * Gets the value of the luceneHighlightStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuceneHighlightStringResult() {
        return luceneHighlightStringResult;
    }

    /**
     * Sets the value of the luceneHighlightStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuceneHighlightStringResult(String value) {
        this.luceneHighlightStringResult = value;
    }

}
