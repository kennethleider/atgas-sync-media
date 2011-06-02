
package org.atgas.sync.media.beyondTV.webservices.btvlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBag;


/**
 * <p>Java class for ArrayOfPVSPropertyBag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPVSPropertyBag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PVSPropertyBag" type="{http://www.snapstream.com/types}PVSPropertyBag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPVSPropertyBag", propOrder = {
    "pvsPropertyBag"
})
public class ArrayOfPVSPropertyBag {

    @XmlElement(name = "PVSPropertyBag", nillable = true)
    protected List<PVSPropertyBag> pvsPropertyBag;

    /**
     * Gets the value of the pvsPropertyBag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pvsPropertyBag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPVSPropertyBag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PVSPropertyBag }
     * 
     * 
     */
    public List<PVSPropertyBag> getPVSPropertyBag() {
        if (pvsPropertyBag == null) {
            pvsPropertyBag = new ArrayList<PVSPropertyBag>();
        }
        return this.pvsPropertyBag;
    }

}
