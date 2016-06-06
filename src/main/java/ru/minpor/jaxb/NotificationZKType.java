
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
 * Извещение о проведении запроса котировок;
 * Извещение о продлении срока подачи котировочных заявок
 * 
 * <p>Java class for notificationZKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationZKType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}notificationType">
 *       &lt;sequence>
 *         &lt;element name="competitiveDocumentProvisioning">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="www">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notificationCommission">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="p1Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="p2Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="p1Place" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="p2Place">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="signTerm" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}currencyType"/>
 *                             &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType"/>
 *                             &lt;element name="infoProduct">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *                                                 &lt;element name="quantity">
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
 *                                                 &lt;element name="financeSource">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="2000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="paymentCondition">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="2000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="additionalInfo" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="guaranteeContract" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
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
 *                             &lt;group ref="{http://zakupki.gov.ru/oos/types/1}energyService" minOccurs="0"/>
 *                             &lt;element name="maxPriceReason" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4000"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationZKType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "competitiveDocumentProvisioning",
    "notificationCommission",
    "lots"
})
public class NotificationZKType
    extends NotificationType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationZKType.CompetitiveDocumentProvisioning competitiveDocumentProvisioning;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationZKType.NotificationCommission notificationCommission;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationZKType.Lots lots;

    /**
     * Gets the value of the competitiveDocumentProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZKType.CompetitiveDocumentProvisioning }
     *     
     */
    public NotificationZKType.CompetitiveDocumentProvisioning getCompetitiveDocumentProvisioning() {
        return competitiveDocumentProvisioning;
    }

    /**
     * Sets the value of the competitiveDocumentProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZKType.CompetitiveDocumentProvisioning }
     *     
     */
    public void setCompetitiveDocumentProvisioning(NotificationZKType.CompetitiveDocumentProvisioning value) {
        this.competitiveDocumentProvisioning = value;
    }

    /**
     * Gets the value of the notificationCommission property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZKType.NotificationCommission }
     *     
     */
    public NotificationZKType.NotificationCommission getNotificationCommission() {
        return notificationCommission;
    }

    /**
     * Sets the value of the notificationCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZKType.NotificationCommission }
     *     
     */
    public void setNotificationCommission(NotificationZKType.NotificationCommission value) {
        this.notificationCommission = value;
    }

    /**
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZKType.Lots }
     *     
     */
    public NotificationZKType.Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZKType.Lots }
     *     
     */
    public void setLots(NotificationZKType.Lots value) {
        this.lots = value;
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
     *         &lt;element name="www">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
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
        "www"
    })
    public static class CompetitiveDocumentProvisioning {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String www;

        /**
         * Gets the value of the www property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWww() {
            return www;
        }

        /**
         * Sets the value of the www property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWww(String value) {
            this.www = value;
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
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}currencyType"/>
     *                   &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType"/>
     *                   &lt;element name="infoProduct">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
     *                                       &lt;element name="quantity">
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
     *                                       &lt;element name="financeSource">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="2000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="paymentCondition">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="2000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="additionalInfo" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="guaranteeContract" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
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
     *                   &lt;group ref="{http://zakupki.gov.ru/oos/types/1}energyService" minOccurs="0"/>
     *                   &lt;element name="maxPriceReason" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4000"/>
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
        "lot"
    })
    public static class Lots {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected NotificationZKType.Lots.Lot lot;

        /**
         * Gets the value of the lot property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationZKType.Lots.Lot }
         *     
         */
        public NotificationZKType.Lots.Lot getLot() {
            return lot;
        }

        /**
         * Sets the value of the lot property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationZKType.Lots.Lot }
         *     
         */
        public void setLot(NotificationZKType.Lots.Lot value) {
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
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}currencyType"/>
         *         &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType"/>
         *         &lt;element name="infoProduct">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
         *                             &lt;element name="quantity">
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
         *                             &lt;element name="financeSource">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="2000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="paymentCondition">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="2000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="additionalInfo" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="guaranteeContract" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
         *                                     &lt;sequence>
         *                                       &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
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
         *         &lt;group ref="{http://zakupki.gov.ru/oos/types/1}energyService" minOccurs="0"/>
         *         &lt;element name="maxPriceReason" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4000"/>
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
            "subject",
            "currency",
            "products",
            "infoProduct",
            "notificationFeatures",
            "customerRequirements",
            "auctionItems",
            "energyType",
            "energyServiceEconomy",
            "maxPriceReason"
        })
        public static class Lot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Long sid;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int ordinalNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String subject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected CurrencyType currency;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ProductsType products;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String infoProduct;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected NotificationZKType.Lots.Lot.NotificationFeatures notificationFeatures;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected NotificationZKType.Lots.Lot.CustomerRequirements customerRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected AuctionItemsType auctionItems;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected EnergyServiceEnergyType energyType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String energyServiceEconomy;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String maxPriceReason;

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
             * Gets the value of the infoProduct property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoProduct() {
                return infoProduct;
            }

            /**
             * Sets the value of the infoProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoProduct(String value) {
                this.infoProduct = value;
            }

            /**
             * Gets the value of the notificationFeatures property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationZKType.Lots.Lot.NotificationFeatures }
             *     
             */
            public NotificationZKType.Lots.Lot.NotificationFeatures getNotificationFeatures() {
                return notificationFeatures;
            }

            /**
             * Sets the value of the notificationFeatures property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationZKType.Lots.Lot.NotificationFeatures }
             *     
             */
            public void setNotificationFeatures(NotificationZKType.Lots.Lot.NotificationFeatures value) {
                this.notificationFeatures = value;
            }

            /**
             * Gets the value of the customerRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationZKType.Lots.Lot.CustomerRequirements }
             *     
             */
            public NotificationZKType.Lots.Lot.CustomerRequirements getCustomerRequirements() {
                return customerRequirements;
            }

            /**
             * Sets the value of the customerRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationZKType.Lots.Lot.CustomerRequirements }
             *     
             */
            public void setCustomerRequirements(NotificationZKType.Lots.Lot.CustomerRequirements value) {
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
             * Gets the value of the maxPriceReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaxPriceReason() {
                return maxPriceReason;
            }

            /**
             * Sets the value of the maxPriceReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaxPriceReason(String value) {
                this.maxPriceReason = value;
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
             *                   &lt;element name="quantity">
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
             *                   &lt;element name="financeSource">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="2000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="paymentCondition">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="2000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="additionalInfo" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="guaranteeContract" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
             *                           &lt;sequence>
             *                             &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
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
                protected List<NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement> customerRequirement;

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
                 * {@link NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement }
                 * 
                 * 
                 */
                public List<NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement> getCustomerRequirement() {
                    if (customerRequirement == null) {
                        customerRequirement = new ArrayList<NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement>();
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
                 *         &lt;element name="quantity">
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
                 *         &lt;element name="financeSource">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="2000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="paymentCondition">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="2000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="additionalInfo" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="guaranteeContract" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
                 *                 &lt;sequence>
                 *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
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
                    "financeSource",
                    "paymentCondition",
                    "additionalInfo",
                    "guaranteeContract",
                    "kbk",
                    "tenderPlanInfo"
                })
                public static class CustomerRequirement {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Long sid;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
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
                    protected String financeSource;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String paymentCondition;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String additionalInfo;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract guaranteeContract;
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
                     * Gets the value of the paymentCondition property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentCondition() {
                        return paymentCondition;
                    }

                    /**
                     * Sets the value of the paymentCondition property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentCondition(String value) {
                        this.paymentCondition = value;
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
                     * Gets the value of the guaranteeContract property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract }
                     *     
                     */
                    public NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract getGuaranteeContract() {
                        return guaranteeContract;
                    }

                    /**
                     * Sets the value of the guaranteeContract property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract }
                     *     
                     */
                    public void setGuaranteeContract(NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract value) {
                        this.guaranteeContract = value;
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
                     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType">
                     *       &lt;sequence>
                     *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                        protected Double amount;

                        /**
                         * Gets the value of the amount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public Double getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setAmount(Double value) {
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
     *         &lt;element name="p1Place" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="p2Place">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="signTerm" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "p1Place",
        "p2Place",
        "signTerm"
    })
    public static class NotificationCommission {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar p1Date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar p2Date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String p1Place;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String p2Place;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected long signTerm;

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
         * Gets the value of the p1Place property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getP1Place() {
            return p1Place;
        }

        /**
         * Sets the value of the p1Place property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setP1Place(String value) {
            this.p1Place = value;
        }

        /**
         * Gets the value of the p2Place property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getP2Place() {
            return p2Place;
        }

        /**
         * Sets the value of the p2Place property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setP2Place(String value) {
            this.p2Place = value;
        }

        /**
         * Gets the value of the signTerm property.
         * 
         */
        public long getSignTerm() {
            return signTerm;
        }

        /**
         * Sets the value of the signTerm property.
         * 
         */
        public void setSignTerm(long value) {
            this.signTerm = value;
        }

    }

}
