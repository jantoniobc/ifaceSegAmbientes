/**
 * IncidenteSP_SEGInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class IncidenteSP_SEGInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType idQueja;

    private com.hp.schemas.SM._7.Common.StringType estado;

    private com.hp.schemas.SM._7.Common.StringType NIS;

    private com.hp.schemas.SM._7.Common.DateTimeType fechaResolucionPrevista;

    private com.hp.schemas.SM._7.Common.StringType problemaReportado;

    private com.hp.schemas.SM._7.Common.StringType horarioAccesoDiaIni;

    private com.hp.schemas.SM._7.Common.StringType horarioAccesoDiaFin;

    private com.hp.schemas.SM._7.Common.StringType horarioAccesoHoraIni;

    private com.hp.schemas.SM._7.Common.StringType horarioAccesoHoraFin;

    private com.hp.schemas.SM._7.Common.StringType prioridad;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public IncidenteSP_SEGInstanceType() {
    }

    public IncidenteSP_SEGInstanceType(
           com.hp.schemas.SM._7.Common.StringType idQueja,
           com.hp.schemas.SM._7.Common.StringType estado,
           com.hp.schemas.SM._7.Common.StringType NIS,
           com.hp.schemas.SM._7.Common.DateTimeType fechaResolucionPrevista,
           com.hp.schemas.SM._7.Common.StringType problemaReportado,
           com.hp.schemas.SM._7.Common.StringType horarioAccesoDiaIni,
           com.hp.schemas.SM._7.Common.StringType horarioAccesoDiaFin,
           com.hp.schemas.SM._7.Common.StringType horarioAccesoHoraIni,
           com.hp.schemas.SM._7.Common.StringType horarioAccesoHoraFin,
           com.hp.schemas.SM._7.Common.StringType prioridad,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.idQueja = idQueja;
           this.estado = estado;
           this.NIS = NIS;
           this.fechaResolucionPrevista = fechaResolucionPrevista;
           this.problemaReportado = problemaReportado;
           this.horarioAccesoDiaIni = horarioAccesoDiaIni;
           this.horarioAccesoDiaFin = horarioAccesoDiaFin;
           this.horarioAccesoHoraIni = horarioAccesoHoraIni;
           this.horarioAccesoHoraFin = horarioAccesoHoraFin;
           this.prioridad = prioridad;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the idQueja value for this IncidenteSP_SEGInstanceType.
     * 
     * @return idQueja
     */
    public com.hp.schemas.SM._7.Common.StringType getIdQueja() {
        return idQueja;
    }


    /**
     * Sets the idQueja value for this IncidenteSP_SEGInstanceType.
     * 
     * @param idQueja
     */
    public void setIdQueja(com.hp.schemas.SM._7.Common.StringType idQueja) {
        this.idQueja = idQueja;
    }


    /**
     * Gets the estado value for this IncidenteSP_SEGInstanceType.
     * 
     * @return estado
     */
    public com.hp.schemas.SM._7.Common.StringType getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this IncidenteSP_SEGInstanceType.
     * 
     * @param estado
     */
    public void setEstado(com.hp.schemas.SM._7.Common.StringType estado) {
        this.estado = estado;
    }


    /**
     * Gets the NIS value for this IncidenteSP_SEGInstanceType.
     * 
     * @return NIS
     */
    public com.hp.schemas.SM._7.Common.StringType getNIS() {
        return NIS;
    }


    /**
     * Sets the NIS value for this IncidenteSP_SEGInstanceType.
     * 
     * @param NIS
     */
    public void setNIS(com.hp.schemas.SM._7.Common.StringType NIS) {
        this.NIS = NIS;
    }


    /**
     * Gets the fechaResolucionPrevista value for this IncidenteSP_SEGInstanceType.
     * 
     * @return fechaResolucionPrevista
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getFechaResolucionPrevista() {
        return fechaResolucionPrevista;
    }


    /**
     * Sets the fechaResolucionPrevista value for this IncidenteSP_SEGInstanceType.
     * 
     * @param fechaResolucionPrevista
     */
    public void setFechaResolucionPrevista(com.hp.schemas.SM._7.Common.DateTimeType fechaResolucionPrevista) {
        this.fechaResolucionPrevista = fechaResolucionPrevista;
    }


    /**
     * Gets the problemaReportado value for this IncidenteSP_SEGInstanceType.
     * 
     * @return problemaReportado
     */
    public com.hp.schemas.SM._7.Common.StringType getProblemaReportado() {
        return problemaReportado;
    }


    /**
     * Sets the problemaReportado value for this IncidenteSP_SEGInstanceType.
     * 
     * @param problemaReportado
     */
    public void setProblemaReportado(com.hp.schemas.SM._7.Common.StringType problemaReportado) {
        this.problemaReportado = problemaReportado;
    }


    /**
     * Gets the horarioAccesoDiaIni value for this IncidenteSP_SEGInstanceType.
     * 
     * @return horarioAccesoDiaIni
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioAccesoDiaIni() {
        return horarioAccesoDiaIni;
    }


    /**
     * Sets the horarioAccesoDiaIni value for this IncidenteSP_SEGInstanceType.
     * 
     * @param horarioAccesoDiaIni
     */
    public void setHorarioAccesoDiaIni(com.hp.schemas.SM._7.Common.StringType horarioAccesoDiaIni) {
        this.horarioAccesoDiaIni = horarioAccesoDiaIni;
    }


    /**
     * Gets the horarioAccesoDiaFin value for this IncidenteSP_SEGInstanceType.
     * 
     * @return horarioAccesoDiaFin
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioAccesoDiaFin() {
        return horarioAccesoDiaFin;
    }


    /**
     * Sets the horarioAccesoDiaFin value for this IncidenteSP_SEGInstanceType.
     * 
     * @param horarioAccesoDiaFin
     */
    public void setHorarioAccesoDiaFin(com.hp.schemas.SM._7.Common.StringType horarioAccesoDiaFin) {
        this.horarioAccesoDiaFin = horarioAccesoDiaFin;
    }


    /**
     * Gets the horarioAccesoHoraIni value for this IncidenteSP_SEGInstanceType.
     * 
     * @return horarioAccesoHoraIni
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioAccesoHoraIni() {
        return horarioAccesoHoraIni;
    }


    /**
     * Sets the horarioAccesoHoraIni value for this IncidenteSP_SEGInstanceType.
     * 
     * @param horarioAccesoHoraIni
     */
    public void setHorarioAccesoHoraIni(com.hp.schemas.SM._7.Common.StringType horarioAccesoHoraIni) {
        this.horarioAccesoHoraIni = horarioAccesoHoraIni;
    }


    /**
     * Gets the horarioAccesoHoraFin value for this IncidenteSP_SEGInstanceType.
     * 
     * @return horarioAccesoHoraFin
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioAccesoHoraFin() {
        return horarioAccesoHoraFin;
    }


    /**
     * Sets the horarioAccesoHoraFin value for this IncidenteSP_SEGInstanceType.
     * 
     * @param horarioAccesoHoraFin
     */
    public void setHorarioAccesoHoraFin(com.hp.schemas.SM._7.Common.StringType horarioAccesoHoraFin) {
        this.horarioAccesoHoraFin = horarioAccesoHoraFin;
    }


    /**
     * Gets the prioridad value for this IncidenteSP_SEGInstanceType.
     * 
     * @return prioridad
     */
    public com.hp.schemas.SM._7.Common.StringType getPrioridad() {
        return prioridad;
    }


    /**
     * Sets the prioridad value for this IncidenteSP_SEGInstanceType.
     * 
     * @param prioridad
     */
    public void setPrioridad(com.hp.schemas.SM._7.Common.StringType prioridad) {
        this.prioridad = prioridad;
    }


    /**
     * Gets the attachments value for this IncidenteSP_SEGInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this IncidenteSP_SEGInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this IncidenteSP_SEGInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this IncidenteSP_SEGInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this IncidenteSP_SEGInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this IncidenteSP_SEGInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this IncidenteSP_SEGInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this IncidenteSP_SEGInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this IncidenteSP_SEGInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this IncidenteSP_SEGInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncidenteSP_SEGInstanceType)) return false;
        IncidenteSP_SEGInstanceType other = (IncidenteSP_SEGInstanceType) obj;
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
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.NIS==null && other.getNIS()==null) || 
             (this.NIS!=null &&
              this.NIS.equals(other.getNIS()))) &&
            ((this.fechaResolucionPrevista==null && other.getFechaResolucionPrevista()==null) || 
             (this.fechaResolucionPrevista!=null &&
              this.fechaResolucionPrevista.equals(other.getFechaResolucionPrevista()))) &&
            ((this.problemaReportado==null && other.getProblemaReportado()==null) || 
             (this.problemaReportado!=null &&
              this.problemaReportado.equals(other.getProblemaReportado()))) &&
            ((this.horarioAccesoDiaIni==null && other.getHorarioAccesoDiaIni()==null) || 
             (this.horarioAccesoDiaIni!=null &&
              this.horarioAccesoDiaIni.equals(other.getHorarioAccesoDiaIni()))) &&
            ((this.horarioAccesoDiaFin==null && other.getHorarioAccesoDiaFin()==null) || 
             (this.horarioAccesoDiaFin!=null &&
              this.horarioAccesoDiaFin.equals(other.getHorarioAccesoDiaFin()))) &&
            ((this.horarioAccesoHoraIni==null && other.getHorarioAccesoHoraIni()==null) || 
             (this.horarioAccesoHoraIni!=null &&
              this.horarioAccesoHoraIni.equals(other.getHorarioAccesoHoraIni()))) &&
            ((this.horarioAccesoHoraFin==null && other.getHorarioAccesoHoraFin()==null) || 
             (this.horarioAccesoHoraFin!=null &&
              this.horarioAccesoHoraFin.equals(other.getHorarioAccesoHoraFin()))) &&
            ((this.prioridad==null && other.getPrioridad()==null) || 
             (this.prioridad!=null &&
              this.prioridad.equals(other.getPrioridad()))) &&
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
        if (getIdQueja() != null) {
            _hashCode += getIdQueja().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getNIS() != null) {
            _hashCode += getNIS().hashCode();
        }
        if (getFechaResolucionPrevista() != null) {
            _hashCode += getFechaResolucionPrevista().hashCode();
        }
        if (getProblemaReportado() != null) {
            _hashCode += getProblemaReportado().hashCode();
        }
        if (getHorarioAccesoDiaIni() != null) {
            _hashCode += getHorarioAccesoDiaIni().hashCode();
        }
        if (getHorarioAccesoDiaFin() != null) {
            _hashCode += getHorarioAccesoDiaFin().hashCode();
        }
        if (getHorarioAccesoHoraIni() != null) {
            _hashCode += getHorarioAccesoHoraIni().hashCode();
        }
        if (getHorarioAccesoHoraFin() != null) {
            _hashCode += getHorarioAccesoHoraFin().hashCode();
        }
        if (getPrioridad() != null) {
            _hashCode += getPrioridad().hashCode();
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
        new org.apache.axis.description.TypeDesc(IncidenteSP_SEGInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IncidenteSP_SEGInstanceType"));
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
        elemField.setFieldName("idQueja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IdQueja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "NIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaResolucionPrevista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "FechaResolucionPrevista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemaReportado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ProblemaReportado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioAccesoDiaIni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioAccesoDiaIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioAccesoDiaFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioAccesoDiaFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioAccesoHoraIni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioAccesoHoraIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioAccesoHoraFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioAccesoHoraFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Prioridad"));
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
