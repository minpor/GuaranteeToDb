
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
 * Извещение о проведении открытого конкурса; Извещение о внесении изменений в извещение о проведении открытого конкурса и конкурсную документацию
 * 
 * <p>Java class for notificationOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationOKType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}notificationType">
 *       &lt;sequence>
 *         &lt;element name="notificationPlacement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://zakupki.gov.ru/oos/types/1}delivery" minOccurs="0"/>
 *                   &lt;element name="additionalInfo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="guaranteeApp" type="{http://zakupki.gov.ru/oos/types/1}guaranteeAppType" minOccurs="0"/>
 *                   &lt;element name="guaranteeContract" type="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="competitiveDocumentProvisioning">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deliveryTerm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="deliveryTerm2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="deliveryPlace">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="deliveryProcedure">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1028"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="www">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="guarantee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
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
 *                   &lt;element name="p1Place">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="p2Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="p2Place">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="p3Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="p3Place">
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
 *         &lt;element name="lots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lot" maxOccurs="unbounded">
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
 *                             &lt;element name="ordinalNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *                                                 &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *                                                 &lt;element name="guaranteeApp" minOccurs="0">
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
 *                                                 &lt;element name="quantityContractsPnir" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *                             &lt;element name="priceNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="maxPriceInPercents" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="maxPriceItem" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationOKType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "notificationPlacement",
    "competitiveDocumentProvisioning",
    "notificationCommission",
    "lots"
})
public class NotificationOKType
    extends NotificationType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected NotificationOKType.NotificationPlacement notificationPlacement;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationOKType.CompetitiveDocumentProvisioning competitiveDocumentProvisioning;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationOKType.NotificationCommission notificationCommission;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationOKType.Lots lots;

    /**
     * Gets the value of the notificationPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOKType.NotificationPlacement }
     *     
     */
    public NotificationOKType.NotificationPlacement getNotificationPlacement() {
        return notificationPlacement;
    }

    /**
     * Sets the value of the notificationPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOKType.NotificationPlacement }
     *     
     */
    public void setNotificationPlacement(NotificationOKType.NotificationPlacement value) {
        this.notificationPlacement = value;
    }

    /**
     * Gets the value of the competitiveDocumentProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOKType.CompetitiveDocumentProvisioning }
     *     
     */
    public NotificationOKType.CompetitiveDocumentProvisioning getCompetitiveDocumentProvisioning() {
        return competitiveDocumentProvisioning;
    }

    /**
     * Sets the value of the competitiveDocumentProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOKType.CompetitiveDocumentProvisioning }
     *     
     */
    public void setCompetitiveDocumentProvisioning(NotificationOKType.CompetitiveDocumentProvisioning value) {
        this.competitiveDocumentProvisioning = value;
    }

    /**
     * Gets the value of the notificationCommission property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOKType.NotificationCommission }
     *     
     */
    public NotificationOKType.NotificationCommission getNotificationCommission() {
        return notificationCommission;
    }

    /**
     * Sets the value of the notificationCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOKType.NotificationCommission }
     *     
     */
    public void setNotificationCommission(NotificationOKType.NotificationCommission value) {
        this.notificationCommission = value;
    }

    /**
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOKType.Lots }
     *     
     */
    public NotificationOKType.Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOKType.Lots }
     *     
     */
    public void setLots(NotificationOKType.Lots value) {
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
     *         &lt;element name="deliveryTerm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="deliveryTerm2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="deliveryPlace">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="deliveryProcedure">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1028"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="www">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="guarantee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeType">
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
        "deliveryTerm",
        "deliveryTerm2",
        "deliveryPlace",
        "deliveryProcedure",
        "www",
        "guarantee"
    })
    public static class CompetitiveDocumentProvisioning {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar deliveryTerm;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar deliveryTerm2;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String deliveryPlace;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String deliveryProcedure;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String www;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected NotificationOKType.CompetitiveDocumentProvisioning.Guarantee guarantee;

        /**
         * Gets the value of the deliveryTerm property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDeliveryTerm() {
            return deliveryTerm;
        }

        /**
         * Sets the value of the deliveryTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDeliveryTerm(XMLGregorianCalendar value) {
            this.deliveryTerm = value;
        }

        /**
         * Gets the value of the deliveryTerm2 property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDeliveryTerm2() {
            return deliveryTerm2;
        }

        /**
         * Sets the value of the deliveryTerm2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDeliveryTerm2(XMLGregorianCalendar value) {
            this.deliveryTerm2 = value;
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
         * Gets the value of the deliveryProcedure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliveryProcedure() {
            return deliveryProcedure;
        }

        /**
         * Sets the value of the deliveryProcedure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliveryProcedure(String value) {
            this.deliveryProcedure = value;
        }

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

        /**
         * Gets the value of the guarantee property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationOKType.CompetitiveDocumentProvisioning.Guarantee }
         *     
         */
        public NotificationOKType.CompetitiveDocumentProvisioning.Guarantee getGuarantee() {
            return guarantee;
        }

        /**
         * Sets the value of the guarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationOKType.CompetitiveDocumentProvisioning.Guarantee }
         *     
         */
        public void setGuarantee(NotificationOKType.CompetitiveDocumentProvisioning.Guarantee value) {
            this.guarantee = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}guaranteeType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Guarantee
            extends GuaranteeType
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
     *       &lt;sequence>
     *         &lt;element name="lot" maxOccurs="unbounded">
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
     *                   &lt;element name="ordinalNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
     *                                       &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
     *                                       &lt;element name="guaranteeApp" minOccurs="0">
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
     *                                       &lt;element name="quantityContractsPnir" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
     *                   &lt;element name="priceNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="maxPriceInPercents" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="maxPriceItem" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        protected List<NotificationOKType.Lots.Lot> lot;

        /**
         * Gets the value of the lot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationOKType.Lots.Lot }
         * 
         * 
         */
        public List<NotificationOKType.Lots.Lot> getLot() {
            if (lot == null) {
                lot = new ArrayList<NotificationOKType.Lots.Lot>();
            }
            return this.lot;
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
         *         &lt;element name="ordinalNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
         *                             &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
         *                             &lt;element name="guaranteeApp" minOccurs="0">
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
         *                             &lt;element name="quantityContractsPnir" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
         *         &lt;element name="priceNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="maxPriceInPercents" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="maxPriceItem" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
            "priceNotSet",
            "maxPriceInPercents",
            "quantityUndefined",
            "maxPriceItem",
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
            protected NotificationOKType.Lots.Lot.NotificationFeatures notificationFeatures;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected NotificationOKType.Lots.Lot.CustomerRequirements customerRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected boolean priceNotSet;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Double maxPriceInPercents;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected boolean quantityUndefined;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Double maxPriceItem;
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
             *     {@link NotificationOKType.Lots.Lot.NotificationFeatures }
             *     
             */
            public NotificationOKType.Lots.Lot.NotificationFeatures getNotificationFeatures() {
                return notificationFeatures;
            }

            /**
             * Sets the value of the notificationFeatures property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationOKType.Lots.Lot.NotificationFeatures }
             *     
             */
            public void setNotificationFeatures(NotificationOKType.Lots.Lot.NotificationFeatures value) {
                this.notificationFeatures = value;
            }

            /**
             * Gets the value of the customerRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationOKType.Lots.Lot.CustomerRequirements }
             *     
             */
            public NotificationOKType.Lots.Lot.CustomerRequirements getCustomerRequirements() {
                return customerRequirements;
            }

            /**
             * Sets the value of the customerRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationOKType.Lots.Lot.CustomerRequirements }
             *     
             */
            public void setCustomerRequirements(NotificationOKType.Lots.Lot.CustomerRequirements value) {
                this.customerRequirements = value;
            }

            /**
             * Gets the value of the priceNotSet property.
             * 
             */
            public boolean isPriceNotSet() {
                return priceNotSet;
            }

            /**
             * Sets the value of the priceNotSet property.
             * 
             */
            public void setPriceNotSet(boolean value) {
                this.priceNotSet = value;
            }

            /**
             * Gets the value of the maxPriceInPercents property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaxPriceInPercents() {
                return maxPriceInPercents;
            }

            /**
             * Sets the value of the maxPriceInPercents property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaxPriceInPercents(Double value) {
                this.maxPriceInPercents = value;
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
             * Gets the value of the maxPriceItem property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaxPriceItem() {
                return maxPriceItem;
            }

            /**
             * Sets the value of the maxPriceItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaxPriceItem(Double value) {
                this.maxPriceItem = value;
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
             *                   &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
             *                   &lt;element name="guaranteeApp" minOccurs="0">
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
             *                   &lt;element name="quantityContractsPnir" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                protected List<NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement> customerRequirement;

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
                 * {@link NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement }
                 * 
                 * 
                 */
                public List<NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement> getCustomerRequirement() {
                    if (customerRequirement == null) {
                        customerRequirement = new ArrayList<NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement>();
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
                 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                 *         &lt;element name="guaranteeApp" minOccurs="0">
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
                 *         &lt;element name="quantityContractsPnir" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                    "quantityContractsPnir",
                    "kbk",
                    "tenderPlanInfo"
                })
                public static class CustomerRequirement {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Long sid;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String quantity;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double maxPrice;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected OrganizationRef customer;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String deliveryPlace;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String deliveryTerm;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp guaranteeApp;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract guaranteeContract;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String additionalInfo;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Long quantityContractsPnir;
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
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getMaxPrice() {
                        return maxPrice;
                    }

                    /**
                     * Sets the value of the maxPrice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setMaxPrice(Double value) {
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
                     *     {@link NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp }
                     *     
                     */
                    public NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp getGuaranteeApp() {
                        return guaranteeApp;
                    }

                    /**
                     * Sets the value of the guaranteeApp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp }
                     *     
                     */
                    public void setGuaranteeApp(NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp value) {
                        this.guaranteeApp = value;
                    }

                    /**
                     * Gets the value of the guaranteeContract property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract }
                     *     
                     */
                    public NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract getGuaranteeContract() {
                        return guaranteeContract;
                    }

                    /**
                     * Sets the value of the guaranteeContract property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract }
                     *     
                     */
                    public void setGuaranteeContract(NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract value) {
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
                     * Gets the value of the quantityContractsPnir property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getQuantityContractsPnir() {
                        return quantityContractsPnir;
                    }

                    /**
                     * Sets the value of the quantityContractsPnir property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setQuantityContractsPnir(Long value) {
                        this.quantityContractsPnir = value;
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
     *         &lt;element name="p1Place">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="p2Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="p2Place">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="p3Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="p3Place">
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
        "p1Date",
        "p1Place",
        "p2Date",
        "p2Place",
        "p3Date",
        "p3Place"
    })
    public static class NotificationCommission {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar p1Date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String p1Place;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar p2Date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String p2Place;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar p3Date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String p3Place;

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

        /**
         * Gets the value of the p3Place property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getP3Place() {
            return p3Place;
        }

        /**
         * Sets the value of the p3Place property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setP3Place(String value) {
            this.p3Place = value;
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
     *         &lt;group ref="{http://zakupki.gov.ru/oos/types/1}delivery" minOccurs="0"/>
     *         &lt;element name="additionalInfo" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="guaranteeApp" type="{http://zakupki.gov.ru/oos/types/1}guaranteeAppType" minOccurs="0"/>
     *         &lt;element name="guaranteeContract" type="{http://zakupki.gov.ru/oos/types/1}guaranteeContractType" minOccurs="0"/>
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
        "deliveryTerm",
        "deliveryPlace",
        "additionalInfo",
        "guaranteeApp",
        "guaranteeContract",
        "notificationFeatures"
    })
    public static class NotificationPlacement {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String deliveryTerm;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String deliveryPlace;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String additionalInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected GuaranteeAppType guaranteeApp;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected GuaranteeContractType guaranteeContract;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected NotificationOKType.NotificationPlacement.NotificationFeatures notificationFeatures;

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
         * Gets the value of the guaranteeApp property.
         * 
         * @return
         *     possible object is
         *     {@link GuaranteeAppType }
         *     
         */
        public GuaranteeAppType getGuaranteeApp() {
            return guaranteeApp;
        }

        /**
         * Sets the value of the guaranteeApp property.
         * 
         * @param value
         *     allowed object is
         *     {@link GuaranteeAppType }
         *     
         */
        public void setGuaranteeApp(GuaranteeAppType value) {
            this.guaranteeApp = value;
        }

        /**
         * Gets the value of the guaranteeContract property.
         * 
         * @return
         *     possible object is
         *     {@link GuaranteeContractType }
         *     
         */
        public GuaranteeContractType getGuaranteeContract() {
            return guaranteeContract;
        }

        /**
         * Sets the value of the guaranteeContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link GuaranteeContractType }
         *     
         */
        public void setGuaranteeContract(GuaranteeContractType value) {
            this.guaranteeContract = value;
        }

        /**
         * Gets the value of the notificationFeatures property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationOKType.NotificationPlacement.NotificationFeatures }
         *     
         */
        public NotificationOKType.NotificationPlacement.NotificationFeatures getNotificationFeatures() {
            return notificationFeatures;
        }

        /**
         * Sets the value of the notificationFeatures property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationOKType.NotificationPlacement.NotificationFeatures }
         *     
         */
        public void setNotificationFeatures(NotificationOKType.NotificationPlacement.NotificationFeatures value) {
            this.notificationFeatures = value;
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
