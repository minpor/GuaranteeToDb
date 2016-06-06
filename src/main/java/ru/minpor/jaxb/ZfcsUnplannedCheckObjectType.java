
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о предмете плановой проверки (заказ, закупка)
 * 
 * <p>Java class for zfcs_unplannedCheckObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_unplannedCheckObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="order">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationNumberType94"/>
 *                   &lt;element name="lots" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
 *         &lt;element name="purchase">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                   &lt;element name="lots" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
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
@XmlType(name = "zfcs_unplannedCheckObjectType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "order",
    "purchase"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ZfcsCheckResultType.Base.PlannedCheck.Orders.class
})
public class ZfcsUnplannedCheckObjectType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsUnplannedCheckObjectType.Order order;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsUnplannedCheckObjectType.Purchase purchase;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckObjectType.Order }
     *     
     */
    public ZfcsUnplannedCheckObjectType.Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckObjectType.Order }
     *     
     */
    public void setOrder(ZfcsUnplannedCheckObjectType.Order value) {
        this.order = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckObjectType.Purchase }
     *     
     */
    public ZfcsUnplannedCheckObjectType.Purchase getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckObjectType.Purchase }
     *     
     */
    public void setPurchase(ZfcsUnplannedCheckObjectType.Purchase value) {
        this.purchase = value;
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
     *         &lt;element name="lots" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "notificationNumber",
        "lots"
    })
    public static class Order {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String notificationNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsUnplannedCheckObjectType.Order.Lots lots;

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
         * Gets the value of the lots property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedCheckObjectType.Order.Lots }
         *     
         */
        public ZfcsUnplannedCheckObjectType.Order.Lots getLots() {
            return lots;
        }

        /**
         * Sets the value of the lots property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedCheckObjectType.Order.Lots }
         *     
         */
        public void setLots(ZfcsUnplannedCheckObjectType.Order.Lots value) {
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
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
            "lotNumber",
            "info"
        })
        public static class Lots {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", type = Integer.class)
            protected List<Integer> lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String info;

            /**
             * Gets the value of the lotNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lotNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLotNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getLotNumber() {
                if (lotNumber == null) {
                    lotNumber = new ArrayList<Integer>();
                }
                return this.lotNumber;
            }

            /**
             * Gets the value of the info property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfo() {
                return info;
            }

            /**
             * Sets the value of the info property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfo(String value) {
                this.info = value;
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
     *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *         &lt;element name="lots" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
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
        "lots",
        "purchaseCode"
    })
    public static class Purchase {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String purchaseNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsUnplannedCheckObjectType.Purchase.Lots lots;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String purchaseCode;

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
         * Gets the value of the lots property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedCheckObjectType.Purchase.Lots }
         *     
         */
        public ZfcsUnplannedCheckObjectType.Purchase.Lots getLots() {
            return lots;
        }

        /**
         * Sets the value of the lots property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedCheckObjectType.Purchase.Lots }
         *     
         */
        public void setLots(ZfcsUnplannedCheckObjectType.Purchase.Lots value) {
            this.lots = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
            "lotNumber",
            "info"
        })
        public static class Lots {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", type = Integer.class)
            protected List<Integer> lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String info;

            /**
             * Gets the value of the lotNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lotNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLotNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getLotNumber() {
                if (lotNumber == null) {
                    lotNumber = new ArrayList<Integer>();
                }
                return this.lotNumber;
            }

            /**
             * Gets the value of the info property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfo() {
                return info;
            }

            /**
             * Sets the value of the info property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfo(String value) {
                this.info = value;
            }

        }

    }

}
