
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for criterionRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criterionRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="criterionType" type="{http://zakupki.gov.ru/oos/types/1}criterion.criterionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criterionRef", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "criterionType"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Criterion.class
})
public class CriterionRef {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected CriterionCriterionType criterionType;

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
     * Gets the value of the criterionType property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionCriterionType }
     *     
     */
    public CriterionCriterionType getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the value of the criterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionCriterionType }
     *     
     */
    public void setCriterionType(CriterionCriterionType value) {
        this.criterionType = value;
    }

}
