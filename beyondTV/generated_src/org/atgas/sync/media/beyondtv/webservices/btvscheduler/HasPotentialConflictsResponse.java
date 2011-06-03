
package org.atgas.sync.media.beyondtv.webservices.btvscheduler;

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
 *         &lt;element name="HasPotentialConflictsResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "hasPotentialConflictsResult"
})
@XmlRootElement(name = "HasPotentialConflictsResponse")
public class HasPotentialConflictsResponse {

    @XmlElement(name = "HasPotentialConflictsResult")
    protected int hasPotentialConflictsResult;

    /**
     * Gets the value of the hasPotentialConflictsResult property.
     * 
     */
    public int getHasPotentialConflictsResult() {
        return hasPotentialConflictsResult;
    }

    /**
     * Sets the value of the hasPotentialConflictsResult property.
     * 
     */
    public void setHasPotentialConflictsResult(int value) {
        this.hasPotentialConflictsResult = value;
    }

}