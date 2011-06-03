
package org.atgas.sync.media.beyondtv.webservices.btvlibrary;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibrarySort.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LibrarySort">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="FileName"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="OriginalAirDate"/>
 *     &lt;enumeration value="DateRecorded"/>
 *     &lt;enumeration value="FileType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LibrarySort")
@XmlEnum
public enum LibrarySort {

    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("FileName")
    FILE_NAME("FileName"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("OriginalAirDate")
    ORIGINAL_AIR_DATE("OriginalAirDate"),
    @XmlEnumValue("DateRecorded")
    DATE_RECORDED("DateRecorded"),
    @XmlEnumValue("FileType")
    FILE_TYPE("FileType");
    private final String value;

    LibrarySort(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LibrarySort fromValue(String v) {
        for (LibrarySort c: LibrarySort.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
