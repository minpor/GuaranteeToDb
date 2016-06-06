
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
 * Извещение о проведении ЭА;
 * Извещение о внесении изменений в извещение о проведении ЭА или аукционную документацию
 * 
 * <p>Java class for notificationEFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationEFType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}notificationType">
 *       &lt;sequence>
 *         &lt;element name="notificationCommission">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="p1Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="p2Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="p3Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lot">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="subject">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}currencyType" minOccurs="0"/>
 *                             &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType"/>
 *                             &lt;element name="notificationFeatures" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="notificationFeature" type="{http://zakupki.gov.ru/oos/types/1}notificationFeatureType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="customerRequirements">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="customerRequirement" maxOccurs="unbounded">
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
 *                                                 &lt;element name="quantity" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
 *                                                 &lt;element name="deliveryPlace" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="deliveryTerm" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="1024"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="guaranteeApp">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeAppType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="guaranteeContract" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="additionalInfo" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}KBKType" minOccurs="0"/>
 *                                                 &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
 *                             &lt;element name="auctionItems" type="{http://zakupki.gov.ru/oos/types/1}auctionItemsType" minOccurs="0"/>
 *                             &lt;element name="documentRequirements" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="documentRequirement" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://zakupki.gov.ru/oos/types/1}documentRequirement">
 *                                               &lt;sequence>
 *                                                 &lt;element name="docName">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="1024"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="auctionProducts" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="auctionProduct" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="productName">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="tradeMark" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="productRequirement" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                           &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="requirement">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="1024"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="equivalenceParam" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                           &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="name">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="1024"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="paramType" type="{http://zakupki.gov.ru/oos/types/1}equivalenceParamType"/>
 *                                                           &lt;element name="paramValue">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="1024"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                             &lt;element name="lotDocRequirements" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="docReq-1.1.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
 *                                       &lt;element name="docReq-1.2.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
 *                                       &lt;element name="docReq-2.1.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;group ref="{http://zakupki.gov.ru/oos/types/1}energyService" minOccurs="0"/>
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
 *         &lt;element name="EP" type="{http://zakupki.gov.ru/oos/types/1}EPType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationEFType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "notificationCommission",
    "lots",
    "ep"
})
public class NotificationEFType
    extends NotificationType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationEFType.NotificationCommission notificationCommission;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationEFType.Lots lots;
    @XmlElement(name = "EP", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected EPType ep;

    /**
     * Gets the value of the notificationCommission property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEFType.NotificationCommission }
     *     
     */
    public NotificationEFType.NotificationCommission getNotificationCommission() {
        return notificationCommission;
    }

    /**
     * Sets the value of the notificationCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEFType.NotificationCommission }
     *     
     */
    public void setNotificationCommission(NotificationEFType.NotificationCommission value) {
        this.notificationCommission = value;
    }

    /**
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEFType.Lots }
     *     
     */
    public NotificationEFType.Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEFType.Lots }
     *     
     */
    public void setLots(NotificationEFType.Lots value) {
        this.lots = value;
    }

    /**
     * Gets the value of the ep property.
     * 
     * @return
     *     possible object is
     *     {@link EPType }
     *     
     */
    public EPType getEP() {
        return ep;
    }

    /**
     * Sets the value of the ep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPType }
     *     
     */
    public void setEP(EPType value) {
        this.ep = value;
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
     *         &lt;element name="lot">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="subject">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}currencyType" minOccurs="0"/>
     *                   &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType"/>
     *                   &lt;element name="notificationFeatures" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="notificationFeature" type="{http://zakupki.gov.ru/oos/types/1}notificationFeatureType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="customerRequirements">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="customerRequirement" maxOccurs="unbounded">
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
     *                                       &lt;element name="quantity" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
     *                                       &lt;element name="deliveryPlace" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="deliveryTerm" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="1024"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="guaranteeApp">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeAppType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                               &lt;/sequence>
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="guaranteeContract" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                               &lt;/sequence>
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="additionalInfo" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}KBKType" minOccurs="0"/>
     *                                       &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
     *                   &lt;element name="auctionItems" type="{http://zakupki.gov.ru/oos/types/1}auctionItemsType" minOccurs="0"/>
     *                   &lt;element name="documentRequirements" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="documentRequirement" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}documentRequirement">
     *                                     &lt;sequence>
     *                                       &lt;element name="docName">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="1024"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="auctionProducts" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="auctionProduct" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="productName">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="tradeMark" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="productRequirement" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                                 &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="requirement">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;maxLength value="1024"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="equivalenceParam" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                                 &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="name">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;maxLength value="1024"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="paramType" type="{http://zakupki.gov.ru/oos/types/1}equivalenceParamType"/>
     *                                                 &lt;element name="paramValue">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;maxLength value="1024"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
     *                   &lt;element name="lotDocRequirements" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="docReq-1.1.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
     *                             &lt;element name="docReq-1.2.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
     *                             &lt;element name="docReq-2.1.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;group ref="{http://zakupki.gov.ru/oos/types/1}energyService" minOccurs="0"/>
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
        "lot"
    })
    public static class Lots {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected NotificationEFType.Lots.Lot lot;

        /**
         * Gets the value of the lot property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEFType.Lots.Lot }
         *     
         */
        public NotificationEFType.Lots.Lot getLot() {
            return lot;
        }

        /**
         * Sets the value of the lot property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEFType.Lots.Lot }
         *     
         */
        public void setLot(NotificationEFType.Lots.Lot value) {
            this.lot = value;
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
         *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="subject">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}currencyType" minOccurs="0"/>
         *         &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType"/>
         *         &lt;element name="notificationFeatures" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="notificationFeature" type="{http://zakupki.gov.ru/oos/types/1}notificationFeatureType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
         *                             &lt;element name="sid" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="quantity" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
         *                             &lt;element name="deliveryPlace" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="deliveryTerm" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="1024"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="guaranteeApp">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeAppType">
         *                                     &lt;sequence>
         *                                       &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                                     &lt;/sequence>
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="guaranteeContract" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
         *                                     &lt;sequence>
         *                                       &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                                     &lt;/sequence>
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="additionalInfo" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}KBKType" minOccurs="0"/>
         *                             &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
         *         &lt;element name="auctionItems" type="{http://zakupki.gov.ru/oos/types/1}auctionItemsType" minOccurs="0"/>
         *         &lt;element name="documentRequirements" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="documentRequirement" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}documentRequirement">
         *                           &lt;sequence>
         *                             &lt;element name="docName">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="1024"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
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
         *         &lt;element name="auctionProducts" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="auctionProduct" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="productName">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="tradeMark" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="productRequirement" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                                       &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="requirement">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;maxLength value="1024"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="equivalenceParam" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                                       &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="name">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;maxLength value="1024"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="paramType" type="{http://zakupki.gov.ru/oos/types/1}equivalenceParamType"/>
         *                                       &lt;element name="paramValue">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;maxLength value="1024"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
         *         &lt;element name="lotDocRequirements" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="docReq-1.1.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
         *                   &lt;element name="docReq-1.2.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
         *                   &lt;element name="docReq-2.1.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;group ref="{http://zakupki.gov.ru/oos/types/1}energyService" minOccurs="0"/>
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
            "ordinalNumber",
            "subject",
            "currency",
            "products",
            "notificationFeatures",
            "customerRequirements",
            "auctionItems",
            "documentRequirements",
            "auctionProducts",
            "lotDocRequirements",
            "energyType",
            "energyServiceEconomy"
        })
        public static class Lot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Long sid;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int ordinalNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String subject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected CurrencyType currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ProductsType products;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected NotificationEFType.Lots.Lot.NotificationFeatures notificationFeatures;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected NotificationEFType.Lots.Lot.CustomerRequirements customerRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected AuctionItemsType auctionItems;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected NotificationEFType.Lots.Lot.DocumentRequirements documentRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected NotificationEFType.Lots.Lot.AuctionProducts auctionProducts;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected NotificationEFType.Lots.Lot.LotDocRequirements lotDocRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected EnergyServiceEnergyType energyType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String energyServiceEconomy;

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
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyType }
             *     
             */
            public CurrencyType getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyType }
             *     
             */
            public void setCurrency(CurrencyType value) {
                this.currency = value;
            }

            /**
             * Gets the value of the products property.
             * 
             * @return
             *     possible object is
             *     {@link ProductsType }
             *     
             */
            public ProductsType getProducts() {
                return products;
            }

            /**
             * Sets the value of the products property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProductsType }
             *     
             */
            public void setProducts(ProductsType value) {
                this.products = value;
            }

            /**
             * Gets the value of the notificationFeatures property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationEFType.Lots.Lot.NotificationFeatures }
             *     
             */
            public NotificationEFType.Lots.Lot.NotificationFeatures getNotificationFeatures() {
                return notificationFeatures;
            }

            /**
             * Sets the value of the notificationFeatures property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationEFType.Lots.Lot.NotificationFeatures }
             *     
             */
            public void setNotificationFeatures(NotificationEFType.Lots.Lot.NotificationFeatures value) {
                this.notificationFeatures = value;
            }

            /**
             * Gets the value of the customerRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationEFType.Lots.Lot.CustomerRequirements }
             *     
             */
            public NotificationEFType.Lots.Lot.CustomerRequirements getCustomerRequirements() {
                return customerRequirements;
            }

            /**
             * Sets the value of the customerRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationEFType.Lots.Lot.CustomerRequirements }
             *     
             */
            public void setCustomerRequirements(NotificationEFType.Lots.Lot.CustomerRequirements value) {
                this.customerRequirements = value;
            }

            /**
             * Gets the value of the auctionItems property.
             * 
             * @return
             *     possible object is
             *     {@link AuctionItemsType }
             *     
             */
            public AuctionItemsType getAuctionItems() {
                return auctionItems;
            }

            /**
             * Sets the value of the auctionItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link AuctionItemsType }
             *     
             */
            public void setAuctionItems(AuctionItemsType value) {
                this.auctionItems = value;
            }

            /**
             * Gets the value of the documentRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationEFType.Lots.Lot.DocumentRequirements }
             *     
             */
            public NotificationEFType.Lots.Lot.DocumentRequirements getDocumentRequirements() {
                return documentRequirements;
            }

            /**
             * Sets the value of the documentRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationEFType.Lots.Lot.DocumentRequirements }
             *     
             */
            public void setDocumentRequirements(NotificationEFType.Lots.Lot.DocumentRequirements value) {
                this.documentRequirements = value;
            }

            /**
             * Gets the value of the auctionProducts property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationEFType.Lots.Lot.AuctionProducts }
             *     
             */
            public NotificationEFType.Lots.Lot.AuctionProducts getAuctionProducts() {
                return auctionProducts;
            }

            /**
             * Sets the value of the auctionProducts property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationEFType.Lots.Lot.AuctionProducts }
             *     
             */
            public void setAuctionProducts(NotificationEFType.Lots.Lot.AuctionProducts value) {
                this.auctionProducts = value;
            }

            /**
             * Gets the value of the lotDocRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationEFType.Lots.Lot.LotDocRequirements }
             *     
             */
            public NotificationEFType.Lots.Lot.LotDocRequirements getLotDocRequirements() {
                return lotDocRequirements;
            }

            /**
             * Sets the value of the lotDocRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationEFType.Lots.Lot.LotDocRequirements }
             *     
             */
            public void setLotDocRequirements(NotificationEFType.Lots.Lot.LotDocRequirements value) {
                this.lotDocRequirements = value;
            }

            /**
             * Gets the value of the energyType property.
             * 
             * @return
             *     possible object is
             *     {@link EnergyServiceEnergyType }
             *     
             */
            public EnergyServiceEnergyType getEnergyType() {
                return energyType;
            }

            /**
             * Sets the value of the energyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link EnergyServiceEnergyType }
             *     
             */
            public void setEnergyType(EnergyServiceEnergyType value) {
                this.energyType = value;
            }

            /**
             * Gets the value of the energyServiceEconomy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnergyServiceEconomy() {
                return energyServiceEconomy;
            }

            /**
             * Sets the value of the energyServiceEconomy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnergyServiceEconomy(String value) {
                this.energyServiceEconomy = value;
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
             *         &lt;element name="auctionProduct" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="productName">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="tradeMark" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="productRequirement" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="requirement">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;maxLength value="1024"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="equivalenceParam" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="name">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;maxLength value="1024"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="paramType" type="{http://zakupki.gov.ru/oos/types/1}equivalenceParamType"/>
             *                             &lt;element name="paramValue">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;maxLength value="1024"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "auctionProduct"
            })
            public static class AuctionProducts {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct> auctionProduct;

                /**
                 * Gets the value of the auctionProduct property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the auctionProduct property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAuctionProduct().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct }
                 * 
                 * 
                 */
                public List<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct> getAuctionProduct() {
                    if (auctionProduct == null) {
                        auctionProduct = new ArrayList<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct>();
                    }
                    return this.auctionProduct;
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
                 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="productName">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tradeMark" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="productRequirement" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="requirement">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;maxLength value="1024"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="equivalenceParam" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="name">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;maxLength value="1024"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="paramType" type="{http://zakupki.gov.ru/oos/types/1}equivalenceParamType"/>
                 *                   &lt;element name="paramValue">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;maxLength value="1024"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "sid",
                    "ordinalNumber",
                    "productName",
                    "tradeMark",
                    "productRequirement",
                    "equivalenceParam"
                })
                public static class AuctionProduct {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Long sid;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected int ordinalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String productName;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String tradeMark;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", nillable = true)
                    protected List<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct.ProductRequirement> productRequirement;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", nillable = true)
                    protected List<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct.EquivalenceParam> equivalenceParam;

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

                    /**
                     * Gets the value of the tradeMark property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTradeMark() {
                        return tradeMark;
                    }

                    /**
                     * Sets the value of the tradeMark property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTradeMark(String value) {
                        this.tradeMark = value;
                    }

                    /**
                     * Gets the value of the productRequirement property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the productRequirement property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProductRequirement().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct.ProductRequirement }
                     * 
                     * 
                     */
                    public List<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct.ProductRequirement> getProductRequirement() {
                        if (productRequirement == null) {
                            productRequirement = new ArrayList<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct.ProductRequirement>();
                        }
                        return this.productRequirement;
                    }

                    /**
                     * Gets the value of the equivalenceParam property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the equivalenceParam property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getEquivalenceParam().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct.EquivalenceParam }
                     * 
                     * 
                     */
                    public List<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct.EquivalenceParam> getEquivalenceParam() {
                        if (equivalenceParam == null) {
                            equivalenceParam = new ArrayList<NotificationEFType.Lots.Lot.AuctionProducts.AuctionProduct.EquivalenceParam>();
                        }
                        return this.equivalenceParam;
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
                     *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                     *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="name">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;maxLength value="1024"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="paramType" type="{http://zakupki.gov.ru/oos/types/1}equivalenceParamType"/>
                     *         &lt;element name="paramValue">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;maxLength value="1024"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                        "ordinalNumber",
                        "name",
                        "paramType",
                        "paramValue",
                        "modifiable"
                    })
                    public static class EquivalenceParam {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected Long sid;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected int ordinalNumber;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected String name;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        @XmlSchemaType(name = "string")
                        protected EquivalenceParamType paramType;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected String paramValue;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected boolean modifiable;

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
                         * Gets the value of the paramType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link EquivalenceParamType }
                         *     
                         */
                        public EquivalenceParamType getParamType() {
                            return paramType;
                        }

                        /**
                         * Sets the value of the paramType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link EquivalenceParamType }
                         *     
                         */
                        public void setParamType(EquivalenceParamType value) {
                            this.paramType = value;
                        }

                        /**
                         * Gets the value of the paramValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getParamValue() {
                            return paramValue;
                        }

                        /**
                         * Sets the value of the paramValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setParamValue(String value) {
                            this.paramValue = value;
                        }

                        /**
                         * Gets the value of the modifiable property.
                         * 
                         */
                        public boolean isModifiable() {
                            return modifiable;
                        }

                        /**
                         * Sets the value of the modifiable property.
                         * 
                         */
                        public void setModifiable(boolean value) {
                            this.modifiable = value;
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
                     *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                     *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="requirement">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;maxLength value="1024"/>
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
                        "sid",
                        "ordinalNumber",
                        "requirement"
                    })
                    public static class ProductRequirement {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected Long sid;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected int ordinalNumber;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected String requirement;

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
                         * Gets the value of the requirement property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRequirement() {
                            return requirement;
                        }

                        /**
                         * Sets the value of the requirement property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRequirement(String value) {
                            this.requirement = value;
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
             *         &lt;element name="customerRequirement" maxOccurs="unbounded">
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
             *                   &lt;element name="quantity" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
             *                   &lt;element name="deliveryPlace" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="deliveryTerm" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="1024"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="guaranteeApp">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeAppType">
             *                           &lt;sequence>
             *                             &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                           &lt;/sequence>
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="guaranteeContract" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
             *                           &lt;sequence>
             *                             &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                           &lt;/sequence>
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="additionalInfo" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}KBKType" minOccurs="0"/>
             *                   &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
                protected List<NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement> customerRequirement;

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
                 * {@link NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement }
                 * 
                 * 
                 */
                public List<NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement> getCustomerRequirement() {
                    if (customerRequirement == null) {
                        customerRequirement = new ArrayList<NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement>();
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
                 *         &lt;element name="sid" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="quantity" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
                 *         &lt;element name="deliveryPlace" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="deliveryTerm" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="1024"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="guaranteeApp">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeAppType">
                 *                 &lt;sequence>
                 *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *                 &lt;/sequence>
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="guaranteeContract" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
                 *                 &lt;sequence>
                 *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *                 &lt;/sequence>
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="additionalInfo" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}KBKType" minOccurs="0"/>
                 *         &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
                    "quantity",
                    "maxPrice",
                    "customer",
                    "deliveryPlace",
                    "deliveryTerm",
                    "guaranteeApp",
                    "guaranteeContract",
                    "additionalInfo",
                    "kbk",
                    "tenderPlanInfo"
                })
                public static class CustomerRequirement {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Long sid;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String quantity;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected double maxPrice;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected OrganizationRef customer;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String deliveryPlace;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String deliveryTerm;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp guaranteeApp;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract guaranteeContract;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String additionalInfo;
                    @XmlElement(name = "KBK", namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected KBKType kbk;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected TendePlanInfoType tenderPlanInfo;

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
                     *     {@link String }
                     *     
                     */
                    public String getQuantity() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQuantity(String value) {
                        this.quantity = value;
                    }

                    /**
                     * Gets the value of the maxPrice property.
                     * 
                     */
                    public double getMaxPrice() {
                        return maxPrice;
                    }

                    /**
                     * Sets the value of the maxPrice property.
                     * 
                     */
                    public void setMaxPrice(double value) {
                        this.maxPrice = value;
                    }

                    /**
                     * Gets the value of the customer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrganizationRef }
                     *     
                     */
                    public OrganizationRef getCustomer() {
                        return customer;
                    }

                    /**
                     * Sets the value of the customer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrganizationRef }
                     *     
                     */
                    public void setCustomer(OrganizationRef value) {
                        this.customer = value;
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
                     * Gets the value of the guaranteeApp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp }
                     *     
                     */
                    public NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp getGuaranteeApp() {
                        return guaranteeApp;
                    }

                    /**
                     * Sets the value of the guaranteeApp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp }
                     *     
                     */
                    public void setGuaranteeApp(NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp value) {
                        this.guaranteeApp = value;
                    }

                    /**
                     * Gets the value of the guaranteeContract property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract }
                     *     
                     */
                    public NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract getGuaranteeContract() {
                        return guaranteeContract;
                    }

                    /**
                     * Sets the value of the guaranteeContract property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract }
                     *     
                     */
                    public void setGuaranteeContract(NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract value) {
                        this.guaranteeContract = value;
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

                    /**
                     * Gets the value of the kbk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link KBKType }
                     *     
                     */
                    public KBKType getKBK() {
                        return kbk;
                    }

                    /**
                     * Sets the value of the kbk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link KBKType }
                     *     
                     */
                    public void setKBK(KBKType value) {
                        this.kbk = value;
                    }

                    /**
                     * Gets the value of the tenderPlanInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TendePlanInfoType }
                     *     
                     */
                    public TendePlanInfoType getTenderPlanInfo() {
                        return tenderPlanInfo;
                    }

                    /**
                     * Sets the value of the tenderPlanInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TendePlanInfoType }
                     *     
                     */
                    public void setTenderPlanInfo(TendePlanInfoType value) {
                        this.tenderPlanInfo = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeAppType">
                     *       &lt;sequence>
                     *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
                        "amount"
                    })
                    public static class GuaranteeApp
                        extends GuaranteeAppType
                    {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected double amount;

                        /**
                         * Gets the value of the amount property.
                         * 
                         */
                        public double getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         */
                        public void setAmount(double value) {
                            this.amount = value;
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
                     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
                     *       &lt;sequence>
                     *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
                        "amount"
                    })
                    public static class GuaranteeContract
                        extends GuaranteeContractType
                    {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected double amount;

                        /**
                         * Gets the value of the amount property.
                         * 
                         */
                        public double getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         */
                        public void setAmount(double value) {
                            this.amount = value;
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
             *         &lt;element name="documentRequirement" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}documentRequirement">
             *                 &lt;sequence>
             *                   &lt;element name="docName">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="1024"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
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
                "documentRequirement"
            })
            public static class DocumentRequirements {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true, nillable = true)
                protected List<NotificationEFType.Lots.Lot.DocumentRequirements.DocumentRequirement> documentRequirement;

                /**
                 * Gets the value of the documentRequirement property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the documentRequirement property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocumentRequirement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NotificationEFType.Lots.Lot.DocumentRequirements.DocumentRequirement }
                 * 
                 * 
                 */
                public List<NotificationEFType.Lots.Lot.DocumentRequirements.DocumentRequirement> getDocumentRequirement() {
                    if (documentRequirement == null) {
                        documentRequirement = new ArrayList<NotificationEFType.Lots.Lot.DocumentRequirements.DocumentRequirement>();
                    }
                    return this.documentRequirement;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}documentRequirement">
                 *       &lt;sequence>
                 *         &lt;element name="docName">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="1024"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "docName"
                })
                public static class DocumentRequirement
                    extends ru.minpor.jaxb.DocumentRequirement
                {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String docName;

                    /**
                     * Gets the value of the docName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDocName() {
                        return docName;
                    }

                    /**
                     * Sets the value of the docName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDocName(String value) {
                        this.docName = value;
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
             *         &lt;element name="docReq-1.1.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
             *         &lt;element name="docReq-1.2.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
             *         &lt;element name="docReq-2.1.11" type="{http://zakupki.gov.ru/oos/types/1}docReqType" minOccurs="0"/>
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
                "docReq1111",
                "docReq1211",
                "docReq2111"
            })
            public static class LotDocRequirements {

                @XmlElement(name = "docReq-1.1.11", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected DocReqType docReq1111;
                @XmlElement(name = "docReq-1.2.11", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected DocReqType docReq1211;
                @XmlElement(name = "docReq-2.1.11", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected DocReqType docReq2111;

                /**
                 * Gets the value of the docReq1111 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DocReqType }
                 *     
                 */
                public DocReqType getDocReq1111() {
                    return docReq1111;
                }

                /**
                 * Sets the value of the docReq1111 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DocReqType }
                 *     
                 */
                public void setDocReq1111(DocReqType value) {
                    this.docReq1111 = value;
                }

                /**
                 * Gets the value of the docReq1211 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DocReqType }
                 *     
                 */
                public DocReqType getDocReq1211() {
                    return docReq1211;
                }

                /**
                 * Sets the value of the docReq1211 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DocReqType }
                 *     
                 */
                public void setDocReq1211(DocReqType value) {
                    this.docReq1211 = value;
                }

                /**
                 * Gets the value of the docReq2111 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DocReqType }
                 *     
                 */
                public DocReqType getDocReq2111() {
                    return docReq2111;
                }

                /**
                 * Sets the value of the docReq2111 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DocReqType }
                 *     
                 */
                public void setDocReq2111(DocReqType value) {
                    this.docReq2111 = value;
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
             *         &lt;element name="notificationFeature" type="{http://zakupki.gov.ru/oos/types/1}notificationFeatureType" maxOccurs="unbounded"/>
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
                "notificationFeature"
            })
            public static class NotificationFeatures {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<NotificationFeatureType> notificationFeature;

                /**
                 * Gets the value of the notificationFeature property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the notificationFeature property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNotificationFeature().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NotificationFeatureType }
                 * 
                 * 
                 */
                public List<NotificationFeatureType> getNotificationFeature() {
                    if (notificationFeature == null) {
                        notificationFeature = new ArrayList<NotificationFeatureType>();
                    }
                    return this.notificationFeature;
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
     *         &lt;element name="p1Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="p2Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="p3Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "p1Date",
        "p2Date",
        "p3Date"
    })
    public static class NotificationCommission {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar p1Date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar p2Date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar p3Date;

        /**
         * Gets the value of the p1Date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getP1Date() {
            return p1Date;
        }

        /**
         * Sets the value of the p1Date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setP1Date(XMLGregorianCalendar value) {
            this.p1Date = value;
        }

        /**
         * Gets the value of the p2Date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getP2Date() {
            return p2Date;
        }

        /**
         * Sets the value of the p2Date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setP2Date(XMLGregorianCalendar value) {
            this.p2Date = value;
        }

        /**
         * Gets the value of the p3Date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getP3Date() {
            return p3Date;
        }

        /**
         * Sets the value of the p3Date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setP3Date(XMLGregorianCalendar value) {
            this.p3Date = value;
        }

    }

}
