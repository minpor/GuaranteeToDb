
package ru.minpor.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о лоте для способа по статье 111 ФЗ № 44
 * 
 * <p>Java class for zfcs_lotI111Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_lotI111Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *         &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef" maxOccurs="unbounded"/>
 *         &lt;element name="preferenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="requirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="publicDiscussion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionType" minOccurs="0"/>
 *         &lt;element name="maxCostDefinitionOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_lotI111Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "lotNumber",
    "maxPrice",
    "currency",
    "okpd2",
    "preferenses",
    "requirements",
    "addInfo",
    "publicDiscussion",
    "maxCostDefinitionOrder"
})
public class ZfcsLotI111Type {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lotNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String maxPrice;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCurrencyRef currency;
    @XmlElement(name = "OKPD2", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsOKPDRef> okpd2;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsLotI111Type.Preferenses preferenses;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsLotI111Type.Requirements requirements;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String addInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPublicDiscussionType publicDiscussion;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String maxCostDefinitionOrder;

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLotNumber(BigInteger value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrice(String value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public ZfcsCurrencyRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public void setCurrency(ZfcsCurrencyRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the okpd2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okpd2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOKPD2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsOKPDRef }
     * 
     * 
     */
    public List<ZfcsOKPDRef> getOKPD2() {
        if (okpd2 == null) {
            okpd2 = new ArrayList<ZfcsOKPDRef>();
        }
        return this.okpd2;
    }

    /**
     * Gets the value of the preferenses property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotI111Type.Preferenses }
     *     
     */
    public ZfcsLotI111Type.Preferenses getPreferenses() {
        return preferenses;
    }

    /**
     * Sets the value of the preferenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotI111Type.Preferenses }
     *     
     */
    public void setPreferenses(ZfcsLotI111Type.Preferenses value) {
        this.preferenses = value;
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotI111Type.Requirements }
     *     
     */
    public ZfcsLotI111Type.Requirements getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotI111Type.Requirements }
     *     
     */
    public void setRequirements(ZfcsLotI111Type.Requirements value) {
        this.requirements = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the publicDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionType }
     *     
     */
    public ZfcsPublicDiscussionType getPublicDiscussion() {
        return publicDiscussion;
    }

    /**
     * Sets the value of the publicDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionType }
     *     
     */
    public void setPublicDiscussion(ZfcsPublicDiscussionType value) {
        this.publicDiscussion = value;
    }

    /**
     * Gets the value of the maxCostDefinitionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCostDefinitionOrder() {
        return maxCostDefinitionOrder;
    }

    /**
     * Sets the value of the maxCostDefinitionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCostDefinitionOrder(String value) {
        this.maxCostDefinitionOrder = value;
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
     *         &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
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
        "preferense"
    })
    public static class Preferenses {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsPreferenseType> preferense;

        /**
         * Gets the value of the preferense property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preferense property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreferense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPreferenseType }
         * 
         * 
         */
        public List<ZfcsPreferenseType> getPreferense() {
            if (preferense == null) {
                preferense = new ArrayList<ZfcsPreferenseType>();
            }
            return this.preferense;
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
     *         &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
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
        "requirement"
    })
    public static class Requirements {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsRequirementType> requirement;

        /**
         * Gets the value of the requirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsRequirementType }
         * 
         * 
         */
        public List<ZfcsRequirementType> getRequirement() {
            if (requirement == null) {
                requirement = new ArrayList<ZfcsRequirementType>();
            }
            return this.requirement;
        }

    }

}
