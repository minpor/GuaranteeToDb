
package ru.minpor.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация и документы, предусмотренные конкурсной документацией
 * 
 * <p>Java class for zfcs_documentRequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_documentRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_documentRequirementType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "number",
    "name",
    "mandatory"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ZfcsProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance.class,
    ru.minpor.jaxb.ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance.class,
    ru.minpor.jaxb.ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance.class,
    ru.minpor.jaxb.ZfcsProtocolOKOU1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance.class
})
public class ZfcsDocumentRequirementType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger number;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String name;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean mandatory;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

}
