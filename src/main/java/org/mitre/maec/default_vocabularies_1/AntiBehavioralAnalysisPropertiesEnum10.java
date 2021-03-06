//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AntiBehavioralAnalysisPropertiesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AntiBehavioralAnalysisPropertiesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="targeted vm"/>
 *     &lt;enumeration value="targeted sandbox"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AntiBehavioralAnalysisPropertiesEnum-1.0")
@XmlEnum
public enum AntiBehavioralAnalysisPropertiesEnum10 {


    /**
     * The 'targeted vm' value refers to the name of a virtual machine (VM) targeted by the Anti-Behavioral Analysis Capability or one of its child Objectives.
     * 
     */
    @XmlEnumValue("targeted vm")
    TARGETED_VM("targeted vm"),

    /**
     * The 'targeted sandbox' value refers to the name of a sandbox targeted by the Anti-Behavioral Analysis Capability or one of its child Objectives.
     * 
     */
    @XmlEnumValue("targeted sandbox")
    TARGETED_SANDBOX("targeted sandbox");
    private final String value;

    AntiBehavioralAnalysisPropertiesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AntiBehavioralAnalysisPropertiesEnum10 fromValue(String v) {
        for (AntiBehavioralAnalysisPropertiesEnum10 c: AntiBehavioralAnalysisPropertiesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
