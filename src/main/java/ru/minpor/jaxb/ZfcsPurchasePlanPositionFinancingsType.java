
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Суммы финансового обеспечения позиции плана закупок по КБК или КВР
 * 
 * <p>Java class for zfcs_purchasePlanPositionFinancingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanPositionFinancingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="KVR" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
 *                   &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="KBK" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
 *                   &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
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
@XmlType(name = "zfcs_purchasePlanPositionFinancingsType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "kvr",
    "kbk"
})
public class ZfcsPurchasePlanPositionFinancingsType {

    @XmlElement(name = "KVR", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected List<ZfcsPurchasePlanPositionFinancingsType.KVR> kvr;
    @XmlElement(name = "KBK", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected List<ZfcsPurchasePlanPositionFinancingsType.KBK> kbk;

    /**
     * Gets the value of the kvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKVR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsPurchasePlanPositionFinancingsType.KVR }
     * 
     * 
     */
    public List<ZfcsPurchasePlanPositionFinancingsType.KVR> getKVR() {
        if (kvr == null) {
            kvr = new ArrayList<ZfcsPurchasePlanPositionFinancingsType.KVR>();
        }
        return this.kvr;
    }

    /**
     * Gets the value of the kbk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kbk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKBK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsPurchasePlanPositionFinancingsType.KBK }
     * 
     * 
     */
    public List<ZfcsPurchasePlanPositionFinancingsType.KBK> getKBK() {
        if (kbk == null) {
            kbk = new ArrayList<ZfcsPurchasePlanPositionFinancingsType.KBK>();
        }
        return this.kbk;
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
     *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
     *         &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
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
        "amounts"
    })
    public static class KBK {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsFinanceResourcesType amounts;

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
         * Gets the value of the amounts property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public ZfcsFinanceResourcesType getAmounts() {
            return amounts;
        }

        /**
         * Sets the value of the amounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public void setAmounts(ZfcsFinanceResourcesType value) {
            this.amounts = value;
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
     *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
     *         &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
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
        "amounts"
    })
    public static class KVR {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsFinanceResourcesType amounts;

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
         * Gets the value of the amounts property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public ZfcsFinanceResourcesType getAmounts() {
            return amounts;
        }

        /**
         * Sets the value of the amounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public void setAmounts(ZfcsFinanceResourcesType value) {
            this.amounts = value;
        }

    }

}
