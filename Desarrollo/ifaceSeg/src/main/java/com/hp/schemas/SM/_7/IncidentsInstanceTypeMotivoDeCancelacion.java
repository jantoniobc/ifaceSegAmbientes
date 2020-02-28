/**
 * IncidentsInstanceTypeMotivoDeCancelacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class IncidentsInstanceTypeMotivoDeCancelacion  extends com.hp.schemas.SM._7.Common.ArrayType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType[] motivoDeCancelacion;

    public IncidentsInstanceTypeMotivoDeCancelacion() {
    }

    public IncidentsInstanceTypeMotivoDeCancelacion(
           java.lang.String type,
           com.hp.schemas.SM._7.Common.StringType[] motivoDeCancelacion) {
        super(
            type);
        this.motivoDeCancelacion = motivoDeCancelacion;
    }


    /**
     * Gets the motivoDeCancelacion value for this IncidentsInstanceTypeMotivoDeCancelacion.
     * 
     * @return motivoDeCancelacion
     */
    public com.hp.schemas.SM._7.Common.StringType[] getMotivoDeCancelacion() {
        return motivoDeCancelacion;
    }


    /**
     * Sets the motivoDeCancelacion value for this IncidentsInstanceTypeMotivoDeCancelacion.
     * 
     * @param motivoDeCancelacion
     */
    public void setMotivoDeCancelacion(com.hp.schemas.SM._7.Common.StringType[] motivoDeCancelacion) {
        this.motivoDeCancelacion = motivoDeCancelacion;
    }

    public com.hp.schemas.SM._7.Common.StringType getMotivoDeCancelacion(int i) {
        return this.motivoDeCancelacion[i];
    }

    public void setMotivoDeCancelacion(int i, com.hp.schemas.SM._7.Common.StringType _value) {
        this.motivoDeCancelacion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncidentsInstanceTypeMotivoDeCancelacion)) return false;
        IncidentsInstanceTypeMotivoDeCancelacion other = (IncidentsInstanceTypeMotivoDeCancelacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.motivoDeCancelacion==null && other.getMotivoDeCancelacion()==null) || 
             (this.motivoDeCancelacion!=null &&
              java.util.Arrays.equals(this.motivoDeCancelacion, other.getMotivoDeCancelacion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMotivoDeCancelacion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMotivoDeCancelacion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMotivoDeCancelacion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncidentsInstanceTypeMotivoDeCancelacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">incidentsInstanceType>MotivoDeCancelacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoDeCancelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "MotivoDeCancelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
