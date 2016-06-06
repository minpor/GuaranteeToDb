
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о публичных слушаниях по лоту закупки
 * 
 * <p>Java class for zfcs_publicDiscussionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="number">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="8"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;/choice>
 *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPlaceEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "number",
    "href",
    "place"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ZfcsNotificationEFType.Lot.PublicDiscussion.class,
    ru.minpor.jaxb.ZfcsNotificationEPType.Lot.PublicDiscussion.class
})
public class ZfcsPublicDiscussionType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String number;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsPublicDiscussionPlaceEnum place;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPlaceEnum }
     *     
     */
    public ZfcsPublicDiscussionPlaceEnum getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPlaceEnum }
     *     
     */
    public void setPlace(ZfcsPublicDiscussionPlaceEnum value) {
        this.place = value;
    }

}
