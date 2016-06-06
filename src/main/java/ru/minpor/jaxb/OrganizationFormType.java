
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationFormType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="organizationFormType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="i97"/>
 *     &lt;enumeration value="i73"/>
 *     &lt;enumeration value="i60"/>
 *     &lt;enumeration value="i77"/>
 *     &lt;enumeration value="i72"/>
 *     &lt;enumeration value="i82"/>
 *     &lt;enumeration value="ZAO"/>
 *     &lt;enumeration value="i91"/>
 *     &lt;enumeration value="i98"/>
 *     &lt;enumeration value="i95"/>
 *     &lt;enumeration value="i96"/>
 *     &lt;enumeration value="i66"/>
 *     &lt;enumeration value="OOO"/>
 *     &lt;enumeration value="i84"/>
 *     &lt;enumeration value="i83"/>
 *     &lt;enumeration value="i93"/>
 *     &lt;enumeration value="i99"/>
 *     &lt;enumeration value="i78"/>
 *     &lt;enumeration value="OAO"/>
 *     &lt;enumeration value="i92"/>
 *     &lt;enumeration value="i51"/>
 *     &lt;enumeration value="i85"/>
 *     &lt;enumeration value="i90"/>
 *     &lt;enumeration value="i52"/>
 *     &lt;enumeration value="i87"/>
 *     &lt;enumeration value="i89"/>
 *     &lt;enumeration value="i76"/>
 *     &lt;enumeration value="i80"/>
 *     &lt;enumeration value="i64"/>
 *     &lt;enumeration value="i94"/>
 *     &lt;enumeration value="i40"/>
 *     &lt;enumeration value="i41"/>
 *     &lt;enumeration value="i42"/>
 *     &lt;enumeration value="i81"/>
 *     &lt;enumeration value="i88"/>
 *     &lt;enumeration value="i48"/>
 *     &lt;enumeration value="i71"/>
 *     &lt;enumeration value="i39"/>
 *     &lt;enumeration value="i70"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organizationFormType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum OrganizationFormType {

    @XmlEnumValue("i97")
    I_97("i97"),
    @XmlEnumValue("i73")
    I_73("i73"),
    @XmlEnumValue("i60")
    I_60("i60"),
    @XmlEnumValue("i77")
    I_77("i77"),
    @XmlEnumValue("i72")
    I_72("i72"),
    @XmlEnumValue("i82")
    I_82("i82"),
    ZAO("ZAO"),
    @XmlEnumValue("i91")
    I_91("i91"),
    @XmlEnumValue("i98")
    I_98("i98"),
    @XmlEnumValue("i95")
    I_95("i95"),
    @XmlEnumValue("i96")
    I_96("i96"),
    @XmlEnumValue("i66")
    I_66("i66"),
    OOO("OOO"),
    @XmlEnumValue("i84")
    I_84("i84"),
    @XmlEnumValue("i83")
    I_83("i83"),
    @XmlEnumValue("i93")
    I_93("i93"),
    @XmlEnumValue("i99")
    I_99("i99"),
    @XmlEnumValue("i78")
    I_78("i78"),
    OAO("OAO"),
    @XmlEnumValue("i92")
    I_92("i92"),
    @XmlEnumValue("i51")
    I_51("i51"),
    @XmlEnumValue("i85")
    I_85("i85"),
    @XmlEnumValue("i90")
    I_90("i90"),
    @XmlEnumValue("i52")
    I_52("i52"),
    @XmlEnumValue("i87")
    I_87("i87"),
    @XmlEnumValue("i89")
    I_89("i89"),
    @XmlEnumValue("i76")
    I_76("i76"),
    @XmlEnumValue("i80")
    I_80("i80"),
    @XmlEnumValue("i64")
    I_64("i64"),
    @XmlEnumValue("i94")
    I_94("i94"),
    @XmlEnumValue("i40")
    I_40("i40"),
    @XmlEnumValue("i41")
    I_41("i41"),
    @XmlEnumValue("i42")
    I_42("i42"),
    @XmlEnumValue("i81")
    I_81("i81"),
    @XmlEnumValue("i88")
    I_88("i88"),
    @XmlEnumValue("i48")
    I_48("i48"),
    @XmlEnumValue("i71")
    I_71("i71"),
    @XmlEnumValue("i39")
    I_39("i39"),
    @XmlEnumValue("i70")
    I_70("i70");
    private final String value;

    OrganizationFormType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganizationFormType fromValue(String v) {
        for (OrganizationFormType c: OrganizationFormType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
