/**
 * SubtipoServicioSEGInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class SubtipoServicioSEGInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType id;

    private com.hp.schemas.SM._7.Common.StringType nemonico;

    private com.hp.schemas.SM._7.Common.StringType tipoServicio;

    private com.hp.schemas.SM._7.Common.StringType tipoInteraccion;

    private com.hp.schemas.SM._7.Common.StringType activo;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public SubtipoServicioSEGInstanceType() {
    }

    public SubtipoServicioSEGInstanceType(
           com.hp.schemas.SM._7.Common.StringType id,
           com.hp.schemas.SM._7.Common.StringType nemonico,
           com.hp.schemas.SM._7.Common.StringType tipoServicio,
           com.hp.schemas.SM._7.Common.StringType tipoInteraccion,
           com.hp.schemas.SM._7.Common.StringType activo,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.id = id;
           this.nemonico = nemonico;
           this.tipoServicio = tipoServicio;
           this.tipoInteraccion = tipoInteraccion;
           this.activo = activo;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the id value for this SubtipoServicioSEGInstanceType.
     * 
     * @return id
     */
    public com.hp.schemas.SM._7.Common.StringType getId() {
        return id;
    }


    /**
     * Sets the id value for this SubtipoServicioSEGInstanceType.
     * 
     * @param id
     */
    public void setId(com.hp.schemas.SM._7.Common.StringType id) {
        this.id = id;
    }


    /**
     * Gets the nemonico value for this SubtipoServicioSEGInstanceType.
     * 
     * @return nemonico
     */
    public com.hp.schemas.SM._7.Common.StringType getNemonico() {
        return nemonico;
    }


    /**
     * Sets the nemonico value for this SubtipoServicioSEGInstanceType.
     * 
     * @param nemonico
     */
    public void setNemonico(com.hp.schemas.SM._7.Common.StringType nemonico) {
        this.nemonico = nemonico;
    }


    /**
     * Gets the tipoServicio value for this SubtipoServicioSEGInstanceType.
     * 
     * @return tipoServicio
     */
    public com.hp.schemas.SM._7.Common.StringType getTipoServicio() {
        return tipoServicio;
    }


    /**
     * Sets the tipoServicio value for this SubtipoServicioSEGInstanceType.
     * 
     * @param tipoServicio
     */
    public void setTipoServicio(com.hp.schemas.SM._7.Common.StringType tipoServicio) {
        this.tipoServicio = tipoServicio;
    }


    /**
     * Gets the tipoInteraccion value for this SubtipoServicioSEGInstanceType.
     * 
     * @return tipoInteraccion
     */
    public com.hp.schemas.SM._7.Common.StringType getTipoInteraccion() {
        return tipoInteraccion;
    }


    /**
     * Sets the tipoInteraccion value for this SubtipoServicioSEGInstanceType.
     * 
     * @param tipoInteraccion
     */
    public void setTipoInteraccion(com.hp.schemas.SM._7.Common.StringType tipoInteraccion) {
        this.tipoInteraccion = tipoInteraccion;
    }


    /**
     * Gets the activo value for this SubtipoServicioSEGInstanceType.
     * 
     * @return activo
     */
    public com.hp.schemas.SM._7.Common.StringType getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this SubtipoServicioSEGInstanceType.
     * 
     * @param activo
     */
    public void setActivo(com.hp.schemas.SM._7.Common.StringType activo) {
        this.activo = activo;
    }


    /**
     * Gets the attachments value for this SubtipoServicioSEGInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this SubtipoServicioSEGInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this SubtipoServicioSEGInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this SubtipoServicioSEGInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this SubtipoServicioSEGInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this SubtipoServicioSEGInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this SubtipoServicioSEGInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this SubtipoServicioSEGInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this SubtipoServicioSEGInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this SubtipoServicioSEGInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubtipoServicioSEGInstanceType)) return false;
        SubtipoServicioSEGInstanceType other = (SubtipoServicioSEGInstanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nemonico==null && other.getNemonico()==null) || 
             (this.nemonico!=null &&
              this.nemonico.equals(other.getNemonico()))) &&
            ((this.tipoServicio==null && other.getTipoServicio()==null) || 
             (this.tipoServicio!=null &&
              this.tipoServicio.equals(other.getTipoServicio()))) &&
            ((this.tipoInteraccion==null && other.getTipoInteraccion()==null) || 
             (this.tipoInteraccion!=null &&
              this.tipoInteraccion.equals(other.getTipoInteraccion()))) &&
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNemonico() != null) {
            _hashCode += getNemonico().hashCode();
        }
        if (getTipoServicio() != null) {
            _hashCode += getTipoServicio().hashCode();
        }
        if (getTipoInteraccion() != null) {
            _hashCode += getTipoInteraccion().hashCode();
        }
        if (getActivo() != null) {
            _hashCode += getActivo().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubtipoServicioSEGInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "SubtipoServicioSEGInstanceType"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nemonico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Nemonico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TipoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoInteraccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TipoInteraccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Activo"));
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
