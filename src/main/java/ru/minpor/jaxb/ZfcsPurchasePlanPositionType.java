
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Общее описание позиции плана закупок
 * 
 * <p>Java class for zfcs_purchasePlanPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
 *                   &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType"/>
 *                   &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                   &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="complexity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="complexityInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="publicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="execution">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="terms" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="periodicity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPeriodicityTypeEnum"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="basement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="purpose">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="program" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="positionCanceled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="positionModification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="changeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionChangeReasonRef"/>
 *                             &lt;element name="additionalInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
 *         &lt;element name="financeInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publishYear">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionFinancingsType" minOccurs="0"/>
 *                   &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanAddInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchasePlanPositionType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "financeInfo",
    "localInfo"
})
public class ZfcsPurchasePlanPositionType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchasePlanPositionType.CommonInfo commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchasePlanPositionType.FinanceInfo financeInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchasePlanAddInfoType localInfo;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanPositionType.CommonInfo }
     *     
     */
    public ZfcsPurchasePlanPositionType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanPositionType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsPurchasePlanPositionType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the financeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanPositionType.FinanceInfo }
     *     
     */
    public ZfcsPurchasePlanPositionType.FinanceInfo getFinanceInfo() {
        return financeInfo;
    }

    /**
     * Sets the value of the financeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanPositionType.FinanceInfo }
     *     
     */
    public void setFinanceInfo(ZfcsPurchasePlanPositionType.FinanceInfo value) {
        this.financeInfo = value;
    }

    /**
     * Gets the value of the localInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanAddInfoType }
     *     
     */
    public ZfcsPurchasePlanAddInfoType getLocalInfo() {
        return localInfo;
    }

    /**
     * Sets the value of the localInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanAddInfoType }
     *     
     */
    public void setLocalInfo(ZfcsPurchasePlanAddInfoType value) {
        this.localInfo = value;
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
     *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
     *         &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType"/>
     *         &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="complexity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="complexityInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="publicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="execution">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="terms" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="periodicity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPeriodicityTypeEnum"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="basement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="purpose">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="program" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="positionCanceled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="positionModification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="changeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionChangeReasonRef"/>
     *                   &lt;element name="additionalInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "positionNumber",
        "ikz",
        "okpd",
        "purchaseObjectInfo",
        "description",
        "complexity",
        "complexityInfo",
        "publicDiscussion",
        "execution",
        "basement",
        "purpose",
        "positionCanceled",
        "positionModification"
    })
    public static class CommonInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String positionNumber;
        @XmlElement(name = "IKZ", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String ikz;
        @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOKPDRef okpd;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String purchaseObjectInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String description;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean complexity;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String complexityInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean publicDiscussion;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchasePlanPositionType.CommonInfo.Execution execution;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String basement;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchasePlanPositionType.CommonInfo.Purpose purpose;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean positionCanceled;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPurchasePlanPositionType.CommonInfo.PositionModification positionModification;

        /**
         * Gets the value of the positionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionNumber() {
            return positionNumber;
        }

        /**
         * Sets the value of the positionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionNumber(String value) {
            this.positionNumber = value;
        }

        /**
         * Gets the value of the ikz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIKZ() {
            return ikz;
        }

        /**
         * Sets the value of the ikz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIKZ(String value) {
            this.ikz = value;
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
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the complexity property.
         * 
         */
        public boolean isComplexity() {
            return complexity;
        }

        /**
         * Sets the value of the complexity property.
         * 
         */
        public void setComplexity(boolean value) {
            this.complexity = value;
        }

        /**
         * Gets the value of the complexityInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComplexityInfo() {
            return complexityInfo;
        }

        /**
         * Sets the value of the complexityInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComplexityInfo(String value) {
            this.complexityInfo = value;
        }

        /**
         * Gets the value of the publicDiscussion property.
         * 
         */
        public boolean isPublicDiscussion() {
            return publicDiscussion;
        }

        /**
         * Sets the value of the publicDiscussion property.
         * 
         */
        public void setPublicDiscussion(boolean value) {
            this.publicDiscussion = value;
        }

        /**
         * Gets the value of the execution property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanPositionType.CommonInfo.Execution }
         *     
         */
        public ZfcsPurchasePlanPositionType.CommonInfo.Execution getExecution() {
            return execution;
        }

        /**
         * Sets the value of the execution property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanPositionType.CommonInfo.Execution }
         *     
         */
        public void setExecution(ZfcsPurchasePlanPositionType.CommonInfo.Execution value) {
            this.execution = value;
        }

        /**
         * Gets the value of the basement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBasement() {
            return basement;
        }

        /**
         * Sets the value of the basement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBasement(String value) {
            this.basement = value;
        }

        /**
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanPositionType.CommonInfo.Purpose }
         *     
         */
        public ZfcsPurchasePlanPositionType.CommonInfo.Purpose getPurpose() {
            return purpose;
        }

        /**
         * Sets the value of the purpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanPositionType.CommonInfo.Purpose }
         *     
         */
        public void setPurpose(ZfcsPurchasePlanPositionType.CommonInfo.Purpose value) {
            this.purpose = value;
        }

        /**
         * Gets the value of the positionCanceled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPositionCanceled() {
            return positionCanceled;
        }

        /**
         * Sets the value of the positionCanceled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPositionCanceled(Boolean value) {
            this.positionCanceled = value;
        }

        /**
         * Gets the value of the positionModification property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanPositionType.CommonInfo.PositionModification }
         *     
         */
        public ZfcsPurchasePlanPositionType.CommonInfo.PositionModification getPositionModification() {
            return positionModification;
        }

        /**
         * Sets the value of the positionModification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanPositionType.CommonInfo.PositionModification }
         *     
         */
        public void setPositionModification(ZfcsPurchasePlanPositionType.CommonInfo.PositionModification value) {
            this.positionModification = value;
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
         *         &lt;element name="terms" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="periodicity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPeriodicityTypeEnum"/>
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
            "terms",
            "periodicity"
        })
        public static class Execution {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String terms;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected ZfcsPurchasePlanPeriodicityTypeEnum periodicity;

            /**
             * Gets the value of the terms property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerms() {
                return terms;
            }

            /**
             * Sets the value of the terms property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerms(String value) {
                this.terms = value;
            }

            /**
             * Gets the value of the periodicity property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchasePlanPeriodicityTypeEnum }
             *     
             */
            public ZfcsPurchasePlanPeriodicityTypeEnum getPeriodicity() {
                return periodicity;
            }

            /**
             * Sets the value of the periodicity property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchasePlanPeriodicityTypeEnum }
             *     
             */
            public void setPeriodicity(ZfcsPurchasePlanPeriodicityTypeEnum value) {
                this.periodicity = value;
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
         *         &lt;element name="changeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionChangeReasonRef"/>
         *         &lt;element name="additionalInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "changeReason",
            "additionalInfo"
        })
        public static class PositionModification {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsPurchasePlanPositionChangeReasonRef changeReason;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String additionalInfo;

            /**
             * Gets the value of the changeReason property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchasePlanPositionChangeReasonRef }
             *     
             */
            public ZfcsPurchasePlanPositionChangeReasonRef getChangeReason() {
                return changeReason;
            }

            /**
             * Sets the value of the changeReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchasePlanPositionChangeReasonRef }
             *     
             */
            public void setChangeReason(ZfcsPurchasePlanPositionChangeReasonRef value) {
                this.changeReason = value;
            }

            /**
             * Gets the value of the additionalInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalInfo() {
                return additionalInfo;
            }

            /**
             * Sets the value of the additionalInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalInfo(String value) {
                this.additionalInfo = value;
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
         *         &lt;element name="program" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "program",
            "result"
        })
        public static class Purpose {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String program;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String result;

            /**
             * Gets the value of the program property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgram() {
                return program;
            }

            /**
             * Sets the value of the program property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgram(String value) {
                this.program = value;
            }

            /**
             * Gets the value of the result property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResult() {
                return result;
            }

            /**
             * Sets the value of the result property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResult(String value) {
                this.result = value;
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
     *         &lt;element name="publishYear">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionFinancingsType" minOccurs="0"/>
     *         &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
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
        "publishYear",
        "finances",
        "yearFinances"
    })
    public static class FinanceInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int publishYear;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPurchasePlanPositionFinancingsType finances;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsFinanceResourcesType yearFinances;

        /**
         * Gets the value of the publishYear property.
         * 
         */
        public int getPublishYear() {
            return publishYear;
        }

        /**
         * Sets the value of the publishYear property.
         * 
         */
        public void setPublishYear(int value) {
            this.publishYear = value;
        }

        /**
         * Gets the value of the finances property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanPositionFinancingsType }
         *     
         */
        public ZfcsPurchasePlanPositionFinancingsType getFinances() {
            return finances;
        }

        /**
         * Sets the value of the finances property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanPositionFinancingsType }
         *     
         */
        public void setFinances(ZfcsPurchasePlanPositionFinancingsType value) {
            this.finances = value;
        }

        /**
         * Gets the value of the yearFinances property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public ZfcsFinanceResourcesType getYearFinances() {
            return yearFinances;
        }

        /**
         * Sets the value of the yearFinances property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public void setYearFinances(ZfcsFinanceResourcesType value) {
            this.yearFinances = value;
        }

    }

}
