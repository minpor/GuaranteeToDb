
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Справочник: Виды внебюджетных средств
 * 
 * <p>Java class for zfcs_nsiOffBudgetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiOffBudgetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subsystemType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subsystemTypeEnum"/>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiOffBudgetType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "code",
    "name",
    "subsystemType",
    "actual"
})
public class ZfcsNsiOffBudgetType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String code;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String name;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsSubsystemTypeEnum subsystemType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean actual;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the subsystemType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsSubsystemTypeEnum }
     *     
     */
    public ZfcsSubsystemTypeEnum getSubsystemType() {
        return subsystemType;
    }

    /**
     * Sets the value of the subsystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsSubsystemTypeEnum }
     *     
     */
    public void setSubsystemType(ZfcsSubsystemTypeEnum value) {
        this.subsystemType = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     */
    public boolean isActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     */
    public void setActual(boolean value) {
        this.actual = value;
    }

}
