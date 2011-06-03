
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
 *         &lt;element name="GetFolderMediaCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFolderMediaCountResult"
})
@XmlRootElement(name = "GetFolderMediaCountResponse")
public class GetFolderMediaCountResponse {

    @XmlElement(name = "GetFolderMediaCountResult")
    protected int getFolderMediaCountResult;

    /**
     * Gets the value of the getFolderMediaCountResult property.
     * 
     */
    public int getGetFolderMediaCountResult() {
        return getFolderMediaCountResult;
    }

    /**
     * Sets the value of the getFolderMediaCountResult property.
     * 
     */
    public void setGetFolderMediaCountResult(int value) {
        this.getFolderMediaCountResult = value;
    }

}
