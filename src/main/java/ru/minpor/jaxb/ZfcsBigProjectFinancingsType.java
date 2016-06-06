
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Источники и объемы финансирования инвестиционного проекта в ценах соответствующих лет
 * 
 * <p>Java class for zfcs_bigProjectFinancingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bigProjectFinancingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sources">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="federal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="region" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="self" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="nonbudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_bigProjectFinancingsType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "sources",
    "cost"
})
public class ZfcsBigProjectFinancingsType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsBigProjectFinancingsType.Sources sources;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String cost;

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBigProjectFinancingsType.Sources }
     *     
     */
    public ZfcsBigProjectFinancingsType.Sources getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBigProjectFinancingsType.Sources }
     *     
     */
    public void setSources(ZfcsBigProjectFinancingsType.Sources value) {
        this.sources = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="federal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="region" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="self" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="nonbudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
        "federal",
        "region",
        "self",
        "nonbudget"
    })
    public static class Sources {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String federal;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String region;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String self;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String nonbudget;

        /**
         * Gets the value of the federal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFederal() {
            return federal;
        }

        /**
         * Sets the value of the federal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFederal(String value) {
            this.federal = value;
        }

        /**
         * Gets the value of the region property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegion(String value) {
            this.region = value;
        }

        /**
         * Gets the value of the self property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelf() {
            return self;
        }

        /**
         * Sets the value of the self property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelf(String value) {
            this.self = value;
        }

        /**
         * Gets the value of the nonbudget property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonbudget() {
            return nonbudget;
        }

        /**
         * Sets the value of the nonbudget property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonbudget(String value) {
            this.nonbudget = value;
        }

    }

}
