
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Данные организации в банковской гарантии
 * 
 * <p>Java class for zfcs_bankGuaranteeOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_spzNumType"/>
 *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_consRegistryNumType" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="postAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="factAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innOrganizationType" minOccurs="0"/>
 *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *         &lt;element name="location" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}okopfType" minOccurs="0"/>
 *         &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subjectRFRef" minOccurs="0"/>
 *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IKU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikuType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_bankGuaranteeOrganizationType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "regNum",
    "consRegistryNum",
    "fullName",
    "shortName",
    "postAddress",
    "factAddress",
    "inn",
    "kpp",
    "location",
    "legalForm",
    "subjectRF",
    "oktmo",
    "registrationDate",
    "iku"
})
public class ZfcsBankGuaranteeOrganizationType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String regNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String consRegistryNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String fullName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String shortName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String postAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String factAddress;
    @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String inn;
    @XmlElement(name = "KPP", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String kpp;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String location;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected OkopfType legalForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsSubjectRFRef subjectRF;
    @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOKTMORef oktmo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "IKU", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String iku;

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the consRegistryNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsRegistryNum() {
        return consRegistryNum;
    }

    /**
     * Sets the value of the consRegistryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsRegistryNum(String value) {
        this.consRegistryNum = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
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
     * Gets the value of the factAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactAddress() {
        return factAddress;
    }

    /**
     * Sets the value of the factAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactAddress(String value) {
        this.factAddress = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
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
    public void setINN(String value) {
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
    public String getKPP() {
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
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the subjectRF property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsSubjectRFRef }
     *     
     */
    public ZfcsSubjectRFRef getSubjectRF() {
        return subjectRF;
    }

    /**
     * Sets the value of the subjectRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsSubjectRFRef }
     *     
     */
    public void setSubjectRF(ZfcsSubjectRFRef value) {
        this.subjectRF = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKTMORef }
     *     
     */
    public ZfcsOKTMORef getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKTMORef }
     *     
     */
    public void setOKTMO(ZfcsOKTMORef value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the iku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIKU() {
        return iku;
    }

    /**
     * Sets the value of the iku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIKU(String value) {
        this.iku = value;
    }

}
