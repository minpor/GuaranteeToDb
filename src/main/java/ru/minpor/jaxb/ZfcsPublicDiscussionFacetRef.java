
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Ссылка на аспект общественного обсуждений
 * 
 * <p>Java class for zfcs_publicDiscussionFacetRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionFacetRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="facetName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionFacetRef", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "code",
    "facetName"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.class
})
public class ZfcsPublicDiscussionFacetRef {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String code;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String facetName;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the facetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetName() {
        return facetName;
    }

    /**
     * Sets the value of the facetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetName(String value) {
        this.facetName = value;
    }

}
