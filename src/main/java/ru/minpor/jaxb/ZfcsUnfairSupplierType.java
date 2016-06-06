
package ru.minpor.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о недобросовестном поставщике
 * 
 * <p>Java class for zfcs_unfairSupplierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_unfairSupplierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="state">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;enumeration value="REVIEW_CANCELED"/>
 *               &lt;enumeration value="PUBLISHED"/>
 *               &lt;enumeration value="ON_EXCLUSION"/>
 *               &lt;enumeration value="TEMP_EXCLUDED"/>
 *               &lt;enumeration value="ARCHIVED"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="publishOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *         &lt;element name="createReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="approveReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType" minOccurs="0"/>
 *         &lt;element name="unfairSupplier">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantTypeEnum"/>
 *                   &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="inn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                   &lt;element name="place">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="kladr">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType">
 *                                       &lt;sequence>
 *                                         &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
 *                                         &lt;element name="area" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
 *                                         &lt;element name="city" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
 *                                         &lt;element name="street" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
 *                                         &lt;element name="building" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
 *                                         &lt;element name="office" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
 *                             &lt;/choice>
 *                             &lt;element name="zip">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="email" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="founders" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="names" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="inn">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
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
 *         &lt;element name="purchase" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                   &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="placingWayName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="document" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
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
 *         &lt;element name="notOosPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contract">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
 *                   &lt;element name="productInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                   &lt;element name="cancel" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="performanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="base">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                       &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *                                       &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *         &lt;element name="exclude" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="excludeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
 *                   &lt;element name="type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                         &lt;enumeration value="ORDER"/>
 *                         &lt;enumeration value="EXCLUSION"/>
 *                         &lt;enumeration value="ROLLBACK"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_unfairSupplierType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "registryNum",
    "publishDate",
    "approveDate",
    "state",
    "publishOrg",
    "createReason",
    "approveReason",
    "customer",
    "unfairSupplier",
    "purchase",
    "notOosPurchase",
    "contract",
    "exclude"
})
public class ZfcsUnfairSupplierType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String registryNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approveDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String state;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef publishOrg;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String createReason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String approveReason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchaseOrganizationType customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsUnfairSupplierType.UnfairSupplier unfairSupplier;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsUnfairSupplierType.Purchase purchase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean notOosPurchase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsUnfairSupplierType.Contract contract;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsUnfairSupplierType.Exclude exclude;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the registryNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNum() {
        return registryNum;
    }

    /**
     * Sets the value of the registryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryNum(String value) {
        this.registryNum = value;
    }

    /**
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

    /**
     * Gets the value of the approveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveDate() {
        return approveDate;
    }

    /**
     * Sets the value of the approveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveDate(XMLGregorianCalendar value) {
        this.approveDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the publishOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getPublishOrg() {
        return publishOrg;
    }

    /**
     * Sets the value of the publishOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setPublishOrg(ZfcsOrganizationRef value) {
        this.publishOrg = value;
    }

    /**
     * Gets the value of the createReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateReason() {
        return createReason;
    }

    /**
     * Sets the value of the createReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateReason(String value) {
        this.createReason = value;
    }

    /**
     * Gets the value of the approveReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveReason() {
        return approveReason;
    }

    /**
     * Sets the value of the approveReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveReason(String value) {
        this.approveReason = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public ZfcsPurchaseOrganizationType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public void setCustomer(ZfcsPurchaseOrganizationType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the unfairSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnfairSupplierType.UnfairSupplier }
     *     
     */
    public ZfcsUnfairSupplierType.UnfairSupplier getUnfairSupplier() {
        return unfairSupplier;
    }

    /**
     * Sets the value of the unfairSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnfairSupplierType.UnfairSupplier }
     *     
     */
    public void setUnfairSupplier(ZfcsUnfairSupplierType.UnfairSupplier value) {
        this.unfairSupplier = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnfairSupplierType.Purchase }
     *     
     */
    public ZfcsUnfairSupplierType.Purchase getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnfairSupplierType.Purchase }
     *     
     */
    public void setPurchase(ZfcsUnfairSupplierType.Purchase value) {
        this.purchase = value;
    }

    /**
     * Gets the value of the notOosPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotOosPurchase() {
        return notOosPurchase;
    }

    /**
     * Sets the value of the notOosPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotOosPurchase(Boolean value) {
        this.notOosPurchase = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnfairSupplierType.Contract }
     *     
     */
    public ZfcsUnfairSupplierType.Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnfairSupplierType.Contract }
     *     
     */
    public void setContract(ZfcsUnfairSupplierType.Contract value) {
        this.contract = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnfairSupplierType.Exclude }
     *     
     */
    public ZfcsUnfairSupplierType.Exclude getExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnfairSupplierType.Exclude }
     *     
     */
    public void setExclude(ZfcsUnfairSupplierType.Exclude value) {
        this.exclude = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
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
     *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
     *         &lt;element name="productInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *         &lt;element name="cancel" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="performanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="base">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                             &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
     *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "regNum",
        "productInfo",
        "okpd",
        "currency",
        "price",
        "cancel"
    })
    public static class Contract {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String regNum;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String productInfo;
        @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOKPDRef okpd;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCurrencyRef currency;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String price;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsUnfairSupplierType.Contract.Cancel cancel;

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
         * Gets the value of the productInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductInfo() {
            return productInfo;
        }

        /**
         * Sets the value of the productInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductInfo(String value) {
            this.productInfo = value;
        }

        /**
         * Gets the value of the okpd property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKPDRef }
         *     
         */
        public ZfcsOKPDRef getOKPD() {
            return okpd;
        }

        /**
         * Sets the value of the okpd property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKPDRef }
         *     
         */
        public void setOKPD(ZfcsOKPDRef value) {
            this.okpd = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCurrencyRef }
         *     
         */
        public ZfcsCurrencyRef getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCurrencyRef }
         *     
         */
        public void setCurrency(ZfcsCurrencyRef value) {
            this.currency = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrice(String value) {
            this.price = value;
        }

        /**
         * Gets the value of the cancel property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnfairSupplierType.Contract.Cancel }
         *     
         */
        public ZfcsUnfairSupplierType.Contract.Cancel getCancel() {
            return cancel;
        }

        /**
         * Sets the value of the cancel property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnfairSupplierType.Contract.Cancel }
         *     
         */
        public void setCancel(ZfcsUnfairSupplierType.Contract.Cancel value) {
            this.cancel = value;
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
         *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="performanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="base">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
         *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "signDate",
            "performanceDate",
            "base",
            "cancelDate"
        })
        public static class Cancel {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar signDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar performanceDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsUnfairSupplierType.Contract.Cancel.Base base;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar cancelDate;

            /**
             * Gets the value of the signDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getSignDate() {
                return signDate;
            }

            /**
             * Sets the value of the signDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setSignDate(XMLGregorianCalendar value) {
                this.signDate = value;
            }

            /**
             * Gets the value of the performanceDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPerformanceDate() {
                return performanceDate;
            }

            /**
             * Sets the value of the performanceDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPerformanceDate(XMLGregorianCalendar value) {
                this.performanceDate = value;
            }

            /**
             * Gets the value of the base property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsUnfairSupplierType.Contract.Cancel.Base }
             *     
             */
            public ZfcsUnfairSupplierType.Contract.Cancel.Base getBase() {
                return base;
            }

            /**
             * Sets the value of the base property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnfairSupplierType.Contract.Cancel.Base }
             *     
             */
            public void setBase(ZfcsUnfairSupplierType.Contract.Cancel.Base value) {
                this.base = value;
            }

            /**
             * Gets the value of the cancelDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCancelDate() {
                return cancelDate;
            }

            /**
             * Sets the value of the cancelDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCancelDate(XMLGregorianCalendar value) {
                this.cancelDate = value;
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
             *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
             *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                "name",
                "number",
                "date"
            })
            public static class Base {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String name;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String number;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar date;

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
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumber(String value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
                }

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
     *         &lt;element name="excludeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
     *         &lt;element name="type">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *               &lt;enumeration value="ORDER"/>
     *               &lt;enumeration value="EXCLUSION"/>
     *               &lt;enumeration value="ROLLBACK"/>
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
        "excludeDate",
        "name",
        "date",
        "number",
        "type"
    })
    public static class Exclude {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar excludeDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String number;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String type;

        /**
         * Gets the value of the excludeDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExcludeDate() {
            return excludeDate;
        }

        /**
         * Sets the value of the excludeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExcludeDate(XMLGregorianCalendar value) {
            this.excludeDate = value;
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
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
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
     *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="placingWayName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="document" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
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
        "purchaseNumber",
        "purchaseObjectInfo",
        "placingWayName",
        "protocolDate",
        "lotNumber",
        "document"
    })
    public static class Purchase {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String purchaseNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String purchaseObjectInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String placingWayName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar protocolDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected BigInteger lotNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsUnfairSupplierType.Purchase.Document document;

        /**
         * Gets the value of the purchaseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseNumber() {
            return purchaseNumber;
        }

        /**
         * Sets the value of the purchaseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseNumber(String value) {
            this.purchaseNumber = value;
        }

        /**
         * Gets the value of the purchaseObjectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseObjectInfo() {
            return purchaseObjectInfo;
        }

        /**
         * Sets the value of the purchaseObjectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseObjectInfo(String value) {
            this.purchaseObjectInfo = value;
        }

        /**
         * Gets the value of the placingWayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlacingWayName() {
            return placingWayName;
        }

        /**
         * Sets the value of the placingWayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlacingWayName(String value) {
            this.placingWayName = value;
        }

        /**
         * Gets the value of the protocolDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getProtocolDate() {
            return protocolDate;
        }

        /**
         * Sets the value of the protocolDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setProtocolDate(XMLGregorianCalendar value) {
            this.protocolDate = value;
        }

        /**
         * Gets the value of the lotNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLotNumber() {
            return lotNumber;
        }

        /**
         * Sets the value of the lotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLotNumber(BigInteger value) {
            this.lotNumber = value;
        }

        /**
         * Gets the value of the document property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnfairSupplierType.Purchase.Document }
         *     
         */
        public ZfcsUnfairSupplierType.Purchase.Document getDocument() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnfairSupplierType.Purchase.Document }
         *     
         */
        public void setDocument(ZfcsUnfairSupplierType.Purchase.Document value) {
            this.document = value;
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
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
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
            "name",
            "date",
            "number"
        })
        public static class Document {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String number;

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
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
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
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantTypeEnum"/>
     *         &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="inn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *         &lt;element name="place">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="kladr">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType">
     *                             &lt;sequence>
     *                               &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
     *                               &lt;element name="area" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
     *                               &lt;element name="city" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
     *                               &lt;element name="street" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
     *                               &lt;element name="building" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
     *                               &lt;element name="office" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/extension>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
     *                   &lt;/choice>
     *                   &lt;element name="zip">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="email" minOccurs="0">
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
     *         &lt;element name="founders" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="names" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="inn">
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
        "fullName",
        "type",
        "firmName",
        "inn",
        "kpp",
        "place",
        "founders"
    })
    public static class UnfairSupplier {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String fullName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsParticipantTypeEnum type;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String firmName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String inn;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String kpp;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsUnfairSupplierType.UnfairSupplier.Place place;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<ZfcsUnfairSupplierType.UnfairSupplier.Founders> founders;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsParticipantTypeEnum }
         *     
         */
        public ZfcsParticipantTypeEnum getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsParticipantTypeEnum }
         *     
         */
        public void setType(ZfcsParticipantTypeEnum value) {
            this.type = value;
        }

        /**
         * Gets the value of the firmName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirmName() {
            return firmName;
        }

        /**
         * Sets the value of the firmName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirmName(String value) {
            this.firmName = value;
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
         * Gets the value of the place property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnfairSupplierType.UnfairSupplier.Place }
         *     
         */
        public ZfcsUnfairSupplierType.UnfairSupplier.Place getPlace() {
            return place;
        }

        /**
         * Sets the value of the place property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnfairSupplierType.UnfairSupplier.Place }
         *     
         */
        public void setPlace(ZfcsUnfairSupplierType.UnfairSupplier.Place value) {
            this.place = value;
        }

        /**
         * Gets the value of the founders property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the founders property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFounders().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsUnfairSupplierType.UnfairSupplier.Founders }
         * 
         * 
         */
        public List<ZfcsUnfairSupplierType.UnfairSupplier.Founders> getFounders() {
            if (founders == null) {
                founders = new ArrayList<ZfcsUnfairSupplierType.UnfairSupplier.Founders>();
            }
            return this.founders;
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
         *         &lt;element name="names" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="inn">
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
            "names",
            "inn"
        })
        public static class Founders {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String names;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String inn;

            /**
             * Gets the value of the names property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNames() {
                return names;
            }

            /**
             * Sets the value of the names property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNames(String value) {
                this.names = value;
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
         *           &lt;element name="kladr">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType">
         *                   &lt;sequence>
         *                     &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
         *                     &lt;element name="area" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
         *                     &lt;element name="city" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
         *                     &lt;element name="street" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
         *                     &lt;element name="building" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
         *                     &lt;element name="office" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/extension>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
         *         &lt;/choice>
         *         &lt;element name="zip">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="email" minOccurs="0">
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
            "kladr",
            "country",
            "zip",
            "place",
            "email"
        })
        public static class Place {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsUnfairSupplierType.UnfairSupplier.Place.Kladr kladr;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCountryRef country;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String zip;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String place;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String email;

            /**
             * Gets the value of the kladr property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsUnfairSupplierType.UnfairSupplier.Place.Kladr }
             *     
             */
            public ZfcsUnfairSupplierType.UnfairSupplier.Place.Kladr getKladr() {
                return kladr;
            }

            /**
             * Sets the value of the kladr property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnfairSupplierType.UnfairSupplier.Place.Kladr }
             *     
             */
            public void setKladr(ZfcsUnfairSupplierType.UnfairSupplier.Place.Kladr value) {
                this.kladr = value;
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

            /**
             * Gets the value of the place property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlace() {
                return place;
            }

            /**
             * Sets the value of the place property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlace(String value) {
                this.place = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType">
             *       &lt;sequence>
             *         &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
             *         &lt;element name="area" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
             *         &lt;element name="city" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
             *         &lt;element name="street" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
             *         &lt;element name="building" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
             *         &lt;element name="office" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrTextType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "subjectRF",
                "area",
                "city",
                "street",
                "building",
                "office"
            })
            public static class Kladr
                extends ZfcsKladrType
            {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String subjectRF;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String area;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String city;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String street;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String building;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String office;

                /**
                 * Gets the value of the subjectRF property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubjectRF() {
                    return subjectRF;
                }

                /**
                 * Sets the value of the subjectRF property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubjectRF(String value) {
                    this.subjectRF = value;
                }

                /**
                 * Gets the value of the area property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getArea() {
                    return area;
                }

                /**
                 * Sets the value of the area property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setArea(String value) {
                    this.area = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the street property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStreet(String value) {
                    this.street = value;
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

            }

        }

    }

}
