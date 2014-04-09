//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.DateTimeObjectPropertyType;
import org.mitre.cybox.common_2.IntegerObjectPropertyType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The HTTPRequestHeaderFieldsType captures parsed HTTP request header fields.
 * 
 * <p>Java class for HTTPRequestHeaderFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTTPRequestHeaderFieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accept" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Accept_Charset" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Accept_Language" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Accept_Datetime" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Accept_Encoding" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Authorization" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Cache_Control" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Connection" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Cookie" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Content_Length" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Content_MD5" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Content_Type" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Expect" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="From" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *         &lt;element name="Host" type="{http://cybox.mitre.org/objects#HTTPSessionObject-2}HostFieldType" minOccurs="0"/>
 *         &lt;element name="If_Match" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="If_Modified_Since" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="If_None_Match" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="If_Range" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="If_Unmodified_Since" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Max_Forwards" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Pragma" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Proxy_Authorization" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Range" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Referer" type="{http://cybox.mitre.org/objects#URIObject-2}URIObjectType" minOccurs="0"/>
 *         &lt;element name="TE" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="User_Agent" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Via" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="DNT" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="X_Requested_With" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="X_Forwarded_For" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="X_Forwarded_Proto" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="X_ATT_DeviceId" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="X_Wap_Profile" type="{http://cybox.mitre.org/objects#URIObject-2}URIObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTTPRequestHeaderFieldsType", propOrder = {
    "accept",
    "acceptCharset",
    "acceptLanguage",
    "acceptDatetime",
    "acceptEncoding",
    "authorization",
    "cacheControl",
    "connection",
    "cookie",
    "contentLength",
    "contentMD5",
    "contentType",
    "date",
    "expect",
    "from",
    "host",
    "ifMatch",
    "ifModifiedSince",
    "ifNoneMatch",
    "ifRange",
    "ifUnmodifiedSince",
    "maxForwards",
    "pragma",
    "proxyAuthorization",
    "range",
    "referer",
    "te",
    "userAgent",
    "via",
    "warning",
    "dnt",
    "xRequestedWith",
    "xForwardedFor",
    "xForwardedProto",
    "xattDeviceId",
    "xWapProfile"
})
public class HTTPRequestHeaderFieldsType {

    @XmlElement(name = "Accept")
    protected StringObjectPropertyType accept;
    @XmlElement(name = "Accept_Charset")
    protected StringObjectPropertyType acceptCharset;
    @XmlElement(name = "Accept_Language")
    protected StringObjectPropertyType acceptLanguage;
    @XmlElement(name = "Accept_Datetime")
    protected StringObjectPropertyType acceptDatetime;
    @XmlElement(name = "Accept_Encoding")
    protected StringObjectPropertyType acceptEncoding;
    @XmlElement(name = "Authorization")
    protected StringObjectPropertyType authorization;
    @XmlElement(name = "Cache_Control")
    protected StringObjectPropertyType cacheControl;
    @XmlElement(name = "Connection")
    protected StringObjectPropertyType connection;
    @XmlElement(name = "Cookie")
    protected StringObjectPropertyType cookie;
    @XmlElement(name = "Content_Length")
    protected IntegerObjectPropertyType contentLength;
    @XmlElement(name = "Content_MD5")
    protected StringObjectPropertyType contentMD5;
    @XmlElement(name = "Content_Type")
    protected StringObjectPropertyType contentType;
    @XmlElement(name = "Date")
    protected DateTimeObjectPropertyType date;
    @XmlElement(name = "Expect")
    protected StringObjectPropertyType expect;
    @XmlElement(name = "From")
    protected AddressObjectType from;
    @XmlElement(name = "Host")
    protected HostFieldType host;
    @XmlElement(name = "If_Match")
    protected StringObjectPropertyType ifMatch;
    @XmlElement(name = "If_Modified_Since")
    protected DateTimeObjectPropertyType ifModifiedSince;
    @XmlElement(name = "If_None_Match")
    protected StringObjectPropertyType ifNoneMatch;
    @XmlElement(name = "If_Range")
    protected StringObjectPropertyType ifRange;
    @XmlElement(name = "If_Unmodified_Since")
    protected DateTimeObjectPropertyType ifUnmodifiedSince;
    @XmlElement(name = "Max_Forwards")
    protected IntegerObjectPropertyType maxForwards;
    @XmlElement(name = "Pragma")
    protected StringObjectPropertyType pragma;
    @XmlElement(name = "Proxy_Authorization")
    protected StringObjectPropertyType proxyAuthorization;
    @XmlElement(name = "Range")
    protected StringObjectPropertyType range;
    @XmlElement(name = "Referer")
    protected URIObjectType referer;
    @XmlElement(name = "TE")
    protected StringObjectPropertyType te;
    @XmlElement(name = "User_Agent")
    protected StringObjectPropertyType userAgent;
    @XmlElement(name = "Via")
    protected StringObjectPropertyType via;
    @XmlElement(name = "Warning")
    protected StringObjectPropertyType warning;
    @XmlElement(name = "DNT")
    protected StringObjectPropertyType dnt;
    @XmlElement(name = "X_Requested_With")
    protected StringObjectPropertyType xRequestedWith;
    @XmlElement(name = "X_Forwarded_For")
    protected StringObjectPropertyType xForwardedFor;
    @XmlElement(name = "X_Forwarded_Proto")
    protected StringObjectPropertyType xForwardedProto;
    @XmlElement(name = "X_ATT_DeviceId")
    protected StringObjectPropertyType xattDeviceId;
    @XmlElement(name = "X_Wap_Profile")
    protected URIObjectType xWapProfile;

    /**
     * Gets the value of the accept property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getAccept() {
        return accept;
    }

    /**
     * Sets the value of the accept property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setAccept(StringObjectPropertyType value) {
        this.accept = value;
    }

    /**
     * Gets the value of the acceptCharset property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getAcceptCharset() {
        return acceptCharset;
    }

    /**
     * Sets the value of the acceptCharset property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setAcceptCharset(StringObjectPropertyType value) {
        this.acceptCharset = value;
    }

    /**
     * Gets the value of the acceptLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * Sets the value of the acceptLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setAcceptLanguage(StringObjectPropertyType value) {
        this.acceptLanguage = value;
    }

    /**
     * Gets the value of the acceptDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getAcceptDatetime() {
        return acceptDatetime;
    }

    /**
     * Sets the value of the acceptDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setAcceptDatetime(StringObjectPropertyType value) {
        this.acceptDatetime = value;
    }

    /**
     * Gets the value of the acceptEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getAcceptEncoding() {
        return acceptEncoding;
    }

    /**
     * Sets the value of the acceptEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setAcceptEncoding(StringObjectPropertyType value) {
        this.acceptEncoding = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setAuthorization(StringObjectPropertyType value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the cacheControl property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getCacheControl() {
        return cacheControl;
    }

    /**
     * Sets the value of the cacheControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setCacheControl(StringObjectPropertyType value) {
        this.cacheControl = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setConnection(StringObjectPropertyType value) {
        this.connection = value;
    }

    /**
     * Gets the value of the cookie property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getCookie() {
        return cookie;
    }

    /**
     * Sets the value of the cookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setCookie(StringObjectPropertyType value) {
        this.cookie = value;
    }

    /**
     * Gets the value of the contentLength property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getContentLength() {
        return contentLength;
    }

    /**
     * Sets the value of the contentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setContentLength(IntegerObjectPropertyType value) {
        this.contentLength = value;
    }

    /**
     * Gets the value of the contentMD5 property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getContentMD5() {
        return contentMD5;
    }

    /**
     * Sets the value of the contentMD5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setContentMD5(StringObjectPropertyType value) {
        this.contentMD5 = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setContentType(StringObjectPropertyType value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setDate(DateTimeObjectPropertyType value) {
        this.date = value;
    }

    /**
     * Gets the value of the expect property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getExpect() {
        return expect;
    }

    /**
     * Sets the value of the expect property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setExpect(StringObjectPropertyType value) {
        this.expect = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link AddressObjectType }
     *     
     */
    public AddressObjectType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressObjectType }
     *     
     */
    public void setFrom(AddressObjectType value) {
        this.from = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link HostFieldType }
     *     
     */
    public HostFieldType getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFieldType }
     *     
     */
    public void setHost(HostFieldType value) {
        this.host = value;
    }

    /**
     * Gets the value of the ifMatch property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getIfMatch() {
        return ifMatch;
    }

    /**
     * Sets the value of the ifMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setIfMatch(StringObjectPropertyType value) {
        this.ifMatch = value;
    }

    /**
     * Gets the value of the ifModifiedSince property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getIfModifiedSince() {
        return ifModifiedSince;
    }

    /**
     * Sets the value of the ifModifiedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setIfModifiedSince(DateTimeObjectPropertyType value) {
        this.ifModifiedSince = value;
    }

    /**
     * Gets the value of the ifNoneMatch property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getIfNoneMatch() {
        return ifNoneMatch;
    }

    /**
     * Sets the value of the ifNoneMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setIfNoneMatch(StringObjectPropertyType value) {
        this.ifNoneMatch = value;
    }

    /**
     * Gets the value of the ifRange property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getIfRange() {
        return ifRange;
    }

    /**
     * Sets the value of the ifRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setIfRange(StringObjectPropertyType value) {
        this.ifRange = value;
    }

    /**
     * Gets the value of the ifUnmodifiedSince property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getIfUnmodifiedSince() {
        return ifUnmodifiedSince;
    }

    /**
     * Sets the value of the ifUnmodifiedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setIfUnmodifiedSince(DateTimeObjectPropertyType value) {
        this.ifUnmodifiedSince = value;
    }

    /**
     * Gets the value of the maxForwards property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getMaxForwards() {
        return maxForwards;
    }

    /**
     * Sets the value of the maxForwards property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setMaxForwards(IntegerObjectPropertyType value) {
        this.maxForwards = value;
    }

    /**
     * Gets the value of the pragma property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getPragma() {
        return pragma;
    }

    /**
     * Sets the value of the pragma property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setPragma(StringObjectPropertyType value) {
        this.pragma = value;
    }

    /**
     * Gets the value of the proxyAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getProxyAuthorization() {
        return proxyAuthorization;
    }

    /**
     * Sets the value of the proxyAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setProxyAuthorization(StringObjectPropertyType value) {
        this.proxyAuthorization = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setRange(StringObjectPropertyType value) {
        this.range = value;
    }

    /**
     * Gets the value of the referer property.
     * 
     * @return
     *     possible object is
     *     {@link URIObjectType }
     *     
     */
    public URIObjectType getReferer() {
        return referer;
    }

    /**
     * Sets the value of the referer property.
     * 
     * @param value
     *     allowed object is
     *     {@link URIObjectType }
     *     
     */
    public void setReferer(URIObjectType value) {
        this.referer = value;
    }

    /**
     * Gets the value of the te property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getTE() {
        return te;
    }

    /**
     * Sets the value of the te property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setTE(StringObjectPropertyType value) {
        this.te = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setUserAgent(StringObjectPropertyType value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getVia() {
        return via;
    }

    /**
     * Sets the value of the via property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setVia(StringObjectPropertyType value) {
        this.via = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setWarning(StringObjectPropertyType value) {
        this.warning = value;
    }

    /**
     * Gets the value of the dnt property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getDNT() {
        return dnt;
    }

    /**
     * Sets the value of the dnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setDNT(StringObjectPropertyType value) {
        this.dnt = value;
    }

    /**
     * Gets the value of the xRequestedWith property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getXRequestedWith() {
        return xRequestedWith;
    }

    /**
     * Sets the value of the xRequestedWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setXRequestedWith(StringObjectPropertyType value) {
        this.xRequestedWith = value;
    }

    /**
     * Gets the value of the xForwardedFor property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getXForwardedFor() {
        return xForwardedFor;
    }

    /**
     * Sets the value of the xForwardedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setXForwardedFor(StringObjectPropertyType value) {
        this.xForwardedFor = value;
    }

    /**
     * Gets the value of the xForwardedProto property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getXForwardedProto() {
        return xForwardedProto;
    }

    /**
     * Sets the value of the xForwardedProto property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setXForwardedProto(StringObjectPropertyType value) {
        this.xForwardedProto = value;
    }

    /**
     * Gets the value of the xattDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getXATTDeviceId() {
        return xattDeviceId;
    }

    /**
     * Sets the value of the xattDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setXATTDeviceId(StringObjectPropertyType value) {
        this.xattDeviceId = value;
    }

    /**
     * Gets the value of the xWapProfile property.
     * 
     * @return
     *     possible object is
     *     {@link URIObjectType }
     *     
     */
    public URIObjectType getXWapProfile() {
        return xWapProfile;
    }

    /**
     * Sets the value of the xWapProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link URIObjectType }
     *     
     */
    public void setXWapProfile(URIObjectType value) {
        this.xWapProfile = value;
    }

}