
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Поставщик
 * 
 * <p>Java class for participantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="participantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participantType" type="{http://zakupki.gov.ru/oos/types/1}participantTypeType"/>
 *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}innType" minOccurs="0"/>
 *         &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}kppType" minOccurs="0"/>
 *         &lt;element name="organizationForm" type="{http://zakupki.gov.ru/oos/types/1}organizationFormType" minOccurs="0"/>
 *         &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}okopfType" minOccurs="0"/>
 *         &lt;element name="idNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idNumberExtension" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="organizationName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}countryType" minOccurs="0"/>
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
 *         &lt;element name="contactInfo" type="{http://zakupki.gov.ru/oos/types/1}contactPersonType" minOccurs="0"/>
 *         &lt;element name="contactEMail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}phoneType" minOccurs="0"/>
 *         &lt;element name="contactFax" type="{http://zakupki.gov.ru/oos/types/1}phoneType" minOccurs="0"/>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
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
@XmlType(name = "participantType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "participantType",
    "inn",
    "kpp",
    "organizationForm",
    "legalForm",
    "idNumber",
    "idNumberExtension",
    "organizationName",
    "country",
    "factualAddress",
    "postAddress",
    "contactInfo",
    "contactEMail",
    "contactPhone",
    "contactFax",
    "additionalInfo",
    "status"
})
public class ParticipantType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected ParticipantTypeType participantType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String inn;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String kpp;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected OrganizationFormType organizationForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected OkopfType legalForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String idNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String idNumberExtension;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String organizationName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected CountryType country;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String factualAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String postAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ContactPersonType contactInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactEMail;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactPhone;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contactFax;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String additionalInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String status;

    /**
     * Gets the value of the participantType property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantTypeType }
     *     
     */
    public ParticipantTypeType getParticipantType() {
        return participantType;
    }

    /**
     * Sets the value of the participantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantTypeType }
     *     
     */
    public void setParticipantType(ParticipantTypeType value) {
        this.participantType = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpp(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the organizationForm property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationFormType }
     *     
     */
    public OrganizationFormType getOrganizationForm() {
        return organizationForm;
    }

    /**
     * Sets the value of the organizationForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationFormType }
     *     
     */
    public void setOrganizationForm(OrganizationFormType value) {
        this.organizationForm = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link OkopfType }
     *     
     */
    public OkopfType getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkopfType }
     *     
     */
    public void setLegalForm(OkopfType value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idNumberExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumberExtension() {
        return idNumberExtension;
    }

    /**
     * Sets the value of the idNumberExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumberExtension(String value) {
        this.idNumberExtension = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
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
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setContactInfo(ContactPersonType value) {
        this.contactInfo = value;
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

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
