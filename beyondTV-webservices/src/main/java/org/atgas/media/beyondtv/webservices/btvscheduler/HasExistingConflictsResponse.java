
package org.atgas.media.beyondtv.webservices.btvscheduler;

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
 *         &lt;element name="HasExistingConflictsResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "hasExistingConflictsResult"
})
@XmlRootElement(name = "HasExistingConflictsResponse")
public class HasExistingConflictsResponse {

    @XmlElement(name = "HasExistingConflictsResult")
    protected int hasExistingConflictsResult;

    /**
     * Gets the value of the hasExistingConflictsResult property.
     * 
     */
    public int getHasExistingConflictsResult() {
        return hasExistingConflictsResult;
    }

    /**
     * Sets the value of the hasExistingConflictsResult property.
     * 
     */
    public void setHasExistingConflictsResult(int value) {
        this.hasExistingConflictsResult = value;
    }

}
