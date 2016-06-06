
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Места доставки ТРУ по КЛАДР
 * 
 * <p>Java class for zfcs_kladrPlacesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_kladrPlacesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kladrPlace" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="kladr" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType"/>
 *                     &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="noKladrForRegionSettlement" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="region" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="settlement" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_kladrPlacesType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "kladrPlace"
})
public class ZfcsKladrPlacesType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsKladrPlacesType.KladrPlace> kladrPlace;

    /**
     * Gets the value of the kladrPlace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kladrPlace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKladrPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsKladrPlacesType.KladrPlace }
     * 
     * 
     */
    public List<ZfcsKladrPlacesType.KladrPlace> getKladrPlace() {
        if (kladrPlace == null) {
            kladrPlace = new ArrayList<ZfcsKladrPlacesType.KladrPlace>();
        }
        return this.kladrPlace;
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
     *         &lt;choice minOccurs="0">
     *           &lt;element name="kladr" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrType"/>
     *           &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
     *         &lt;/choice>
     *         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="noKladrForRegionSettlement" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="region" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="settlement" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
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
        "kladr",
        "country",
        "deliveryPlace",
        "noKladrForRegionSettlement"
    })
    public static class KladrPlace {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsKladrType kladr;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCountryRef country;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String deliveryPlace;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsKladrPlacesType.KladrPlace.NoKladrForRegionSettlement noKladrForRegionSettlement;

        /**
         * Gets the value of the kladr property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsKladrType }
         *     
         */
        public ZfcsKladrType getKladr() {
            return kladr;
        }

        /**
         * Sets the value of the kladr property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsKladrType }
         *     
         */
        public void setKladr(ZfcsKladrType value) {
            this.kladr = value;
        }

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
         * Gets the value of the noKladrForRegionSettlement property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsKladrPlacesType.KladrPlace.NoKladrForRegionSettlement }
         *     
         */
        public ZfcsKladrPlacesType.KladrPlace.NoKladrForRegionSettlement getNoKladrForRegionSettlement() {
            return noKladrForRegionSettlement;
        }

        /**
         * Sets the value of the noKladrForRegionSettlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsKladrPlacesType.KladrPlace.NoKladrForRegionSettlement }
         *     
         */
        public void setNoKladrForRegionSettlement(ZfcsKladrPlacesType.KladrPlace.NoKladrForRegionSettlement value) {
            this.noKladrForRegionSettlement = value;
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
         *         &lt;element name="region" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="settlement" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
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
            "region",
            "settlement"
        })
        public static class NoKladrForRegionSettlement {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String region;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String settlement;

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
             * Gets the value of the settlement property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSettlement() {
                return settlement;
            }

            /**
             * Sets the value of the settlement property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSettlement(String value) {
                this.settlement = value;
            }

        }

    }

}
