
package org.atgas.sync.media.beyondtv.webservices.btvlibrary;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibraryHideOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LibraryHideOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReplaceShowSqueezed"/>
 *     &lt;enumeration value="ReplaceOriginals"/>
 *     &lt;enumeration value="Originals"/>
 *     &lt;enumeration value="ShowSqueezed"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LibraryHideOption")
@XmlEnum
public enum LibraryHideOption {

    @XmlEnumValue("ReplaceShowSqueezed")
    REPLACE_SHOW_SQUEEZED("ReplaceShowSqueezed"),
    @XmlEnumValue("ReplaceOriginals")
    REPLACE_ORIGINALS("ReplaceOriginals"),
    @XmlEnumValue("Originals")
    ORIGINALS("Originals"),
    @XmlEnumValue("ShowSqueezed")
    SHOW_SQUEEZED("ShowSqueezed"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    LibraryHideOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LibraryHideOption fromValue(String v) {
        for (LibraryHideOption c: LibraryHideOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
