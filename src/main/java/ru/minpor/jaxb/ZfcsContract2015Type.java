
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
 * Информация (проект информации) о заключенном контракте с 01.01.2015
 * 
 * <p>Java class for zfcs_contract2015Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contract2015Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="foundation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="oosOrder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="order">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
 *                                       &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.purchasePlacing94Type" minOccurs="0"/>
 *                                       &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType"/>
 *                             &lt;element name="notOosOrder">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.purchasePlacingType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="other">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="notificationNumber" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.purchasePlacing94Type" minOccurs="0"/>
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
 *                   &lt;element name="fcsOrder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="order">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                                       &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="placing" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.purchasePlacingType">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="singleCustomer">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="notOosOrder">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.notOOSPlacingType"/>
 *                                       &lt;element name="document" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
 *                                                 &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType" minOccurs="0"/>
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
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef">
 *                 &lt;sequence>
 *                   &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
 *                   &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                   &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}okopfType" minOccurs="0"/>
 *                   &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType" minOccurs="0"/>
 *                   &lt;element name="customerCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikuType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="placer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placerRoleContract2015Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="finances">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="budgetFunds" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="budget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFundsContract2015"/>
 *                             &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                             &lt;element name="budgetLevel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetLevelContract2015Type" minOccurs="0"/>
 *                             &lt;element name="stages" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="payments" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;choice>
 *                                                   &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
 *                                                   &lt;element name="KBK2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
 *                                                 &lt;/choice>
 *                                                 &lt;element name="comment" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType">
 *                                                       &lt;minLength value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
 *                                                 &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                                                 &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                                 &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="extrabudgetFunds" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="extrabudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extraBudgetFundsContract2015" minOccurs="0"/>
 *                             &lt;element name="stages" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="payments" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;choice>
 *                                                   &lt;element name="KOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kosguType"/>
 *                                                   &lt;element name="KVR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
 *                                                 &lt;/choice>
 *                                                 &lt;element name="comment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                                 &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
 *                                                 &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                                                 &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                                 &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="documentBase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="documentCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNum2015Type" minOccurs="0"/>
 *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.Number2015Type" minOccurs="0"/>
 *         &lt;element name="priceInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="priceType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                         &lt;enumeration value="P"/>
 *                         &lt;enumeration value="OP"/>
 *                         &lt;enumeration value="MP"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="priceFormula" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                   &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subContractorsSum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sumInPercents">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="priceValueRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="executionPeriod">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="stages" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enforcement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="bankGuarantee">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType"/>
 *                             &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                             &lt;element name="guaranteeAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="guaranteeAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="cashAccount">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                             &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *         &lt;element name="guaranteeReturns" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015BankGuaranteeReturnType" minOccurs="0"/>
 *         &lt;element name="energyServiceContractInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="products">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="product" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sid" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;choice>
 *                               &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                               &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                             &lt;/choice>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType"/>
 *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="sumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="productsChange" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="documents" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="documentName" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="1000"/>
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="documentNum" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="changeInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
 *         &lt;element name="suppliers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="supplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SupplierType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="scanDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="medicalDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="contractChange">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="reason">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonCodeType"/>
 *                                         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonNameType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="document">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonDocCodeType"/>
 *                                         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonDocNameType" minOccurs="0"/>
 *                                         &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="damagePayments" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
 *                                         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                                         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                                         &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="errorCorrection">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="currentContractStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.contractStageType" minOccurs="0"/>
 *         &lt;element name="okpd2okved2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionContract2015Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contract2015Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "publishDate",
    "versionNumber",
    "foundation",
    "customer",
    "placer",
    "finances",
    "protocolDate",
    "documentBase",
    "documentCode",
    "signDate",
    "regNum",
    "number",
    "priceInfo",
    "subContractorsSum",
    "executionPeriod",
    "enforcement",
    "guaranteeReturns",
    "energyServiceContractInfo",
    "products",
    "suppliers",
    "href",
    "printForm",
    "extPrintForm",
    "scanDocuments",
    "medicalDocuments",
    "attachments",
    "modification",
    "currentContractStage",
    "okpd2Okved2"
})
public class ZfcsContract2015Type {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContract2015Type.Foundation foundation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContract2015Type.Customer customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015Type.Placer placer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContract2015Type.Finances finances;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String documentBase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String documentCode;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String regNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String number;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContract2015Type.PriceInfo priceInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015Type.SubContractorsSum subContractorsSum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContract2015Type.ExecutionPeriod executionPeriod;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015Type.Enforcement enforcement;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015BankGuaranteeReturnType guaranteeReturns;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String energyServiceContractInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContract2015Type.Products products;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContract2015Type.Suppliers suppliers;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType scanDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType medicalDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015Type.Modification modification;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsContractContractStageType currentContractStage;
    @XmlElement(name = "okpd2okved2", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean okpd2Okved2;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
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
     * Gets the value of the foundation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.Foundation }
     *     
     */
    public ZfcsContract2015Type.Foundation getFoundation() {
        return foundation;
    }

    /**
     * Sets the value of the foundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.Foundation }
     *     
     */
    public void setFoundation(ZfcsContract2015Type.Foundation value) {
        this.foundation = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.Customer }
     *     
     */
    public ZfcsContract2015Type.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.Customer }
     *     
     */
    public void setCustomer(ZfcsContract2015Type.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the placer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.Placer }
     *     
     */
    public ZfcsContract2015Type.Placer getPlacer() {
        return placer;
    }

    /**
     * Sets the value of the placer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.Placer }
     *     
     */
    public void setPlacer(ZfcsContract2015Type.Placer value) {
        this.placer = value;
    }

    /**
     * Gets the value of the finances property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.Finances }
     *     
     */
    public ZfcsContract2015Type.Finances getFinances() {
        return finances;
    }

    /**
     * Sets the value of the finances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.Finances }
     *     
     */
    public void setFinances(ZfcsContract2015Type.Finances value) {
        this.finances = value;
    }

    /**
     * Gets the value of the protocolDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolDate() {
        return protocolDate;
    }

    /**
     * Sets the value of the protocolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolDate(XMLGregorianCalendar value) {
        this.protocolDate = value;
    }

    /**
     * Gets the value of the documentBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentBase() {
        return documentBase;
    }

    /**
     * Sets the value of the documentBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentBase(String value) {
        this.documentBase = value;
    }

    /**
     * Gets the value of the documentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /**
     * Sets the value of the documentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentCode(String value) {
        this.documentCode = value;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.PriceInfo }
     *     
     */
    public ZfcsContract2015Type.PriceInfo getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.PriceInfo }
     *     
     */
    public void setPriceInfo(ZfcsContract2015Type.PriceInfo value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the subContractorsSum property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.SubContractorsSum }
     *     
     */
    public ZfcsContract2015Type.SubContractorsSum getSubContractorsSum() {
        return subContractorsSum;
    }

    /**
     * Sets the value of the subContractorsSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.SubContractorsSum }
     *     
     */
    public void setSubContractorsSum(ZfcsContract2015Type.SubContractorsSum value) {
        this.subContractorsSum = value;
    }

    /**
     * Gets the value of the executionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.ExecutionPeriod }
     *     
     */
    public ZfcsContract2015Type.ExecutionPeriod getExecutionPeriod() {
        return executionPeriod;
    }

    /**
     * Sets the value of the executionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.ExecutionPeriod }
     *     
     */
    public void setExecutionPeriod(ZfcsContract2015Type.ExecutionPeriod value) {
        this.executionPeriod = value;
    }

    /**
     * Gets the value of the enforcement property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.Enforcement }
     *     
     */
    public ZfcsContract2015Type.Enforcement getEnforcement() {
        return enforcement;
    }

    /**
     * Sets the value of the enforcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.Enforcement }
     *     
     */
    public void setEnforcement(ZfcsContract2015Type.Enforcement value) {
        this.enforcement = value;
    }

    /**
     * Gets the value of the guaranteeReturns property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015BankGuaranteeReturnType }
     *     
     */
    public ZfcsContract2015BankGuaranteeReturnType getGuaranteeReturns() {
        return guaranteeReturns;
    }

    /**
     * Sets the value of the guaranteeReturns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015BankGuaranteeReturnType }
     *     
     */
    public void setGuaranteeReturns(ZfcsContract2015BankGuaranteeReturnType value) {
        this.guaranteeReturns = value;
    }

    /**
     * Gets the value of the energyServiceContractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyServiceContractInfo() {
        return energyServiceContractInfo;
    }

    /**
     * Sets the value of the energyServiceContractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyServiceContractInfo(String value) {
        this.energyServiceContractInfo = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.Products }
     *     
     */
    public ZfcsContract2015Type.Products getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.Products }
     *     
     */
    public void setProducts(ZfcsContract2015Type.Products value) {
        this.products = value;
    }

    /**
     * Gets the value of the suppliers property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.Suppliers }
     *     
     */
    public ZfcsContract2015Type.Suppliers getSuppliers() {
        return suppliers;
    }

    /**
     * Sets the value of the suppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.Suppliers }
     *     
     */
    public void setSuppliers(ZfcsContract2015Type.Suppliers value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractPrintFormType }
     *     
     */
    public ZfcsContractPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsContractPrintFormType value) {
        this.printForm = value;
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
     * Gets the value of the scanDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getScanDocuments() {
        return scanDocuments;
    }

    /**
     * Sets the value of the scanDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setScanDocuments(ZfcsContractAttachmentListType value) {
        this.scanDocuments = value;
    }

    /**
     * Gets the value of the medicalDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getMedicalDocuments() {
        return medicalDocuments;
    }

    /**
     * Sets the value of the medicalDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setMedicalDocuments(ZfcsContractAttachmentListType value) {
        this.medicalDocuments = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsContractAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015Type.Modification }
     *     
     */
    public ZfcsContract2015Type.Modification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015Type.Modification }
     *     
     */
    public void setModification(ZfcsContract2015Type.Modification value) {
        this.modification = value;
    }

    /**
     * Gets the value of the currentContractStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractContractStageType }
     *     
     */
    public ZfcsContractContractStageType getCurrentContractStage() {
        return currentContractStage;
    }

    /**
     * Sets the value of the currentContractStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractContractStageType }
     *     
     */
    public void setCurrentContractStage(ZfcsContractContractStageType value) {
        this.currentContractStage = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef">
     *       &lt;sequence>
     *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
     *         &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *         &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}okopfType" minOccurs="0"/>
     *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType" minOccurs="0"/>
     *         &lt;element name="customerCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikuType" minOccurs="0"/>
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
        "shortName",
        "registrationDate",
        "inn",
        "kpp",
        "legalForm",
        "okpo",
        "customerCode"
    })
    public static class Customer
        extends ZfcsOrganizationRef
    {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String shortName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String inn;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String kpp;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected OkopfType legalForm;
        @XmlElement(name = "OKPO", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String okpo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String customerCode;

        /**
         * Gets the value of the shortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortName(String value) {
            this.shortName = value;
        }

        /**
         * Gets the value of the registrationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistrationDate() {
            return registrationDate;
        }

        /**
         * Sets the value of the registrationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegistrationDate(XMLGregorianCalendar value) {
            this.registrationDate = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInn() {
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
        public void setInn(String value) {
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
        public String getKpp() {
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
        public void setKpp(String value) {
            this.kpp = value;
        }

        /**
         * Gets the value of the legalForm property.
         * 
         * @return
         *     possible object is
         *     {@link OkopfType }
         *     
         */
        public OkopfType getLegalForm() {
            return legalForm;
        }

        /**
         * Sets the value of the legalForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link OkopfType }
         *     
         */
        public void setLegalForm(OkopfType value) {
            this.legalForm = value;
        }

        /**
         * Gets the value of the okpo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOKPO() {
            return okpo;
        }

        /**
         * Sets the value of the okpo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOKPO(String value) {
            this.okpo = value;
        }

        /**
         * Gets the value of the customerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerCode() {
            return customerCode;
        }

        /**
         * Sets the value of the customerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerCode(String value) {
            this.customerCode = value;
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
     *         &lt;element name="bankGuarantee">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType"/>
     *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *                   &lt;element name="guaranteeAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="guaranteeAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="cashAccount">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *                   &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "bankGuarantee",
        "cashAccount"
    })
    public static class Enforcement {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Enforcement.BankGuarantee bankGuarantee;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Enforcement.CashAccount cashAccount;

        /**
         * Gets the value of the bankGuarantee property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Enforcement.BankGuarantee }
         *     
         */
        public ZfcsContract2015Type.Enforcement.BankGuarantee getBankGuarantee() {
            return bankGuarantee;
        }

        /**
         * Sets the value of the bankGuarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Enforcement.BankGuarantee }
         *     
         */
        public void setBankGuarantee(ZfcsContract2015Type.Enforcement.BankGuarantee value) {
            this.bankGuarantee = value;
        }

        /**
         * Gets the value of the cashAccount property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Enforcement.CashAccount }
         *     
         */
        public ZfcsContract2015Type.Enforcement.CashAccount getCashAccount() {
            return cashAccount;
        }

        /**
         * Sets the value of the cashAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Enforcement.CashAccount }
         *     
         */
        public void setCashAccount(ZfcsContract2015Type.Enforcement.CashAccount value) {
            this.cashAccount = value;
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
         *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType"/>
         *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
         *         &lt;element name="guaranteeAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="guaranteeAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "regNumber",
            "docNumber",
            "currency",
            "guaranteeAmount",
            "currencyRate",
            "guaranteeAmountRUR"
        })
        public static class BankGuarantee {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String regNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String docNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String guaranteeAmount;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String guaranteeAmountRUR;

            /**
             * Gets the value of the regNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegNumber() {
                return regNumber;
            }

            /**
             * Sets the value of the regNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegNumber(String value) {
                this.regNumber = value;
            }

            /**
             * Gets the value of the docNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocNumber() {
                return docNumber;
            }

            /**
             * Sets the value of the docNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocNumber(String value) {
                this.docNumber = value;
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
             * Gets the value of the guaranteeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuaranteeAmount() {
                return guaranteeAmount;
            }

            /**
             * Sets the value of the guaranteeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuaranteeAmount(String value) {
                this.guaranteeAmount = value;
            }

            /**
             * Gets the value of the currencyRate property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCurrencyRateContract2015 }
             *     
             */
            public ZfcsCurrencyRateContract2015 getCurrencyRate() {
                return currencyRate;
            }

            /**
             * Sets the value of the currencyRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCurrencyRateContract2015 }
             *     
             */
            public void setCurrencyRate(ZfcsCurrencyRateContract2015 value) {
                this.currencyRate = value;
            }

            /**
             * Gets the value of the guaranteeAmountRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuaranteeAmountRUR() {
                return guaranteeAmountRUR;
            }

            /**
             * Sets the value of the guaranteeAmountRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuaranteeAmountRUR(String value) {
                this.guaranteeAmountRUR = value;
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
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
         *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "currency",
            "amount",
            "currencyRate",
            "amountRUR"
        })
        public static class CashAccount {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String amount;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String amountRUR;

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
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmount(String value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyRate property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCurrencyRateContract2015 }
             *     
             */
            public ZfcsCurrencyRateContract2015 getCurrencyRate() {
                return currencyRate;
            }

            /**
             * Sets the value of the currencyRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCurrencyRateContract2015 }
             *     
             */
            public void setCurrencyRate(ZfcsCurrencyRateContract2015 value) {
                this.currencyRate = value;
            }

            /**
             * Gets the value of the amountRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmountRUR() {
                return amountRUR;
            }

            /**
             * Sets the value of the amountRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmountRUR(String value) {
                this.amountRUR = value;
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
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="stages" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "startDate",
        "stages",
        "endDate"
    })
    public static class ExecutionPeriod {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsContract2015Type.ExecutionPeriod.Stages> stages;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;

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
         * Gets the value of the stages property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stages property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStages().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsContract2015Type.ExecutionPeriod.Stages }
         * 
         * 
         */
        public List<ZfcsContract2015Type.ExecutionPeriod.Stages> getStages() {
            if (stages == null) {
                stages = new ArrayList<ZfcsContract2015Type.ExecutionPeriod.Stages>();
            }
            return this.stages;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "endDate"
        })
        public static class Stages {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar endDate;

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
     *         &lt;element name="budgetFunds" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="budget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFundsContract2015"/>
     *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
     *                   &lt;element name="budgetLevel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetLevelContract2015Type" minOccurs="0"/>
     *                   &lt;element name="stages" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="payments" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
     *                                         &lt;element name="KBK2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
     *                                       &lt;/choice>
     *                                       &lt;element name="comment" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType">
     *                                             &lt;minLength value="1"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
     *                                       &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                                       &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                                       &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="extrabudgetFunds" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="extrabudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extraBudgetFundsContract2015" minOccurs="0"/>
     *                   &lt;element name="stages" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="payments" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="KOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kosguType"/>
     *                                         &lt;element name="KVR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
     *                                       &lt;/choice>
     *                                       &lt;element name="comment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                                       &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
     *                                       &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                                       &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                                       &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "budgetFunds",
        "extrabudgetFunds"
    })
    public static class Finances {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Finances.BudgetFunds budgetFunds;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Finances.ExtrabudgetFunds extrabudgetFunds;

        /**
         * Gets the value of the budgetFunds property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Finances.BudgetFunds }
         *     
         */
        public ZfcsContract2015Type.Finances.BudgetFunds getBudgetFunds() {
            return budgetFunds;
        }

        /**
         * Sets the value of the budgetFunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Finances.BudgetFunds }
         *     
         */
        public void setBudgetFunds(ZfcsContract2015Type.Finances.BudgetFunds value) {
            this.budgetFunds = value;
        }

        /**
         * Gets the value of the extrabudgetFunds property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Finances.ExtrabudgetFunds }
         *     
         */
        public ZfcsContract2015Type.Finances.ExtrabudgetFunds getExtrabudgetFunds() {
            return extrabudgetFunds;
        }

        /**
         * Sets the value of the extrabudgetFunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Finances.ExtrabudgetFunds }
         *     
         */
        public void setExtrabudgetFunds(ZfcsContract2015Type.Finances.ExtrabudgetFunds value) {
            this.extrabudgetFunds = value;
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
         *         &lt;element name="budget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFundsContract2015"/>
         *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
         *         &lt;element name="budgetLevel" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetLevelContract2015Type" minOccurs="0"/>
         *         &lt;element name="stages" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="payments" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
         *                               &lt;element name="KBK2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
         *                             &lt;/choice>
         *                             &lt;element name="comment" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType">
         *                                   &lt;minLength value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
         *                             &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *                             &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                             &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "budget",
            "oktmo",
            "budgetLevel",
            "stages"
        })
        public static class BudgetFunds {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBudgetFundsContract2015 budget;
            @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsOKTMORef oktmo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String budgetLevel;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsContract2015Type.Finances.BudgetFunds.Stages> stages;

            /**
             * Gets the value of the budget property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBudgetFundsContract2015 }
             *     
             */
            public ZfcsBudgetFundsContract2015 getBudget() {
                return budget;
            }

            /**
             * Sets the value of the budget property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBudgetFundsContract2015 }
             *     
             */
            public void setBudget(ZfcsBudgetFundsContract2015 value) {
                this.budget = value;
            }

            /**
             * Gets the value of the oktmo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKTMORef }
             *     
             */
            public ZfcsOKTMORef getOKTMO() {
                return oktmo;
            }

            /**
             * Sets the value of the oktmo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKTMORef }
             *     
             */
            public void setOKTMO(ZfcsOKTMORef value) {
                this.oktmo = value;
            }

            /**
             * Gets the value of the budgetLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBudgetLevel() {
                return budgetLevel;
            }

            /**
             * Sets the value of the budgetLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBudgetLevel(String value) {
                this.budgetLevel = value;
            }

            /**
             * Gets the value of the stages property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stages property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStages().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsContract2015Type.Finances.BudgetFunds.Stages }
             * 
             * 
             */
            public List<ZfcsContract2015Type.Finances.BudgetFunds.Stages> getStages() {
                if (stages == null) {
                    stages = new ArrayList<ZfcsContract2015Type.Finances.BudgetFunds.Stages>();
                }
                return this.stages;
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
             *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="payments" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
             *                     &lt;element name="KBK2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
             *                   &lt;/choice>
             *                   &lt;element name="comment" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType">
             *                         &lt;minLength value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
             *                   &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
             *                   &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *                   &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                "endDate",
                "payments"
            })
            public static class Stages {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar endDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsContract2015Type.Finances.BudgetFunds.Stages.Payments> payments;

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
                 * Gets the value of the payments property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the payments property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPayments().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsContract2015Type.Finances.BudgetFunds.Stages.Payments }
                 * 
                 * 
                 */
                public List<ZfcsContract2015Type.Finances.BudgetFunds.Stages.Payments> getPayments() {
                    if (payments == null) {
                        payments = new ArrayList<ZfcsContract2015Type.Finances.BudgetFunds.Stages.Payments>();
                    }
                    return this.payments;
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
                 *           &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
                 *           &lt;element name="KBK2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
                 *         &lt;/choice>
                 *         &lt;element name="comment" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType">
                 *               &lt;minLength value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
                 *         &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
                 *         &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
                 *         &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                    "kbk",
                    "kbk2016",
                    "comment",
                    "paymentMonth",
                    "paymentYear",
                    "paymentSum",
                    "paymentSumRUR"
                })
                public static class Payments {

                    @XmlElement(name = "KBK", namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String kbk;
                    @XmlElement(name = "KBK2016", namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String kbk2016;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String comment;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected byte paymentMonth;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected int paymentYear;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String paymentSum;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String paymentSumRUR;

                    /**
                     * Gets the value of the kbk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKBK() {
                        return kbk;
                    }

                    /**
                     * Sets the value of the kbk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKBK(String value) {
                        this.kbk = value;
                    }

                    /**
                     * Gets the value of the kbk2016 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKBK2016() {
                        return kbk2016;
                    }

                    /**
                     * Sets the value of the kbk2016 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKBK2016(String value) {
                        this.kbk2016 = value;
                    }

                    /**
                     * Gets the value of the comment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getComment() {
                        return comment;
                    }

                    /**
                     * Sets the value of the comment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setComment(String value) {
                        this.comment = value;
                    }

                    /**
                     * Gets the value of the paymentMonth property.
                     * 
                     */
                    public byte getPaymentMonth() {
                        return paymentMonth;
                    }

                    /**
                     * Sets the value of the paymentMonth property.
                     * 
                     */
                    public void setPaymentMonth(byte value) {
                        this.paymentMonth = value;
                    }

                    /**
                     * Gets the value of the paymentYear property.
                     * 
                     */
                    public int getPaymentYear() {
                        return paymentYear;
                    }

                    /**
                     * Sets the value of the paymentYear property.
                     * 
                     */
                    public void setPaymentYear(int value) {
                        this.paymentYear = value;
                    }

                    /**
                     * Gets the value of the paymentSum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentSum() {
                        return paymentSum;
                    }

                    /**
                     * Sets the value of the paymentSum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentSum(String value) {
                        this.paymentSum = value;
                    }

                    /**
                     * Gets the value of the paymentSumRUR property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentSumRUR() {
                        return paymentSumRUR;
                    }

                    /**
                     * Sets the value of the paymentSumRUR property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentSumRUR(String value) {
                        this.paymentSumRUR = value;
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
         *         &lt;element name="extrabudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extraBudgetFundsContract2015" minOccurs="0"/>
         *         &lt;element name="stages" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="payments" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="KOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kosguType"/>
         *                               &lt;element name="KVR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
         *                             &lt;/choice>
         *                             &lt;element name="comment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                             &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
         *                             &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *                             &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                             &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "extrabudget",
            "stages"
        })
        public static class ExtrabudgetFunds {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsExtraBudgetFundsContract2015 extrabudget;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsContract2015Type.Finances.ExtrabudgetFunds.Stages> stages;

            /**
             * Gets the value of the extrabudget property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsExtraBudgetFundsContract2015 }
             *     
             */
            public ZfcsExtraBudgetFundsContract2015 getExtrabudget() {
                return extrabudget;
            }

            /**
             * Sets the value of the extrabudget property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsExtraBudgetFundsContract2015 }
             *     
             */
            public void setExtrabudget(ZfcsExtraBudgetFundsContract2015 value) {
                this.extrabudget = value;
            }

            /**
             * Gets the value of the stages property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stages property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStages().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsContract2015Type.Finances.ExtrabudgetFunds.Stages }
             * 
             * 
             */
            public List<ZfcsContract2015Type.Finances.ExtrabudgetFunds.Stages> getStages() {
                if (stages == null) {
                    stages = new ArrayList<ZfcsContract2015Type.Finances.ExtrabudgetFunds.Stages>();
                }
                return this.stages;
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
             *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="payments" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="KOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kosguType"/>
             *                     &lt;element name="KVR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
             *                   &lt;/choice>
             *                   &lt;element name="comment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
             *                   &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
             *                   &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
             *                   &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *                   &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                "endDate",
                "payments"
            })
            public static class Stages {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar endDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsContract2015Type.Finances.ExtrabudgetFunds.Stages.Payments> payments;

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
                 * Gets the value of the payments property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the payments property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPayments().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsContract2015Type.Finances.ExtrabudgetFunds.Stages.Payments }
                 * 
                 * 
                 */
                public List<ZfcsContract2015Type.Finances.ExtrabudgetFunds.Stages.Payments> getPayments() {
                    if (payments == null) {
                        payments = new ArrayList<ZfcsContract2015Type.Finances.ExtrabudgetFunds.Stages.Payments>();
                    }
                    return this.payments;
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
                 *           &lt;element name="KOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kosguType"/>
                 *           &lt;element name="KVR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
                 *         &lt;/choice>
                 *         &lt;element name="comment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
                 *         &lt;element name="paymentMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
                 *         &lt;element name="paymentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
                 *         &lt;element name="paymentSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
                 *         &lt;element name="paymentSumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                    "kosgu",
                    "kvr",
                    "comment",
                    "paymentMonth",
                    "paymentYear",
                    "paymentSum",
                    "paymentSumRUR"
                })
                public static class Payments {

                    @XmlElement(name = "KOSGU", namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String kosgu;
                    @XmlElement(name = "KVR", namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String kvr;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String comment;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected byte paymentMonth;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected int paymentYear;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String paymentSum;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String paymentSumRUR;

                    /**
                     * Gets the value of the kosgu property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKOSGU() {
                        return kosgu;
                    }

                    /**
                     * Sets the value of the kosgu property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKOSGU(String value) {
                        this.kosgu = value;
                    }

                    /**
                     * Gets the value of the kvr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKVR() {
                        return kvr;
                    }

                    /**
                     * Sets the value of the kvr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKVR(String value) {
                        this.kvr = value;
                    }

                    /**
                     * Gets the value of the comment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getComment() {
                        return comment;
                    }

                    /**
                     * Sets the value of the comment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setComment(String value) {
                        this.comment = value;
                    }

                    /**
                     * Gets the value of the paymentMonth property.
                     * 
                     */
                    public byte getPaymentMonth() {
                        return paymentMonth;
                    }

                    /**
                     * Sets the value of the paymentMonth property.
                     * 
                     */
                    public void setPaymentMonth(byte value) {
                        this.paymentMonth = value;
                    }

                    /**
                     * Gets the value of the paymentYear property.
                     * 
                     */
                    public int getPaymentYear() {
                        return paymentYear;
                    }

                    /**
                     * Sets the value of the paymentYear property.
                     * 
                     */
                    public void setPaymentYear(int value) {
                        this.paymentYear = value;
                    }

                    /**
                     * Gets the value of the paymentSum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentSum() {
                        return paymentSum;
                    }

                    /**
                     * Sets the value of the paymentSum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentSum(String value) {
                        this.paymentSum = value;
                    }

                    /**
                     * Gets the value of the paymentSumRUR property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentSumRUR() {
                        return paymentSumRUR;
                    }

                    /**
                     * Sets the value of the paymentSumRUR property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentSumRUR(String value) {
                        this.paymentSumRUR = value;
                    }

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
     *         &lt;element name="oosOrder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="order">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
     *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.purchasePlacing94Type" minOccurs="0"/>
     *                             &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType"/>
     *                   &lt;element name="notOosOrder">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.purchasePlacingType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="other">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="notificationNumber" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                   &lt;minLength value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.purchasePlacing94Type" minOccurs="0"/>
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
     *         &lt;element name="fcsOrder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="order">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="placing" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.purchasePlacingType">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="singleCustomer">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="notOosOrder">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.notOOSPlacingType"/>
     *                             &lt;element name="document" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
     *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType" minOccurs="0"/>
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
     *                 &lt;/choice>
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
        "oosOrder",
        "fcsOrder"
    })
    public static class Foundation {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Foundation.OosOrder oosOrder;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Foundation.FcsOrder fcsOrder;

        /**
         * Gets the value of the oosOrder property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Foundation.OosOrder }
         *     
         */
        public ZfcsContract2015Type.Foundation.OosOrder getOosOrder() {
            return oosOrder;
        }

        /**
         * Sets the value of the oosOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Foundation.OosOrder }
         *     
         */
        public void setOosOrder(ZfcsContract2015Type.Foundation.OosOrder value) {
            this.oosOrder = value;
        }

        /**
         * Gets the value of the fcsOrder property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Foundation.FcsOrder }
         *     
         */
        public ZfcsContract2015Type.Foundation.FcsOrder getFcsOrder() {
            return fcsOrder;
        }

        /**
         * Sets the value of the fcsOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Foundation.FcsOrder }
         *     
         */
        public void setFcsOrder(ZfcsContract2015Type.Foundation.FcsOrder value) {
            this.fcsOrder = value;
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
         *         &lt;element name="order">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
         *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="placing" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.purchasePlacingType">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="singleCustomer">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="notOosOrder">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.notOOSPlacingType"/>
         *                   &lt;element name="document" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
         *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType" minOccurs="0"/>
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
            "order",
            "singleCustomer",
            "notOosOrder"
        })
        public static class FcsOrder {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContract2015Type.Foundation.FcsOrder.Order order;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContract2015Type.Foundation.FcsOrder.SingleCustomer singleCustomer;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder notOosOrder;

            /**
             * Gets the value of the order property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015Type.Foundation.FcsOrder.Order }
             *     
             */
            public ZfcsContract2015Type.Foundation.FcsOrder.Order getOrder() {
                return order;
            }

            /**
             * Sets the value of the order property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015Type.Foundation.FcsOrder.Order }
             *     
             */
            public void setOrder(ZfcsContract2015Type.Foundation.FcsOrder.Order value) {
                this.order = value;
            }

            /**
             * Gets the value of the singleCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015Type.Foundation.FcsOrder.SingleCustomer }
             *     
             */
            public ZfcsContract2015Type.Foundation.FcsOrder.SingleCustomer getSingleCustomer() {
                return singleCustomer;
            }

            /**
             * Sets the value of the singleCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015Type.Foundation.FcsOrder.SingleCustomer }
             *     
             */
            public void setSingleCustomer(ZfcsContract2015Type.Foundation.FcsOrder.SingleCustomer value) {
                this.singleCustomer = value;
            }

            /**
             * Gets the value of the notOosOrder property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder }
             *     
             */
            public ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder getNotOosOrder() {
                return notOosOrder;
            }

            /**
             * Sets the value of the notOosOrder property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder }
             *     
             */
            public void setNotOosOrder(ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder value) {
                this.notOosOrder = value;
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
             *         &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.notOOSPlacingType"/>
             *         &lt;element name="document" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
             *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType" minOccurs="0"/>
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
                "placing",
                "document"
            })
            public static class NotOosOrder {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String placing;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder.Document document;

                /**
                 * Gets the value of the placing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlacing() {
                    return placing;
                }

                /**
                 * Sets the value of the placing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlacing(String value) {
                    this.placing = value;
                }

                /**
                 * Gets the value of the document property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder.Document }
                 *     
                 */
                public ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder.Document getDocument() {
                    return document;
                }

                /**
                 * Sets the value of the document property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder.Document }
                 *     
                 */
                public void setDocument(ZfcsContract2015Type.Foundation.FcsOrder.NotOosOrder.Document value) {
                    this.document = value;
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
                 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
                 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType" minOccurs="0"/>
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
                public static class Document {

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
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
             *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="placing" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.purchasePlacingType">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType" minOccurs="0"/>
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
                "notificationNumber",
                "lotNumber",
                "placing",
                "singleCustomer"
            })
            public static class Order {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String notificationNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected int lotNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String placing;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsContract2015SingleCustomerType singleCustomer;

                /**
                 * Gets the value of the notificationNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotificationNumber() {
                    return notificationNumber;
                }

                /**
                 * Sets the value of the notificationNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotificationNumber(String value) {
                    this.notificationNumber = value;
                }

                /**
                 * Gets the value of the lotNumber property.
                 * 
                 */
                public int getLotNumber() {
                    return lotNumber;
                }

                /**
                 * Sets the value of the lotNumber property.
                 * 
                 */
                public void setLotNumber(int value) {
                    this.lotNumber = value;
                }

                /**
                 * Gets the value of the placing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlacing() {
                    return placing;
                }

                /**
                 * Sets the value of the placing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlacing(String value) {
                    this.placing = value;
                }

                /**
                 * Gets the value of the singleCustomer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContract2015SingleCustomerType }
                 *     
                 */
                public ZfcsContract2015SingleCustomerType getSingleCustomer() {
                    return singleCustomer;
                }

                /**
                 * Sets the value of the singleCustomer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContract2015SingleCustomerType }
                 *     
                 */
                public void setSingleCustomer(ZfcsContract2015SingleCustomerType value) {
                    this.singleCustomer = value;
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
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SingleCustomer
                extends ZfcsContract2015SingleCustomerType
            {


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
         *         &lt;element name="order">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
         *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.purchasePlacing94Type" minOccurs="0"/>
         *                   &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType"/>
         *         &lt;element name="notOosOrder">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.purchasePlacingType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="other">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="notificationNumber" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                         &lt;minLength value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.purchasePlacing94Type" minOccurs="0"/>
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
            "order",
            "singleCustomer",
            "notOosOrder",
            "other"
        })
        public static class OosOrder {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContract2015Type.Foundation.OosOrder.Order order;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContract2015SingleCustomerType singleCustomer;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContract2015Type.Foundation.OosOrder.NotOosOrder notOosOrder;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContract2015Type.Foundation.OosOrder.Other other;

            /**
             * Gets the value of the order property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015Type.Foundation.OosOrder.Order }
             *     
             */
            public ZfcsContract2015Type.Foundation.OosOrder.Order getOrder() {
                return order;
            }

            /**
             * Sets the value of the order property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015Type.Foundation.OosOrder.Order }
             *     
             */
            public void setOrder(ZfcsContract2015Type.Foundation.OosOrder.Order value) {
                this.order = value;
            }

            /**
             * Gets the value of the singleCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015SingleCustomerType }
             *     
             */
            public ZfcsContract2015SingleCustomerType getSingleCustomer() {
                return singleCustomer;
            }

            /**
             * Sets the value of the singleCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015SingleCustomerType }
             *     
             */
            public void setSingleCustomer(ZfcsContract2015SingleCustomerType value) {
                this.singleCustomer = value;
            }

            /**
             * Gets the value of the notOosOrder property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015Type.Foundation.OosOrder.NotOosOrder }
             *     
             */
            public ZfcsContract2015Type.Foundation.OosOrder.NotOosOrder getNotOosOrder() {
                return notOosOrder;
            }

            /**
             * Sets the value of the notOosOrder property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015Type.Foundation.OosOrder.NotOosOrder }
             *     
             */
            public void setNotOosOrder(ZfcsContract2015Type.Foundation.OosOrder.NotOosOrder value) {
                this.notOosOrder = value;
            }

            /**
             * Gets the value of the other property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015Type.Foundation.OosOrder.Other }
             *     
             */
            public ZfcsContract2015Type.Foundation.OosOrder.Other getOther() {
                return other;
            }

            /**
             * Sets the value of the other property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015Type.Foundation.OosOrder.Other }
             *     
             */
            public void setOther(ZfcsContract2015Type.Foundation.OosOrder.Other value) {
                this.other = value;
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
             *         &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.purchasePlacingType"/>
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
                "placing"
            })
            public static class NotOosOrder {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String placing;

                /**
                 * Gets the value of the placing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlacing() {
                    return placing;
                }

                /**
                 * Sets the value of the placing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlacing(String value) {
                    this.placing = value;
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
             *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
             *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.purchasePlacing94Type" minOccurs="0"/>
             *         &lt;element name="singleCustomer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SingleCustomerType" minOccurs="0"/>
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
                "notificationNumber",
                "lotNumber",
                "placing",
                "singleCustomer"
            })
            public static class Order {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String notificationNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected int lotNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String placing;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsContract2015SingleCustomerType singleCustomer;

                /**
                 * Gets the value of the notificationNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotificationNumber() {
                    return notificationNumber;
                }

                /**
                 * Sets the value of the notificationNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotificationNumber(String value) {
                    this.notificationNumber = value;
                }

                /**
                 * Gets the value of the lotNumber property.
                 * 
                 */
                public int getLotNumber() {
                    return lotNumber;
                }

                /**
                 * Sets the value of the lotNumber property.
                 * 
                 */
                public void setLotNumber(int value) {
                    this.lotNumber = value;
                }

                /**
                 * Gets the value of the placing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlacing() {
                    return placing;
                }

                /**
                 * Sets the value of the placing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlacing(String value) {
                    this.placing = value;
                }

                /**
                 * Gets the value of the singleCustomer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContract2015SingleCustomerType }
                 *     
                 */
                public ZfcsContract2015SingleCustomerType getSingleCustomer() {
                    return singleCustomer;
                }

                /**
                 * Sets the value of the singleCustomer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContract2015SingleCustomerType }
                 *     
                 */
                public void setSingleCustomer(ZfcsContract2015SingleCustomerType value) {
                    this.singleCustomer = value;
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
             *         &lt;element name="notificationNumber" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="placing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.purchasePlacing94Type" minOccurs="0"/>
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
                "notificationNumber",
                "placing"
            })
            public static class Other {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String notificationNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String placing;

                /**
                 * Gets the value of the notificationNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotificationNumber() {
                    return notificationNumber;
                }

                /**
                 * Sets the value of the notificationNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotificationNumber(String value) {
                    this.notificationNumber = value;
                }

                /**
                 * Gets the value of the placing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlacing() {
                    return placing;
                }

                /**
                 * Sets the value of the placing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlacing(String value) {
                    this.placing = value;
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
     *         &lt;choice>
     *           &lt;element name="contractChange">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="reason">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonCodeType"/>
     *                               &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonNameType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="document">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonDocCodeType"/>
     *                               &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonDocNameType" minOccurs="0"/>
     *                               &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="damagePayments" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
     *                               &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *                               &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                               &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                               &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
     *           &lt;element name="errorCorrection">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
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
        "contractChange",
        "errorCorrection",
        "attachments"
    })
    public static class Modification {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Modification.ContractChange contractChange;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Modification.ErrorCorrection errorCorrection;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractAttachmentListType attachments;

        /**
         * Gets the value of the contractChange property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Modification.ContractChange }
         *     
         */
        public ZfcsContract2015Type.Modification.ContractChange getContractChange() {
            return contractChange;
        }

        /**
         * Sets the value of the contractChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Modification.ContractChange }
         *     
         */
        public void setContractChange(ZfcsContract2015Type.Modification.ContractChange value) {
            this.contractChange = value;
        }

        /**
         * Gets the value of the errorCorrection property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Modification.ErrorCorrection }
         *     
         */
        public ZfcsContract2015Type.Modification.ErrorCorrection getErrorCorrection() {
            return errorCorrection;
        }

        /**
         * Sets the value of the errorCorrection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Modification.ErrorCorrection }
         *     
         */
        public void setErrorCorrection(ZfcsContract2015Type.Modification.ErrorCorrection value) {
            this.errorCorrection = value;
        }

        /**
         * Gets the value of the attachments property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractAttachmentListType }
         *     
         */
        public ZfcsContractAttachmentListType getAttachments() {
            return attachments;
        }

        /**
         * Sets the value of the attachments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractAttachmentListType }
         *     
         */
        public void setAttachments(ZfcsContractAttachmentListType value) {
            this.attachments = value;
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
         *         &lt;element name="document">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonDocCodeType"/>
         *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonDocNameType" minOccurs="0"/>
         *                   &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="damagePayments" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
         *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
         *                   &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *                   &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "reason",
            "document",
            "damagePayments"
        })
        public static class ContractChange {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContract2015Type.Modification.ContractChange.Reason reason;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContract2015Type.Modification.ContractChange.Document document;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsContract2015Type.Modification.ContractChange.DamagePayments> damagePayments;

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015Type.Modification.ContractChange.Reason }
             *     
             */
            public ZfcsContract2015Type.Modification.ContractChange.Reason getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015Type.Modification.ContractChange.Reason }
             *     
             */
            public void setReason(ZfcsContract2015Type.Modification.ContractChange.Reason value) {
                this.reason = value;
            }

            /**
             * Gets the value of the document property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015Type.Modification.ContractChange.Document }
             *     
             */
            public ZfcsContract2015Type.Modification.ContractChange.Document getDocument() {
                return document;
            }

            /**
             * Sets the value of the document property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015Type.Modification.ContractChange.Document }
             *     
             */
            public void setDocument(ZfcsContract2015Type.Modification.ContractChange.Document value) {
                this.document = value;
            }

            /**
             * Gets the value of the damagePayments property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the damagePayments property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDamagePayments().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsContract2015Type.Modification.ContractChange.DamagePayments }
             * 
             * 
             */
            public List<ZfcsContract2015Type.Modification.ContractChange.DamagePayments> getDamagePayments() {
                if (damagePayments == null) {
                    damagePayments = new ArrayList<ZfcsContract2015Type.Modification.ContractChange.DamagePayments>();
                }
                return this.damagePayments;
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
             *         &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
             *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
             *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
             *         &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                "document",
                "currency",
                "amount",
                "currencyRate",
                "amountRUR"
            })
            public static class DamagePayments {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsContract2015DocumentInfo document;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsCurrencyRef currency;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String amount;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsCurrencyRateContract2015 currencyRate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String amountRUR;

                /**
                 * Gets the value of the document property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContract2015DocumentInfo }
                 *     
                 */
                public ZfcsContract2015DocumentInfo getDocument() {
                    return document;
                }

                /**
                 * Sets the value of the document property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContract2015DocumentInfo }
                 *     
                 */
                public void setDocument(ZfcsContract2015DocumentInfo value) {
                    this.document = value;
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
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmount(String value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the currencyRate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsCurrencyRateContract2015 }
                 *     
                 */
                public ZfcsCurrencyRateContract2015 getCurrencyRate() {
                    return currencyRate;
                }

                /**
                 * Sets the value of the currencyRate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsCurrencyRateContract2015 }
                 *     
                 */
                public void setCurrencyRate(ZfcsCurrencyRateContract2015 value) {
                    this.currencyRate = value;
                }

                /**
                 * Gets the value of the amountRUR property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmountRUR() {
                    return amountRUR;
                }

                /**
                 * Sets the value of the amountRUR property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmountRUR(String value) {
                    this.amountRUR = value;
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
             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonDocCodeType"/>
             *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonDocNameType" minOccurs="0"/>
             *         &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
                "name",
                "base"
            })
            public static class Document {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String code;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String name;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String base;

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

                /**
                 * Gets the value of the base property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBase() {
                    return base;
                }

                /**
                 * Sets the value of the base property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBase(String value) {
                    this.base = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "description"
        })
        public static class ErrorCorrection {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String description;

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
     *         &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placerRoleContract2015Type"/>
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
        "responsibleOrg",
        "responsibleRole"
    })
    public static class Placer {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOrganizationRef responsibleOrg;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsPlacerRoleContract2015Type responsibleRole;

        /**
         * Gets the value of the responsibleOrg property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getResponsibleOrg() {
            return responsibleOrg;
        }

        /**
         * Sets the value of the responsibleOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setResponsibleOrg(ZfcsOrganizationRef value) {
            this.responsibleOrg = value;
        }

        /**
         * Gets the value of the responsibleRole property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPlacerRoleContract2015Type }
         *     
         */
        public ZfcsPlacerRoleContract2015Type getResponsibleRole() {
            return responsibleRole;
        }

        /**
         * Sets the value of the responsibleRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPlacerRoleContract2015Type }
         *     
         */
        public void setResponsibleRole(ZfcsPlacerRoleContract2015Type value) {
            this.responsibleRole = value;
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
     *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="priceType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *               &lt;enumeration value="P"/>
     *               &lt;enumeration value="OP"/>
     *               &lt;enumeration value="MP"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="priceFormula" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *         &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "price",
        "priceType",
        "priceFormula",
        "currency",
        "currencyRate",
        "priceRUR"
    })
    public static class PriceInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String price;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String priceType;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String priceFormula;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCurrencyRef currency;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCurrencyRateContract2015 currencyRate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String priceRUR;

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
         * Gets the value of the priceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceType() {
            return priceType;
        }

        /**
         * Sets the value of the priceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceType(String value) {
            this.priceType = value;
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
         * Gets the value of the currencyRate property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCurrencyRateContract2015 }
         *     
         */
        public ZfcsCurrencyRateContract2015 getCurrencyRate() {
            return currencyRate;
        }

        /**
         * Sets the value of the currencyRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCurrencyRateContract2015 }
         *     
         */
        public void setCurrencyRate(ZfcsCurrencyRateContract2015 value) {
            this.currencyRate = value;
        }

        /**
         * Gets the value of the priceRUR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceRUR() {
            return priceRUR;
        }

        /**
         * Sets the value of the priceRUR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceRUR(String value) {
            this.priceRUR = value;
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
     *         &lt;element name="product" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sid" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;choice>
     *                     &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                     &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                   &lt;/choice>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType"/>
     *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="sumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="productsChange" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="documents" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="documentName" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="1000"/>
     *                                   &lt;minLength value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="documentNum" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                   &lt;minLength value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="changeInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
        "product",
        "productsChange"
    })
    public static class Products {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsContract2015Type.Products.Product> product;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015Type.Products.ProductsChange productsChange;

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
         * {@link ZfcsContract2015Type.Products.Product }
         * 
         * 
         */
        public List<ZfcsContract2015Type.Products.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<ZfcsContract2015Type.Products.Product>();
            }
            return this.product;
        }

        /**
         * Gets the value of the productsChange property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015Type.Products.ProductsChange }
         *     
         */
        public ZfcsContract2015Type.Products.ProductsChange getProductsChange() {
            return productsChange;
        }

        /**
         * Sets the value of the productsChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015Type.Products.ProductsChange }
         *     
         */
        public void setProductsChange(ZfcsContract2015Type.Products.ProductsChange value) {
            this.productsChange = value;
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
         *         &lt;element name="sid" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;choice>
         *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *         &lt;/choice>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType"/>
         *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="sumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "sid",
            "okpd",
            "okpd2",
            "name",
            "okei",
            "price",
            "priceRUR",
            "quantity",
            "sum",
            "sumRUR"
        })
        public static class Product {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Long sid;
            @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPDRef okpd;
            @XmlElement(name = "OKPD2", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPDRef okpd2;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String name;
            @XmlElement(name = "OKEI", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContractOKEIType okei;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String price;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String priceRUR;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Double quantity;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String sum;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String sumRUR;

            /**
             * Gets the value of the sid property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getSid() {
                return sid;
            }

            /**
             * Sets the value of the sid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setSid(Long value) {
                this.sid = value;
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
             * Gets the value of the priceRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceRUR() {
                return priceRUR;
            }

            /**
             * Sets the value of the priceRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceRUR(String value) {
                this.priceRUR = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setQuantity(Double value) {
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
             * Gets the value of the sumRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSumRUR() {
                return sumRUR;
            }

            /**
             * Sets the value of the sumRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSumRUR(String value) {
                this.sumRUR = value;
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
         *         &lt;element name="documents" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="documentName" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="1000"/>
         *                         &lt;minLength value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="documentNum" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                         &lt;minLength value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="changeInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "documents",
            "changeInfo"
        })
        public static class ProductsChange {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsContract2015Type.Products.ProductsChange.Documents> documents;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String changeInfo;

            /**
             * Gets the value of the documents property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the documents property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocuments().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsContract2015Type.Products.ProductsChange.Documents }
             * 
             * 
             */
            public List<ZfcsContract2015Type.Products.ProductsChange.Documents> getDocuments() {
                if (documents == null) {
                    documents = new ArrayList<ZfcsContract2015Type.Products.ProductsChange.Documents>();
                }
                return this.documents;
            }

            /**
             * Gets the value of the changeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChangeInfo() {
                return changeInfo;
            }

            /**
             * Sets the value of the changeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChangeInfo(String value) {
                this.changeInfo = value;
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
             *         &lt;element name="documentName" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="1000"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="documentNum" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "documentName",
                "documentNum",
                "documentDate"
            })
            public static class Documents {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String documentName;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String documentNum;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar documentDate;

                /**
                 * Gets the value of the documentName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentName() {
                    return documentName;
                }

                /**
                 * Sets the value of the documentName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentName(String value) {
                    this.documentName = value;
                }

                /**
                 * Gets the value of the documentNum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentNum() {
                    return documentNum;
                }

                /**
                 * Sets the value of the documentNum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentNum(String value) {
                    this.documentNum = value;
                }

                /**
                 * Gets the value of the documentDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDocumentDate() {
                    return documentDate;
                }

                /**
                 * Sets the value of the documentDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDocumentDate(XMLGregorianCalendar value) {
                    this.documentDate = value;
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
     *         &lt;element name="sumInPercents">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="priceValueRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "sumInPercents",
        "priceValueRUR"
    })
    public static class SubContractorsSum {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected double sumInPercents;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String priceValueRUR;

        /**
         * Gets the value of the sumInPercents property.
         * 
         */
        public double getSumInPercents() {
            return sumInPercents;
        }

        /**
         * Sets the value of the sumInPercents property.
         * 
         */
        public void setSumInPercents(double value) {
            this.sumInPercents = value;
        }

        /**
         * Gets the value of the priceValueRUR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceValueRUR() {
            return priceValueRUR;
        }

        /**
         * Sets the value of the priceValueRUR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceValueRUR(String value) {
            this.priceValueRUR = value;
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
     *         &lt;element name="supplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015SupplierType" maxOccurs="unbounded"/>
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
        protected List<ZfcsContract2015SupplierType> supplier;

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
         * {@link ZfcsContract2015SupplierType }
         * 
         * 
         */
        public List<ZfcsContract2015SupplierType> getSupplier() {
            if (supplier == null) {
                supplier = new ArrayList<ZfcsContract2015SupplierType>();
            }
            return this.supplier;
        }

    }

}
