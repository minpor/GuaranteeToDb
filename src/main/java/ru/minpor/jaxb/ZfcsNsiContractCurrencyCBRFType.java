
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Справочник: Список валют, курс на которые устанавливается ЦБ РФ
 * 
 * <p>Java class for zfcs_nsiContractCurrencyCBRFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiContractCurrencyCBRFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyFullRef"/>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiContractCurrencyCBRFType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "currency",
    "actual"
})
public class ZfcsNsiContractCurrencyCBRFType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCurrencyFullRef currency;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean actual;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCurrencyFullRef }
     *     
     */
    public ZfcsCurrencyFullRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCurrencyFullRef }
     *     
     */
    public void setCurrency(ZfcsCurrencyFullRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     */
    public boolean isActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     */
    public void setActual(boolean value) {
        this.actual = value;
    }

}
