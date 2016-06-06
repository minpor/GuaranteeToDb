
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *           &lt;element name="bankGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeType"/>
 *           &lt;element name="bankGuaranteeInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInvalidType"/>
 *           &lt;element name="bankGuaranteeRefusal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRefusalType"/>
 *           &lt;element name="bankGuaranteeRefusalInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRefusalInvalidType"/>
 *           &lt;element name="bankGuaranteeTermination" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeTerminationType"/>
 *           &lt;element name="bankGuaranteeTerminationInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeTerminationInvalidType"/>
 *           &lt;element name="bankGuaranteeReturn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeReturnType"/>
 *           &lt;element name="bankGuaranteeReturnInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeReturnInvalidType"/>
 *           &lt;element name="contract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015Type" maxOccurs="unbounded"/>
 *           &lt;element name="contractCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractCancel2015Type" maxOccurs="unbounded"/>
 *           &lt;element name="contractProcedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractProcedure2015Type" maxOccurs="unbounded"/>
 *           &lt;element name="contractProcedureCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractProcedureCancel2015Type" maxOccurs="unbounded"/>
 *           &lt;element name="fcsClarification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_clarificationType"/>
 *           &lt;element name="fcsContractSign" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractSignType"/>
 *           &lt;element name="fcsNotificationEF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationEFType"/>
 *           &lt;element name="fcs_notificationEFDateChange" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationEFDateChangeType"/>
 *           &lt;element name="fcsNotificationEP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationEPType"/>
 *           &lt;element name="fcsNotificationISM" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationISMType"/>
 *           &lt;element name="fcsNotificationISO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationISOType"/>
 *           &lt;element name="fcsNotificationOK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationOKType"/>
 *           &lt;element name="fcsNotificationOKD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationOKDType"/>
 *           &lt;element name="fcsNotificationOKOU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationOKOUType"/>
 *           &lt;element name="fcsNotificationPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationPOType"/>
 *           &lt;element name="fcsNotificationZakA" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationZakAType"/>
 *           &lt;element name="fcsNotificationZakKD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationZakKDType"/>
 *           &lt;element name="fcsNotificationZakKOU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationZakKOUType"/>
 *           &lt;element name="fcsNotificationZakK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationZakKType"/>
 *           &lt;element name="fcsNotificationZK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationZKType"/>
 *           &lt;element name="fcsNotificationZP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationZPType"/>
 *           &lt;element name="fcsNotificationLotChange" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationLotChangeType"/>
 *           &lt;element name="fcsNotificationCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationCancelType"/>
 *           &lt;element name="fcsNotificationCancelFailure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationCancelFailureType"/>
 *           &lt;element name="fcsNotificationLotCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationLotCancelType"/>
 *           &lt;element name="fcsNotificationOrgChange" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationOrgChangeType"/>
 *           &lt;element name="fcsPurchaseDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseDocumentType"/>
 *           &lt;element name="fcsPlacementResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placementResultType"/>
 *           &lt;element name="fcsPurchaseDocumentCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseDocumentCancelType"/>
 *           &lt;element name="fcsPurchaseProlongationOK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProlongationOKType"/>
 *           &lt;element name="fcsPurchaseProlongationZK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProlongationZKType"/>
 *           &lt;element name="fcsProtocolOK1" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOK1Type"/>
 *           &lt;element name="fcsProtocolOK2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOK2Type"/>
 *           &lt;element name="fcsProtocolOKSingleApp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKSingleAppType"/>
 *           &lt;element name="fcsProtocolOKD1" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKD1Type"/>
 *           &lt;element name="fcsProtocolOKD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKD2Type"/>
 *           &lt;element name="fcsProtocolOKD3" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKD3Type"/>
 *           &lt;element name="fcsProtocolOKD4" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKD4Type"/>
 *           &lt;element name="fcsProtocolOKD5" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKD5Type"/>
 *           &lt;element name="fcsProtocolOKDSingleApp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKDSingleAppType"/>
 *           &lt;element name="fcsProtocolOKOU1" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKOU1Type"/>
 *           &lt;element name="fcsProtocolOKOU2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKOU2Type"/>
 *           &lt;element name="fcsProtocolOKOU3" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKOU3Type"/>
 *           &lt;element name="fcsProtocolOKOUSingleApp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOKOUSingleAppType"/>
 *           &lt;element name="fcsProtocolPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolPOType"/>
 *           &lt;element name="fcsProtocolZKAfterProlong" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolZKAfterProlongType"/>
 *           &lt;element name="fcsProtocolZK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolZKType"/>
 *           &lt;element name="fcsProtocolZKBI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolZKBIType"/>
 *           &lt;element name="fcsProtocolZPExtract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolZPExtractType"/>
 *           &lt;element name="fcsProtocolZPFinal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolZPFinalType"/>
 *           &lt;element name="fcsProtocolZP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolZPType"/>
 *           &lt;element name="fcsProtocolEvasion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolEvasionType"/>
 *           &lt;element name="fcsProtocolDeviation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolDeviationType"/>
 *           &lt;element name="fcsProtocolEF1" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolEF1Type"/>
 *           &lt;element name="fcsProtocolEF2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolEF2Type"/>
 *           &lt;element name="fcsProtocolEF3" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolEF3Type"/>
 *           &lt;element name="fcsProtocolEFInvalidation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolEFInvalidationType"/>
 *           &lt;element name="fcsProtocolEFSingleApp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolEFSingleAppType"/>
 *           &lt;element name="fcsProtocolEFSinglePart" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolEFSinglePartType"/>
 *           &lt;element name="fcsProtocolCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolCancelType"/>
 *           &lt;element name="fcsAddInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_addInfoType"/>
 *           &lt;element name="fcsAddInfoInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_addInfoInvalidType"/>
 *           &lt;element name="fcsCustomerReportContractExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportContractExecutionType"/>
 *           &lt;element name="fcsCustomerReportContractExecutionInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportContractExecutionInvalidType"/>
 *           &lt;element name="fcsCustomerReportSmallScaleBusiness" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSmallScaleBusinessType"/>
 *           &lt;element name="fcsCustomerReportSmallScaleBusinessInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSmallScaleBusinessInvalidType"/>
 *           &lt;element name="fcsCustomerReportSingleContractor" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSingleContractorType"/>
 *           &lt;element name="fcsCustomerReportSingleContractorInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSingleContractorInvalidType"/>
 *           &lt;element name="fcsCustomerReportBigProjectMonitoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportBigProjectMonitoringType"/>
 *           &lt;element name="fcsCustomerReportBigProjectMonitoringInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportBigProjectMonitoringInvalidType"/>
 *           &lt;element name="fcsStandardContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractType"/>
 *           &lt;element name="fcsStandardContractInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractInvalidType"/>
 *           &lt;element name="fcsPublicDiscussionLargePurchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionLargePurchaseType"/>
 *           &lt;element name="fcsPublicDiscussionComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionCommentType"/>
 *           &lt;element name="fcsPublicDiscussionForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFormType"/>
 *           &lt;element name="fcsPublicDiscussionAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionAnswerType"/>
 *           &lt;element name="fcsPublicDiscussionProtocol" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionProtocolType"/>
 *           &lt;element name="fcsRegulationRules" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesType"/>
 *           &lt;element name="fcsRegulationRulesInvalid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesInvalidType"/>
 *           &lt;element name="fcsRequestForQuotation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requestForQuotationType"/>
 *           &lt;element name="fcsRequestForQuotationCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requestForQuotationCancelType"/>
 *           &lt;element name="fcsAuditResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_auditResultType"/>
 *           &lt;element name="publicDiscussionResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionResultType"/>
 *           &lt;element name="sketchPlan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_sketchPlanType"/>
 *           &lt;element name="sketchPlanExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_sketchPlanExecutionType"/>
 *           &lt;element name="purchasePlan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanType"/>
 *           &lt;element name="tenderPlan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanType"/>
 *           &lt;element name="tenderPlanUnstructured" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanUnstructuredType"/>
 *           &lt;element name="tenderPlanCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanCancelType"/>
 *           &lt;element name="complaint" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintType"/>
 *           &lt;element name="complaintGroup" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintGroupType"/>
 *           &lt;element name="complaintCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCancelType"/>
 *           &lt;element name="tenderSuspension" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderSuspensionType"/>
 *           &lt;element name="checkPlan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanType"/>
 *           &lt;element name="eventPlan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventPlanType"/>
 *           &lt;element name="unfairSupplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unfairSupplierType"/>
 *           &lt;element name="unplannedCheck" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckType"/>
 *           &lt;element name="unplannedEvent" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventType"/>
 *           &lt;element name="unplannedCheckCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckCancelType"/>
 *           &lt;element name="unplannedEventCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventCancelType"/>
 *           &lt;element name="checkResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultType"/>
 *           &lt;element name="eventResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultType"/>
 *           &lt;element name="checkResultCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultCancelType"/>
 *           &lt;element name="eventResultCancel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventResultCancelType"/>
 *           &lt;element name="nsiBankGuaranteeRefusalReasonList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiBankGuaranteeRefusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBankGuaranteeRefusalReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiBudgetList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBudgetType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiCalendarDayList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiCalendarDay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCalendarDaysType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiCommissionList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiCommission" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiCommissionRoleList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiCommissionRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCommissionRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractPriceChangeReasonList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractPriceChangeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPriceChangeReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractRefusalReasonList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractRefusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractRefusalReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractSingleCustomerReasonList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractSingleCustomerReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractSingleCustomerReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractTerminationReason">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractTerminationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractModificationReason">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractModificationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractExecutionDoc">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractExecutionDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractReparationDoc">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractReparationDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractPenaltyReason">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractPenaltyReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractOKOPFExtraBudget">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractOKOPFExtraBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractOKOPFExtraBudgetType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiContractCurrencyCBRF">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiContractCurrencyCBRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractCurrencyCBRFType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiCurrencyList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiCurrency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCurrencyType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiEvalCriterionList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiEvalCriterion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiEvalCriterionType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiKBKBudgetList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiKBKBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKBKBudgetType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiKOSGUList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiKOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKOSGUType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOffBudgetList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOffBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOffBudgetType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOKEIList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKEIType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOKOPFList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKOPFType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOKPDList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKPDType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOKSMList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOKSM" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKSMType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOKVEDList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKVEDType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOKTMOList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKTMOType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOrganizationList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOrganizationRightsList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOrganizationRights" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationRightsType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOrganizationTypesList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOrganizationType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationTypesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiPlacingWayList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiPlacingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiPlanPositionChangeReasonList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiPlanPositionChangeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlanPositionChangeReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiPurchaseDocumentTypesList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiPurchaseDocumentTypes" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchaseDocumentTypesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiPurchasePreferenceList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiPurchasePreference" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchasePreferencesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiPurchaseRejectReasonList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiPurchaseRejectReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchaseRejectReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiUserList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiUser" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiUserType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiAbandonedReasonList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiAbandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiAbandonedReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOKPD2List">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKPD2Type" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiOKVED2List">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiOKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKVED2Type" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiDeviationFactFoundationList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiDeviationFactFoundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiDeviationFactFoundationType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiPublicDiscussionQuestionnaries">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiPublicDiscussionQuestionnarie" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPublicDiscussionQuestionnarieType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiPublicDiscussionDecisions">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiPublicDiscussionDecision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPublicDiscussionDecisionsType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiAuditActionSubjects">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiAuditActionSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiAuditActionSubjectsType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="nsiBusinessControls">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiBusinessControls" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBusinessControlType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
    "bankGuarantee",
    "bankGuaranteeInvalid",
    "bankGuaranteeRefusal",
    "bankGuaranteeRefusalInvalid",
    "bankGuaranteeTermination",
    "bankGuaranteeTerminationInvalid",
    "bankGuaranteeReturn",
    "bankGuaranteeReturnInvalid",
    "contract",
    "contractCancel",
    "contractProcedure",
    "contractProcedureCancel",
    "fcsClarification",
    "fcsContractSign",
    "fcsNotificationEF",
    "fcsNotificationEFDateChange",
    "fcsNotificationEP",
    "fcsNotificationISM",
    "fcsNotificationISO",
    "fcsNotificationOK",
    "fcsNotificationOKD",
    "fcsNotificationOKOU",
    "fcsNotificationPO",
    "fcsNotificationZakA",
    "fcsNotificationZakKD",
    "fcsNotificationZakKOU",
    "fcsNotificationZakK",
    "fcsNotificationZK",
    "fcsNotificationZP",
    "fcsNotificationLotChange",
    "fcsNotificationCancel",
    "fcsNotificationCancelFailure",
    "fcsNotificationLotCancel",
    "fcsNotificationOrgChange",
    "fcsPurchaseDocument",
    "fcsPlacementResult",
    "fcsPurchaseDocumentCancel",
    "fcsPurchaseProlongationOK",
    "fcsPurchaseProlongationZK",
    "fcsProtocolOK1",
    "fcsProtocolOK2",
    "fcsProtocolOKSingleApp",
    "fcsProtocolOKD1",
    "fcsProtocolOKD2",
    "fcsProtocolOKD3",
    "fcsProtocolOKD4",
    "fcsProtocolOKD5",
    "fcsProtocolOKDSingleApp",
    "fcsProtocolOKOU1",
    "fcsProtocolOKOU2",
    "fcsProtocolOKOU3",
    "fcsProtocolOKOUSingleApp",
    "fcsProtocolPO",
    "fcsProtocolZKAfterProlong",
    "fcsProtocolZK",
    "fcsProtocolZKBI",
    "fcsProtocolZPExtract",
    "fcsProtocolZPFinal",
    "fcsProtocolZP",
    "fcsProtocolEvasion",
    "fcsProtocolDeviation",
    "fcsProtocolEF1",
    "fcsProtocolEF2",
    "fcsProtocolEF3",
    "fcsProtocolEFInvalidation",
    "fcsProtocolEFSingleApp",
    "fcsProtocolEFSinglePart",
    "fcsProtocolCancel",
    "fcsAddInfo",
    "fcsAddInfoInvalid",
    "fcsCustomerReportContractExecution",
    "fcsCustomerReportContractExecutionInvalid",
    "fcsCustomerReportSmallScaleBusiness",
    "fcsCustomerReportSmallScaleBusinessInvalid",
    "fcsCustomerReportSingleContractor",
    "fcsCustomerReportSingleContractorInvalid",
    "fcsCustomerReportBigProjectMonitoring",
    "fcsCustomerReportBigProjectMonitoringInvalid",
    "fcsStandardContract",
    "fcsStandardContractInvalid",
    "fcsPublicDiscussionLargePurchase",
    "fcsPublicDiscussionComment",
    "fcsPublicDiscussionForm",
    "fcsPublicDiscussionAnswer",
    "fcsPublicDiscussionProtocol",
    "fcsRegulationRules",
    "fcsRegulationRulesInvalid",
    "fcsRequestForQuotation",
    "fcsRequestForQuotationCancel",
    "fcsAuditResult",
    "publicDiscussionResult",
    "sketchPlan",
    "sketchPlanExecution",
    "purchasePlan",
    "tenderPlan",
    "tenderPlanUnstructured",
    "tenderPlanCancel",
    "complaint",
    "complaintGroup",
    "complaintCancel",
    "tenderSuspension",
    "checkPlan",
    "eventPlan",
    "unfairSupplier",
    "unplannedCheck",
    "unplannedEvent",
    "unplannedCheckCancel",
    "unplannedEventCancel",
    "checkResult",
    "eventResult",
    "checkResultCancel",
    "eventResultCancel",
    "nsiBankGuaranteeRefusalReasonList",
    "nsiBudgetList",
    "nsiCalendarDayList",
    "nsiCommissionList",
    "nsiCommissionRoleList",
    "nsiContractPriceChangeReasonList",
    "nsiContractRefusalReasonList",
    "nsiContractSingleCustomerReasonList",
    "nsiContractTerminationReason",
    "nsiContractModificationReason",
    "nsiContractExecutionDoc",
    "nsiContractReparationDoc",
    "nsiContractPenaltyReason",
    "nsiContractOKOPFExtraBudget",
    "nsiContractCurrencyCBRF",
    "nsiCurrencyList",
    "nsiEvalCriterionList",
    "nsiKBKBudgetList",
    "nsiKOSGUList",
    "nsiOffBudgetList",
    "nsiOKEIList",
    "nsiOKOPFList",
    "nsiOKPDList",
    "nsiOKSMList",
    "nsiOKVEDList",
    "nsiOKTMOList",
    "nsiOrganizationList",
    "nsiOrganizationRightsList",
    "nsiOrganizationTypesList",
    "nsiPlacingWayList",
    "nsiPlanPositionChangeReasonList",
    "nsiPurchaseDocumentTypesList",
    "nsiPurchasePreferenceList",
    "nsiPurchaseRejectReasonList",
    "nsiUserList",
    "nsiAbandonedReasonList",
    "nsiOKPD2List",
    "nsiOKVED2List",
    "nsiDeviationFactFoundationList",
    "nsiPublicDiscussionQuestionnaries",
    "nsiPublicDiscussionDecisions",
    "nsiAuditActionSubjects",
    "nsiBusinessControls"
})
@XmlRootElement(name = "export", namespace = "http://zakupki.gov.ru/oos/export/1")
public class Export {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsBankGuaranteeType bankGuarantee;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsBankGuaranteeInvalidType bankGuaranteeInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsBankGuaranteeRefusalType bankGuaranteeRefusal;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsBankGuaranteeRefusalInvalidType bankGuaranteeRefusalInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsBankGuaranteeTerminationType bankGuaranteeTermination;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsBankGuaranteeTerminationInvalidType bankGuaranteeTerminationInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsBankGuaranteeReturnType bankGuaranteeReturn;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsBankGuaranteeReturnInvalidType bankGuaranteeReturnInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected List<ZfcsContract2015Type> contract;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected List<ZfcsContractCancel2015Type> contractCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected List<ZfcsContractProcedure2015Type> contractProcedure;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected List<ZfcsContractProcedureCancel2015Type> contractProcedureCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsClarificationType fcsClarification;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsContractSignType fcsContractSign;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationEFType fcsNotificationEF;
    @XmlElement(name = "fcs_notificationEFDateChange", namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationEFDateChangeType fcsNotificationEFDateChange;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationEPType fcsNotificationEP;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationISMType fcsNotificationISM;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationISOType fcsNotificationISO;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationOKType fcsNotificationOK;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationOKDType fcsNotificationOKD;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationOKOUType fcsNotificationOKOU;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationPOType fcsNotificationPO;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationZakAType fcsNotificationZakA;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationZakKDType fcsNotificationZakKD;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationZakKOUType fcsNotificationZakKOU;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationZakKType fcsNotificationZakK;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationZKType fcsNotificationZK;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationZPType fcsNotificationZP;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationLotChangeType fcsNotificationLotChange;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationCancelType fcsNotificationCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationCancelFailureType fcsNotificationCancelFailure;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationLotCancelType fcsNotificationLotCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsNotificationOrgChangeType fcsNotificationOrgChange;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPurchaseDocumentType fcsPurchaseDocument;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPlacementResultType fcsPlacementResult;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPurchaseDocumentCancelType fcsPurchaseDocumentCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPurchaseProlongationOKType fcsPurchaseProlongationOK;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPurchaseProlongationZKType fcsPurchaseProlongationZK;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOK1Type fcsProtocolOK1;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOK2Type fcsProtocolOK2;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKSingleAppType fcsProtocolOKSingleApp;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKD1Type fcsProtocolOKD1;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKD2Type fcsProtocolOKD2;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKD3Type fcsProtocolOKD3;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKD4Type fcsProtocolOKD4;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKD5Type fcsProtocolOKD5;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKDSingleAppType fcsProtocolOKDSingleApp;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKOU1Type fcsProtocolOKOU1;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKOU2Type fcsProtocolOKOU2;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKOU3Type fcsProtocolOKOU3;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolOKOUSingleAppType fcsProtocolOKOUSingleApp;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolPOType fcsProtocolPO;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolZKAfterProlongType fcsProtocolZKAfterProlong;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolZKType fcsProtocolZK;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolZKBIType fcsProtocolZKBI;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolZPExtractType fcsProtocolZPExtract;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolZPFinalType fcsProtocolZPFinal;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolZPType fcsProtocolZP;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolEvasionType fcsProtocolEvasion;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolDeviationType fcsProtocolDeviation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolEF1Type fcsProtocolEF1;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolEF2Type fcsProtocolEF2;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolEF3Type fcsProtocolEF3;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolEFInvalidationType fcsProtocolEFInvalidation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolEFSingleAppType fcsProtocolEFSingleApp;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolEFSinglePartType fcsProtocolEFSinglePart;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsProtocolCancelType fcsProtocolCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsAddInfoType fcsAddInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsAddInfoInvalidType fcsAddInfoInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCustomerReportContractExecutionType fcsCustomerReportContractExecution;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCustomerReportContractExecutionInvalidType fcsCustomerReportContractExecutionInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCustomerReportSmallScaleBusinessType fcsCustomerReportSmallScaleBusiness;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCustomerReportSmallScaleBusinessInvalidType fcsCustomerReportSmallScaleBusinessInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCustomerReportSingleContractorType fcsCustomerReportSingleContractor;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCustomerReportSingleContractorInvalidType fcsCustomerReportSingleContractorInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCustomerReportBigProjectMonitoringType fcsCustomerReportBigProjectMonitoring;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCustomerReportBigProjectMonitoringInvalidType fcsCustomerReportBigProjectMonitoringInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsStandardContractType fcsStandardContract;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsStandardContractInvalidType fcsStandardContractInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPublicDiscussionLargePurchaseType fcsPublicDiscussionLargePurchase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPublicDiscussionCommentType fcsPublicDiscussionComment;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPublicDiscussionFormType fcsPublicDiscussionForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPublicDiscussionAnswerType fcsPublicDiscussionAnswer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPublicDiscussionProtocolType fcsPublicDiscussionProtocol;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsRegulationRulesType fcsRegulationRules;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsRegulationRulesInvalidType fcsRegulationRulesInvalid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsRequestForQuotationType fcsRequestForQuotation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsRequestForQuotationCancelType fcsRequestForQuotationCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsAuditResultType fcsAuditResult;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPublicDiscussionResultType publicDiscussionResult;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsSketchPlanType sketchPlan;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsSketchPlanExecutionType sketchPlanExecution;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsPurchasePlanType purchasePlan;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsTenderPlanType tenderPlan;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsTenderPlanUnstructuredType tenderPlanUnstructured;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsTenderPlanCancelType tenderPlanCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsComplaintType complaint;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsComplaintGroupType complaintGroup;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsComplaintCancelType complaintCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsTenderSuspensionType tenderSuspension;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCheckPlanType checkPlan;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsEventPlanType eventPlan;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsUnfairSupplierType unfairSupplier;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsUnplannedCheckType unplannedCheck;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsUnplannedEventType unplannedEvent;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsUnplannedCheckCancelType unplannedCheckCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsUnplannedEventCancelType unplannedEventCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCheckResultType checkResult;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsEventResultType eventResult;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsCheckResultCancelType checkResultCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected ZfcsEventResultCancelType eventResultCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiBankGuaranteeRefusalReasonList nsiBankGuaranteeRefusalReasonList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiBudgetList nsiBudgetList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiCalendarDayList nsiCalendarDayList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiCommissionList nsiCommissionList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiCommissionRoleList nsiCommissionRoleList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractPriceChangeReasonList nsiContractPriceChangeReasonList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractRefusalReasonList nsiContractRefusalReasonList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractSingleCustomerReasonList nsiContractSingleCustomerReasonList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractTerminationReason nsiContractTerminationReason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractModificationReason nsiContractModificationReason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractExecutionDoc nsiContractExecutionDoc;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractReparationDoc nsiContractReparationDoc;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractPenaltyReason nsiContractPenaltyReason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractOKOPFExtraBudget nsiContractOKOPFExtraBudget;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiContractCurrencyCBRF nsiContractCurrencyCBRF;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiCurrencyList nsiCurrencyList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiEvalCriterionList nsiEvalCriterionList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiKBKBudgetList nsiKBKBudgetList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiKOSGUList nsiKOSGUList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOffBudgetList nsiOffBudgetList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOKEIList nsiOKEIList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOKOPFList nsiOKOPFList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOKPDList nsiOKPDList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOKSMList nsiOKSMList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOKVEDList nsiOKVEDList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOKTMOList nsiOKTMOList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOrganizationList nsiOrganizationList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOrganizationRightsList nsiOrganizationRightsList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOrganizationTypesList nsiOrganizationTypesList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiPlacingWayList nsiPlacingWayList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiPlanPositionChangeReasonList nsiPlanPositionChangeReasonList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiPurchaseDocumentTypesList nsiPurchaseDocumentTypesList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiPurchasePreferenceList nsiPurchasePreferenceList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiPurchaseRejectReasonList nsiPurchaseRejectReasonList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiUserList nsiUserList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiAbandonedReasonList nsiAbandonedReasonList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOKPD2List nsiOKPD2List;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiOKVED2List nsiOKVED2List;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiDeviationFactFoundationList nsiDeviationFactFoundationList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiPublicDiscussionQuestionnaries nsiPublicDiscussionQuestionnaries;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiPublicDiscussionDecisions nsiPublicDiscussionDecisions;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiAuditActionSubjects nsiAuditActionSubjects;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
    protected Export.NsiBusinessControls nsiBusinessControls;

    /**
     * Gets the value of the bankGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeType }
     *     
     */
    public ZfcsBankGuaranteeType getBankGuarantee() {
        return bankGuarantee;
    }

    /**
     * Sets the value of the bankGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeType }
     *     
     */
    public void setBankGuarantee(ZfcsBankGuaranteeType value) {
        this.bankGuarantee = value;
    }

    /**
     * Gets the value of the bankGuaranteeInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeInvalidType }
     *     
     */
    public ZfcsBankGuaranteeInvalidType getBankGuaranteeInvalid() {
        return bankGuaranteeInvalid;
    }

    /**
     * Sets the value of the bankGuaranteeInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeInvalidType }
     *     
     */
    public void setBankGuaranteeInvalid(ZfcsBankGuaranteeInvalidType value) {
        this.bankGuaranteeInvalid = value;
    }

    /**
     * Gets the value of the bankGuaranteeRefusal property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeRefusalType }
     *     
     */
    public ZfcsBankGuaranteeRefusalType getBankGuaranteeRefusal() {
        return bankGuaranteeRefusal;
    }

    /**
     * Sets the value of the bankGuaranteeRefusal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeRefusalType }
     *     
     */
    public void setBankGuaranteeRefusal(ZfcsBankGuaranteeRefusalType value) {
        this.bankGuaranteeRefusal = value;
    }

    /**
     * Gets the value of the bankGuaranteeRefusalInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeRefusalInvalidType }
     *     
     */
    public ZfcsBankGuaranteeRefusalInvalidType getBankGuaranteeRefusalInvalid() {
        return bankGuaranteeRefusalInvalid;
    }

    /**
     * Sets the value of the bankGuaranteeRefusalInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeRefusalInvalidType }
     *     
     */
    public void setBankGuaranteeRefusalInvalid(ZfcsBankGuaranteeRefusalInvalidType value) {
        this.bankGuaranteeRefusalInvalid = value;
    }

    /**
     * Gets the value of the bankGuaranteeTermination property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeTerminationType }
     *     
     */
    public ZfcsBankGuaranteeTerminationType getBankGuaranteeTermination() {
        return bankGuaranteeTermination;
    }

    /**
     * Sets the value of the bankGuaranteeTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeTerminationType }
     *     
     */
    public void setBankGuaranteeTermination(ZfcsBankGuaranteeTerminationType value) {
        this.bankGuaranteeTermination = value;
    }

    /**
     * Gets the value of the bankGuaranteeTerminationInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeTerminationInvalidType }
     *     
     */
    public ZfcsBankGuaranteeTerminationInvalidType getBankGuaranteeTerminationInvalid() {
        return bankGuaranteeTerminationInvalid;
    }

    /**
     * Sets the value of the bankGuaranteeTerminationInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeTerminationInvalidType }
     *     
     */
    public void setBankGuaranteeTerminationInvalid(ZfcsBankGuaranteeTerminationInvalidType value) {
        this.bankGuaranteeTerminationInvalid = value;
    }

    /**
     * Gets the value of the bankGuaranteeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeReturnType }
     *     
     */
    public ZfcsBankGuaranteeReturnType getBankGuaranteeReturn() {
        return bankGuaranteeReturn;
    }

    /**
     * Sets the value of the bankGuaranteeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeReturnType }
     *     
     */
    public void setBankGuaranteeReturn(ZfcsBankGuaranteeReturnType value) {
        this.bankGuaranteeReturn = value;
    }

    /**
     * Gets the value of the bankGuaranteeReturnInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeReturnInvalidType }
     *     
     */
    public ZfcsBankGuaranteeReturnInvalidType getBankGuaranteeReturnInvalid() {
        return bankGuaranteeReturnInvalid;
    }

    /**
     * Sets the value of the bankGuaranteeReturnInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeReturnInvalidType }
     *     
     */
    public void setBankGuaranteeReturnInvalid(ZfcsBankGuaranteeReturnInvalidType value) {
        this.bankGuaranteeReturnInvalid = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsContract2015Type }
     * 
     * 
     */
    public List<ZfcsContract2015Type> getContract() {
        if (contract == null) {
            contract = new ArrayList<ZfcsContract2015Type>();
        }
        return this.contract;
    }

    /**
     * Gets the value of the contractCancel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractCancel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractCancel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsContractCancel2015Type }
     * 
     * 
     */
    public List<ZfcsContractCancel2015Type> getContractCancel() {
        if (contractCancel == null) {
            contractCancel = new ArrayList<ZfcsContractCancel2015Type>();
        }
        return this.contractCancel;
    }

    /**
     * Gets the value of the contractProcedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractProcedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsContractProcedure2015Type }
     * 
     * 
     */
    public List<ZfcsContractProcedure2015Type> getContractProcedure() {
        if (contractProcedure == null) {
            contractProcedure = new ArrayList<ZfcsContractProcedure2015Type>();
        }
        return this.contractProcedure;
    }

    /**
     * Gets the value of the contractProcedureCancel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractProcedureCancel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractProcedureCancel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsContractProcedureCancel2015Type }
     * 
     * 
     */
    public List<ZfcsContractProcedureCancel2015Type> getContractProcedureCancel() {
        if (contractProcedureCancel == null) {
            contractProcedureCancel = new ArrayList<ZfcsContractProcedureCancel2015Type>();
        }
        return this.contractProcedureCancel;
    }

    /**
     * Gets the value of the fcsClarification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsClarificationType }
     *     
     */
    public ZfcsClarificationType getFcsClarification() {
        return fcsClarification;
    }

    /**
     * Sets the value of the fcsClarification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsClarificationType }
     *     
     */
    public void setFcsClarification(ZfcsClarificationType value) {
        this.fcsClarification = value;
    }

    /**
     * Gets the value of the fcsContractSign property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractSignType }
     *     
     */
    public ZfcsContractSignType getFcsContractSign() {
        return fcsContractSign;
    }

    /**
     * Sets the value of the fcsContractSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractSignType }
     *     
     */
    public void setFcsContractSign(ZfcsContractSignType value) {
        this.fcsContractSign = value;
    }

    /**
     * Gets the value of the fcsNotificationEF property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationEFType }
     *     
     */
    public ZfcsNotificationEFType getFcsNotificationEF() {
        return fcsNotificationEF;
    }

    /**
     * Sets the value of the fcsNotificationEF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationEFType }
     *     
     */
    public void setFcsNotificationEF(ZfcsNotificationEFType value) {
        this.fcsNotificationEF = value;
    }

    /**
     * Gets the value of the fcsNotificationEFDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationEFDateChangeType }
     *     
     */
    public ZfcsNotificationEFDateChangeType getFcsNotificationEFDateChange() {
        return fcsNotificationEFDateChange;
    }

    /**
     * Sets the value of the fcsNotificationEFDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationEFDateChangeType }
     *     
     */
    public void setFcsNotificationEFDateChange(ZfcsNotificationEFDateChangeType value) {
        this.fcsNotificationEFDateChange = value;
    }

    /**
     * Gets the value of the fcsNotificationEP property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationEPType }
     *     
     */
    public ZfcsNotificationEPType getFcsNotificationEP() {
        return fcsNotificationEP;
    }

    /**
     * Sets the value of the fcsNotificationEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationEPType }
     *     
     */
    public void setFcsNotificationEP(ZfcsNotificationEPType value) {
        this.fcsNotificationEP = value;
    }

    /**
     * Gets the value of the fcsNotificationISM property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationISMType }
     *     
     */
    public ZfcsNotificationISMType getFcsNotificationISM() {
        return fcsNotificationISM;
    }

    /**
     * Sets the value of the fcsNotificationISM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationISMType }
     *     
     */
    public void setFcsNotificationISM(ZfcsNotificationISMType value) {
        this.fcsNotificationISM = value;
    }

    /**
     * Gets the value of the fcsNotificationISO property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationISOType }
     *     
     */
    public ZfcsNotificationISOType getFcsNotificationISO() {
        return fcsNotificationISO;
    }

    /**
     * Sets the value of the fcsNotificationISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationISOType }
     *     
     */
    public void setFcsNotificationISO(ZfcsNotificationISOType value) {
        this.fcsNotificationISO = value;
    }

    /**
     * Gets the value of the fcsNotificationOK property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationOKType }
     *     
     */
    public ZfcsNotificationOKType getFcsNotificationOK() {
        return fcsNotificationOK;
    }

    /**
     * Sets the value of the fcsNotificationOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationOKType }
     *     
     */
    public void setFcsNotificationOK(ZfcsNotificationOKType value) {
        this.fcsNotificationOK = value;
    }

    /**
     * Gets the value of the fcsNotificationOKD property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationOKDType }
     *     
     */
    public ZfcsNotificationOKDType getFcsNotificationOKD() {
        return fcsNotificationOKD;
    }

    /**
     * Sets the value of the fcsNotificationOKD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationOKDType }
     *     
     */
    public void setFcsNotificationOKD(ZfcsNotificationOKDType value) {
        this.fcsNotificationOKD = value;
    }

    /**
     * Gets the value of the fcsNotificationOKOU property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationOKOUType }
     *     
     */
    public ZfcsNotificationOKOUType getFcsNotificationOKOU() {
        return fcsNotificationOKOU;
    }

    /**
     * Sets the value of the fcsNotificationOKOU property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationOKOUType }
     *     
     */
    public void setFcsNotificationOKOU(ZfcsNotificationOKOUType value) {
        this.fcsNotificationOKOU = value;
    }

    /**
     * Gets the value of the fcsNotificationPO property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationPOType }
     *     
     */
    public ZfcsNotificationPOType getFcsNotificationPO() {
        return fcsNotificationPO;
    }

    /**
     * Sets the value of the fcsNotificationPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationPOType }
     *     
     */
    public void setFcsNotificationPO(ZfcsNotificationPOType value) {
        this.fcsNotificationPO = value;
    }

    /**
     * Gets the value of the fcsNotificationZakA property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZakAType }
     *     
     */
    public ZfcsNotificationZakAType getFcsNotificationZakA() {
        return fcsNotificationZakA;
    }

    /**
     * Sets the value of the fcsNotificationZakA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZakAType }
     *     
     */
    public void setFcsNotificationZakA(ZfcsNotificationZakAType value) {
        this.fcsNotificationZakA = value;
    }

    /**
     * Gets the value of the fcsNotificationZakKD property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZakKDType }
     *     
     */
    public ZfcsNotificationZakKDType getFcsNotificationZakKD() {
        return fcsNotificationZakKD;
    }

    /**
     * Sets the value of the fcsNotificationZakKD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZakKDType }
     *     
     */
    public void setFcsNotificationZakKD(ZfcsNotificationZakKDType value) {
        this.fcsNotificationZakKD = value;
    }

    /**
     * Gets the value of the fcsNotificationZakKOU property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZakKOUType }
     *     
     */
    public ZfcsNotificationZakKOUType getFcsNotificationZakKOU() {
        return fcsNotificationZakKOU;
    }

    /**
     * Sets the value of the fcsNotificationZakKOU property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZakKOUType }
     *     
     */
    public void setFcsNotificationZakKOU(ZfcsNotificationZakKOUType value) {
        this.fcsNotificationZakKOU = value;
    }

    /**
     * Gets the value of the fcsNotificationZakK property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZakKType }
     *     
     */
    public ZfcsNotificationZakKType getFcsNotificationZakK() {
        return fcsNotificationZakK;
    }

    /**
     * Sets the value of the fcsNotificationZakK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZakKType }
     *     
     */
    public void setFcsNotificationZakK(ZfcsNotificationZakKType value) {
        this.fcsNotificationZakK = value;
    }

    /**
     * Gets the value of the fcsNotificationZK property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZKType }
     *     
     */
    public ZfcsNotificationZKType getFcsNotificationZK() {
        return fcsNotificationZK;
    }

    /**
     * Sets the value of the fcsNotificationZK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZKType }
     *     
     */
    public void setFcsNotificationZK(ZfcsNotificationZKType value) {
        this.fcsNotificationZK = value;
    }

    /**
     * Gets the value of the fcsNotificationZP property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZPType }
     *     
     */
    public ZfcsNotificationZPType getFcsNotificationZP() {
        return fcsNotificationZP;
    }

    /**
     * Sets the value of the fcsNotificationZP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZPType }
     *     
     */
    public void setFcsNotificationZP(ZfcsNotificationZPType value) {
        this.fcsNotificationZP = value;
    }

    /**
     * Gets the value of the fcsNotificationLotChange property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationLotChangeType }
     *     
     */
    public ZfcsNotificationLotChangeType getFcsNotificationLotChange() {
        return fcsNotificationLotChange;
    }

    /**
     * Sets the value of the fcsNotificationLotChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationLotChangeType }
     *     
     */
    public void setFcsNotificationLotChange(ZfcsNotificationLotChangeType value) {
        this.fcsNotificationLotChange = value;
    }

    /**
     * Gets the value of the fcsNotificationCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationCancelType }
     *     
     */
    public ZfcsNotificationCancelType getFcsNotificationCancel() {
        return fcsNotificationCancel;
    }

    /**
     * Sets the value of the fcsNotificationCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationCancelType }
     *     
     */
    public void setFcsNotificationCancel(ZfcsNotificationCancelType value) {
        this.fcsNotificationCancel = value;
    }

    /**
     * Gets the value of the fcsNotificationCancelFailure property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationCancelFailureType }
     *     
     */
    public ZfcsNotificationCancelFailureType getFcsNotificationCancelFailure() {
        return fcsNotificationCancelFailure;
    }

    /**
     * Sets the value of the fcsNotificationCancelFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationCancelFailureType }
     *     
     */
    public void setFcsNotificationCancelFailure(ZfcsNotificationCancelFailureType value) {
        this.fcsNotificationCancelFailure = value;
    }

    /**
     * Gets the value of the fcsNotificationLotCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationLotCancelType }
     *     
     */
    public ZfcsNotificationLotCancelType getFcsNotificationLotCancel() {
        return fcsNotificationLotCancel;
    }

    /**
     * Sets the value of the fcsNotificationLotCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationLotCancelType }
     *     
     */
    public void setFcsNotificationLotCancel(ZfcsNotificationLotCancelType value) {
        this.fcsNotificationLotCancel = value;
    }

    /**
     * Gets the value of the fcsNotificationOrgChange property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationOrgChangeType }
     *     
     */
    public ZfcsNotificationOrgChangeType getFcsNotificationOrgChange() {
        return fcsNotificationOrgChange;
    }

    /**
     * Sets the value of the fcsNotificationOrgChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationOrgChangeType }
     *     
     */
    public void setFcsNotificationOrgChange(ZfcsNotificationOrgChangeType value) {
        this.fcsNotificationOrgChange = value;
    }

    /**
     * Gets the value of the fcsPurchaseDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseDocumentType }
     *     
     */
    public ZfcsPurchaseDocumentType getFcsPurchaseDocument() {
        return fcsPurchaseDocument;
    }

    /**
     * Sets the value of the fcsPurchaseDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseDocumentType }
     *     
     */
    public void setFcsPurchaseDocument(ZfcsPurchaseDocumentType value) {
        this.fcsPurchaseDocument = value;
    }

    /**
     * Gets the value of the fcsPlacementResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPlacementResultType }
     *     
     */
    public ZfcsPlacementResultType getFcsPlacementResult() {
        return fcsPlacementResult;
    }

    /**
     * Sets the value of the fcsPlacementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPlacementResultType }
     *     
     */
    public void setFcsPlacementResult(ZfcsPlacementResultType value) {
        this.fcsPlacementResult = value;
    }

    /**
     * Gets the value of the fcsPurchaseDocumentCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseDocumentCancelType }
     *     
     */
    public ZfcsPurchaseDocumentCancelType getFcsPurchaseDocumentCancel() {
        return fcsPurchaseDocumentCancel;
    }

    /**
     * Sets the value of the fcsPurchaseDocumentCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseDocumentCancelType }
     *     
     */
    public void setFcsPurchaseDocumentCancel(ZfcsPurchaseDocumentCancelType value) {
        this.fcsPurchaseDocumentCancel = value;
    }

    /**
     * Gets the value of the fcsPurchaseProlongationOK property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProlongationOKType }
     *     
     */
    public ZfcsPurchaseProlongationOKType getFcsPurchaseProlongationOK() {
        return fcsPurchaseProlongationOK;
    }

    /**
     * Sets the value of the fcsPurchaseProlongationOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProlongationOKType }
     *     
     */
    public void setFcsPurchaseProlongationOK(ZfcsPurchaseProlongationOKType value) {
        this.fcsPurchaseProlongationOK = value;
    }

    /**
     * Gets the value of the fcsPurchaseProlongationZK property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProlongationZKType }
     *     
     */
    public ZfcsPurchaseProlongationZKType getFcsPurchaseProlongationZK() {
        return fcsPurchaseProlongationZK;
    }

    /**
     * Sets the value of the fcsPurchaseProlongationZK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProlongationZKType }
     *     
     */
    public void setFcsPurchaseProlongationZK(ZfcsPurchaseProlongationZKType value) {
        this.fcsPurchaseProlongationZK = value;
    }

    /**
     * Gets the value of the fcsProtocolOK1 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOK1Type }
     *     
     */
    public ZfcsProtocolOK1Type getFcsProtocolOK1() {
        return fcsProtocolOK1;
    }

    /**
     * Sets the value of the fcsProtocolOK1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOK1Type }
     *     
     */
    public void setFcsProtocolOK1(ZfcsProtocolOK1Type value) {
        this.fcsProtocolOK1 = value;
    }

    /**
     * Gets the value of the fcsProtocolOK2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOK2Type }
     *     
     */
    public ZfcsProtocolOK2Type getFcsProtocolOK2() {
        return fcsProtocolOK2;
    }

    /**
     * Sets the value of the fcsProtocolOK2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOK2Type }
     *     
     */
    public void setFcsProtocolOK2(ZfcsProtocolOK2Type value) {
        this.fcsProtocolOK2 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKSingleApp property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKSingleAppType }
     *     
     */
    public ZfcsProtocolOKSingleAppType getFcsProtocolOKSingleApp() {
        return fcsProtocolOKSingleApp;
    }

    /**
     * Sets the value of the fcsProtocolOKSingleApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKSingleAppType }
     *     
     */
    public void setFcsProtocolOKSingleApp(ZfcsProtocolOKSingleAppType value) {
        this.fcsProtocolOKSingleApp = value;
    }

    /**
     * Gets the value of the fcsProtocolOKD1 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKD1Type }
     *     
     */
    public ZfcsProtocolOKD1Type getFcsProtocolOKD1() {
        return fcsProtocolOKD1;
    }

    /**
     * Sets the value of the fcsProtocolOKD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKD1Type }
     *     
     */
    public void setFcsProtocolOKD1(ZfcsProtocolOKD1Type value) {
        this.fcsProtocolOKD1 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKD2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKD2Type }
     *     
     */
    public ZfcsProtocolOKD2Type getFcsProtocolOKD2() {
        return fcsProtocolOKD2;
    }

    /**
     * Sets the value of the fcsProtocolOKD2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKD2Type }
     *     
     */
    public void setFcsProtocolOKD2(ZfcsProtocolOKD2Type value) {
        this.fcsProtocolOKD2 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKD3 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKD3Type }
     *     
     */
    public ZfcsProtocolOKD3Type getFcsProtocolOKD3() {
        return fcsProtocolOKD3;
    }

    /**
     * Sets the value of the fcsProtocolOKD3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKD3Type }
     *     
     */
    public void setFcsProtocolOKD3(ZfcsProtocolOKD3Type value) {
        this.fcsProtocolOKD3 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKD4 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKD4Type }
     *     
     */
    public ZfcsProtocolOKD4Type getFcsProtocolOKD4() {
        return fcsProtocolOKD4;
    }

    /**
     * Sets the value of the fcsProtocolOKD4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKD4Type }
     *     
     */
    public void setFcsProtocolOKD4(ZfcsProtocolOKD4Type value) {
        this.fcsProtocolOKD4 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKD5 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKD5Type }
     *     
     */
    public ZfcsProtocolOKD5Type getFcsProtocolOKD5() {
        return fcsProtocolOKD5;
    }

    /**
     * Sets the value of the fcsProtocolOKD5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKD5Type }
     *     
     */
    public void setFcsProtocolOKD5(ZfcsProtocolOKD5Type value) {
        this.fcsProtocolOKD5 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKDSingleApp property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKDSingleAppType }
     *     
     */
    public ZfcsProtocolOKDSingleAppType getFcsProtocolOKDSingleApp() {
        return fcsProtocolOKDSingleApp;
    }

    /**
     * Sets the value of the fcsProtocolOKDSingleApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKDSingleAppType }
     *     
     */
    public void setFcsProtocolOKDSingleApp(ZfcsProtocolOKDSingleAppType value) {
        this.fcsProtocolOKDSingleApp = value;
    }

    /**
     * Gets the value of the fcsProtocolOKOU1 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKOU1Type }
     *     
     */
    public ZfcsProtocolOKOU1Type getFcsProtocolOKOU1() {
        return fcsProtocolOKOU1;
    }

    /**
     * Sets the value of the fcsProtocolOKOU1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKOU1Type }
     *     
     */
    public void setFcsProtocolOKOU1(ZfcsProtocolOKOU1Type value) {
        this.fcsProtocolOKOU1 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKOU2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKOU2Type }
     *     
     */
    public ZfcsProtocolOKOU2Type getFcsProtocolOKOU2() {
        return fcsProtocolOKOU2;
    }

    /**
     * Sets the value of the fcsProtocolOKOU2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKOU2Type }
     *     
     */
    public void setFcsProtocolOKOU2(ZfcsProtocolOKOU2Type value) {
        this.fcsProtocolOKOU2 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKOU3 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKOU3Type }
     *     
     */
    public ZfcsProtocolOKOU3Type getFcsProtocolOKOU3() {
        return fcsProtocolOKOU3;
    }

    /**
     * Sets the value of the fcsProtocolOKOU3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKOU3Type }
     *     
     */
    public void setFcsProtocolOKOU3(ZfcsProtocolOKOU3Type value) {
        this.fcsProtocolOKOU3 = value;
    }

    /**
     * Gets the value of the fcsProtocolOKOUSingleApp property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKOUSingleAppType }
     *     
     */
    public ZfcsProtocolOKOUSingleAppType getFcsProtocolOKOUSingleApp() {
        return fcsProtocolOKOUSingleApp;
    }

    /**
     * Sets the value of the fcsProtocolOKOUSingleApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKOUSingleAppType }
     *     
     */
    public void setFcsProtocolOKOUSingleApp(ZfcsProtocolOKOUSingleAppType value) {
        this.fcsProtocolOKOUSingleApp = value;
    }

    /**
     * Gets the value of the fcsProtocolPO property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolPOType }
     *     
     */
    public ZfcsProtocolPOType getFcsProtocolPO() {
        return fcsProtocolPO;
    }

    /**
     * Sets the value of the fcsProtocolPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolPOType }
     *     
     */
    public void setFcsProtocolPO(ZfcsProtocolPOType value) {
        this.fcsProtocolPO = value;
    }

    /**
     * Gets the value of the fcsProtocolZKAfterProlong property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZKAfterProlongType }
     *     
     */
    public ZfcsProtocolZKAfterProlongType getFcsProtocolZKAfterProlong() {
        return fcsProtocolZKAfterProlong;
    }

    /**
     * Sets the value of the fcsProtocolZKAfterProlong property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZKAfterProlongType }
     *     
     */
    public void setFcsProtocolZKAfterProlong(ZfcsProtocolZKAfterProlongType value) {
        this.fcsProtocolZKAfterProlong = value;
    }

    /**
     * Gets the value of the fcsProtocolZK property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZKType }
     *     
     */
    public ZfcsProtocolZKType getFcsProtocolZK() {
        return fcsProtocolZK;
    }

    /**
     * Sets the value of the fcsProtocolZK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZKType }
     *     
     */
    public void setFcsProtocolZK(ZfcsProtocolZKType value) {
        this.fcsProtocolZK = value;
    }

    /**
     * Gets the value of the fcsProtocolZKBI property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZKBIType }
     *     
     */
    public ZfcsProtocolZKBIType getFcsProtocolZKBI() {
        return fcsProtocolZKBI;
    }

    /**
     * Sets the value of the fcsProtocolZKBI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZKBIType }
     *     
     */
    public void setFcsProtocolZKBI(ZfcsProtocolZKBIType value) {
        this.fcsProtocolZKBI = value;
    }

    /**
     * Gets the value of the fcsProtocolZPExtract property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZPExtractType }
     *     
     */
    public ZfcsProtocolZPExtractType getFcsProtocolZPExtract() {
        return fcsProtocolZPExtract;
    }

    /**
     * Sets the value of the fcsProtocolZPExtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZPExtractType }
     *     
     */
    public void setFcsProtocolZPExtract(ZfcsProtocolZPExtractType value) {
        this.fcsProtocolZPExtract = value;
    }

    /**
     * Gets the value of the fcsProtocolZPFinal property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZPFinalType }
     *     
     */
    public ZfcsProtocolZPFinalType getFcsProtocolZPFinal() {
        return fcsProtocolZPFinal;
    }

    /**
     * Sets the value of the fcsProtocolZPFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZPFinalType }
     *     
     */
    public void setFcsProtocolZPFinal(ZfcsProtocolZPFinalType value) {
        this.fcsProtocolZPFinal = value;
    }

    /**
     * Gets the value of the fcsProtocolZP property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZPType }
     *     
     */
    public ZfcsProtocolZPType getFcsProtocolZP() {
        return fcsProtocolZP;
    }

    /**
     * Sets the value of the fcsProtocolZP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZPType }
     *     
     */
    public void setFcsProtocolZP(ZfcsProtocolZPType value) {
        this.fcsProtocolZP = value;
    }

    /**
     * Gets the value of the fcsProtocolEvasion property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEvasionType }
     *     
     */
    public ZfcsProtocolEvasionType getFcsProtocolEvasion() {
        return fcsProtocolEvasion;
    }

    /**
     * Sets the value of the fcsProtocolEvasion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEvasionType }
     *     
     */
    public void setFcsProtocolEvasion(ZfcsProtocolEvasionType value) {
        this.fcsProtocolEvasion = value;
    }

    /**
     * Gets the value of the fcsProtocolDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolDeviationType }
     *     
     */
    public ZfcsProtocolDeviationType getFcsProtocolDeviation() {
        return fcsProtocolDeviation;
    }

    /**
     * Sets the value of the fcsProtocolDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolDeviationType }
     *     
     */
    public void setFcsProtocolDeviation(ZfcsProtocolDeviationType value) {
        this.fcsProtocolDeviation = value;
    }

    /**
     * Gets the value of the fcsProtocolEF1 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEF1Type }
     *     
     */
    public ZfcsProtocolEF1Type getFcsProtocolEF1() {
        return fcsProtocolEF1;
    }

    /**
     * Sets the value of the fcsProtocolEF1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEF1Type }
     *     
     */
    public void setFcsProtocolEF1(ZfcsProtocolEF1Type value) {
        this.fcsProtocolEF1 = value;
    }

    /**
     * Gets the value of the fcsProtocolEF2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEF2Type }
     *     
     */
    public ZfcsProtocolEF2Type getFcsProtocolEF2() {
        return fcsProtocolEF2;
    }

    /**
     * Sets the value of the fcsProtocolEF2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEF2Type }
     *     
     */
    public void setFcsProtocolEF2(ZfcsProtocolEF2Type value) {
        this.fcsProtocolEF2 = value;
    }

    /**
     * Gets the value of the fcsProtocolEF3 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEF3Type }
     *     
     */
    public ZfcsProtocolEF3Type getFcsProtocolEF3() {
        return fcsProtocolEF3;
    }

    /**
     * Sets the value of the fcsProtocolEF3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEF3Type }
     *     
     */
    public void setFcsProtocolEF3(ZfcsProtocolEF3Type value) {
        this.fcsProtocolEF3 = value;
    }

    /**
     * Gets the value of the fcsProtocolEFInvalidation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEFInvalidationType }
     *     
     */
    public ZfcsProtocolEFInvalidationType getFcsProtocolEFInvalidation() {
        return fcsProtocolEFInvalidation;
    }

    /**
     * Sets the value of the fcsProtocolEFInvalidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEFInvalidationType }
     *     
     */
    public void setFcsProtocolEFInvalidation(ZfcsProtocolEFInvalidationType value) {
        this.fcsProtocolEFInvalidation = value;
    }

    /**
     * Gets the value of the fcsProtocolEFSingleApp property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEFSingleAppType }
     *     
     */
    public ZfcsProtocolEFSingleAppType getFcsProtocolEFSingleApp() {
        return fcsProtocolEFSingleApp;
    }

    /**
     * Sets the value of the fcsProtocolEFSingleApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEFSingleAppType }
     *     
     */
    public void setFcsProtocolEFSingleApp(ZfcsProtocolEFSingleAppType value) {
        this.fcsProtocolEFSingleApp = value;
    }

    /**
     * Gets the value of the fcsProtocolEFSinglePart property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEFSinglePartType }
     *     
     */
    public ZfcsProtocolEFSinglePartType getFcsProtocolEFSinglePart() {
        return fcsProtocolEFSinglePart;
    }

    /**
     * Sets the value of the fcsProtocolEFSinglePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEFSinglePartType }
     *     
     */
    public void setFcsProtocolEFSinglePart(ZfcsProtocolEFSinglePartType value) {
        this.fcsProtocolEFSinglePart = value;
    }

    /**
     * Gets the value of the fcsProtocolCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolCancelType }
     *     
     */
    public ZfcsProtocolCancelType getFcsProtocolCancel() {
        return fcsProtocolCancel;
    }

    /**
     * Sets the value of the fcsProtocolCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolCancelType }
     *     
     */
    public void setFcsProtocolCancel(ZfcsProtocolCancelType value) {
        this.fcsProtocolCancel = value;
    }

    /**
     * Gets the value of the fcsAddInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoType }
     *     
     */
    public ZfcsAddInfoType getFcsAddInfo() {
        return fcsAddInfo;
    }

    /**
     * Sets the value of the fcsAddInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoType }
     *     
     */
    public void setFcsAddInfo(ZfcsAddInfoType value) {
        this.fcsAddInfo = value;
    }

    /**
     * Gets the value of the fcsAddInfoInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoInvalidType }
     *     
     */
    public ZfcsAddInfoInvalidType getFcsAddInfoInvalid() {
        return fcsAddInfoInvalid;
    }

    /**
     * Sets the value of the fcsAddInfoInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoInvalidType }
     *     
     */
    public void setFcsAddInfoInvalid(ZfcsAddInfoInvalidType value) {
        this.fcsAddInfoInvalid = value;
    }

    /**
     * Gets the value of the fcsCustomerReportContractExecution property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType }
     *     
     */
    public ZfcsCustomerReportContractExecutionType getFcsCustomerReportContractExecution() {
        return fcsCustomerReportContractExecution;
    }

    /**
     * Sets the value of the fcsCustomerReportContractExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType }
     *     
     */
    public void setFcsCustomerReportContractExecution(ZfcsCustomerReportContractExecutionType value) {
        this.fcsCustomerReportContractExecution = value;
    }

    /**
     * Gets the value of the fcsCustomerReportContractExecutionInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionInvalidType }
     *     
     */
    public ZfcsCustomerReportContractExecutionInvalidType getFcsCustomerReportContractExecutionInvalid() {
        return fcsCustomerReportContractExecutionInvalid;
    }

    /**
     * Sets the value of the fcsCustomerReportContractExecutionInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionInvalidType }
     *     
     */
    public void setFcsCustomerReportContractExecutionInvalid(ZfcsCustomerReportContractExecutionInvalidType value) {
        this.fcsCustomerReportContractExecutionInvalid = value;
    }

    /**
     * Gets the value of the fcsCustomerReportSmallScaleBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessType }
     *     
     */
    public ZfcsCustomerReportSmallScaleBusinessType getFcsCustomerReportSmallScaleBusiness() {
        return fcsCustomerReportSmallScaleBusiness;
    }

    /**
     * Sets the value of the fcsCustomerReportSmallScaleBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessType }
     *     
     */
    public void setFcsCustomerReportSmallScaleBusiness(ZfcsCustomerReportSmallScaleBusinessType value) {
        this.fcsCustomerReportSmallScaleBusiness = value;
    }

    /**
     * Gets the value of the fcsCustomerReportSmallScaleBusinessInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessInvalidType }
     *     
     */
    public ZfcsCustomerReportSmallScaleBusinessInvalidType getFcsCustomerReportSmallScaleBusinessInvalid() {
        return fcsCustomerReportSmallScaleBusinessInvalid;
    }

    /**
     * Sets the value of the fcsCustomerReportSmallScaleBusinessInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessInvalidType }
     *     
     */
    public void setFcsCustomerReportSmallScaleBusinessInvalid(ZfcsCustomerReportSmallScaleBusinessInvalidType value) {
        this.fcsCustomerReportSmallScaleBusinessInvalid = value;
    }

    /**
     * Gets the value of the fcsCustomerReportSingleContractor property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSingleContractorType }
     *     
     */
    public ZfcsCustomerReportSingleContractorType getFcsCustomerReportSingleContractor() {
        return fcsCustomerReportSingleContractor;
    }

    /**
     * Sets the value of the fcsCustomerReportSingleContractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSingleContractorType }
     *     
     */
    public void setFcsCustomerReportSingleContractor(ZfcsCustomerReportSingleContractorType value) {
        this.fcsCustomerReportSingleContractor = value;
    }

    /**
     * Gets the value of the fcsCustomerReportSingleContractorInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSingleContractorInvalidType }
     *     
     */
    public ZfcsCustomerReportSingleContractorInvalidType getFcsCustomerReportSingleContractorInvalid() {
        return fcsCustomerReportSingleContractorInvalid;
    }

    /**
     * Sets the value of the fcsCustomerReportSingleContractorInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSingleContractorInvalidType }
     *     
     */
    public void setFcsCustomerReportSingleContractorInvalid(ZfcsCustomerReportSingleContractorInvalidType value) {
        this.fcsCustomerReportSingleContractorInvalid = value;
    }

    /**
     * Gets the value of the fcsCustomerReportBigProjectMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType getFcsCustomerReportBigProjectMonitoring() {
        return fcsCustomerReportBigProjectMonitoring;
    }

    /**
     * Sets the value of the fcsCustomerReportBigProjectMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType }
     *     
     */
    public void setFcsCustomerReportBigProjectMonitoring(ZfcsCustomerReportBigProjectMonitoringType value) {
        this.fcsCustomerReportBigProjectMonitoring = value;
    }

    /**
     * Gets the value of the fcsCustomerReportBigProjectMonitoringInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringInvalidType }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringInvalidType getFcsCustomerReportBigProjectMonitoringInvalid() {
        return fcsCustomerReportBigProjectMonitoringInvalid;
    }

    /**
     * Sets the value of the fcsCustomerReportBigProjectMonitoringInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringInvalidType }
     *     
     */
    public void setFcsCustomerReportBigProjectMonitoringInvalid(ZfcsCustomerReportBigProjectMonitoringInvalidType value) {
        this.fcsCustomerReportBigProjectMonitoringInvalid = value;
    }

    /**
     * Gets the value of the fcsStandardContract property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStandardContractType }
     *     
     */
    public ZfcsStandardContractType getFcsStandardContract() {
        return fcsStandardContract;
    }

    /**
     * Sets the value of the fcsStandardContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStandardContractType }
     *     
     */
    public void setFcsStandardContract(ZfcsStandardContractType value) {
        this.fcsStandardContract = value;
    }

    /**
     * Gets the value of the fcsStandardContractInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStandardContractInvalidType }
     *     
     */
    public ZfcsStandardContractInvalidType getFcsStandardContractInvalid() {
        return fcsStandardContractInvalid;
    }

    /**
     * Sets the value of the fcsStandardContractInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStandardContractInvalidType }
     *     
     */
    public void setFcsStandardContractInvalid(ZfcsStandardContractInvalidType value) {
        this.fcsStandardContractInvalid = value;
    }

    /**
     * Gets the value of the fcsPublicDiscussionLargePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionLargePurchaseType }
     *     
     */
    public ZfcsPublicDiscussionLargePurchaseType getFcsPublicDiscussionLargePurchase() {
        return fcsPublicDiscussionLargePurchase;
    }

    /**
     * Sets the value of the fcsPublicDiscussionLargePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionLargePurchaseType }
     *     
     */
    public void setFcsPublicDiscussionLargePurchase(ZfcsPublicDiscussionLargePurchaseType value) {
        this.fcsPublicDiscussionLargePurchase = value;
    }

    /**
     * Gets the value of the fcsPublicDiscussionComment property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionCommentType }
     *     
     */
    public ZfcsPublicDiscussionCommentType getFcsPublicDiscussionComment() {
        return fcsPublicDiscussionComment;
    }

    /**
     * Sets the value of the fcsPublicDiscussionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionCommentType }
     *     
     */
    public void setFcsPublicDiscussionComment(ZfcsPublicDiscussionCommentType value) {
        this.fcsPublicDiscussionComment = value;
    }

    /**
     * Gets the value of the fcsPublicDiscussionForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionFormType }
     *     
     */
    public ZfcsPublicDiscussionFormType getFcsPublicDiscussionForm() {
        return fcsPublicDiscussionForm;
    }

    /**
     * Sets the value of the fcsPublicDiscussionForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionFormType }
     *     
     */
    public void setFcsPublicDiscussionForm(ZfcsPublicDiscussionFormType value) {
        this.fcsPublicDiscussionForm = value;
    }

    /**
     * Gets the value of the fcsPublicDiscussionAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionAnswerType }
     *     
     */
    public ZfcsPublicDiscussionAnswerType getFcsPublicDiscussionAnswer() {
        return fcsPublicDiscussionAnswer;
    }

    /**
     * Sets the value of the fcsPublicDiscussionAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionAnswerType }
     *     
     */
    public void setFcsPublicDiscussionAnswer(ZfcsPublicDiscussionAnswerType value) {
        this.fcsPublicDiscussionAnswer = value;
    }

    /**
     * Gets the value of the fcsPublicDiscussionProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionProtocolType }
     *     
     */
    public ZfcsPublicDiscussionProtocolType getFcsPublicDiscussionProtocol() {
        return fcsPublicDiscussionProtocol;
    }

    /**
     * Sets the value of the fcsPublicDiscussionProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionProtocolType }
     *     
     */
    public void setFcsPublicDiscussionProtocol(ZfcsPublicDiscussionProtocolType value) {
        this.fcsPublicDiscussionProtocol = value;
    }

    /**
     * Gets the value of the fcsRegulationRules property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesType }
     *     
     */
    public ZfcsRegulationRulesType getFcsRegulationRules() {
        return fcsRegulationRules;
    }

    /**
     * Sets the value of the fcsRegulationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesType }
     *     
     */
    public void setFcsRegulationRules(ZfcsRegulationRulesType value) {
        this.fcsRegulationRules = value;
    }

    /**
     * Gets the value of the fcsRegulationRulesInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType }
     *     
     */
    public ZfcsRegulationRulesInvalidType getFcsRegulationRulesInvalid() {
        return fcsRegulationRulesInvalid;
    }

    /**
     * Sets the value of the fcsRegulationRulesInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType }
     *     
     */
    public void setFcsRegulationRulesInvalid(ZfcsRegulationRulesInvalidType value) {
        this.fcsRegulationRulesInvalid = value;
    }

    /**
     * Gets the value of the fcsRequestForQuotation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRequestForQuotationType }
     *     
     */
    public ZfcsRequestForQuotationType getFcsRequestForQuotation() {
        return fcsRequestForQuotation;
    }

    /**
     * Sets the value of the fcsRequestForQuotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRequestForQuotationType }
     *     
     */
    public void setFcsRequestForQuotation(ZfcsRequestForQuotationType value) {
        this.fcsRequestForQuotation = value;
    }

    /**
     * Gets the value of the fcsRequestForQuotationCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRequestForQuotationCancelType }
     *     
     */
    public ZfcsRequestForQuotationCancelType getFcsRequestForQuotationCancel() {
        return fcsRequestForQuotationCancel;
    }

    /**
     * Sets the value of the fcsRequestForQuotationCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRequestForQuotationCancelType }
     *     
     */
    public void setFcsRequestForQuotationCancel(ZfcsRequestForQuotationCancelType value) {
        this.fcsRequestForQuotationCancel = value;
    }

    /**
     * Gets the value of the fcsAuditResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAuditResultType }
     *     
     */
    public ZfcsAuditResultType getFcsAuditResult() {
        return fcsAuditResult;
    }

    /**
     * Sets the value of the fcsAuditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAuditResultType }
     *     
     */
    public void setFcsAuditResult(ZfcsAuditResultType value) {
        this.fcsAuditResult = value;
    }

    /**
     * Gets the value of the publicDiscussionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionResultType }
     *     
     */
    public ZfcsPublicDiscussionResultType getPublicDiscussionResult() {
        return publicDiscussionResult;
    }

    /**
     * Sets the value of the publicDiscussionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionResultType }
     *     
     */
    public void setPublicDiscussionResult(ZfcsPublicDiscussionResultType value) {
        this.publicDiscussionResult = value;
    }

    /**
     * Gets the value of the sketchPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsSketchPlanType }
     *     
     */
    public ZfcsSketchPlanType getSketchPlan() {
        return sketchPlan;
    }

    /**
     * Sets the value of the sketchPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsSketchPlanType }
     *     
     */
    public void setSketchPlan(ZfcsSketchPlanType value) {
        this.sketchPlan = value;
    }

    /**
     * Gets the value of the sketchPlanExecution property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsSketchPlanExecutionType }
     *     
     */
    public ZfcsSketchPlanExecutionType getSketchPlanExecution() {
        return sketchPlanExecution;
    }

    /**
     * Sets the value of the sketchPlanExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsSketchPlanExecutionType }
     *     
     */
    public void setSketchPlanExecution(ZfcsSketchPlanExecutionType value) {
        this.sketchPlanExecution = value;
    }

    /**
     * Gets the value of the purchasePlan property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanType }
     *     
     */
    public ZfcsPurchasePlanType getPurchasePlan() {
        return purchasePlan;
    }

    /**
     * Sets the value of the purchasePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanType }
     *     
     */
    public void setPurchasePlan(ZfcsPurchasePlanType value) {
        this.purchasePlan = value;
    }

    /**
     * Gets the value of the tenderPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanType }
     *     
     */
    public ZfcsTenderPlanType getTenderPlan() {
        return tenderPlan;
    }

    /**
     * Sets the value of the tenderPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanType }
     *     
     */
    public void setTenderPlan(ZfcsTenderPlanType value) {
        this.tenderPlan = value;
    }

    /**
     * Gets the value of the tenderPlanUnstructured property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanUnstructuredType }
     *     
     */
    public ZfcsTenderPlanUnstructuredType getTenderPlanUnstructured() {
        return tenderPlanUnstructured;
    }

    /**
     * Sets the value of the tenderPlanUnstructured property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanUnstructuredType }
     *     
     */
    public void setTenderPlanUnstructured(ZfcsTenderPlanUnstructuredType value) {
        this.tenderPlanUnstructured = value;
    }

    /**
     * Gets the value of the tenderPlanCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanCancelType }
     *     
     */
    public ZfcsTenderPlanCancelType getTenderPlanCancel() {
        return tenderPlanCancel;
    }

    /**
     * Sets the value of the tenderPlanCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanCancelType }
     *     
     */
    public void setTenderPlanCancel(ZfcsTenderPlanCancelType value) {
        this.tenderPlanCancel = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintType }
     *     
     */
    public ZfcsComplaintType getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintType }
     *     
     */
    public void setComplaint(ZfcsComplaintType value) {
        this.complaint = value;
    }

    /**
     * Gets the value of the complaintGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintGroupType }
     *     
     */
    public ZfcsComplaintGroupType getComplaintGroup() {
        return complaintGroup;
    }

    /**
     * Sets the value of the complaintGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintGroupType }
     *     
     */
    public void setComplaintGroup(ZfcsComplaintGroupType value) {
        this.complaintGroup = value;
    }

    /**
     * Gets the value of the complaintCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintCancelType }
     *     
     */
    public ZfcsComplaintCancelType getComplaintCancel() {
        return complaintCancel;
    }

    /**
     * Sets the value of the complaintCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintCancelType }
     *     
     */
    public void setComplaintCancel(ZfcsComplaintCancelType value) {
        this.complaintCancel = value;
    }

    /**
     * Gets the value of the tenderSuspension property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderSuspensionType }
     *     
     */
    public ZfcsTenderSuspensionType getTenderSuspension() {
        return tenderSuspension;
    }

    /**
     * Sets the value of the tenderSuspension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderSuspensionType }
     *     
     */
    public void setTenderSuspension(ZfcsTenderSuspensionType value) {
        this.tenderSuspension = value;
    }

    /**
     * Gets the value of the checkPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckPlanType }
     *     
     */
    public ZfcsCheckPlanType getCheckPlan() {
        return checkPlan;
    }

    /**
     * Sets the value of the checkPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckPlanType }
     *     
     */
    public void setCheckPlan(ZfcsCheckPlanType value) {
        this.checkPlan = value;
    }

    /**
     * Gets the value of the eventPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEventPlanType }
     *     
     */
    public ZfcsEventPlanType getEventPlan() {
        return eventPlan;
    }

    /**
     * Sets the value of the eventPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEventPlanType }
     *     
     */
    public void setEventPlan(ZfcsEventPlanType value) {
        this.eventPlan = value;
    }

    /**
     * Gets the value of the unfairSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnfairSupplierType }
     *     
     */
    public ZfcsUnfairSupplierType getUnfairSupplier() {
        return unfairSupplier;
    }

    /**
     * Sets the value of the unfairSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnfairSupplierType }
     *     
     */
    public void setUnfairSupplier(ZfcsUnfairSupplierType value) {
        this.unfairSupplier = value;
    }

    /**
     * Gets the value of the unplannedCheck property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckType }
     *     
     */
    public ZfcsUnplannedCheckType getUnplannedCheck() {
        return unplannedCheck;
    }

    /**
     * Sets the value of the unplannedCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckType }
     *     
     */
    public void setUnplannedCheck(ZfcsUnplannedCheckType value) {
        this.unplannedCheck = value;
    }

    /**
     * Gets the value of the unplannedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedEventType }
     *     
     */
    public ZfcsUnplannedEventType getUnplannedEvent() {
        return unplannedEvent;
    }

    /**
     * Sets the value of the unplannedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedEventType }
     *     
     */
    public void setUnplannedEvent(ZfcsUnplannedEventType value) {
        this.unplannedEvent = value;
    }

    /**
     * Gets the value of the unplannedCheckCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckCancelType }
     *     
     */
    public ZfcsUnplannedCheckCancelType getUnplannedCheckCancel() {
        return unplannedCheckCancel;
    }

    /**
     * Sets the value of the unplannedCheckCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckCancelType }
     *     
     */
    public void setUnplannedCheckCancel(ZfcsUnplannedCheckCancelType value) {
        this.unplannedCheckCancel = value;
    }

    /**
     * Gets the value of the unplannedEventCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedEventCancelType }
     *     
     */
    public ZfcsUnplannedEventCancelType getUnplannedEventCancel() {
        return unplannedEventCancel;
    }

    /**
     * Sets the value of the unplannedEventCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedEventCancelType }
     *     
     */
    public void setUnplannedEventCancel(ZfcsUnplannedEventCancelType value) {
        this.unplannedEventCancel = value;
    }

    /**
     * Gets the value of the checkResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultType }
     *     
     */
    public ZfcsCheckResultType getCheckResult() {
        return checkResult;
    }

    /**
     * Sets the value of the checkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultType }
     *     
     */
    public void setCheckResult(ZfcsCheckResultType value) {
        this.checkResult = value;
    }

    /**
     * Gets the value of the eventResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEventResultType }
     *     
     */
    public ZfcsEventResultType getEventResult() {
        return eventResult;
    }

    /**
     * Sets the value of the eventResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEventResultType }
     *     
     */
    public void setEventResult(ZfcsEventResultType value) {
        this.eventResult = value;
    }

    /**
     * Gets the value of the checkResultCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultCancelType }
     *     
     */
    public ZfcsCheckResultCancelType getCheckResultCancel() {
        return checkResultCancel;
    }

    /**
     * Sets the value of the checkResultCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultCancelType }
     *     
     */
    public void setCheckResultCancel(ZfcsCheckResultCancelType value) {
        this.checkResultCancel = value;
    }

    /**
     * Gets the value of the eventResultCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEventResultCancelType }
     *     
     */
    public ZfcsEventResultCancelType getEventResultCancel() {
        return eventResultCancel;
    }

    /**
     * Sets the value of the eventResultCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEventResultCancelType }
     *     
     */
    public void setEventResultCancel(ZfcsEventResultCancelType value) {
        this.eventResultCancel = value;
    }

    /**
     * Gets the value of the nsiBankGuaranteeRefusalReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiBankGuaranteeRefusalReasonList }
     *     
     */
    public Export.NsiBankGuaranteeRefusalReasonList getNsiBankGuaranteeRefusalReasonList() {
        return nsiBankGuaranteeRefusalReasonList;
    }

    /**
     * Sets the value of the nsiBankGuaranteeRefusalReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiBankGuaranteeRefusalReasonList }
     *     
     */
    public void setNsiBankGuaranteeRefusalReasonList(Export.NsiBankGuaranteeRefusalReasonList value) {
        this.nsiBankGuaranteeRefusalReasonList = value;
    }

    /**
     * Gets the value of the nsiBudgetList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiBudgetList }
     *     
     */
    public Export.NsiBudgetList getNsiBudgetList() {
        return nsiBudgetList;
    }

    /**
     * Sets the value of the nsiBudgetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiBudgetList }
     *     
     */
    public void setNsiBudgetList(Export.NsiBudgetList value) {
        this.nsiBudgetList = value;
    }

    /**
     * Gets the value of the nsiCalendarDayList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiCalendarDayList }
     *     
     */
    public Export.NsiCalendarDayList getNsiCalendarDayList() {
        return nsiCalendarDayList;
    }

    /**
     * Sets the value of the nsiCalendarDayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiCalendarDayList }
     *     
     */
    public void setNsiCalendarDayList(Export.NsiCalendarDayList value) {
        this.nsiCalendarDayList = value;
    }

    /**
     * Gets the value of the nsiCommissionList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiCommissionList }
     *     
     */
    public Export.NsiCommissionList getNsiCommissionList() {
        return nsiCommissionList;
    }

    /**
     * Sets the value of the nsiCommissionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiCommissionList }
     *     
     */
    public void setNsiCommissionList(Export.NsiCommissionList value) {
        this.nsiCommissionList = value;
    }

    /**
     * Gets the value of the nsiCommissionRoleList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiCommissionRoleList }
     *     
     */
    public Export.NsiCommissionRoleList getNsiCommissionRoleList() {
        return nsiCommissionRoleList;
    }

    /**
     * Sets the value of the nsiCommissionRoleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiCommissionRoleList }
     *     
     */
    public void setNsiCommissionRoleList(Export.NsiCommissionRoleList value) {
        this.nsiCommissionRoleList = value;
    }

    /**
     * Gets the value of the nsiContractPriceChangeReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractPriceChangeReasonList }
     *     
     */
    public Export.NsiContractPriceChangeReasonList getNsiContractPriceChangeReasonList() {
        return nsiContractPriceChangeReasonList;
    }

    /**
     * Sets the value of the nsiContractPriceChangeReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractPriceChangeReasonList }
     *     
     */
    public void setNsiContractPriceChangeReasonList(Export.NsiContractPriceChangeReasonList value) {
        this.nsiContractPriceChangeReasonList = value;
    }

    /**
     * Gets the value of the nsiContractRefusalReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractRefusalReasonList }
     *     
     */
    public Export.NsiContractRefusalReasonList getNsiContractRefusalReasonList() {
        return nsiContractRefusalReasonList;
    }

    /**
     * Sets the value of the nsiContractRefusalReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractRefusalReasonList }
     *     
     */
    public void setNsiContractRefusalReasonList(Export.NsiContractRefusalReasonList value) {
        this.nsiContractRefusalReasonList = value;
    }

    /**
     * Gets the value of the nsiContractSingleCustomerReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractSingleCustomerReasonList }
     *     
     */
    public Export.NsiContractSingleCustomerReasonList getNsiContractSingleCustomerReasonList() {
        return nsiContractSingleCustomerReasonList;
    }

    /**
     * Sets the value of the nsiContractSingleCustomerReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractSingleCustomerReasonList }
     *     
     */
    public void setNsiContractSingleCustomerReasonList(Export.NsiContractSingleCustomerReasonList value) {
        this.nsiContractSingleCustomerReasonList = value;
    }

    /**
     * Gets the value of the nsiContractTerminationReason property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractTerminationReason }
     *     
     */
    public Export.NsiContractTerminationReason getNsiContractTerminationReason() {
        return nsiContractTerminationReason;
    }

    /**
     * Sets the value of the nsiContractTerminationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractTerminationReason }
     *     
     */
    public void setNsiContractTerminationReason(Export.NsiContractTerminationReason value) {
        this.nsiContractTerminationReason = value;
    }

    /**
     * Gets the value of the nsiContractModificationReason property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractModificationReason }
     *     
     */
    public Export.NsiContractModificationReason getNsiContractModificationReason() {
        return nsiContractModificationReason;
    }

    /**
     * Sets the value of the nsiContractModificationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractModificationReason }
     *     
     */
    public void setNsiContractModificationReason(Export.NsiContractModificationReason value) {
        this.nsiContractModificationReason = value;
    }

    /**
     * Gets the value of the nsiContractExecutionDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractExecutionDoc }
     *     
     */
    public Export.NsiContractExecutionDoc getNsiContractExecutionDoc() {
        return nsiContractExecutionDoc;
    }

    /**
     * Sets the value of the nsiContractExecutionDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractExecutionDoc }
     *     
     */
    public void setNsiContractExecutionDoc(Export.NsiContractExecutionDoc value) {
        this.nsiContractExecutionDoc = value;
    }

    /**
     * Gets the value of the nsiContractReparationDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractReparationDoc }
     *     
     */
    public Export.NsiContractReparationDoc getNsiContractReparationDoc() {
        return nsiContractReparationDoc;
    }

    /**
     * Sets the value of the nsiContractReparationDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractReparationDoc }
     *     
     */
    public void setNsiContractReparationDoc(Export.NsiContractReparationDoc value) {
        this.nsiContractReparationDoc = value;
    }

    /**
     * Gets the value of the nsiContractPenaltyReason property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractPenaltyReason }
     *     
     */
    public Export.NsiContractPenaltyReason getNsiContractPenaltyReason() {
        return nsiContractPenaltyReason;
    }

    /**
     * Sets the value of the nsiContractPenaltyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractPenaltyReason }
     *     
     */
    public void setNsiContractPenaltyReason(Export.NsiContractPenaltyReason value) {
        this.nsiContractPenaltyReason = value;
    }

    /**
     * Gets the value of the nsiContractOKOPFExtraBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractOKOPFExtraBudget }
     *     
     */
    public Export.NsiContractOKOPFExtraBudget getNsiContractOKOPFExtraBudget() {
        return nsiContractOKOPFExtraBudget;
    }

    /**
     * Sets the value of the nsiContractOKOPFExtraBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractOKOPFExtraBudget }
     *     
     */
    public void setNsiContractOKOPFExtraBudget(Export.NsiContractOKOPFExtraBudget value) {
        this.nsiContractOKOPFExtraBudget = value;
    }

    /**
     * Gets the value of the nsiContractCurrencyCBRF property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiContractCurrencyCBRF }
     *     
     */
    public Export.NsiContractCurrencyCBRF getNsiContractCurrencyCBRF() {
        return nsiContractCurrencyCBRF;
    }

    /**
     * Sets the value of the nsiContractCurrencyCBRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiContractCurrencyCBRF }
     *     
     */
    public void setNsiContractCurrencyCBRF(Export.NsiContractCurrencyCBRF value) {
        this.nsiContractCurrencyCBRF = value;
    }

    /**
     * Gets the value of the nsiCurrencyList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiCurrencyList }
     *     
     */
    public Export.NsiCurrencyList getNsiCurrencyList() {
        return nsiCurrencyList;
    }

    /**
     * Sets the value of the nsiCurrencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiCurrencyList }
     *     
     */
    public void setNsiCurrencyList(Export.NsiCurrencyList value) {
        this.nsiCurrencyList = value;
    }

    /**
     * Gets the value of the nsiEvalCriterionList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiEvalCriterionList }
     *     
     */
    public Export.NsiEvalCriterionList getNsiEvalCriterionList() {
        return nsiEvalCriterionList;
    }

    /**
     * Sets the value of the nsiEvalCriterionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiEvalCriterionList }
     *     
     */
    public void setNsiEvalCriterionList(Export.NsiEvalCriterionList value) {
        this.nsiEvalCriterionList = value;
    }

    /**
     * Gets the value of the nsiKBKBudgetList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiKBKBudgetList }
     *     
     */
    public Export.NsiKBKBudgetList getNsiKBKBudgetList() {
        return nsiKBKBudgetList;
    }

    /**
     * Sets the value of the nsiKBKBudgetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiKBKBudgetList }
     *     
     */
    public void setNsiKBKBudgetList(Export.NsiKBKBudgetList value) {
        this.nsiKBKBudgetList = value;
    }

    /**
     * Gets the value of the nsiKOSGUList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiKOSGUList }
     *     
     */
    public Export.NsiKOSGUList getNsiKOSGUList() {
        return nsiKOSGUList;
    }

    /**
     * Sets the value of the nsiKOSGUList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiKOSGUList }
     *     
     */
    public void setNsiKOSGUList(Export.NsiKOSGUList value) {
        this.nsiKOSGUList = value;
    }

    /**
     * Gets the value of the nsiOffBudgetList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOffBudgetList }
     *     
     */
    public Export.NsiOffBudgetList getNsiOffBudgetList() {
        return nsiOffBudgetList;
    }

    /**
     * Sets the value of the nsiOffBudgetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOffBudgetList }
     *     
     */
    public void setNsiOffBudgetList(Export.NsiOffBudgetList value) {
        this.nsiOffBudgetList = value;
    }

    /**
     * Gets the value of the nsiOKEIList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOKEIList }
     *     
     */
    public Export.NsiOKEIList getNsiOKEIList() {
        return nsiOKEIList;
    }

    /**
     * Sets the value of the nsiOKEIList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOKEIList }
     *     
     */
    public void setNsiOKEIList(Export.NsiOKEIList value) {
        this.nsiOKEIList = value;
    }

    /**
     * Gets the value of the nsiOKOPFList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOKOPFList }
     *     
     */
    public Export.NsiOKOPFList getNsiOKOPFList() {
        return nsiOKOPFList;
    }

    /**
     * Sets the value of the nsiOKOPFList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOKOPFList }
     *     
     */
    public void setNsiOKOPFList(Export.NsiOKOPFList value) {
        this.nsiOKOPFList = value;
    }

    /**
     * Gets the value of the nsiOKPDList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOKPDList }
     *     
     */
    public Export.NsiOKPDList getNsiOKPDList() {
        return nsiOKPDList;
    }

    /**
     * Sets the value of the nsiOKPDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOKPDList }
     *     
     */
    public void setNsiOKPDList(Export.NsiOKPDList value) {
        this.nsiOKPDList = value;
    }

    /**
     * Gets the value of the nsiOKSMList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOKSMList }
     *     
     */
    public Export.NsiOKSMList getNsiOKSMList() {
        return nsiOKSMList;
    }

    /**
     * Sets the value of the nsiOKSMList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOKSMList }
     *     
     */
    public void setNsiOKSMList(Export.NsiOKSMList value) {
        this.nsiOKSMList = value;
    }

    /**
     * Gets the value of the nsiOKVEDList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOKVEDList }
     *     
     */
    public Export.NsiOKVEDList getNsiOKVEDList() {
        return nsiOKVEDList;
    }

    /**
     * Sets the value of the nsiOKVEDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOKVEDList }
     *     
     */
    public void setNsiOKVEDList(Export.NsiOKVEDList value) {
        this.nsiOKVEDList = value;
    }

    /**
     * Gets the value of the nsiOKTMOList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOKTMOList }
     *     
     */
    public Export.NsiOKTMOList getNsiOKTMOList() {
        return nsiOKTMOList;
    }

    /**
     * Sets the value of the nsiOKTMOList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOKTMOList }
     *     
     */
    public void setNsiOKTMOList(Export.NsiOKTMOList value) {
        this.nsiOKTMOList = value;
    }

    /**
     * Gets the value of the nsiOrganizationList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOrganizationList }
     *     
     */
    public Export.NsiOrganizationList getNsiOrganizationList() {
        return nsiOrganizationList;
    }

    /**
     * Sets the value of the nsiOrganizationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOrganizationList }
     *     
     */
    public void setNsiOrganizationList(Export.NsiOrganizationList value) {
        this.nsiOrganizationList = value;
    }

    /**
     * Gets the value of the nsiOrganizationRightsList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOrganizationRightsList }
     *     
     */
    public Export.NsiOrganizationRightsList getNsiOrganizationRightsList() {
        return nsiOrganizationRightsList;
    }

    /**
     * Sets the value of the nsiOrganizationRightsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOrganizationRightsList }
     *     
     */
    public void setNsiOrganizationRightsList(Export.NsiOrganizationRightsList value) {
        this.nsiOrganizationRightsList = value;
    }

    /**
     * Gets the value of the nsiOrganizationTypesList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOrganizationTypesList }
     *     
     */
    public Export.NsiOrganizationTypesList getNsiOrganizationTypesList() {
        return nsiOrganizationTypesList;
    }

    /**
     * Sets the value of the nsiOrganizationTypesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOrganizationTypesList }
     *     
     */
    public void setNsiOrganizationTypesList(Export.NsiOrganizationTypesList value) {
        this.nsiOrganizationTypesList = value;
    }

    /**
     * Gets the value of the nsiPlacingWayList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiPlacingWayList }
     *     
     */
    public Export.NsiPlacingWayList getNsiPlacingWayList() {
        return nsiPlacingWayList;
    }

    /**
     * Sets the value of the nsiPlacingWayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiPlacingWayList }
     *     
     */
    public void setNsiPlacingWayList(Export.NsiPlacingWayList value) {
        this.nsiPlacingWayList = value;
    }

    /**
     * Gets the value of the nsiPlanPositionChangeReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiPlanPositionChangeReasonList }
     *     
     */
    public Export.NsiPlanPositionChangeReasonList getNsiPlanPositionChangeReasonList() {
        return nsiPlanPositionChangeReasonList;
    }

    /**
     * Sets the value of the nsiPlanPositionChangeReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiPlanPositionChangeReasonList }
     *     
     */
    public void setNsiPlanPositionChangeReasonList(Export.NsiPlanPositionChangeReasonList value) {
        this.nsiPlanPositionChangeReasonList = value;
    }

    /**
     * Gets the value of the nsiPurchaseDocumentTypesList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiPurchaseDocumentTypesList }
     *     
     */
    public Export.NsiPurchaseDocumentTypesList getNsiPurchaseDocumentTypesList() {
        return nsiPurchaseDocumentTypesList;
    }

    /**
     * Sets the value of the nsiPurchaseDocumentTypesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiPurchaseDocumentTypesList }
     *     
     */
    public void setNsiPurchaseDocumentTypesList(Export.NsiPurchaseDocumentTypesList value) {
        this.nsiPurchaseDocumentTypesList = value;
    }

    /**
     * Gets the value of the nsiPurchasePreferenceList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiPurchasePreferenceList }
     *     
     */
    public Export.NsiPurchasePreferenceList getNsiPurchasePreferenceList() {
        return nsiPurchasePreferenceList;
    }

    /**
     * Sets the value of the nsiPurchasePreferenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiPurchasePreferenceList }
     *     
     */
    public void setNsiPurchasePreferenceList(Export.NsiPurchasePreferenceList value) {
        this.nsiPurchasePreferenceList = value;
    }

    /**
     * Gets the value of the nsiPurchaseRejectReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiPurchaseRejectReasonList }
     *     
     */
    public Export.NsiPurchaseRejectReasonList getNsiPurchaseRejectReasonList() {
        return nsiPurchaseRejectReasonList;
    }

    /**
     * Sets the value of the nsiPurchaseRejectReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiPurchaseRejectReasonList }
     *     
     */
    public void setNsiPurchaseRejectReasonList(Export.NsiPurchaseRejectReasonList value) {
        this.nsiPurchaseRejectReasonList = value;
    }

    /**
     * Gets the value of the nsiUserList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiUserList }
     *     
     */
    public Export.NsiUserList getNsiUserList() {
        return nsiUserList;
    }

    /**
     * Sets the value of the nsiUserList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiUserList }
     *     
     */
    public void setNsiUserList(Export.NsiUserList value) {
        this.nsiUserList = value;
    }

    /**
     * Gets the value of the nsiAbandonedReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiAbandonedReasonList }
     *     
     */
    public Export.NsiAbandonedReasonList getNsiAbandonedReasonList() {
        return nsiAbandonedReasonList;
    }

    /**
     * Sets the value of the nsiAbandonedReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiAbandonedReasonList }
     *     
     */
    public void setNsiAbandonedReasonList(Export.NsiAbandonedReasonList value) {
        this.nsiAbandonedReasonList = value;
    }

    /**
     * Gets the value of the nsiOKPD2List property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOKPD2List }
     *     
     */
    public Export.NsiOKPD2List getNsiOKPD2List() {
        return nsiOKPD2List;
    }

    /**
     * Sets the value of the nsiOKPD2List property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOKPD2List }
     *     
     */
    public void setNsiOKPD2List(Export.NsiOKPD2List value) {
        this.nsiOKPD2List = value;
    }

    /**
     * Gets the value of the nsiOKVED2List property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiOKVED2List }
     *     
     */
    public Export.NsiOKVED2List getNsiOKVED2List() {
        return nsiOKVED2List;
    }

    /**
     * Sets the value of the nsiOKVED2List property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiOKVED2List }
     *     
     */
    public void setNsiOKVED2List(Export.NsiOKVED2List value) {
        this.nsiOKVED2List = value;
    }

    /**
     * Gets the value of the nsiDeviationFactFoundationList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiDeviationFactFoundationList }
     *     
     */
    public Export.NsiDeviationFactFoundationList getNsiDeviationFactFoundationList() {
        return nsiDeviationFactFoundationList;
    }

    /**
     * Sets the value of the nsiDeviationFactFoundationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiDeviationFactFoundationList }
     *     
     */
    public void setNsiDeviationFactFoundationList(Export.NsiDeviationFactFoundationList value) {
        this.nsiDeviationFactFoundationList = value;
    }

    /**
     * Gets the value of the nsiPublicDiscussionQuestionnaries property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiPublicDiscussionQuestionnaries }
     *     
     */
    public Export.NsiPublicDiscussionQuestionnaries getNsiPublicDiscussionQuestionnaries() {
        return nsiPublicDiscussionQuestionnaries;
    }

    /**
     * Sets the value of the nsiPublicDiscussionQuestionnaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiPublicDiscussionQuestionnaries }
     *     
     */
    public void setNsiPublicDiscussionQuestionnaries(Export.NsiPublicDiscussionQuestionnaries value) {
        this.nsiPublicDiscussionQuestionnaries = value;
    }

    /**
     * Gets the value of the nsiPublicDiscussionDecisions property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiPublicDiscussionDecisions }
     *     
     */
    public Export.NsiPublicDiscussionDecisions getNsiPublicDiscussionDecisions() {
        return nsiPublicDiscussionDecisions;
    }

    /**
     * Sets the value of the nsiPublicDiscussionDecisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiPublicDiscussionDecisions }
     *     
     */
    public void setNsiPublicDiscussionDecisions(Export.NsiPublicDiscussionDecisions value) {
        this.nsiPublicDiscussionDecisions = value;
    }

    /**
     * Gets the value of the nsiAuditActionSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiAuditActionSubjects }
     *     
     */
    public Export.NsiAuditActionSubjects getNsiAuditActionSubjects() {
        return nsiAuditActionSubjects;
    }

    /**
     * Sets the value of the nsiAuditActionSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiAuditActionSubjects }
     *     
     */
    public void setNsiAuditActionSubjects(Export.NsiAuditActionSubjects value) {
        this.nsiAuditActionSubjects = value;
    }

    /**
     * Gets the value of the nsiBusinessControls property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiBusinessControls }
     *     
     */
    public Export.NsiBusinessControls getNsiBusinessControls() {
        return nsiBusinessControls;
    }

    /**
     * Sets the value of the nsiBusinessControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiBusinessControls }
     *     
     */
    public void setNsiBusinessControls(Export.NsiBusinessControls value) {
        this.nsiBusinessControls = value;
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
     *         &lt;element name="nsiAbandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiAbandonedReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiAbandonedReason"
    })
    public static class NsiAbandonedReasonList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiAbandonedReasonType> nsiAbandonedReason;

        /**
         * Gets the value of the nsiAbandonedReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiAbandonedReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiAbandonedReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiAbandonedReasonType }
         * 
         * 
         */
        public List<ZfcsNsiAbandonedReasonType> getNsiAbandonedReason() {
            if (nsiAbandonedReason == null) {
                nsiAbandonedReason = new ArrayList<ZfcsNsiAbandonedReasonType>();
            }
            return this.nsiAbandonedReason;
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
     *         &lt;element name="nsiAuditActionSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiAuditActionSubjectsType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiAuditActionSubject"
    })
    public static class NsiAuditActionSubjects {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiAuditActionSubjectsType> nsiAuditActionSubject;

        /**
         * Gets the value of the nsiAuditActionSubject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiAuditActionSubject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiAuditActionSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiAuditActionSubjectsType }
         * 
         * 
         */
        public List<ZfcsNsiAuditActionSubjectsType> getNsiAuditActionSubject() {
            if (nsiAuditActionSubject == null) {
                nsiAuditActionSubject = new ArrayList<ZfcsNsiAuditActionSubjectsType>();
            }
            return this.nsiAuditActionSubject;
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
     *         &lt;element name="nsiBankGuaranteeRefusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBankGuaranteeRefusalReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiBankGuaranteeRefusalReason"
    })
    public static class NsiBankGuaranteeRefusalReasonList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiBankGuaranteeRefusalReasonType> nsiBankGuaranteeRefusalReason;

        /**
         * Gets the value of the nsiBankGuaranteeRefusalReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiBankGuaranteeRefusalReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiBankGuaranteeRefusalReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiBankGuaranteeRefusalReasonType }
         * 
         * 
         */
        public List<ZfcsNsiBankGuaranteeRefusalReasonType> getNsiBankGuaranteeRefusalReason() {
            if (nsiBankGuaranteeRefusalReason == null) {
                nsiBankGuaranteeRefusalReason = new ArrayList<ZfcsNsiBankGuaranteeRefusalReasonType>();
            }
            return this.nsiBankGuaranteeRefusalReason;
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
     *         &lt;element name="nsiBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBudgetType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiBudget"
    })
    public static class NsiBudgetList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiBudgetType> nsiBudget;

        /**
         * Gets the value of the nsiBudget property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiBudget property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiBudget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiBudgetType }
         * 
         * 
         */
        public List<ZfcsNsiBudgetType> getNsiBudget() {
            if (nsiBudget == null) {
                nsiBudget = new ArrayList<ZfcsNsiBudgetType>();
            }
            return this.nsiBudget;
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
     *         &lt;element name="nsiBusinessControls" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBusinessControlType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiBusinessControls"
    })
    public static class NsiBusinessControls {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiBusinessControlType> nsiBusinessControls;

        /**
         * Gets the value of the nsiBusinessControls property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiBusinessControls property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiBusinessControls().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiBusinessControlType }
         * 
         * 
         */
        public List<ZfcsNsiBusinessControlType> getNsiBusinessControls() {
            if (nsiBusinessControls == null) {
                nsiBusinessControls = new ArrayList<ZfcsNsiBusinessControlType>();
            }
            return this.nsiBusinessControls;
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
     *         &lt;element name="nsiCalendarDay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCalendarDaysType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiCalendarDay"
    })
    public static class NsiCalendarDayList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiCalendarDaysType> nsiCalendarDay;

        /**
         * Gets the value of the nsiCalendarDay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiCalendarDay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiCalendarDay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiCalendarDaysType }
         * 
         * 
         */
        public List<ZfcsNsiCalendarDaysType> getNsiCalendarDay() {
            if (nsiCalendarDay == null) {
                nsiCalendarDay = new ArrayList<ZfcsNsiCalendarDaysType>();
            }
            return this.nsiCalendarDay;
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
     *         &lt;element name="nsiCommission" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCommissionType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiCommission"
    })
    public static class NsiCommissionList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiCommissionType> nsiCommission;

        /**
         * Gets the value of the nsiCommission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiCommission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiCommission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiCommissionType }
         * 
         * 
         */
        public List<ZfcsNsiCommissionType> getNsiCommission() {
            if (nsiCommission == null) {
                nsiCommission = new ArrayList<ZfcsNsiCommissionType>();
            }
            return this.nsiCommission;
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
     *         &lt;element name="nsiCommissionRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCommissionRoleType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiCommissionRole"
    })
    public static class NsiCommissionRoleList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiCommissionRoleType> nsiCommissionRole;

        /**
         * Gets the value of the nsiCommissionRole property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiCommissionRole property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiCommissionRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiCommissionRoleType }
         * 
         * 
         */
        public List<ZfcsNsiCommissionRoleType> getNsiCommissionRole() {
            if (nsiCommissionRole == null) {
                nsiCommissionRole = new ArrayList<ZfcsNsiCommissionRoleType>();
            }
            return this.nsiCommissionRole;
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
     *         &lt;element name="nsiContractCurrencyCBRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractCurrencyCBRFType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractCurrencyCBRF"
    })
    public static class NsiContractCurrencyCBRF {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractCurrencyCBRFType> nsiContractCurrencyCBRF;

        /**
         * Gets the value of the nsiContractCurrencyCBRF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractCurrencyCBRF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractCurrencyCBRF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractCurrencyCBRFType }
         * 
         * 
         */
        public List<ZfcsNsiContractCurrencyCBRFType> getNsiContractCurrencyCBRF() {
            if (nsiContractCurrencyCBRF == null) {
                nsiContractCurrencyCBRF = new ArrayList<ZfcsNsiContractCurrencyCBRFType>();
            }
            return this.nsiContractCurrencyCBRF;
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
     *         &lt;element name="nsiContractExecutionDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractExecutionDoc"
    })
    public static class NsiContractExecutionDoc {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractExecutionDocType> nsiContractExecutionDoc;

        /**
         * Gets the value of the nsiContractExecutionDoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractExecutionDoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractExecutionDoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractExecutionDocType }
         * 
         * 
         */
        public List<ZfcsNsiContractExecutionDocType> getNsiContractExecutionDoc() {
            if (nsiContractExecutionDoc == null) {
                nsiContractExecutionDoc = new ArrayList<ZfcsNsiContractExecutionDocType>();
            }
            return this.nsiContractExecutionDoc;
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
     *         &lt;element name="nsiContractModificationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractModificationReason"
    })
    public static class NsiContractModificationReason {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractModificationReasonType> nsiContractModificationReason;

        /**
         * Gets the value of the nsiContractModificationReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractModificationReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractModificationReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractModificationReasonType }
         * 
         * 
         */
        public List<ZfcsNsiContractModificationReasonType> getNsiContractModificationReason() {
            if (nsiContractModificationReason == null) {
                nsiContractModificationReason = new ArrayList<ZfcsNsiContractModificationReasonType>();
            }
            return this.nsiContractModificationReason;
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
     *         &lt;element name="nsiContractOKOPFExtraBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractOKOPFExtraBudgetType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractOKOPFExtraBudget"
    })
    public static class NsiContractOKOPFExtraBudget {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractOKOPFExtraBudgetType> nsiContractOKOPFExtraBudget;

        /**
         * Gets the value of the nsiContractOKOPFExtraBudget property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractOKOPFExtraBudget property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractOKOPFExtraBudget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractOKOPFExtraBudgetType }
         * 
         * 
         */
        public List<ZfcsNsiContractOKOPFExtraBudgetType> getNsiContractOKOPFExtraBudget() {
            if (nsiContractOKOPFExtraBudget == null) {
                nsiContractOKOPFExtraBudget = new ArrayList<ZfcsNsiContractOKOPFExtraBudgetType>();
            }
            return this.nsiContractOKOPFExtraBudget;
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
     *         &lt;element name="nsiContractPenaltyReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractPenaltyReason"
    })
    public static class NsiContractPenaltyReason {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractPenaltyReasonType> nsiContractPenaltyReason;

        /**
         * Gets the value of the nsiContractPenaltyReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractPenaltyReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractPenaltyReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractPenaltyReasonType }
         * 
         * 
         */
        public List<ZfcsNsiContractPenaltyReasonType> getNsiContractPenaltyReason() {
            if (nsiContractPenaltyReason == null) {
                nsiContractPenaltyReason = new ArrayList<ZfcsNsiContractPenaltyReasonType>();
            }
            return this.nsiContractPenaltyReason;
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
     *         &lt;element name="nsiContractPriceChangeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPriceChangeReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractPriceChangeReason"
    })
    public static class NsiContractPriceChangeReasonList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractPriceChangeReasonType> nsiContractPriceChangeReason;

        /**
         * Gets the value of the nsiContractPriceChangeReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractPriceChangeReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractPriceChangeReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractPriceChangeReasonType }
         * 
         * 
         */
        public List<ZfcsNsiContractPriceChangeReasonType> getNsiContractPriceChangeReason() {
            if (nsiContractPriceChangeReason == null) {
                nsiContractPriceChangeReason = new ArrayList<ZfcsNsiContractPriceChangeReasonType>();
            }
            return this.nsiContractPriceChangeReason;
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
     *         &lt;element name="nsiContractRefusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractRefusalReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractRefusalReason"
    })
    public static class NsiContractRefusalReasonList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractRefusalReasonType> nsiContractRefusalReason;

        /**
         * Gets the value of the nsiContractRefusalReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractRefusalReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractRefusalReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractRefusalReasonType }
         * 
         * 
         */
        public List<ZfcsNsiContractRefusalReasonType> getNsiContractRefusalReason() {
            if (nsiContractRefusalReason == null) {
                nsiContractRefusalReason = new ArrayList<ZfcsNsiContractRefusalReasonType>();
            }
            return this.nsiContractRefusalReason;
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
     *         &lt;element name="nsiContractReparationDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractReparationDoc"
    })
    public static class NsiContractReparationDoc {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractReparationDocType> nsiContractReparationDoc;

        /**
         * Gets the value of the nsiContractReparationDoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractReparationDoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractReparationDoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractReparationDocType }
         * 
         * 
         */
        public List<ZfcsNsiContractReparationDocType> getNsiContractReparationDoc() {
            if (nsiContractReparationDoc == null) {
                nsiContractReparationDoc = new ArrayList<ZfcsNsiContractReparationDocType>();
            }
            return this.nsiContractReparationDoc;
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
     *         &lt;element name="nsiContractSingleCustomerReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractSingleCustomerReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractSingleCustomerReason"
    })
    public static class NsiContractSingleCustomerReasonList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractSingleCustomerReasonType> nsiContractSingleCustomerReason;

        /**
         * Gets the value of the nsiContractSingleCustomerReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractSingleCustomerReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractSingleCustomerReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractSingleCustomerReasonType }
         * 
         * 
         */
        public List<ZfcsNsiContractSingleCustomerReasonType> getNsiContractSingleCustomerReason() {
            if (nsiContractSingleCustomerReason == null) {
                nsiContractSingleCustomerReason = new ArrayList<ZfcsNsiContractSingleCustomerReasonType>();
            }
            return this.nsiContractSingleCustomerReason;
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
     *         &lt;element name="nsiContractTerminationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiContractTerminationReason"
    })
    public static class NsiContractTerminationReason {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiContractTerminationReasonType> nsiContractTerminationReason;

        /**
         * Gets the value of the nsiContractTerminationReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiContractTerminationReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiContractTerminationReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiContractTerminationReasonType }
         * 
         * 
         */
        public List<ZfcsNsiContractTerminationReasonType> getNsiContractTerminationReason() {
            if (nsiContractTerminationReason == null) {
                nsiContractTerminationReason = new ArrayList<ZfcsNsiContractTerminationReasonType>();
            }
            return this.nsiContractTerminationReason;
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
     *         &lt;element name="nsiCurrency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCurrencyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiCurrency"
    })
    public static class NsiCurrencyList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiCurrencyType> nsiCurrency;

        /**
         * Gets the value of the nsiCurrency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiCurrency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiCurrency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiCurrencyType }
         * 
         * 
         */
        public List<ZfcsNsiCurrencyType> getNsiCurrency() {
            if (nsiCurrency == null) {
                nsiCurrency = new ArrayList<ZfcsNsiCurrencyType>();
            }
            return this.nsiCurrency;
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
     *         &lt;element name="nsiDeviationFactFoundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiDeviationFactFoundationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiDeviationFactFoundation"
    })
    public static class NsiDeviationFactFoundationList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiDeviationFactFoundationType> nsiDeviationFactFoundation;

        /**
         * Gets the value of the nsiDeviationFactFoundation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiDeviationFactFoundation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiDeviationFactFoundation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiDeviationFactFoundationType }
         * 
         * 
         */
        public List<ZfcsNsiDeviationFactFoundationType> getNsiDeviationFactFoundation() {
            if (nsiDeviationFactFoundation == null) {
                nsiDeviationFactFoundation = new ArrayList<ZfcsNsiDeviationFactFoundationType>();
            }
            return this.nsiDeviationFactFoundation;
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
     *         &lt;element name="nsiEvalCriterion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiEvalCriterionType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiEvalCriterion"
    })
    public static class NsiEvalCriterionList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiEvalCriterionType> nsiEvalCriterion;

        /**
         * Gets the value of the nsiEvalCriterion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiEvalCriterion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiEvalCriterion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiEvalCriterionType }
         * 
         * 
         */
        public List<ZfcsNsiEvalCriterionType> getNsiEvalCriterion() {
            if (nsiEvalCriterion == null) {
                nsiEvalCriterion = new ArrayList<ZfcsNsiEvalCriterionType>();
            }
            return this.nsiEvalCriterion;
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
     *         &lt;element name="nsiKBKBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKBKBudgetType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiKBKBudget"
    })
    public static class NsiKBKBudgetList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiKBKBudgetType> nsiKBKBudget;

        /**
         * Gets the value of the nsiKBKBudget property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiKBKBudget property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiKBKBudget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiKBKBudgetType }
         * 
         * 
         */
        public List<ZfcsNsiKBKBudgetType> getNsiKBKBudget() {
            if (nsiKBKBudget == null) {
                nsiKBKBudget = new ArrayList<ZfcsNsiKBKBudgetType>();
            }
            return this.nsiKBKBudget;
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
     *         &lt;element name="nsiKOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKOSGUType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiKOSGU"
    })
    public static class NsiKOSGUList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiKOSGUType> nsiKOSGU;

        /**
         * Gets the value of the nsiKOSGU property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiKOSGU property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiKOSGU().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiKOSGUType }
         * 
         * 
         */
        public List<ZfcsNsiKOSGUType> getNsiKOSGU() {
            if (nsiKOSGU == null) {
                nsiKOSGU = new ArrayList<ZfcsNsiKOSGUType>();
            }
            return this.nsiKOSGU;
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
     *         &lt;element name="nsiOffBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOffBudgetType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOffBudget"
    })
    public static class NsiOffBudgetList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOffBudgetType> nsiOffBudget;

        /**
         * Gets the value of the nsiOffBudget property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOffBudget property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOffBudget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOffBudgetType }
         * 
         * 
         */
        public List<ZfcsNsiOffBudgetType> getNsiOffBudget() {
            if (nsiOffBudget == null) {
                nsiOffBudget = new ArrayList<ZfcsNsiOffBudgetType>();
            }
            return this.nsiOffBudget;
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
     *         &lt;element name="nsiOKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKEIType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOKEI"
    })
    public static class NsiOKEIList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOKEIType> nsiOKEI;

        /**
         * Gets the value of the nsiOKEI property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOKEI property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOKEI().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOKEIType }
         * 
         * 
         */
        public List<ZfcsNsiOKEIType> getNsiOKEI() {
            if (nsiOKEI == null) {
                nsiOKEI = new ArrayList<ZfcsNsiOKEIType>();
            }
            return this.nsiOKEI;
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
     *         &lt;element name="nsiOKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKOPFType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOKOPF"
    })
    public static class NsiOKOPFList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOKOPFType> nsiOKOPF;

        /**
         * Gets the value of the nsiOKOPF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOKOPF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOKOPF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOKOPFType }
         * 
         * 
         */
        public List<ZfcsNsiOKOPFType> getNsiOKOPF() {
            if (nsiOKOPF == null) {
                nsiOKOPF = new ArrayList<ZfcsNsiOKOPFType>();
            }
            return this.nsiOKOPF;
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
     *         &lt;element name="nsiOKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKPD2Type" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOKPD2"
    })
    public static class NsiOKPD2List {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOKPD2Type> nsiOKPD2;

        /**
         * Gets the value of the nsiOKPD2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOKPD2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOKPD2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOKPD2Type }
         * 
         * 
         */
        public List<ZfcsNsiOKPD2Type> getNsiOKPD2() {
            if (nsiOKPD2 == null) {
                nsiOKPD2 = new ArrayList<ZfcsNsiOKPD2Type>();
            }
            return this.nsiOKPD2;
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
     *         &lt;element name="nsiOKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKPDType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOKPD"
    })
    public static class NsiOKPDList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOKPDType> nsiOKPD;

        /**
         * Gets the value of the nsiOKPD property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOKPD property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOKPD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOKPDType }
         * 
         * 
         */
        public List<ZfcsNsiOKPDType> getNsiOKPD() {
            if (nsiOKPD == null) {
                nsiOKPD = new ArrayList<ZfcsNsiOKPDType>();
            }
            return this.nsiOKPD;
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
     *         &lt;element name="nsiOKSM" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKSMType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOKSM"
    })
    public static class NsiOKSMList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOKSMType> nsiOKSM;

        /**
         * Gets the value of the nsiOKSM property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOKSM property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOKSM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOKSMType }
         * 
         * 
         */
        public List<ZfcsNsiOKSMType> getNsiOKSM() {
            if (nsiOKSM == null) {
                nsiOKSM = new ArrayList<ZfcsNsiOKSMType>();
            }
            return this.nsiOKSM;
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
     *         &lt;element name="nsiOKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKTMOType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOKTMO"
    })
    public static class NsiOKTMOList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOKTMOType> nsiOKTMO;

        /**
         * Gets the value of the nsiOKTMO property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOKTMO property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOKTMO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOKTMOType }
         * 
         * 
         */
        public List<ZfcsNsiOKTMOType> getNsiOKTMO() {
            if (nsiOKTMO == null) {
                nsiOKTMO = new ArrayList<ZfcsNsiOKTMOType>();
            }
            return this.nsiOKTMO;
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
     *         &lt;element name="nsiOKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKVED2Type" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOKVED2"
    })
    public static class NsiOKVED2List {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOKVED2Type> nsiOKVED2;

        /**
         * Gets the value of the nsiOKVED2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOKVED2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOKVED2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOKVED2Type }
         * 
         * 
         */
        public List<ZfcsNsiOKVED2Type> getNsiOKVED2() {
            if (nsiOKVED2 == null) {
                nsiOKVED2 = new ArrayList<ZfcsNsiOKVED2Type>();
            }
            return this.nsiOKVED2;
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
     *         &lt;element name="nsiOKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKVEDType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOKVED"
    })
    public static class NsiOKVEDList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOKVEDType> nsiOKVED;

        /**
         * Gets the value of the nsiOKVED property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOKVED property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOKVED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOKVEDType }
         * 
         * 
         */
        public List<ZfcsNsiOKVEDType> getNsiOKVED() {
            if (nsiOKVED == null) {
                nsiOKVED = new ArrayList<ZfcsNsiOKVEDType>();
            }
            return this.nsiOKVED;
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
     *         &lt;element name="nsiOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOrganization"
    })
    public static class NsiOrganizationList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOrganizationType> nsiOrganization;

        /**
         * Gets the value of the nsiOrganization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOrganization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOrganizationType }
         * 
         * 
         */
        public List<ZfcsNsiOrganizationType> getNsiOrganization() {
            if (nsiOrganization == null) {
                nsiOrganization = new ArrayList<ZfcsNsiOrganizationType>();
            }
            return this.nsiOrganization;
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
     *         &lt;element name="nsiOrganizationRights" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationRightsType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOrganizationRights"
    })
    public static class NsiOrganizationRightsList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOrganizationRightsType> nsiOrganizationRights;

        /**
         * Gets the value of the nsiOrganizationRights property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOrganizationRights property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOrganizationRights().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOrganizationRightsType }
         * 
         * 
         */
        public List<ZfcsNsiOrganizationRightsType> getNsiOrganizationRights() {
            if (nsiOrganizationRights == null) {
                nsiOrganizationRights = new ArrayList<ZfcsNsiOrganizationRightsType>();
            }
            return this.nsiOrganizationRights;
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
     *         &lt;element name="nsiOrganizationType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationTypesType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiOrganizationType"
    })
    public static class NsiOrganizationTypesList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiOrganizationTypesType> nsiOrganizationType;

        /**
         * Gets the value of the nsiOrganizationType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiOrganizationType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiOrganizationType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiOrganizationTypesType }
         * 
         * 
         */
        public List<ZfcsNsiOrganizationTypesType> getNsiOrganizationType() {
            if (nsiOrganizationType == null) {
                nsiOrganizationType = new ArrayList<ZfcsNsiOrganizationTypesType>();
            }
            return this.nsiOrganizationType;
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
     *         &lt;element name="nsiPlacingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiPlacingWay"
    })
    public static class NsiPlacingWayList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiPlacingWayType> nsiPlacingWay;

        /**
         * Gets the value of the nsiPlacingWay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiPlacingWay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiPlacingWay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPlacingWayType }
         * 
         * 
         */
        public List<ZfcsNsiPlacingWayType> getNsiPlacingWay() {
            if (nsiPlacingWay == null) {
                nsiPlacingWay = new ArrayList<ZfcsNsiPlacingWayType>();
            }
            return this.nsiPlacingWay;
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
     *         &lt;element name="nsiPlanPositionChangeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlanPositionChangeReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiPlanPositionChangeReason"
    })
    public static class NsiPlanPositionChangeReasonList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiPlanPositionChangeReasonType> nsiPlanPositionChangeReason;

        /**
         * Gets the value of the nsiPlanPositionChangeReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiPlanPositionChangeReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiPlanPositionChangeReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPlanPositionChangeReasonType }
         * 
         * 
         */
        public List<ZfcsNsiPlanPositionChangeReasonType> getNsiPlanPositionChangeReason() {
            if (nsiPlanPositionChangeReason == null) {
                nsiPlanPositionChangeReason = new ArrayList<ZfcsNsiPlanPositionChangeReasonType>();
            }
            return this.nsiPlanPositionChangeReason;
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
     *         &lt;element name="nsiPublicDiscussionDecision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPublicDiscussionDecisionsType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiPublicDiscussionDecision"
    })
    public static class NsiPublicDiscussionDecisions {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiPublicDiscussionDecisionsType> nsiPublicDiscussionDecision;

        /**
         * Gets the value of the nsiPublicDiscussionDecision property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiPublicDiscussionDecision property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiPublicDiscussionDecision().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPublicDiscussionDecisionsType }
         * 
         * 
         */
        public List<ZfcsNsiPublicDiscussionDecisionsType> getNsiPublicDiscussionDecision() {
            if (nsiPublicDiscussionDecision == null) {
                nsiPublicDiscussionDecision = new ArrayList<ZfcsNsiPublicDiscussionDecisionsType>();
            }
            return this.nsiPublicDiscussionDecision;
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
     *         &lt;element name="nsiPublicDiscussionQuestionnarie" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPublicDiscussionQuestionnarieType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiPublicDiscussionQuestionnarie"
    })
    public static class NsiPublicDiscussionQuestionnaries {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiPublicDiscussionQuestionnarieType> nsiPublicDiscussionQuestionnarie;

        /**
         * Gets the value of the nsiPublicDiscussionQuestionnarie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiPublicDiscussionQuestionnarie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiPublicDiscussionQuestionnarie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPublicDiscussionQuestionnarieType }
         * 
         * 
         */
        public List<ZfcsNsiPublicDiscussionQuestionnarieType> getNsiPublicDiscussionQuestionnarie() {
            if (nsiPublicDiscussionQuestionnarie == null) {
                nsiPublicDiscussionQuestionnarie = new ArrayList<ZfcsNsiPublicDiscussionQuestionnarieType>();
            }
            return this.nsiPublicDiscussionQuestionnarie;
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
     *         &lt;element name="nsiPurchaseDocumentTypes" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchaseDocumentTypesType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiPurchaseDocumentTypes"
    })
    public static class NsiPurchaseDocumentTypesList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiPurchaseDocumentTypesType> nsiPurchaseDocumentTypes;

        /**
         * Gets the value of the nsiPurchaseDocumentTypes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiPurchaseDocumentTypes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiPurchaseDocumentTypes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPurchaseDocumentTypesType }
         * 
         * 
         */
        public List<ZfcsNsiPurchaseDocumentTypesType> getNsiPurchaseDocumentTypes() {
            if (nsiPurchaseDocumentTypes == null) {
                nsiPurchaseDocumentTypes = new ArrayList<ZfcsNsiPurchaseDocumentTypesType>();
            }
            return this.nsiPurchaseDocumentTypes;
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
     *         &lt;element name="nsiPurchasePreference" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchasePreferencesType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiPurchasePreference"
    })
    public static class NsiPurchasePreferenceList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiPurchasePreferencesType> nsiPurchasePreference;

        /**
         * Gets the value of the nsiPurchasePreference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiPurchasePreference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiPurchasePreference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPurchasePreferencesType }
         * 
         * 
         */
        public List<ZfcsNsiPurchasePreferencesType> getNsiPurchasePreference() {
            if (nsiPurchasePreference == null) {
                nsiPurchasePreference = new ArrayList<ZfcsNsiPurchasePreferencesType>();
            }
            return this.nsiPurchasePreference;
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
     *         &lt;element name="nsiPurchaseRejectReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchaseRejectReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiPurchaseRejectReason"
    })
    public static class NsiPurchaseRejectReasonList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiPurchaseRejectReasonType> nsiPurchaseRejectReason;

        /**
         * Gets the value of the nsiPurchaseRejectReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiPurchaseRejectReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiPurchaseRejectReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPurchaseRejectReasonType }
         * 
         * 
         */
        public List<ZfcsNsiPurchaseRejectReasonType> getNsiPurchaseRejectReason() {
            if (nsiPurchaseRejectReason == null) {
                nsiPurchaseRejectReason = new ArrayList<ZfcsNsiPurchaseRejectReasonType>();
            }
            return this.nsiPurchaseRejectReason;
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
     *         &lt;element name="nsiUser" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiUserType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiUser"
    })
    public static class NsiUserList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/export/1")
        protected List<ZfcsNsiUserType> nsiUser;

        /**
         * Gets the value of the nsiUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiUserType }
         * 
         * 
         */
        public List<ZfcsNsiUserType> getNsiUser() {
            if (nsiUser == null) {
                nsiUser = new ArrayList<ZfcsNsiUserType>();
            }
            return this.nsiUser;
        }

    }

}
