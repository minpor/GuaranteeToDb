
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
 * Результат контроля
 * 
 * <p>Java class for zfcs_checkResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType" minOccurs="0"/>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
 *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResult.resultType" minOccurs="0"/>
 *                   &lt;element name="complaintResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="base">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="unplannedCheckComplaint">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
 *                               &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *                               &lt;element name="checkSubjects" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;choice>
 *                                         &lt;element name="subjectComplaint">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="subjectComplaintGroup">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;choice>
 *                                                     &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                                                     &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                                                   &lt;/choice>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="checkedObject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                               &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *                               &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="unplannedCheck">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="unplannedCheckNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType" minOccurs="0"/>
 *                               &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *                               &lt;element name="checkSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckSubjectPlanType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *                               &lt;element name="orders" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;choice>
 *                                           &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
 *                                           &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
 *                                           &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         &lt;/choice>
 *                                         &lt;element name="info" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;maxLength value="2000"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;choice>
 *                                 &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultActType"/>
 *                                 &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *                                 &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *                               &lt;/choice>
 *                               &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="plannedCheck">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanNumberType" minOccurs="0"/>
 *                               &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *                               &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkSubjectPlanType" minOccurs="0"/>
 *                               &lt;element name="orders" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckObjectType">
 *                                       &lt;sequence minOccurs="0">
 *                                         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                               &lt;choice minOccurs="0">
 *                                 &lt;sequence>
 *                                   &lt;sequence minOccurs="0">
 *                                     &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultActType"/>
 *                                     &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *                                   &lt;/sequence>
 *                                   &lt;sequence minOccurs="0">
 *                                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *                                     &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *                                   &lt;/sequence>
 *                                 &lt;/sequence>
 *                                 &lt;sequence>
 *                                   &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *                                 &lt;/sequence>
 *                               &lt;/choice>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="complaint">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
 *                     &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *                     &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     &lt;element name="checkSubjects" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;element name="subjectComplaint">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="subjectComplaintGroup">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;choice>
 *                                           &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                                           &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                                         &lt;/choice>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="checkedObject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *                     &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_checkResultType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "base",
    "complaint",
    "startDate",
    "endDate",
    "extPrintForm"
})
public class ZfcsCheckResultType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCheckResultType.CommonInfo commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCheckResultType.Base base;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCheckResultType.Complaint complaint;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultType.CommonInfo }
     *     
     */
    public ZfcsCheckResultType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsCheckResultType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultType.Base }
     *     
     */
    public ZfcsCheckResultType.Base getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultType.Base }
     *     
     */
    public void setBase(ZfcsCheckResultType.Base value) {
        this.base = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultType.Complaint }
     *     
     */
    public ZfcsCheckResultType.Complaint getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultType.Complaint }
     *     
     */
    public void setComplaint(ZfcsCheckResultType.Complaint value) {
        this.complaint = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
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
     *       &lt;choice>
     *         &lt;element name="unplannedCheckComplaint">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
     *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
     *                   &lt;element name="checkSubjects" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="subjectComplaint">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="subjectComplaintGroup">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                                         &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *                                       &lt;/choice>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="checkedObject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
     *                   &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="unplannedCheck">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="unplannedCheckNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType" minOccurs="0"/>
     *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
     *                   &lt;element name="checkSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckSubjectPlanType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
     *                   &lt;element name="orders" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
     *                               &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
     *                               &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;/choice>
     *                             &lt;element name="info" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="2000"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultActType"/>
     *                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
     *                     &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
     *                   &lt;/choice>
     *                   &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="plannedCheck">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanNumberType" minOccurs="0"/>
     *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
     *                   &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkSubjectPlanType" minOccurs="0"/>
     *                   &lt;element name="orders" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckObjectType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;choice minOccurs="0">
     *                     &lt;sequence>
     *                       &lt;sequence minOccurs="0">
     *                         &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultActType"/>
     *                         &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
     *                       &lt;/sequence>
     *                       &lt;sequence minOccurs="0">
     *                         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
     *                         &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
     *                       &lt;/sequence>
     *                     &lt;/sequence>
     *                     &lt;sequence>
     *                       &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
     *                     &lt;/sequence>
     *                   &lt;/choice>
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
    @XmlType(name = "", propOrder = {
        "unplannedCheckComplaint",
        "unplannedCheck",
        "plannedCheck"
    })
    public static class Base {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCheckResultType.Base.UnplannedCheckComplaint unplannedCheckComplaint;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCheckResultType.Base.UnplannedCheck unplannedCheck;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCheckResultType.Base.PlannedCheck plannedCheck;

        /**
         * Gets the value of the unplannedCheckComplaint property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultType.Base.UnplannedCheckComplaint }
         *     
         */
        public ZfcsCheckResultType.Base.UnplannedCheckComplaint getUnplannedCheckComplaint() {
            return unplannedCheckComplaint;
        }

        /**
         * Sets the value of the unplannedCheckComplaint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultType.Base.UnplannedCheckComplaint }
         *     
         */
        public void setUnplannedCheckComplaint(ZfcsCheckResultType.Base.UnplannedCheckComplaint value) {
            this.unplannedCheckComplaint = value;
        }

        /**
         * Gets the value of the unplannedCheck property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultType.Base.UnplannedCheck }
         *     
         */
        public ZfcsCheckResultType.Base.UnplannedCheck getUnplannedCheck() {
            return unplannedCheck;
        }

        /**
         * Sets the value of the unplannedCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultType.Base.UnplannedCheck }
         *     
         */
        public void setUnplannedCheck(ZfcsCheckResultType.Base.UnplannedCheck value) {
            this.unplannedCheck = value;
        }

        /**
         * Gets the value of the plannedCheck property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultType.Base.PlannedCheck }
         *     
         */
        public ZfcsCheckResultType.Base.PlannedCheck getPlannedCheck() {
            return plannedCheck;
        }

        /**
         * Sets the value of the plannedCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultType.Base.PlannedCheck }
         *     
         */
        public void setPlannedCheck(ZfcsCheckResultType.Base.PlannedCheck value) {
            this.plannedCheck = value;
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
         *         &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanNumberType" minOccurs="0"/>
         *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
         *         &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkSubjectPlanType" minOccurs="0"/>
         *         &lt;element name="orders" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckObjectType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;choice minOccurs="0">
         *           &lt;sequence>
         *             &lt;sequence minOccurs="0">
         *               &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultActType"/>
         *               &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
         *             &lt;/sequence>
         *             &lt;sequence minOccurs="0">
         *               &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
         *               &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
         *             &lt;/sequence>
         *           &lt;/sequence>
         *           &lt;sequence>
         *             &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
         *           &lt;/sequence>
         *         &lt;/choice>
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
            "checkNumber",
            "regNumber",
            "checkSubject",
            "orders",
            "objectOtherInfo",
            "info",
            "act",
            "actPrescription",
            "decision",
            "decisionPrescription",
            "conclusion"
        })
        public static class PlannedCheck {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String checkNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String regNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckSubjectPlanType checkSubject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsCheckResultType.Base.PlannedCheck.Orders> orders;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String objectOtherInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultActType act;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultPrescriptionType actPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultPrescriptionType decisionPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultDecisionType conclusion;

            /**
             * Gets the value of the checkNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckNumber() {
                return checkNumber;
            }

            /**
             * Sets the value of the checkNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckNumber(String value) {
                this.checkNumber = value;
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
             * Gets the value of the checkSubject property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckSubjectPlanType }
             *     
             */
            public ZfcsCheckSubjectPlanType getCheckSubject() {
                return checkSubject;
            }

            /**
             * Sets the value of the checkSubject property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckSubjectPlanType }
             *     
             */
            public void setCheckSubject(ZfcsCheckSubjectPlanType value) {
                this.checkSubject = value;
            }

            /**
             * Gets the value of the orders property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the orders property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrders().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCheckResultType.Base.PlannedCheck.Orders }
             * 
             * 
             */
            public List<ZfcsCheckResultType.Base.PlannedCheck.Orders> getOrders() {
                if (orders == null) {
                    orders = new ArrayList<ZfcsCheckResultType.Base.PlannedCheck.Orders>();
                }
                return this.orders;
            }

            /**
             * Gets the value of the objectOtherInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectOtherInfo() {
                return objectOtherInfo;
            }

            /**
             * Sets the value of the objectOtherInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectOtherInfo(String value) {
                this.objectOtherInfo = value;
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
             * Gets the value of the act property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultActType }
             *     
             */
            public ZfcsCheckResultActType getAct() {
                return act;
            }

            /**
             * Sets the value of the act property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultActType }
             *     
             */
            public void setAct(ZfcsCheckResultActType value) {
                this.act = value;
            }

            /**
             * Gets the value of the actPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultPrescriptionType }
             *     
             */
            public ZfcsCheckResultPrescriptionType getActPrescription() {
                return actPrescription;
            }

            /**
             * Sets the value of the actPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultPrescriptionType }
             *     
             */
            public void setActPrescription(ZfcsCheckResultPrescriptionType value) {
                this.actPrescription = value;
            }

            /**
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public ZfcsCheckResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public void setDecision(ZfcsCheckResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the decisionPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultPrescriptionType }
             *     
             */
            public ZfcsCheckResultPrescriptionType getDecisionPrescription() {
                return decisionPrescription;
            }

            /**
             * Sets the value of the decisionPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultPrescriptionType }
             *     
             */
            public void setDecisionPrescription(ZfcsCheckResultPrescriptionType value) {
                this.decisionPrescription = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public ZfcsCheckResultDecisionType getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public void setConclusion(ZfcsCheckResultDecisionType value) {
                this.conclusion = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckObjectType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                "info"
            })
            public static class Orders
                extends ZfcsUnplannedCheckObjectType
            {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String info;

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
         *         &lt;element name="unplannedCheckNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType" minOccurs="0"/>
         *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
         *         &lt;element name="checkSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckSubjectPlanType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
         *         &lt;element name="orders" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
         *                     &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
         *                     &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;/choice>
         *                   &lt;element name="info" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="2000"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultActType"/>
         *           &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
         *           &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
         *         &lt;/choice>
         *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
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
            "unplannedCheckNumber",
            "regNumber",
            "checkSubjects",
            "info",
            "attachments",
            "orders",
            "objectOtherInfo",
            "act",
            "decision",
            "conclusion",
            "prescription"
        })
        public static class UnplannedCheck {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String unplannedCheckNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String regNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsUnplannedCheckSubjectPlanType> checkSubjects;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsAttachmentListType attachments;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsCheckResultType.Base.UnplannedCheck.Orders> orders;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String objectOtherInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultActType act;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultDecisionType conclusion;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultPrescriptionType prescription;

            /**
             * Gets the value of the unplannedCheckNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnplannedCheckNumber() {
                return unplannedCheckNumber;
            }

            /**
             * Sets the value of the unplannedCheckNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnplannedCheckNumber(String value) {
                this.unplannedCheckNumber = value;
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
             * Gets the value of the checkSubjects property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the checkSubjects property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCheckSubjects().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsUnplannedCheckSubjectPlanType }
             * 
             * 
             */
            public List<ZfcsUnplannedCheckSubjectPlanType> getCheckSubjects() {
                if (checkSubjects == null) {
                    checkSubjects = new ArrayList<ZfcsUnplannedCheckSubjectPlanType>();
                }
                return this.checkSubjects;
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
             * Gets the value of the attachments property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsAttachmentListType }
             *     
             */
            public ZfcsAttachmentListType getAttachments() {
                return attachments;
            }

            /**
             * Sets the value of the attachments property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsAttachmentListType }
             *     
             */
            public void setAttachments(ZfcsAttachmentListType value) {
                this.attachments = value;
            }

            /**
             * Gets the value of the orders property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the orders property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrders().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCheckResultType.Base.UnplannedCheck.Orders }
             * 
             * 
             */
            public List<ZfcsCheckResultType.Base.UnplannedCheck.Orders> getOrders() {
                if (orders == null) {
                    orders = new ArrayList<ZfcsCheckResultType.Base.UnplannedCheck.Orders>();
                }
                return this.orders;
            }

            /**
             * Gets the value of the objectOtherInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectOtherInfo() {
                return objectOtherInfo;
            }

            /**
             * Sets the value of the objectOtherInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectOtherInfo(String value) {
                this.objectOtherInfo = value;
            }

            /**
             * Gets the value of the act property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultActType }
             *     
             */
            public ZfcsCheckResultActType getAct() {
                return act;
            }

            /**
             * Sets the value of the act property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultActType }
             *     
             */
            public void setAct(ZfcsCheckResultActType value) {
                this.act = value;
            }

            /**
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public ZfcsCheckResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public void setDecision(ZfcsCheckResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public ZfcsCheckResultDecisionType getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public void setConclusion(ZfcsCheckResultDecisionType value) {
                this.conclusion = value;
            }

            /**
             * Gets the value of the prescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultPrescriptionType }
             *     
             */
            public ZfcsCheckResultPrescriptionType getPrescription() {
                return prescription;
            }

            /**
             * Sets the value of the prescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultPrescriptionType }
             *     
             */
            public void setPrescription(ZfcsCheckResultPrescriptionType value) {
                this.prescription = value;
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
             *           &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
             *           &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
             *           &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;/choice>
             *         &lt;element name="info" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="2000"/>
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
                "purchase",
                "order",
                "singleCustomer",
                "info"
            })
            public static class Orders {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsComplaintPurchaseType purchase;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsComplaintOrderType order;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Boolean singleCustomer;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String info;

                /**
                 * Gets the value of the purchase property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsComplaintPurchaseType }
                 *     
                 */
                public ZfcsComplaintPurchaseType getPurchase() {
                    return purchase;
                }

                /**
                 * Sets the value of the purchase property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsComplaintPurchaseType }
                 *     
                 */
                public void setPurchase(ZfcsComplaintPurchaseType value) {
                    this.purchase = value;
                }

                /**
                 * Gets the value of the order property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsComplaintOrderType }
                 *     
                 */
                public ZfcsComplaintOrderType getOrder() {
                    return order;
                }

                /**
                 * Sets the value of the order property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsComplaintOrderType }
                 *     
                 */
                public void setOrder(ZfcsComplaintOrderType value) {
                    this.order = value;
                }

                /**
                 * Gets the value of the singleCustomer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSingleCustomer() {
                    return singleCustomer;
                }

                /**
                 * Sets the value of the singleCustomer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSingleCustomer(Boolean value) {
                    this.singleCustomer = value;
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
         *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
         *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
         *         &lt;element name="checkSubjects" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="subjectComplaint">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="subjectComplaintGroup">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *                               &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
         *                             &lt;/choice>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="checkedObject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
         *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
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
            "complaintNumber",
            "regNumber",
            "checkSubjects",
            "checkedObject",
            "info",
            "decision",
            "prescription"
        })
        public static class UnplannedCheckComplaint {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String complaintNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String regNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects> checkSubjects;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsComplaintObjectType> checkedObject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCheckResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultPrescriptionType prescription;

            /**
             * Gets the value of the complaintNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComplaintNumber() {
                return complaintNumber;
            }

            /**
             * Sets the value of the complaintNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComplaintNumber(String value) {
                this.complaintNumber = value;
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
             * Gets the value of the checkSubjects property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the checkSubjects property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCheckSubjects().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects }
             * 
             * 
             */
            public List<ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects> getCheckSubjects() {
                if (checkSubjects == null) {
                    checkSubjects = new ArrayList<ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects>();
                }
                return this.checkSubjects;
            }

            /**
             * Gets the value of the checkedObject property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the checkedObject property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCheckedObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsComplaintObjectType }
             * 
             * 
             */
            public List<ZfcsComplaintObjectType> getCheckedObject() {
                if (checkedObject == null) {
                    checkedObject = new ArrayList<ZfcsComplaintObjectType>();
                }
                return this.checkedObject;
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
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public ZfcsCheckResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultDecisionType }
             *     
             */
            public void setDecision(ZfcsCheckResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the prescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultPrescriptionType }
             *     
             */
            public ZfcsCheckResultPrescriptionType getPrescription() {
                return prescription;
            }

            /**
             * Sets the value of the prescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultPrescriptionType }
             *     
             */
            public void setPrescription(ZfcsCheckResultPrescriptionType value) {
                this.prescription = value;
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
             *       &lt;choice>
             *         &lt;element name="subjectComplaint">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="subjectComplaintGroup">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
             *                     &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
             *                   &lt;/choice>
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
            @XmlType(name = "", propOrder = {
                "subjectComplaint",
                "subjectComplaintGroup"
            })
            public static class CheckSubjects {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint subjectComplaint;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup subjectComplaintGroup;

                /**
                 * Gets the value of the subjectComplaint property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint }
                 *     
                 */
                public ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint getSubjectComplaint() {
                    return subjectComplaint;
                }

                /**
                 * Sets the value of the subjectComplaint property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint }
                 *     
                 */
                public void setSubjectComplaint(ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint value) {
                    this.subjectComplaint = value;
                }

                /**
                 * Gets the value of the subjectComplaintGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup }
                 *     
                 */
                public ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup getSubjectComplaintGroup() {
                    return subjectComplaintGroup;
                }

                /**
                 * Sets the value of the subjectComplaintGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup }
                 *     
                 */
                public void setSubjectComplaintGroup(ZfcsCheckResultType.Base.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup value) {
                    this.subjectComplaintGroup = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class SubjectComplaint
                    extends ZfcsComplaintSubjectType
                {


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
                 *           &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
                 *           &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
                 *         &lt;/choice>
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
                    "epFailure",
                    "epFailureNew"
                })
                public static class SubjectComplaintGroup {

                    @XmlElement(name = "EP_failure", namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ZfcsOrganizationRef epFailure;
                    @XmlElement(name = "EP_failureNew", namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ZfcsOrganizationControlRegistersRef epFailureNew;

                    /**
                     * Gets the value of the epFailure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsOrganizationRef }
                     *     
                     */
                    public ZfcsOrganizationRef getEPFailure() {
                        return epFailure;
                    }

                    /**
                     * Sets the value of the epFailure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsOrganizationRef }
                     *     
                     */
                    public void setEPFailure(ZfcsOrganizationRef value) {
                        this.epFailure = value;
                    }

                    /**
                     * Gets the value of the epFailureNew property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsOrganizationControlRegistersRef }
                     *     
                     */
                    public ZfcsOrganizationControlRegistersRef getEPFailureNew() {
                        return epFailureNew;
                    }

                    /**
                     * Sets the value of the epFailureNew property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsOrganizationControlRegistersRef }
                     *     
                     */
                    public void setEPFailureNew(ZfcsOrganizationControlRegistersRef value) {
                        this.epFailureNew = value;
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
     *         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType" minOccurs="0"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
     *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
     *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResult.resultType" minOccurs="0"/>
     *         &lt;element name="complaintResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "checkResultNumber",
        "regNumber",
        "docNumber",
        "versionNumber",
        "createDate",
        "publishDate",
        "owner",
        "result",
        "complaintResult"
    })
    public static class CommonInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String checkResultNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String regNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String docNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Integer versionNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOrganizationRef owner;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "string")
        protected ZfcsCheckResultResultType result;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String complaintResult;

        /**
         * Gets the value of the checkResultNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckResultNumber() {
            return checkResultNumber;
        }

        /**
         * Sets the value of the checkResultNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckResultNumber(String value) {
            this.checkResultNumber = value;
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
         * Gets the value of the createDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDate() {
            return createDate;
        }

        /**
         * Sets the value of the createDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDate(XMLGregorianCalendar value) {
            this.createDate = value;
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
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOwner(ZfcsOrganizationRef value) {
            this.owner = value;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultResultType }
         *     
         */
        public ZfcsCheckResultResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultResultType }
         *     
         */
        public void setResult(ZfcsCheckResultResultType value) {
            this.result = value;
        }

        /**
         * Gets the value of the complaintResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComplaintResult() {
            return complaintResult;
        }

        /**
         * Sets the value of the complaintResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComplaintResult(String value) {
            this.complaintResult = value;
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
     *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="checkSubjects" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="subjectComplaint">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="subjectComplaintGroup">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                               &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="checkedObject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
     *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
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
        "complaintNumber",
        "regNumber",
        "publishDate",
        "checkSubjects",
        "checkedObject",
        "decision",
        "prescription"
    })
    public static class Complaint {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String complaintNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String regNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsCheckResultType.Complaint.CheckSubjects> checkSubjects;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<ZfcsComplaintObjectType> checkedObject;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCheckResultDecisionType decision;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCheckResultPrescriptionType prescription;

        /**
         * Gets the value of the complaintNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComplaintNumber() {
            return complaintNumber;
        }

        /**
         * Sets the value of the complaintNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComplaintNumber(String value) {
            this.complaintNumber = value;
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
         * Gets the value of the checkSubjects property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkSubjects property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckSubjects().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCheckResultType.Complaint.CheckSubjects }
         * 
         * 
         */
        public List<ZfcsCheckResultType.Complaint.CheckSubjects> getCheckSubjects() {
            if (checkSubjects == null) {
                checkSubjects = new ArrayList<ZfcsCheckResultType.Complaint.CheckSubjects>();
            }
            return this.checkSubjects;
        }

        /**
         * Gets the value of the checkedObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkedObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckedObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsComplaintObjectType }
         * 
         * 
         */
        public List<ZfcsComplaintObjectType> getCheckedObject() {
            if (checkedObject == null) {
                checkedObject = new ArrayList<ZfcsComplaintObjectType>();
            }
            return this.checkedObject;
        }

        /**
         * Gets the value of the decision property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultDecisionType }
         *     
         */
        public ZfcsCheckResultDecisionType getDecision() {
            return decision;
        }

        /**
         * Sets the value of the decision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultDecisionType }
         *     
         */
        public void setDecision(ZfcsCheckResultDecisionType value) {
            this.decision = value;
        }

        /**
         * Gets the value of the prescription property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultPrescriptionType }
         *     
         */
        public ZfcsCheckResultPrescriptionType getPrescription() {
            return prescription;
        }

        /**
         * Sets the value of the prescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultPrescriptionType }
         *     
         */
        public void setPrescription(ZfcsCheckResultPrescriptionType value) {
            this.prescription = value;
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
         *       &lt;choice>
         *         &lt;element name="subjectComplaint">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="subjectComplaintGroup">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *                     &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
         *                   &lt;/choice>
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
        @XmlType(name = "", propOrder = {
            "subjectComplaint",
            "subjectComplaintGroup"
        })
        public static class CheckSubjects {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaint subjectComplaint;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaintGroup subjectComplaintGroup;

            /**
             * Gets the value of the subjectComplaint property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaint }
             *     
             */
            public ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaint getSubjectComplaint() {
                return subjectComplaint;
            }

            /**
             * Sets the value of the subjectComplaint property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaint }
             *     
             */
            public void setSubjectComplaint(ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaint value) {
                this.subjectComplaint = value;
            }

            /**
             * Gets the value of the subjectComplaintGroup property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaintGroup }
             *     
             */
            public ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaintGroup getSubjectComplaintGroup() {
                return subjectComplaintGroup;
            }

            /**
             * Sets the value of the subjectComplaintGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaintGroup }
             *     
             */
            public void setSubjectComplaintGroup(ZfcsCheckResultType.Complaint.CheckSubjects.SubjectComplaintGroup value) {
                this.subjectComplaintGroup = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SubjectComplaint
                extends ZfcsComplaintSubjectType
            {


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
             *           &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
             *           &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
             *         &lt;/choice>
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
                "epFailure",
                "epFailureNew"
            })
            public static class SubjectComplaintGroup {

                @XmlElement(name = "EP_failure", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOrganizationRef epFailure;
                @XmlElement(name = "EP_failureNew", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOrganizationControlRegistersRef epFailureNew;

                /**
                 * Gets the value of the epFailure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsOrganizationRef }
                 *     
                 */
                public ZfcsOrganizationRef getEPFailure() {
                    return epFailure;
                }

                /**
                 * Sets the value of the epFailure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsOrganizationRef }
                 *     
                 */
                public void setEPFailure(ZfcsOrganizationRef value) {
                    this.epFailure = value;
                }

                /**
                 * Gets the value of the epFailureNew property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsOrganizationControlRegistersRef }
                 *     
                 */
                public ZfcsOrganizationControlRegistersRef getEPFailureNew() {
                    return epFailureNew;
                }

                /**
                 * Sets the value of the epFailureNew property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsOrganizationControlRegistersRef }
                 *     
                 */
                public void setEPFailureNew(ZfcsOrganizationControlRegistersRef value) {
                    this.epFailureNew = value;
                }

            }

        }

    }

}
