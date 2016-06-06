
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_printFormFileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_printFormFileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pdf"/>
 *     &lt;enumeration value="docx"/>
 *     &lt;enumeration value="doc"/>
 *     &lt;enumeration value="rtf"/>
 *     &lt;enumeration value="xls"/>
 *     &lt;enumeration value="xlsx"/>
 *     &lt;enumeration value="jpeg"/>
 *     &lt;enumeration value="jpg"/>
 *     &lt;enumeration value="bmp"/>
 *     &lt;enumeration value="tif"/>
 *     &lt;enumeration value="tiff"/>
 *     &lt;enumeration value="txt"/>
 *     &lt;enumeration value="zip"/>
 *     &lt;enumeration value="rar"/>
 *     &lt;enumeration value="gif"/>
 *     &lt;enumeration value="csv"/>
 *     &lt;enumeration value="odp"/>
 *     &lt;enumeration value="odf"/>
 *     &lt;enumeration value="ods"/>
 *     &lt;enumeration value="odt"/>
 *     &lt;enumeration value="sxc"/>
 *     &lt;enumeration value="sxw"/>
 *     &lt;enumeration value="xml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_printFormFileType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsPrintFormFileType {

    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("docx")
    DOCX("docx"),
    @XmlEnumValue("doc")
    DOC("doc"),
    @XmlEnumValue("rtf")
    RTF("rtf"),
    @XmlEnumValue("xls")
    XLS("xls"),
    @XmlEnumValue("xlsx")
    XLSX("xlsx"),
    @XmlEnumValue("jpeg")
    JPEG("jpeg"),
    @XmlEnumValue("jpg")
    JPG("jpg"),
    @XmlEnumValue("bmp")
    BMP("bmp"),
    @XmlEnumValue("tif")
    TIF("tif"),
    @XmlEnumValue("tiff")
    TIFF("tiff"),
    @XmlEnumValue("txt")
    TXT("txt"),
    @XmlEnumValue("zip")
    ZIP("zip"),
    @XmlEnumValue("rar")
    RAR("rar"),
    @XmlEnumValue("gif")
    GIF("gif"),
    @XmlEnumValue("csv")
    CSV("csv"),
    @XmlEnumValue("odp")
    ODP("odp"),
    @XmlEnumValue("odf")
    ODF("odf"),
    @XmlEnumValue("ods")
    ODS("ods"),
    @XmlEnumValue("odt")
    ODT("odt"),
    @XmlEnumValue("sxc")
    SXC("sxc"),
    @XmlEnumValue("sxw")
    SXW("sxw"),
    @XmlEnumValue("xml")
    XML("xml");
    private final String value;

    ZfcsPrintFormFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsPrintFormFileType fromValue(String v) {
        for (ZfcsPrintFormFileType c: ZfcsPrintFormFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
