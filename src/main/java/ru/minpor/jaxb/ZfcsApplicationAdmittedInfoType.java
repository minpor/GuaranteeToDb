
package ru.minpor.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о допуске заявки в протоколах рассмотрения и оценки заявок на участие в открытых конкурсах
 * 
 * <p>Java class for zfcs_applicationAdmittedInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_applicationAdmittedInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
 *         &lt;sequence>
 *           &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
 *           &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *           &lt;element name="conditionsScoring">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="conditionScoring" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;choice>
 *                                 &lt;element name="costCriterion">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
 *                                           &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                           &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
 *                                           &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                           &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                           &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
 *                                           &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
 *                                           &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                           &lt;element name="spelledOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                           &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="qualitativeCriterion">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;choice>
 *                                             &lt;element name="indicator" maxOccurs="unbounded">
 *                                               &lt;complexType>
 *                                                 &lt;complexContent>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                     &lt;sequence>
 *                                                       &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                       &lt;element name="indicatorScoring" maxOccurs="unbounded">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;sequence>
 *                                                                 &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
 *                                                                 &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                                                 &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
 *                                                               &lt;/sequence>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                                       &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
 *                                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                                       &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                                       &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
 *                                                       &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
 *                                                       &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
 *                                                       &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                                     &lt;/sequence>
 *                                                   &lt;/restriction>
 *                                                 &lt;/complexContent>
 *                                               &lt;/complexType>
 *                                             &lt;/element>
 *                                             &lt;element name="criterionScoring" maxOccurs="unbounded">
 *                                               &lt;complexType>
 *                                                 &lt;complexContent>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                     &lt;sequence>
 *                                                       &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
 *                                                       &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                                       &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
 *                                                     &lt;/sequence>
 *                                                   &lt;/restriction>
 *                                                 &lt;/complexContent>
 *                                               &lt;/complexType>
 *                                             &lt;/element>
 *                                           &lt;/choice>
 *                                           &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum" minOccurs="0"/>
 *                                           &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                           &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                           &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                           &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                                           &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
 *                                           &lt;element name="criterionHaveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/choice>
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
 *         &lt;/sequence>
 *         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_applicationAdmittedInfoType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "appRejectedReason",
    "score",
    "appRating",
    "conditionsScoring",
    "admitted"
})
public class ZfcsApplicationAdmittedInfoType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected List<ZfcsAppRejectedReasonType> appRejectedReason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected BigDecimal score;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Short appRating;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsApplicationAdmittedInfoType.ConditionsScoring conditionsScoring;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean admitted;

    /**
     * Gets the value of the appRejectedReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appRejectedReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppRejectedReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsAppRejectedReasonType }
     * 
     * 
     */
    public List<ZfcsAppRejectedReasonType> getAppRejectedReason() {
        if (appRejectedReason == null) {
            appRejectedReason = new ArrayList<ZfcsAppRejectedReasonType>();
        }
        return this.appRejectedReason;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScore(BigDecimal value) {
        this.score = value;
    }

    /**
     * Gets the value of the appRating property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAppRating() {
        return appRating;
    }

    /**
     * Sets the value of the appRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAppRating(Short value) {
        this.appRating = value;
    }

    /**
     * Gets the value of the conditionsScoring property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring }
     *     
     */
    public ZfcsApplicationAdmittedInfoType.ConditionsScoring getConditionsScoring() {
        return conditionsScoring;
    }

    /**
     * Sets the value of the conditionsScoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring }
     *     
     */
    public void setConditionsScoring(ZfcsApplicationAdmittedInfoType.ConditionsScoring value) {
        this.conditionsScoring = value;
    }

    /**
     * Gets the value of the admitted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdmitted() {
        return admitted;
    }

    /**
     * Sets the value of the admitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdmitted(Boolean value) {
        this.admitted = value;
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
     *         &lt;element name="conditionScoring" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="costCriterion">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
     *                               &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                               &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
     *                               &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                               &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                               &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
     *                               &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
     *                               &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                               &lt;element name="spelledOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                               &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="qualitativeCriterion">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;choice>
     *                                 &lt;element name="indicator" maxOccurs="unbounded">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;sequence>
     *                                           &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                           &lt;element name="indicatorScoring" maxOccurs="unbounded">
     *                                             &lt;complexType>
     *                                               &lt;complexContent>
     *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                   &lt;sequence>
     *                                                     &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
     *                                                     &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                                                     &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
     *                                                   &lt;/sequence>
     *                                                 &lt;/restriction>
     *                                               &lt;/complexContent>
     *                                             &lt;/complexType>
     *                                           &lt;/element>
     *                                           &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                                           &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
     *                                           &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                                           &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                                           &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
     *                                           &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
     *                                           &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
     *                                           &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                                         &lt;/sequence>
     *                                       &lt;/restriction>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                                 &lt;element name="criterionScoring" maxOccurs="unbounded">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;sequence>
     *                                           &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
     *                                           &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                                           &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
     *                                         &lt;/sequence>
     *                                       &lt;/restriction>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/choice>
     *                               &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum" minOccurs="0"/>
     *                               &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                               &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                               &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                               &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *                               &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
     *                               &lt;element name="criterionHaveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
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
        "conditionScoring"
    })
    public static class ConditionsScoring {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring> conditionScoring;

        /**
         * Gets the value of the conditionScoring property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conditionScoring property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConditionScoring().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring }
         * 
         * 
         */
        public List<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring> getConditionScoring() {
            if (conditionScoring == null) {
                conditionScoring = new ArrayList<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring>();
            }
            return this.conditionScoring;
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
         *           &lt;element name="costCriterion">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
         *                     &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                     &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
         *                     &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                     &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                     &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
         *                     &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
         *                     &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                     &lt;element name="spelledOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                     &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="qualitativeCriterion">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;choice>
         *                       &lt;element name="indicator" maxOccurs="unbounded">
         *                         &lt;complexType>
         *                           &lt;complexContent>
         *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                               &lt;sequence>
         *                                 &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                                 &lt;element name="indicatorScoring" maxOccurs="unbounded">
         *                                   &lt;complexType>
         *                                     &lt;complexContent>
         *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                         &lt;sequence>
         *                                           &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
         *                                           &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                                           &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
         *                                         &lt;/sequence>
         *                                       &lt;/restriction>
         *                                     &lt;/complexContent>
         *                                   &lt;/complexType>
         *                                 &lt;/element>
         *                                 &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                                 &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
         *                                 &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                                 &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                                 &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
         *                                 &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
         *                                 &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
         *                                 &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                               &lt;/sequence>
         *                             &lt;/restriction>
         *                           &lt;/complexContent>
         *                         &lt;/complexType>
         *                       &lt;/element>
         *                       &lt;element name="criterionScoring" maxOccurs="unbounded">
         *                         &lt;complexType>
         *                           &lt;complexContent>
         *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                               &lt;sequence>
         *                                 &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
         *                                 &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                                 &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
         *                               &lt;/sequence>
         *                             &lt;/restriction>
         *                           &lt;/complexContent>
         *                         &lt;/complexType>
         *                       &lt;/element>
         *                     &lt;/choice>
         *                     &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum" minOccurs="0"/>
         *                     &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                     &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                     &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                     &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
         *                     &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
         *                     &lt;element name="criterionHaveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "costCriterion",
            "qualitativeCriterion"
        })
        public static class ConditionScoring {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.CostCriterion costCriterion;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion qualitativeCriterion;

            /**
             * Gets the value of the costCriterion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.CostCriterion }
             *     
             */
            public ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.CostCriterion getCostCriterion() {
                return costCriterion;
            }

            /**
             * Sets the value of the costCriterion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.CostCriterion }
             *     
             */
            public void setCostCriterion(ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.CostCriterion value) {
                this.costCriterion = value;
            }

            /**
             * Gets the value of the qualitativeCriterion property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion }
             *     
             */
            public ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion getQualitativeCriterion() {
                return qualitativeCriterion;
            }

            /**
             * Sets the value of the qualitativeCriterion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion }
             *     
             */
            public void setQualitativeCriterion(ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion value) {
                this.qualitativeCriterion = value;
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
             *         &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
             *         &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *         &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
             *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *         &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
             *         &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
             *         &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
             *         &lt;element name="spelledOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *         &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                "criterionCode",
                "score",
                "normedScore",
                "value",
                "addInfo",
                "limit",
                "measurementOrder",
                "offer",
                "spelledOffer",
                "offerInfo"
            })
            public static class CostCriterion {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "string")
                protected ZfcsCriterionCodeEnum criterionCode;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected BigDecimal score;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected BigDecimal normedScore;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected BigDecimal value;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String addInfo;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected BigDecimal limit;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                @XmlSchemaType(name = "string")
                protected ZfcsMeasurementOrderEnum measurementOrder;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String offer;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String spelledOffer;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String offerInfo;

                /**
                 * Gets the value of the criterionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsCriterionCodeEnum }
                 *     
                 */
                public ZfcsCriterionCodeEnum getCriterionCode() {
                    return criterionCode;
                }

                /**
                 * Sets the value of the criterionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsCriterionCodeEnum }
                 *     
                 */
                public void setCriterionCode(ZfcsCriterionCodeEnum value) {
                    this.criterionCode = value;
                }

                /**
                 * Gets the value of the score property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getScore() {
                    return score;
                }

                /**
                 * Sets the value of the score property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setScore(BigDecimal value) {
                    this.score = value;
                }

                /**
                 * Gets the value of the normedScore property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNormedScore() {
                    return normedScore;
                }

                /**
                 * Sets the value of the normedScore property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNormedScore(BigDecimal value) {
                    this.normedScore = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the addInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddInfo() {
                    return addInfo;
                }

                /**
                 * Sets the value of the addInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddInfo(String value) {
                    this.addInfo = value;
                }

                /**
                 * Gets the value of the limit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLimit() {
                    return limit;
                }

                /**
                 * Sets the value of the limit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLimit(BigDecimal value) {
                    this.limit = value;
                }

                /**
                 * Gets the value of the measurementOrder property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsMeasurementOrderEnum }
                 *     
                 */
                public ZfcsMeasurementOrderEnum getMeasurementOrder() {
                    return measurementOrder;
                }

                /**
                 * Sets the value of the measurementOrder property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsMeasurementOrderEnum }
                 *     
                 */
                public void setMeasurementOrder(ZfcsMeasurementOrderEnum value) {
                    this.measurementOrder = value;
                }

                /**
                 * Gets the value of the offer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffer() {
                    return offer;
                }

                /**
                 * Sets the value of the offer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffer(String value) {
                    this.offer = value;
                }

                /**
                 * Gets the value of the spelledOffer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSpelledOffer() {
                    return spelledOffer;
                }

                /**
                 * Sets the value of the spelledOffer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSpelledOffer(String value) {
                    this.spelledOffer = value;
                }

                /**
                 * Gets the value of the offerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOfferInfo() {
                    return offerInfo;
                }

                /**
                 * Sets the value of the offerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOfferInfo(String value) {
                    this.offerInfo = value;
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
             *           &lt;element name="indicator" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                     &lt;element name="indicatorScoring" maxOccurs="unbounded">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
             *                               &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *                               &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                     &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *                     &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
             *                     &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *                     &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *                     &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
             *                     &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
             *                     &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
             *                     &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="criterionScoring" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
             *                     &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *                     &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum" minOccurs="0"/>
             *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *         &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *         &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
             *         &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
             *         &lt;element name="criterionHaveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "indicator",
                "criterionScoring",
                "criterionCode",
                "addInfo",
                "value",
                "score",
                "normedScore",
                "limit",
                "criterionHaveIndicator"
            })
            public static class QualitativeCriterion {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected List<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.Indicator> indicator;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected List<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.CriterionScoring> criterionScoring;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                @XmlSchemaType(name = "string")
                protected ZfcsCriterionCodeEnum criterionCode;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String addInfo;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected BigDecimal value;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected BigDecimal score;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected BigDecimal normedScore;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected BigDecimal limit;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Boolean criterionHaveIndicator;

                /**
                 * Gets the value of the indicator property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the indicator property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIndicator().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.Indicator }
                 * 
                 * 
                 */
                public List<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.Indicator> getIndicator() {
                    if (indicator == null) {
                        indicator = new ArrayList<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.Indicator>();
                    }
                    return this.indicator;
                }

                /**
                 * Gets the value of the criterionScoring property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the criterionScoring property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCriterionScoring().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.CriterionScoring }
                 * 
                 * 
                 */
                public List<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.CriterionScoring> getCriterionScoring() {
                    if (criterionScoring == null) {
                        criterionScoring = new ArrayList<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.CriterionScoring>();
                    }
                    return this.criterionScoring;
                }

                /**
                 * Gets the value of the criterionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsCriterionCodeEnum }
                 *     
                 */
                public ZfcsCriterionCodeEnum getCriterionCode() {
                    return criterionCode;
                }

                /**
                 * Sets the value of the criterionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsCriterionCodeEnum }
                 *     
                 */
                public void setCriterionCode(ZfcsCriterionCodeEnum value) {
                    this.criterionCode = value;
                }

                /**
                 * Gets the value of the addInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddInfo() {
                    return addInfo;
                }

                /**
                 * Sets the value of the addInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddInfo(String value) {
                    this.addInfo = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the score property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getScore() {
                    return score;
                }

                /**
                 * Sets the value of the score property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setScore(BigDecimal value) {
                    this.score = value;
                }

                /**
                 * Gets the value of the normedScore property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNormedScore() {
                    return normedScore;
                }

                /**
                 * Sets the value of the normedScore property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNormedScore(BigDecimal value) {
                    this.normedScore = value;
                }

                /**
                 * Gets the value of the limit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLimit() {
                    return limit;
                }

                /**
                 * Sets the value of the limit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLimit(BigDecimal value) {
                    this.limit = value;
                }

                /**
                 * Gets the value of the criterionHaveIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isCriterionHaveIndicator() {
                    return criterionHaveIndicator;
                }

                /**
                 * Sets the value of the criterionHaveIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setCriterionHaveIndicator(Boolean value) {
                    this.criterionHaveIndicator = value;
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
                 *         &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
                 *         &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
                 *         &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
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
                    "protocolCommissionMember",
                    "score",
                    "normedScore"
                })
                public static class CriterionScoring {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ZfcsCommissionMemberInAppType protocolCommissionMember;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected BigDecimal score;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected BigDecimal normedScore;

                    /**
                     * Gets the value of the protocolCommissionMember property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsCommissionMemberInAppType }
                     *     
                     */
                    public ZfcsCommissionMemberInAppType getProtocolCommissionMember() {
                        return protocolCommissionMember;
                    }

                    /**
                     * Sets the value of the protocolCommissionMember property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsCommissionMemberInAppType }
                     *     
                     */
                    public void setProtocolCommissionMember(ZfcsCommissionMemberInAppType value) {
                        this.protocolCommissionMember = value;
                    }

                    /**
                     * Gets the value of the score property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getScore() {
                        return score;
                    }

                    /**
                     * Sets the value of the score property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setScore(BigDecimal value) {
                        this.score = value;
                    }

                    /**
                     * Gets the value of the normedScore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getNormedScore() {
                        return normedScore;
                    }

                    /**
                     * Sets the value of the normedScore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setNormedScore(BigDecimal value) {
                        this.normedScore = value;
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
                 *         &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *         &lt;element name="indicatorScoring" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
                 *                   &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
                 *                   &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
                 *         &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
                 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
                 *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
                 *         &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                 *         &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
                 *         &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                 *         &lt;element name="offerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                    "indicatorCode",
                    "indicatorScoring",
                    "score",
                    "normedScore",
                    "name",
                    "value",
                    "limit",
                    "measurementOrder",
                    "offer",
                    "offerInfo"
                })
                public static class Indicator {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected long indicatorCode;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected List<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.Indicator.IndicatorScoring> indicatorScoring;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected BigDecimal score;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected BigDecimal normedScore;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String name;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected BigDecimal value;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected BigDecimal limit;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    @XmlSchemaType(name = "string")
                    protected ZfcsMeasurementOrderEnum measurementOrder;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected BigDecimal offer;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String offerInfo;

                    /**
                     * Gets the value of the indicatorCode property.
                     * 
                     */
                    public long getIndicatorCode() {
                        return indicatorCode;
                    }

                    /**
                     * Sets the value of the indicatorCode property.
                     * 
                     */
                    public void setIndicatorCode(long value) {
                        this.indicatorCode = value;
                    }

                    /**
                     * Gets the value of the indicatorScoring property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the indicatorScoring property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIndicatorScoring().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.Indicator.IndicatorScoring }
                     * 
                     * 
                     */
                    public List<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.Indicator.IndicatorScoring> getIndicatorScoring() {
                        if (indicatorScoring == null) {
                            indicatorScoring = new ArrayList<ZfcsApplicationAdmittedInfoType.ConditionsScoring.ConditionScoring.QualitativeCriterion.Indicator.IndicatorScoring>();
                        }
                        return this.indicatorScoring;
                    }

                    /**
                     * Gets the value of the score property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getScore() {
                        return score;
                    }

                    /**
                     * Sets the value of the score property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setScore(BigDecimal value) {
                        this.score = value;
                    }

                    /**
                     * Gets the value of the normedScore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getNormedScore() {
                        return normedScore;
                    }

                    /**
                     * Sets the value of the normedScore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setNormedScore(BigDecimal value) {
                        this.normedScore = value;
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
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValue(BigDecimal value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the limit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getLimit() {
                        return limit;
                    }

                    /**
                     * Sets the value of the limit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setLimit(BigDecimal value) {
                        this.limit = value;
                    }

                    /**
                     * Gets the value of the measurementOrder property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsMeasurementOrderEnum }
                     *     
                     */
                    public ZfcsMeasurementOrderEnum getMeasurementOrder() {
                        return measurementOrder;
                    }

                    /**
                     * Sets the value of the measurementOrder property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsMeasurementOrderEnum }
                     *     
                     */
                    public void setMeasurementOrder(ZfcsMeasurementOrderEnum value) {
                        this.measurementOrder = value;
                    }

                    /**
                     * Gets the value of the offer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getOffer() {
                        return offer;
                    }

                    /**
                     * Sets the value of the offer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setOffer(BigDecimal value) {
                        this.offer = value;
                    }

                    /**
                     * Gets the value of the offerInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOfferInfo() {
                        return offerInfo;
                    }

                    /**
                     * Sets the value of the offerInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOfferInfo(String value) {
                        this.offerInfo = value;
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
                     *         &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberInAppType"/>
                     *         &lt;element name="score" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
                     *         &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
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
                        "protocolCommissionMember",
                        "score",
                        "normedScore"
                    })
                    public static class IndicatorScoring {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected ZfcsCommissionMemberInAppType protocolCommissionMember;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected BigDecimal score;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected BigDecimal normedScore;

                        /**
                         * Gets the value of the protocolCommissionMember property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ZfcsCommissionMemberInAppType }
                         *     
                         */
                        public ZfcsCommissionMemberInAppType getProtocolCommissionMember() {
                            return protocolCommissionMember;
                        }

                        /**
                         * Sets the value of the protocolCommissionMember property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ZfcsCommissionMemberInAppType }
                         *     
                         */
                        public void setProtocolCommissionMember(ZfcsCommissionMemberInAppType value) {
                            this.protocolCommissionMember = value;
                        }

                        /**
                         * Gets the value of the score property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getScore() {
                            return score;
                        }

                        /**
                         * Sets the value of the score property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setScore(BigDecimal value) {
                            this.score = value;
                        }

                        /**
                         * Gets the value of the normedScore property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getNormedScore() {
                            return normedScore;
                        }

                        /**
                         * Sets the value of the normedScore property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setNormedScore(BigDecimal value) {
                            this.normedScore = value;
                        }

                    }

                }

            }

        }

    }

}
