/**
 * TmxCaoBitaComunInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class TmxCaoBitaComunInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.DecimalType id;

    private com.hp.schemas.SM._7.Common.DateTimeType fecha;

    private com.hp.schemas.SM._7.Common.StringType evento;

    private com.hp.schemas.SM._7.Common.StringType fase;

    private com.hp.schemas.SM._7.Common.StringType tipoActualizacion;

    private com.hp.schemas.SM._7.Common.StringType usuario;

    private com.hp.schemas.SM._7.TmxCaoBitaComunInstanceTypeComentario comentario;

    private com.hp.schemas.SM._7.Common.StringType nombre;

    private com.hp.schemas.SM._7.Common.StringType grupo;

    private com.hp.schemas.SM._7.Common.BooleanType acuse;

    private com.hp.schemas.SM._7.Common.DateTimeType acuseFecha;

    private com.hp.schemas.SM._7.Common.StringType acusoUsuario;

    private com.hp.schemas.SM._7.Common.StringType idExterno;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public TmxCaoBitaComunInstanceType() {
    }

    public TmxCaoBitaComunInstanceType(
           com.hp.schemas.SM._7.Common.DecimalType id,
           com.hp.schemas.SM._7.Common.DateTimeType fecha,
           com.hp.schemas.SM._7.Common.StringType evento,
           com.hp.schemas.SM._7.Common.StringType fase,
           com.hp.schemas.SM._7.Common.StringType tipoActualizacion,
           com.hp.schemas.SM._7.Common.StringType usuario,
           com.hp.schemas.SM._7.TmxCaoBitaComunInstanceTypeComentario comentario,
           com.hp.schemas.SM._7.Common.StringType nombre,
           com.hp.schemas.SM._7.Common.StringType grupo,
           com.hp.schemas.SM._7.Common.BooleanType acuse,
           com.hp.schemas.SM._7.Common.DateTimeType acuseFecha,
           com.hp.schemas.SM._7.Common.StringType acusoUsuario,
           com.hp.schemas.SM._7.Common.StringType idExterno,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.id = id;
           this.fecha = fecha;
           this.evento = evento;
           this.fase = fase;
           this.tipoActualizacion = tipoActualizacion;
           this.usuario = usuario;
           this.comentario = comentario;
           this.nombre = nombre;
           this.grupo = grupo;
           this.acuse = acuse;
           this.acuseFecha = acuseFecha;
           this.acusoUsuario = acusoUsuario;
           this.idExterno = idExterno;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the id value for this TmxCaoBitaComunInstanceType.
     * 
     * @return id
     */
    public com.hp.schemas.SM._7.Common.DecimalType getId() {
        return id;
    }


    /**
     * Sets the id value for this TmxCaoBitaComunInstanceType.
     * 
     * @param id
     */
    public void setId(com.hp.schemas.SM._7.Common.DecimalType id) {
        this.id = id;
    }


    /**
     * Gets the fecha value for this TmxCaoBitaComunInstanceType.
     * 
     * @return fecha
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this TmxCaoBitaComunInstanceType.
     * 
     * @param fecha
     */
    public void setFecha(com.hp.schemas.SM._7.Common.DateTimeType fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the evento value for this TmxCaoBitaComunInstanceType.
     * 
     * @return evento
     */
    public com.hp.schemas.SM._7.Common.StringType getEvento() {
        return evento;
    }


    /**
     * Sets the evento value for this TmxCaoBitaComunInstanceType.
     * 
     * @param evento
     */
    public void setEvento(com.hp.schemas.SM._7.Common.StringType evento) {
        this.evento = evento;
    }


    /**
     * Gets the fase value for this TmxCaoBitaComunInstanceType.
     * 
     * @return fase
     */
    public com.hp.schemas.SM._7.Common.StringType getFase() {
        return fase;
    }


    /**
     * Sets the fase value for this TmxCaoBitaComunInstanceType.
     * 
     * @param fase
     */
    public void setFase(com.hp.schemas.SM._7.Common.StringType fase) {
        this.fase = fase;
    }


    /**
     * Gets the tipoActualizacion value for this TmxCaoBitaComunInstanceType.
     * 
     * @return tipoActualizacion
     */
    public com.hp.schemas.SM._7.Common.StringType getTipoActualizacion() {
        return tipoActualizacion;
    }


    /**
     * Sets the tipoActualizacion value for this TmxCaoBitaComunInstanceType.
     * 
     * @param tipoActualizacion
     */
    public void setTipoActualizacion(com.hp.schemas.SM._7.Common.StringType tipoActualizacion) {
        this.tipoActualizacion = tipoActualizacion;
    }


    /**
     * Gets the usuario value for this TmxCaoBitaComunInstanceType.
     * 
     * @return usuario
     */
    public com.hp.schemas.SM._7.Common.StringType getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this TmxCaoBitaComunInstanceType.
     * 
     * @param usuario
     */
    public void setUsuario(com.hp.schemas.SM._7.Common.StringType usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the comentario value for this TmxCaoBitaComunInstanceType.
     * 
     * @return comentario
     */
    public com.hp.schemas.SM._7.TmxCaoBitaComunInstanceTypeComentario getComentario() {
        return comentario;
    }


    /**
     * Sets the comentario value for this TmxCaoBitaComunInstanceType.
     * 
     * @param comentario
     */
    public void setComentario(com.hp.schemas.SM._7.TmxCaoBitaComunInstanceTypeComentario comentario) {
        this.comentario = comentario;
    }


    /**
     * Gets the nombre value for this TmxCaoBitaComunInstanceType.
     * 
     * @return nombre
     */
    public com.hp.schemas.SM._7.Common.StringType getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this TmxCaoBitaComunInstanceType.
     * 
     * @param nombre
     */
    public void setNombre(com.hp.schemas.SM._7.Common.StringType nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the grupo value for this TmxCaoBitaComunInstanceType.
     * 
     * @return grupo
     */
    public com.hp.schemas.SM._7.Common.StringType getGrupo() {
        return grupo;
    }


    /**
     * Sets the grupo value for this TmxCaoBitaComunInstanceType.
     * 
     * @param grupo
     */
    public void setGrupo(com.hp.schemas.SM._7.Common.StringType grupo) {
        this.grupo = grupo;
    }


    /**
     * Gets the acuse value for this TmxCaoBitaComunInstanceType.
     * 
     * @return acuse
     */
    public com.hp.schemas.SM._7.Common.BooleanType getAcuse() {
        return acuse;
    }


    /**
     * Sets the acuse value for this TmxCaoBitaComunInstanceType.
     * 
     * @param acuse
     */
    public void setAcuse(com.hp.schemas.SM._7.Common.BooleanType acuse) {
        this.acuse = acuse;
    }


    /**
     * Gets the acuseFecha value for this TmxCaoBitaComunInstanceType.
     * 
     * @return acuseFecha
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getAcuseFecha() {
        return acuseFecha;
    }


    /**
     * Sets the acuseFecha value for this TmxCaoBitaComunInstanceType.
     * 
     * @param acuseFecha
     */
    public void setAcuseFecha(com.hp.schemas.SM._7.Common.DateTimeType acuseFecha) {
        this.acuseFecha = acuseFecha;
    }


    /**
     * Gets the acusoUsuario value for this TmxCaoBitaComunInstanceType.
     * 
     * @return acusoUsuario
     */
    public com.hp.schemas.SM._7.Common.StringType getAcusoUsuario() {
        return acusoUsuario;
    }


    /**
     * Sets the acusoUsuario value for this TmxCaoBitaComunInstanceType.
     * 
     * @param acusoUsuario
     */
    public void setAcusoUsuario(com.hp.schemas.SM._7.Common.StringType acusoUsuario) {
        this.acusoUsuario = acusoUsuario;
    }


    /**
     * Gets the idExterno value for this TmxCaoBitaComunInstanceType.
     * 
     * @return idExterno
     */
    public com.hp.schemas.SM._7.Common.StringType getIdExterno() {
        return idExterno;
    }


    /**
     * Sets the idExterno value for this TmxCaoBitaComunInstanceType.
     * 
     * @param idExterno
     */
    public void setIdExterno(com.hp.schemas.SM._7.Common.StringType idExterno) {
        this.idExterno = idExterno;
    }


    /**
     * Gets the attachments value for this TmxCaoBitaComunInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this TmxCaoBitaComunInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this TmxCaoBitaComunInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this TmxCaoBitaComunInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this TmxCaoBitaComunInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this TmxCaoBitaComunInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this TmxCaoBitaComunInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this TmxCaoBitaComunInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this TmxCaoBitaComunInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this TmxCaoBitaComunInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TmxCaoBitaComunInstanceType)) return false;
        TmxCaoBitaComunInstanceType other = (TmxCaoBitaComunInstanceType) obj;
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
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.evento==null && other.getEvento()==null) || 
             (this.evento!=null &&
              this.evento.equals(other.getEvento()))) &&
            ((this.fase==null && other.getFase()==null) || 
             (this.fase!=null &&
              this.fase.equals(other.getFase()))) &&
            ((this.tipoActualizacion==null && other.getTipoActualizacion()==null) || 
             (this.tipoActualizacion!=null &&
              this.tipoActualizacion.equals(other.getTipoActualizacion()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.comentario==null && other.getComentario()==null) || 
             (this.comentario!=null &&
              this.comentario.equals(other.getComentario()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.grupo==null && other.getGrupo()==null) || 
             (this.grupo!=null &&
              this.grupo.equals(other.getGrupo()))) &&
            ((this.acuse==null && other.getAcuse()==null) || 
             (this.acuse!=null &&
              this.acuse.equals(other.getAcuse()))) &&
            ((this.acuseFecha==null && other.getAcuseFecha()==null) || 
             (this.acuseFecha!=null &&
              this.acuseFecha.equals(other.getAcuseFecha()))) &&
            ((this.acusoUsuario==null && other.getAcusoUsuario()==null) || 
             (this.acusoUsuario!=null &&
              this.acusoUsuario.equals(other.getAcusoUsuario()))) &&
            ((this.idExterno==null && other.getIdExterno()==null) || 
             (this.idExterno!=null &&
              this.idExterno.equals(other.getIdExterno()))) &&
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
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getEvento() != null) {
            _hashCode += getEvento().hashCode();
        }
        if (getFase() != null) {
            _hashCode += getFase().hashCode();
        }
        if (getTipoActualizacion() != null) {
            _hashCode += getTipoActualizacion().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getComentario() != null) {
            _hashCode += getComentario().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getGrupo() != null) {
            _hashCode += getGrupo().hashCode();
        }
        if (getAcuse() != null) {
            _hashCode += getAcuse().hashCode();
        }
        if (getAcuseFecha() != null) {
            _hashCode += getAcuseFecha().hashCode();
        }
        if (getAcusoUsuario() != null) {
            _hashCode += getAcusoUsuario().hashCode();
        }
        if (getIdExterno() != null) {
            _hashCode += getIdExterno().hashCode();
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
        new org.apache.axis.description.TypeDesc(TmxCaoBitaComunInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TmxCaoBitaComunInstanceType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Evento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Fase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoActualizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TipoActualizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comentario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Comentario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">TmxCaoBitaComunInstanceType>Comentario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Grupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acuse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Acuse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acuseFecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "AcuseFecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acusoUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "AcusoUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idExterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IdExterno"));
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
