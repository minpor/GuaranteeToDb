
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KBKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KBKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kbk1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kbk2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kbk3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kbk4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kbk5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KBKType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "kbk1",
    "kbk2",
    "kbk3",
    "kbk4",
    "kbk5"
})
public class KBKType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String kbk1;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String kbk2;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String kbk3;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String kbk4;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String kbk5;

    /**
     * Gets the value of the kbk1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbk1() {
        return kbk1;
    }

    /**
     * Sets the value of the kbk1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbk1(String value) {
        this.kbk1 = value;
    }

    /**
     * Gets the value of the kbk2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbk2() {
        return kbk2;
    }

    /**
     * Sets the value of the kbk2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbk2(String value) {
        this.kbk2 = value;
    }

    /**
     * Gets the value of the kbk3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbk3() {
        return kbk3;
    }

    /**
     * Sets the value of the kbk3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbk3(String value) {
        this.kbk3 = value;
    }

    /**
     * Gets the value of the kbk4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbk4() {
        return kbk4;
    }

    /**
     * Sets the value of the kbk4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbk4(String value) {
        this.kbk4 = value;
    }

    /**
     * Gets the value of the kbk5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbk5() {
        return kbk5;
    }

    /**
     * Sets the value of the kbk5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbk5(String value) {
        this.kbk5 = value;
    }

}
