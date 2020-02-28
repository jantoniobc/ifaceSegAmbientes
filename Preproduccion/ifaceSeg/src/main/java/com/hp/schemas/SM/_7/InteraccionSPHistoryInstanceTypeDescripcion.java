/**
 * InteraccionSPHistoryInstanceTypeDescripcion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class InteraccionSPHistoryInstanceTypeDescripcion  extends com.hp.schemas.SM._7.Common.ArrayType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType[] descripcion;

    public InteraccionSPHistoryInstanceTypeDescripcion() {
    }

    public InteraccionSPHistoryInstanceTypeDescripcion(
           java.lang.String type,
           com.hp.schemas.SM._7.Common.StringType[] descripcion) {
        super(
            type);
        this.descripcion = descripcion;
    }


    /**
     * Gets the descripcion value for this InteraccionSPHistoryInstanceTypeDescripcion.
     * 
     * @return descripcion
     */
    public com.hp.schemas.SM._7.Common.StringType[] getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this InteraccionSPHistoryInstanceTypeDescripcion.
     * 
     * @param descripcion
     */
    public void setDescripcion(com.hp.schemas.SM._7.Common.StringType[] descripcion) {
        this.descripcion = descripcion;
    }

    public com.hp.schemas.SM._7.Common.StringType getDescripcion(int i) {
        return this.descripcion[i];
    }

    public void setDescripcion(int i, com.hp.schemas.SM._7.Common.StringType _value) {
        this.descripcion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InteraccionSPHistoryInstanceTypeDescripcion)) return false;
        InteraccionSPHistoryInstanceTypeDescripcion other = (InteraccionSPHistoryInstanceTypeDescripcion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              java.util.Arrays.equals(this.descripcion, other.getDescripcion())));
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
        if (getDescripcion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescripcion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescripcion(), i);
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
        new org.apache.axis.description.TypeDesc(InteraccionSPHistoryInstanceTypeDescripcion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">InteraccionSPHistoryInstanceType>Descripcion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Descripcion"));
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
