//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.PlatformSpecificationType;
import org.mitre.cybox.objects.SystemObjectType;


/**
 * The HypervisorHostSystemType characterizes the VM Hypervisor host system used in the malware analysis environment.
 * 
 * <p>Java class for HypervisorHostSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HypervisorHostSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#SystemObject-2}SystemObjectType">
 *       &lt;sequence>
 *         &lt;element name="VM_Hypervisor" type="{http://cybox.mitre.org/common-2}PlatformSpecificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HypervisorHostSystemType", propOrder = {
    "vmHypervisor"
})
public class HypervisorHostSystemType
    extends SystemObjectType
{

    @XmlElement(name = "VM_Hypervisor")
    protected PlatformSpecificationType vmHypervisor;

    /**
     * Gets the value of the vmHypervisor property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformSpecificationType }
     *     
     */
    public PlatformSpecificationType getVMHypervisor() {
        return vmHypervisor;
    }

    /**
     * Sets the value of the vmHypervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformSpecificationType }
     *     
     */
    public void setVMHypervisor(PlatformSpecificationType value) {
        this.vmHypervisor = value;
    }

}