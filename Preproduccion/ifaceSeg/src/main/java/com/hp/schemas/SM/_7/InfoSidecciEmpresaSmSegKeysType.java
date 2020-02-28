/**
 * InfoSidecciEmpresaSmSegKeysType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class InfoSidecciEmpresaSmSegKeysType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType query;

    private java.lang.String query2;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public InfoSidecciEmpresaSmSegKeysType() {
    }

    public InfoSidecciEmpresaSmSegKeysType(
           com.hp.schemas.SM._7.Common.StringType query,
           java.lang.String query2,
           java.lang.Long updatecounter) {
           this.query = query;
           this.query2 = query2;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the query value for this InfoSidecciEmpresaSmSegKeysType.
     * 
     * @return query
     */
    public com.hp.schemas.SM._7.Common.StringType getQuery() {
        return query;
    }


    /**
     * Sets the query value for this InfoSidecciEmpresaSmSegKeysType.
     * 
     * @param query
     */
    public void setQuery(com.hp.schemas.SM._7.Common.StringType query) {
        this.query = query;
    }


    /**
     * Gets the query2 value for this InfoSidecciEmpresaSmSegKeysType.
     * 
     * @return query2
     */
    public java.lang.String getQuery2() {
        return query2;
    }


    /**
     * Sets the query2 value for this InfoSidecciEmpresaSmSegKeysType.
     * 
     * @param query2
     */
    public void setQuery2(java.lang.String query2) {
        this.query2 = query2;
    }


    /**
     * Gets the updatecounter value for this InfoSidecciEmpresaSmSegKeysType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this InfoSidecciEmpresaSmSegKeysType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoSidecciEmpresaSmSegKeysType)) return false;
        InfoSidecciEmpresaSmSegKeysType other = (InfoSidecciEmpresaSmSegKeysType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.query2==null && other.getQuery2()==null) || 
             (this.query2!=null &&
              this.query2.equals(other.getQuery2()))) &&
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getQuery2() != null) {
            _hashCode += getQuery2().hashCode();
        }
        if (getUpdatecounter() != null) {
            _hashCode += getUpdatecounter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoSidecciEmpresaSmSegKeysType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "infoSidecciEmpresaSmSegKeysType"));
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
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Query"));
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
