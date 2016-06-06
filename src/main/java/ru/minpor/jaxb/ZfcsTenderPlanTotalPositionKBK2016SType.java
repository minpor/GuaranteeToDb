
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Итоговые суммы в разбивке по КБК 2016
 * 
 * <p>Java class for zfcs_tenderPlanTotalPositionKBK2016sType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlanTotalPositionKBK2016sType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KBK2016" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
 *                   &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
@XmlType(name = "zfcs_tenderPlanTotalPositionKBK2016sType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "kbk2016"
})
public class ZfcsTenderPlanTotalPositionKBK2016SType {

    @XmlElement(name = "KBK2016", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsTenderPlanTotalPositionKBK2016SType.KBK2016> kbk2016;

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
     * {@link ZfcsTenderPlanTotalPositionKBK2016SType.KBK2016 }
     * 
     * 
     */
    public List<ZfcsTenderPlanTotalPositionKBK2016SType.KBK2016> getKBK2016() {
        if (kbk2016 == null) {
            kbk2016 = new ArrayList<ZfcsTenderPlanTotalPositionKBK2016SType.KBK2016>();
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
     *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
        "amount"
    })
    public static class KBK2016 {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String amount;

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
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
            this.amount = value;
        }

    }

}
