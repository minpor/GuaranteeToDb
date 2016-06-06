
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Источники и объемы финансирования этапа инвестиционного проекта 
 * 
 * <p>Java class for zfcs_bigProjectFinancingYearsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bigProjectFinancingYearsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingsType"/>
 *         &lt;element name="year" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="financing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingsType"/>
 *                   &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
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
@XmlType(name = "zfcs_bigProjectFinancingYearsType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "total",
    "year"
})
public class ZfcsBigProjectFinancingYearsType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsBigProjectFinancingsType total;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsBigProjectFinancingYearsType.Year> year;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBigProjectFinancingsType }
     *     
     */
    public ZfcsBigProjectFinancingsType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBigProjectFinancingsType }
     *     
     */
    public void setTotal(ZfcsBigProjectFinancingsType value) {
        this.total = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the year property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsBigProjectFinancingYearsType.Year }
     * 
     * 
     */
    public List<ZfcsBigProjectFinancingYearsType.Year> getYear() {
        if (year == null) {
            year = new ArrayList<ZfcsBigProjectFinancingYearsType.Year>();
        }
        return this.year;
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
     *         &lt;element name="financing" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bigProjectFinancingsType"/>
     *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
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
        "financing",
        "year"
    })
    public static class Year {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsBigProjectFinancingsType financing;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int year;

        /**
         * Gets the value of the financing property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBigProjectFinancingsType }
         *     
         */
        public ZfcsBigProjectFinancingsType getFinancing() {
            return financing;
        }

        /**
         * Sets the value of the financing property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBigProjectFinancingsType }
         *     
         */
        public void setFinancing(ZfcsBigProjectFinancingsType value) {
            this.financing = value;
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

    }

}
