
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Предмет жалобы по 44-ФЗ
 * 
 * <p>Java class for zfcs_complaintObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
 *         &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
 *         &lt;element name="sketchPlan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="planDescription">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="yearPlan">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tenderPlan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="description">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
@XmlType(name = "zfcs_complaintObjectType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "purchase",
    "order",
    "sketchPlan",
    "tenderPlan"
})
public class ZfcsComplaintObjectType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsComplaintPurchaseType purchase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsComplaintOrderType order;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsComplaintObjectType.SketchPlan sketchPlan;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsComplaintObjectType.TenderPlan tenderPlan;

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintPurchaseType }
     *     
     */
    public ZfcsComplaintPurchaseType getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintPurchaseType }
     *     
     */
    public void setPurchase(ZfcsComplaintPurchaseType value) {
        this.purchase = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintOrderType }
     *     
     */
    public ZfcsComplaintOrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintOrderType }
     *     
     */
    public void setOrder(ZfcsComplaintOrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the sketchPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintObjectType.SketchPlan }
     *     
     */
    public ZfcsComplaintObjectType.SketchPlan getSketchPlan() {
        return sketchPlan;
    }

    /**
     * Sets the value of the sketchPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintObjectType.SketchPlan }
     *     
     */
    public void setSketchPlan(ZfcsComplaintObjectType.SketchPlan value) {
        this.sketchPlan = value;
    }

    /**
     * Gets the value of the tenderPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintObjectType.TenderPlan }
     *     
     */
    public ZfcsComplaintObjectType.TenderPlan getTenderPlan() {
        return tenderPlan;
    }

    /**
     * Sets the value of the tenderPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintObjectType.TenderPlan }
     *     
     */
    public void setTenderPlan(ZfcsComplaintObjectType.TenderPlan value) {
        this.tenderPlan = value;
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
     *         &lt;element name="planDescription">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="yearPlan">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
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
        "planDescription",
        "yearPlan"
    })
    public static class SketchPlan {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String planDescription;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int yearPlan;

        /**
         * Gets the value of the planDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanDescription() {
            return planDescription;
        }

        /**
         * Sets the value of the planDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanDescription(String value) {
            this.planDescription = value;
        }

        /**
         * Gets the value of the yearPlan property.
         * 
         */
        public int getYearPlan() {
            return yearPlan;
        }

        /**
         * Sets the value of the yearPlan property.
         * 
         */
        public void setYearPlan(int value) {
            this.yearPlan = value;
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
     *         &lt;element name="description">
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
        "description"
    })
    public static class TenderPlan {

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
