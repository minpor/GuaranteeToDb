
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Комиссии по размещению заказа (определению поставщика)
 * 
 * <p>Java class for zfcs_commissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_commissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="commissionMembers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commissionMember" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="spelledMembersNoVoteCount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="spelledMembersCount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="competent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_commissionType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commissionName",
    "commissionMembers",
    "competent",
    "addInfo"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ZfcsInfoProtocolZKBIType.Commission.class
})
public class ZfcsCommissionType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String commissionName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCommissionType.CommissionMembers commissionMembers;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean competent;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String addInfo;

    /**
     * Gets the value of the commissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionName() {
        return commissionName;
    }

    /**
     * Sets the value of the commissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionName(String value) {
        this.commissionName = value;
    }

    /**
     * Gets the value of the commissionMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCommissionType.CommissionMembers }
     *     
     */
    public ZfcsCommissionType.CommissionMembers getCommissionMembers() {
        return commissionMembers;
    }

    /**
     * Sets the value of the commissionMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCommissionType.CommissionMembers }
     *     
     */
    public void setCommissionMembers(ZfcsCommissionType.CommissionMembers value) {
        this.commissionMembers = value;
    }

    /**
     * Gets the value of the competent property.
     * 
     */
    public boolean isCompetent() {
        return competent;
    }

    /**
     * Sets the value of the competent property.
     * 
     */
    public void setCompetent(boolean value) {
        this.competent = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="commissionMember" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="spelledMembersNoVoteCount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="spelledMembersCount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "commissionMember",
        "spelledMembersNoVoteCount",
        "spelledMembersCount"
    })
    public static class CommissionMembers {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsCommissionType.CommissionMembers.CommissionMember> commissionMember;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String spelledMembersNoVoteCount;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String spelledMembersCount;

        /**
         * Gets the value of the commissionMember property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commissionMember property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommissionMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCommissionType.CommissionMembers.CommissionMember }
         * 
         * 
         */
        public List<ZfcsCommissionType.CommissionMembers.CommissionMember> getCommissionMember() {
            if (commissionMember == null) {
                commissionMember = new ArrayList<ZfcsCommissionType.CommissionMembers.CommissionMember>();
            }
            return this.commissionMember;
        }

        /**
         * Gets the value of the spelledMembersNoVoteCount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpelledMembersNoVoteCount() {
            return spelledMembersNoVoteCount;
        }

        /**
         * Sets the value of the spelledMembersNoVoteCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpelledMembersNoVoteCount(String value) {
            this.spelledMembersNoVoteCount = value;
        }

        /**
         * Gets the value of the spelledMembersCount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpelledMembersCount() {
            return spelledMembersCount;
        }

        /**
         * Sets the value of the spelledMembersCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpelledMembersCount(String value) {
            this.spelledMembersCount = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionMemberType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CommissionMember
            extends ZfcsCommissionMemberType
        {


        }

    }

}
