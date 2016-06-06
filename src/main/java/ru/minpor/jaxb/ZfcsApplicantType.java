
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Заявитель для РЖ, РПП, РВН, РРК по 44-ФЗ
 * 
 * <p>Java class for zfcs_applicantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_applicantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintApplicantType"/>
 *         &lt;element name="organizationName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="factualAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="postAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactEMail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *         &lt;element name="contactFax" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_applicantType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "applicantType",
    "organizationName",
    "factualAddress",
    "postAddress",
    "contactEMail",
    "contactPhone",
    "contactFax"
})
public class ZfcsApplicantType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsComplaintApplicantType applicantType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String organizationName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String factualAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String postAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactEMail;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactPhone;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactFax;

    /**
     * Gets the value of the applicantType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintApplicantType }
     *     
     */
    public ZfcsComplaintApplicantType getApplicantType() {
        return applicantType;
    }

    /**
     * Sets the value of the applicantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintApplicantType }
     *     
     */
    public void setApplicantType(ZfcsComplaintApplicantType value) {
        this.applicantType = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the factualAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactualAddress() {
        return factualAddress;
    }

    /**
     * Sets the value of the factualAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactualAddress(String value) {
        this.factualAddress = value;
    }

    /**
     * Gets the value of the postAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress() {
        return postAddress;
    }

    /**
     * Sets the value of the postAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress(String value) {
        this.postAddress = value;
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
