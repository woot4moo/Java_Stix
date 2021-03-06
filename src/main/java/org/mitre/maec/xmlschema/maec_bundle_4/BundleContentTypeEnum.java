//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundleContentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BundleContentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dynamic analysis tool output"/>
 *     &lt;enumeration value="static analysis tool output"/>
 *     &lt;enumeration value="manual analysis output"/>
 *     &lt;enumeration value="extracted from subject"/>
 *     &lt;enumeration value="mixed"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BundleContentTypeEnum")
@XmlEnum
public enum BundleContentTypeEnum {


    /**
     * The dynamic analysis tool output value specifies that the Bundle primarily captures some form of dynamic analysis tool output, such as from a sandbox.
     * 
     */
    @XmlEnumValue("dynamic analysis tool output")
    DYNAMIC_ANALYSIS_TOOL_OUTPUT("dynamic analysis tool output"),

    /**
     * The static analysis tool output value specifies that the Bundle primarily captures some form of static analysis tool output, such as from a packer detection tool.
     * 
     */
    @XmlEnumValue("static analysis tool output")
    STATIC_ANALYSIS_TOOL_OUTPUT("static analysis tool output"),

    /**
     * The manual analysis output value specifies that the Bundle primarily captures some form of manual analysis output, which may or may not involve the use of tools.
     * 
     */
    @XmlEnumValue("manual analysis output")
    MANUAL_ANALYSIS_OUTPUT("manual analysis output"),

    /**
     * The extracted from subject value specifies that the Bundle primarily captures some data that extracted from the Malware Subject, such as some PE Header fields.
     * 
     */
    @XmlEnumValue("extracted from subject")
    EXTRACTED_FROM_SUBJECT("extracted from subject"),

    /**
     * The mixed value specifies that the Bundle captures some mixed forms of analysis or tool output for the Malware Subject, such as both dynamic and static analysis tool output.
     * 
     */
    @XmlEnumValue("mixed")
    MIXED("mixed"),

    /**
     * The other value specifies that the Bundle captures some other form of analysis or tool output that is not represented by the other enumeration values.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BundleContentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BundleContentTypeEnum fromValue(String v) {
        for (BundleContentTypeEnum c: BundleContentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
