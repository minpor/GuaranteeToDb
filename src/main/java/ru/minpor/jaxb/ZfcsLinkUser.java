
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Список связей "право - пользователь"
 * 
 * <p>Java class for zfcs_linkUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_linkUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="blockStatus" type="{http://zakupki.gov.ru/oos/types/1}zfcs_userLinkBlockStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_linkUser", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "user",
    "blockStatus"
})
public class ZfcsLinkUser {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String user;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsUserLinkBlockStatusType blockStatus;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the blockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUserLinkBlockStatusType }
     *     
     */
    public ZfcsUserLinkBlockStatusType getBlockStatus() {
        return blockStatus;
    }

    /**
     * Sets the value of the blockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUserLinkBlockStatusType }
     *     
     */
    public void setBlockStatus(ZfcsUserLinkBlockStatusType value) {
        this.blockStatus = value;
    }

}
