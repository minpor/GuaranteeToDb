
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * План исполнения контракта за счет бюджетных средств
 * 
 * <p>Java class for zfcs_budgetFinancingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_budgetFinancingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetFinancing" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="kbkCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
 *                     &lt;element name="kbkCode2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
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
@XmlType(name = "zfcs_budgetFinancingsType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "budgetFinancing",
    "totalSum"
})
public class ZfcsBudgetFinancingsType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsBudgetFinancingsType.BudgetFinancing> budgetFinancing;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String totalSum;

    /**
     * Gets the value of the budgetFinancing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetFinancing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetFinancing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsBudgetFinancingsType.BudgetFinancing }
     * 
     * 
     */
    public List<ZfcsBudgetFinancingsType.BudgetFinancing> getBudgetFinancing() {
        if (budgetFinancing == null) {
            budgetFinancing = new ArrayList<ZfcsBudgetFinancingsType.BudgetFinancing>();
        }
        return this.budgetFinancing;
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
     *           &lt;element name="kbkCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
     *           &lt;element name="kbkCode2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
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
        "kbkCode",
        "kbkCode2016",
        "year",
        "sum"
    })
    public static class BudgetFinancing {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String kbkCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String kbkCode2016;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int year;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String sum;

        /**
         * Gets the value of the kbkCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKbkCode() {
            return kbkCode;
        }

        /**
         * Sets the value of the kbkCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKbkCode(String value) {
            this.kbkCode = value;
        }

        /**
         * Gets the value of the kbkCode2016 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKbkCode2016() {
            return kbkCode2016;
        }

        /**
         * Sets the value of the kbkCode2016 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKbkCode2016(String value) {
            this.kbkCode2016 = value;
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
