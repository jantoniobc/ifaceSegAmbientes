/**
 * InfoSidecciEmpresaSmSegInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class InfoSidecciEmpresaSmSegInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType query;

    private com.hp.schemas.SM._7.Common.StringType folioConcesionario;

    private com.hp.schemas.SM._7.Common.StringType referencia;

    private com.hp.schemas.SM._7.Common.StringType NIS;

    private com.hp.schemas.SM._7.Common.StringType problemaReportado;

    private com.hp.schemas.SM._7.Common.StringType horarioAcceso;

    private com.hp.schemas.SM._7.Common.StringType horarioDe;

    private com.hp.schemas.SM._7.Common.StringType horarioAcceso2;

    private com.hp.schemas.SM._7.Common.StringType horarioA;

    private com.hp.schemas.SM._7.Common.StringType estadoGlobal;

    private com.hp.schemas.SM._7.Common.DateTimeType fechaHorareparacion;

    private com.hp.schemas.SM._7.Common.StringType prioridad;

    private com.hp.schemas.SM._7.InfoSidecciEmpresaSmSegInstanceTypeConsultaResultado consultaResultado;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query2;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public InfoSidecciEmpresaSmSegInstanceType() {
    }

    public InfoSidecciEmpresaSmSegInstanceType(
           com.hp.schemas.SM._7.Common.StringType query,
           com.hp.schemas.SM._7.Common.StringType folioConcesionario,
           com.hp.schemas.SM._7.Common.StringType referencia,
           com.hp.schemas.SM._7.Common.StringType NIS,
           com.hp.schemas.SM._7.Common.StringType problemaReportado,
           com.hp.schemas.SM._7.Common.StringType horarioAcceso,
           com.hp.schemas.SM._7.Common.StringType horarioDe,
           com.hp.schemas.SM._7.Common.StringType horarioAcceso2,
           com.hp.schemas.SM._7.Common.StringType horarioA,
           com.hp.schemas.SM._7.Common.StringType estadoGlobal,
           com.hp.schemas.SM._7.Common.DateTimeType fechaHorareparacion,
           com.hp.schemas.SM._7.Common.StringType prioridad,
           com.hp.schemas.SM._7.InfoSidecciEmpresaSmSegInstanceTypeConsultaResultado consultaResultado,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query2,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.query = query;
           this.folioConcesionario = folioConcesionario;
           this.referencia = referencia;
           this.NIS = NIS;
           this.problemaReportado = problemaReportado;
           this.horarioAcceso = horarioAcceso;
           this.horarioDe = horarioDe;
           this.horarioAcceso2 = horarioAcceso2;
           this.horarioA = horarioA;
           this.estadoGlobal = estadoGlobal;
           this.fechaHorareparacion = fechaHorareparacion;
           this.prioridad = prioridad;
           this.consultaResultado = consultaResultado;
           this.attachments = attachments;
           this.query2 = query2;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the query value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return query
     */
    public com.hp.schemas.SM._7.Common.StringType getQuery() {
        return query;
    }


    /**
     * Sets the query value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param query
     */
    public void setQuery(com.hp.schemas.SM._7.Common.StringType query) {
        this.query = query;
    }


    /**
     * Gets the folioConcesionario value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return folioConcesionario
     */
    public com.hp.schemas.SM._7.Common.StringType getFolioConcesionario() {
        return folioConcesionario;
    }


    /**
     * Sets the folioConcesionario value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param folioConcesionario
     */
    public void setFolioConcesionario(com.hp.schemas.SM._7.Common.StringType folioConcesionario) {
        this.folioConcesionario = folioConcesionario;
    }


    /**
     * Gets the referencia value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return referencia
     */
    public com.hp.schemas.SM._7.Common.StringType getReferencia() {
        return referencia;
    }


    /**
     * Sets the referencia value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param referencia
     */
    public void setReferencia(com.hp.schemas.SM._7.Common.StringType referencia) {
        this.referencia = referencia;
    }


    /**
     * Gets the NIS value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return NIS
     */
    public com.hp.schemas.SM._7.Common.StringType getNIS() {
        return NIS;
    }


    /**
     * Sets the NIS value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param NIS
     */
    public void setNIS(com.hp.schemas.SM._7.Common.StringType NIS) {
        this.NIS = NIS;
    }


    /**
     * Gets the problemaReportado value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return problemaReportado
     */
    public com.hp.schemas.SM._7.Common.StringType getProblemaReportado() {
        return problemaReportado;
    }


    /**
     * Sets the problemaReportado value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param problemaReportado
     */
    public void setProblemaReportado(com.hp.schemas.SM._7.Common.StringType problemaReportado) {
        this.problemaReportado = problemaReportado;
    }


    /**
     * Gets the horarioAcceso value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return horarioAcceso
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioAcceso() {
        return horarioAcceso;
    }


    /**
     * Sets the horarioAcceso value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param horarioAcceso
     */
    public void setHorarioAcceso(com.hp.schemas.SM._7.Common.StringType horarioAcceso) {
        this.horarioAcceso = horarioAcceso;
    }


    /**
     * Gets the horarioDe value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return horarioDe
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioDe() {
        return horarioDe;
    }


    /**
     * Sets the horarioDe value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param horarioDe
     */
    public void setHorarioDe(com.hp.schemas.SM._7.Common.StringType horarioDe) {
        this.horarioDe = horarioDe;
    }


    /**
     * Gets the horarioAcceso2 value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return horarioAcceso2
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioAcceso2() {
        return horarioAcceso2;
    }


    /**
     * Sets the horarioAcceso2 value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param horarioAcceso2
     */
    public void setHorarioAcceso2(com.hp.schemas.SM._7.Common.StringType horarioAcceso2) {
        this.horarioAcceso2 = horarioAcceso2;
    }


    /**
     * Gets the horarioA value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return horarioA
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioA() {
        return horarioA;
    }


    /**
     * Sets the horarioA value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param horarioA
     */
    public void setHorarioA(com.hp.schemas.SM._7.Common.StringType horarioA) {
        this.horarioA = horarioA;
    }


    /**
     * Gets the estadoGlobal value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return estadoGlobal
     */
    public com.hp.schemas.SM._7.Common.StringType getEstadoGlobal() {
        return estadoGlobal;
    }


    /**
     * Sets the estadoGlobal value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param estadoGlobal
     */
    public void setEstadoGlobal(com.hp.schemas.SM._7.Common.StringType estadoGlobal) {
        this.estadoGlobal = estadoGlobal;
    }


    /**
     * Gets the fechaHorareparacion value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return fechaHorareparacion
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getFechaHorareparacion() {
        return fechaHorareparacion;
    }


    /**
     * Sets the fechaHorareparacion value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param fechaHorareparacion
     */
    public void setFechaHorareparacion(com.hp.schemas.SM._7.Common.DateTimeType fechaHorareparacion) {
        this.fechaHorareparacion = fechaHorareparacion;
    }


    /**
     * Gets the prioridad value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return prioridad
     */
    public com.hp.schemas.SM._7.Common.StringType getPrioridad() {
        return prioridad;
    }


    /**
     * Sets the prioridad value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param prioridad
     */
    public void setPrioridad(com.hp.schemas.SM._7.Common.StringType prioridad) {
        this.prioridad = prioridad;
    }


    /**
     * Gets the consultaResultado value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return consultaResultado
     */
    public com.hp.schemas.SM._7.InfoSidecciEmpresaSmSegInstanceTypeConsultaResultado getConsultaResultado() {
        return consultaResultado;
    }


    /**
     * Sets the consultaResultado value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param consultaResultado
     */
    public void setConsultaResultado(com.hp.schemas.SM._7.InfoSidecciEmpresaSmSegInstanceTypeConsultaResultado consultaResultado) {
        this.consultaResultado = consultaResultado;
    }


    /**
     * Gets the attachments value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query2 value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return query2
     */
    public java.lang.String getQuery2() {
        return query2;
    }


    /**
     * Sets the query2 value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param query2
     */
    public void setQuery2(java.lang.String query2) {
        this.query2 = query2;
    }


    /**
     * Gets the uniquequery value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this InfoSidecciEmpresaSmSegInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoSidecciEmpresaSmSegInstanceType)) return false;
        InfoSidecciEmpresaSmSegInstanceType other = (InfoSidecciEmpresaSmSegInstanceType) obj;
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
            ((this.folioConcesionario==null && other.getFolioConcesionario()==null) || 
             (this.folioConcesionario!=null &&
              this.folioConcesionario.equals(other.getFolioConcesionario()))) &&
            ((this.referencia==null && other.getReferencia()==null) || 
             (this.referencia!=null &&
              this.referencia.equals(other.getReferencia()))) &&
            ((this.NIS==null && other.getNIS()==null) || 
             (this.NIS!=null &&
              this.NIS.equals(other.getNIS()))) &&
            ((this.problemaReportado==null && other.getProblemaReportado()==null) || 
             (this.problemaReportado!=null &&
              this.problemaReportado.equals(other.getProblemaReportado()))) &&
            ((this.horarioAcceso==null && other.getHorarioAcceso()==null) || 
             (this.horarioAcceso!=null &&
              this.horarioAcceso.equals(other.getHorarioAcceso()))) &&
            ((this.horarioDe==null && other.getHorarioDe()==null) || 
             (this.horarioDe!=null &&
              this.horarioDe.equals(other.getHorarioDe()))) &&
            ((this.horarioAcceso2==null && other.getHorarioAcceso2()==null) || 
             (this.horarioAcceso2!=null &&
              this.horarioAcceso2.equals(other.getHorarioAcceso2()))) &&
            ((this.horarioA==null && other.getHorarioA()==null) || 
             (this.horarioA!=null &&
              this.horarioA.equals(other.getHorarioA()))) &&
            ((this.estadoGlobal==null && other.getEstadoGlobal()==null) || 
             (this.estadoGlobal!=null &&
              this.estadoGlobal.equals(other.getEstadoGlobal()))) &&
            ((this.fechaHorareparacion==null && other.getFechaHorareparacion()==null) || 
             (this.fechaHorareparacion!=null &&
              this.fechaHorareparacion.equals(other.getFechaHorareparacion()))) &&
            ((this.prioridad==null && other.getPrioridad()==null) || 
             (this.prioridad!=null &&
              this.prioridad.equals(other.getPrioridad()))) &&
            ((this.consultaResultado==null && other.getConsultaResultado()==null) || 
             (this.consultaResultado!=null &&
              this.consultaResultado.equals(other.getConsultaResultado()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.query2==null && other.getQuery2()==null) || 
             (this.query2!=null &&
              this.query2.equals(other.getQuery2()))) &&
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getFolioConcesionario() != null) {
            _hashCode += getFolioConcesionario().hashCode();
        }
        if (getReferencia() != null) {
            _hashCode += getReferencia().hashCode();
        }
        if (getNIS() != null) {
            _hashCode += getNIS().hashCode();
        }
        if (getProblemaReportado() != null) {
            _hashCode += getProblemaReportado().hashCode();
        }
        if (getHorarioAcceso() != null) {
            _hashCode += getHorarioAcceso().hashCode();
        }
        if (getHorarioDe() != null) {
            _hashCode += getHorarioDe().hashCode();
        }
        if (getHorarioAcceso2() != null) {
            _hashCode += getHorarioAcceso2().hashCode();
        }
        if (getHorarioA() != null) {
            _hashCode += getHorarioA().hashCode();
        }
        if (getEstadoGlobal() != null) {
            _hashCode += getEstadoGlobal().hashCode();
        }
        if (getFechaHorareparacion() != null) {
            _hashCode += getFechaHorareparacion().hashCode();
        }
        if (getPrioridad() != null) {
            _hashCode += getPrioridad().hashCode();
        }
        if (getConsultaResultado() != null) {
            _hashCode += getConsultaResultado().hashCode();
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
        if (getQuery2() != null) {
            _hashCode += getQuery2().hashCode();
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
        new org.apache.axis.description.TypeDesc(InfoSidecciEmpresaSmSegInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "infoSidecciEmpresaSmSegInstanceType"));
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
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioConcesionario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "FolioConcesionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Referencia"));
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
        elemField.setFieldName("problemaReportado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ProblemaReportado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioAcceso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioAcceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioDe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioDe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioAcceso2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioAcceso2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "EstadoGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHorareparacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "FechaHorareparacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
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
        elemField.setFieldName("consultaResultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "consultaResultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">infoSidecciEmpresaSmSegInstanceType>consultaResultado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
