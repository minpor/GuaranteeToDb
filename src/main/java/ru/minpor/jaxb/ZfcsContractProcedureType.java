
package ru.minpor.jaxb;

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
 * Информация об исполнении (расторжении) контракта
 * 
 * <p>Java class for zfcs_contractProcedureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="executions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="finalStageExecution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="execution" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="documentName">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="documentNum">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                             &lt;element name="product" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="quantityContractSubjects" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="quantityContractSubject" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="sid" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
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
 *         &lt;element name="terminations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="termination">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                             &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="reason">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="terminationReason" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                       &lt;element name="name" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="1000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
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
 *         &lt;element name="penalties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="penalty" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="contractParty" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPartyType"/>
 *                             &lt;element name="penaltyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPenaltyType"/>
 *                             &lt;element name="foundation">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="400"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="penaltyAccrual">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="accrualDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
 *                                       &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                       &lt;element name="penaltyFact" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
 *                                                 &lt;element name="collectedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                                 &lt;element name="collectedAmountInPercents" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                                                       &lt;minInclusive value="0"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="penaltyChange" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="penaltyChangeType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penaltyChangeTypeEnum"/>
 *                                       &lt;element name="changeDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
 *                                       &lt;element name="penaltyChangeFact" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
 *                                                 &lt;element name="returnedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                                 &lt;element name="returnedAmountInPercents" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                                                       &lt;minInclusive value="0"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.printFormType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.printFormType" minOccurs="0"/>
 *         &lt;element name="paymentDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="receiptDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="productOriginDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="reason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="currentContractStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.contractStageType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionContractType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractProcedureType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "regNum",
    "publishDate",
    "versionNumber",
    "executions",
    "terminations",
    "penalties",
    "printForm",
    "paymentDocuments",
    "receiptDocuments",
    "productOriginDocuments",
    "reason",
    "currentContractStage"
})
public class ZfcsContractProcedureType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String regNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedureType.Executions executions;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedureType.Terminations terminations;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedureType.Penalties penalties;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType paymentDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType receiptDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType productOriginDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String reason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsContractContractStageType currentContractStage;
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
     * Gets the value of the executions property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedureType.Executions }
     *     
     */
    public ZfcsContractProcedureType.Executions getExecutions() {
        return executions;
    }

    /**
     * Sets the value of the executions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedureType.Executions }
     *     
     */
    public void setExecutions(ZfcsContractProcedureType.Executions value) {
        this.executions = value;
    }

    /**
     * Gets the value of the terminations property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedureType.Terminations }
     *     
     */
    public ZfcsContractProcedureType.Terminations getTerminations() {
        return terminations;
    }

    /**
     * Sets the value of the terminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedureType.Terminations }
     *     
     */
    public void setTerminations(ZfcsContractProcedureType.Terminations value) {
        this.terminations = value;
    }

    /**
     * Gets the value of the penalties property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedureType.Penalties }
     *     
     */
    public ZfcsContractProcedureType.Penalties getPenalties() {
        return penalties;
    }

    /**
     * Sets the value of the penalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedureType.Penalties }
     *     
     */
    public void setPenalties(ZfcsContractProcedureType.Penalties value) {
        this.penalties = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractPrintFormType }
     *     
     */
    public ZfcsContractPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsContractPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the paymentDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getPaymentDocuments() {
        return paymentDocuments;
    }

    /**
     * Sets the value of the paymentDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setPaymentDocuments(ZfcsContractAttachmentListType value) {
        this.paymentDocuments = value;
    }

    /**
     * Gets the value of the receiptDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getReceiptDocuments() {
        return receiptDocuments;
    }

    /**
     * Sets the value of the receiptDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setReceiptDocuments(ZfcsContractAttachmentListType value) {
        this.receiptDocuments = value;
    }

    /**
     * Gets the value of the productOriginDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getProductOriginDocuments() {
        return productOriginDocuments;
    }

    /**
     * Sets the value of the productOriginDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setProductOriginDocuments(ZfcsContractAttachmentListType value) {
        this.productOriginDocuments = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the currentContractStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractContractStageType }
     *     
     */
    public ZfcsContractContractStageType getCurrentContractStage() {
        return currentContractStage;
    }

    /**
     * Sets the value of the currentContractStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractContractStageType }
     *     
     */
    public void setCurrentContractStage(ZfcsContractContractStageType value) {
        this.currentContractStage = value;
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
     *         &lt;element name="stage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
     *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="finalStageExecution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="execution" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="documentName">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="documentNum">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                   &lt;element name="product" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="quantityContractSubjects" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="quantityContractSubject" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="sid" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
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
        "stage",
        "ordinalNumber",
        "finalStageExecution",
        "execution"
    })
    public static class Executions {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsStageType stage;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int ordinalNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean finalStageExecution;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsContractProcedureType.Executions.Execution> execution;

        /**
         * Gets the value of the stage property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsStageType }
         *     
         */
        public ZfcsStageType getStage() {
            return stage;
        }

        /**
         * Sets the value of the stage property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsStageType }
         *     
         */
        public void setStage(ZfcsStageType value) {
            this.stage = value;
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
         * Gets the value of the finalStageExecution property.
         * 
         */
        public boolean isFinalStageExecution() {
            return finalStageExecution;
        }

        /**
         * Sets the value of the finalStageExecution property.
         * 
         */
        public void setFinalStageExecution(boolean value) {
            this.finalStageExecution = value;
        }

        /**
         * Gets the value of the execution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the execution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExecution().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsContractProcedureType.Executions.Execution }
         * 
         * 
         */
        public List<ZfcsContractProcedureType.Executions.Execution> getExecution() {
            if (execution == null) {
                execution = new ArrayList<ZfcsContractProcedureType.Executions.Execution>();
            }
            return this.execution;
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
         *         &lt;element name="documentName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="documentNum">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *         &lt;element name="product" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="quantityContractSubjects" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="quantityContractSubject" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="sid" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
            "documentName",
            "documentNum",
            "documentDate",
            "paid",
            "product",
            "quantityContractSubjects"
        })
        public static class Execution {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String documentName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String documentNum;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar documentDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String paid;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String product;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects quantityContractSubjects;

            /**
             * Gets the value of the documentName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentName() {
                return documentName;
            }

            /**
             * Sets the value of the documentName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentName(String value) {
                this.documentName = value;
            }

            /**
             * Gets the value of the documentNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentNum() {
                return documentNum;
            }

            /**
             * Sets the value of the documentNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentNum(String value) {
                this.documentNum = value;
            }

            /**
             * Gets the value of the documentDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDocumentDate() {
                return documentDate;
            }

            /**
             * Sets the value of the documentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDocumentDate(XMLGregorianCalendar value) {
                this.documentDate = value;
            }

            /**
             * Gets the value of the paid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaid() {
                return paid;
            }

            /**
             * Sets the value of the paid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaid(String value) {
                this.paid = value;
            }

            /**
             * Gets the value of the product property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProduct() {
                return product;
            }

            /**
             * Sets the value of the product property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProduct(String value) {
                this.product = value;
            }

            /**
             * Gets the value of the quantityContractSubjects property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects }
             *     
             */
            public ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects getQuantityContractSubjects() {
                return quantityContractSubjects;
            }

            /**
             * Sets the value of the quantityContractSubjects property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects }
             *     
             */
            public void setQuantityContractSubjects(ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects value) {
                this.quantityContractSubjects = value;
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
             *         &lt;element name="quantityContractSubject" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="sid" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                "quantityContractSubject"
            })
            public static class QuantityContractSubjects {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects.QuantityContractSubject> quantityContractSubject;

                /**
                 * Gets the value of the quantityContractSubject property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the quantityContractSubject property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getQuantityContractSubject().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects.QuantityContractSubject }
                 * 
                 * 
                 */
                public List<ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects.QuantityContractSubject> getQuantityContractSubject() {
                    if (quantityContractSubject == null) {
                        quantityContractSubject = new ArrayList<ZfcsContractProcedureType.Executions.Execution.QuantityContractSubjects.QuantityContractSubject>();
                    }
                    return this.quantityContractSubject;
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
                 *         &lt;element name="sid" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                    "sid",
                    "quantity"
                })
                public static class QuantityContractSubject {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Long sid;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double quantity;

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
                     * Gets the value of the quantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getQuantity() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setQuantity(Double value) {
                        this.quantity = value;
                    }

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
     *         &lt;element name="penalty" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="contractParty" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPartyType"/>
     *                   &lt;element name="penaltyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPenaltyType"/>
     *                   &lt;element name="foundation">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="400"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="penaltyAccrual">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="accrualDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
     *                             &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                             &lt;element name="penaltyFact" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
     *                                       &lt;element name="collectedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                                       &lt;element name="collectedAmountInPercents" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *                                             &lt;minInclusive value="0"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="penaltyChange" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="penaltyChangeType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penaltyChangeTypeEnum"/>
     *                             &lt;element name="changeDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
     *                             &lt;element name="penaltyChangeFact" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
     *                                       &lt;element name="returnedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                                       &lt;element name="returnedAmountInPercents" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *                                             &lt;minInclusive value="0"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
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
     *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.printFormType" minOccurs="0"/>
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
        "penalty",
        "printForm"
    })
    public static class Penalties {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsContractProcedureType.Penalties.Penalty> penalty;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractPrintFormType printForm;

        /**
         * Gets the value of the penalty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the penalty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPenalty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsContractProcedureType.Penalties.Penalty }
         * 
         * 
         */
        public List<ZfcsContractProcedureType.Penalties.Penalty> getPenalty() {
            if (penalty == null) {
                penalty = new ArrayList<ZfcsContractProcedureType.Penalties.Penalty>();
            }
            return this.penalty;
        }

        /**
         * Gets the value of the printForm property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractPrintFormType }
         *     
         */
        public ZfcsContractPrintFormType getPrintForm() {
            return printForm;
        }

        /**
         * Sets the value of the printForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractPrintFormType }
         *     
         */
        public void setPrintForm(ZfcsContractPrintFormType value) {
            this.printForm = value;
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
         *         &lt;element name="contractParty" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPartyType"/>
         *         &lt;element name="penaltyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPenaltyType"/>
         *         &lt;element name="foundation">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="400"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="penaltyAccrual">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="accrualDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
         *                   &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                   &lt;element name="penaltyFact" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
         *                             &lt;element name="collectedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                             &lt;element name="collectedAmountInPercents" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
         *                                   &lt;minInclusive value="0"/>
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
         *         &lt;element name="penaltyChange" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="penaltyChangeType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penaltyChangeTypeEnum"/>
         *                   &lt;element name="changeDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
         *                   &lt;element name="penaltyChangeFact" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
         *                             &lt;element name="returnedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                             &lt;element name="returnedAmountInPercents" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
         *                                   &lt;minInclusive value="0"/>
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
            "contractParty",
            "penaltyType",
            "foundation",
            "penaltyAccrual",
            "penaltyChange"
        })
        public static class Penalty {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsContractPartyType contractParty;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsContractPenaltyType penaltyType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String foundation;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual penaltyAccrual;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange penaltyChange;

            /**
             * Gets the value of the contractParty property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractPartyType }
             *     
             */
            public ZfcsContractPartyType getContractParty() {
                return contractParty;
            }

            /**
             * Sets the value of the contractParty property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractPartyType }
             *     
             */
            public void setContractParty(ZfcsContractPartyType value) {
                this.contractParty = value;
            }

            /**
             * Gets the value of the penaltyType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractPenaltyType }
             *     
             */
            public ZfcsContractPenaltyType getPenaltyType() {
                return penaltyType;
            }

            /**
             * Sets the value of the penaltyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractPenaltyType }
             *     
             */
            public void setPenaltyType(ZfcsContractPenaltyType value) {
                this.penaltyType = value;
            }

            /**
             * Gets the value of the foundation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFoundation() {
                return foundation;
            }

            /**
             * Sets the value of the foundation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFoundation(String value) {
                this.foundation = value;
            }

            /**
             * Gets the value of the penaltyAccrual property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual }
             *     
             */
            public ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual getPenaltyAccrual() {
                return penaltyAccrual;
            }

            /**
             * Sets the value of the penaltyAccrual property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual }
             *     
             */
            public void setPenaltyAccrual(ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual value) {
                this.penaltyAccrual = value;
            }

            /**
             * Gets the value of the penaltyChange property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange }
             *     
             */
            public ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange getPenaltyChange() {
                return penaltyChange;
            }

            /**
             * Sets the value of the penaltyChange property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange }
             *     
             */
            public void setPenaltyChange(ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange value) {
                this.penaltyChange = value;
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
             *         &lt;element name="accrualDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
             *         &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *         &lt;element name="penaltyFact" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
             *                   &lt;element name="collectedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *                   &lt;element name="collectedAmountInPercents" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
             *                         &lt;minInclusive value="0"/>
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
                "accrualDecisionDate",
                "documentInfoList",
                "accrualAmount",
                "penaltyFact"
            })
            public static class PenaltyAccrual {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar accrualDecisionDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsPenaltyDocumentInfoList documentInfoList;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String accrualAmount;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual.PenaltyFact penaltyFact;

                /**
                 * Gets the value of the accrualDecisionDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getAccrualDecisionDate() {
                    return accrualDecisionDate;
                }

                /**
                 * Sets the value of the accrualDecisionDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setAccrualDecisionDate(XMLGregorianCalendar value) {
                    this.accrualDecisionDate = value;
                }

                /**
                 * Gets the value of the documentInfoList property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPenaltyDocumentInfoList }
                 *     
                 */
                public ZfcsPenaltyDocumentInfoList getDocumentInfoList() {
                    return documentInfoList;
                }

                /**
                 * Sets the value of the documentInfoList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPenaltyDocumentInfoList }
                 *     
                 */
                public void setDocumentInfoList(ZfcsPenaltyDocumentInfoList value) {
                    this.documentInfoList = value;
                }

                /**
                 * Gets the value of the accrualAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccrualAmount() {
                    return accrualAmount;
                }

                /**
                 * Sets the value of the accrualAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccrualAmount(String value) {
                    this.accrualAmount = value;
                }

                /**
                 * Gets the value of the penaltyFact property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual.PenaltyFact }
                 *     
                 */
                public ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual.PenaltyFact getPenaltyFact() {
                    return penaltyFact;
                }

                /**
                 * Sets the value of the penaltyFact property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual.PenaltyFact }
                 *     
                 */
                public void setPenaltyFact(ZfcsContractProcedureType.Penalties.Penalty.PenaltyAccrual.PenaltyFact value) {
                    this.penaltyFact = value;
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
                 *         &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
                 *         &lt;element name="collectedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
                 *         &lt;element name="collectedAmountInPercents" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
                 *               &lt;minInclusive value="0"/>
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
                    "documentInfoList",
                    "collectedAmount",
                    "collectedAmountInPercents"
                })
                public static class PenaltyFact {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ZfcsPenaltyDocumentInfoList documentInfoList;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String collectedAmount;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double collectedAmountInPercents;

                    /**
                     * Gets the value of the documentInfoList property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsPenaltyDocumentInfoList }
                     *     
                     */
                    public ZfcsPenaltyDocumentInfoList getDocumentInfoList() {
                        return documentInfoList;
                    }

                    /**
                     * Sets the value of the documentInfoList property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsPenaltyDocumentInfoList }
                     *     
                     */
                    public void setDocumentInfoList(ZfcsPenaltyDocumentInfoList value) {
                        this.documentInfoList = value;
                    }

                    /**
                     * Gets the value of the collectedAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCollectedAmount() {
                        return collectedAmount;
                    }

                    /**
                     * Sets the value of the collectedAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCollectedAmount(String value) {
                        this.collectedAmount = value;
                    }

                    /**
                     * Gets the value of the collectedAmountInPercents property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getCollectedAmountInPercents() {
                        return collectedAmountInPercents;
                    }

                    /**
                     * Sets the value of the collectedAmountInPercents property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setCollectedAmountInPercents(Double value) {
                        this.collectedAmountInPercents = value;
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
             *         &lt;element name="penaltyChangeType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penaltyChangeTypeEnum"/>
             *         &lt;element name="changeDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
             *         &lt;element name="penaltyChangeFact" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
             *                   &lt;element name="returnedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *                   &lt;element name="returnedAmountInPercents" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
             *                         &lt;minInclusive value="0"/>
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
                "penaltyChangeType",
                "changeDecisionDate",
                "documentInfoList",
                "penaltyChangeFact"
            })
            public static class PenaltyChange {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "string")
                protected ZfcsPenaltyChangeTypeEnum penaltyChangeType;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar changeDecisionDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsPenaltyDocumentInfoList documentInfoList;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange.PenaltyChangeFact penaltyChangeFact;

                /**
                 * Gets the value of the penaltyChangeType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPenaltyChangeTypeEnum }
                 *     
                 */
                public ZfcsPenaltyChangeTypeEnum getPenaltyChangeType() {
                    return penaltyChangeType;
                }

                /**
                 * Sets the value of the penaltyChangeType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPenaltyChangeTypeEnum }
                 *     
                 */
                public void setPenaltyChangeType(ZfcsPenaltyChangeTypeEnum value) {
                    this.penaltyChangeType = value;
                }

                /**
                 * Gets the value of the changeDecisionDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getChangeDecisionDate() {
                    return changeDecisionDate;
                }

                /**
                 * Sets the value of the changeDecisionDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setChangeDecisionDate(XMLGregorianCalendar value) {
                    this.changeDecisionDate = value;
                }

                /**
                 * Gets the value of the documentInfoList property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPenaltyDocumentInfoList }
                 *     
                 */
                public ZfcsPenaltyDocumentInfoList getDocumentInfoList() {
                    return documentInfoList;
                }

                /**
                 * Sets the value of the documentInfoList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPenaltyDocumentInfoList }
                 *     
                 */
                public void setDocumentInfoList(ZfcsPenaltyDocumentInfoList value) {
                    this.documentInfoList = value;
                }

                /**
                 * Gets the value of the penaltyChangeFact property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange.PenaltyChangeFact }
                 *     
                 */
                public ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange.PenaltyChangeFact getPenaltyChangeFact() {
                    return penaltyChangeFact;
                }

                /**
                 * Sets the value of the penaltyChangeFact property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange.PenaltyChangeFact }
                 *     
                 */
                public void setPenaltyChangeFact(ZfcsContractProcedureType.Penalties.Penalty.PenaltyChange.PenaltyChangeFact value) {
                    this.penaltyChangeFact = value;
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
                 *         &lt;element name="documentInfoList" type="{http://zakupki.gov.ru/oos/types/1}zfcs_penalty.documentInfoList"/>
                 *         &lt;element name="returnedAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
                 *         &lt;element name="returnedAmountInPercents" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
                 *               &lt;minInclusive value="0"/>
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
                    "documentInfoList",
                    "returnedAmount",
                    "returnedAmountInPercents"
                })
                public static class PenaltyChangeFact {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ZfcsPenaltyDocumentInfoList documentInfoList;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String returnedAmount;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double returnedAmountInPercents;

                    /**
                     * Gets the value of the documentInfoList property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsPenaltyDocumentInfoList }
                     *     
                     */
                    public ZfcsPenaltyDocumentInfoList getDocumentInfoList() {
                        return documentInfoList;
                    }

                    /**
                     * Sets the value of the documentInfoList property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsPenaltyDocumentInfoList }
                     *     
                     */
                    public void setDocumentInfoList(ZfcsPenaltyDocumentInfoList value) {
                        this.documentInfoList = value;
                    }

                    /**
                     * Gets the value of the returnedAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReturnedAmount() {
                        return returnedAmount;
                    }

                    /**
                     * Sets the value of the returnedAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReturnedAmount(String value) {
                        this.returnedAmount = value;
                    }

                    /**
                     * Gets the value of the returnedAmountInPercents property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getReturnedAmountInPercents() {
                        return returnedAmountInPercents;
                    }

                    /**
                     * Sets the value of the returnedAmountInPercents property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setReturnedAmountInPercents(Double value) {
                        this.returnedAmountInPercents = value;
                    }

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
     *         &lt;element name="termination">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                   &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="reason">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="terminationReason" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                             &lt;element name="name" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="1000"/>
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
        "termination"
    })
    public static class Terminations {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContractProcedureType.Terminations.Termination termination;

        /**
         * Gets the value of the termination property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedureType.Terminations.Termination }
         *     
         */
        public ZfcsContractProcedureType.Terminations.Termination getTermination() {
            return termination;
        }

        /**
         * Sets the value of the termination property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedureType.Terminations.Termination }
         *     
         */
        public void setTermination(ZfcsContractProcedureType.Terminations.Termination value) {
            this.termination = value;
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
         *         &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="reason">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="terminationReason" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                   &lt;element name="name" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="1000"/>
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
            "paid",
            "terminationDate",
            "reason",
            "terminationReason"
        })
        public static class Termination {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String paid;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar terminationDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String reason;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedureType.Terminations.Termination.TerminationReason terminationReason;

            /**
             * Gets the value of the paid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaid() {
                return paid;
            }

            /**
             * Sets the value of the paid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaid(String value) {
                this.paid = value;
            }

            /**
             * Gets the value of the terminationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTerminationDate() {
                return terminationDate;
            }

            /**
             * Sets the value of the terminationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTerminationDate(XMLGregorianCalendar value) {
                this.terminationDate = value;
            }

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
            }

            /**
             * Gets the value of the terminationReason property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedureType.Terminations.Termination.TerminationReason }
             *     
             */
            public ZfcsContractProcedureType.Terminations.Termination.TerminationReason getTerminationReason() {
                return terminationReason;
            }

            /**
             * Sets the value of the terminationReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedureType.Terminations.Termination.TerminationReason }
             *     
             */
            public void setTerminationReason(ZfcsContractProcedureType.Terminations.Termination.TerminationReason value) {
                this.terminationReason = value;
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
             *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *         &lt;element name="name" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
                "id",
                "name"
            })
            public static class TerminationReason {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected long id;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String name;

                /**
                 * Gets the value of the id property.
                 * 
                 */
                public long getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 */
                public void setId(long value) {
                    this.id = value;
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

    }

}
