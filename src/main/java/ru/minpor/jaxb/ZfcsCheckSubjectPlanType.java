
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Субъект плановой проверки
 * 
 * <p>Java class for zfcs_checkSubjectPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkSubjectPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;choice>
 *           &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="customerNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="authorityNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="authorityAgency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="authorityAgencyNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="specialized" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="specializedNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="EP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="EPNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;element name="commission44">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="commission94">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractServiceOfficer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractService">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="OOS_authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="OOS_authorityNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="RC_authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="RC_authorityNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="FC_authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="FC_authorityNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;element name="legalEntity44">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legalEntity307">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkSubjectPlanType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "customer",
    "customerNew",
    "authority",
    "authorityNew",
    "authorityAgency",
    "authorityAgencyNew",
    "specialized",
    "specializedNew",
    "ep",
    "epNew",
    "commission44",
    "commission94",
    "contractServiceOfficer",
    "contractService",
    "oosAuthority",
    "oosAuthorityNew",
    "rcAuthority",
    "rcAuthorityNew",
    "fcAuthority",
    "fcAuthorityNew",
    "legalEntity44",
    "legalEntity307"
})
public class ZfcsCheckSubjectPlanType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationControlRegistersRef customerNew;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef authority;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationControlRegistersRef authorityNew;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef authorityAgency;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationControlRegistersRef authorityAgencyNew;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef specialized;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationControlRegistersRef specializedNew;
    @XmlElement(name = "EP", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef ep;
    @XmlElement(name = "EPNew", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationControlRegistersRef epNew;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCheckSubjectPlanType.Commission44 commission44;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCheckSubjectPlanType.Commission94 commission94;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCheckSubjectPlanType.ContractServiceOfficer contractServiceOfficer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCheckSubjectPlanType.ContractService contractService;
    @XmlElement(name = "OOS_authority", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef oosAuthority;
    @XmlElement(name = "OOS_authorityNew", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationControlRegistersRef oosAuthorityNew;
    @XmlElement(name = "RC_authority", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef rcAuthority;
    @XmlElement(name = "RC_authorityNew", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationControlRegistersRef rcAuthorityNew;
    @XmlElement(name = "FC_authority", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef fcAuthority;
    @XmlElement(name = "FC_authorityNew", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationControlRegistersRef fcAuthorityNew;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCheckSubjectPlanType.LegalEntity44 legalEntity44;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCheckSubjectPlanType.LegalEntity307 legalEntity307;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setCustomer(ZfcsOrganizationRef value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getCustomerNew() {
        return customerNew;
    }

    /**
     * Sets the value of the customerNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setCustomerNew(ZfcsOrganizationControlRegistersRef value) {
        this.customerNew = value;
    }

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setAuthority(ZfcsOrganizationRef value) {
        this.authority = value;
    }

    /**
     * Gets the value of the authorityNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getAuthorityNew() {
        return authorityNew;
    }

    /**
     * Sets the value of the authorityNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setAuthorityNew(ZfcsOrganizationControlRegistersRef value) {
        this.authorityNew = value;
    }

    /**
     * Gets the value of the authorityAgency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getAuthorityAgency() {
        return authorityAgency;
    }

    /**
     * Sets the value of the authorityAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setAuthorityAgency(ZfcsOrganizationRef value) {
        this.authorityAgency = value;
    }

    /**
     * Gets the value of the authorityAgencyNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getAuthorityAgencyNew() {
        return authorityAgencyNew;
    }

    /**
     * Sets the value of the authorityAgencyNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setAuthorityAgencyNew(ZfcsOrganizationControlRegistersRef value) {
        this.authorityAgencyNew = value;
    }

    /**
     * Gets the value of the specialized property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getSpecialized() {
        return specialized;
    }

    /**
     * Sets the value of the specialized property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setSpecialized(ZfcsOrganizationRef value) {
        this.specialized = value;
    }

    /**
     * Gets the value of the specializedNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getSpecializedNew() {
        return specializedNew;
    }

    /**
     * Sets the value of the specializedNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setSpecializedNew(ZfcsOrganizationControlRegistersRef value) {
        this.specializedNew = value;
    }

    /**
     * Gets the value of the ep property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getEP() {
        return ep;
    }

    /**
     * Sets the value of the ep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setEP(ZfcsOrganizationRef value) {
        this.ep = value;
    }

    /**
     * Gets the value of the epNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getEPNew() {
        return epNew;
    }

    /**
     * Sets the value of the epNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setEPNew(ZfcsOrganizationControlRegistersRef value) {
        this.epNew = value;
    }

    /**
     * Gets the value of the commission44 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckSubjectPlanType.Commission44 }
     *     
     */
    public ZfcsCheckSubjectPlanType.Commission44 getCommission44() {
        return commission44;
    }

    /**
     * Sets the value of the commission44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckSubjectPlanType.Commission44 }
     *     
     */
    public void setCommission44(ZfcsCheckSubjectPlanType.Commission44 value) {
        this.commission44 = value;
    }

    /**
     * Gets the value of the commission94 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckSubjectPlanType.Commission94 }
     *     
     */
    public ZfcsCheckSubjectPlanType.Commission94 getCommission94() {
        return commission94;
    }

    /**
     * Sets the value of the commission94 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckSubjectPlanType.Commission94 }
     *     
     */
    public void setCommission94(ZfcsCheckSubjectPlanType.Commission94 value) {
        this.commission94 = value;
    }

    /**
     * Gets the value of the contractServiceOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckSubjectPlanType.ContractServiceOfficer }
     *     
     */
    public ZfcsCheckSubjectPlanType.ContractServiceOfficer getContractServiceOfficer() {
        return contractServiceOfficer;
    }

    /**
     * Sets the value of the contractServiceOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckSubjectPlanType.ContractServiceOfficer }
     *     
     */
    public void setContractServiceOfficer(ZfcsCheckSubjectPlanType.ContractServiceOfficer value) {
        this.contractServiceOfficer = value;
    }

    /**
     * Gets the value of the contractService property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckSubjectPlanType.ContractService }
     *     
     */
    public ZfcsCheckSubjectPlanType.ContractService getContractService() {
        return contractService;
    }

    /**
     * Sets the value of the contractService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckSubjectPlanType.ContractService }
     *     
     */
    public void setContractService(ZfcsCheckSubjectPlanType.ContractService value) {
        this.contractService = value;
    }

    /**
     * Gets the value of the oosAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getOOSAuthority() {
        return oosAuthority;
    }

    /**
     * Sets the value of the oosAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setOOSAuthority(ZfcsOrganizationRef value) {
        this.oosAuthority = value;
    }

    /**
     * Gets the value of the oosAuthorityNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getOOSAuthorityNew() {
        return oosAuthorityNew;
    }

    /**
     * Sets the value of the oosAuthorityNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setOOSAuthorityNew(ZfcsOrganizationControlRegistersRef value) {
        this.oosAuthorityNew = value;
    }

    /**
     * Gets the value of the rcAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getRCAuthority() {
        return rcAuthority;
    }

    /**
     * Sets the value of the rcAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setRCAuthority(ZfcsOrganizationRef value) {
        this.rcAuthority = value;
    }

    /**
     * Gets the value of the rcAuthorityNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getRCAuthorityNew() {
        return rcAuthorityNew;
    }

    /**
     * Sets the value of the rcAuthorityNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setRCAuthorityNew(ZfcsOrganizationControlRegistersRef value) {
        this.rcAuthorityNew = value;
    }

    /**
     * Gets the value of the fcAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getFCAuthority() {
        return fcAuthority;
    }

    /**
     * Sets the value of the fcAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setFCAuthority(ZfcsOrganizationRef value) {
        this.fcAuthority = value;
    }

    /**
     * Gets the value of the fcAuthorityNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getFCAuthorityNew() {
        return fcAuthorityNew;
    }

    /**
     * Sets the value of the fcAuthorityNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setFCAuthorityNew(ZfcsOrganizationControlRegistersRef value) {
        this.fcAuthorityNew = value;
    }

    /**
     * Gets the value of the legalEntity44 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckSubjectPlanType.LegalEntity44 }
     *     
     */
    public ZfcsCheckSubjectPlanType.LegalEntity44 getLegalEntity44() {
        return legalEntity44;
    }

    /**
     * Sets the value of the legalEntity44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckSubjectPlanType.LegalEntity44 }
     *     
     */
    public void setLegalEntity44(ZfcsCheckSubjectPlanType.LegalEntity44 value) {
        this.legalEntity44 = value;
    }

    /**
     * Gets the value of the legalEntity307 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckSubjectPlanType.LegalEntity307 }
     *     
     */
    public ZfcsCheckSubjectPlanType.LegalEntity307 getLegalEntity307() {
        return legalEntity307;
    }

    /**
     * Sets the value of the legalEntity307 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckSubjectPlanType.LegalEntity307 }
     *     
     */
    public void setLegalEntity307(ZfcsCheckSubjectPlanType.LegalEntity307 value) {
        this.legalEntity307 = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *               &lt;minLength value="1"/>
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
    @XmlType(name = "", propOrder = {
        "organization",
        "organizationNew",
        "info"
    })
    public static class Commission44 {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationRef organization;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *               &lt;minLength value="1"/>
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
    @XmlType(name = "", propOrder = {
        "organization",
        "organizationNew",
        "info"
    })
    public static class Commission94 {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationRef organization;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1000"/>
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
    @XmlType(name = "", propOrder = {
        "organization",
        "organizationNew",
        "info"
    })
    public static class ContractService {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationRef organization;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1000"/>
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
    @XmlType(name = "", propOrder = {
        "organization",
        "organizationNew",
        "info"
    })
    public static class ContractServiceOfficer {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationRef organization;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1000"/>
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
    @XmlType(name = "", propOrder = {
        "organization",
        "organizationNew",
        "info"
    })
    public static class LegalEntity307 {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationRef organization;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1000"/>
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
    @XmlType(name = "", propOrder = {
        "organization",
        "organizationNew",
        "info"
    })
    public static class LegalEntity44 {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationRef organization;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

    }

}