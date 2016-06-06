
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_nsiBusinessControlDocumentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_nsiBusinessControlDocumentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contract"/>
 *     &lt;enumeration value="contractCancel"/>
 *     &lt;enumeration value="contractProcedure"/>
 *     &lt;enumeration value="contractProcedureCancel"/>
 *     &lt;enumeration value="bankGuarantee"/>
 *     &lt;enumeration value="bankGuaranteeInvalid"/>
 *     &lt;enumeration value="bankGuaranteeRefusal"/>
 *     &lt;enumeration value="bankGuaranteeRefusalInvalid"/>
 *     &lt;enumeration value="bankGuaranteeTermination"/>
 *     &lt;enumeration value="bankGuaranteeTerminationInvalid"/>
 *     &lt;enumeration value="bankGuaranteeReturn"/>
 *     &lt;enumeration value="bankGuaranteeReturnInvalid"/>
 *     &lt;enumeration value="complaint"/>
 *     &lt;enumeration value="complaintGroup"/>
 *     &lt;enumeration value="complaintCancel"/>
 *     &lt;enumeration value="tenderSuspension"/>
 *     &lt;enumeration value="checkResult"/>
 *     &lt;enumeration value="checkResultCancel"/>
 *     &lt;enumeration value="unfairSupplier"/>
 *     &lt;enumeration value="unplannedCheck"/>
 *     &lt;enumeration value="unplannedCheckCancel"/>
 *     &lt;enumeration value="checkPlan"/>
 *     &lt;enumeration value="tenderPlan"/>
 *     &lt;enumeration value="tenderPlanChange"/>
 *     &lt;enumeration value="tenderPlanUnstructured"/>
 *     &lt;enumeration value="tenderPlanCancel"/>
 *     &lt;enumeration value="sketchPlan"/>
 *     &lt;enumeration value="sketchPlanExecution"/>
 *     &lt;enumeration value="fcsNotificationEF"/>
 *     &lt;enumeration value="fcsProtocolEF1"/>
 *     &lt;enumeration value="fcsProtocolEF2"/>
 *     &lt;enumeration value="fcsProtocolEF3"/>
 *     &lt;enumeration value="fcsProtocolEFSingleApp"/>
 *     &lt;enumeration value="fcsProtocolEFSinglePart"/>
 *     &lt;enumeration value="fcsProtocolEFInvalidation"/>
 *     &lt;enumeration value="fcsNotificationEP"/>
 *     &lt;enumeration value="fcsNotificationOK"/>
 *     &lt;enumeration value="fcsPurchaseProlongationOK"/>
 *     &lt;enumeration value="fcsProtocolOK1"/>
 *     &lt;enumeration value="fcsProtocolOK2"/>
 *     &lt;enumeration value="fcsProtocolOKSingleApp"/>
 *     &lt;enumeration value="fcsNotificationOKD"/>
 *     &lt;enumeration value="fcsProtocolOKD1"/>
 *     &lt;enumeration value="fcsProtocolOKD2"/>
 *     &lt;enumeration value="fcsProtocolOKD3"/>
 *     &lt;enumeration value="fcsProtocolOKD4"/>
 *     &lt;enumeration value="fcsProtocolOKD5"/>
 *     &lt;enumeration value="fcsProtocolOKDSingleApp"/>
 *     &lt;enumeration value="fcsNotificationOKOU"/>
 *     &lt;enumeration value="fcsProtocolOKOU1"/>
 *     &lt;enumeration value="fcsProtocolOKOU2"/>
 *     &lt;enumeration value="fcsProtocolOKOU3"/>
 *     &lt;enumeration value="fcsProtocolOKOUSingleApp"/>
 *     &lt;enumeration value="fcsNotificationPO"/>
 *     &lt;enumeration value="fcsProtocolPO"/>
 *     &lt;enumeration value="fcsNotificationZakA"/>
 *     &lt;enumeration value="fcsNotificationZakK"/>
 *     &lt;enumeration value="fcsNotificationZakKD"/>
 *     &lt;enumeration value="fcsNotificationZakKOU"/>
 *     &lt;enumeration value="fcsNotificationZKBI"/>
 *     &lt;enumeration value="fcsProtocolZKBI"/>
 *     &lt;enumeration value="fcsNotificationZK"/>
 *     &lt;enumeration value="fcsPurchaseProlongationZK"/>
 *     &lt;enumeration value="fcsProtocolZK"/>
 *     &lt;enumeration value="fcsProtocolZKAfterProlong"/>
 *     &lt;enumeration value="fcsNotificationZP"/>
 *     &lt;enumeration value="fcsProtocolZPExtract"/>
 *     &lt;enumeration value="fcsProtocolZP"/>
 *     &lt;enumeration value="fcsProtocolZPFinal"/>
 *     &lt;enumeration value="fcsProtocolCancel"/>
 *     &lt;enumeration value="fcsNotificationLotCancel"/>
 *     &lt;enumeration value="fcsNotificationLotChange"/>
 *     &lt;enumeration value="fcsNotificationCancel"/>
 *     &lt;enumeration value="fcsNotificationCancelFailure"/>
 *     &lt;enumeration value="fcsNotificationOrgChange"/>
 *     &lt;enumeration value="fcsProtocolEvasion"/>
 *     &lt;enumeration value="protocolDeviation"/>
 *     &lt;enumeration value="fcsNotificationEFDateChange"/>
 *     &lt;enumeration value="fcsContractSign"/>
 *     &lt;enumeration value="fcsClarificationRequest"/>
 *     &lt;enumeration value="fcsClarification"/>
 *     &lt;enumeration value="fcsTimeEF"/>
 *     &lt;enumeration value="masterData"/>
 *     &lt;enumeration value="purchaseDocument"/>
 *     &lt;enumeration value="purchaseDocumentCancel"/>
 *     &lt;enumeration value="fcsPlacementResult"/>
 *     &lt;enumeration value="publicDiscussionLargePurchase"/>
 *     &lt;enumeration value="publicDiscussionAnwser"/>
 *     &lt;enumeration value="publicDiscussionProtocol"/>
 *     &lt;enumeration value="customerReportContractExecution"/>
 *     &lt;enumeration value="customerReportContractExecutionInvalid"/>
 *     &lt;enumeration value="customerReportSmallScaleBusiness"/>
 *     &lt;enumeration value="customerReportSmallScaleBusinessInvalid"/>
 *     &lt;enumeration value="customerReportSingleContractor"/>
 *     &lt;enumeration value="customerReportSingleContractorInvalid"/>
 *     &lt;enumeration value="customerReportBigProjectMonitoring"/>
 *     &lt;enumeration value="customerReportBigProjectMonitoringInvalid"/>
 *     &lt;enumeration value="addInfo"/>
 *     &lt;enumeration value="addInfoInvalid"/>
 *     &lt;enumeration value="requestForQuotation"/>
 *     &lt;enumeration value="requestForQuotationCancel"/>
 *     &lt;enumeration value="auditResult"/>
 *     &lt;enumeration value="eventPlan"/>
 *     &lt;enumeration value="eventResult"/>
 *     &lt;enumeration value="eventResultCancel"/>
 *     &lt;enumeration value="unplannedEvent"/>
 *     &lt;enumeration value="unplannedEventCancel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_nsiBusinessControlDocumentEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsNsiBusinessControlDocumentEnum {

    @XmlEnumValue("contract")
    CONTRACT("contract"),
    @XmlEnumValue("contractCancel")
    CONTRACT_CANCEL("contractCancel"),
    @XmlEnumValue("contractProcedure")
    CONTRACT_PROCEDURE("contractProcedure"),
    @XmlEnumValue("contractProcedureCancel")
    CONTRACT_PROCEDURE_CANCEL("contractProcedureCancel"),
    @XmlEnumValue("bankGuarantee")
    BANK_GUARANTEE("bankGuarantee"),
    @XmlEnumValue("bankGuaranteeInvalid")
    BANK_GUARANTEE_INVALID("bankGuaranteeInvalid"),
    @XmlEnumValue("bankGuaranteeRefusal")
    BANK_GUARANTEE_REFUSAL("bankGuaranteeRefusal"),
    @XmlEnumValue("bankGuaranteeRefusalInvalid")
    BANK_GUARANTEE_REFUSAL_INVALID("bankGuaranteeRefusalInvalid"),
    @XmlEnumValue("bankGuaranteeTermination")
    BANK_GUARANTEE_TERMINATION("bankGuaranteeTermination"),
    @XmlEnumValue("bankGuaranteeTerminationInvalid")
    BANK_GUARANTEE_TERMINATION_INVALID("bankGuaranteeTerminationInvalid"),
    @XmlEnumValue("bankGuaranteeReturn")
    BANK_GUARANTEE_RETURN("bankGuaranteeReturn"),
    @XmlEnumValue("bankGuaranteeReturnInvalid")
    BANK_GUARANTEE_RETURN_INVALID("bankGuaranteeReturnInvalid"),
    @XmlEnumValue("complaint")
    COMPLAINT("complaint"),
    @XmlEnumValue("complaintGroup")
    COMPLAINT_GROUP("complaintGroup"),
    @XmlEnumValue("complaintCancel")
    COMPLAINT_CANCEL("complaintCancel"),
    @XmlEnumValue("tenderSuspension")
    TENDER_SUSPENSION("tenderSuspension"),
    @XmlEnumValue("checkResult")
    CHECK_RESULT("checkResult"),
    @XmlEnumValue("checkResultCancel")
    CHECK_RESULT_CANCEL("checkResultCancel"),
    @XmlEnumValue("unfairSupplier")
    UNFAIR_SUPPLIER("unfairSupplier"),
    @XmlEnumValue("unplannedCheck")
    UNPLANNED_CHECK("unplannedCheck"),
    @XmlEnumValue("unplannedCheckCancel")
    UNPLANNED_CHECK_CANCEL("unplannedCheckCancel"),
    @XmlEnumValue("checkPlan")
    CHECK_PLAN("checkPlan"),
    @XmlEnumValue("tenderPlan")
    TENDER_PLAN("tenderPlan"),
    @XmlEnumValue("tenderPlanChange")
    TENDER_PLAN_CHANGE("tenderPlanChange"),
    @XmlEnumValue("tenderPlanUnstructured")
    TENDER_PLAN_UNSTRUCTURED("tenderPlanUnstructured"),
    @XmlEnumValue("tenderPlanCancel")
    TENDER_PLAN_CANCEL("tenderPlanCancel"),
    @XmlEnumValue("sketchPlan")
    SKETCH_PLAN("sketchPlan"),
    @XmlEnumValue("sketchPlanExecution")
    SKETCH_PLAN_EXECUTION("sketchPlanExecution"),
    @XmlEnumValue("fcsNotificationEF")
    FCS_NOTIFICATION_EF("fcsNotificationEF"),
    @XmlEnumValue("fcsProtocolEF1")
    FCS_PROTOCOL_EF_1("fcsProtocolEF1"),
    @XmlEnumValue("fcsProtocolEF2")
    FCS_PROTOCOL_EF_2("fcsProtocolEF2"),
    @XmlEnumValue("fcsProtocolEF3")
    FCS_PROTOCOL_EF_3("fcsProtocolEF3"),
    @XmlEnumValue("fcsProtocolEFSingleApp")
    FCS_PROTOCOL_EF_SINGLE_APP("fcsProtocolEFSingleApp"),
    @XmlEnumValue("fcsProtocolEFSinglePart")
    FCS_PROTOCOL_EF_SINGLE_PART("fcsProtocolEFSinglePart"),
    @XmlEnumValue("fcsProtocolEFInvalidation")
    FCS_PROTOCOL_EF_INVALIDATION("fcsProtocolEFInvalidation"),
    @XmlEnumValue("fcsNotificationEP")
    FCS_NOTIFICATION_EP("fcsNotificationEP"),
    @XmlEnumValue("fcsNotificationOK")
    FCS_NOTIFICATION_OK("fcsNotificationOK"),
    @XmlEnumValue("fcsPurchaseProlongationOK")
    FCS_PURCHASE_PROLONGATION_OK("fcsPurchaseProlongationOK"),
    @XmlEnumValue("fcsProtocolOK1")
    FCS_PROTOCOL_OK_1("fcsProtocolOK1"),
    @XmlEnumValue("fcsProtocolOK2")
    FCS_PROTOCOL_OK_2("fcsProtocolOK2"),
    @XmlEnumValue("fcsProtocolOKSingleApp")
    FCS_PROTOCOL_OK_SINGLE_APP("fcsProtocolOKSingleApp"),
    @XmlEnumValue("fcsNotificationOKD")
    FCS_NOTIFICATION_OKD("fcsNotificationOKD"),
    @XmlEnumValue("fcsProtocolOKD1")
    FCS_PROTOCOL_OKD_1("fcsProtocolOKD1"),
    @XmlEnumValue("fcsProtocolOKD2")
    FCS_PROTOCOL_OKD_2("fcsProtocolOKD2"),
    @XmlEnumValue("fcsProtocolOKD3")
    FCS_PROTOCOL_OKD_3("fcsProtocolOKD3"),
    @XmlEnumValue("fcsProtocolOKD4")
    FCS_PROTOCOL_OKD_4("fcsProtocolOKD4"),
    @XmlEnumValue("fcsProtocolOKD5")
    FCS_PROTOCOL_OKD_5("fcsProtocolOKD5"),
    @XmlEnumValue("fcsProtocolOKDSingleApp")
    FCS_PROTOCOL_OKD_SINGLE_APP("fcsProtocolOKDSingleApp"),
    @XmlEnumValue("fcsNotificationOKOU")
    FCS_NOTIFICATION_OKOU("fcsNotificationOKOU"),
    @XmlEnumValue("fcsProtocolOKOU1")
    FCS_PROTOCOL_OKOU_1("fcsProtocolOKOU1"),
    @XmlEnumValue("fcsProtocolOKOU2")
    FCS_PROTOCOL_OKOU_2("fcsProtocolOKOU2"),
    @XmlEnumValue("fcsProtocolOKOU3")
    FCS_PROTOCOL_OKOU_3("fcsProtocolOKOU3"),
    @XmlEnumValue("fcsProtocolOKOUSingleApp")
    FCS_PROTOCOL_OKOU_SINGLE_APP("fcsProtocolOKOUSingleApp"),
    @XmlEnumValue("fcsNotificationPO")
    FCS_NOTIFICATION_PO("fcsNotificationPO"),
    @XmlEnumValue("fcsProtocolPO")
    FCS_PROTOCOL_PO("fcsProtocolPO"),
    @XmlEnumValue("fcsNotificationZakA")
    FCS_NOTIFICATION_ZAK_A("fcsNotificationZakA"),
    @XmlEnumValue("fcsNotificationZakK")
    FCS_NOTIFICATION_ZAK_K("fcsNotificationZakK"),
    @XmlEnumValue("fcsNotificationZakKD")
    FCS_NOTIFICATION_ZAK_KD("fcsNotificationZakKD"),
    @XmlEnumValue("fcsNotificationZakKOU")
    FCS_NOTIFICATION_ZAK_KOU("fcsNotificationZakKOU"),
    @XmlEnumValue("fcsNotificationZKBI")
    FCS_NOTIFICATION_ZKBI("fcsNotificationZKBI"),
    @XmlEnumValue("fcsProtocolZKBI")
    FCS_PROTOCOL_ZKBI("fcsProtocolZKBI"),
    @XmlEnumValue("fcsNotificationZK")
    FCS_NOTIFICATION_ZK("fcsNotificationZK"),
    @XmlEnumValue("fcsPurchaseProlongationZK")
    FCS_PURCHASE_PROLONGATION_ZK("fcsPurchaseProlongationZK"),
    @XmlEnumValue("fcsProtocolZK")
    FCS_PROTOCOL_ZK("fcsProtocolZK"),
    @XmlEnumValue("fcsProtocolZKAfterProlong")
    FCS_PROTOCOL_ZK_AFTER_PROLONG("fcsProtocolZKAfterProlong"),
    @XmlEnumValue("fcsNotificationZP")
    FCS_NOTIFICATION_ZP("fcsNotificationZP"),
    @XmlEnumValue("fcsProtocolZPExtract")
    FCS_PROTOCOL_ZP_EXTRACT("fcsProtocolZPExtract"),
    @XmlEnumValue("fcsProtocolZP")
    FCS_PROTOCOL_ZP("fcsProtocolZP"),
    @XmlEnumValue("fcsProtocolZPFinal")
    FCS_PROTOCOL_ZP_FINAL("fcsProtocolZPFinal"),
    @XmlEnumValue("fcsProtocolCancel")
    FCS_PROTOCOL_CANCEL("fcsProtocolCancel"),
    @XmlEnumValue("fcsNotificationLotCancel")
    FCS_NOTIFICATION_LOT_CANCEL("fcsNotificationLotCancel"),
    @XmlEnumValue("fcsNotificationLotChange")
    FCS_NOTIFICATION_LOT_CHANGE("fcsNotificationLotChange"),
    @XmlEnumValue("fcsNotificationCancel")
    FCS_NOTIFICATION_CANCEL("fcsNotificationCancel"),
    @XmlEnumValue("fcsNotificationCancelFailure")
    FCS_NOTIFICATION_CANCEL_FAILURE("fcsNotificationCancelFailure"),
    @XmlEnumValue("fcsNotificationOrgChange")
    FCS_NOTIFICATION_ORG_CHANGE("fcsNotificationOrgChange"),
    @XmlEnumValue("fcsProtocolEvasion")
    FCS_PROTOCOL_EVASION("fcsProtocolEvasion"),
    @XmlEnumValue("protocolDeviation")
    PROTOCOL_DEVIATION("protocolDeviation"),
    @XmlEnumValue("fcsNotificationEFDateChange")
    FCS_NOTIFICATION_EF_DATE_CHANGE("fcsNotificationEFDateChange"),
    @XmlEnumValue("fcsContractSign")
    FCS_CONTRACT_SIGN("fcsContractSign"),
    @XmlEnumValue("fcsClarificationRequest")
    FCS_CLARIFICATION_REQUEST("fcsClarificationRequest"),
    @XmlEnumValue("fcsClarification")
    FCS_CLARIFICATION("fcsClarification"),
    @XmlEnumValue("fcsTimeEF")
    FCS_TIME_EF("fcsTimeEF"),
    @XmlEnumValue("masterData")
    MASTER_DATA("masterData"),
    @XmlEnumValue("purchaseDocument")
    PURCHASE_DOCUMENT("purchaseDocument"),
    @XmlEnumValue("purchaseDocumentCancel")
    PURCHASE_DOCUMENT_CANCEL("purchaseDocumentCancel"),
    @XmlEnumValue("fcsPlacementResult")
    FCS_PLACEMENT_RESULT("fcsPlacementResult"),
    @XmlEnumValue("publicDiscussionLargePurchase")
    PUBLIC_DISCUSSION_LARGE_PURCHASE("publicDiscussionLargePurchase"),
    @XmlEnumValue("publicDiscussionAnwser")
    PUBLIC_DISCUSSION_ANWSER("publicDiscussionAnwser"),
    @XmlEnumValue("publicDiscussionProtocol")
    PUBLIC_DISCUSSION_PROTOCOL("publicDiscussionProtocol"),
    @XmlEnumValue("customerReportContractExecution")
    CUSTOMER_REPORT_CONTRACT_EXECUTION("customerReportContractExecution"),
    @XmlEnumValue("customerReportContractExecutionInvalid")
    CUSTOMER_REPORT_CONTRACT_EXECUTION_INVALID("customerReportContractExecutionInvalid"),
    @XmlEnumValue("customerReportSmallScaleBusiness")
    CUSTOMER_REPORT_SMALL_SCALE_BUSINESS("customerReportSmallScaleBusiness"),
    @XmlEnumValue("customerReportSmallScaleBusinessInvalid")
    CUSTOMER_REPORT_SMALL_SCALE_BUSINESS_INVALID("customerReportSmallScaleBusinessInvalid"),
    @XmlEnumValue("customerReportSingleContractor")
    CUSTOMER_REPORT_SINGLE_CONTRACTOR("customerReportSingleContractor"),
    @XmlEnumValue("customerReportSingleContractorInvalid")
    CUSTOMER_REPORT_SINGLE_CONTRACTOR_INVALID("customerReportSingleContractorInvalid"),
    @XmlEnumValue("customerReportBigProjectMonitoring")
    CUSTOMER_REPORT_BIG_PROJECT_MONITORING("customerReportBigProjectMonitoring"),
    @XmlEnumValue("customerReportBigProjectMonitoringInvalid")
    CUSTOMER_REPORT_BIG_PROJECT_MONITORING_INVALID("customerReportBigProjectMonitoringInvalid"),
    @XmlEnumValue("addInfo")
    ADD_INFO("addInfo"),
    @XmlEnumValue("addInfoInvalid")
    ADD_INFO_INVALID("addInfoInvalid"),
    @XmlEnumValue("requestForQuotation")
    REQUEST_FOR_QUOTATION("requestForQuotation"),
    @XmlEnumValue("requestForQuotationCancel")
    REQUEST_FOR_QUOTATION_CANCEL("requestForQuotationCancel"),
    @XmlEnumValue("auditResult")
    AUDIT_RESULT("auditResult"),
    @XmlEnumValue("eventPlan")
    EVENT_PLAN("eventPlan"),
    @XmlEnumValue("eventResult")
    EVENT_RESULT("eventResult"),
    @XmlEnumValue("eventResultCancel")
    EVENT_RESULT_CANCEL("eventResultCancel"),
    @XmlEnumValue("unplannedEvent")
    UNPLANNED_EVENT("unplannedEvent"),
    @XmlEnumValue("unplannedEventCancel")
    UNPLANNED_EVENT_CANCEL("unplannedEventCancel");
    private final String value;

    ZfcsNsiBusinessControlDocumentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsNsiBusinessControlDocumentEnum fromValue(String v) {
        for (ZfcsNsiBusinessControlDocumentEnum c: ZfcsNsiBusinessControlDocumentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
