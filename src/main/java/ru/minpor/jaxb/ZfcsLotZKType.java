
package ru.minpor.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о лоте для запроса котировок, запроса предложений
 * 
 * <p>Java class for zfcs_lotZKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_lotZKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *         &lt;element name="maxPriceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="priceFormula" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="standardContractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractNumberType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *         &lt;element name="financeSource" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customerRequirements">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customerRequirement" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                             &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                             &lt;choice>
 *                               &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                               &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
 *                             &lt;/choice>
 *                             &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="onesideRejection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
 *                             &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tendePlanInfoType" minOccurs="0"/>
 *                             &lt;element name="nonbudgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nonbudgetFinancingsType" minOccurs="0"/>
 *                             &lt;element name="budgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFinancingsType" minOccurs="0"/>
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
 *         &lt;element name="purchaseObjects">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseObject" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                               &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                             &lt;/choice>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType" minOccurs="0"/>
 *                             &lt;element name="customerQuantities" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="customerQuantity" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                                                 &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
 *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                             &lt;element name="quantity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
 *                                       &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="preferenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="requirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="restrictInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="publicDiscussion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_lotZKType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "maxPrice",
    "maxPriceInfo",
    "priceFormula",
    "standardContractNumber",
    "currency",
    "financeSource",
    "quantityUndefined",
    "customerRequirements",
    "purchaseObjects",
    "preferenses",
    "requirements",
    "restrictInfo",
    "addInfo",
    "publicDiscussion"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ZfcsNotificationZKType.Lot.class
})
public class ZfcsLotZKType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String maxPrice;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String maxPriceInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String priceFormula;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String standardContractNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCurrencyRef currency;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String financeSource;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean quantityUndefined;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsLotZKType.CustomerRequirements customerRequirements;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsLotZKType.PurchaseObjects purchaseObjects;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsLotZKType.Preferenses preferenses;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsLotZKType.Requirements requirements;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String restrictInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String addInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPublicDiscussionType publicDiscussion;

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrice(String value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the maxPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPriceInfo() {
        return maxPriceInfo;
    }

    /**
     * Sets the value of the maxPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPriceInfo(String value) {
        this.maxPriceInfo = value;
    }

    /**
     * Gets the value of the priceFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceFormula() {
        return priceFormula;
    }

    /**
     * Sets the value of the priceFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceFormula(String value) {
        this.priceFormula = value;
    }

    /**
     * Gets the value of the standardContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardContractNumber() {
        return standardContractNumber;
    }

    /**
     * Sets the value of the standardContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardContractNumber(String value) {
        this.standardContractNumber = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public ZfcsCurrencyRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public void setCurrency(ZfcsCurrencyRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the financeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceSource() {
        return financeSource;
    }

    /**
     * Sets the value of the financeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceSource(String value) {
        this.financeSource = value;
    }

    /**
     * Gets the value of the quantityUndefined property.
     * 
     */
    public boolean isQuantityUndefined() {
        return quantityUndefined;
    }

    /**
     * Sets the value of the quantityUndefined property.
     * 
     */
    public void setQuantityUndefined(boolean value) {
        this.quantityUndefined = value;
    }

    /**
     * Gets the value of the customerRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotZKType.CustomerRequirements }
     *     
     */
    public ZfcsLotZKType.CustomerRequirements getCustomerRequirements() {
        return customerRequirements;
    }

    /**
     * Sets the value of the customerRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotZKType.CustomerRequirements }
     *     
     */
    public void setCustomerRequirements(ZfcsLotZKType.CustomerRequirements value) {
        this.customerRequirements = value;
    }

    /**
     * Gets the value of the purchaseObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotZKType.PurchaseObjects }
     *     
     */
    public ZfcsLotZKType.PurchaseObjects getPurchaseObjects() {
        return purchaseObjects;
    }

    /**
     * Sets the value of the purchaseObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotZKType.PurchaseObjects }
     *     
     */
    public void setPurchaseObjects(ZfcsLotZKType.PurchaseObjects value) {
        this.purchaseObjects = value;
    }

    /**
     * Gets the value of the preferenses property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotZKType.Preferenses }
     *     
     */
    public ZfcsLotZKType.Preferenses getPreferenses() {
        return preferenses;
    }

    /**
     * Sets the value of the preferenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotZKType.Preferenses }
     *     
     */
    public void setPreferenses(ZfcsLotZKType.Preferenses value) {
        this.preferenses = value;
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotZKType.Requirements }
     *     
     */
    public ZfcsLotZKType.Requirements getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotZKType.Requirements }
     *     
     */
    public void setRequirements(ZfcsLotZKType.Requirements value) {
        this.requirements = value;
    }

    /**
     * Gets the value of the restrictInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictInfo() {
        return restrictInfo;
    }

    /**
     * Sets the value of the restrictInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictInfo(String value) {
        this.restrictInfo = value;
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
     * Gets the value of the publicDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionType }
     *     
     */
    public ZfcsPublicDiscussionType getPublicDiscussion() {
        return publicDiscussion;
    }

    /**
     * Sets the value of the publicDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionType }
     *     
     */
    public void setPublicDiscussion(ZfcsPublicDiscussionType value) {
        this.publicDiscussion = value;
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
     *         &lt;element name="customerRequirement" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                   &lt;choice>
     *                     &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                     &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
     *                   &lt;/choice>
     *                   &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="onesideRejection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
     *                   &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tendePlanInfoType" minOccurs="0"/>
     *                   &lt;element name="nonbudgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nonbudgetFinancingsType" minOccurs="0"/>
     *                   &lt;element name="budgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFinancingsType" minOccurs="0"/>
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
        "customerRequirement"
    })
    public static class CustomerRequirements {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsLotZKType.CustomerRequirements.CustomerRequirement> customerRequirement;

        /**
         * Gets the value of the customerRequirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerRequirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsLotZKType.CustomerRequirements.CustomerRequirement }
         * 
         * 
         */
        public List<ZfcsLotZKType.CustomerRequirements.CustomerRequirement> getCustomerRequirement() {
            if (customerRequirement == null) {
                customerRequirement = new ArrayList<ZfcsLotZKType.CustomerRequirements.CustomerRequirement>();
            }
            return this.customerRequirement;
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
         *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *         &lt;choice>
         *           &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *           &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
         *         &lt;/choice>
         *         &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="onesideRejection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
         *         &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tendePlanInfoType" minOccurs="0"/>
         *         &lt;element name="nonbudgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nonbudgetFinancingsType" minOccurs="0"/>
         *         &lt;element name="budgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFinancingsType" minOccurs="0"/>
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
            "customer",
            "maxPrice",
            "deliveryPlace",
            "kladrPlaces",
            "deliveryTerm",
            "onesideRejection",
            "contractGuarantee",
            "tenderPlanInfo",
            "nonbudgetFinancings",
            "budgetFinancings"
        })
        public static class CustomerRequirement {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsOrganizationRef customer;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String maxPrice;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String deliveryPlace;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsKladrPlacesType kladrPlaces;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String deliveryTerm;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String onesideRejection;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsPaymentInfoType contractGuarantee;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsTendePlanInfoType tenderPlanInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsNonbudgetFinancingsType nonbudgetFinancings;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsBudgetFinancingsType budgetFinancings;

            /**
             * Gets the value of the customer property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public ZfcsOrganizationRef getCustomer() {
                return customer;
            }

            /**
             * Sets the value of the customer property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public void setCustomer(ZfcsOrganizationRef value) {
                this.customer = value;
            }

            /**
             * Gets the value of the maxPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaxPrice() {
                return maxPrice;
            }

            /**
             * Sets the value of the maxPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaxPrice(String value) {
                this.maxPrice = value;
            }

            /**
             * Gets the value of the deliveryPlace property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeliveryPlace() {
                return deliveryPlace;
            }

            /**
             * Sets the value of the deliveryPlace property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeliveryPlace(String value) {
                this.deliveryPlace = value;
            }

            /**
             * Gets the value of the kladrPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsKladrPlacesType }
             *     
             */
            public ZfcsKladrPlacesType getKladrPlaces() {
                return kladrPlaces;
            }

            /**
             * Sets the value of the kladrPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsKladrPlacesType }
             *     
             */
            public void setKladrPlaces(ZfcsKladrPlacesType value) {
                this.kladrPlaces = value;
            }

            /**
             * Gets the value of the deliveryTerm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeliveryTerm() {
                return deliveryTerm;
            }

            /**
             * Sets the value of the deliveryTerm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeliveryTerm(String value) {
                this.deliveryTerm = value;
            }

            /**
             * Gets the value of the onesideRejection property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOnesideRejection() {
                return onesideRejection;
            }

            /**
             * Sets the value of the onesideRejection property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOnesideRejection(String value) {
                this.onesideRejection = value;
            }

            /**
             * Gets the value of the contractGuarantee property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPaymentInfoType }
             *     
             */
            public ZfcsPaymentInfoType getContractGuarantee() {
                return contractGuarantee;
            }

            /**
             * Sets the value of the contractGuarantee property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPaymentInfoType }
             *     
             */
            public void setContractGuarantee(ZfcsPaymentInfoType value) {
                this.contractGuarantee = value;
            }

            /**
             * Gets the value of the tenderPlanInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTendePlanInfoType }
             *     
             */
            public ZfcsTendePlanInfoType getTenderPlanInfo() {
                return tenderPlanInfo;
            }

            /**
             * Sets the value of the tenderPlanInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTendePlanInfoType }
             *     
             */
            public void setTenderPlanInfo(ZfcsTendePlanInfoType value) {
                this.tenderPlanInfo = value;
            }

            /**
             * Gets the value of the nonbudgetFinancings property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsNonbudgetFinancingsType }
             *     
             */
            public ZfcsNonbudgetFinancingsType getNonbudgetFinancings() {
                return nonbudgetFinancings;
            }

            /**
             * Sets the value of the nonbudgetFinancings property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsNonbudgetFinancingsType }
             *     
             */
            public void setNonbudgetFinancings(ZfcsNonbudgetFinancingsType value) {
                this.nonbudgetFinancings = value;
            }

            /**
             * Gets the value of the budgetFinancings property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBudgetFinancingsType }
             *     
             */
            public ZfcsBudgetFinancingsType getBudgetFinancings() {
                return budgetFinancings;
            }

            /**
             * Sets the value of the budgetFinancings property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBudgetFinancingsType }
             *     
             */
            public void setBudgetFinancings(ZfcsBudgetFinancingsType value) {
                this.budgetFinancings = value;
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
     *         &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
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
        "preferense"
    })
    public static class Preferenses {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsPreferenseType> preferense;

        /**
         * Gets the value of the preferense property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preferense property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreferense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPreferenseType }
         * 
         * 
         */
        public List<ZfcsPreferenseType> getPreferense() {
            if (preferense == null) {
                preferense = new ArrayList<ZfcsPreferenseType>();
            }
            return this.preferense;
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
     *         &lt;element name="purchaseObject" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                     &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                   &lt;/choice>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType" minOccurs="0"/>
     *                   &lt;element name="customerQuantities" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="customerQuantity" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                                       &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
     *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                   &lt;element name="quantity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
     *                             &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
        "purchaseObject",
        "totalSum"
    })
    public static class PurchaseObjects {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsLotZKType.PurchaseObjects.PurchaseObject> purchaseObject;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String totalSum;

        /**
         * Gets the value of the purchaseObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchaseObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchaseObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsLotZKType.PurchaseObjects.PurchaseObject }
         * 
         * 
         */
        public List<ZfcsLotZKType.PurchaseObjects.PurchaseObject> getPurchaseObject() {
            if (purchaseObject == null) {
                purchaseObject = new ArrayList<ZfcsLotZKType.PurchaseObjects.PurchaseObject>();
            }
            return this.purchaseObject;
        }

        /**
         * Gets the value of the totalSum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalSum() {
            return totalSum;
        }

        /**
         * Sets the value of the totalSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalSum(String value) {
            this.totalSum = value;
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
         *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *         &lt;/choice>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType" minOccurs="0"/>
         *         &lt;element name="customerQuantities" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="customerQuantity" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *                             &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
         *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *         &lt;element name="quantity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
         *                   &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
            "okpd",
            "okpd2",
            "name",
            "okei",
            "customerQuantities",
            "price",
            "quantity",
            "sum"
        })
        public static class PurchaseObject {

            @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPDRef okpd;
            @XmlElement(name = "OKPD2", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPDRef okpd2;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String name;
            @XmlElement(name = "OKEI", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractOKEIType okei;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities customerQuantities;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String price;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsLotZKType.PurchaseObjects.PurchaseObject.Quantity quantity;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String sum;

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
             * Gets the value of the okpd2 property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKPDRef }
             *     
             */
            public ZfcsOKPDRef getOKPD2() {
                return okpd2;
            }

            /**
             * Sets the value of the okpd2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKPDRef }
             *     
             */
            public void setOKPD2(ZfcsOKPDRef value) {
                this.okpd2 = value;
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
             * Gets the value of the okei property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractOKEIType }
             *     
             */
            public ZfcsContractOKEIType getOKEI() {
                return okei;
            }

            /**
             * Sets the value of the okei property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractOKEIType }
             *     
             */
            public void setOKEI(ZfcsContractOKEIType value) {
                this.okei = value;
            }

            /**
             * Gets the value of the customerQuantities property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities }
             *     
             */
            public ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities getCustomerQuantities() {
                return customerQuantities;
            }

            /**
             * Sets the value of the customerQuantities property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities }
             *     
             */
            public void setCustomerQuantities(ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities value) {
                this.customerQuantities = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrice(String value) {
                this.price = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsLotZKType.PurchaseObjects.PurchaseObject.Quantity }
             *     
             */
            public ZfcsLotZKType.PurchaseObjects.PurchaseObject.Quantity getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsLotZKType.PurchaseObjects.PurchaseObject.Quantity }
             *     
             */
            public void setQuantity(ZfcsLotZKType.PurchaseObjects.PurchaseObject.Quantity value) {
                this.quantity = value;
            }

            /**
             * Gets the value of the sum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSum() {
                return sum;
            }

            /**
             * Sets the value of the sum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSum(String value) {
                this.sum = value;
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
             *         &lt;element name="customerQuantity" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
             *                   &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
                "customerQuantity"
            })
            public static class CustomerQuantities {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity> customerQuantity;

                /**
                 * Gets the value of the customerQuantity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the customerQuantity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCustomerQuantity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity }
                 * 
                 * 
                 */
                public List<ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity> getCustomerQuantity() {
                    if (customerQuantity == null) {
                        customerQuantity = new ArrayList<ZfcsLotZKType.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity>();
                    }
                    return this.customerQuantity;
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
                 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
                 *         &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
                    "customer",
                    "quantity"
                })
                public static class CustomerQuantity {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ZfcsOrganizationRef customer;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected BigDecimal quantity;

                    /**
                     * Gets the value of the customer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsOrganizationRef }
                     *     
                     */
                    public ZfcsOrganizationRef getCustomer() {
                        return customer;
                    }

                    /**
                     * Sets the value of the customer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsOrganizationRef }
                     *     
                     */
                    public void setCustomer(ZfcsOrganizationRef value) {
                        this.customer = value;
                    }

                    /**
                     * Gets the value of the quantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getQuantity() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setQuantity(BigDecimal value) {
                        this.quantity = value;
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
             *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
             *         &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "value",
                "undefined"
            })
            public static class Quantity {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected BigDecimal value;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Boolean undefined;

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
                 * Gets the value of the undefined property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isUndefined() {
                    return undefined;
                }

                /**
                 * Sets the value of the undefined property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setUndefined(Boolean value) {
                    this.undefined = value;
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
     *         &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
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
        "requirement"
    })
    public static class Requirements {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsRequirementType> requirement;

        /**
         * Gets the value of the requirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsRequirementType }
         * 
         * 
         */
        public List<ZfcsRequirementType> getRequirement() {
            if (requirement == null) {
                requirement = new ArrayList<ZfcsRequirementType>();
            }
            return this.requirement;
        }

    }

}
