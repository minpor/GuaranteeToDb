
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refusalFact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refusalFact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="voucherEntry">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="explanation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}refusalFactFoundation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refusalFact", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "voucherEntry",
    "explanation",
    "foundation"
})
public class RefusalFact {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String voucherEntry;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String explanation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected RefusalFactFoundation foundation;

    /**
     * Gets the value of the voucherEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherEntry() {
        return voucherEntry;
    }

    /**
     * Sets the value of the voucherEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherEntry(String value) {
        this.voucherEntry = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the foundation property.
     * 
     * @return
     *     possible object is
     *     {@link RefusalFactFoundation }
     *     
     */
    public RefusalFactFoundation getFoundation() {
        return foundation;
    }

    /**
     * Sets the value of the foundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefusalFactFoundation }
     *     
     */
    public void setFoundation(RefusalFactFoundation value) {
        this.foundation = value;
    }

}
