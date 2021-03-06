//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * The ObjectReferenceType serves as a method for linking to CybOX Objects embedded in the MAEC Bundle.
 * 
 * <p>Java class for ObjectReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="object_idref" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectReferenceType")
public class ObjectReferenceType {

    @XmlAttribute(name = "object_idref", required = true)
    protected QName objectIdref;

    /**
     * Gets the value of the objectIdref property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getObjectIdref() {
        return objectIdref;
    }

    /**
     * Sets the value of the objectIdref property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setObjectIdref(QName value) {
        this.objectIdref = value;
    }

}
