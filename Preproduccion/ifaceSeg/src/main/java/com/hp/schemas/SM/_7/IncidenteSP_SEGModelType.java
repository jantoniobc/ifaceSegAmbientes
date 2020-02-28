/**
 * IncidenteSP_SEGModelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class IncidenteSP_SEGModelType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.IncidenteSP_SEGKeysType keys;

    private com.hp.schemas.SM._7.IncidenteSP_SEGInstanceType instance;

    private com.hp.schemas.SM._7.Common.MessageType[] messages;

    private java.lang.String query;  // attribute

    public IncidenteSP_SEGModelType() {
    }

    public IncidenteSP_SEGModelType(
           com.hp.schemas.SM._7.IncidenteSP_SEGKeysType keys,
           com.hp.schemas.SM._7.IncidenteSP_SEGInstanceType instance,
           com.hp.schemas.SM._7.Common.MessageType[] messages,
           java.lang.String query) {
           this.keys = keys;
           this.instance = instance;
           this.messages = messages;
           this.query = query;
    }


    /**
     * Gets the keys value for this IncidenteSP_SEGModelType.
     * 
     * @return keys
     */
    public com.hp.schemas.SM._7.IncidenteSP_SEGKeysType getKeys() {
        return keys;
    }


    /**
     * Sets the keys value for this IncidenteSP_SEGModelType.
     * 
     * @param keys
     */
    public void setKeys(com.hp.schemas.SM._7.IncidenteSP_SEGKeysType keys) {
        this.keys = keys;
    }


    /**
     * Gets the instance value for this IncidenteSP_SEGModelType.
     * 
     * @return instance
     */
    public com.hp.schemas.SM._7.IncidenteSP_SEGInstanceType getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this IncidenteSP_SEGModelType.
     * 
     * @param instance
     */
    public void setInstance(com.hp.schemas.SM._7.IncidenteSP_SEGInstanceType instance) {
        this.instance = instance;
    }


    /**
     * Gets the messages value for this IncidenteSP_SEGModelType.
     * 
     * @return messages
     */
    public com.hp.schemas.SM._7.Common.MessageType[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this IncidenteSP_SEGModelType.
     * 
     * @param messages
     */
    public void setMessages(com.hp.schemas.SM._7.Common.MessageType[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the query value for this IncidenteSP_SEGModelType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this IncidenteSP_SEGModelType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncidenteSP_SEGModelType)) return false;
        IncidenteSP_SEGModelType other = (IncidenteSP_SEGModelType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keys==null && other.getKeys()==null) || 
             (this.keys!=null &&
              this.keys.equals(other.getKeys()))) &&
            ((this.instance==null && other.getInstance()==null) || 
             (this.instance!=null &&
              this.instance.equals(other.getInstance()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery())));
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
        if (getKeys() != null) {
            _hashCode += getKeys().hashCode();
        }
        if (getInstance() != null) {
            _hashCode += getInstance().hashCode();
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncidenteSP_SEGModelType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IncidenteSP_SEGModelType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("query");
        attrField.setXmlName(new javax.xml.namespace.QName("", "query"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "keys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IncidenteSP_SEGKeysType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "instance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IncidenteSP_SEGInstanceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "MessageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "message"));
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
