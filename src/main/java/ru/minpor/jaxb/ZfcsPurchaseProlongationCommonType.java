
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Общий тип для продлений сроков
 * 
 * <p>Java class for zfcs_purchaseProlongationCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseProlongationCommonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseDocumentCommonType">
 *       &lt;sequence>
 *         &lt;element name="docType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_docType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseProlongationCommonType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "docType"
})
@XmlSeeAlso({
    ZfcsPurchaseProlongationOKType.class,
    ZfcsPurchaseProlongationZKType.class
})
public class ZfcsPurchaseProlongationCommonType
    extends ZfcsPurchaseDocumentCommonType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsDocType docType;

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsDocType }
     *     
     */
    public ZfcsDocType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsDocType }
     *     
     */
    public void setDocType(ZfcsDocType value) {
        this.docType = value;
    }

}
