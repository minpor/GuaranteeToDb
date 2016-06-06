
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
 * Проект результата контроля
 * 
 * <p>Java class for zfcs_eventResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_eventResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="eventResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultNumberType" minOccurs="0"/>
 *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResult.resultType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="typeEvent">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="unplannedCheckComplaint">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType"/>
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
 *                                                   &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
 *                               &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                               &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
 *                               &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
 *                               &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
 *                               &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
 *                                         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;choice>
 *                                 &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
 *                                 &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                                 &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                               &lt;/choice>
 *                               &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="unplannedRevision">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
 *                               &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
 *                                         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;choice>
 *                                 &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
 *                                 &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                                 &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                               &lt;/choice>
 *                               &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="unplannedSurvey">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
 *                               &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
 *                               &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
 *                                 &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
 *                                 &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                                 &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                               &lt;/choice>
 *                               &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
 *                               &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
 *                               &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
 *                               &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
 *                               &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                               &lt;choice>
 *                                 &lt;sequence>
 *                                   &lt;sequence minOccurs="0">
 *                                     &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
 *                                     &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
 *                                   &lt;/sequence>
 *                                   &lt;sequence minOccurs="0">
 *                                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                                     &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
 *                                   &lt;/sequence>
 *                                 &lt;/sequence>
 *                                 &lt;sequence>
 *                                   &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                                 &lt;/sequence>
 *                               &lt;/choice>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="plannedRevision">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
 *                               &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
 *                               &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                               &lt;choice>
 *                                 &lt;sequence>
 *                                   &lt;sequence minOccurs="0">
 *                                     &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
 *                                     &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
 *                                   &lt;/sequence>
 *                                   &lt;sequence minOccurs="0">
 *                                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                                     &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
 *                                   &lt;/sequence>
 *                                 &lt;/sequence>
 *                                 &lt;sequence>
 *                                   &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                                 &lt;/sequence>
 *                               &lt;/choice>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="plannedSurvey">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
 *                               &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
 *                               &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
 *                               &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                               &lt;choice>
 *                                 &lt;sequence>
 *                                   &lt;sequence minOccurs="0">
 *                                     &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
 *                                     &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
 *                                   &lt;/sequence>
 *                                   &lt;sequence minOccurs="0">
 *                                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                                     &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
 *                                   &lt;/sequence>
 *                                 &lt;/sequence>
 *                                 &lt;sequence>
 *                                   &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
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
 *                     &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType"/>
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
 *                                         &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
 *                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
 *                     &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
@XmlType(name = "zfcs_eventResultType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "typeEvent",
    "complaint",
    "startDate",
    "endDate",
    "extPrintForm"
})
public class ZfcsEventResultType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsEventResultType.CommonInfo commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsEventResultType.TypeEvent typeEvent;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsEventResultType.Complaint complaint;
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
     *     {@link ZfcsEventResultType.CommonInfo }
     *     
     */
    public ZfcsEventResultType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEventResultType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsEventResultType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the typeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEventResultType.TypeEvent }
     *     
     */
    public ZfcsEventResultType.TypeEvent getTypeEvent() {
        return typeEvent;
    }

    /**
     * Sets the value of the typeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEventResultType.TypeEvent }
     *     
     */
    public void setTypeEvent(ZfcsEventResultType.TypeEvent value) {
        this.typeEvent = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEventResultType.Complaint }
     *     
     */
    public ZfcsEventResultType.Complaint getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEventResultType.Complaint }
     *     
     */
    public void setComplaint(ZfcsEventResultType.Complaint value) {
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
     *       &lt;sequence>
     *         &lt;element name="eventResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultNumberType" minOccurs="0"/>
     *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResult.resultType" minOccurs="0"/>
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
        "eventResultNumber",
        "versionNumber",
        "createDate",
        "publishDate",
        "owner",
        "result"
    })
    public static class CommonInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String eventResultNumber;
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
        protected ZfcsEventResultResultType result;

        /**
         * Gets the value of the eventResultNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventResultNumber() {
            return eventResultNumber;
        }

        /**
         * Sets the value of the eventResultNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventResultNumber(String value) {
            this.eventResultNumber = value;
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
         *     {@link ZfcsEventResultResultType }
         *     
         */
        public ZfcsEventResultResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultResultType }
         *     
         */
        public void setResult(ZfcsEventResultResultType value) {
            this.result = value;
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
     *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType"/>
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
     *                             &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
     *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
        "publishDate",
        "checkSubjects",
        "checkedObject",
        "decision",
        "prescription"
    })
    public static class Complaint {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String complaintNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsEventResultType.Complaint.CheckSubjects> checkSubjects;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<ZfcsComplaintObjectType> checkedObject;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsEventResultDecisionType decision;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsEventResultPrescriptionType prescription;

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
         * {@link ZfcsEventResultType.Complaint.CheckSubjects }
         * 
         * 
         */
        public List<ZfcsEventResultType.Complaint.CheckSubjects> getCheckSubjects() {
            if (checkSubjects == null) {
                checkSubjects = new ArrayList<ZfcsEventResultType.Complaint.CheckSubjects>();
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
         *     {@link ZfcsEventResultDecisionType }
         *     
         */
        public ZfcsEventResultDecisionType getDecision() {
            return decision;
        }

        /**
         * Sets the value of the decision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultDecisionType }
         *     
         */
        public void setDecision(ZfcsEventResultDecisionType value) {
            this.decision = value;
        }

        /**
         * Gets the value of the prescription property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsEventResultPrescriptionType }
         *     
         */
        public ZfcsEventResultPrescriptionType getPrescription() {
            return prescription;
        }

        /**
         * Sets the value of the prescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultPrescriptionType }
         *     
         */
        public void setPrescription(ZfcsEventResultPrescriptionType value) {
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
         *                   &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
            protected ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaint subjectComplaint;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaintGroup subjectComplaintGroup;

            /**
             * Gets the value of the subjectComplaint property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaint }
             *     
             */
            public ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaint getSubjectComplaint() {
                return subjectComplaint;
            }

            /**
             * Sets the value of the subjectComplaint property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaint }
             *     
             */
            public void setSubjectComplaint(ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaint value) {
                this.subjectComplaint = value;
            }

            /**
             * Gets the value of the subjectComplaintGroup property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaintGroup }
             *     
             */
            public ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaintGroup getSubjectComplaintGroup() {
                return subjectComplaintGroup;
            }

            /**
             * Sets the value of the subjectComplaintGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaintGroup }
             *     
             */
            public void setSubjectComplaintGroup(ZfcsEventResultType.Complaint.CheckSubjects.SubjectComplaintGroup value) {
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
             *         &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
                "epFailure"
            })
            public static class SubjectComplaintGroup {

                @XmlElement(name = "EP_failure", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsOrganizationRef epFailure;

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
     *       &lt;choice>
     *         &lt;element name="unplannedCheckComplaint">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType"/>
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
     *                                       &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
     *                   &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                   &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
     *                   &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
     *                   &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
     *                   &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
     *                             &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
     *                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                     &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                   &lt;/choice>
     *                   &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="unplannedRevision">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
     *                   &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
     *                             &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
     *                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                     &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                   &lt;/choice>
     *                   &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="unplannedSurvey">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
     *                   &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
     *                   &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
     *                     &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
     *                     &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                     &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                   &lt;/choice>
     *                   &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
     *                   &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
     *                   &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
     *                   &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
     *                   &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;choice>
     *                     &lt;sequence>
     *                       &lt;sequence minOccurs="0">
     *                         &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
     *                         &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
     *                       &lt;/sequence>
     *                       &lt;sequence minOccurs="0">
     *                         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                         &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
     *                       &lt;/sequence>
     *                     &lt;/sequence>
     *                     &lt;sequence>
     *                       &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                     &lt;/sequence>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="plannedRevision">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
     *                   &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
     *                   &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;choice>
     *                     &lt;sequence>
     *                       &lt;sequence minOccurs="0">
     *                         &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
     *                         &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
     *                       &lt;/sequence>
     *                       &lt;sequence minOccurs="0">
     *                         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                         &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
     *                       &lt;/sequence>
     *                     &lt;/sequence>
     *                     &lt;sequence>
     *                       &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                     &lt;/sequence>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="plannedSurvey">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
     *                   &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
     *                   &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
     *                   &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;choice>
     *                     &lt;sequence>
     *                       &lt;sequence minOccurs="0">
     *                         &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
     *                         &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
     *                       &lt;/sequence>
     *                       &lt;sequence minOccurs="0">
     *                         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
     *                         &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
     *                       &lt;/sequence>
     *                     &lt;/sequence>
     *                     &lt;sequence>
     *                       &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
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
        "unplannedRevision",
        "unplannedSurvey",
        "plannedCheck",
        "plannedRevision",
        "plannedSurvey"
    })
    public static class TypeEvent {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint unplannedCheckComplaint;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsEventResultType.TypeEvent.UnplannedCheck unplannedCheck;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsEventResultType.TypeEvent.UnplannedRevision unplannedRevision;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsEventResultType.TypeEvent.UnplannedSurvey unplannedSurvey;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsEventResultType.TypeEvent.PlannedCheck plannedCheck;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsEventResultType.TypeEvent.PlannedRevision plannedRevision;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsEventResultType.TypeEvent.PlannedSurvey plannedSurvey;

        /**
         * Gets the value of the unplannedCheckComplaint property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint }
         *     
         */
        public ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint getUnplannedCheckComplaint() {
            return unplannedCheckComplaint;
        }

        /**
         * Sets the value of the unplannedCheckComplaint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint }
         *     
         */
        public void setUnplannedCheckComplaint(ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint value) {
            this.unplannedCheckComplaint = value;
        }

        /**
         * Gets the value of the unplannedCheck property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsEventResultType.TypeEvent.UnplannedCheck }
         *     
         */
        public ZfcsEventResultType.TypeEvent.UnplannedCheck getUnplannedCheck() {
            return unplannedCheck;
        }

        /**
         * Sets the value of the unplannedCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultType.TypeEvent.UnplannedCheck }
         *     
         */
        public void setUnplannedCheck(ZfcsEventResultType.TypeEvent.UnplannedCheck value) {
            this.unplannedCheck = value;
        }

        /**
         * Gets the value of the unplannedRevision property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsEventResultType.TypeEvent.UnplannedRevision }
         *     
         */
        public ZfcsEventResultType.TypeEvent.UnplannedRevision getUnplannedRevision() {
            return unplannedRevision;
        }

        /**
         * Sets the value of the unplannedRevision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultType.TypeEvent.UnplannedRevision }
         *     
         */
        public void setUnplannedRevision(ZfcsEventResultType.TypeEvent.UnplannedRevision value) {
            this.unplannedRevision = value;
        }

        /**
         * Gets the value of the unplannedSurvey property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsEventResultType.TypeEvent.UnplannedSurvey }
         *     
         */
        public ZfcsEventResultType.TypeEvent.UnplannedSurvey getUnplannedSurvey() {
            return unplannedSurvey;
        }

        /**
         * Sets the value of the unplannedSurvey property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultType.TypeEvent.UnplannedSurvey }
         *     
         */
        public void setUnplannedSurvey(ZfcsEventResultType.TypeEvent.UnplannedSurvey value) {
            this.unplannedSurvey = value;
        }

        /**
         * Gets the value of the plannedCheck property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsEventResultType.TypeEvent.PlannedCheck }
         *     
         */
        public ZfcsEventResultType.TypeEvent.PlannedCheck getPlannedCheck() {
            return plannedCheck;
        }

        /**
         * Sets the value of the plannedCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultType.TypeEvent.PlannedCheck }
         *     
         */
        public void setPlannedCheck(ZfcsEventResultType.TypeEvent.PlannedCheck value) {
            this.plannedCheck = value;
        }

        /**
         * Gets the value of the plannedRevision property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsEventResultType.TypeEvent.PlannedRevision }
         *     
         */
        public ZfcsEventResultType.TypeEvent.PlannedRevision getPlannedRevision() {
            return plannedRevision;
        }

        /**
         * Sets the value of the plannedRevision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultType.TypeEvent.PlannedRevision }
         *     
         */
        public void setPlannedRevision(ZfcsEventResultType.TypeEvent.PlannedRevision value) {
            this.plannedRevision = value;
        }

        /**
         * Gets the value of the plannedSurvey property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsEventResultType.TypeEvent.PlannedSurvey }
         *     
         */
        public ZfcsEventResultType.TypeEvent.PlannedSurvey getPlannedSurvey() {
            return plannedSurvey;
        }

        /**
         * Sets the value of the plannedSurvey property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsEventResultType.TypeEvent.PlannedSurvey }
         *     
         */
        public void setPlannedSurvey(ZfcsEventResultType.TypeEvent.PlannedSurvey value) {
            this.plannedSurvey = value;
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
         *         &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
         *         &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
         *         &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
         *         &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;choice>
         *           &lt;sequence>
         *             &lt;sequence minOccurs="0">
         *               &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
         *               &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
         *             &lt;/sequence>
         *             &lt;sequence minOccurs="0">
         *               &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *               &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
         *             &lt;/sequence>
         *           &lt;/sequence>
         *           &lt;sequence>
         *             &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
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
            "eventNumber",
            "inspectionType",
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

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String eventNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsInspectionTypeType inspectionType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventSubjectType checkSubject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventObjectType> orders;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String objectOtherInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultActType act;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType actPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType decisionPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType conclusion;

            /**
             * Gets the value of the eventNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventNumber() {
                return eventNumber;
            }

            /**
             * Sets the value of the eventNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventNumber(String value) {
                this.eventNumber = value;
            }

            /**
             * Gets the value of the inspectionType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsInspectionTypeType }
             *     
             */
            public ZfcsInspectionTypeType getInspectionType() {
                return inspectionType;
            }

            /**
             * Sets the value of the inspectionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsInspectionTypeType }
             *     
             */
            public void setInspectionType(ZfcsInspectionTypeType value) {
                this.inspectionType = value;
            }

            /**
             * Gets the value of the checkSubject property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventSubjectType }
             *     
             */
            public ZfcsEventSubjectType getCheckSubject() {
                return checkSubject;
            }

            /**
             * Sets the value of the checkSubject property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventSubjectType }
             *     
             */
            public void setCheckSubject(ZfcsEventSubjectType value) {
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
             * {@link ZfcsEventObjectType }
             * 
             * 
             */
            public List<ZfcsEventObjectType> getOrders() {
                if (orders == null) {
                    orders = new ArrayList<ZfcsEventObjectType>();
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
             *     {@link ZfcsEventResultActType }
             *     
             */
            public ZfcsEventResultActType getAct() {
                return act;
            }

            /**
             * Sets the value of the act property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultActType }
             *     
             */
            public void setAct(ZfcsEventResultActType value) {
                this.act = value;
            }

            /**
             * Gets the value of the actPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getActPrescription() {
                return actPrescription;
            }

            /**
             * Sets the value of the actPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setActPrescription(ZfcsEventResultPrescriptionType value) {
                this.actPrescription = value;
            }

            /**
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setDecision(ZfcsEventResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the decisionPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getDecisionPrescription() {
                return decisionPrescription;
            }

            /**
             * Sets the value of the decisionPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setDecisionPrescription(ZfcsEventResultPrescriptionType value) {
                this.decisionPrescription = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setConclusion(ZfcsEventResultDecisionType value) {
                this.conclusion = value;
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
         *         &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
         *         &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
         *         &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;choice>
         *           &lt;sequence>
         *             &lt;sequence minOccurs="0">
         *               &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
         *               &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
         *             &lt;/sequence>
         *             &lt;sequence minOccurs="0">
         *               &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *               &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
         *             &lt;/sequence>
         *           &lt;/sequence>
         *           &lt;sequence>
         *             &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
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
            "eventNumber",
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
        public static class PlannedRevision {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String eventNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventSubjectType checkSubject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventObjectType> orders;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String objectOtherInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultActType act;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType actPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType decisionPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType conclusion;

            /**
             * Gets the value of the eventNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventNumber() {
                return eventNumber;
            }

            /**
             * Sets the value of the eventNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventNumber(String value) {
                this.eventNumber = value;
            }

            /**
             * Gets the value of the checkSubject property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventSubjectType }
             *     
             */
            public ZfcsEventSubjectType getCheckSubject() {
                return checkSubject;
            }

            /**
             * Sets the value of the checkSubject property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventSubjectType }
             *     
             */
            public void setCheckSubject(ZfcsEventSubjectType value) {
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
             * {@link ZfcsEventObjectType }
             * 
             * 
             */
            public List<ZfcsEventObjectType> getOrders() {
                if (orders == null) {
                    orders = new ArrayList<ZfcsEventObjectType>();
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
             *     {@link ZfcsEventResultActType }
             *     
             */
            public ZfcsEventResultActType getAct() {
                return act;
            }

            /**
             * Sets the value of the act property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultActType }
             *     
             */
            public void setAct(ZfcsEventResultActType value) {
                this.act = value;
            }

            /**
             * Gets the value of the actPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getActPrescription() {
                return actPrescription;
            }

            /**
             * Sets the value of the actPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setActPrescription(ZfcsEventResultPrescriptionType value) {
                this.actPrescription = value;
            }

            /**
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setDecision(ZfcsEventResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the decisionPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getDecisionPrescription() {
                return decisionPrescription;
            }

            /**
             * Sets the value of the decisionPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setDecisionPrescription(ZfcsEventResultPrescriptionType value) {
                this.decisionPrescription = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setConclusion(ZfcsEventResultDecisionType value) {
                this.conclusion = value;
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
         *         &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType"/>
         *         &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
         *         &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" minOccurs="0"/>
         *         &lt;element name="orders" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventObjectType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;choice>
         *           &lt;sequence>
         *             &lt;sequence minOccurs="0">
         *               &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
         *               &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
         *             &lt;/sequence>
         *             &lt;sequence minOccurs="0">
         *               &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *               &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
         *             &lt;/sequence>
         *           &lt;/sequence>
         *           &lt;sequence>
         *             &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
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
            "eventNumber",
            "surveyType",
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
        public static class PlannedSurvey {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String eventNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected ZfcsSurveyType surveyType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventSubjectType checkSubject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventObjectType> orders;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String objectOtherInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultActType act;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType actPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType decisionPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType conclusion;

            /**
             * Gets the value of the eventNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventNumber() {
                return eventNumber;
            }

            /**
             * Sets the value of the eventNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventNumber(String value) {
                this.eventNumber = value;
            }

            /**
             * Gets the value of the surveyType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSurveyType }
             *     
             */
            public ZfcsSurveyType getSurveyType() {
                return surveyType;
            }

            /**
             * Sets the value of the surveyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSurveyType }
             *     
             */
            public void setSurveyType(ZfcsSurveyType value) {
                this.surveyType = value;
            }

            /**
             * Gets the value of the checkSubject property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventSubjectType }
             *     
             */
            public ZfcsEventSubjectType getCheckSubject() {
                return checkSubject;
            }

            /**
             * Sets the value of the checkSubject property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventSubjectType }
             *     
             */
            public void setCheckSubject(ZfcsEventSubjectType value) {
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
             * {@link ZfcsEventObjectType }
             * 
             * 
             */
            public List<ZfcsEventObjectType> getOrders() {
                if (orders == null) {
                    orders = new ArrayList<ZfcsEventObjectType>();
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
             *     {@link ZfcsEventResultActType }
             *     
             */
            public ZfcsEventResultActType getAct() {
                return act;
            }

            /**
             * Sets the value of the act property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultActType }
             *     
             */
            public void setAct(ZfcsEventResultActType value) {
                this.act = value;
            }

            /**
             * Gets the value of the actPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getActPrescription() {
                return actPrescription;
            }

            /**
             * Sets the value of the actPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setActPrescription(ZfcsEventResultPrescriptionType value) {
                this.actPrescription = value;
            }

            /**
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setDecision(ZfcsEventResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the decisionPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getDecisionPrescription() {
                return decisionPrescription;
            }

            /**
             * Sets the value of the decisionPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setDecisionPrescription(ZfcsEventResultPrescriptionType value) {
                this.decisionPrescription = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setConclusion(ZfcsEventResultDecisionType value) {
                this.conclusion = value;
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
         *         &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
         *         &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
         *         &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
         *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
         *           &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *           &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *         &lt;/choice>
         *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
            "unplannedEventNumber",
            "inspectionType",
            "eventSubjects",
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

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String unplannedEventNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsInspectionTypeType inspectionType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventSubjectType> eventSubjects;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsAttachmentListType attachments;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventResultType.TypeEvent.UnplannedCheck.Orders> orders;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String objectOtherInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultActType act;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType conclusion;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType prescription;

            /**
             * Gets the value of the unplannedEventNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnplannedEventNumber() {
                return unplannedEventNumber;
            }

            /**
             * Sets the value of the unplannedEventNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnplannedEventNumber(String value) {
                this.unplannedEventNumber = value;
            }

            /**
             * Gets the value of the inspectionType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsInspectionTypeType }
             *     
             */
            public ZfcsInspectionTypeType getInspectionType() {
                return inspectionType;
            }

            /**
             * Sets the value of the inspectionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsInspectionTypeType }
             *     
             */
            public void setInspectionType(ZfcsInspectionTypeType value) {
                this.inspectionType = value;
            }

            /**
             * Gets the value of the eventSubjects property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the eventSubjects property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEventSubjects().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsEventSubjectType }
             * 
             * 
             */
            public List<ZfcsEventSubjectType> getEventSubjects() {
                if (eventSubjects == null) {
                    eventSubjects = new ArrayList<ZfcsEventSubjectType>();
                }
                return this.eventSubjects;
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
             * {@link ZfcsEventResultType.TypeEvent.UnplannedCheck.Orders }
             * 
             * 
             */
            public List<ZfcsEventResultType.TypeEvent.UnplannedCheck.Orders> getOrders() {
                if (orders == null) {
                    orders = new ArrayList<ZfcsEventResultType.TypeEvent.UnplannedCheck.Orders>();
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
             *     {@link ZfcsEventResultActType }
             *     
             */
            public ZfcsEventResultActType getAct() {
                return act;
            }

            /**
             * Sets the value of the act property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultActType }
             *     
             */
            public void setAct(ZfcsEventResultActType value) {
                this.act = value;
            }

            /**
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setDecision(ZfcsEventResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setConclusion(ZfcsEventResultDecisionType value) {
                this.conclusion = value;
            }

            /**
             * Gets the value of the prescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getPrescription() {
                return prescription;
            }

            /**
             * Sets the value of the prescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setPrescription(ZfcsEventResultPrescriptionType value) {
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
         *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType"/>
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
         *                             &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
         *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
            "checkSubjects",
            "checkedObject",
            "info",
            "decision",
            "prescription"
        })
        public static class UnplannedCheckComplaint {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String complaintNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects> checkSubjects;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsComplaintObjectType> checkedObject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsEventResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType prescription;

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
             * {@link ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects }
             * 
             * 
             */
            public List<ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects> getCheckSubjects() {
                if (checkSubjects == null) {
                    checkSubjects = new ArrayList<ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects>();
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
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setDecision(ZfcsEventResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the prescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getPrescription() {
                return prescription;
            }

            /**
             * Sets the value of the prescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setPrescription(ZfcsEventResultPrescriptionType value) {
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
             *                   &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
                protected ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint subjectComplaint;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup subjectComplaintGroup;

                /**
                 * Gets the value of the subjectComplaint property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint }
                 *     
                 */
                public ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint getSubjectComplaint() {
                    return subjectComplaint;
                }

                /**
                 * Sets the value of the subjectComplaint property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint }
                 *     
                 */
                public void setSubjectComplaint(ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaint value) {
                    this.subjectComplaint = value;
                }

                /**
                 * Gets the value of the subjectComplaintGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup }
                 *     
                 */
                public ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup getSubjectComplaintGroup() {
                    return subjectComplaintGroup;
                }

                /**
                 * Sets the value of the subjectComplaintGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup }
                 *     
                 */
                public void setSubjectComplaintGroup(ZfcsEventResultType.TypeEvent.UnplannedCheckComplaint.CheckSubjects.SubjectComplaintGroup value) {
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
                 *         &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
                    "epFailure"
                })
                public static class SubjectComplaintGroup {

                    @XmlElement(name = "EP_failure", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ZfcsOrganizationRef epFailure;

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
         *         &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
         *         &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
         *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
         *           &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *           &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *         &lt;/choice>
         *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
            "unplannedEventNumber",
            "eventSubjects",
            "info",
            "attachments",
            "orders",
            "objectOtherInfo",
            "act",
            "decision",
            "conclusion",
            "prescription"
        })
        public static class UnplannedRevision {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String unplannedEventNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventSubjectType> eventSubjects;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsAttachmentListType attachments;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventResultType.TypeEvent.UnplannedRevision.Orders> orders;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String objectOtherInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultActType act;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType conclusion;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType prescription;

            /**
             * Gets the value of the unplannedEventNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnplannedEventNumber() {
                return unplannedEventNumber;
            }

            /**
             * Sets the value of the unplannedEventNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnplannedEventNumber(String value) {
                this.unplannedEventNumber = value;
            }

            /**
             * Gets the value of the eventSubjects property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the eventSubjects property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEventSubjects().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsEventSubjectType }
             * 
             * 
             */
            public List<ZfcsEventSubjectType> getEventSubjects() {
                if (eventSubjects == null) {
                    eventSubjects = new ArrayList<ZfcsEventSubjectType>();
                }
                return this.eventSubjects;
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
             * {@link ZfcsEventResultType.TypeEvent.UnplannedRevision.Orders }
             * 
             * 
             */
            public List<ZfcsEventResultType.TypeEvent.UnplannedRevision.Orders> getOrders() {
                if (orders == null) {
                    orders = new ArrayList<ZfcsEventResultType.TypeEvent.UnplannedRevision.Orders>();
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
             *     {@link ZfcsEventResultActType }
             *     
             */
            public ZfcsEventResultActType getAct() {
                return act;
            }

            /**
             * Sets the value of the act property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultActType }
             *     
             */
            public void setAct(ZfcsEventResultActType value) {
                this.act = value;
            }

            /**
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setDecision(ZfcsEventResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setConclusion(ZfcsEventResultDecisionType value) {
                this.conclusion = value;
            }

            /**
             * Gets the value of the prescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getPrescription() {
                return prescription;
            }

            /**
             * Sets the value of the prescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setPrescription(ZfcsEventResultPrescriptionType value) {
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
         *         &lt;element name="unplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventNumberType"/>
         *         &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
         *         &lt;element name="eventSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType" maxOccurs="unbounded" minOccurs="0"/>
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
         *           &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultActType"/>
         *           &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *           &lt;element name="conclusion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultDecisionType"/>
         *         &lt;/choice>
         *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultPrescriptionType" minOccurs="0"/>
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
            "unplannedEventNumber",
            "surveyType",
            "eventSubjects",
            "info",
            "attachments",
            "orders",
            "objectOtherInfo",
            "act",
            "decision",
            "conclusion",
            "prescription"
        })
        public static class UnplannedSurvey {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String unplannedEventNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected ZfcsSurveyType surveyType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventSubjectType> eventSubjects;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String info;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsAttachmentListType attachments;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsEventResultType.TypeEvent.UnplannedSurvey.Orders> orders;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String objectOtherInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultActType act;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType decision;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultDecisionType conclusion;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsEventResultPrescriptionType prescription;

            /**
             * Gets the value of the unplannedEventNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnplannedEventNumber() {
                return unplannedEventNumber;
            }

            /**
             * Sets the value of the unplannedEventNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnplannedEventNumber(String value) {
                this.unplannedEventNumber = value;
            }

            /**
             * Gets the value of the surveyType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSurveyType }
             *     
             */
            public ZfcsSurveyType getSurveyType() {
                return surveyType;
            }

            /**
             * Sets the value of the surveyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSurveyType }
             *     
             */
            public void setSurveyType(ZfcsSurveyType value) {
                this.surveyType = value;
            }

            /**
             * Gets the value of the eventSubjects property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the eventSubjects property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEventSubjects().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsEventSubjectType }
             * 
             * 
             */
            public List<ZfcsEventSubjectType> getEventSubjects() {
                if (eventSubjects == null) {
                    eventSubjects = new ArrayList<ZfcsEventSubjectType>();
                }
                return this.eventSubjects;
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
             * {@link ZfcsEventResultType.TypeEvent.UnplannedSurvey.Orders }
             * 
             * 
             */
            public List<ZfcsEventResultType.TypeEvent.UnplannedSurvey.Orders> getOrders() {
                if (orders == null) {
                    orders = new ArrayList<ZfcsEventResultType.TypeEvent.UnplannedSurvey.Orders>();
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
             *     {@link ZfcsEventResultActType }
             *     
             */
            public ZfcsEventResultActType getAct() {
                return act;
            }

            /**
             * Sets the value of the act property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultActType }
             *     
             */
            public void setAct(ZfcsEventResultActType value) {
                this.act = value;
            }

            /**
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setDecision(ZfcsEventResultDecisionType value) {
                this.decision = value;
            }

            /**
             * Gets the value of the conclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public ZfcsEventResultDecisionType getConclusion() {
                return conclusion;
            }

            /**
             * Sets the value of the conclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultDecisionType }
             *     
             */
            public void setConclusion(ZfcsEventResultDecisionType value) {
                this.conclusion = value;
            }

            /**
             * Gets the value of the prescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public ZfcsEventResultPrescriptionType getPrescription() {
                return prescription;
            }

            /**
             * Sets the value of the prescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventResultPrescriptionType }
             *     
             */
            public void setPrescription(ZfcsEventResultPrescriptionType value) {
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

    }

}
