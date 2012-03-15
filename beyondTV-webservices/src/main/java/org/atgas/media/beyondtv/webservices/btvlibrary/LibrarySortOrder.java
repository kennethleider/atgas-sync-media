
package org.atgas.media.beyondtv.webservices.btvlibrary;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibrarySortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LibrarySortOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Descending"/>
 *     &lt;enumeration value="Ascending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LibrarySortOrder")
@XmlEnum
public enum LibrarySortOrder {

    @XmlEnumValue("Descending")
    DESCENDING("Descending"),
    @XmlEnumValue("Ascending")
    ASCENDING("Ascending");
    private final String value;

    LibrarySortOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LibrarySortOrder fromValue(String v) {
        for (LibrarySortOrder c: LibrarySortOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
