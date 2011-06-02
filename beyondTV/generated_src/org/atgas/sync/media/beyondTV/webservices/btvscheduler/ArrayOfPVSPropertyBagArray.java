
package org.atgas.sync.media.beyondTV.webservices.btvscheduler;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.atgas.sync.media.beyondTV.webservices.types.PVSPropertyBagArray;


/**
 * <p>Java class for ArrayOfPVSPropertyBagArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPVSPropertyBagArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PVSPropertyBagArray" type="{http://www.snapstream.com/types}PVSPropertyBagArray" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPVSPropertyBagArray", propOrder = {
    "pvsPropertyBagArray"
})
public class ArrayOfPVSPropertyBagArray {

    @XmlElement(name = "PVSPropertyBagArray", nillable = true)
    protected List<PVSPropertyBagArray> pvsPropertyBagArray;

    /**
     * Gets the value of the pvsPropertyBagArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pvsPropertyBagArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPVSPropertyBagArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PVSPropertyBagArray }
     * 
     * 
     */
    public List<PVSPropertyBagArray> getPVSPropertyBagArray() {
        if (pvsPropertyBagArray == null) {
            pvsPropertyBagArray = new ArrayList<PVSPropertyBagArray>();
        }
        return this.pvsPropertyBagArray;
    }

}
