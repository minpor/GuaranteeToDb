
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Проект плана мероприятий
 * 
 * <p>Java class for zfcs_eventPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_eventPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="eventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventPlanNumberType" minOccurs="0"/>
 *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="startStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *         &lt;element name="endStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *         &lt;element name="eventList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="eventInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType" minOccurs="0"/>
 *                             &lt;element name="eventType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventType"/>
 *                             &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType" minOccurs="0"/>
 *                             &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
 *                             &lt;element name="eventSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType"/>
 *                             &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_periodType" minOccurs="0"/>
 *                             &lt;element name="eventStartStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *                             &lt;element name="eventPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_eventPlanType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "startStage",
    "endStage",
    "eventList",
    "printForm",
    "extPrintForm"
})
public class ZfcsEventPlanType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsEventPlanType.CommonInfo commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsStageType startStage;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsStageType endStage;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsEventPlanType.EventList eventList;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEventPlanType.CommonInfo }
     *     
     */
    public ZfcsEventPlanType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEventPlanType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsEventPlanType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the startStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStageType }
     *     
     */
    public ZfcsStageType getStartStage() {
        return startStage;
    }

    /**
     * Sets the value of the startStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStageType }
     *     
     */
    public void setStartStage(ZfcsStageType value) {
        this.startStage = value;
    }

    /**
     * Gets the value of the endStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStageType }
     *     
     */
    public ZfcsStageType getEndStage() {
        return endStage;
    }

    /**
     * Sets the value of the endStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStageType }
     *     
     */
    public void setEndStage(ZfcsStageType value) {
        this.endStage = value;
    }

    /**
     * Gets the value of the eventList property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEventPlanType.EventList }
     *     
     */
    public ZfcsEventPlanType.EventList getEventList() {
        return eventList;
    }

    /**
     * Sets the value of the eventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEventPlanType.EventList }
     *     
     */
    public void setEventList(ZfcsEventPlanType.EventList value) {
        this.eventList = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="eventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventPlanNumberType" minOccurs="0"/>
     *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventPlanNumber",
        "versionNumber",
        "createDate",
        "confirmDate",
        "publishDate",
        "owner"
    })
    public static class CommonInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String eventPlanNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Integer versionNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar confirmDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOrganizationRef owner;

        /**
         * Gets the value of the eventPlanNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventPlanNumber() {
            return eventPlanNumber;
        }

        /**
         * Sets the value of the eventPlanNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventPlanNumber(String value) {
            this.eventPlanNumber = value;
        }

        /**
         * Gets the value of the versionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getVersionNumber() {
            return versionNumber;
        }

        /**
         * Sets the value of the versionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setVersionNumber(Integer value) {
            this.versionNumber = value;
        }

        /**
         * Gets the value of the createDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDate() {
            return createDate;
        }

        /**
         * Sets the value of the createDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDate(XMLGregorianCalendar value) {
            this.createDate = value;
        }

        /**
         * Gets the value of the confirmDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getConfirmDate() {
            return confirmDate;
        }

        /**
         * Sets the value of the confirmDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setConfirmDate(XMLGregorianCalendar value) {
            this.confirmDate = value;
        }

        /**
         * Gets the value of the publishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublishDate() {
            return publishDate;
        }

        /**
         * Sets the value of the publishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublishDate(XMLGregorianCalendar value) {
            this.publishDate = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOwner(ZfcsOrganizationRef value) {
            this.owner = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="eventInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType" minOccurs="0"/>
     *                   &lt;element name="eventType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventType"/>
     *                   &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType" minOccurs="0"/>
     *                   &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
     *                   &lt;element name="eventSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType"/>
     *                   &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_periodType" minOccurs="0"/>
     *                   &lt;element name="eventStartStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
     *                   &lt;element name="eventPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventInfo"
    })
    public static class EventList {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsEventPlanType.EventList.EventInfo> eventInfo;

        /**
         * Gets the value of the eventInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsEventPlanType.EventList.EventInfo }
         * 
         * 
         */
        public List<ZfcsEventPlanType.EventList.EventInfo> getEventInfo() {
            if (eventInfo == null) {
                eventInfo = new ArrayList<ZfcsEventPlanType.EventList.EventInfo>();
            }
            return this.eventInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="eventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType" minOccurs="0"/>
         *         &lt;element name="eventType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventType"/>
         *         &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType" minOccurs="0"/>
         *         &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
         *         &lt;element name="eventSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventSubjectType"/>
         *         &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_periodType" minOccurs="0"/>
         *         &lt;element name="eventStartStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
         *         &lt;element name="eventPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eventNumberType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "eventNumber",
            "eventType",
            "inspectionType",
            "surveyType",
            "eventSubject",
            "period",
            "eventStartStage",
            "eventPublishDate",
            "base",
            "parentEventPlanNumber"
        })
        public static class EventInfo {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String eventNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsEventType eventType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected ZfcsInspectionTypeType inspectionType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected ZfcsSurveyType surveyType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsEventSubjectType eventSubject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsPeriodType period;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsStageType eventStartStage;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar eventPublishDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String base;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String parentEventPlanNumber;

            /**
             * Gets the value of the eventNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventNumber() {
                return eventNumber;
            }

            /**
             * Sets the value of the eventNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventNumber(String value) {
                this.eventNumber = value;
            }

            /**
             * Gets the value of the eventType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventType }
             *     
             */
            public ZfcsEventType getEventType() {
                return eventType;
            }

            /**
             * Sets the value of the eventType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventType }
             *     
             */
            public void setEventType(ZfcsEventType value) {
                this.eventType = value;
            }

            /**
             * Gets the value of the inspectionType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsInspectionTypeType }
             *     
             */
            public ZfcsInspectionTypeType getInspectionType() {
                return inspectionType;
            }

            /**
             * Sets the value of the inspectionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsInspectionTypeType }
             *     
             */
            public void setInspectionType(ZfcsInspectionTypeType value) {
                this.inspectionType = value;
            }

            /**
             * Gets the value of the surveyType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSurveyType }
             *     
             */
            public ZfcsSurveyType getSurveyType() {
                return surveyType;
            }

            /**
             * Sets the value of the surveyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSurveyType }
             *     
             */
            public void setSurveyType(ZfcsSurveyType value) {
                this.surveyType = value;
            }

            /**
             * Gets the value of the eventSubject property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsEventSubjectType }
             *     
             */
            public ZfcsEventSubjectType getEventSubject() {
                return eventSubject;
            }

            /**
             * Sets the value of the eventSubject property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsEventSubjectType }
             *     
             */
            public void setEventSubject(ZfcsEventSubjectType value) {
                this.eventSubject = value;
            }

            /**
             * Gets the value of the period property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPeriodType }
             *     
             */
            public ZfcsPeriodType getPeriod() {
                return period;
            }

            /**
             * Sets the value of the period property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPeriodType }
             *     
             */
            public void setPeriod(ZfcsPeriodType value) {
                this.period = value;
            }

            /**
             * Gets the value of the eventStartStage property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsStageType }
             *     
             */
            public ZfcsStageType getEventStartStage() {
                return eventStartStage;
            }

            /**
             * Sets the value of the eventStartStage property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsStageType }
             *     
             */
            public void setEventStartStage(ZfcsStageType value) {
                this.eventStartStage = value;
            }

            /**
             * Gets the value of the eventPublishDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEventPublishDate() {
                return eventPublishDate;
            }

            /**
             * Sets the value of the eventPublishDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEventPublishDate(XMLGregorianCalendar value) {
                this.eventPublishDate = value;
            }

            /**
             * Gets the value of the base property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBase() {
                return base;
            }

            /**
             * Sets the value of the base property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBase(String value) {
                this.base = value;
            }

            /**
             * Gets the value of the parentEventPlanNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentEventPlanNumber() {
                return parentEventPlanNumber;
            }

            /**
             * Sets the value of the parentEventPlanNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentEventPlanNumber(String value) {
                this.parentEventPlanNumber = value;
            }

        }

    }

}
