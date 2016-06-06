
package ru.minpor.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Отчет с обоснованием закупки у единственного поставщика (подрядчика, исполнителя)
 * 
 * <p>Java class for zfcs_customerReportSingleContractorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportSingleContractorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoWithOgrnType"/>
 *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType" minOccurs="0"/>
 *         &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reason">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonCodeType"/>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonNameType" minOccurs="0"/>
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
@XmlType(name = "zfcs_customerReportSingleContractorType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "customer",
    "purchaseNumber",
    "contractRegNum",
    "lotNumber",
    "reason"
})
public class ZfcsCustomerReportSingleContractorType
    extends ZfcsCustomerReportType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsOrganizationInfoWithOgrnType customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String purchaseNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contractRegNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected BigInteger lotNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportSingleContractorType.Reason reason;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoWithOgrnType }
     *     
     */
    public ZfcsOrganizationInfoWithOgrnType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoWithOgrnType }
     *     
     */
    public void setCustomer(ZfcsOrganizationInfoWithOgrnType value) {
        this.customer = value;
    }

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
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLotNumber(BigInteger value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSingleContractorType.Reason }
     *     
     */
    public ZfcsCustomerReportSingleContractorType.Reason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSingleContractorType.Reason }
     *     
     */
    public void setReason(ZfcsCustomerReportSingleContractorType.Reason value) {
        this.reason = value;
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
     *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonCodeType"/>
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonNameType" minOccurs="0"/>
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
        "code",
        "name"
    })
    public static class Reason {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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

    }

}
