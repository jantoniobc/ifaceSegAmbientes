/**
 * InteraccionSPHistoryInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class InteraccionSPHistoryInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType numeroActividad;

    private com.hp.schemas.SM._7.Common.StringType idQueja;

    private com.hp.schemas.SM._7.Common.StringType tipo;

    private com.hp.schemas.SM._7.Common.DateTimeType fechaHora;

    private com.hp.schemas.SM._7.Common.StringType operador;

    private com.hp.schemas.SM._7.InteraccionSPHistoryInstanceTypeDescripcion descripcion;

    private com.hp.schemas.SM._7.Common.BooleanType visibleCliente;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public InteraccionSPHistoryInstanceType() {
    }

    public InteraccionSPHistoryInstanceType(
           com.hp.schemas.SM._7.Common.StringType numeroActividad,
           com.hp.schemas.SM._7.Common.StringType idQueja,
           com.hp.schemas.SM._7.Common.StringType tipo,
           com.hp.schemas.SM._7.Common.DateTimeType fechaHora,
           com.hp.schemas.SM._7.Common.StringType operador,
           com.hp.schemas.SM._7.InteraccionSPHistoryInstanceTypeDescripcion descripcion,
           com.hp.schemas.SM._7.Common.BooleanType visibleCliente,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.numeroActividad = numeroActividad;
           this.idQueja = idQueja;
           this.tipo = tipo;
           this.fechaHora = fechaHora;
           this.operador = operador;
           this.descripcion = descripcion;
           this.visibleCliente = visibleCliente;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the numeroActividad value for this InteraccionSPHistoryInstanceType.
     * 
     * @return numeroActividad
     */
    public com.hp.schemas.SM._7.Common.StringType getNumeroActividad() {
        return numeroActividad;
    }


    /**
     * Sets the numeroActividad value for this InteraccionSPHistoryInstanceType.
     * 
     * @param numeroActividad
     */
    public void setNumeroActividad(com.hp.schemas.SM._7.Common.StringType numeroActividad) {
        this.numeroActividad = numeroActividad;
    }


    /**
     * Gets the idQueja value for this InteraccionSPHistoryInstanceType.
     * 
     * @return idQueja
     */
    public com.hp.schemas.SM._7.Common.StringType getIdQueja() {
        return idQueja;
    }


    /**
     * Sets the idQueja value for this InteraccionSPHistoryInstanceType.
     * 
     * @param idQueja
     */
    public void setIdQueja(com.hp.schemas.SM._7.Common.StringType idQueja) {
        this.idQueja = idQueja;
    }


    /**
     * Gets the tipo value for this InteraccionSPHistoryInstanceType.
     * 
     * @return tipo
     */
    public com.hp.schemas.SM._7.Common.StringType getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this InteraccionSPHistoryInstanceType.
     * 
     * @param tipo
     */
    public void setTipo(com.hp.schemas.SM._7.Common.StringType tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the fechaHora value for this InteraccionSPHistoryInstanceType.
     * 
     * @return fechaHora
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getFechaHora() {
        return fechaHora;
    }


    /**
     * Sets the fechaHora value for this InteraccionSPHistoryInstanceType.
     * 
     * @param fechaHora
     */
    public void setFechaHora(com.hp.schemas.SM._7.Common.DateTimeType fechaHora) {
        this.fechaHora = fechaHora;
    }


    /**
     * Gets the operador value for this InteraccionSPHistoryInstanceType.
     * 
     * @return operador
     */
    public com.hp.schemas.SM._7.Common.StringType getOperador() {
        return operador;
    }


    /**
     * Sets the operador value for this InteraccionSPHistoryInstanceType.
     * 
     * @param operador
     */
    public void setOperador(com.hp.schemas.SM._7.Common.StringType operador) {
        this.operador = operador;
    }


    /**
     * Gets the descripcion value for this InteraccionSPHistoryInstanceType.
     * 
     * @return descripcion
     */
    public com.hp.schemas.SM._7.InteraccionSPHistoryInstanceTypeDescripcion getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this InteraccionSPHistoryInstanceType.
     * 
     * @param descripcion
     */
    public void setDescripcion(com.hp.schemas.SM._7.InteraccionSPHistoryInstanceTypeDescripcion descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the visibleCliente value for this InteraccionSPHistoryInstanceType.
     * 
     * @return visibleCliente
     */
    public com.hp.schemas.SM._7.Common.BooleanType getVisibleCliente() {
        return visibleCliente;
    }


    /**
     * Sets the visibleCliente value for this InteraccionSPHistoryInstanceType.
     * 
     * @param visibleCliente
     */
    public void setVisibleCliente(com.hp.schemas.SM._7.Common.BooleanType visibleCliente) {
        this.visibleCliente = visibleCliente;
    }


    /**
     * Gets the attachments value for this InteraccionSPHistoryInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this InteraccionSPHistoryInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this InteraccionSPHistoryInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this InteraccionSPHistoryInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this InteraccionSPHistoryInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this InteraccionSPHistoryInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this InteraccionSPHistoryInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this InteraccionSPHistoryInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this InteraccionSPHistoryInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this InteraccionSPHistoryInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InteraccionSPHistoryInstanceType)) return false;
        InteraccionSPHistoryInstanceType other = (InteraccionSPHistoryInstanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroActividad==null && other.getNumeroActividad()==null) || 
             (this.numeroActividad!=null &&
              this.numeroActividad.equals(other.getNumeroActividad()))) &&
            ((this.idQueja==null && other.getIdQueja()==null) || 
             (this.idQueja!=null &&
              this.idQueja.equals(other.getIdQueja()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.fechaHora==null && other.getFechaHora()==null) || 
             (this.fechaHora!=null &&
              this.fechaHora.equals(other.getFechaHora()))) &&
            ((this.operador==null && other.getOperador()==null) || 
             (this.operador!=null &&
              this.operador.equals(other.getOperador()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.visibleCliente==null && other.getVisibleCliente()==null) || 
             (this.visibleCliente!=null &&
              this.visibleCliente.equals(other.getVisibleCliente()))) &&
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
        if (getNumeroActividad() != null) {
            _hashCode += getNumeroActividad().hashCode();
        }
        if (getIdQueja() != null) {
            _hashCode += getIdQueja().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getFechaHora() != null) {
            _hashCode += getFechaHora().hashCode();
        }
        if (getOperador() != null) {
            _hashCode += getOperador().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getVisibleCliente() != null) {
            _hashCode += getVisibleCliente().hashCode();
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
        new org.apache.axis.description.TypeDesc(InteraccionSPHistoryInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "InteraccionSPHistoryInstanceType"));
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
        elemField.setFieldName("numeroActividad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "NumeroActividad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idQueja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IdQueja"));
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
        elemField.setFieldName("fechaHora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "FechaHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Operador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">InteraccionSPHistoryInstanceType>Descripcion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "VisibleCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "BooleanType"));
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
