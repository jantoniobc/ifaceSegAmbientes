/**
 * ContactosSEGInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class ContactosSEGInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType CUC;

    private com.hp.schemas.SM._7.Common.StringType tipo;

    private com.hp.schemas.SM._7.Common.StringType contacto;

    private com.hp.schemas.SM._7.Common.StringType pais;

    private com.hp.schemas.SM._7.Common.StringType telefono;

    private com.hp.schemas.SM._7.Common.StringType codigo;

    private com.hp.schemas.SM._7.Common.StringType extension;

    private com.hp.schemas.SM._7.Common.StringType celular;

    private com.hp.schemas.SM._7.Common.StringType email;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public ContactosSEGInstanceType() {
    }

    public ContactosSEGInstanceType(
           com.hp.schemas.SM._7.Common.StringType CUC,
           com.hp.schemas.SM._7.Common.StringType tipo,
           com.hp.schemas.SM._7.Common.StringType contacto,
           com.hp.schemas.SM._7.Common.StringType pais,
           com.hp.schemas.SM._7.Common.StringType telefono,
           com.hp.schemas.SM._7.Common.StringType codigo,
           com.hp.schemas.SM._7.Common.StringType extension,
           com.hp.schemas.SM._7.Common.StringType celular,
           com.hp.schemas.SM._7.Common.StringType email,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.CUC = CUC;
           this.tipo = tipo;
           this.contacto = contacto;
           this.pais = pais;
           this.telefono = telefono;
           this.codigo = codigo;
           this.extension = extension;
           this.celular = celular;
           this.email = email;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the CUC value for this ContactosSEGInstanceType.
     * 
     * @return CUC
     */
    public com.hp.schemas.SM._7.Common.StringType getCUC() {
        return CUC;
    }


    /**
     * Sets the CUC value for this ContactosSEGInstanceType.
     * 
     * @param CUC
     */
    public void setCUC(com.hp.schemas.SM._7.Common.StringType CUC) {
        this.CUC = CUC;
    }


    /**
     * Gets the tipo value for this ContactosSEGInstanceType.
     * 
     * @return tipo
     */
    public com.hp.schemas.SM._7.Common.StringType getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ContactosSEGInstanceType.
     * 
     * @param tipo
     */
    public void setTipo(com.hp.schemas.SM._7.Common.StringType tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the contacto value for this ContactosSEGInstanceType.
     * 
     * @return contacto
     */
    public com.hp.schemas.SM._7.Common.StringType getContacto() {
        return contacto;
    }


    /**
     * Sets the contacto value for this ContactosSEGInstanceType.
     * 
     * @param contacto
     */
    public void setContacto(com.hp.schemas.SM._7.Common.StringType contacto) {
        this.contacto = contacto;
    }


    /**
     * Gets the pais value for this ContactosSEGInstanceType.
     * 
     * @return pais
     */
    public com.hp.schemas.SM._7.Common.StringType getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this ContactosSEGInstanceType.
     * 
     * @param pais
     */
    public void setPais(com.hp.schemas.SM._7.Common.StringType pais) {
        this.pais = pais;
    }


    /**
     * Gets the telefono value for this ContactosSEGInstanceType.
     * 
     * @return telefono
     */
    public com.hp.schemas.SM._7.Common.StringType getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this ContactosSEGInstanceType.
     * 
     * @param telefono
     */
    public void setTelefono(com.hp.schemas.SM._7.Common.StringType telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the codigo value for this ContactosSEGInstanceType.
     * 
     * @return codigo
     */
    public com.hp.schemas.SM._7.Common.StringType getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ContactosSEGInstanceType.
     * 
     * @param codigo
     */
    public void setCodigo(com.hp.schemas.SM._7.Common.StringType codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the extension value for this ContactosSEGInstanceType.
     * 
     * @return extension
     */
    public com.hp.schemas.SM._7.Common.StringType getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this ContactosSEGInstanceType.
     * 
     * @param extension
     */
    public void setExtension(com.hp.schemas.SM._7.Common.StringType extension) {
        this.extension = extension;
    }


    /**
     * Gets the celular value for this ContactosSEGInstanceType.
     * 
     * @return celular
     */
    public com.hp.schemas.SM._7.Common.StringType getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this ContactosSEGInstanceType.
     * 
     * @param celular
     */
    public void setCelular(com.hp.schemas.SM._7.Common.StringType celular) {
        this.celular = celular;
    }


    /**
     * Gets the email value for this ContactosSEGInstanceType.
     * 
     * @return email
     */
    public com.hp.schemas.SM._7.Common.StringType getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ContactosSEGInstanceType.
     * 
     * @param email
     */
    public void setEmail(com.hp.schemas.SM._7.Common.StringType email) {
        this.email = email;
    }


    /**
     * Gets the attachments value for this ContactosSEGInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this ContactosSEGInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this ContactosSEGInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this ContactosSEGInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this ContactosSEGInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this ContactosSEGInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this ContactosSEGInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this ContactosSEGInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this ContactosSEGInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this ContactosSEGInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactosSEGInstanceType)) return false;
        ContactosSEGInstanceType other = (ContactosSEGInstanceType) obj;
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
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.celular==null && other.getCelular()==null) || 
             (this.celular!=null &&
              this.celular.equals(other.getCelular()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.uniquequery==null && other.getUniquequery()==null) || 
             (this.uniquequery!=null &&
              this.uniquequery.equals(other.getUniquequery()))) &&
            ((this.recordid==null && other.getRecordid()==null) || 
             (this.recordid!=null &&
              this.recordid.equals(other.getRecordid()))) &&
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
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getCelular() != null) {
            _hashCode += getCelular().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getUniquequery() != null) {
            _hashCode += getUniquequery().hashCode();
        }
        if (getRecordid() != null) {
            _hashCode += getRecordid().hashCode();
        }
        if (getUpdatecounter() != null) {
            _hashCode += getUpdatecounter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactosSEGInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ContactosSEGInstanceType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("query");
        attrField.setXmlName(new javax.xml.namespace.QName("", "query"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("uniquequery");
        attrField.setXmlName(new javax.xml.namespace.QName("", "uniquequery"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recordid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "recordid"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Celular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "AttachmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "attachment"));
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
