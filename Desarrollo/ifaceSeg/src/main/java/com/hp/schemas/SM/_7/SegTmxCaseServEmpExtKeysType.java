/**
 * SegTmxCaseServEmpExtKeysType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class SegTmxCaseServEmpExtKeysType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType refsisa;

    private com.hp.schemas.SM._7.Common.StringType folioserv;

    private java.lang.String query;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public SegTmxCaseServEmpExtKeysType() {
    }

    public SegTmxCaseServEmpExtKeysType(
           com.hp.schemas.SM._7.Common.StringType refsisa,
           com.hp.schemas.SM._7.Common.StringType folioserv,
           java.lang.String query,
           java.lang.Long updatecounter) {
           this.refsisa = refsisa;
           this.folioserv = folioserv;
           this.query = query;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the refsisa value for this SegTmxCaseServEmpExtKeysType.
     * 
     * @return refsisa
     */
    public com.hp.schemas.SM._7.Common.StringType getRefsisa() {
        return refsisa;
    }


    /**
     * Sets the refsisa value for this SegTmxCaseServEmpExtKeysType.
     * 
     * @param refsisa
     */
    public void setRefsisa(com.hp.schemas.SM._7.Common.StringType refsisa) {
        this.refsisa = refsisa;
    }


    /**
     * Gets the folioserv value for this SegTmxCaseServEmpExtKeysType.
     * 
     * @return folioserv
     */
    public com.hp.schemas.SM._7.Common.StringType getFolioserv() {
        return folioserv;
    }


    /**
     * Sets the folioserv value for this SegTmxCaseServEmpExtKeysType.
     * 
     * @param folioserv
     */
    public void setFolioserv(com.hp.schemas.SM._7.Common.StringType folioserv) {
        this.folioserv = folioserv;
    }


    /**
     * Gets the query value for this SegTmxCaseServEmpExtKeysType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this SegTmxCaseServEmpExtKeysType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the updatecounter value for this SegTmxCaseServEmpExtKeysType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this SegTmxCaseServEmpExtKeysType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SegTmxCaseServEmpExtKeysType)) return false;
        SegTmxCaseServEmpExtKeysType other = (SegTmxCaseServEmpExtKeysType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refsisa==null && other.getRefsisa()==null) || 
             (this.refsisa!=null &&
              this.refsisa.equals(other.getRefsisa()))) &&
            ((this.folioserv==null && other.getFolioserv()==null) || 
             (this.folioserv!=null &&
              this.folioserv.equals(other.getFolioserv()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.updatecounter==null && other.getUpdatecounter()==null) || 
             (this.updatecounter!=null &&
              this.updatecounter.equals(other.getUpdatecounter())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRefsisa() != null) {
            _hashCode += getRefsisa().hashCode();
        }
        if (getFolioserv() != null) {
            _hashCode += getFolioserv().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getUpdatecounter() != null) {
            _hashCode += getUpdatecounter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SegTmxCaseServEmpExtKeysType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "SegTmxCaseServEmpExtKeysType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("query");
        attrField.setXmlName(new javax.xml.namespace.QName("", "query"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("updatecounter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "updatecounter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refsisa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "refsisa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioserv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "folioserv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
