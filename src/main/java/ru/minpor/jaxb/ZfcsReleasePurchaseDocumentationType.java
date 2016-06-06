
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о предоставлении конкурсной\аукционной документации
 * 
 * <p>Java class for zfcs_releasePurchaseDocumentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_releasePurchaseDocumentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grantStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="grantPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="grantOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="languages" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="grantMeans" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="grantEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="payCurrency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *         &lt;element name="payInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="payCurrency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "zfcs_releasePurchaseDocumentationType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "grantStartDate",
    "grantPlace",
    "grantOrder",
    "languages",
    "grantMeans",
    "grantEndDate",
    "payCurrency",
    "payInfo"
})
public class ZfcsReleasePurchaseDocumentationType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar grantStartDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String grantPlace;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String grantOrder;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String languages;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String grantMeans;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar grantEndDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCurrencyRef payCurrency;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsReleasePurchaseDocumentationType.PayInfo payInfo;

    /**
     * Gets the value of the grantStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGrantStartDate() {
        return grantStartDate;
    }

    /**
     * Sets the value of the grantStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGrantStartDate(XMLGregorianCalendar value) {
        this.grantStartDate = value;
    }

    /**
     * Gets the value of the grantPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantPlace() {
        return grantPlace;
    }

    /**
     * Sets the value of the grantPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantPlace(String value) {
        this.grantPlace = value;
    }

    /**
     * Gets the value of the grantOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantOrder() {
        return grantOrder;
    }

    /**
     * Sets the value of the grantOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantOrder(String value) {
        this.grantOrder = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguages(String value) {
        this.languages = value;
    }

    /**
     * Gets the value of the grantMeans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantMeans() {
        return grantMeans;
    }

    /**
     * Sets the value of the grantMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantMeans(String value) {
        this.grantMeans = value;
    }

    /**
     * Gets the value of the grantEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGrantEndDate() {
        return grantEndDate;
    }

    /**
     * Sets the value of the grantEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGrantEndDate(XMLGregorianCalendar value) {
        this.grantEndDate = value;
    }

    /**
     * Gets the value of the payCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public ZfcsCurrencyRef getPayCurrency() {
        return payCurrency;
    }

    /**
     * Sets the value of the payCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public void setPayCurrency(ZfcsCurrencyRef value) {
        this.payCurrency = value;
    }

    /**
     * Gets the value of the payInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsReleasePurchaseDocumentationType.PayInfo }
     *     
     */
    public ZfcsReleasePurchaseDocumentationType.PayInfo getPayInfo() {
        return payInfo;
    }

    /**
     * Sets the value of the payInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsReleasePurchaseDocumentationType.PayInfo }
     *     
     */
    public void setPayInfo(ZfcsReleasePurchaseDocumentationType.PayInfo value) {
        this.payInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType">
     *       &lt;sequence>
     *         &lt;element name="payCurrency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "payCurrency"
    })
    public static class PayInfo
        extends ZfcsPaymentInfoType
    {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsCurrencyRef payCurrency;

        /**
         * Gets the value of the payCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCurrencyRef }
         *     
         */
        public ZfcsCurrencyRef getPayCurrency() {
            return payCurrency;
        }

        /**
         * Sets the value of the payCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCurrencyRef }
         *     
         */
        public void setPayCurrency(ZfcsCurrencyRef value) {
            this.payCurrency = value;
        }

    }

}
