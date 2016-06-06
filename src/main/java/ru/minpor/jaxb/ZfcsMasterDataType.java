
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Набор элементов справочников и классификаторов
 * 
 * <p>Java class for zfcs_masterDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_masterDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="nsiBankGuaranteeRefusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBankGuaranteeRefusalReasonType"/>
 *         &lt;element name="nsiBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBudgetType"/>
 *         &lt;element name="nsiCalendarDays" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCalendarDaysType"/>
 *         &lt;element name="nsiCommission" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCommissionType"/>
 *         &lt;element name="nsiCommissionRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCommissionRoleType"/>
 *         &lt;element name="nsiContractPriceChangeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPriceChangeReasonType"/>
 *         &lt;element name="nsiContractRefusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractRefusalReasonType"/>
 *         &lt;element name="nsiContractSingleCustomerReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractSingleCustomerReasonType"/>
 *         &lt;element name="nsiContractTerminationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonType"/>
 *         &lt;element name="nsiContractModificationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonType"/>
 *         &lt;element name="nsiContractExecutionDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocType"/>
 *         &lt;element name="nsiContractReparationDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocType"/>
 *         &lt;element name="nsiContractPenaltyReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonType"/>
 *         &lt;element name="nsiContractOKOPFExtraBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractOKOPFExtraBudgetType"/>
 *         &lt;element name="nsiContractCurrencyCBRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractCurrencyCBRFType"/>
 *         &lt;element name="nsiEvalCriterion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiEvalCriterionType"/>
 *         &lt;element name="nsiKBKBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKBKBudgetType"/>
 *         &lt;element name="nsiKOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKOSGUType"/>
 *         &lt;element name="nsiOKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKOPFType"/>
 *         &lt;element name="nsiOKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKPDType"/>
 *         &lt;element name="nsiOKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKVEDType"/>
 *         &lt;element name="nsiOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationType"/>
 *         &lt;element name="nsiOrganizationRights" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationRightsType"/>
 *         &lt;element name="nsiOrganizationType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationTypesType"/>
 *         &lt;element name="nsiPlacingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayType"/>
 *         &lt;element name="nsiPlanPositionChangeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlanPositionChangeReasonType"/>
 *         &lt;element name="nsiPurchaseDocumentTypes" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchaseDocumentTypesType"/>
 *         &lt;element name="nsiPurchasePreferences" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchasePreferencesType"/>
 *         &lt;element name="nsiPurchaseRejectReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchaseRejectReasonType"/>
 *         &lt;element name="nsiUser" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiUserType"/>
 *         &lt;element name="nsiAbandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiAbandonedReasonType"/>
 *       &lt;/choice>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_masterDataType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "nsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays"
})
public class ZfcsMasterDataType {

    @XmlElements({
        @XmlElement(name = "nsiBankGuaranteeRefusalReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiBankGuaranteeRefusalReasonType.class),
        @XmlElement(name = "nsiBudget", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiBudgetType.class),
        @XmlElement(name = "nsiCalendarDays", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiCalendarDaysType.class),
        @XmlElement(name = "nsiCommission", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiCommissionType.class),
        @XmlElement(name = "nsiCommissionRole", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiCommissionRoleType.class),
        @XmlElement(name = "nsiContractPriceChangeReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractPriceChangeReasonType.class),
        @XmlElement(name = "nsiContractRefusalReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractRefusalReasonType.class),
        @XmlElement(name = "nsiContractSingleCustomerReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractSingleCustomerReasonType.class),
        @XmlElement(name = "nsiContractTerminationReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractTerminationReasonType.class),
        @XmlElement(name = "nsiContractModificationReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractModificationReasonType.class),
        @XmlElement(name = "nsiContractExecutionDoc", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractExecutionDocType.class),
        @XmlElement(name = "nsiContractReparationDoc", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractReparationDocType.class),
        @XmlElement(name = "nsiContractPenaltyReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractPenaltyReasonType.class),
        @XmlElement(name = "nsiContractOKOPFExtraBudget", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractOKOPFExtraBudgetType.class),
        @XmlElement(name = "nsiContractCurrencyCBRF", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiContractCurrencyCBRFType.class),
        @XmlElement(name = "nsiEvalCriterion", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiEvalCriterionType.class),
        @XmlElement(name = "nsiKBKBudget", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiKBKBudgetType.class),
        @XmlElement(name = "nsiKOSGU", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiKOSGUType.class),
        @XmlElement(name = "nsiOKOPF", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiOKOPFType.class),
        @XmlElement(name = "nsiOKPD", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiOKPDType.class),
        @XmlElement(name = "nsiOKVED", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiOKVEDType.class),
        @XmlElement(name = "nsiOrganization", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiOrganizationType.class),
        @XmlElement(name = "nsiOrganizationRights", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiOrganizationRightsType.class),
        @XmlElement(name = "nsiOrganizationType", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiOrganizationTypesType.class),
        @XmlElement(name = "nsiPlacingWay", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiPlacingWayType.class),
        @XmlElement(name = "nsiPlanPositionChangeReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiPlanPositionChangeReasonType.class),
        @XmlElement(name = "nsiPurchaseDocumentTypes", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiPurchaseDocumentTypesType.class),
        @XmlElement(name = "nsiPurchasePreferences", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiPurchasePreferencesType.class),
        @XmlElement(name = "nsiPurchaseRejectReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiPurchaseRejectReasonType.class),
        @XmlElement(name = "nsiUser", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiUserType.class),
        @XmlElement(name = "nsiAbandonedReason", namespace = "http://zakupki.gov.ru/oos/types/1", type = ZfcsNsiAbandonedReasonType.class)
    })
    protected List<Object> nsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the nsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsNsiBankGuaranteeRefusalReasonType }
     * {@link ZfcsNsiBudgetType }
     * {@link ZfcsNsiCalendarDaysType }
     * {@link ZfcsNsiCommissionType }
     * {@link ZfcsNsiCommissionRoleType }
     * {@link ZfcsNsiContractPriceChangeReasonType }
     * {@link ZfcsNsiContractRefusalReasonType }
     * {@link ZfcsNsiContractSingleCustomerReasonType }
     * {@link ZfcsNsiContractTerminationReasonType }
     * {@link ZfcsNsiContractModificationReasonType }
     * {@link ZfcsNsiContractExecutionDocType }
     * {@link ZfcsNsiContractReparationDocType }
     * {@link ZfcsNsiContractPenaltyReasonType }
     * {@link ZfcsNsiContractOKOPFExtraBudgetType }
     * {@link ZfcsNsiContractCurrencyCBRFType }
     * {@link ZfcsNsiEvalCriterionType }
     * {@link ZfcsNsiKBKBudgetType }
     * {@link ZfcsNsiKOSGUType }
     * {@link ZfcsNsiOKOPFType }
     * {@link ZfcsNsiOKPDType }
     * {@link ZfcsNsiOKVEDType }
     * {@link ZfcsNsiOrganizationType }
     * {@link ZfcsNsiOrganizationRightsType }
     * {@link ZfcsNsiOrganizationTypesType }
     * {@link ZfcsNsiPlacingWayType }
     * {@link ZfcsNsiPlanPositionChangeReasonType }
     * {@link ZfcsNsiPurchaseDocumentTypesType }
     * {@link ZfcsNsiPurchasePreferencesType }
     * {@link ZfcsNsiPurchaseRejectReasonType }
     * {@link ZfcsNsiUserType }
     * {@link ZfcsNsiAbandonedReasonType }
     * 
     * 
     */
    public List<Object> getNsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays() {
        if (nsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays == null) {
            nsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays = new ArrayList<Object>();
        }
        return this.nsiBankGuaranteeRefusalReasonOrNsiBudgetOrNsiCalendarDays;
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

}
