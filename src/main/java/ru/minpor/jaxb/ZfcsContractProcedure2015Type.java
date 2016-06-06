
package ru.minpor.jaxb;

import java.math.BigDecimal;
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
 * Информация об исполнении (расторжении) контракта с 01.01.2015
 * 
 * <p>Java class for zfcs_contractProcedure2015Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedure2015Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNum2015Type"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="executions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="oldStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="finalStageExecution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="execution" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="docExecution">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocCodeType"/>
 *                                         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocNameType" minOccurs="0"/>
 *                                         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="documentNum">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;maxLength value="100"/>
 *                                               &lt;minLength value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="payDoc">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="documentName">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;maxLength value="500"/>
 *                                               &lt;minLength value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="documentNum">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;maxLength value="100"/>
 *                                               &lt;minLength value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                             &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="paidRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="product" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="4000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="quantityContractSubjects" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="quantityContractSubject" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="sid" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *                   &lt;element name="productsCountries" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="productsCountry" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
 *                                       &lt;choice>
 *                                         &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                                         &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="productName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
 *         &lt;element name="termination" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="reasonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractTerminationReasonType"/>
 *                   &lt;element name="docTermination">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonDocCodeType"/>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonDocNameType" minOccurs="0"/>
 *                             &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="documentNum" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="reparations" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reparation" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="foundationDoc">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocCodeType"/>
 *                                                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocNameType" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="payDoc">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="documentName">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;maxLength value="1000"/>
 *                                                         &lt;minLength value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                       &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="documentNum" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                                       &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                       &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                                       &lt;element name="sumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *         &lt;element name="bankGuaranteeTermination" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractProcedure2015BankGuaranteeTerminationType" minOccurs="0"/>
 *         &lt;element name="penalties" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="penaltyAccrual">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="contractParty" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPartyType"/>
 *                             &lt;element name="penaltyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015PenaltyType"/>
 *                             &lt;element name="penaltyReason">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonCodeType"/>
 *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonNameType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="penaltyDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
 *                             &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="accrualAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="payments" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="payment" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
 *                                               &lt;sequence>
 *                                                 &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                                 &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                                                 &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                       &lt;element name="totalAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *                   &lt;element name="penaltyReturn" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="returnDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
 *                             &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="accrualAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="payments" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="payment" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
 *                                               &lt;sequence>
 *                                                 &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                                 &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                                                 &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                                       &lt;element name="totalAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *         &lt;element name="delayWriteOffPenalties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                   &lt;element name="delayPenaltiesInProcent" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
 *                   &lt;element name="delayPenalties" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="delayDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                             &lt;element name="delayAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="delayAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="delayPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="noticeDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="writeOffPenalties" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="writeOffDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                             &lt;element name="writeOffAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="writeOffAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="noticeDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
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
 *         &lt;element name="bankGuaranteePayment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
 *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *                   &lt;element name="improperExecInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="requirements" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="requirementsDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="paymentAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="paymentAmountDetail" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="refundAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                                       &lt;element name="penaltiesAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                                       &lt;element name="lossNotCoveredAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                                       &lt;element name="warrantyAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                                       &lt;element name="otherAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="paymentAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="paid" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="documentNum">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                             &lt;element name="bankPaid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                             &lt;element name="bankPaidRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bankCancelDetails" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="improperGuaranteePaymentInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="restructure" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="restructureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="restructureAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="repaymentSchedule" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
 *         &lt;element name="holdCashEnforcement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="improperSupplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                   &lt;element name="holdAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="holdDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                   &lt;element name="holdAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="paymentDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="receiptDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="productOriginDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentListType" minOccurs="0"/>
 *         &lt;element name="modificationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
@XmlType(name = "zfcs_contractProcedure2015Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "regNum",
    "publishDate",
    "versionNumber",
    "executions",
    "termination",
    "bankGuaranteeTermination",
    "penalties",
    "delayWriteOffPenalties",
    "bankGuaranteePayment",
    "holdCashEnforcement",
    "printForm",
    "extPrintForm",
    "paymentDocuments",
    "receiptDocuments",
    "productOriginDocuments",
    "modificationReason",
    "currentContractStage",
    "okpd2Okved2"
})
public class ZfcsContractProcedure2015Type {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String regNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedure2015Type.Executions executions;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedure2015Type.Termination termination;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedure2015BankGuaranteeTerminationType bankGuaranteeTermination;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected List<ZfcsContractProcedure2015Type.Penalties> penalties;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedure2015Type.DelayWriteOffPenalties delayWriteOffPenalties;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedure2015Type.BankGuaranteePayment bankGuaranteePayment;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractProcedure2015Type.HoldCashEnforcement holdCashEnforcement;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType paymentDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType receiptDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractAttachmentListType productOriginDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String modificationReason;
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
     * Gets the value of the executions property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015Type.Executions }
     *     
     */
    public ZfcsContractProcedure2015Type.Executions getExecutions() {
        return executions;
    }

    /**
     * Sets the value of the executions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015Type.Executions }
     *     
     */
    public void setExecutions(ZfcsContractProcedure2015Type.Executions value) {
        this.executions = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015Type.Termination }
     *     
     */
    public ZfcsContractProcedure2015Type.Termination getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015Type.Termination }
     *     
     */
    public void setTermination(ZfcsContractProcedure2015Type.Termination value) {
        this.termination = value;
    }

    /**
     * Gets the value of the bankGuaranteeTermination property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015BankGuaranteeTerminationType }
     *     
     */
    public ZfcsContractProcedure2015BankGuaranteeTerminationType getBankGuaranteeTermination() {
        return bankGuaranteeTermination;
    }

    /**
     * Sets the value of the bankGuaranteeTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015BankGuaranteeTerminationType }
     *     
     */
    public void setBankGuaranteeTermination(ZfcsContractProcedure2015BankGuaranteeTerminationType value) {
        this.bankGuaranteeTermination = value;
    }

    /**
     * Gets the value of the penalties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penalties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenalties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsContractProcedure2015Type.Penalties }
     * 
     * 
     */
    public List<ZfcsContractProcedure2015Type.Penalties> getPenalties() {
        if (penalties == null) {
            penalties = new ArrayList<ZfcsContractProcedure2015Type.Penalties>();
        }
        return this.penalties;
    }

    /**
     * Gets the value of the delayWriteOffPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties }
     *     
     */
    public ZfcsContractProcedure2015Type.DelayWriteOffPenalties getDelayWriteOffPenalties() {
        return delayWriteOffPenalties;
    }

    /**
     * Sets the value of the delayWriteOffPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties }
     *     
     */
    public void setDelayWriteOffPenalties(ZfcsContractProcedure2015Type.DelayWriteOffPenalties value) {
        this.delayWriteOffPenalties = value;
    }

    /**
     * Gets the value of the bankGuaranteePayment property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment }
     *     
     */
    public ZfcsContractProcedure2015Type.BankGuaranteePayment getBankGuaranteePayment() {
        return bankGuaranteePayment;
    }

    /**
     * Sets the value of the bankGuaranteePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment }
     *     
     */
    public void setBankGuaranteePayment(ZfcsContractProcedure2015Type.BankGuaranteePayment value) {
        this.bankGuaranteePayment = value;
    }

    /**
     * Gets the value of the holdCashEnforcement property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015Type.HoldCashEnforcement }
     *     
     */
    public ZfcsContractProcedure2015Type.HoldCashEnforcement getHoldCashEnforcement() {
        return holdCashEnforcement;
    }

    /**
     * Sets the value of the holdCashEnforcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015Type.HoldCashEnforcement }
     *     
     */
    public void setHoldCashEnforcement(ZfcsContractProcedure2015Type.HoldCashEnforcement value) {
        this.holdCashEnforcement = value;
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
     * Gets the value of the paymentDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getPaymentDocuments() {
        return paymentDocuments;
    }

    /**
     * Sets the value of the paymentDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setPaymentDocuments(ZfcsContractAttachmentListType value) {
        this.paymentDocuments = value;
    }

    /**
     * Gets the value of the receiptDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getReceiptDocuments() {
        return receiptDocuments;
    }

    /**
     * Sets the value of the receiptDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setReceiptDocuments(ZfcsContractAttachmentListType value) {
        this.receiptDocuments = value;
    }

    /**
     * Gets the value of the productOriginDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public ZfcsContractAttachmentListType getProductOriginDocuments() {
        return productOriginDocuments;
    }

    /**
     * Sets the value of the productOriginDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractAttachmentListType }
     *     
     */
    public void setProductOriginDocuments(ZfcsContractAttachmentListType value) {
        this.productOriginDocuments = value;
    }

    /**
     * Gets the value of the modificationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationReason() {
        return modificationReason;
    }

    /**
     * Sets the value of the modificationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationReason(String value) {
        this.modificationReason = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
     *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
     *         &lt;element name="improperExecInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="requirements" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="requirementsDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="paymentAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="paymentAmountDetail" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="refundAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                             &lt;element name="penaltiesAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                             &lt;element name="lossNotCoveredAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                             &lt;element name="warrantyAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                             &lt;element name="otherAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="paymentAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="paid" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="documentNum">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *                   &lt;element name="bankPaid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="bankPaidRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="bankCancelDetails" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="improperGuaranteePaymentInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="restructure" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="restructureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="restructureAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="repaymentSchedule" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
        "regNumber",
        "docNumber",
        "improperExecInfo",
        "requirements",
        "paid",
        "bankCancelDetails",
        "improperGuaranteePaymentInfo",
        "restructure"
    })
    public static class BankGuaranteePayment {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String regNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String docNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String improperExecInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements requirements;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractProcedure2015Type.BankGuaranteePayment.Paid paid;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String bankCancelDetails;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String improperGuaranteePaymentInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractProcedure2015Type.BankGuaranteePayment.Restructure restructure;

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
         * Gets the value of the improperExecInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImproperExecInfo() {
            return improperExecInfo;
        }

        /**
         * Sets the value of the improperExecInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImproperExecInfo(String value) {
            this.improperExecInfo = value;
        }

        /**
         * Gets the value of the requirements property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements }
         *     
         */
        public ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements getRequirements() {
            return requirements;
        }

        /**
         * Sets the value of the requirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements }
         *     
         */
        public void setRequirements(ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements value) {
            this.requirements = value;
        }

        /**
         * Gets the value of the paid property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment.Paid }
         *     
         */
        public ZfcsContractProcedure2015Type.BankGuaranteePayment.Paid getPaid() {
            return paid;
        }

        /**
         * Sets the value of the paid property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment.Paid }
         *     
         */
        public void setPaid(ZfcsContractProcedure2015Type.BankGuaranteePayment.Paid value) {
            this.paid = value;
        }

        /**
         * Gets the value of the bankCancelDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankCancelDetails() {
            return bankCancelDetails;
        }

        /**
         * Sets the value of the bankCancelDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankCancelDetails(String value) {
            this.bankCancelDetails = value;
        }

        /**
         * Gets the value of the improperGuaranteePaymentInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImproperGuaranteePaymentInfo() {
            return improperGuaranteePaymentInfo;
        }

        /**
         * Sets the value of the improperGuaranteePaymentInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImproperGuaranteePaymentInfo(String value) {
            this.improperGuaranteePaymentInfo = value;
        }

        /**
         * Gets the value of the restructure property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment.Restructure }
         *     
         */
        public ZfcsContractProcedure2015Type.BankGuaranteePayment.Restructure getRestructure() {
            return restructure;
        }

        /**
         * Sets the value of the restructure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment.Restructure }
         *     
         */
        public void setRestructure(ZfcsContractProcedure2015Type.BankGuaranteePayment.Restructure value) {
            this.restructure = value;
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
         *         &lt;element name="name" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="documentNum">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
         *         &lt;element name="bankPaid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="bankPaidRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "name",
            "documentDate",
            "documentNum",
            "currency",
            "bankPaid",
            "currencyRate",
            "bankPaidRUR"
        })
        public static class Paid {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar documentDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String documentNum;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String bankPaid;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String bankPaidRUR;

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
             * Gets the value of the bankPaid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankPaid() {
                return bankPaid;
            }

            /**
             * Sets the value of the bankPaid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankPaid(String value) {
                this.bankPaid = value;
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
             * Gets the value of the bankPaidRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankPaidRUR() {
                return bankPaidRUR;
            }

            /**
             * Sets the value of the bankPaidRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankPaidRUR(String value) {
                this.bankPaidRUR = value;
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
         *         &lt;element name="requirementsDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="paymentAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="paymentAmountDetail" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="refundAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *                   &lt;element name="penaltiesAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *                   &lt;element name="lossNotCoveredAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *                   &lt;element name="warrantyAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *                   &lt;element name="otherAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="paymentAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "requirementsDate",
            "paymentAmount",
            "paymentAmountDetail",
            "currency",
            "currencyRate",
            "paymentAmountRUR"
        })
        public static class Requirements {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar requirementsDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String paymentAmount;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements.PaymentAmountDetail paymentAmountDetail;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String paymentAmountRUR;

            /**
             * Gets the value of the requirementsDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRequirementsDate() {
                return requirementsDate;
            }

            /**
             * Sets the value of the requirementsDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setRequirementsDate(XMLGregorianCalendar value) {
                this.requirementsDate = value;
            }

            /**
             * Gets the value of the paymentAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentAmount() {
                return paymentAmount;
            }

            /**
             * Sets the value of the paymentAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentAmount(String value) {
                this.paymentAmount = value;
            }

            /**
             * Gets the value of the paymentAmountDetail property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements.PaymentAmountDetail }
             *     
             */
            public ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements.PaymentAmountDetail getPaymentAmountDetail() {
                return paymentAmountDetail;
            }

            /**
             * Sets the value of the paymentAmountDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements.PaymentAmountDetail }
             *     
             */
            public void setPaymentAmountDetail(ZfcsContractProcedure2015Type.BankGuaranteePayment.Requirements.PaymentAmountDetail value) {
                this.paymentAmountDetail = value;
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
             * Gets the value of the paymentAmountRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentAmountRUR() {
                return paymentAmountRUR;
            }

            /**
             * Sets the value of the paymentAmountRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentAmountRUR(String value) {
                this.paymentAmountRUR = value;
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
             *         &lt;element name="refundAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
             *         &lt;element name="penaltiesAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
             *         &lt;element name="lossNotCoveredAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
             *         &lt;element name="warrantyAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
             *         &lt;element name="otherAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                "refundAmount",
                "penaltiesAmount",
                "lossNotCoveredAmount",
                "warrantyAmount",
                "otherAmount"
            })
            public static class PaymentAmountDetail {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String refundAmount;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String penaltiesAmount;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String lossNotCoveredAmount;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String warrantyAmount;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String otherAmount;

                /**
                 * Gets the value of the refundAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefundAmount() {
                    return refundAmount;
                }

                /**
                 * Sets the value of the refundAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefundAmount(String value) {
                    this.refundAmount = value;
                }

                /**
                 * Gets the value of the penaltiesAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPenaltiesAmount() {
                    return penaltiesAmount;
                }

                /**
                 * Sets the value of the penaltiesAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPenaltiesAmount(String value) {
                    this.penaltiesAmount = value;
                }

                /**
                 * Gets the value of the lossNotCoveredAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLossNotCoveredAmount() {
                    return lossNotCoveredAmount;
                }

                /**
                 * Sets the value of the lossNotCoveredAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLossNotCoveredAmount(String value) {
                    this.lossNotCoveredAmount = value;
                }

                /**
                 * Gets the value of the warrantyAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWarrantyAmount() {
                    return warrantyAmount;
                }

                /**
                 * Sets the value of the warrantyAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWarrantyAmount(String value) {
                    this.warrantyAmount = value;
                }

                /**
                 * Gets the value of the otherAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherAmount() {
                    return otherAmount;
                }

                /**
                 * Sets the value of the otherAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherAmount(String value) {
                    this.otherAmount = value;
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
         *         &lt;element name="restructureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="restructureAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="repaymentSchedule" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "restructureDate",
            "restructureAmount",
            "repaymentSchedule"
        })
        public static class Restructure {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar restructureDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String restructureAmount;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String repaymentSchedule;

            /**
             * Gets the value of the restructureDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRestructureDate() {
                return restructureDate;
            }

            /**
             * Sets the value of the restructureDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setRestructureDate(XMLGregorianCalendar value) {
                this.restructureDate = value;
            }

            /**
             * Gets the value of the restructureAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRestructureAmount() {
                return restructureAmount;
            }

            /**
             * Sets the value of the restructureAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRestructureAmount(String value) {
                this.restructureAmount = value;
            }

            /**
             * Gets the value of the repaymentSchedule property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRepaymentSchedule() {
                return repaymentSchedule;
            }

            /**
             * Sets the value of the repaymentSchedule property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRepaymentSchedule(String value) {
                this.repaymentSchedule = value;
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
     *         &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *         &lt;element name="delayPenaltiesInProcent" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType" minOccurs="0"/>
     *         &lt;element name="delayPenalties" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="delayDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *                   &lt;element name="delayAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="delayAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="delayPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="noticeDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="writeOffPenalties" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="writeOffDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *                   &lt;element name="writeOffAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="writeOffAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="noticeDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
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
        "totalAmount",
        "delayPenaltiesInProcent",
        "delayPenalties",
        "writeOffPenalties"
    })
    public static class DelayWriteOffPenalties {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String totalAmount;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected BigDecimal delayPenaltiesInProcent;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties delayPenalties;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties writeOffPenalties;

        /**
         * Gets the value of the totalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets the value of the totalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalAmount(String value) {
            this.totalAmount = value;
        }

        /**
         * Gets the value of the delayPenaltiesInProcent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDelayPenaltiesInProcent() {
            return delayPenaltiesInProcent;
        }

        /**
         * Sets the value of the delayPenaltiesInProcent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDelayPenaltiesInProcent(BigDecimal value) {
            this.delayPenaltiesInProcent = value;
        }

        /**
         * Gets the value of the delayPenalties property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties }
         *     
         */
        public ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties getDelayPenalties() {
            return delayPenalties;
        }

        /**
         * Sets the value of the delayPenalties property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties }
         *     
         */
        public void setDelayPenalties(ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties value) {
            this.delayPenalties = value;
        }

        /**
         * Gets the value of the writeOffPenalties property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties }
         *     
         */
        public ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties getWriteOffPenalties() {
            return writeOffPenalties;
        }

        /**
         * Sets the value of the writeOffPenalties property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties }
         *     
         */
        public void setWriteOffPenalties(ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties value) {
            this.writeOffPenalties = value;
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
         *         &lt;element name="delayDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
         *         &lt;element name="delayAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="delayAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="delayPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="noticeDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
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
            "delayDate",
            "currency",
            "delayAmount",
            "currencyRate",
            "delayAmountRUR",
            "delayPeriod",
            "noticeDetails"
        })
        public static class DelayPenalties {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar delayDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String delayAmount;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String delayAmountRUR;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar delayPeriod;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties.NoticeDetails noticeDetails;

            /**
             * Gets the value of the delayDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDelayDate() {
                return delayDate;
            }

            /**
             * Sets the value of the delayDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDelayDate(XMLGregorianCalendar value) {
                this.delayDate = value;
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
             * Gets the value of the delayAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDelayAmount() {
                return delayAmount;
            }

            /**
             * Sets the value of the delayAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDelayAmount(String value) {
                this.delayAmount = value;
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
             * Gets the value of the delayAmountRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDelayAmountRUR() {
                return delayAmountRUR;
            }

            /**
             * Sets the value of the delayAmountRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDelayAmountRUR(String value) {
                this.delayAmountRUR = value;
            }

            /**
             * Gets the value of the delayPeriod property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDelayPeriod() {
                return delayPeriod;
            }

            /**
             * Sets the value of the delayPeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDelayPeriod(XMLGregorianCalendar value) {
                this.delayPeriod = value;
            }

            /**
             * Gets the value of the noticeDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties.NoticeDetails }
             *     
             */
            public ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties.NoticeDetails getNoticeDetails() {
                return noticeDetails;
            }

            /**
             * Sets the value of the noticeDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties.NoticeDetails }
             *     
             */
            public void setNoticeDetails(ZfcsContractProcedure2015Type.DelayWriteOffPenalties.DelayPenalties.NoticeDetails value) {
                this.noticeDetails = value;
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
                "documentNum",
                "documentDate"
            })
            public static class NoticeDetails {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String documentNum;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar documentDate;

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
         *         &lt;element name="writeOffDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
         *         &lt;element name="writeOffAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="writeOffAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="noticeDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
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
            "writeOffDate",
            "currency",
            "writeOffAmount",
            "currencyRate",
            "writeOffAmountRUR",
            "noticeDetails"
        })
        public static class WriteOffPenalties {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar writeOffDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String writeOffAmount;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String writeOffAmountRUR;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties.NoticeDetails noticeDetails;

            /**
             * Gets the value of the writeOffDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getWriteOffDate() {
                return writeOffDate;
            }

            /**
             * Sets the value of the writeOffDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setWriteOffDate(XMLGregorianCalendar value) {
                this.writeOffDate = value;
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
             * Gets the value of the writeOffAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWriteOffAmount() {
                return writeOffAmount;
            }

            /**
             * Sets the value of the writeOffAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWriteOffAmount(String value) {
                this.writeOffAmount = value;
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
             * Gets the value of the writeOffAmountRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWriteOffAmountRUR() {
                return writeOffAmountRUR;
            }

            /**
             * Sets the value of the writeOffAmountRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWriteOffAmountRUR(String value) {
                this.writeOffAmountRUR = value;
            }

            /**
             * Gets the value of the noticeDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties.NoticeDetails }
             *     
             */
            public ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties.NoticeDetails getNoticeDetails() {
                return noticeDetails;
            }

            /**
             * Sets the value of the noticeDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties.NoticeDetails }
             *     
             */
            public void setNoticeDetails(ZfcsContractProcedure2015Type.DelayWriteOffPenalties.WriteOffPenalties.NoticeDetails value) {
                this.noticeDetails = value;
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
                "documentNum",
                "documentDate"
            })
            public static class NoticeDetails {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String documentNum;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar documentDate;

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
     *         &lt;element name="stage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="oldStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="finalStageExecution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="execution" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="docExecution">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocCodeType"/>
     *                               &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocNameType" minOccurs="0"/>
     *                               &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="documentNum">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;maxLength value="100"/>
     *                                     &lt;minLength value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="payDoc">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="documentName">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;maxLength value="500"/>
     *                                     &lt;minLength value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="documentNum">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;maxLength value="100"/>
     *                                     &lt;minLength value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *                   &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="paidRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="product" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="4000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="quantityContractSubjects" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="quantityContractSubject" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="sid" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
     *         &lt;element name="productsCountries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="productsCountry" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
     *                             &lt;choice>
     *                               &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                               &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                             &lt;/choice>
     *                             &lt;element name="productName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "stage",
        "ordinalNumber",
        "finalStageExecution",
        "execution",
        "productsCountries"
    })
    public static class Executions {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContractProcedure2015Type.Executions.Stage stage;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int ordinalNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean finalStageExecution;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsContractProcedure2015Type.Executions.Execution> execution;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractProcedure2015Type.Executions.ProductsCountries productsCountries;

        /**
         * Gets the value of the stage property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.Executions.Stage }
         *     
         */
        public ZfcsContractProcedure2015Type.Executions.Stage getStage() {
            return stage;
        }

        /**
         * Sets the value of the stage property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.Executions.Stage }
         *     
         */
        public void setStage(ZfcsContractProcedure2015Type.Executions.Stage value) {
            this.stage = value;
        }

        /**
         * Gets the value of the ordinalNumber property.
         * 
         */
        public int getOrdinalNumber() {
            return ordinalNumber;
        }

        /**
         * Sets the value of the ordinalNumber property.
         * 
         */
        public void setOrdinalNumber(int value) {
            this.ordinalNumber = value;
        }

        /**
         * Gets the value of the finalStageExecution property.
         * 
         */
        public boolean isFinalStageExecution() {
            return finalStageExecution;
        }

        /**
         * Sets the value of the finalStageExecution property.
         * 
         */
        public void setFinalStageExecution(boolean value) {
            this.finalStageExecution = value;
        }

        /**
         * Gets the value of the execution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the execution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExecution().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsContractProcedure2015Type.Executions.Execution }
         * 
         * 
         */
        public List<ZfcsContractProcedure2015Type.Executions.Execution> getExecution() {
            if (execution == null) {
                execution = new ArrayList<ZfcsContractProcedure2015Type.Executions.Execution>();
            }
            return this.execution;
        }

        /**
         * Gets the value of the productsCountries property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.Executions.ProductsCountries }
         *     
         */
        public ZfcsContractProcedure2015Type.Executions.ProductsCountries getProductsCountries() {
            return productsCountries;
        }

        /**
         * Sets the value of the productsCountries property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.Executions.ProductsCountries }
         *     
         */
        public void setProductsCountries(ZfcsContractProcedure2015Type.Executions.ProductsCountries value) {
            this.productsCountries = value;
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
         *           &lt;element name="docExecution">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocCodeType"/>
         *                     &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocNameType" minOccurs="0"/>
         *                     &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="documentNum">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;maxLength value="100"/>
         *                           &lt;minLength value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="payDoc">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="documentName">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;maxLength value="500"/>
         *                           &lt;minLength value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="documentNum">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;maxLength value="100"/>
         *                           &lt;minLength value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
         *         &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="paidRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="product" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="4000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="quantityContractSubjects" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="quantityContractSubject" maxOccurs="unbounded">
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
         *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
            "docExecution",
            "payDoc",
            "currency",
            "paid",
            "currencyRate",
            "paidRUR",
            "product",
            "quantityContractSubjects"
        })
        public static class Execution {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedure2015Type.Executions.Execution.DocExecution docExecution;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedure2015Type.Executions.Execution.PayDoc payDoc;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String paid;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String paidRUR;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String product;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects quantityContractSubjects;

            /**
             * Gets the value of the docExecution property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.Executions.Execution.DocExecution }
             *     
             */
            public ZfcsContractProcedure2015Type.Executions.Execution.DocExecution getDocExecution() {
                return docExecution;
            }

            /**
             * Sets the value of the docExecution property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.Executions.Execution.DocExecution }
             *     
             */
            public void setDocExecution(ZfcsContractProcedure2015Type.Executions.Execution.DocExecution value) {
                this.docExecution = value;
            }

            /**
             * Gets the value of the payDoc property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.Executions.Execution.PayDoc }
             *     
             */
            public ZfcsContractProcedure2015Type.Executions.Execution.PayDoc getPayDoc() {
                return payDoc;
            }

            /**
             * Sets the value of the payDoc property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.Executions.Execution.PayDoc }
             *     
             */
            public void setPayDoc(ZfcsContractProcedure2015Type.Executions.Execution.PayDoc value) {
                this.payDoc = value;
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
             * Gets the value of the paid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaid() {
                return paid;
            }

            /**
             * Sets the value of the paid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaid(String value) {
                this.paid = value;
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
             * Gets the value of the paidRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaidRUR() {
                return paidRUR;
            }

            /**
             * Sets the value of the paidRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaidRUR(String value) {
                this.paidRUR = value;
            }

            /**
             * Gets the value of the product property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProduct() {
                return product;
            }

            /**
             * Sets the value of the product property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProduct(String value) {
                this.product = value;
            }

            /**
             * Gets the value of the quantityContractSubjects property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects }
             *     
             */
            public ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects getQuantityContractSubjects() {
                return quantityContractSubjects;
            }

            /**
             * Sets the value of the quantityContractSubjects property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects }
             *     
             */
            public void setQuantityContractSubjects(ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects value) {
                this.quantityContractSubjects = value;
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
             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocCodeType"/>
             *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocNameType" minOccurs="0"/>
             *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="documentNum">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *               &lt;minLength value="1"/>
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
                "name",
                "documentDate",
                "documentNum"
            })
            public static class DocExecution {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String code;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String name;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar documentDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String documentNum;

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
             *         &lt;element name="documentName">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="500"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="documentNum">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *               &lt;minLength value="1"/>
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
                "documentName",
                "documentDate",
                "documentNum"
            })
            public static class PayDoc {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String documentName;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar documentDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String documentNum;

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
             *         &lt;element name="quantityContractSubject" maxOccurs="unbounded">
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
             *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                "quantityContractSubject"
            })
            public static class QuantityContractSubjects {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects.QuantityContractSubject> quantityContractSubject;

                /**
                 * Gets the value of the quantityContractSubject property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the quantityContractSubject property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getQuantityContractSubject().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects.QuantityContractSubject }
                 * 
                 * 
                 */
                public List<ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects.QuantityContractSubject> getQuantityContractSubject() {
                    if (quantityContractSubject == null) {
                        quantityContractSubject = new ArrayList<ZfcsContractProcedure2015Type.Executions.Execution.QuantityContractSubjects.QuantityContractSubject>();
                    }
                    return this.quantityContractSubject;
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
                 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                    "quantity"
                })
                public static class QuantityContractSubject {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Long sid;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double quantity;

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
         *         &lt;element name="productsCountry" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
         *                   &lt;choice>
         *                     &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *                     &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *                   &lt;/choice>
         *                   &lt;element name="productName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "productsCountry"
        })
        public static class ProductsCountries {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsContractProcedure2015Type.Executions.ProductsCountries.ProductsCountry> productsCountry;

            /**
             * Gets the value of the productsCountry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the productsCountry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProductsCountry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsContractProcedure2015Type.Executions.ProductsCountries.ProductsCountry }
             * 
             * 
             */
            public List<ZfcsContractProcedure2015Type.Executions.ProductsCountries.ProductsCountry> getProductsCountry() {
                if (productsCountry == null) {
                    productsCountry = new ArrayList<ZfcsContractProcedure2015Type.Executions.ProductsCountries.ProductsCountry>();
                }
                return this.productsCountry;
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
             *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
             *         &lt;choice>
             *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
             *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
             *         &lt;/choice>
             *         &lt;element name="productName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
                "country",
                "okpd",
                "okpd2",
                "productName"
            })
            public static class ProductsCountry {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsCountryRef country;
                @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKPDRef okpd;
                @XmlElement(name = "OKPD2", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKPDRef okpd2;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String productName;

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsCountryRef }
                 *     
                 */
                public ZfcsCountryRef getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsCountryRef }
                 *     
                 */
                public void setCountry(ZfcsCountryRef value) {
                    this.country = value;
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
                 * Gets the value of the productName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductName() {
                    return productName;
                }

                /**
                 * Sets the value of the productName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductName(String value) {
                    this.productName = value;
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
         *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="oldStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
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
            "endDate",
            "oldStage"
        })
        public static class Stage {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar endDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsStageType oldStage;

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
             * Gets the value of the oldStage property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsStageType }
             *     
             */
            public ZfcsStageType getOldStage() {
                return oldStage;
            }

            /**
             * Sets the value of the oldStage property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsStageType }
             *     
             */
            public void setOldStage(ZfcsStageType value) {
                this.oldStage = value;
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
     *         &lt;element name="improperSupplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *         &lt;element name="holdAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="holdDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *         &lt;element name="holdAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "improperSupplierInfo",
        "currency",
        "holdAmount",
        "holdDate",
        "currencyRate",
        "holdAmountRUR"
    })
    public static class HoldCashEnforcement {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String improperSupplierInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCurrencyRef currency;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String holdAmount;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar holdDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCurrencyRateContract2015 currencyRate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String holdAmountRUR;

        /**
         * Gets the value of the improperSupplierInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImproperSupplierInfo() {
            return improperSupplierInfo;
        }

        /**
         * Sets the value of the improperSupplierInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImproperSupplierInfo(String value) {
            this.improperSupplierInfo = value;
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
         * Gets the value of the holdAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoldAmount() {
            return holdAmount;
        }

        /**
         * Sets the value of the holdAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoldAmount(String value) {
            this.holdAmount = value;
        }

        /**
         * Gets the value of the holdDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoldDate() {
            return holdDate;
        }

        /**
         * Sets the value of the holdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoldDate(XMLGregorianCalendar value) {
            this.holdDate = value;
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
         * Gets the value of the holdAmountRUR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoldAmountRUR() {
            return holdAmountRUR;
        }

        /**
         * Sets the value of the holdAmountRUR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoldAmountRUR(String value) {
            this.holdAmountRUR = value;
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
     *         &lt;element name="penaltyAccrual">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="contractParty" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPartyType"/>
     *                   &lt;element name="penaltyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015PenaltyType"/>
     *                   &lt;element name="penaltyReason">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonCodeType"/>
     *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonNameType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="penaltyDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
     *                   &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="accrualAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="payments" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="payment" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
     *                                     &lt;sequence>
     *                                       &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                                       &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                                       &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                             &lt;element name="totalAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
     *         &lt;element name="penaltyReturn" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="returnDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
     *                   &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                   &lt;element name="accrualAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="payments" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="payment" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
     *                                     &lt;sequence>
     *                                       &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                                       &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                                       &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                             &lt;element name="totalAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "penaltyAccrual",
        "penaltyReturn"
    })
    public static class Penalties {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual penaltyAccrual;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractProcedure2015Type.Penalties.PenaltyReturn penaltyReturn;

        /**
         * Gets the value of the penaltyAccrual property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual }
         *     
         */
        public ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual getPenaltyAccrual() {
            return penaltyAccrual;
        }

        /**
         * Sets the value of the penaltyAccrual property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual }
         *     
         */
        public void setPenaltyAccrual(ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual value) {
            this.penaltyAccrual = value;
        }

        /**
         * Gets the value of the penaltyReturn property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyReturn }
         *     
         */
        public ZfcsContractProcedure2015Type.Penalties.PenaltyReturn getPenaltyReturn() {
            return penaltyReturn;
        }

        /**
         * Sets the value of the penaltyReturn property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyReturn }
         *     
         */
        public void setPenaltyReturn(ZfcsContractProcedure2015Type.Penalties.PenaltyReturn value) {
            this.penaltyReturn = value;
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
         *         &lt;element name="contractParty" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractPartyType"/>
         *         &lt;element name="penaltyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015PenaltyType"/>
         *         &lt;element name="penaltyReason">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonCodeType"/>
         *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonNameType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="penaltyDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
         *         &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="accrualAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="payments" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="payment" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
         *                           &lt;sequence>
         *                             &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *                             &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                   &lt;element name="totalAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "contractParty",
            "penaltyType",
            "penaltyReason",
            "penaltyDocument",
            "accrualAmount",
            "currency",
            "currencyRate",
            "accrualAmountRUR",
            "payments"
        })
        public static class PenaltyAccrual {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsContractPartyType contractParty;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsContract2015PenaltyType penaltyType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.PenaltyReason penaltyReason;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContract2015DocumentInfo penaltyDocument;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String accrualAmount;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String accrualAmountRUR;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments payments;

            /**
             * Gets the value of the contractParty property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractPartyType }
             *     
             */
            public ZfcsContractPartyType getContractParty() {
                return contractParty;
            }

            /**
             * Sets the value of the contractParty property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractPartyType }
             *     
             */
            public void setContractParty(ZfcsContractPartyType value) {
                this.contractParty = value;
            }

            /**
             * Gets the value of the penaltyType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015PenaltyType }
             *     
             */
            public ZfcsContract2015PenaltyType getPenaltyType() {
                return penaltyType;
            }

            /**
             * Sets the value of the penaltyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015PenaltyType }
             *     
             */
            public void setPenaltyType(ZfcsContract2015PenaltyType value) {
                this.penaltyType = value;
            }

            /**
             * Gets the value of the penaltyReason property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.PenaltyReason }
             *     
             */
            public ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.PenaltyReason getPenaltyReason() {
                return penaltyReason;
            }

            /**
             * Sets the value of the penaltyReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.PenaltyReason }
             *     
             */
            public void setPenaltyReason(ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.PenaltyReason value) {
                this.penaltyReason = value;
            }

            /**
             * Gets the value of the penaltyDocument property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015DocumentInfo }
             *     
             */
            public ZfcsContract2015DocumentInfo getPenaltyDocument() {
                return penaltyDocument;
            }

            /**
             * Sets the value of the penaltyDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015DocumentInfo }
             *     
             */
            public void setPenaltyDocument(ZfcsContract2015DocumentInfo value) {
                this.penaltyDocument = value;
            }

            /**
             * Gets the value of the accrualAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccrualAmount() {
                return accrualAmount;
            }

            /**
             * Sets the value of the accrualAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccrualAmount(String value) {
                this.accrualAmount = value;
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
             * Gets the value of the accrualAmountRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccrualAmountRUR() {
                return accrualAmountRUR;
            }

            /**
             * Sets the value of the accrualAmountRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccrualAmountRUR(String value) {
                this.accrualAmountRUR = value;
            }

            /**
             * Gets the value of the payments property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments }
             *     
             */
            public ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments getPayments() {
                return payments;
            }

            /**
             * Sets the value of the payments property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments }
             *     
             */
            public void setPayments(ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments value) {
                this.payments = value;
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
             *         &lt;element name="payment" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
             *                 &lt;sequence>
             *                   &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
             *                   &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *         &lt;element name="totalAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                "payment",
                "totalAmount",
                "totalAmountRUR"
            })
            public static class Payments {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments.Payment> payment;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String totalAmount;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String totalAmountRUR;

                /**
                 * Gets the value of the payment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the payment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPayment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments.Payment }
                 * 
                 * 
                 */
                public List<ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments.Payment> getPayment() {
                    if (payment == null) {
                        payment = new ArrayList<ZfcsContractProcedure2015Type.Penalties.PenaltyAccrual.Payments.Payment>();
                    }
                    return this.payment;
                }

                /**
                 * Gets the value of the totalAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTotalAmount() {
                    return totalAmount;
                }

                /**
                 * Sets the value of the totalAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTotalAmount(String value) {
                    this.totalAmount = value;
                }

                /**
                 * Gets the value of the totalAmountRUR property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTotalAmountRUR() {
                    return totalAmountRUR;
                }

                /**
                 * Sets the value of the totalAmountRUR property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTotalAmountRUR(String value) {
                    this.totalAmountRUR = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
                 *       &lt;sequence>
                 *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
                 *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
                 *         &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                    "amount",
                    "currencyRate",
                    "amountRUR"
                })
                public static class Payment
                    extends ZfcsContract2015DocumentInfo
                {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String amount;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ZfcsCurrencyRateContract2015 currencyRate;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String amountRUR;

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
             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonCodeType"/>
             *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonNameType" minOccurs="0"/>
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
            public static class PenaltyReason {

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
         *         &lt;element name="returnDocument" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo"/>
         *         &lt;element name="accrualAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *         &lt;element name="accrualAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="payments" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="payment" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
         *                           &lt;sequence>
         *                             &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *                             &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                   &lt;element name="totalAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "returnDocument",
            "accrualAmount",
            "currencyRate",
            "accrualAmountRUR",
            "payments"
        })
        public static class PenaltyReturn {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContract2015DocumentInfo returnDocument;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String accrualAmount;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRateContract2015 currencyRate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String accrualAmountRUR;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments payments;

            /**
             * Gets the value of the returnDocument property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContract2015DocumentInfo }
             *     
             */
            public ZfcsContract2015DocumentInfo getReturnDocument() {
                return returnDocument;
            }

            /**
             * Sets the value of the returnDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContract2015DocumentInfo }
             *     
             */
            public void setReturnDocument(ZfcsContract2015DocumentInfo value) {
                this.returnDocument = value;
            }

            /**
             * Gets the value of the accrualAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccrualAmount() {
                return accrualAmount;
            }

            /**
             * Sets the value of the accrualAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccrualAmount(String value) {
                this.accrualAmount = value;
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
             * Gets the value of the accrualAmountRUR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccrualAmountRUR() {
                return accrualAmountRUR;
            }

            /**
             * Sets the value of the accrualAmountRUR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccrualAmountRUR(String value) {
                this.accrualAmountRUR = value;
            }

            /**
             * Gets the value of the payments property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments }
             *     
             */
            public ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments getPayments() {
                return payments;
            }

            /**
             * Sets the value of the payments property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments }
             *     
             */
            public void setPayments(ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments value) {
                this.payments = value;
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
             *         &lt;element name="payment" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
             *                 &lt;sequence>
             *                   &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
             *                   &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="totalAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *         &lt;element name="totalAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                "payment",
                "totalAmount",
                "totalAmountRUR"
            })
            public static class Payments {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments.Payment> payment;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String totalAmount;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String totalAmountRUR;

                /**
                 * Gets the value of the payment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the payment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPayment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments.Payment }
                 * 
                 * 
                 */
                public List<ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments.Payment> getPayment() {
                    if (payment == null) {
                        payment = new ArrayList<ZfcsContractProcedure2015Type.Penalties.PenaltyReturn.Payments.Payment>();
                    }
                    return this.payment;
                }

                /**
                 * Gets the value of the totalAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTotalAmount() {
                    return totalAmount;
                }

                /**
                 * Sets the value of the totalAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTotalAmount(String value) {
                    this.totalAmount = value;
                }

                /**
                 * Gets the value of the totalAmountRUR property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTotalAmountRUR() {
                    return totalAmountRUR;
                }

                /**
                 * Sets the value of the totalAmountRUR property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTotalAmountRUR(String value) {
                    this.totalAmountRUR = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015.documentInfo">
                 *       &lt;sequence>
                 *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
                 *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
                 *         &lt;element name="amountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                    "amount",
                    "currencyRate",
                    "amountRUR"
                })
                public static class Payment
                    extends ZfcsContract2015DocumentInfo
                {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String amount;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ZfcsCurrencyRateContract2015 currencyRate;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String amountRUR;

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
     *         &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="reasonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractTerminationReasonType"/>
     *         &lt;element name="docTermination">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonDocCodeType"/>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonDocNameType" minOccurs="0"/>
     *                   &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="documentNum" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="reparations" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reparation" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="foundationDoc">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocCodeType"/>
     *                                         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocNameType" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="payDoc">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="documentName">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;maxLength value="1000"/>
     *                                               &lt;minLength value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                             &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="documentNum" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                   &lt;minLength value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *                             &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                             &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *                             &lt;element name="sumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "paid",
        "terminationDate",
        "reasonInfo",
        "reason",
        "docTermination",
        "decisionDate",
        "reparations"
    })
    public static class Termination {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String paid;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar terminationDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String reasonInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContractTerminationReasonType reason;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContractProcedure2015Type.Termination.DocTermination docTermination;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar decisionDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractProcedure2015Type.Termination.Reparations reparations;

        /**
         * Gets the value of the paid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaid() {
            return paid;
        }

        /**
         * Sets the value of the paid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaid(String value) {
            this.paid = value;
        }

        /**
         * Gets the value of the terminationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTerminationDate() {
            return terminationDate;
        }

        /**
         * Sets the value of the terminationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTerminationDate(XMLGregorianCalendar value) {
            this.terminationDate = value;
        }

        /**
         * Gets the value of the reasonInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonInfo() {
            return reasonInfo;
        }

        /**
         * Sets the value of the reasonInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonInfo(String value) {
            this.reasonInfo = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractTerminationReasonType }
         *     
         */
        public ZfcsContractTerminationReasonType getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractTerminationReasonType }
         *     
         */
        public void setReason(ZfcsContractTerminationReasonType value) {
            this.reason = value;
        }

        /**
         * Gets the value of the docTermination property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.Termination.DocTermination }
         *     
         */
        public ZfcsContractProcedure2015Type.Termination.DocTermination getDocTermination() {
            return docTermination;
        }

        /**
         * Sets the value of the docTermination property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.Termination.DocTermination }
         *     
         */
        public void setDocTermination(ZfcsContractProcedure2015Type.Termination.DocTermination value) {
            this.docTermination = value;
        }

        /**
         * Gets the value of the decisionDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDecisionDate() {
            return decisionDate;
        }

        /**
         * Sets the value of the decisionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDecisionDate(XMLGregorianCalendar value) {
            this.decisionDate = value;
        }

        /**
         * Gets the value of the reparations property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015Type.Termination.Reparations }
         *     
         */
        public ZfcsContractProcedure2015Type.Termination.Reparations getReparations() {
            return reparations;
        }

        /**
         * Sets the value of the reparations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015Type.Termination.Reparations }
         *     
         */
        public void setReparations(ZfcsContractProcedure2015Type.Termination.Reparations value) {
            this.reparations = value;
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
         *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonDocCodeType"/>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonDocNameType" minOccurs="0"/>
         *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="documentNum" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *               &lt;minLength value="1"/>
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
            "name",
            "documentDate",
            "documentNum"
        })
        public static class DocTermination {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String code;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar documentDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String documentNum;

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
         *         &lt;element name="reparation" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="foundationDoc">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocCodeType"/>
         *                               &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocNameType" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="payDoc">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="documentName">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;maxLength value="1000"/>
         *                                     &lt;minLength value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="documentNum" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                         &lt;minLength value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
         *                   &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
         *                   &lt;element name="sumRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "reparation"
        })
        public static class Reparations {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsContractProcedure2015Type.Termination.Reparations.Reparation> reparation;

            /**
             * Gets the value of the reparation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reparation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReparation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsContractProcedure2015Type.Termination.Reparations.Reparation }
             * 
             * 
             */
            public List<ZfcsContractProcedure2015Type.Termination.Reparations.Reparation> getReparation() {
                if (reparation == null) {
                    reparation = new ArrayList<ZfcsContractProcedure2015Type.Termination.Reparations.Reparation>();
                }
                return this.reparation;
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
             *           &lt;element name="foundationDoc">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocCodeType"/>
             *                     &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocNameType" minOccurs="0"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="payDoc">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="documentName">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;maxLength value="1000"/>
             *                           &lt;minLength value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="documentNum" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
             *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
             *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
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
                "foundationDoc",
                "payDoc",
                "documentDate",
                "documentNum",
                "currency",
                "sum",
                "currencyRate",
                "sumRUR"
            })
            public static class Reparation {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.FoundationDoc foundationDoc;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.PayDoc payDoc;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar documentDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String documentNum;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsCurrencyRef currency;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String sum;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsCurrencyRateContract2015 currencyRate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String sumRUR;

                /**
                 * Gets the value of the foundationDoc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.FoundationDoc }
                 *     
                 */
                public ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.FoundationDoc getFoundationDoc() {
                    return foundationDoc;
                }

                /**
                 * Sets the value of the foundationDoc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.FoundationDoc }
                 *     
                 */
                public void setFoundationDoc(ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.FoundationDoc value) {
                    this.foundationDoc = value;
                }

                /**
                 * Gets the value of the payDoc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.PayDoc }
                 *     
                 */
                public ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.PayDoc getPayDoc() {
                    return payDoc;
                }

                /**
                 * Sets the value of the payDoc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.PayDoc }
                 *     
                 */
                public void setPayDoc(ZfcsContractProcedure2015Type.Termination.Reparations.Reparation.PayDoc value) {
                    this.payDoc = value;
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
                 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocCodeType"/>
                 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocNameType" minOccurs="0"/>
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
                public static class FoundationDoc {

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
                 *         &lt;element name="documentName">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="1000"/>
                 *               &lt;minLength value="1"/>
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
                    "documentName"
                })
                public static class PayDoc {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String documentName;

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

                }

            }

        }

    }

}
