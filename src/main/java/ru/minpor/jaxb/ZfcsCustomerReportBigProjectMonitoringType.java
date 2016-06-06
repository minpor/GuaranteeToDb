
package ru.minpor.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Отчет по мониторингу реализации крупных проектов с государственным участием
 * 
 * <p>Java class for zfcs_customerReportBigProjectMonitoringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportBigProjectMonitoringType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportType">
 *       &lt;sequence>
 *         &lt;element name="needInContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoWithOgrnType" minOccurs="0"/>
 *         &lt;element name="contractsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *                             &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.NumberType" minOccurs="0"/>
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
 *         &lt;element name="constructor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
 *                   &lt;element name="head" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="projectInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="purpose" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="period">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="startYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                             &lt;element name="endYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="direction" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="otherDirection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="mechanism">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                         &lt;enumeration value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="otherMechanism" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="grbs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="indicators">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indicator" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                                       &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
 *         &lt;element name="contractors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractor" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectMemberType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="participants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="participant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectMemberType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documents">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="projectDocumentation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="documentation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="statement">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;sequence>
 *                               &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *                               &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;/sequence>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="examination">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;sequence>
 *                               &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *                               &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;/sequence>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="audit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;sequence>
 *                               &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *                               &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;/sequence>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cost">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="act">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="priceYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType" maxOccurs="unbounded"/>
 *                             &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="authenticity">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType">
 *                           &lt;sequence>
 *                             &lt;element name="priceYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType" maxOccurs="unbounded"/>
 *                             &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="contract">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="startYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                             &lt;element name="endYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                             &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="cost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="economy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="financings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="years" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingYearsType"/>
 *                   &lt;element name="stages">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="stage" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                                       &lt;element name="years" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingYearsType"/>
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
 *                   &lt;element name="site" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tenders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tender" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                             &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="participants" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="participant" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                                 &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *                             &lt;element name="winners" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="winner" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                                 &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *                             &lt;element name="finalCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="total">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="finalCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                             &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
 *         &lt;element name="realization">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="year" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                             &lt;element name="total" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="plan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="planAdvance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="paidAdvance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="federal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="region" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="self" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="nonbudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
 *                             &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType" minOccurs="0"/>
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
 *         &lt;element name="changes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="year" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                             &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;element name="reasons" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="activity" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="plan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                       &lt;element name="fact" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                       &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contractor" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                       &lt;element name="cost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                       &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportBigProjectMonitoringType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "needInContract",
    "customer",
    "contractsInfo",
    "constructor",
    "projectInfo",
    "contractors",
    "participants",
    "documents",
    "cost",
    "financings",
    "tenders",
    "realization",
    "changes"
})
public class ZfcsCustomerReportBigProjectMonitoringType
    extends ZfcsCustomerReportType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean needInContract;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationInfoWithOgrnType customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo contractsInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCustomerReportBigProjectMonitoringType.Constructor constructor;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo projectInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportBigProjectMonitoringType.Contractors contractors;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCustomerReportBigProjectMonitoringType.Participants participants;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportBigProjectMonitoringType.Documents documents;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportBigProjectMonitoringType.Cost cost;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportBigProjectMonitoringType.Financings financings;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCustomerReportBigProjectMonitoringType.Tenders tenders;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCustomerReportBigProjectMonitoringType.Realization realization;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCustomerReportBigProjectMonitoringType.Changes changes;

    /**
     * Gets the value of the needInContract property.
     * 
     */
    public boolean isNeedInContract() {
        return needInContract;
    }

    /**
     * Sets the value of the needInContract property.
     * 
     */
    public void setNeedInContract(boolean value) {
        this.needInContract = value;
    }

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
     * Gets the value of the contractsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo getContractsInfo() {
        return contractsInfo;
    }

    /**
     * Sets the value of the contractsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo }
     *     
     */
    public void setContractsInfo(ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo value) {
        this.contractsInfo = value;
    }

    /**
     * Gets the value of the constructor property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Constructor }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Constructor getConstructor() {
        return constructor;
    }

    /**
     * Sets the value of the constructor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Constructor }
     *     
     */
    public void setConstructor(ZfcsCustomerReportBigProjectMonitoringType.Constructor value) {
        this.constructor = value;
    }

    /**
     * Gets the value of the projectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    /**
     * Sets the value of the projectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo }
     *     
     */
    public void setProjectInfo(ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo value) {
        this.projectInfo = value;
    }

    /**
     * Gets the value of the contractors property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Contractors }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Contractors getContractors() {
        return contractors;
    }

    /**
     * Sets the value of the contractors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Contractors }
     *     
     */
    public void setContractors(ZfcsCustomerReportBigProjectMonitoringType.Contractors value) {
        this.contractors = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Participants }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Participants getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Participants }
     *     
     */
    public void setParticipants(ZfcsCustomerReportBigProjectMonitoringType.Participants value) {
        this.participants = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents }
     *     
     */
    public void setDocuments(ZfcsCustomerReportBigProjectMonitoringType.Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Cost }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Cost getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Cost }
     *     
     */
    public void setCost(ZfcsCustomerReportBigProjectMonitoringType.Cost value) {
        this.cost = value;
    }

    /**
     * Gets the value of the financings property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Financings }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Financings getFinancings() {
        return financings;
    }

    /**
     * Sets the value of the financings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Financings }
     *     
     */
    public void setFinancings(ZfcsCustomerReportBigProjectMonitoringType.Financings value) {
        this.financings = value;
    }

    /**
     * Gets the value of the tenders property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Tenders getTenders() {
        return tenders;
    }

    /**
     * Sets the value of the tenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders }
     *     
     */
    public void setTenders(ZfcsCustomerReportBigProjectMonitoringType.Tenders value) {
        this.tenders = value;
    }

    /**
     * Gets the value of the realization property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Realization }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Realization getRealization() {
        return realization;
    }

    /**
     * Sets the value of the realization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Realization }
     *     
     */
    public void setRealization(ZfcsCustomerReportBigProjectMonitoringType.Realization value) {
        this.realization = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Changes }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType.Changes getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType.Changes }
     *     
     */
    public void setChanges(ZfcsCustomerReportBigProjectMonitoringType.Changes value) {
        this.changes = value;
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
     *         &lt;element name="year" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="reasons" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="activity" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="plan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                             &lt;element name="fact" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                             &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contractor" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                             &lt;element name="cost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                             &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
        "year"
    })
    public static class Changes {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year> year;

        /**
         * Gets the value of the year property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the year property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getYear().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportBigProjectMonitoringType.Changes.Year }
         * 
         * 
         */
        public List<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year> getYear() {
            if (year == null) {
                year = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year>();
            }
            return this.year;
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
         *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="reasons" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="activity" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="plan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                   &lt;element name="fact" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                   &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contractor" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                   &lt;element name="cost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                   &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "year",
            "purchaseNumber",
            "lotNumber",
            "placingWay",
            "reasons",
            "activity",
            "contractor"
        })
        public static class Year {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int year;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String purchaseNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected BigInteger lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String placingWay;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String reasons;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year.Activity> activity;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year.Contractor> contractor;

            /**
             * Gets the value of the year property.
             * 
             */
            public int getYear() {
                return year;
            }

            /**
             * Sets the value of the year property.
             * 
             */
            public void setYear(int value) {
                this.year = value;
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
             * Gets the value of the placingWay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlacingWay() {
                return placingWay;
            }

            /**
             * Sets the value of the placingWay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlacingWay(String value) {
                this.placingWay = value;
            }

            /**
             * Gets the value of the reasons property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasons() {
                return reasons;
            }

            /**
             * Sets the value of the reasons property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasons(String value) {
                this.reasons = value;
            }

            /**
             * Gets the value of the activity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the activity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getActivity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCustomerReportBigProjectMonitoringType.Changes.Year.Activity }
             * 
             * 
             */
            public List<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year.Activity> getActivity() {
                if (activity == null) {
                    activity = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year.Activity>();
                }
                return this.activity;
            }

            /**
             * Gets the value of the contractor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contractor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContractor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCustomerReportBigProjectMonitoringType.Changes.Year.Contractor }
             * 
             * 
             */
            public List<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year.Contractor> getContractor() {
                if (contractor == null) {
                    contractor = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.Changes.Year.Contractor>();
                }
                return this.contractor;
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
             *         &lt;element name="plan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
             *         &lt;element name="fact" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
             *         &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
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
                "plan",
                "fact",
                "okei"
            })
            public static class Activity {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String plan;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String fact;
                @XmlElement(name = "OKEI", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKEIRef okei;

                /**
                 * Gets the value of the plan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlan() {
                    return plan;
                }

                /**
                 * Sets the value of the plan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlan(String value) {
                    this.plan = value;
                }

                /**
                 * Gets the value of the fact property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFact() {
                    return fact;
                }

                /**
                 * Sets the value of the fact property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFact(String value) {
                    this.fact = value;
                }

                /**
                 * Gets the value of the okei property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsOKEIRef }
                 *     
                 */
                public ZfcsOKEIRef getOKEI() {
                    return okei;
                }

                /**
                 * Sets the value of the okei property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsOKEIRef }
                 *     
                 */
                public void setOKEI(ZfcsOKEIRef value) {
                    this.okei = value;
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
             *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
             *         &lt;element name="cost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
             *         &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
                "cost",
                "paid"
            })
            public static class Contractor {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String name;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String cost;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String paid;

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
                 * Gets the value of the cost property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCost() {
                    return cost;
                }

                /**
                 * Sets the value of the cost property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCost(String value) {
                    this.cost = value;
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
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
     *         &lt;element name="head" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "shortName",
        "okopf",
        "head",
        "position"
    })
    public static class Constructor {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String fullName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String shortName;
        @XmlElement(name = "OKOPF", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOkopfRef okopf;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String head;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String position;

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
         * Gets the value of the head property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHead() {
            return head;
        }

        /**
         * Sets the value of the head property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHead(String value) {
            this.head = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosition(String value) {
            this.position = value;
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
     *         &lt;element name="contractor" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectMemberType" maxOccurs="unbounded"/>
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
        "contractor"
    })
    public static class Contractors {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsBigProjectMemberType> contractor;

        /**
         * Gets the value of the contractor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContractor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsBigProjectMemberType }
         * 
         * 
         */
        public List<ZfcsBigProjectMemberType> getContractor() {
            if (contractor == null) {
                contractor = new ArrayList<ZfcsBigProjectMemberType>();
            }
            return this.contractor;
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
     *         &lt;element name="contractInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
     *                   &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.NumberType" minOccurs="0"/>
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

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo.ContractInfo> contractInfo;

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
         * {@link ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo.ContractInfo }
         * 
         * 
         */
        public List<ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo.ContractInfo> getContractInfo() {
            if (contractInfo == null) {
                contractInfo = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.ContractsInfo.ContractInfo>();
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
            "contractNumber"
        })
        public static class ContractInfo {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contractRegNum;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contractNumber;

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
     *         &lt;element name="act">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="priceYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType" maxOccurs="unbounded"/>
     *                   &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="authenticity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType">
     *                 &lt;sequence>
     *                   &lt;element name="priceYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType" maxOccurs="unbounded"/>
     *                   &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="contract">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="startYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                   &lt;element name="endYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                   &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="cost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="economy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
        "act",
        "authenticity",
        "contract",
        "economy"
    })
    public static class Cost {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Cost.Act act;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Cost.Authenticity authenticity;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Cost.Contract contract;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String economy;

        /**
         * Gets the value of the act property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Cost.Act }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Cost.Act getAct() {
            return act;
        }

        /**
         * Sets the value of the act property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Cost.Act }
         *     
         */
        public void setAct(ZfcsCustomerReportBigProjectMonitoringType.Cost.Act value) {
            this.act = value;
        }

        /**
         * Gets the value of the authenticity property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Cost.Authenticity }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Cost.Authenticity getAuthenticity() {
            return authenticity;
        }

        /**
         * Sets the value of the authenticity property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Cost.Authenticity }
         *     
         */
        public void setAuthenticity(ZfcsCustomerReportBigProjectMonitoringType.Cost.Authenticity value) {
            this.authenticity = value;
        }

        /**
         * Gets the value of the contract property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Cost.Contract }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Cost.Contract getContract() {
            return contract;
        }

        /**
         * Sets the value of the contract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Cost.Contract }
         *     
         */
        public void setContract(ZfcsCustomerReportBigProjectMonitoringType.Cost.Contract value) {
            this.contract = value;
        }

        /**
         * Gets the value of the economy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEconomy() {
            return economy;
        }

        /**
         * Sets the value of the economy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEconomy(String value) {
            this.economy = value;
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
         *         &lt;element name="priceYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType" maxOccurs="unbounded"/>
         *         &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "priceYear",
            "vat"
        })
        public static class Act {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsBigProjectCostType> priceYear;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected boolean vat;

            /**
             * Gets the value of the priceYear property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the priceYear property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPriceYear().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsBigProjectCostType }
             * 
             * 
             */
            public List<ZfcsBigProjectCostType> getPriceYear() {
                if (priceYear == null) {
                    priceYear = new ArrayList<ZfcsBigProjectCostType>();
                }
                return this.priceYear;
            }

            /**
             * Gets the value of the vat property.
             * 
             */
            public boolean isVat() {
                return vat;
            }

            /**
             * Sets the value of the vat property.
             * 
             */
            public void setVat(boolean value) {
                this.vat = value;
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
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType">
         *       &lt;sequence>
         *         &lt;element name="priceYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectCostType" maxOccurs="unbounded"/>
         *         &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "priceYear",
            "vat"
        })
        public static class Authenticity
            extends ZfcsBigProjectCostType
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsBigProjectCostType> priceYear;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected boolean vat;

            /**
             * Gets the value of the priceYear property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the priceYear property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPriceYear().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsBigProjectCostType }
             * 
             * 
             */
            public List<ZfcsBigProjectCostType> getPriceYear() {
                if (priceYear == null) {
                    priceYear = new ArrayList<ZfcsBigProjectCostType>();
                }
                return this.priceYear;
            }

            /**
             * Gets the value of the vat property.
             * 
             */
            public boolean isVat() {
                return vat;
            }

            /**
             * Sets the value of the vat property.
             * 
             */
            public void setVat(boolean value) {
                this.vat = value;
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
         *         &lt;element name="startYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *         &lt;element name="endYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *         &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="cost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "startYear",
            "endYear",
            "vat",
            "cost"
        })
        public static class Contract {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int startYear;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int endYear;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected boolean vat;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String cost;

            /**
             * Gets the value of the startYear property.
             * 
             */
            public int getStartYear() {
                return startYear;
            }

            /**
             * Sets the value of the startYear property.
             * 
             */
            public void setStartYear(int value) {
                this.startYear = value;
            }

            /**
             * Gets the value of the endYear property.
             * 
             */
            public int getEndYear() {
                return endYear;
            }

            /**
             * Sets the value of the endYear property.
             * 
             */
            public void setEndYear(int value) {
                this.endYear = value;
            }

            /**
             * Gets the value of the vat property.
             * 
             */
            public boolean isVat() {
                return vat;
            }

            /**
             * Sets the value of the vat property.
             * 
             */
            public void setVat(boolean value) {
                this.vat = value;
            }

            /**
             * Gets the value of the cost property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCost() {
                return cost;
            }

            /**
             * Sets the value of the cost property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCost(String value) {
                this.cost = value;
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
     *         &lt;element name="projectDocumentation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="documentation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="statement">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;sequence>
     *                     &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
     *                     &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;/sequence>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="examination">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;sequence>
     *                     &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
     *                     &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;/sequence>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="audit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;sequence>
     *                     &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
     *                     &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;/sequence>
     *                 &lt;/choice>
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
        "projectDocumentation",
        "statement",
        "examination",
        "audit"
    })
    public static class Documents {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Documents.ProjectDocumentation projectDocumentation;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Documents.Statement statement;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Documents.Examination examination;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Documents.Audit audit;

        /**
         * Gets the value of the projectDocumentation property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents.ProjectDocumentation }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Documents.ProjectDocumentation getProjectDocumentation() {
            return projectDocumentation;
        }

        /**
         * Sets the value of the projectDocumentation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents.ProjectDocumentation }
         *     
         */
        public void setProjectDocumentation(ZfcsCustomerReportBigProjectMonitoringType.Documents.ProjectDocumentation value) {
            this.projectDocumentation = value;
        }

        /**
         * Gets the value of the statement property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents.Statement }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Documents.Statement getStatement() {
            return statement;
        }

        /**
         * Sets the value of the statement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents.Statement }
         *     
         */
        public void setStatement(ZfcsCustomerReportBigProjectMonitoringType.Documents.Statement value) {
            this.statement = value;
        }

        /**
         * Gets the value of the examination property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents.Examination }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Documents.Examination getExamination() {
            return examination;
        }

        /**
         * Sets the value of the examination property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents.Examination }
         *     
         */
        public void setExamination(ZfcsCustomerReportBigProjectMonitoringType.Documents.Examination value) {
            this.examination = value;
        }

        /**
         * Gets the value of the audit property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents.Audit }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Documents.Audit getAudit() {
            return audit;
        }

        /**
         * Sets the value of the audit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Documents.Audit }
         *     
         */
        public void setAudit(ZfcsCustomerReportBigProjectMonitoringType.Documents.Audit value) {
            this.audit = value;
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
         *         &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;sequence>
         *           &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
         *           &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "presence",
            "copy",
            "document"
        })
        public static class Audit {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean presence;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsAttachmentListType copy;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String document;

            /**
             * Gets the value of the presence property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPresence() {
                return presence;
            }

            /**
             * Sets the value of the presence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPresence(Boolean value) {
                this.presence = value;
            }

            /**
             * Gets the value of the copy property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsAttachmentListType }
             *     
             */
            public ZfcsAttachmentListType getCopy() {
                return copy;
            }

            /**
             * Sets the value of the copy property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsAttachmentListType }
             *     
             */
            public void setCopy(ZfcsAttachmentListType value) {
                this.copy = value;
            }

            /**
             * Gets the value of the document property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocument() {
                return document;
            }

            /**
             * Sets the value of the document property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocument(String value) {
                this.document = value;
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
         *         &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;sequence>
         *           &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
         *           &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "presence",
            "copy",
            "document"
        })
        public static class Examination {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean presence;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsAttachmentListType copy;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String document;

            /**
             * Gets the value of the presence property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPresence() {
                return presence;
            }

            /**
             * Sets the value of the presence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPresence(Boolean value) {
                this.presence = value;
            }

            /**
             * Gets the value of the copy property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsAttachmentListType }
             *     
             */
            public ZfcsAttachmentListType getCopy() {
                return copy;
            }

            /**
             * Sets the value of the copy property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsAttachmentListType }
             *     
             */
            public void setCopy(ZfcsAttachmentListType value) {
                this.copy = value;
            }

            /**
             * Gets the value of the document property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocument() {
                return document;
            }

            /**
             * Sets the value of the document property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocument(String value) {
                this.document = value;
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
         *         &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="documentation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "presence",
            "documentation"
        })
        public static class ProjectDocumentation {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean presence;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String documentation;

            /**
             * Gets the value of the presence property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPresence() {
                return presence;
            }

            /**
             * Sets the value of the presence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPresence(Boolean value) {
                this.presence = value;
            }

            /**
             * Gets the value of the documentation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentation() {
                return documentation;
            }

            /**
             * Sets the value of the documentation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentation(String value) {
                this.documentation = value;
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
         *         &lt;element name="presence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;sequence>
         *           &lt;element name="copy" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
         *           &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "presence",
            "copy",
            "document"
        })
        public static class Statement {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean presence;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsAttachmentListType copy;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String document;

            /**
             * Gets the value of the presence property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPresence() {
                return presence;
            }

            /**
             * Sets the value of the presence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPresence(Boolean value) {
                this.presence = value;
            }

            /**
             * Gets the value of the copy property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsAttachmentListType }
             *     
             */
            public ZfcsAttachmentListType getCopy() {
                return copy;
            }

            /**
             * Sets the value of the copy property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsAttachmentListType }
             *     
             */
            public void setCopy(ZfcsAttachmentListType value) {
                this.copy = value;
            }

            /**
             * Gets the value of the document property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocument() {
                return document;
            }

            /**
             * Sets the value of the document property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocument(String value) {
                this.document = value;
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
     *         &lt;element name="years" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingYearsType"/>
     *         &lt;element name="stages">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="stage" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                             &lt;element name="years" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingYearsType"/>
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
     *         &lt;element name="site" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
        "years",
        "stages",
        "site"
    })
    public static class Financings {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsBigProjectFinancingYearsType years;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages stages;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String site;

        /**
         * Gets the value of the years property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBigProjectFinancingYearsType }
         *     
         */
        public ZfcsBigProjectFinancingYearsType getYears() {
            return years;
        }

        /**
         * Sets the value of the years property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBigProjectFinancingYearsType }
         *     
         */
        public void setYears(ZfcsBigProjectFinancingYearsType value) {
            this.years = value;
        }

        /**
         * Gets the value of the stages property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages getStages() {
            return stages;
        }

        /**
         * Sets the value of the stages property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages }
         *     
         */
        public void setStages(ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages value) {
            this.stages = value;
        }

        /**
         * Gets the value of the site property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSite() {
            return site;
        }

        /**
         * Sets the value of the site property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSite(String value) {
            this.site = value;
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
         *         &lt;element name="stage" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *                   &lt;element name="years" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingYearsType"/>
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
            "stage"
        })
        public static class Stages {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages.Stage> stage;

            /**
             * Gets the value of the stage property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stage property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStage().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages.Stage }
             * 
             * 
             */
            public List<ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages.Stage> getStage() {
                if (stage == null) {
                    stage = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.Financings.Stages.Stage>();
                }
                return this.stage;
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
             *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
             *         &lt;element name="years" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingYearsType"/>
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
                "number",
                "years"
            })
            public static class Stage {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger number;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsBigProjectFinancingYearsType years;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumber(BigInteger value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the years property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsBigProjectFinancingYearsType }
                 *     
                 */
                public ZfcsBigProjectFinancingYearsType getYears() {
                    return years;
                }

                /**
                 * Sets the value of the years property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsBigProjectFinancingYearsType }
                 *     
                 */
                public void setYears(ZfcsBigProjectFinancingYearsType value) {
                    this.years = value;
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
     *         &lt;element name="participant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectMemberType" maxOccurs="unbounded"/>
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
        "participant"
    })
    public static class Participants {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsBigProjectMemberType> participant;

        /**
         * Gets the value of the participant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the participant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticipant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsBigProjectMemberType }
         * 
         * 
         */
        public List<ZfcsBigProjectMemberType> getParticipant() {
            if (participant == null) {
                participant = new ArrayList<ZfcsBigProjectMemberType>();
            }
            return this.participant;
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
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="purpose" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="period">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="startYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                   &lt;element name="endYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="direction" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="otherDirection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="mechanism">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *               &lt;enumeration value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="otherMechanism" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="grbs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="indicators">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="indicator" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                             &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
        "name",
        "purpose",
        "period",
        "direction",
        "otherDirection",
        "mechanism",
        "otherMechanism",
        "grbs",
        "indicators"
    })
    public static class ProjectInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String purpose;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Period period;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<String> direction;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String otherDirection;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String mechanism;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String otherMechanism;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String grbs;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators indicators;

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
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurpose() {
            return purpose;
        }

        /**
         * Sets the value of the purpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurpose(String value) {
            this.purpose = value;
        }

        /**
         * Gets the value of the period property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Period }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Period getPeriod() {
            return period;
        }

        /**
         * Sets the value of the period property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Period }
         *     
         */
        public void setPeriod(ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Period value) {
            this.period = value;
        }

        /**
         * Gets the value of the direction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the direction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDirection() {
            if (direction == null) {
                direction = new ArrayList<String>();
            }
            return this.direction;
        }

        /**
         * Gets the value of the otherDirection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherDirection() {
            return otherDirection;
        }

        /**
         * Sets the value of the otherDirection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherDirection(String value) {
            this.otherDirection = value;
        }

        /**
         * Gets the value of the mechanism property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMechanism() {
            return mechanism;
        }

        /**
         * Sets the value of the mechanism property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMechanism(String value) {
            this.mechanism = value;
        }

        /**
         * Gets the value of the otherMechanism property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherMechanism() {
            return otherMechanism;
        }

        /**
         * Sets the value of the otherMechanism property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherMechanism(String value) {
            this.otherMechanism = value;
        }

        /**
         * Gets the value of the grbs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrbs() {
            return grbs;
        }

        /**
         * Sets the value of the grbs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrbs(String value) {
            this.grbs = value;
        }

        /**
         * Gets the value of the indicators property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators getIndicators() {
            return indicators;
        }

        /**
         * Sets the value of the indicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators }
         *     
         */
        public void setIndicators(ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators value) {
            this.indicators = value;
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
         *         &lt;element name="indicator" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *                   &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "indicator"
        })
        public static class Indicators {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators.Indicator> indicator;

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
             * {@link ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators.Indicator }
             * 
             * 
             */
            public List<ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators.Indicator> getIndicator() {
                if (indicator == null) {
                    indicator = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.ProjectInfo.Indicators.Indicator>();
                }
                return this.indicator;
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
             *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
             *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
                "value"
            })
            public static class Indicator {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String name;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String value;

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
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
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
         *         &lt;element name="startYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *         &lt;element name="endYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
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
            "startYear",
            "endYear"
        })
        public static class Period {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int startYear;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int endYear;

            /**
             * Gets the value of the startYear property.
             * 
             */
            public int getStartYear() {
                return startYear;
            }

            /**
             * Sets the value of the startYear property.
             * 
             */
            public void setStartYear(int value) {
                this.startYear = value;
            }

            /**
             * Gets the value of the endYear property.
             * 
             */
            public int getEndYear() {
                return endYear;
            }

            /**
             * Sets the value of the endYear property.
             * 
             */
            public void setEndYear(int value) {
                this.endYear = value;
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
     *         &lt;element name="year" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                   &lt;element name="total" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="plan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="planAdvance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="paidAdvance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="federal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="region" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="self" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="nonbudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
     *                   &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType" minOccurs="0"/>
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
        "year"
    })
    public static class Realization {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsCustomerReportBigProjectMonitoringType.Realization.Year> year;

        /**
         * Gets the value of the year property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the year property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getYear().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportBigProjectMonitoringType.Realization.Year }
         * 
         * 
         */
        public List<ZfcsCustomerReportBigProjectMonitoringType.Realization.Year> getYear() {
            if (year == null) {
                year = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.Realization.Year>();
            }
            return this.year;
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
         *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *         &lt;element name="total" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="plan" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="planAdvance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="paid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="paidAdvance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="federal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="region" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="self" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="nonbudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType"/>
         *         &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectValueType" minOccurs="0"/>
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
            "year",
            "total",
            "plan",
            "planAdvance",
            "paid",
            "paidAdvance",
            "federal",
            "region",
            "self",
            "nonbudget",
            "salary",
            "funds"
        })
        public static class Year {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int year;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType total;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType plan;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType planAdvance;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType paid;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType paidAdvance;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType federal;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType region;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType self;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType nonbudget;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBigProjectValueType salary;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsBigProjectValueType funds;

            /**
             * Gets the value of the year property.
             * 
             */
            public int getYear() {
                return year;
            }

            /**
             * Sets the value of the year property.
             * 
             */
            public void setYear(int value) {
                this.year = value;
            }

            /**
             * Gets the value of the total property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getTotal() {
                return total;
            }

            /**
             * Sets the value of the total property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setTotal(ZfcsBigProjectValueType value) {
                this.total = value;
            }

            /**
             * Gets the value of the plan property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getPlan() {
                return plan;
            }

            /**
             * Sets the value of the plan property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setPlan(ZfcsBigProjectValueType value) {
                this.plan = value;
            }

            /**
             * Gets the value of the planAdvance property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getPlanAdvance() {
                return planAdvance;
            }

            /**
             * Sets the value of the planAdvance property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setPlanAdvance(ZfcsBigProjectValueType value) {
                this.planAdvance = value;
            }

            /**
             * Gets the value of the paid property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getPaid() {
                return paid;
            }

            /**
             * Sets the value of the paid property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setPaid(ZfcsBigProjectValueType value) {
                this.paid = value;
            }

            /**
             * Gets the value of the paidAdvance property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getPaidAdvance() {
                return paidAdvance;
            }

            /**
             * Sets the value of the paidAdvance property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setPaidAdvance(ZfcsBigProjectValueType value) {
                this.paidAdvance = value;
            }

            /**
             * Gets the value of the federal property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getFederal() {
                return federal;
            }

            /**
             * Sets the value of the federal property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setFederal(ZfcsBigProjectValueType value) {
                this.federal = value;
            }

            /**
             * Gets the value of the region property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getRegion() {
                return region;
            }

            /**
             * Sets the value of the region property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setRegion(ZfcsBigProjectValueType value) {
                this.region = value;
            }

            /**
             * Gets the value of the self property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getSelf() {
                return self;
            }

            /**
             * Sets the value of the self property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setSelf(ZfcsBigProjectValueType value) {
                this.self = value;
            }

            /**
             * Gets the value of the nonbudget property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getNonbudget() {
                return nonbudget;
            }

            /**
             * Sets the value of the nonbudget property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setNonbudget(ZfcsBigProjectValueType value) {
                this.nonbudget = value;
            }

            /**
             * Gets the value of the salary property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getSalary() {
                return salary;
            }

            /**
             * Sets the value of the salary property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setSalary(ZfcsBigProjectValueType value) {
                this.salary = value;
            }

            /**
             * Gets the value of the funds property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public ZfcsBigProjectValueType getFunds() {
                return funds;
            }

            /**
             * Sets the value of the funds property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBigProjectValueType }
             *     
             */
            public void setFunds(ZfcsBigProjectValueType value) {
                this.funds = value;
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
     *         &lt;element name="tender" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *                   &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="participants" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="participant" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                                       &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
     *                   &lt;element name="winners" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="winner" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                                       &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
     *                   &lt;element name="finalCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="total">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="finalCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                   &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "tender",
        "total"
    })
    public static class Tenders {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender> tender;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCustomerReportBigProjectMonitoringType.Tenders.Total total;

        /**
         * Gets the value of the tender property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tender property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTender().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender }
         * 
         * 
         */
        public List<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender> getTender() {
            if (tender == null) {
                tender = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender>();
            }
            return this.tender;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Total }
         *     
         */
        public ZfcsCustomerReportBigProjectMonitoringType.Tenders.Total getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Total }
         *     
         */
        public void setTotal(ZfcsCustomerReportBigProjectMonitoringType.Tenders.Total value) {
            this.total = value;
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
         *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
         *         &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="participants" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="participant" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                             &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
         *         &lt;element name="winners" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="winner" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                             &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
         *         &lt;element name="finalCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "purchaseNumber",
            "lotNumber",
            "placingWay",
            "name",
            "currency",
            "startCost",
            "startDate",
            "endDate",
            "participants",
            "winners",
            "finalCost",
            "salary",
            "funds",
            "addInfo"
        })
        public static class Tender {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String purchaseNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected BigInteger lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String placingWay;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCurrencyRef currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String startCost;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar startDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar endDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants participants;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners winners;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String finalCost;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String salary;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String funds;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String addInfo;

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
             * Gets the value of the placingWay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlacingWay() {
                return placingWay;
            }

            /**
             * Sets the value of the placingWay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlacingWay(String value) {
                this.placingWay = value;
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
             * Gets the value of the startCost property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartCost() {
                return startCost;
            }

            /**
             * Sets the value of the startCost property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartCost(String value) {
                this.startCost = value;
            }

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
             * Gets the value of the participants property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants }
             *     
             */
            public ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants getParticipants() {
                return participants;
            }

            /**
             * Sets the value of the participants property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants }
             *     
             */
            public void setParticipants(ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants value) {
                this.participants = value;
            }

            /**
             * Gets the value of the winners property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners }
             *     
             */
            public ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners getWinners() {
                return winners;
            }

            /**
             * Sets the value of the winners property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners }
             *     
             */
            public void setWinners(ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners value) {
                this.winners = value;
            }

            /**
             * Gets the value of the finalCost property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinalCost() {
                return finalCost;
            }

            /**
             * Sets the value of the finalCost property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinalCost(String value) {
                this.finalCost = value;
            }

            /**
             * Gets the value of the salary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalary() {
                return salary;
            }

            /**
             * Sets the value of the salary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalary(String value) {
                this.salary = value;
            }

            /**
             * Gets the value of the funds property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFunds() {
                return funds;
            }

            /**
             * Sets the value of the funds property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFunds(String value) {
                this.funds = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="participant" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
             *                   &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                "participant"
            })
            public static class Participants {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants.Participant> participant;

                /**
                 * Gets the value of the participant property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the participant property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getParticipant().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants.Participant }
                 * 
                 * 
                 */
                public List<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants.Participant> getParticipant() {
                    if (participant == null) {
                        participant = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Participants.Participant>();
                    }
                    return this.participant;
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
                 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
                 *         &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                    "startCost"
                })
                public static class Participant {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String name;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String startCost;

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
                     * Gets the value of the startCost property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStartCost() {
                        return startCost;
                    }

                    /**
                     * Sets the value of the startCost property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStartCost(String value) {
                        this.startCost = value;
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
             *         &lt;element name="winner" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
             *                   &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                "winner"
            })
            public static class Winners {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners.Winner> winner;

                /**
                 * Gets the value of the winner property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the winner property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getWinner().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners.Winner }
                 * 
                 * 
                 */
                public List<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners.Winner> getWinner() {
                    if (winner == null) {
                        winner = new ArrayList<ZfcsCustomerReportBigProjectMonitoringType.Tenders.Tender.Winners.Winner>();
                    }
                    return this.winner;
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
                 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
                 *         &lt;element name="startCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
                    "startCost"
                })
                public static class Winner {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String name;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String startCost;

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
                     * Gets the value of the startCost property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStartCost() {
                        return startCost;
                    }

                    /**
                     * Sets the value of the startCost property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStartCost(String value) {
                        this.startCost = value;
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
         *         &lt;element name="finalCost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *         &lt;element name="salary" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="funds" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "finalCost",
            "salary",
            "funds"
        })
        public static class Total {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String finalCost;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String salary;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String funds;

            /**
             * Gets the value of the finalCost property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinalCost() {
                return finalCost;
            }

            /**
             * Sets the value of the finalCost property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinalCost(String value) {
                this.finalCost = value;
            }

            /**
             * Gets the value of the salary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalary() {
                return salary;
            }

            /**
             * Sets the value of the salary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalary(String value) {
                this.salary = value;
            }

            /**
             * Gets the value of the funds property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFunds() {
                return funds;
            }

            /**
             * Sets the value of the funds property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFunds(String value) {
                this.funds = value;
            }

        }

    }

}
