
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Права организаций на осуществление закупок от имени других организаций
 * 
 * <p>Java class for zfcs_nsiOrganizationRightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiOrganizationRightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_spzNumType"/>
 *         &lt;element name="organizationLinks">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organizationLink" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationLink" maxOccurs="unbounded"/>
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
@XmlType(name = "zfcs_nsiOrganizationRightsType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "regNumber",
    "organizationLinks"
})
public class ZfcsNsiOrganizationRightsType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String regNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNsiOrganizationRightsType.OrganizationLinks organizationLinks;

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the organizationLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiOrganizationRightsType.OrganizationLinks }
     *     
     */
    public ZfcsNsiOrganizationRightsType.OrganizationLinks getOrganizationLinks() {
        return organizationLinks;
    }

    /**
     * Sets the value of the organizationLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiOrganizationRightsType.OrganizationLinks }
     *     
     */
    public void setOrganizationLinks(ZfcsNsiOrganizationRightsType.OrganizationLinks value) {
        this.organizationLinks = value;
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
     *         &lt;element name="organizationLink" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationLink" maxOccurs="unbounded"/>
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
        "organizationLink"
    })
    public static class OrganizationLinks {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsOrganizationLink> organizationLink;

        /**
         * Gets the value of the organizationLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organizationLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganizationLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsOrganizationLink }
         * 
         * 
         */
        public List<ZfcsOrganizationLink> getOrganizationLink() {
            if (organizationLink == null) {
                organizationLink = new ArrayList<ZfcsOrganizationLink>();
            }
            return this.organizationLink;
        }

    }

}
