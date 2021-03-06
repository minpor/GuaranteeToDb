
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Внесение исправлений в протокол
 * 
 * <p>Java class for zfcs_protocolModificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolModificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modificationNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolModificationReasonType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolModificationType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "modificationNumber",
    "info",
    "addInfo",
    "reason"
})
public class ZfcsProtocolModificationType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected int modificationNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String info;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String addInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolModificationReasonType reason;

    /**
     * Gets the value of the modificationNumber property.
     * 
     */
    public int getModificationNumber() {
        return modificationNumber;
    }

    /**
     * Sets the value of the modificationNumber property.
     * 
     */
    public void setModificationNumber(int value) {
        this.modificationNumber = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolModificationReasonType }
     *     
     */
    public ZfcsProtocolModificationReasonType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolModificationReasonType }
     *     
     */
    public void setReason(ZfcsProtocolModificationReasonType value) {
        this.reason = value;
    }

}
