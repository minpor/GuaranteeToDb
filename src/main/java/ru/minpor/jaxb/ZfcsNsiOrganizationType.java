
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сводный перечень заказчиков (СПЗ)
 * 
 * <p>Java class for zfcs_nsiOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_spzNumType"/>
 *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_consRegistryNumType" minOccurs="0"/>
 *         &lt;element name="shortName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fullName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRBSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="\d{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BIK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *               &lt;pattern value="\d{9}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomBank" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="factualAddress">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OKATO" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="addressLine" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="area" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
 *                   &lt;element name="building" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef" minOccurs="0"/>
 *                   &lt;element name="filledManually" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="office" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="region" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
 *                   &lt;element name="settlement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
 *                   &lt;element name="city" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
 *                   &lt;element name="shortStreet" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="street" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
 *                   &lt;element name="zip">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="postalAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="email" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *         &lt;element name="contactPerson" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType" minOccurs="0"/>
 *         &lt;element name="accounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account" type="{http://zakupki.gov.ru/oos/types/1}zfcs_accountType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="budgets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="budget" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="name">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="200"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="headAgency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *         &lt;element name="orderingAgency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *         &lt;element name="KPP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UBPCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IKUInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IKU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikuType"/>
 *                   &lt;element name="dateStIKU" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="dateEndIKU" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OGRN">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OKOPF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fullName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OKPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="OKOGU" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="organizationRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRoleType" maxOccurs="unbounded"/>
 *         &lt;element name="organizationType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
 *         &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
 *         &lt;element name="subordinationType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subordinationTypeEnum" minOccurs="0"/>
 *         &lt;element name="url" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeZoneUtcOffset" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="UTC[+\-]\d{2}:\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="timeZoneOlson" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[a-zA-Z_/]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="register" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiOrganizationType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "regNumber",
    "consRegistryNum",
    "shortName",
    "fullName",
    "grbsCode",
    "bik",
    "nomBank",
    "factualAddress",
    "postalAddress",
    "email",
    "phone",
    "fax",
    "contactPerson",
    "accounts",
    "budgets",
    "headAgency",
    "orderingAgency",
    "inn",
    "kpp",
    "registrationDate",
    "ubpCode",
    "ikuInfo",
    "ogrn",
    "okopf",
    "okpo",
    "okved",
    "okogu",
    "organizationRole",
    "organizationType",
    "oktmo",
    "oktmoppo",
    "subordinationType",
    "url",
    "timeZone",
    "timeZoneUtcOffset",
    "timeZoneOlson",
    "actual",
    "register"
})
public class ZfcsNsiOrganizationType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String regNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String consRegistryNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String shortName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String fullName;
    @XmlElement(name = "GRBSCode", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String grbsCode;
    @XmlElement(name = "BIK", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String bik;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String nomBank;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNsiOrganizationType.FactualAddress factualAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String postalAddress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String email;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String phone;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String fax;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContactPersonType contactPerson;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNsiOrganizationType.Accounts accounts;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNsiOrganizationType.Budgets budgets;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef headAgency;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef orderingAgency;
    @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String inn;
    @XmlElement(name = "KPP", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String kpp;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "UBPCode", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String ubpCode;
    @XmlElement(name = "IKUInfo", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNsiOrganizationType.IKUInfo ikuInfo;
    @XmlElement(name = "OGRN", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String ogrn;
    @XmlElement(name = "OKOPF", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNsiOrganizationType.OKOPF okopf;
    @XmlElement(name = "OKPO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String okpo;
    @XmlElement(name = "OKVED", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String okved;
    @XmlElement(name = "OKOGU", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNsiOrganizationType.OKOGU okogu;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected List<ZfcsOrganizationRoleType> organizationRole;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNsiOrganizationType.OrganizationType organizationType;
    @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOKTMORef oktmo;
    @XmlElement(name = "OKTMOPPO", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOKTMORef oktmoppo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String subordinationType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String url;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer timeZone;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String timeZoneUtcOffset;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String timeZoneOlson;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean actual;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean register;

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
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
     * Gets the value of the grbsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRBSCode() {
        return grbsCode;
    }

    /**
     * Sets the value of the grbsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRBSCode(String value) {
        this.grbsCode = value;
    }

    /**
     * Gets the value of the bik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIK() {
        return bik;
    }

    /**
     * Sets the value of the bik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIK(String value) {
        this.bik = value;
    }

    /**
     * Gets the value of the nomBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomBank() {
        return nomBank;
    }

    /**
     * Sets the value of the nomBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomBank(String value) {
        this.nomBank = value;
    }

    /**
     * Gets the value of the factualAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiOrganizationType.FactualAddress }
     *     
     */
    public ZfcsNsiOrganizationType.FactualAddress getFactualAddress() {
        return factualAddress;
    }

    /**
     * Sets the value of the factualAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiOrganizationType.FactualAddress }
     *     
     */
    public void setFactualAddress(ZfcsNsiOrganizationType.FactualAddress value) {
        this.factualAddress = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress(String value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContactPersonType }
     *     
     */
    public ZfcsContactPersonType getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContactPersonType }
     *     
     */
    public void setContactPerson(ZfcsContactPersonType value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiOrganizationType.Accounts }
     *     
     */
    public ZfcsNsiOrganizationType.Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiOrganizationType.Accounts }
     *     
     */
    public void setAccounts(ZfcsNsiOrganizationType.Accounts value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the budgets property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiOrganizationType.Budgets }
     *     
     */
    public ZfcsNsiOrganizationType.Budgets getBudgets() {
        return budgets;
    }

    /**
     * Sets the value of the budgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiOrganizationType.Budgets }
     *     
     */
    public void setBudgets(ZfcsNsiOrganizationType.Budgets value) {
        this.budgets = value;
    }

    /**
     * Gets the value of the headAgency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getHeadAgency() {
        return headAgency;
    }

    /**
     * Sets the value of the headAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setHeadAgency(ZfcsOrganizationRef value) {
        this.headAgency = value;
    }

    /**
     * Gets the value of the orderingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getOrderingAgency() {
        return orderingAgency;
    }

    /**
     * Sets the value of the orderingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setOrderingAgency(ZfcsOrganizationRef value) {
        this.orderingAgency = value;
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
     * Gets the value of the ubpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBPCode() {
        return ubpCode;
    }

    /**
     * Sets the value of the ubpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBPCode(String value) {
        this.ubpCode = value;
    }

    /**
     * Gets the value of the ikuInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiOrganizationType.IKUInfo }
     *     
     */
    public ZfcsNsiOrganizationType.IKUInfo getIKUInfo() {
        return ikuInfo;
    }

    /**
     * Sets the value of the ikuInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiOrganizationType.IKUInfo }
     *     
     */
    public void setIKUInfo(ZfcsNsiOrganizationType.IKUInfo value) {
        this.ikuInfo = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the okopf property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiOrganizationType.OKOPF }
     *     
     */
    public ZfcsNsiOrganizationType.OKOPF getOKOPF() {
        return okopf;
    }

    /**
     * Sets the value of the okopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiOrganizationType.OKOPF }
     *     
     */
    public void setOKOPF(ZfcsNsiOrganizationType.OKOPF value) {
        this.okopf = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKPO() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKPO(String value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKVED() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKVED(String value) {
        this.okved = value;
    }

    /**
     * Gets the value of the okogu property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiOrganizationType.OKOGU }
     *     
     */
    public ZfcsNsiOrganizationType.OKOGU getOKOGU() {
        return okogu;
    }

    /**
     * Sets the value of the okogu property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiOrganizationType.OKOGU }
     *     
     */
    public void setOKOGU(ZfcsNsiOrganizationType.OKOGU value) {
        this.okogu = value;
    }

    /**
     * Gets the value of the organizationRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsOrganizationRoleType }
     * 
     * 
     */
    public List<ZfcsOrganizationRoleType> getOrganizationRole() {
        if (organizationRole == null) {
            organizationRole = new ArrayList<ZfcsOrganizationRoleType>();
        }
        return this.organizationRole;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiOrganizationType.OrganizationType }
     *     
     */
    public ZfcsNsiOrganizationType.OrganizationType getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiOrganizationType.OrganizationType }
     *     
     */
    public void setOrganizationType(ZfcsNsiOrganizationType.OrganizationType value) {
        this.organizationType = value;
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
     * Gets the value of the oktmoppo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKTMORef }
     *     
     */
    public ZfcsOKTMORef getOKTMOPPO() {
        return oktmoppo;
    }

    /**
     * Sets the value of the oktmoppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKTMORef }
     *     
     */
    public void setOKTMOPPO(ZfcsOKTMORef value) {
        this.oktmoppo = value;
    }

    /**
     * Gets the value of the subordinationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubordinationType() {
        return subordinationType;
    }

    /**
     * Sets the value of the subordinationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubordinationType(String value) {
        this.subordinationType = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeZone(Integer value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeZoneUtcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneUtcOffset() {
        return timeZoneUtcOffset;
    }

    /**
     * Sets the value of the timeZoneUtcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneUtcOffset(String value) {
        this.timeZoneUtcOffset = value;
    }

    /**
     * Gets the value of the timeZoneOlson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneOlson() {
        return timeZoneOlson;
    }

    /**
     * Sets the value of the timeZoneOlson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneOlson(String value) {
        this.timeZoneOlson = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActual(Boolean value) {
        this.actual = value;
    }

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegister(Boolean value) {
        this.register = value;
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
     *         &lt;element name="account" type="{http://zakupki.gov.ru/oos/types/1}zfcs_accountType" maxOccurs="unbounded"/>
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
        "account"
    })
    public static class Accounts {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsAccountType> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsAccountType }
         * 
         * 
         */
        public List<ZfcsAccountType> getAccount() {
            if (account == null) {
                account = new ArrayList<ZfcsAccountType>();
            }
            return this.account;
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
     *         &lt;element name="budget" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="name">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="200"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "budget"
    })
    public static class Budgets {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsNsiOrganizationType.Budgets.Budget> budget;

        /**
         * Gets the value of the budget property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the budget property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBudget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOrganizationType.Budgets.Budget }
         * 
         * 
         */
        public List<ZfcsNsiOrganizationType.Budgets.Budget> getBudget() {
            if (budget == null) {
                budget = new ArrayList<ZfcsNsiOrganizationType.Budgets.Budget>();
            }
            return this.budget;
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
         *         &lt;element name="code">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="name">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="200"/>
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
            "code",
            "name"
        })
        public static class Budget {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String code;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String name;

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
     *         &lt;element name="OKATO" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="addressLine" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="area" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
     *         &lt;element name="building" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef" minOccurs="0"/>
     *         &lt;element name="filledManually" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="office" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="region" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
     *         &lt;element name="settlement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
     *         &lt;element name="city" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
     *         &lt;element name="shortStreet" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="street" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType" minOccurs="0"/>
     *         &lt;element name="zip">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="6"/>
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
        "okato",
        "addressLine",
        "area",
        "building",
        "country",
        "filledManually",
        "office",
        "region",
        "settlement",
        "city",
        "shortStreet",
        "street",
        "zip"
    })
    public static class FactualAddress {

        @XmlElement(name = "OKATO", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String okato;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String addressLine;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsKladrType area;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String building;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCountryRef country;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean filledManually;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String office;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsKladrType region;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsKladrType settlement;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsKladrType city;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String shortStreet;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsKladrType street;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String zip;

        /**
         * Gets the value of the okato property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOKATO() {
            return okato;
        }

        /**
         * Sets the value of the okato property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOKATO(String value) {
            this.okato = value;
        }

        /**
         * Gets the value of the addressLine property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressLine() {
            return addressLine;
        }

        /**
         * Sets the value of the addressLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressLine(String value) {
            this.addressLine = value;
        }

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsKladrType }
         *     
         */
        public ZfcsKladrType getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsKladrType }
         *     
         */
        public void setArea(ZfcsKladrType value) {
            this.area = value;
        }

        /**
         * Gets the value of the building property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuilding() {
            return building;
        }

        /**
         * Sets the value of the building property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuilding(String value) {
            this.building = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCountryRef }
         *     
         */
        public ZfcsCountryRef getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCountryRef }
         *     
         */
        public void setCountry(ZfcsCountryRef value) {
            this.country = value;
        }

        /**
         * Gets the value of the filledManually property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilledManually() {
            return filledManually;
        }

        /**
         * Sets the value of the filledManually property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilledManually(Boolean value) {
            this.filledManually = value;
        }

        /**
         * Gets the value of the office property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffice() {
            return office;
        }

        /**
         * Sets the value of the office property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffice(String value) {
            this.office = value;
        }

        /**
         * Gets the value of the region property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsKladrType }
         *     
         */
        public ZfcsKladrType getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsKladrType }
         *     
         */
        public void setRegion(ZfcsKladrType value) {
            this.region = value;
        }

        /**
         * Gets the value of the settlement property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsKladrType }
         *     
         */
        public ZfcsKladrType getSettlement() {
            return settlement;
        }

        /**
         * Sets the value of the settlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsKladrType }
         *     
         */
        public void setSettlement(ZfcsKladrType value) {
            this.settlement = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsKladrType }
         *     
         */
        public ZfcsKladrType getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsKladrType }
         *     
         */
        public void setCity(ZfcsKladrType value) {
            this.city = value;
        }

        /**
         * Gets the value of the shortStreet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortStreet() {
            return shortStreet;
        }

        /**
         * Sets the value of the shortStreet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortStreet(String value) {
            this.shortStreet = value;
        }

        /**
         * Gets the value of the street property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsKladrType }
         *     
         */
        public ZfcsKladrType getStreet() {
            return street;
        }

        /**
         * Sets the value of the street property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsKladrType }
         *     
         */
        public void setStreet(ZfcsKladrType value) {
            this.street = value;
        }

        /**
         * Gets the value of the zip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZip() {
            return zip;
        }

        /**
         * Sets the value of the zip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZip(String value) {
            this.zip = value;
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
     *         &lt;element name="IKU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikuType"/>
     *         &lt;element name="dateStIKU" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="dateEndIKU" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "iku",
        "dateStIKU",
        "dateEndIKU"
    })
    public static class IKUInfo {

        @XmlElement(name = "IKU", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String iku;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateStIKU;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateEndIKU;

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

        /**
         * Gets the value of the dateStIKU property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateStIKU() {
            return dateStIKU;
        }

        /**
         * Sets the value of the dateStIKU property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateStIKU(XMLGregorianCalendar value) {
            this.dateStIKU = value;
        }

        /**
         * Gets the value of the dateEndIKU property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateEndIKU() {
            return dateEndIKU;
        }

        /**
         * Sets the value of the dateEndIKU property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateEndIKU(XMLGregorianCalendar value) {
            this.dateEndIKU = value;
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
     *         &lt;element name="code">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
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
        "code",
        "name"
    })
    public static class OKOGU {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;

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
     *         &lt;element name="code">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fullName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
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
        "code",
        "fullName"
    })
    public static class OKOPF {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String fullName;

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
     *         &lt;element name="code">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
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
        "code",
        "name"
    })
    public static class OrganizationType {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;

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

    }

}
