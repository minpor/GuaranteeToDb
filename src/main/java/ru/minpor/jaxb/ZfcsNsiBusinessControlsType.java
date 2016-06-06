
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Перечень бизнес-контролей для загрузки
 * 
 * <p>Java class for zfcs_nsiBusinessControlsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiBusinessControlsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsiBusinessControl" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBusinessControlType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiBusinessControlsType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "nsiBusinessControl"
})
public class ZfcsNsiBusinessControlsType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsNsiBusinessControlType> nsiBusinessControl;

    /**
     * Gets the value of the nsiBusinessControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsiBusinessControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsiBusinessControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsNsiBusinessControlType }
     * 
     * 
     */
    public List<ZfcsNsiBusinessControlType> getNsiBusinessControl() {
        if (nsiBusinessControl == null) {
            nsiBusinessControl = new ArrayList<ZfcsNsiBusinessControlType>();
        }
        return this.nsiBusinessControl;
    }

}
