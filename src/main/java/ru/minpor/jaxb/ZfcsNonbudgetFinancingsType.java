
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * План исполнения контракта за счет внебюджетных средств
 * 
 * <p>Java class for zfcs_nonbudgetFinancingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nonbudgetFinancingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nonbudgetFinancing" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="kosguCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kosguType"/>
 *                     &lt;element name="kvrCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
 *                   &lt;/choice>
 *                   &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                   &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nonbudgetFinancingsType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "nonbudgetFinancing",
    "totalSum"
})
public class ZfcsNonbudgetFinancingsType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsNonbudgetFinancingsType.NonbudgetFinancing> nonbudgetFinancing;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String totalSum;

    /**
     * Gets the value of the nonbudgetFinancing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonbudgetFinancing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonbudgetFinancing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsNonbudgetFinancingsType.NonbudgetFinancing }
     * 
     * 
     */
    public List<ZfcsNonbudgetFinancingsType.NonbudgetFinancing> getNonbudgetFinancing() {
        if (nonbudgetFinancing == null) {
            nonbudgetFinancing = new ArrayList<ZfcsNonbudgetFinancingsType.NonbudgetFinancing>();
        }
        return this.nonbudgetFinancing;
    }

    /**
     * Gets the value of the totalSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSum() {
        return totalSum;
    }

    /**
     * Sets the value of the totalSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSum(String value) {
        this.totalSum = value;
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
     *           &lt;element name="kosguCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kosguType"/>
     *           &lt;element name="kvrCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
     *         &lt;/choice>
     *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
        "kosguCode",
        "kvrCode",
        "year",
        "sum"
    })
    public static class NonbudgetFinancing {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String kosguCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String kvrCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int year;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String sum;

        /**
         * Gets the value of the kosguCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKosguCode() {
            return kosguCode;
        }

        /**
         * Sets the value of the kosguCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKosguCode(String value) {
            this.kosguCode = value;
        }

        /**
         * Gets the value of the kvrCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKvrCode() {
            return kvrCode;
        }

        /**
         * Sets the value of the kvrCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKvrCode(String value) {
            this.kvrCode = value;
        }

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

    }

}
