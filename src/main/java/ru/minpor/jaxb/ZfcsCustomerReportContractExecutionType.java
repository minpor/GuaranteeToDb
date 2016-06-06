
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Отчет об исполнении контракта (результатах отдельного этапа исполнения контракта)
 * 
 * <p>Java class for zfcs_customerReportContractExecutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportContractExecutionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportType">
 *       &lt;sequence>
 *         &lt;element name="customer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoExtendedType">
 *                 &lt;sequence>
 *                   &lt;element name="PPOName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="OKFS" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKFSRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *                   &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.NumberType" minOccurs="0"/>
 *                   &lt;element name="product" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                               &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                             &lt;/choice>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;element name="financeSources" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportFinanceSourceTypeEnum"/>
 *                                       &lt;element name="name" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="500"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
 *                   &lt;element name="okpd2okved2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="suppliers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="supplier" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}phoneType"/>
 *                             &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}eMailType"/>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="OKSM" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKSMRef"/>
 *                             &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType" minOccurs="0"/>
 *                             &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                             &lt;element name="OKFS" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKFSRef" minOccurs="0"/>
 *                             &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
 *                             &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
 *                             &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSupplierStatusEnum" minOccurs="0"/>
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
 *         &lt;element name="executionInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="provideByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractExecutionType"/>
 *                   &lt;element name="executed" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractExecutionType"/>
 *                   &lt;element name="price">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="priceByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                             &lt;element name="priceExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                             &lt;element name="priceDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="priceNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="quantity">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="quantityItem" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OKEIByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
 *                                       &lt;element name="quantityByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                       &lt;element name="OKEIExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
 *                                       &lt;element name="quantityExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="quantityDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="quantityNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="advanceMarker" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="advance">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="advanceItem" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="advanceByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                                         &lt;element name="advanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="advanceExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                                         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="advanceDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                               &lt;element name="advanceNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
 *         &lt;element name="improperExecutionInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="conformContractMarker" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;sequence>
 *                     &lt;element name="improperExecution" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;sequence>
 *                                 &lt;element name="indicator" type="{http://zakupki.gov.ru/oos/types/1}zfcs_improperIndicatorTypeEnum"/>
 *                                 &lt;element name="indicatorName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_improperIndicatorNameEnum" minOccurs="0"/>
 *                               &lt;/sequence>
 *                               &lt;element name="nameObligations" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                               &lt;element name="essenceViolation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                               &lt;element name="penaltyInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                               &lt;element name="penaltyDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                               &lt;element name="note" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="modifyTerminateInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modifyContract" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_modifyTerminateContractType">
 *                           &lt;sequence>
 *                             &lt;element name="reason">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonCodeType"/>
 *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonNameType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="terminateContract" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_modifyTerminateContractType">
 *                           &lt;sequence>
 *                             &lt;element name="reason">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="01"/>
 *                                             &lt;enumeration value="02"/>
 *                                             &lt;enumeration value="03"/>
 *                                             &lt;enumeration value="04"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonNameType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
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
@XmlType(name = "zfcs_customerReportContractExecutionType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "customer",
    "contractInfo",
    "suppliers",
    "executionInfo",
    "improperExecutionInfo",
    "modifyTerminateInfo"
})
public class ZfcsCustomerReportContractExecutionType
    extends ZfcsCustomerReportType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportContractExecutionType.Customer customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportContractExecutionType.ContractInfo contractInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportContractExecutionType.Suppliers suppliers;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportContractExecutionType.ExecutionInfo executionInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo improperExecutionInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo modifyTerminateInfo;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType.Customer }
     *     
     */
    public ZfcsCustomerReportContractExecutionType.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType.Customer }
     *     
     */
    public void setCustomer(ZfcsCustomerReportContractExecutionType.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType.ContractInfo }
     *     
     */
    public ZfcsCustomerReportContractExecutionType.ContractInfo getContractInfo() {
        return contractInfo;
    }

    /**
     * Sets the value of the contractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType.ContractInfo }
     *     
     */
    public void setContractInfo(ZfcsCustomerReportContractExecutionType.ContractInfo value) {
        this.contractInfo = value;
    }

    /**
     * Gets the value of the suppliers property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType.Suppliers }
     *     
     */
    public ZfcsCustomerReportContractExecutionType.Suppliers getSuppliers() {
        return suppliers;
    }

    /**
     * Sets the value of the suppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType.Suppliers }
     *     
     */
    public void setSuppliers(ZfcsCustomerReportContractExecutionType.Suppliers value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the executionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo }
     *     
     */
    public ZfcsCustomerReportContractExecutionType.ExecutionInfo getExecutionInfo() {
        return executionInfo;
    }

    /**
     * Sets the value of the executionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo }
     *     
     */
    public void setExecutionInfo(ZfcsCustomerReportContractExecutionType.ExecutionInfo value) {
        this.executionInfo = value;
    }

    /**
     * Gets the value of the improperExecutionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo }
     *     
     */
    public ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo getImproperExecutionInfo() {
        return improperExecutionInfo;
    }

    /**
     * Sets the value of the improperExecutionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo }
     *     
     */
    public void setImproperExecutionInfo(ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo value) {
        this.improperExecutionInfo = value;
    }

    /**
     * Gets the value of the modifyTerminateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo }
     *     
     */
    public ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo getModifyTerminateInfo() {
        return modifyTerminateInfo;
    }

    /**
     * Sets the value of the modifyTerminateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo }
     *     
     */
    public void setModifyTerminateInfo(ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo value) {
        this.modifyTerminateInfo = value;
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
     *         &lt;element name="product" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                     &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                   &lt;/choice>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="financeSources" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportFinanceSourceTypeEnum"/>
     *                             &lt;element name="name" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="500"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
     *         &lt;element name="okpd2okved2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "product",
        "purchaseCode",
        "okpd2Okved2"
    })
    public static class ContractInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String contractRegNum;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String contractNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsCustomerReportContractExecutionType.ContractInfo.Product> product;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String purchaseCode;
        @XmlElement(name = "okpd2okved2", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean okpd2Okved2;

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
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportContractExecutionType.ContractInfo.Product }
         * 
         * 
         */
        public List<ZfcsCustomerReportContractExecutionType.ContractInfo.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<ZfcsCustomerReportContractExecutionType.ContractInfo.Product>();
            }
            return this.product;
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
         * Gets the value of the okpd2Okved2 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOkpd2Okved2() {
            return okpd2Okved2;
        }

        /**
         * Sets the value of the okpd2Okved2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOkpd2Okved2(Boolean value) {
            this.okpd2Okved2 = value;
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
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="financeSources" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportFinanceSourceTypeEnum"/>
         *                   &lt;element name="name" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="500"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "okpd",
            "okpd2",
            "name",
            "financeSources"
        })
        public static class Product {

            @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPDRef okpd;
            @XmlElement(name = "OKPD2", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPDRef okpd2;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsCustomerReportContractExecutionType.ContractInfo.Product.FinanceSources> financeSources;

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
             * Gets the value of the financeSources property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the financeSources property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFinanceSources().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCustomerReportContractExecutionType.ContractInfo.Product.FinanceSources }
             * 
             * 
             */
            public List<ZfcsCustomerReportContractExecutionType.ContractInfo.Product.FinanceSources> getFinanceSources() {
                if (financeSources == null) {
                    financeSources = new ArrayList<ZfcsCustomerReportContractExecutionType.ContractInfo.Product.FinanceSources>();
                }
                return this.financeSources;
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
             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportFinanceSourceTypeEnum"/>
             *         &lt;element name="name" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="500"/>
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
                "code",
                "name"
            })
            public static class FinanceSources {

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoExtendedType">
     *       &lt;sequence>
     *         &lt;element name="PPOName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="OKFS" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKFSRef" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ppoName",
        "okfs"
    })
    public static class Customer
        extends ZfcsOrganizationInfoExtendedType
    {

        @XmlElement(name = "PPOName", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String ppoName;
        @XmlElement(name = "OKFS", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOKFSRef okfs;

        /**
         * Gets the value of the ppoName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPPOName() {
            return ppoName;
        }

        /**
         * Sets the value of the ppoName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPPOName(String value) {
            this.ppoName = value;
        }

        /**
         * Gets the value of the okfs property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKFSRef }
         *     
         */
        public ZfcsOKFSRef getOKFS() {
            return okfs;
        }

        /**
         * Sets the value of the okfs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKFSRef }
         *     
         */
        public void setOKFS(ZfcsOKFSRef value) {
            this.okfs = value;
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
     *         &lt;element name="provideByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractExecutionType"/>
     *         &lt;element name="executed" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractExecutionType"/>
     *         &lt;element name="price">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="priceByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                   &lt;element name="priceExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                   &lt;element name="priceDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="priceNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="quantity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="quantityItem" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OKEIByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
     *                             &lt;element name="quantityByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                             &lt;element name="OKEIExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
     *                             &lt;element name="quantityExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="quantityDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="quantityNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="advanceMarker" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element name="advance">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="advanceItem" maxOccurs="unbounded">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="advanceByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                               &lt;element name="advanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="advanceExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                               &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="advanceDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                     &lt;element name="advanceNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "provideByContract",
        "executed",
        "price",
        "quantity",
        "advanceMarker",
        "advance"
    })
    public static class ExecutionInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContractExecutionType provideByContract;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContractExecutionType executed;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportContractExecutionType.ExecutionInfo.Price price;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity quantity;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean advanceMarker;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance advance;

        /**
         * Gets the value of the provideByContract property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractExecutionType }
         *     
         */
        public ZfcsContractExecutionType getProvideByContract() {
            return provideByContract;
        }

        /**
         * Sets the value of the provideByContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractExecutionType }
         *     
         */
        public void setProvideByContract(ZfcsContractExecutionType value) {
            this.provideByContract = value;
        }

        /**
         * Gets the value of the executed property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractExecutionType }
         *     
         */
        public ZfcsContractExecutionType getExecuted() {
            return executed;
        }

        /**
         * Sets the value of the executed property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractExecutionType }
         *     
         */
        public void setExecuted(ZfcsContractExecutionType value) {
            this.executed = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo.Price }
         *     
         */
        public ZfcsCustomerReportContractExecutionType.ExecutionInfo.Price getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo.Price }
         *     
         */
        public void setPrice(ZfcsCustomerReportContractExecutionType.ExecutionInfo.Price value) {
            this.price = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity }
         *     
         */
        public ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity }
         *     
         */
        public void setQuantity(ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the advanceMarker property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdvanceMarker() {
            return advanceMarker;
        }

        /**
         * Sets the value of the advanceMarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdvanceMarker(Boolean value) {
            this.advanceMarker = value;
        }

        /**
         * Gets the value of the advance property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance }
         *     
         */
        public ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance getAdvance() {
            return advance;
        }

        /**
         * Sets the value of the advance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance }
         *     
         */
        public void setAdvance(ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance value) {
            this.advance = value;
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
         *         &lt;element name="advanceItem" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="advanceByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *                   &lt;element name="advanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="advanceExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *                   &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="advanceDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="advanceNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "advanceItem",
            "advanceDocument",
            "advanceNote"
        })
        public static class Advance {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance.AdvanceItem> advanceItem;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String advanceDocument;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String advanceNote;

            /**
             * Gets the value of the advanceItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the advanceItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdvanceItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance.AdvanceItem }
             * 
             * 
             */
            public List<ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance.AdvanceItem> getAdvanceItem() {
                if (advanceItem == null) {
                    advanceItem = new ArrayList<ZfcsCustomerReportContractExecutionType.ExecutionInfo.Advance.AdvanceItem>();
                }
                return this.advanceItem;
            }

            /**
             * Gets the value of the advanceDocument property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdvanceDocument() {
                return advanceDocument;
            }

            /**
             * Sets the value of the advanceDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdvanceDocument(String value) {
                this.advanceDocument = value;
            }

            /**
             * Gets the value of the advanceNote property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdvanceNote() {
                return advanceNote;
            }

            /**
             * Sets the value of the advanceNote property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdvanceNote(String value) {
                this.advanceNote = value;
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
             *         &lt;element name="advanceByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
             *         &lt;element name="advanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="advanceExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
             *         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "advanceByContract",
                "advanceDate",
                "advanceExecution",
                "executionDate"
            })
            public static class AdvanceItem {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String advanceByContract;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar advanceDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String advanceExecution;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar executionDate;

                /**
                 * Gets the value of the advanceByContract property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdvanceByContract() {
                    return advanceByContract;
                }

                /**
                 * Sets the value of the advanceByContract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdvanceByContract(String value) {
                    this.advanceByContract = value;
                }

                /**
                 * Gets the value of the advanceDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getAdvanceDate() {
                    return advanceDate;
                }

                /**
                 * Sets the value of the advanceDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setAdvanceDate(XMLGregorianCalendar value) {
                    this.advanceDate = value;
                }

                /**
                 * Gets the value of the advanceExecution property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdvanceExecution() {
                    return advanceExecution;
                }

                /**
                 * Sets the value of the advanceExecution property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdvanceExecution(String value) {
                    this.advanceExecution = value;
                }

                /**
                 * Gets the value of the executionDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getExecutionDate() {
                    return executionDate;
                }

                /**
                 * Sets the value of the executionDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setExecutionDate(XMLGregorianCalendar value) {
                    this.executionDate = value;
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
         *         &lt;element name="priceByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *         &lt;element name="priceExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *         &lt;element name="priceDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="priceNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "priceByContract",
            "priceExecution",
            "priceDocument",
            "priceNote"
        })
        public static class Price {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String priceByContract;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String priceExecution;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String priceDocument;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String priceNote;

            /**
             * Gets the value of the priceByContract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceByContract() {
                return priceByContract;
            }

            /**
             * Sets the value of the priceByContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceByContract(String value) {
                this.priceByContract = value;
            }

            /**
             * Gets the value of the priceExecution property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceExecution() {
                return priceExecution;
            }

            /**
             * Sets the value of the priceExecution property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceExecution(String value) {
                this.priceExecution = value;
            }

            /**
             * Gets the value of the priceDocument property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceDocument() {
                return priceDocument;
            }

            /**
             * Sets the value of the priceDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceDocument(String value) {
                this.priceDocument = value;
            }

            /**
             * Gets the value of the priceNote property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceNote() {
                return priceNote;
            }

            /**
             * Sets the value of the priceNote property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceNote(String value) {
                this.priceNote = value;
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
         *         &lt;element name="quantityItem" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OKEIByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
         *                   &lt;element name="quantityByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                   &lt;element name="OKEIExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
         *                   &lt;element name="quantityExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="quantityDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="quantityNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "quantityItem",
            "quantityDocument",
            "quantityNote"
        })
        public static class Quantity {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity.QuantityItem> quantityItem;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String quantityDocument;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String quantityNote;

            /**
             * Gets the value of the quantityItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the quantityItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getQuantityItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity.QuantityItem }
             * 
             * 
             */
            public List<ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity.QuantityItem> getQuantityItem() {
                if (quantityItem == null) {
                    quantityItem = new ArrayList<ZfcsCustomerReportContractExecutionType.ExecutionInfo.Quantity.QuantityItem>();
                }
                return this.quantityItem;
            }

            /**
             * Gets the value of the quantityDocument property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuantityDocument() {
                return quantityDocument;
            }

            /**
             * Sets the value of the quantityDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantityDocument(String value) {
                this.quantityDocument = value;
            }

            /**
             * Gets the value of the quantityNote property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuantityNote() {
                return quantityNote;
            }

            /**
             * Sets the value of the quantityNote property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantityNote(String value) {
                this.quantityNote = value;
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
             *         &lt;element name="OKEIByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
             *         &lt;element name="quantityByContract" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
             *         &lt;element name="OKEIExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
             *         &lt;element name="quantityExecution" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
                "okeiByContract",
                "quantityByContract",
                "okeiExecution",
                "quantityExecution"
            })
            public static class QuantityItem {

                @XmlElement(name = "OKEIByContract", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKEIRef okeiByContract;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String quantityByContract;
                @XmlElement(name = "OKEIExecution", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKEIRef okeiExecution;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String quantityExecution;

                /**
                 * Gets the value of the okeiByContract property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsOKEIRef }
                 *     
                 */
                public ZfcsOKEIRef getOKEIByContract() {
                    return okeiByContract;
                }

                /**
                 * Sets the value of the okeiByContract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsOKEIRef }
                 *     
                 */
                public void setOKEIByContract(ZfcsOKEIRef value) {
                    this.okeiByContract = value;
                }

                /**
                 * Gets the value of the quantityByContract property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQuantityByContract() {
                    return quantityByContract;
                }

                /**
                 * Sets the value of the quantityByContract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQuantityByContract(String value) {
                    this.quantityByContract = value;
                }

                /**
                 * Gets the value of the okeiExecution property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsOKEIRef }
                 *     
                 */
                public ZfcsOKEIRef getOKEIExecution() {
                    return okeiExecution;
                }

                /**
                 * Sets the value of the okeiExecution property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsOKEIRef }
                 *     
                 */
                public void setOKEIExecution(ZfcsOKEIRef value) {
                    this.okeiExecution = value;
                }

                /**
                 * Gets the value of the quantityExecution property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQuantityExecution() {
                    return quantityExecution;
                }

                /**
                 * Sets the value of the quantityExecution property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQuantityExecution(String value) {
                    this.quantityExecution = value;
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
     *         &lt;element name="conformContractMarker" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;sequence>
     *           &lt;element name="improperExecution" maxOccurs="unbounded">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;sequence>
     *                       &lt;element name="indicator" type="{http://zakupki.gov.ru/oos/types/1}zfcs_improperIndicatorTypeEnum"/>
     *                       &lt;element name="indicatorName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_improperIndicatorNameEnum" minOccurs="0"/>
     *                     &lt;/sequence>
     *                     &lt;element name="nameObligations" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                     &lt;element name="essenceViolation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                     &lt;element name="penaltyInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                     &lt;element name="penaltyDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                     &lt;element name="note" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
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
        "conformContractMarker",
        "improperExecution"
    })
    public static class ImproperExecutionInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean conformContractMarker;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo.ImproperExecution> improperExecution;

        /**
         * Gets the value of the conformContractMarker property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isConformContractMarker() {
            return conformContractMarker;
        }

        /**
         * Sets the value of the conformContractMarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setConformContractMarker(Boolean value) {
            this.conformContractMarker = value;
        }

        /**
         * Gets the value of the improperExecution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the improperExecution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImproperExecution().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo.ImproperExecution }
         * 
         * 
         */
        public List<ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo.ImproperExecution> getImproperExecution() {
            if (improperExecution == null) {
                improperExecution = new ArrayList<ZfcsCustomerReportContractExecutionType.ImproperExecutionInfo.ImproperExecution>();
            }
            return this.improperExecution;
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
         *         &lt;sequence>
         *           &lt;element name="indicator" type="{http://zakupki.gov.ru/oos/types/1}zfcs_improperIndicatorTypeEnum"/>
         *           &lt;element name="indicatorName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_improperIndicatorNameEnum" minOccurs="0"/>
         *         &lt;/sequence>
         *         &lt;element name="nameObligations" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="essenceViolation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="penaltyInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="penaltyDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="note" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "indicatorName",
            "nameObligations",
            "essenceViolation",
            "penaltyInfo",
            "penaltyDoc",
            "note"
        })
        public static class ImproperExecution {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsImproperIndicatorTypeEnum indicator;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected ZfcsImproperIndicatorNameEnum indicatorName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String nameObligations;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String essenceViolation;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String penaltyInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String penaltyDoc;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String note;

            /**
             * Gets the value of the indicator property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsImproperIndicatorTypeEnum }
             *     
             */
            public ZfcsImproperIndicatorTypeEnum getIndicator() {
                return indicator;
            }

            /**
             * Sets the value of the indicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsImproperIndicatorTypeEnum }
             *     
             */
            public void setIndicator(ZfcsImproperIndicatorTypeEnum value) {
                this.indicator = value;
            }

            /**
             * Gets the value of the indicatorName property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsImproperIndicatorNameEnum }
             *     
             */
            public ZfcsImproperIndicatorNameEnum getIndicatorName() {
                return indicatorName;
            }

            /**
             * Sets the value of the indicatorName property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsImproperIndicatorNameEnum }
             *     
             */
            public void setIndicatorName(ZfcsImproperIndicatorNameEnum value) {
                this.indicatorName = value;
            }

            /**
             * Gets the value of the nameObligations property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameObligations() {
                return nameObligations;
            }

            /**
             * Sets the value of the nameObligations property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameObligations(String value) {
                this.nameObligations = value;
            }

            /**
             * Gets the value of the essenceViolation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEssenceViolation() {
                return essenceViolation;
            }

            /**
             * Sets the value of the essenceViolation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEssenceViolation(String value) {
                this.essenceViolation = value;
            }

            /**
             * Gets the value of the penaltyInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPenaltyInfo() {
                return penaltyInfo;
            }

            /**
             * Sets the value of the penaltyInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPenaltyInfo(String value) {
                this.penaltyInfo = value;
            }

            /**
             * Gets the value of the penaltyDoc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPenaltyDoc() {
                return penaltyDoc;
            }

            /**
             * Sets the value of the penaltyDoc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPenaltyDoc(String value) {
                this.penaltyDoc = value;
            }

            /**
             * Gets the value of the note property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNote() {
                return note;
            }

            /**
             * Sets the value of the note property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNote(String value) {
                this.note = value;
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
     *         &lt;element name="modifyContract" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_modifyTerminateContractType">
     *                 &lt;sequence>
     *                   &lt;element name="reason">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonCodeType"/>
     *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonNameType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="terminateContract" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_modifyTerminateContractType">
     *                 &lt;sequence>
     *                   &lt;element name="reason">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="01"/>
     *                                   &lt;enumeration value="02"/>
     *                                   &lt;enumeration value="03"/>
     *                                   &lt;enumeration value="04"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonNameType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "modifyContract",
        "terminateContract"
    })
    public static class ModifyTerminateInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract> modifyContract;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract terminateContract;

        /**
         * Gets the value of the modifyContract property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifyContract property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifyContract().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract }
         * 
         * 
         */
        public List<ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract> getModifyContract() {
            if (modifyContract == null) {
                modifyContract = new ArrayList<ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract>();
            }
            return this.modifyContract;
        }

        /**
         * Gets the value of the terminateContract property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract }
         *     
         */
        public ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract getTerminateContract() {
            return terminateContract;
        }

        /**
         * Sets the value of the terminateContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract }
         *     
         */
        public void setTerminateContract(ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract value) {
            this.terminateContract = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_modifyTerminateContractType">
         *       &lt;sequence>
         *         &lt;element name="reason">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonCodeType"/>
         *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonNameType" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "reason"
        })
        public static class ModifyContract
            extends ZfcsModifyTerminateContractType
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract.Reason reason;

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract.Reason }
             *     
             */
            public ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract.Reason getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract.Reason }
             *     
             */
            public void setReason(ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.ModifyContract.Reason value) {
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
             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonCodeType"/>
             *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonNameType" minOccurs="0"/>
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_modifyTerminateContractType">
         *       &lt;sequence>
         *         &lt;element name="reason">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="01"/>
         *                         &lt;enumeration value="02"/>
         *                         &lt;enumeration value="03"/>
         *                         &lt;enumeration value="04"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonNameType" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "reason"
        })
        public static class TerminateContract
            extends ZfcsModifyTerminateContractType
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract.Reason reason;

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract.Reason }
             *     
             */
            public ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract.Reason getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract.Reason }
             *     
             */
            public void setReason(ZfcsCustomerReportContractExecutionType.ModifyTerminateInfo.TerminateContract.Reason value) {
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
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="01"/>
             *               &lt;enumeration value="02"/>
             *               &lt;enumeration value="03"/>
             *               &lt;enumeration value="04"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonNameType" minOccurs="0"/>
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
     *         &lt;element name="supplier" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}phoneType"/>
     *                   &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}eMailType"/>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="OKSM" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKSMRef"/>
     *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType" minOccurs="0"/>
     *                   &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *                   &lt;element name="OKFS" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKFSRef" minOccurs="0"/>
     *                   &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
     *                   &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
     *                   &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSupplierStatusEnum" minOccurs="0"/>
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
        "supplier"
    })
    public static class Suppliers {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsCustomerReportContractExecutionType.Suppliers.Supplier> supplier;

        /**
         * Gets the value of the supplier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportContractExecutionType.Suppliers.Supplier }
         * 
         * 
         */
        public List<ZfcsCustomerReportContractExecutionType.Suppliers.Supplier> getSupplier() {
            if (supplier == null) {
                supplier = new ArrayList<ZfcsCustomerReportContractExecutionType.Suppliers.Supplier>();
            }
            return this.supplier;
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
         *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}phoneType"/>
         *         &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}eMailType"/>
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="OKSM" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKSMRef"/>
         *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType" minOccurs="0"/>
         *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
         *         &lt;element name="OKFS" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKFSRef" minOccurs="0"/>
         *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
         *         &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
         *         &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSupplierStatusEnum" minOccurs="0"/>
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
            "fullName",
            "phone",
            "email",
            "address",
            "oksm",
            "inn",
            "kpp",
            "okfs",
            "okpo",
            "okopf",
            "status"
        })
        public static class Supplier {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String fullName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String phone;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String email;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String address;
            @XmlElement(name = "OKSM", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsOKSMRef oksm;
            @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String inn;
            @XmlElement(name = "KPP", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String kpp;
            @XmlElement(name = "OKFS", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKFSRef okfs;
            @XmlElement(name = "OKPO", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPORef okpo;
            @XmlElement(name = "OKOPF", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOkopfRef okopf;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String status;

            /**
             * Gets the value of the fullName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * Sets the value of the fullName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the oksm property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKSMRef }
             *     
             */
            public ZfcsOKSMRef getOKSM() {
                return oksm;
            }

            /**
             * Sets the value of the oksm property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKSMRef }
             *     
             */
            public void setOKSM(ZfcsOKSMRef value) {
                this.oksm = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINN() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINN(String value) {
                this.inn = value;
            }

            /**
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKPP() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKPP(String value) {
                this.kpp = value;
            }

            /**
             * Gets the value of the okfs property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKFSRef }
             *     
             */
            public ZfcsOKFSRef getOKFS() {
                return okfs;
            }

            /**
             * Sets the value of the okfs property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKFSRef }
             *     
             */
            public void setOKFS(ZfcsOKFSRef value) {
                this.okfs = value;
            }

            /**
             * Gets the value of the okpo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKPORef }
             *     
             */
            public ZfcsOKPORef getOKPO() {
                return okpo;
            }

            /**
             * Sets the value of the okpo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKPORef }
             *     
             */
            public void setOKPO(ZfcsOKPORef value) {
                this.okpo = value;
            }

            /**
             * Gets the value of the okopf property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOkopfRef }
             *     
             */
            public ZfcsOkopfRef getOKOPF() {
                return okopf;
            }

            /**
             * Sets the value of the okopf property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOkopfRef }
             *     
             */
            public void setOKOPF(ZfcsOkopfRef value) {
                this.okopf = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

        }

    }

}
