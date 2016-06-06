
package ru.minpor.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о выданной банковской гарантии;
 * внесение изменений
 * 
 * <p>Java class for zfcs_bankGuaranteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="extendedDocNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="bank" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType"/>
 *         &lt;element name="placingOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" minOccurs="0"/>
 *         &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
 *         &lt;element name="guarantee">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="purchaseRequestEnsure">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;choice>
 *                                 &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                                 &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *                               &lt;/choice>
 *                               &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                               &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="contractExecutionEnsure">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
 *                               &lt;element name="purchase" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;choice>
 *                                           &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                                           &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *                                         &lt;/choice>
 *                                         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               &lt;element name="singleSupplier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType"/>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
 *                   &lt;element name="guaranteeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="guaranteeNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeNumberType" minOccurs="0"/>
 *                   &lt;element name="guaranteeAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyFullRef"/>
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="entryForceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="guaranteeAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                   &lt;element name="currencyRate" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="agreementDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guarantee.attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGaranteeModificationType"/>
 *                   &lt;element name="info">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="modificationDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guarantee.attachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_bankGuaranteeType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "regNumber",
    "docNumber",
    "extendedDocNumber",
    "versionNumber",
    "docPublishDate",
    "bank",
    "placingOrg",
    "supplier",
    "supplierInfo",
    "guarantee",
    "href",
    "printForm",
    "agreementDocuments",
    "modification"
})
public class ZfcsBankGuaranteeType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String regNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String docNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String extendedDocNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsBankGuaranteeOrganizationType bank;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeOrganizationType placingOrg;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsParticipantType supplier;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeParticipantType supplierInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsBankGuaranteeType.Guarantee guarantee;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsGuaranteeAttachmentListType agreementDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeType.Modification modification;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

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
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the extendedDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedDocNumber() {
        return extendedDocNumber;
    }

    /**
     * Sets the value of the extendedDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedDocNumber(String value) {
        this.extendedDocNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the docPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocPublishDate() {
        return docPublishDate;
    }

    /**
     * Sets the value of the docPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocPublishDate(XMLGregorianCalendar value) {
        this.docPublishDate = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public ZfcsBankGuaranteeOrganizationType getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public void setBank(ZfcsBankGuaranteeOrganizationType value) {
        this.bank = value;
    }

    /**
     * Gets the value of the placingOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public ZfcsBankGuaranteeOrganizationType getPlacingOrg() {
        return placingOrg;
    }

    /**
     * Sets the value of the placingOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public void setPlacingOrg(ZfcsBankGuaranteeOrganizationType value) {
        this.placingOrg = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsParticipantType }
     *     
     */
    public ZfcsParticipantType getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsParticipantType }
     *     
     */
    public void setSupplier(ZfcsParticipantType value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the supplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeParticipantType }
     *     
     */
    public ZfcsBankGuaranteeParticipantType getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeParticipantType }
     *     
     */
    public void setSupplierInfo(ZfcsBankGuaranteeParticipantType value) {
        this.supplierInfo = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeType.Guarantee }
     *     
     */
    public ZfcsBankGuaranteeType.Guarantee getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeType.Guarantee }
     *     
     */
    public void setGuarantee(ZfcsBankGuaranteeType.Guarantee value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the agreementDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsGuaranteeAttachmentListType }
     *     
     */
    public ZfcsGuaranteeAttachmentListType getAgreementDocuments() {
        return agreementDocuments;
    }

    /**
     * Sets the value of the agreementDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsGuaranteeAttachmentListType }
     *     
     */
    public void setAgreementDocuments(ZfcsGuaranteeAttachmentListType value) {
        this.agreementDocuments = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeType.Modification }
     *     
     */
    public ZfcsBankGuaranteeType.Modification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeType.Modification }
     *     
     */
    public void setModification(ZfcsBankGuaranteeType.Modification value) {
        this.modification = value;
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
     *         &lt;choice>
     *           &lt;element name="purchaseRequestEnsure">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;choice>
     *                       &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                       &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
     *                     &lt;/choice>
     *                     &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                     &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="contractExecutionEnsure">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
     *                     &lt;element name="purchase" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;choice>
     *                                 &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                                 &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
     *                               &lt;/choice>
     *                               &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     &lt;element name="singleSupplier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType"/>
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
     *         &lt;element name="guaranteeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="guaranteeNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeNumberType" minOccurs="0"/>
     *         &lt;element name="guaranteeAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyFullRef"/>
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="entryForceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="guaranteeAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *         &lt;element name="currencyRate" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="4"/>
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
        "purchaseRequestEnsure",
        "contractExecutionEnsure",
        "customer",
        "purchaseCode",
        "guaranteeDate",
        "guaranteeNumber",
        "guaranteeAmount",
        "currency",
        "expireDate",
        "entryForceDate",
        "procedure",
        "guaranteeAmountRUR",
        "currencyRate"
    })
    public static class Guarantee {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure purchaseRequestEnsure;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure contractExecutionEnsure;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsBankGuaranteeOrganizationType customer;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String purchaseCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar guaranteeDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String guaranteeNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String guaranteeAmount;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCurrencyFullRef currency;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar expireDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar entryForceDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String procedure;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String guaranteeAmountRUR;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal currencyRate;

        /**
         * Gets the value of the purchaseRequestEnsure property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure }
         *     
         */
        public ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure getPurchaseRequestEnsure() {
            return purchaseRequestEnsure;
        }

        /**
         * Sets the value of the purchaseRequestEnsure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure }
         *     
         */
        public void setPurchaseRequestEnsure(ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure value) {
            this.purchaseRequestEnsure = value;
        }

        /**
         * Gets the value of the contractExecutionEnsure property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure }
         *     
         */
        public ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure getContractExecutionEnsure() {
            return contractExecutionEnsure;
        }

        /**
         * Sets the value of the contractExecutionEnsure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure }
         *     
         */
        public void setContractExecutionEnsure(ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure value) {
            this.contractExecutionEnsure = value;
        }

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeOrganizationType }
         *     
         */
        public ZfcsBankGuaranteeOrganizationType getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeOrganizationType }
         *     
         */
        public void setCustomer(ZfcsBankGuaranteeOrganizationType value) {
            this.customer = value;
        }

        /**
         * Gets the value of the purchaseCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseCode() {
            return purchaseCode;
        }

        /**
         * Sets the value of the purchaseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseCode(String value) {
            this.purchaseCode = value;
        }

        /**
         * Gets the value of the guaranteeDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getGuaranteeDate() {
            return guaranteeDate;
        }

        /**
         * Sets the value of the guaranteeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setGuaranteeDate(XMLGregorianCalendar value) {
            this.guaranteeDate = value;
        }

        /**
         * Gets the value of the guaranteeNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeNumber() {
            return guaranteeNumber;
        }

        /**
         * Sets the value of the guaranteeNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeNumber(String value) {
            this.guaranteeNumber = value;
        }

        /**
         * Gets the value of the guaranteeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeAmount() {
            return guaranteeAmount;
        }

        /**
         * Sets the value of the guaranteeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeAmount(String value) {
            this.guaranteeAmount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCurrencyFullRef }
         *     
         */
        public ZfcsCurrencyFullRef getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCurrencyFullRef }
         *     
         */
        public void setCurrency(ZfcsCurrencyFullRef value) {
            this.currency = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the entryForceDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEntryForceDate() {
            return entryForceDate;
        }

        /**
         * Sets the value of the entryForceDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEntryForceDate(XMLGregorianCalendar value) {
            this.entryForceDate = value;
        }

        /**
         * Gets the value of the procedure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcedure() {
            return procedure;
        }

        /**
         * Sets the value of the procedure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcedure(String value) {
            this.procedure = value;
        }

        /**
         * Gets the value of the guaranteeAmountRUR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeAmountRUR() {
            return guaranteeAmountRUR;
        }

        /**
         * Sets the value of the guaranteeAmountRUR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeAmountRUR(String value) {
            this.guaranteeAmountRUR = value;
        }

        /**
         * Gets the value of the currencyRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCurrencyRate() {
            return currencyRate;
        }

        /**
         * Sets the value of the currencyRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCurrencyRate(BigDecimal value) {
            this.currencyRate = value;
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
         *         &lt;element name="purchase" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
         *                     &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
         *                   &lt;/choice>
         *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="singleSupplier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "purchase",
            "mLots",
            "singleSupplier"
        })
        public static class ContractExecutionEnsure {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String regNum;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase purchase;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean mLots;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean singleSupplier;

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
             * Gets the value of the purchase property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase }
             *     
             */
            public ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase getPurchase() {
                return purchase;
            }

            /**
             * Sets the value of the purchase property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase }
             *     
             */
            public void setPurchase(ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase value) {
                this.purchase = value;
            }

            /**
             * Gets the value of the mLots property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMLots() {
                return mLots;
            }

            /**
             * Sets the value of the mLots property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMLots(Boolean value) {
                this.mLots = value;
            }

            /**
             * Gets the value of the singleSupplier property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSingleSupplier() {
                return singleSupplier;
            }

            /**
             * Sets the value of the singleSupplier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSingleSupplier(Boolean value) {
                this.singleSupplier = value;
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
             *           &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
             *           &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
             *         &lt;/choice>
             *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
                "notificationNumber",
                "lotNumber"
            })
            public static class Purchase {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String purchaseNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String notificationNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected int lotNumber;

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
                 * Gets the value of the notificationNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotificationNumber() {
                    return notificationNumber;
                }

                /**
                 * Sets the value of the notificationNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotificationNumber(String value) {
                    this.notificationNumber = value;
                }

                /**
                 * Gets the value of the lotNumber property.
                 * 
                 */
                public int getLotNumber() {
                    return lotNumber;
                }

                /**
                 * Sets the value of the lotNumber property.
                 * 
                 */
                public void setLotNumber(int value) {
                    this.lotNumber = value;
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
         *         &lt;choice>
         *           &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
         *           &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
         *         &lt;/choice>
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "notificationNumber",
            "lotNumber",
            "mLots"
        })
        public static class PurchaseRequestEnsure {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String purchaseNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String notificationNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean mLots;

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
             * Gets the value of the notificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotificationNumber() {
                return notificationNumber;
            }

            /**
             * Sets the value of the notificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotificationNumber(String value) {
                this.notificationNumber = value;
            }

            /**
             * Gets the value of the lotNumber property.
             * 
             */
            public int getLotNumber() {
                return lotNumber;
            }

            /**
             * Sets the value of the lotNumber property.
             * 
             */
            public void setLotNumber(int value) {
                this.lotNumber = value;
            }

            /**
             * Gets the value of the mLots property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMLots() {
                return mLots;
            }

            /**
             * Sets the value of the mLots property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMLots(Boolean value) {
                this.mLots = value;
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
     *         &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGaranteeModificationType"/>
     *         &lt;element name="info">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="modificationDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guarantee.attachmentListType" minOccurs="0"/>
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
        "modificationDate",
        "reason",
        "info",
        "modificationDocuments"
    })
    public static class Modification {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar modificationDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsBankGaranteeModificationType reason;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String info;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsGuaranteeAttachmentListType modificationDocuments;

        /**
         * Gets the value of the modificationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModificationDate() {
            return modificationDate;
        }

        /**
         * Sets the value of the modificationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModificationDate(XMLGregorianCalendar value) {
            this.modificationDate = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGaranteeModificationType }
         *     
         */
        public ZfcsBankGaranteeModificationType getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGaranteeModificationType }
         *     
         */
        public void setReason(ZfcsBankGaranteeModificationType value) {
            this.reason = value;
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

        /**
         * Gets the value of the modificationDocuments property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsGuaranteeAttachmentListType }
         *     
         */
        public ZfcsGuaranteeAttachmentListType getModificationDocuments() {
            return modificationDocuments;
        }

        /**
         * Sets the value of the modificationDocuments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsGuaranteeAttachmentListType }
         *     
         */
        public void setModificationDocuments(ZfcsGuaranteeAttachmentListType value) {
            this.modificationDocuments = value;
        }

    }

}
