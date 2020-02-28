/**
 * InteraccionSPHistoryKeysType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class InteraccionSPHistoryKeysType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType idQueja;

    private com.hp.schemas.SM._7.Common.DateTimeType negdatestamp;

    private com.hp.schemas.SM._7.Common.StringType numeroActividad;

    private java.lang.String query;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public InteraccionSPHistoryKeysType() {
    }

    public InteraccionSPHistoryKeysType(
           com.hp.schemas.SM._7.Common.StringType idQueja,
           com.hp.schemas.SM._7.Common.DateTimeType negdatestamp,
           com.hp.schemas.SM._7.Common.StringType numeroActividad,
           java.lang.String query,
           java.lang.Long updatecounter) {
           this.idQueja = idQueja;
           this.negdatestamp = negdatestamp;
           this.numeroActividad = numeroActividad;
           this.query = query;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the idQueja value for this InteraccionSPHistoryKeysType.
     * 
     * @return idQueja
     */
    public com.hp.schemas.SM._7.Common.StringType getIdQueja() {
        return idQueja;
    }


    /**
     * Sets the idQueja value for this InteraccionSPHistoryKeysType.
     * 
     * @param idQueja
     */
    public void setIdQueja(com.hp.schemas.SM._7.Common.StringType idQueja) {
        this.idQueja = idQueja;
    }


    /**
     * Gets the negdatestamp value for this InteraccionSPHistoryKeysType.
     * 
     * @return negdatestamp
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getNegdatestamp() {
        return negdatestamp;
    }


    /**
     * Sets the negdatestamp value for this InteraccionSPHistoryKeysType.
     * 
     * @param negdatestamp
     */
    public void setNegdatestamp(com.hp.schemas.SM._7.Common.DateTimeType negdatestamp) {
        this.negdatestamp = negdatestamp;
    }


    /**
     * Gets the numeroActividad value for this InteraccionSPHistoryKeysType.
     * 
     * @return numeroActividad
     */
    public com.hp.schemas.SM._7.Common.StringType getNumeroActividad() {
        return numeroActividad;
    }


    /**
     * Sets the numeroActividad value for this InteraccionSPHistoryKeysType.
     * 
     * @param numeroActividad
     */
    public void setNumeroActividad(com.hp.schemas.SM._7.Common.StringType numeroActividad) {
        this.numeroActividad = numeroActividad;
    }


    /**
     * Gets the query value for this InteraccionSPHistoryKeysType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this InteraccionSPHistoryKeysType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the updatecounter value for this InteraccionSPHistoryKeysType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this InteraccionSPHistoryKeysType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InteraccionSPHistoryKeysType)) return false;
        InteraccionSPHistoryKeysType other = (InteraccionSPHistoryKeysType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idQueja==null && other.getIdQueja()==null) || 
             (this.idQueja!=null &&
              this.idQueja.equals(other.getIdQueja()))) &&
            ((this.negdatestamp==null && other.getNegdatestamp()==null) || 
             (this.negdatestamp!=null &&
              this.negdatestamp.equals(other.getNegdatestamp()))) &&
            ((this.numeroActividad==null && other.getNumeroActividad()==null) || 
             (this.numeroActividad!=null &&
              this.numeroActividad.equals(other.getNumeroActividad()))) &&
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
        if (getIdQueja() != null) {
            _hashCode += getIdQueja().hashCode();
        }
        if (getNegdatestamp() != null) {
            _hashCode += getNegdatestamp().hashCode();
        }
        if (getNumeroActividad() != null) {
            _hashCode += getNumeroActividad().hashCode();
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
        new org.apache.axis.description.TypeDesc(InteraccionSPHistoryKeysType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "InteraccionSPHistoryKeysType"));
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
        elemField.setFieldName("idQueja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IdQueja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negdatestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "negdatestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroActividad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "NumeroActividad"));
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
