
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Суммы в разбивке по КБК 2016 и по годам
 * 
 * <p>Java class for zfcs_PositionKBK2016sYearsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_PositionKBK2016sYearsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KBK2016" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
 *                   &lt;element name="yearsList" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                             &lt;element name="yearAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
@XmlType(name = "zfcs_PositionKBK2016sYearsType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "kbk2016"
})
public class ZfcsPositionKBK2016SYearsType {

    @XmlElement(name = "KBK2016", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsPositionKBK2016SYearsType.KBK2016> kbk2016;

    /**
     * Gets the value of the kbk2016 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kbk2016 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKBK2016().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsPositionKBK2016SYearsType.KBK2016 }
     * 
     * 
     */
    public List<ZfcsPositionKBK2016SYearsType.KBK2016> getKBK2016() {
        if (kbk2016 == null) {
            kbk2016 = new ArrayList<ZfcsPositionKBK2016SYearsType.KBK2016>();
        }
        return this.kbk2016;
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
     *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
     *         &lt;element name="yearsList" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                   &lt;element name="yearAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
        "code",
        "yearsList"
    })
    public static class KBK2016 {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<ZfcsPositionKBK2016SYearsType.KBK2016 .YearsList> yearsList;

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
         * Gets the value of the yearsList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the yearsList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getYearsList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPositionKBK2016SYearsType.KBK2016 .YearsList }
         * 
         * 
         */
        public List<ZfcsPositionKBK2016SYearsType.KBK2016 .YearsList> getYearsList() {
            if (yearsList == null) {
                yearsList = new ArrayList<ZfcsPositionKBK2016SYearsType.KBK2016 .YearsList>();
            }
            return this.yearsList;
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
         *         &lt;element name="yearAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
            "yearAmount"
        })
        public static class YearsList {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int year;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String yearAmount;

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
             * Gets the value of the yearAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYearAmount() {
                return yearAmount;
            }

            /**
             * Sets the value of the yearAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYearAmount(String value) {
                this.yearAmount = value;
            }

        }

    }

}
