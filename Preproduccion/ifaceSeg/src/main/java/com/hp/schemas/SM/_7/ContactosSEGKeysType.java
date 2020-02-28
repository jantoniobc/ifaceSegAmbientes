/**
 * ContactosSEGKeysType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class ContactosSEGKeysType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType CUC;

    private com.hp.schemas.SM._7.Common.StringType tipo;

    private com.hp.schemas.SM._7.Common.StringType contacto;

    private java.lang.String query;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public ContactosSEGKeysType() {
    }

    public ContactosSEGKeysType(
           com.hp.schemas.SM._7.Common.StringType CUC,
           com.hp.schemas.SM._7.Common.StringType tipo,
           com.hp.schemas.SM._7.Common.StringType contacto,
           java.lang.String query,
           java.lang.Long updatecounter) {
           this.CUC = CUC;
           this.tipo = tipo;
           this.contacto = contacto;
           this.query = query;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the CUC value for this ContactosSEGKeysType.
     * 
     * @return CUC
     */
    public com.hp.schemas.SM._7.Common.StringType getCUC() {
        return CUC;
    }


    /**
     * Sets the CUC value for this ContactosSEGKeysType.
     * 
     * @param CUC
     */
    public void setCUC(com.hp.schemas.SM._7.Common.StringType CUC) {
        this.CUC = CUC;
    }


    /**
     * Gets the tipo value for this ContactosSEGKeysType.
     * 
     * @return tipo
     */
    public com.hp.schemas.SM._7.Common.StringType getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ContactosSEGKeysType.
     * 
     * @param tipo
     */
    public void setTipo(com.hp.schemas.SM._7.Common.StringType tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the contacto value for this ContactosSEGKeysType.
     * 
     * @return contacto
     */
    public com.hp.schemas.SM._7.Common.StringType getContacto() {
        return contacto;
    }


    /**
     * Sets the contacto value for this ContactosSEGKeysType.
     * 
     * @param contacto
     */
    public void setContacto(com.hp.schemas.SM._7.Common.StringType contacto) {
        this.contacto = contacto;
    }


    /**
     * Gets the query value for this ContactosSEGKeysType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this ContactosSEGKeysType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the updatecounter value for this ContactosSEGKeysType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this ContactosSEGKeysType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactosSEGKeysType)) return false;
        ContactosSEGKeysType other = (ContactosSEGKeysType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CUC==null && other.getCUC()==null) || 
             (this.CUC!=null &&
              this.CUC.equals(other.getCUC()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.contacto==null && other.getContacto()==null) || 
             (this.contacto!=null &&
              this.contacto.equals(other.getContacto()))) &&
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
        if (getCUC() != null) {
            _hashCode += getCUC().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getContacto() != null) {
            _hashCode += getContacto().hashCode();
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
        new org.apache.axis.description.TypeDesc(ContactosSEGKeysType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ContactosSEGKeysType"));
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
        elemField.setFieldName("CUC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CUC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contacto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Contacto"));
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
