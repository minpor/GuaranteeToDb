
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Требования к составу документов.
 * 
 * <p>Java class for documentRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reqValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentRequirement", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "sid",
    "ordinalNumber",
    "reqValue"
})
@XmlSeeAlso({
    ru.minpor.jaxb.NotificationEFType.Lots.Lot.DocumentRequirements.DocumentRequirement.class,
    ru.minpor.jaxb.DocReqType.DocumentRequirement.class
})
public class DocumentRequirement {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long sid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected int ordinalNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String reqValue;

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSid(Long value) {
        this.sid = value;
    }

    /**
     * Gets the value of the ordinalNumber property.
     * 
     */
    public int getOrdinalNumber() {
        return ordinalNumber;
    }

    /**
     * Sets the value of the ordinalNumber property.
     * 
     */
    public void setOrdinalNumber(int value) {
        this.ordinalNumber = value;
    }

    /**
     * Gets the value of the reqValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqValue() {
        return reqValue;
    }

    /**
     * Sets the value of the reqValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqValue(String value) {
        this.reqValue = value;
    }

}
