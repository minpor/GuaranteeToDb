
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Подчиненные организации в праве осушествления закупок
 * 
 * <p>Java class for zfcs_organizationLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_organizationLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="activeUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="blockStatus" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationLinkBlockStatusType" minOccurs="0"/>
 *         &lt;element name="dependentOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="linkUsers" type="{http://zakupki.gov.ru/oos/types/1}zfcs_linkUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ordersVisibilityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_orgLinkOrdersVisibilityTypeEnum" minOccurs="0"/>
 *         &lt;element name="lastModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_organizationLink", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "activeUntil",
    "blockStatus",
    "dependentOrganization",
    "linkUsers",
    "ordersVisibilityType",
    "lastModifyDate"
})
public class ZfcsOrganizationLink {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeUntil;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsOrganizationLinkBlockStatusType blockStatus;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsOrganizationRef dependentOrganization;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", nillable = true)
    protected List<ZfcsLinkUser> linkUsers;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsOrgLinkOrdersVisibilityTypeEnum ordersVisibilityType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDate;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the activeUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveUntil() {
        return activeUntil;
    }

    /**
     * Sets the value of the activeUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveUntil(XMLGregorianCalendar value) {
        this.activeUntil = value;
    }

    /**
     * Gets the value of the blockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationLinkBlockStatusType }
     *     
     */
    public ZfcsOrganizationLinkBlockStatusType getBlockStatus() {
        return blockStatus;
    }

    /**
     * Sets the value of the blockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationLinkBlockStatusType }
     *     
     */
    public void setBlockStatus(ZfcsOrganizationLinkBlockStatusType value) {
        this.blockStatus = value;
    }

    /**
     * Gets the value of the dependentOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getDependentOrganization() {
        return dependentOrganization;
    }

    /**
     * Sets the value of the dependentOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setDependentOrganization(ZfcsOrganizationRef value) {
        this.dependentOrganization = value;
    }

    /**
     * Gets the value of the linkUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsLinkUser }
     * 
     * 
     */
    public List<ZfcsLinkUser> getLinkUsers() {
        if (linkUsers == null) {
            linkUsers = new ArrayList<ZfcsLinkUser>();
        }
        return this.linkUsers;
    }

    /**
     * Gets the value of the ordersVisibilityType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrgLinkOrdersVisibilityTypeEnum }
     *     
     */
    public ZfcsOrgLinkOrdersVisibilityTypeEnum getOrdersVisibilityType() {
        return ordersVisibilityType;
    }

    /**
     * Sets the value of the ordersVisibilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrgLinkOrdersVisibilityTypeEnum }
     *     
     */
    public void setOrdersVisibilityType(ZfcsOrgLinkOrdersVisibilityTypeEnum value) {
        this.ordersVisibilityType = value;
    }

    /**
     * Gets the value of the lastModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * Sets the value of the lastModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDate(XMLGregorianCalendar value) {
        this.lastModifyDate = value;
    }

}
