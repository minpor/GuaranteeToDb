
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Прикрепленные документы для государственного или муниципального контракта
 * 
 * <p>Java class for zfcs_contract.attachmentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contract.attachmentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.attachmentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contract.attachmentListType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "attachment"
})
public class ZfcsContractAttachmentListType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsContractAttachmentType> attachment;

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsContractAttachmentType }
     * 
     * 
     */
    public List<ZfcsContractAttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<ZfcsContractAttachmentType>();
        }
        return this.attachment;
    }

}
