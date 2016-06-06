
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orgFactAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orgPostAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactPerson" type="{http://zakupki.gov.ru/oos/types/1}contactPersonType" minOccurs="0"/>
 *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}eMailType" minOccurs="0"/>
 *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}phoneType" minOccurs="0"/>
 *         &lt;element name="contactFax" type="{http://zakupki.gov.ru/oos/types/1}phoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInfoType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "orgName",
    "orgFactAddress",
    "orgPostAddress",
    "contactPerson",
    "contactEMail",
    "contactPhone",
    "contactFax"
})
public class ContactInfoType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String orgName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String orgFactAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String orgPostAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ContactPersonType contactPerson;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactEMail;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactPhone;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactFax;

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgFactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgFactAddress() {
        return orgFactAddress;
    }

    /**
     * Sets the value of the orgFactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgFactAddress(String value) {
        this.orgFactAddress = value;
    }

    /**
     * Gets the value of the orgPostAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPostAddress() {
        return orgPostAddress;
    }

    /**
     * Sets the value of the orgPostAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgPostAddress(String value) {
        this.orgPostAddress = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setContactPerson(ContactPersonType value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the contactEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEMail() {
        return contactEMail;
    }

    /**
     * Sets the value of the contactEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEMail(String value) {
        this.contactEMail = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * Sets the value of the contactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFax(String value) {
        this.contactFax = value;
    }

}
