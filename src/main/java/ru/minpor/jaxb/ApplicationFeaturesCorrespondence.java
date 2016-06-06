
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationFeaturesCorrespondence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationFeaturesCorrespondence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compatible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="notificationFeature" type="{http://zakupki.gov.ru/oos/types/1}notificationFeatureType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationFeaturesCorrespondence", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "compatible",
    "notificationFeature"
})
public class ApplicationFeaturesCorrespondence {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean compatible;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationFeatureType notificationFeature;

    /**
     * Gets the value of the compatible property.
     * 
     */
    public boolean isCompatible() {
        return compatible;
    }

    /**
     * Sets the value of the compatible property.
     * 
     */
    public void setCompatible(boolean value) {
        this.compatible = value;
    }

    /**
     * Gets the value of the notificationFeature property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationFeatureType }
     *     
     */
    public NotificationFeatureType getNotificationFeature() {
        return notificationFeature;
    }

    /**
     * Sets the value of the notificationFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationFeatureType }
     *     
     */
    public void setNotificationFeature(NotificationFeatureType value) {
        this.notificationFeature = value;
    }

}
