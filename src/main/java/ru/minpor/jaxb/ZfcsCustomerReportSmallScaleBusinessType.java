
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
 * Отчет об объеме закупок у СМП (субъектов малого предпринимательства), СОНО (социально ориентированных некоммерческих организаций)
 * 
 * <p>Java class for zfcs_customerReportSmallScaleBusinessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportSmallScaleBusinessType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoExtendedType"/>
 *         &lt;element name="reportingPeriod" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *         &lt;element name="quantityPurchase">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="privacy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="annualVolumeSt30" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="defending" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="lending" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="singleSupplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="nuclearEnergy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="ZK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="annualVolume" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="percent15" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="onlySMP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="notSMP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="annualVolumeSMP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="rateSMP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                   &lt;element name="abandonedSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *                             &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.NumberType" minOccurs="0"/>
 *                             &lt;element name="contractType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportContractTypeEnum"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportSmallScaleBusinessType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "customer",
    "reportingPeriod",
    "quantityPurchase",
    "contractsInfo"
})
public class ZfcsCustomerReportSmallScaleBusinessType
    extends ZfcsCustomerReportType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsOrganizationInfoExtendedType customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected int reportingPeriod;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportSmallScaleBusinessType.QuantityPurchase quantityPurchase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo contractsInfo;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoExtendedType }
     *     
     */
    public ZfcsOrganizationInfoExtendedType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoExtendedType }
     *     
     */
    public void setCustomer(ZfcsOrganizationInfoExtendedType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the reportingPeriod property.
     * 
     */
    public int getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets the value of the reportingPeriod property.
     * 
     */
    public void setReportingPeriod(int value) {
        this.reportingPeriod = value;
    }

    /**
     * Gets the value of the quantityPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessType.QuantityPurchase }
     *     
     */
    public ZfcsCustomerReportSmallScaleBusinessType.QuantityPurchase getQuantityPurchase() {
        return quantityPurchase;
    }

    /**
     * Sets the value of the quantityPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessType.QuantityPurchase }
     *     
     */
    public void setQuantityPurchase(ZfcsCustomerReportSmallScaleBusinessType.QuantityPurchase value) {
        this.quantityPurchase = value;
    }

    /**
     * Gets the value of the contractsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo }
     *     
     */
    public ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo getContractsInfo() {
        return contractsInfo;
    }

    /**
     * Sets the value of the contractsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo }
     *     
     */
    public void setContractsInfo(ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo value) {
        this.contractsInfo = value;
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
     *         &lt;element name="contractInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
     *                   &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.NumberType" minOccurs="0"/>
     *                   &lt;element name="contractType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportContractTypeEnum"/>
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
        "contractInfo"
    })
    public static class ContractsInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo.ContractInfo> contractInfo;

        /**
         * Gets the value of the contractInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContractInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo.ContractInfo }
         * 
         * 
         */
        public List<ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo.ContractInfo> getContractInfo() {
            if (contractInfo == null) {
                contractInfo = new ArrayList<ZfcsCustomerReportSmallScaleBusinessType.ContractsInfo.ContractInfo>();
            }
            return this.contractInfo;
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
         *         &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
         *         &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.NumberType" minOccurs="0"/>
         *         &lt;element name="contractType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportContractTypeEnum"/>
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
            "contractRegNum",
            "contractNumber",
            "contractType"
        })
        public static class ContractInfo {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contractRegNum;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contractNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsCustomerReportContractTypeEnum contractType;

            /**
             * Gets the value of the contractRegNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractRegNum() {
                return contractRegNum;
            }

            /**
             * Sets the value of the contractRegNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContractRegNum(String value) {
                this.contractRegNum = value;
            }

            /**
             * Gets the value of the contractNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractNumber() {
                return contractNumber;
            }

            /**
             * Sets the value of the contractNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContractNumber(String value) {
                this.contractNumber = value;
            }

            /**
             * Gets the value of the contractType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCustomerReportContractTypeEnum }
             *     
             */
            public ZfcsCustomerReportContractTypeEnum getContractType() {
                return contractType;
            }

            /**
             * Sets the value of the contractType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCustomerReportContractTypeEnum }
             *     
             */
            public void setContractType(ZfcsCustomerReportContractTypeEnum value) {
                this.contractType = value;
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
     *         &lt;element name="privacy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="annualVolumeSt30" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="defending" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="lending" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="singleSupplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="nuclearEnergy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="ZK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="annualVolume" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="percent15" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="onlySMP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="notSMP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="annualVolumeSMP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="rateSMP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
     *         &lt;element name="abandonedSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_volumeType" minOccurs="0"/>
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
        "privacy",
        "annualVolumeSt30",
        "defending",
        "lending",
        "singleSupplier",
        "nuclearEnergy",
        "zk",
        "annualVolume",
        "percent15",
        "onlySMP",
        "notSMP",
        "annualVolumeSMP",
        "rateSMP",
        "abandonedSum"
    })
    public static class QuantityPurchase {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal privacy;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal annualVolumeSt30;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal defending;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal lending;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal singleSupplier;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal nuclearEnergy;
        @XmlElement(name = "ZK", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal zk;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal annualVolume;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal percent15;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal onlySMP;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal notSMP;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal annualVolumeSMP;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal rateSMP;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal abandonedSum;

        /**
         * Gets the value of the privacy property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrivacy() {
            return privacy;
        }

        /**
         * Sets the value of the privacy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrivacy(BigDecimal value) {
            this.privacy = value;
        }

        /**
         * Gets the value of the annualVolumeSt30 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAnnualVolumeSt30() {
            return annualVolumeSt30;
        }

        /**
         * Sets the value of the annualVolumeSt30 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAnnualVolumeSt30(BigDecimal value) {
            this.annualVolumeSt30 = value;
        }

        /**
         * Gets the value of the defending property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDefending() {
            return defending;
        }

        /**
         * Sets the value of the defending property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDefending(BigDecimal value) {
            this.defending = value;
        }

        /**
         * Gets the value of the lending property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLending() {
            return lending;
        }

        /**
         * Sets the value of the lending property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLending(BigDecimal value) {
            this.lending = value;
        }

        /**
         * Gets the value of the singleSupplier property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSingleSupplier() {
            return singleSupplier;
        }

        /**
         * Sets the value of the singleSupplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSingleSupplier(BigDecimal value) {
            this.singleSupplier = value;
        }

        /**
         * Gets the value of the nuclearEnergy property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNuclearEnergy() {
            return nuclearEnergy;
        }

        /**
         * Sets the value of the nuclearEnergy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNuclearEnergy(BigDecimal value) {
            this.nuclearEnergy = value;
        }

        /**
         * Gets the value of the zk property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZK() {
            return zk;
        }

        /**
         * Sets the value of the zk property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZK(BigDecimal value) {
            this.zk = value;
        }

        /**
         * Gets the value of the annualVolume property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAnnualVolume() {
            return annualVolume;
        }

        /**
         * Sets the value of the annualVolume property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAnnualVolume(BigDecimal value) {
            this.annualVolume = value;
        }

        /**
         * Gets the value of the percent15 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent15() {
            return percent15;
        }

        /**
         * Sets the value of the percent15 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent15(BigDecimal value) {
            this.percent15 = value;
        }

        /**
         * Gets the value of the onlySMP property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOnlySMP() {
            return onlySMP;
        }

        /**
         * Sets the value of the onlySMP property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOnlySMP(BigDecimal value) {
            this.onlySMP = value;
        }

        /**
         * Gets the value of the notSMP property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNotSMP() {
            return notSMP;
        }

        /**
         * Sets the value of the notSMP property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNotSMP(BigDecimal value) {
            this.notSMP = value;
        }

        /**
         * Gets the value of the annualVolumeSMP property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAnnualVolumeSMP() {
            return annualVolumeSMP;
        }

        /**
         * Sets the value of the annualVolumeSMP property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAnnualVolumeSMP(BigDecimal value) {
            this.annualVolumeSMP = value;
        }

        /**
         * Gets the value of the rateSMP property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRateSMP() {
            return rateSMP;
        }

        /**
         * Sets the value of the rateSMP property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRateSMP(BigDecimal value) {
            this.rateSMP = value;
        }

        /**
         * Gets the value of the abandonedSum property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAbandonedSum() {
            return abandonedSum;
        }

        /**
         * Sets the value of the abandonedSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAbandonedSum(BigDecimal value) {
            this.abandonedSum = value;
        }

    }

}
