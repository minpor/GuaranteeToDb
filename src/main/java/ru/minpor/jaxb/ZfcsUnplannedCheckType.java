
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
 * Информация по внеплановой проверке
 * 
 * <p>Java class for zfcs_unplannedCheckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_unplannedCheckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType"/>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
 *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
 *                   &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_orderDetailsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_periodType" minOccurs="0"/>
 *         &lt;element name="inspector" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="inspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="inspectionPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="checkedSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckSubjectPlanType" maxOccurs="unbounded"/>
 *         &lt;element name="base">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="violationInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="infoSource" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="infoReceivingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="prescriptionControl">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="prescriptionInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
 *                                       &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="decisionInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
 *                                       &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                       &lt;element name="desDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="desNumber">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="baseOther" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="checkedObject">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="checkedOrder" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="order">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
 *                                         &lt;element name="lots" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                                                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="purchase">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                                         &lt;element name="lots" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                                                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;/choice>
 *                             &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_unplannedCheckType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "period",
    "inspector",
    "inspectionDate",
    "inspectionPlace",
    "checkedSubject",
    "base",
    "checkedObject",
    "printForm",
    "extPrintForm",
    "attachments"
})
public class ZfcsUnplannedCheckType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsUnplannedCheckType.CommonInfo commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPeriodType period;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsOrganizationRef inspector;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inspectionDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String inspectionPlace;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsUnplannedCheckSubjectPlanType> checkedSubject;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsUnplannedCheckType.Base base;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsUnplannedCheckType.CheckedObject checkedObject;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsControlRegistersAttachmentListType attachments;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckType.CommonInfo }
     *     
     */
    public ZfcsUnplannedCheckType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsUnplannedCheckType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPeriodType }
     *     
     */
    public ZfcsPeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPeriodType }
     *     
     */
    public void setPeriod(ZfcsPeriodType value) {
        this.period = value;
    }

    /**
     * Gets the value of the inspector property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getInspector() {
        return inspector;
    }

    /**
     * Sets the value of the inspector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setInspector(ZfcsOrganizationRef value) {
        this.inspector = value;
    }

    /**
     * Gets the value of the inspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Sets the value of the inspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInspectionDate(XMLGregorianCalendar value) {
        this.inspectionDate = value;
    }

    /**
     * Gets the value of the inspectionPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionPlace() {
        return inspectionPlace;
    }

    /**
     * Sets the value of the inspectionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionPlace(String value) {
        this.inspectionPlace = value;
    }

    /**
     * Gets the value of the checkedSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsUnplannedCheckSubjectPlanType }
     * 
     * 
     */
    public List<ZfcsUnplannedCheckSubjectPlanType> getCheckedSubject() {
        if (checkedSubject == null) {
            checkedSubject = new ArrayList<ZfcsUnplannedCheckSubjectPlanType>();
        }
        return this.checkedSubject;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckType.Base }
     *     
     */
    public ZfcsUnplannedCheckType.Base getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckType.Base }
     *     
     */
    public void setBase(ZfcsUnplannedCheckType.Base value) {
        this.base = value;
    }

    /**
     * Gets the value of the checkedObject property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckType.CheckedObject }
     *     
     */
    public ZfcsUnplannedCheckType.CheckedObject getCheckedObject() {
        return checkedObject;
    }

    /**
     * Sets the value of the checkedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckType.CheckedObject }
     *     
     */
    public void setCheckedObject(ZfcsUnplannedCheckType.CheckedObject value) {
        this.checkedObject = value;
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
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public ZfcsControlRegistersAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsControlRegistersAttachmentListType value) {
        this.attachments = value;
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
     *         &lt;element name="violationInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="infoSource" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="infoReceivingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="prescriptionControl">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="prescriptionInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
     *                             &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="decisionInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
     *                             &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                             &lt;element name="desDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="desNumber">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
     *         &lt;element name="baseOther" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
        "violationInfo",
        "prescriptionControl",
        "baseOther"
    })
    public static class Base {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsUnplannedCheckType.Base.ViolationInfo violationInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsUnplannedCheckType.Base.PrescriptionControl prescriptionControl;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String baseOther;

        /**
         * Gets the value of the violationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedCheckType.Base.ViolationInfo }
         *     
         */
        public ZfcsUnplannedCheckType.Base.ViolationInfo getViolationInfo() {
            return violationInfo;
        }

        /**
         * Sets the value of the violationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedCheckType.Base.ViolationInfo }
         *     
         */
        public void setViolationInfo(ZfcsUnplannedCheckType.Base.ViolationInfo value) {
            this.violationInfo = value;
        }

        /**
         * Gets the value of the prescriptionControl property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedCheckType.Base.PrescriptionControl }
         *     
         */
        public ZfcsUnplannedCheckType.Base.PrescriptionControl getPrescriptionControl() {
            return prescriptionControl;
        }

        /**
         * Sets the value of the prescriptionControl property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedCheckType.Base.PrescriptionControl }
         *     
         */
        public void setPrescriptionControl(ZfcsUnplannedCheckType.Base.PrescriptionControl value) {
            this.prescriptionControl = value;
        }

        /**
         * Gets the value of the baseOther property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaseOther() {
            return baseOther;
        }

        /**
         * Sets the value of the baseOther property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBaseOther(String value) {
            this.baseOther = value;
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
         *         &lt;element name="prescriptionInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
         *                   &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="decisionInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
         *                   &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *                   &lt;element name="desDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="desNumber">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
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
        @XmlType(name = "", propOrder = {
            "prescriptionInfo",
            "decisionInfo"
        })
        public static class PrescriptionControl {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsUnplannedCheckType.Base.PrescriptionControl.PrescriptionInfo prescriptionInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsUnplannedCheckType.Base.PrescriptionControl.DecisionInfo decisionInfo;

            /**
             * Gets the value of the prescriptionInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsUnplannedCheckType.Base.PrescriptionControl.PrescriptionInfo }
             *     
             */
            public ZfcsUnplannedCheckType.Base.PrescriptionControl.PrescriptionInfo getPrescriptionInfo() {
                return prescriptionInfo;
            }

            /**
             * Sets the value of the prescriptionInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnplannedCheckType.Base.PrescriptionControl.PrescriptionInfo }
             *     
             */
            public void setPrescriptionInfo(ZfcsUnplannedCheckType.Base.PrescriptionControl.PrescriptionInfo value) {
                this.prescriptionInfo = value;
            }

            /**
             * Gets the value of the decisionInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsUnplannedCheckType.Base.PrescriptionControl.DecisionInfo }
             *     
             */
            public ZfcsUnplannedCheckType.Base.PrescriptionControl.DecisionInfo getDecisionInfo() {
                return decisionInfo;
            }

            /**
             * Sets the value of the decisionInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnplannedCheckType.Base.PrescriptionControl.DecisionInfo }
             *     
             */
            public void setDecisionInfo(ZfcsUnplannedCheckType.Base.PrescriptionControl.DecisionInfo value) {
                this.decisionInfo = value;
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
             *         &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
             *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
             *         &lt;element name="desDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="desNumber">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
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
                "authorityType",
                "authorityName",
                "desDate",
                "desNumber"
            })
            public static class DecisionInfo {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "string")
                protected ZfcsModificationAuthorityType authorityType;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String authorityName;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar desDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String desNumber;

                /**
                 * Gets the value of the authorityType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsModificationAuthorityType }
                 *     
                 */
                public ZfcsModificationAuthorityType getAuthorityType() {
                    return authorityType;
                }

                /**
                 * Sets the value of the authorityType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsModificationAuthorityType }
                 *     
                 */
                public void setAuthorityType(ZfcsModificationAuthorityType value) {
                    this.authorityType = value;
                }

                /**
                 * Gets the value of the authorityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorityName() {
                    return authorityName;
                }

                /**
                 * Sets the value of the authorityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorityName(String value) {
                    this.authorityName = value;
                }

                /**
                 * Gets the value of the desDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDesDate() {
                    return desDate;
                }

                /**
                 * Sets the value of the desDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDesDate(XMLGregorianCalendar value) {
                    this.desDate = value;
                }

                /**
                 * Gets the value of the desNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDesNumber() {
                    return desNumber;
                }

                /**
                 * Sets the value of the desNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDesNumber(String value) {
                    this.desNumber = value;
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
             *         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
             *         &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType"/>
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
                "prescriptionNumber"
            })
            public static class PrescriptionInfo {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String checkResultNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String prescriptionNumber;

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
                 * Gets the value of the prescriptionNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrescriptionNumber() {
                    return prescriptionNumber;
                }

                /**
                 * Sets the value of the prescriptionNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrescriptionNumber(String value) {
                    this.prescriptionNumber = value;
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
         *         &lt;element name="infoSource" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="infoReceivingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "infoSource",
            "infoReceivingDate"
        })
        public static class ViolationInfo {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String infoSource;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar infoReceivingDate;

            /**
             * Gets the value of the infoSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoSource() {
                return infoSource;
            }

            /**
             * Sets the value of the infoSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoSource(String value) {
                this.infoSource = value;
            }

            /**
             * Gets the value of the infoReceivingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getInfoReceivingDate() {
                return infoReceivingDate;
            }

            /**
             * Sets the value of the infoReceivingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setInfoReceivingDate(XMLGregorianCalendar value) {
                this.infoReceivingDate = value;
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
     *         &lt;element name="checkedOrder" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="order">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
     *                               &lt;element name="lots" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *                                         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="purchase">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                               &lt;element name="lots" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *                                         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;/choice>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
        "checkedOrder",
        "objectOtherInfo",
        "info"
    })
    public static class CheckedObject {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<ZfcsUnplannedCheckType.CheckedObject.CheckedOrder> checkedOrder;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String objectOtherInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String info;

        /**
         * Gets the value of the checkedOrder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkedOrder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckedOrder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder }
         * 
         * 
         */
        public List<ZfcsUnplannedCheckType.CheckedObject.CheckedOrder> getCheckedOrder() {
            if (checkedOrder == null) {
                checkedOrder = new ArrayList<ZfcsUnplannedCheckType.CheckedObject.CheckedOrder>();
            }
            return this.checkedOrder;
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
         *           &lt;element name="order">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
         *                     &lt;element name="lots" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
         *                               &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="purchase">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
         *                     &lt;element name="lots" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
         *                               &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;/choice>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
            "order",
            "purchase",
            "singleCustomer",
            "info"
        })
        public static class CheckedOrder {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order order;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase purchase;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean singleCustomer;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String info;

            /**
             * Gets the value of the order property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order }
             *     
             */
            public ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order getOrder() {
                return order;
            }

            /**
             * Sets the value of the order property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order }
             *     
             */
            public void setOrder(ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order value) {
                this.order = value;
            }

            /**
             * Gets the value of the purchase property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase }
             *     
             */
            public ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase getPurchase() {
                return purchase;
            }

            /**
             * Sets the value of the purchase property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase }
             *     
             */
            public void setPurchase(ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase value) {
                this.purchase = value;
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
             *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
             *         &lt;element name="lots" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                "notificationNumber",
                "lots"
            })
            public static class Order {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String notificationNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order.Lots lots;

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
                 * Gets the value of the lots property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order.Lots }
                 *     
                 */
                public ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order.Lots getLots() {
                    return lots;
                }

                /**
                 * Sets the value of the lots property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order.Lots }
                 *     
                 */
                public void setLots(ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Order.Lots value) {
                    this.lots = value;
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
                 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                    "lotNumber",
                    "info"
                })
                public static class Lots {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", type = Integer.class)
                    protected List<Integer> lotNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String info;

                    /**
                     * Gets the value of the lotNumber property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lotNumber property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLotNumber().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    public List<Integer> getLotNumber() {
                        if (lotNumber == null) {
                            lotNumber = new ArrayList<Integer>();
                        }
                        return this.lotNumber;
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
             *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
             *         &lt;element name="lots" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
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
                "lots",
                "purchaseCode"
            })
            public static class Purchase {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String purchaseNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase.Lots lots;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String purchaseCode;

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
                 * Gets the value of the lots property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase.Lots }
                 *     
                 */
                public ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase.Lots getLots() {
                    return lots;
                }

                /**
                 * Sets the value of the lots property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase.Lots }
                 *     
                 */
                public void setLots(ZfcsUnplannedCheckType.CheckedObject.CheckedOrder.Purchase.Lots value) {
                    this.lots = value;
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                    "lotNumber",
                    "info"
                })
                public static class Lots {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", type = Integer.class)
                    protected List<Integer> lotNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String info;

                    /**
                     * Gets the value of the lotNumber property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lotNumber property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLotNumber().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    public List<Integer> getLotNumber() {
                        if (lotNumber == null) {
                            lotNumber = new ArrayList<Integer>();
                        }
                        return this.lotNumber;
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
     *         &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
     *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
     *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
     *         &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_orderDetailsType" minOccurs="0"/>
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
        "docNumber",
        "versionNumber",
        "createDate",
        "publishDate",
        "notice",
        "order"
    })
    public static class CommonInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String checkNumber;
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
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsNoticeDetailsType notice;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrderDetailsType order;

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
         * Gets the value of the notice property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNoticeDetailsType }
         *     
         */
        public ZfcsNoticeDetailsType getNotice() {
            return notice;
        }

        /**
         * Sets the value of the notice property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNoticeDetailsType }
         *     
         */
        public void setNotice(ZfcsNoticeDetailsType value) {
            this.notice = value;
        }

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrderDetailsType }
         *     
         */
        public ZfcsOrderDetailsType getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrderDetailsType }
         *     
         */
        public void setOrder(ZfcsOrderDetailsType value) {
            this.order = value;
        }

    }

}
