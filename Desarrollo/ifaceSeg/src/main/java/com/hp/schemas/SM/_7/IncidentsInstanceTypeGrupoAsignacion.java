/**
 * IncidentsInstanceTypeGrupoAsignacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class IncidentsInstanceTypeGrupoAsignacion  extends com.hp.schemas.SM._7.Common.ArrayType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType[] grupoAsignacion;

    public IncidentsInstanceTypeGrupoAsignacion() {
    }

    public IncidentsInstanceTypeGrupoAsignacion(
           java.lang.String type,
           com.hp.schemas.SM._7.Common.StringType[] grupoAsignacion) {
        super(
            type);
        this.grupoAsignacion = grupoAsignacion;
    }


    /**
     * Gets the grupoAsignacion value for this IncidentsInstanceTypeGrupoAsignacion.
     * 
     * @return grupoAsignacion
     */
    public com.hp.schemas.SM._7.Common.StringType[] getGrupoAsignacion() {
        return grupoAsignacion;
    }


    /**
     * Sets the grupoAsignacion value for this IncidentsInstanceTypeGrupoAsignacion.
     * 
     * @param grupoAsignacion
     */
    public void setGrupoAsignacion(com.hp.schemas.SM._7.Common.StringType[] grupoAsignacion) {
        this.grupoAsignacion = grupoAsignacion;
    }

    public com.hp.schemas.SM._7.Common.StringType getGrupoAsignacion(int i) {
        return this.grupoAsignacion[i];
    }

    public void setGrupoAsignacion(int i, com.hp.schemas.SM._7.Common.StringType _value) {
        this.grupoAsignacion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncidentsInstanceTypeGrupoAsignacion)) return false;
        IncidentsInstanceTypeGrupoAsignacion other = (IncidentsInstanceTypeGrupoAsignacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.grupoAsignacion==null && other.getGrupoAsignacion()==null) || 
             (this.grupoAsignacion!=null &&
              java.util.Arrays.equals(this.grupoAsignacion, other.getGrupoAsignacion())));
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
        if (getGrupoAsignacion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrupoAsignacion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrupoAsignacion(), i);
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
        new org.apache.axis.description.TypeDesc(IncidentsInstanceTypeGrupoAsignacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">incidentsInstanceType>GrupoAsignacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoAsignacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "GrupoAsignacion"));
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
