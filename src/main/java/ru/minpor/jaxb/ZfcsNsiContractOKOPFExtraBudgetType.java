
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Справочник: Соответствие ОКОПФ видам внебюджетных средств
 * 
 * <p>Java class for zfcs_nsiContractOKOPFExtraBudgetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiContractOKOPFExtraBudgetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extrabudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extraBudgetFundsContract2015"/>
 *         &lt;element name="legalFormOld" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="singularName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType">
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legalFormNew" type="{http://zakupki.gov.ru/oos/types/1}okopfType" minOccurs="0"/>
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
@XmlType(name = "zfcs_nsiContractOKOPFExtraBudgetType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "extrabudget",
    "legalFormOld",
    "legalFormNew",
    "actual"
})
public class ZfcsNsiContractOKOPFExtraBudgetType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsExtraBudgetFundsContract2015 extrabudget;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNsiContractOKOPFExtraBudgetType.LegalFormOld legalFormOld;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected OkopfType legalFormNew;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean actual;

    /**
     * Gets the value of the extrabudget property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtraBudgetFundsContract2015 }
     *     
     */
    public ZfcsExtraBudgetFundsContract2015 getExtrabudget() {
        return extrabudget;
    }

    /**
     * Sets the value of the extrabudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtraBudgetFundsContract2015 }
     *     
     */
    public void setExtrabudget(ZfcsExtraBudgetFundsContract2015 value) {
        this.extrabudget = value;
    }

    /**
     * Gets the value of the legalFormOld property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiContractOKOPFExtraBudgetType.LegalFormOld }
     *     
     */
    public ZfcsNsiContractOKOPFExtraBudgetType.LegalFormOld getLegalFormOld() {
        return legalFormOld;
    }

    /**
     * Sets the value of the legalFormOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiContractOKOPFExtraBudgetType.LegalFormOld }
     *     
     */
    public void setLegalFormOld(ZfcsNsiContractOKOPFExtraBudgetType.LegalFormOld value) {
        this.legalFormOld = value;
    }

    /**
     * Gets the value of the legalFormNew property.
     * 
     * @return
     *     possible object is
     *     {@link OkopfType }
     *     
     */
    public OkopfType getLegalFormNew() {
        return legalFormNew;
    }

    /**
     * Sets the value of the legalFormNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkopfType }
     *     
     */
    public void setLegalFormNew(OkopfType value) {
        this.legalFormNew = value;
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
     *         &lt;element name="code">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="singularName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType">
     *               &lt;minLength value="1"/>
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
        "code",
        "singularName"
    })
    public static class LegalFormOld {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String code;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String singularName;

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
         * Gets the value of the singularName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingularName() {
            return singularName;
        }

        /**
         * Sets the value of the singularName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingularName(String value) {
            this.singularName = value;
        }

    }

}
