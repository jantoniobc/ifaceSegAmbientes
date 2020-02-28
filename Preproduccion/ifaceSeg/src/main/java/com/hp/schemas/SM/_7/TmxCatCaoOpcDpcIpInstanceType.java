/**
 * TmxCatCaoOpcDpcIpInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class TmxCatCaoOpcDpcIpInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.DecimalType id;

    private com.hp.schemas.SM._7.Common.StringType central;

    private com.hp.schemas.SM._7.Common.StringType ido;

    private com.hp.schemas.SM._7.Common.StringType idd;

    private com.hp.schemas.SM._7.Common.StringType bcd;

    private com.hp.schemas.SM._7.Common.StringType activo;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public TmxCatCaoOpcDpcIpInstanceType() {
    }

    public TmxCatCaoOpcDpcIpInstanceType(
           com.hp.schemas.SM._7.Common.DecimalType id,
           com.hp.schemas.SM._7.Common.StringType central,
           com.hp.schemas.SM._7.Common.StringType ido,
           com.hp.schemas.SM._7.Common.StringType idd,
           com.hp.schemas.SM._7.Common.StringType bcd,
           com.hp.schemas.SM._7.Common.StringType activo,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.id = id;
           this.central = central;
           this.ido = ido;
           this.idd = idd;
           this.bcd = bcd;
           this.activo = activo;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the id value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return id
     */
    public com.hp.schemas.SM._7.Common.DecimalType getId() {
        return id;
    }


    /**
     * Sets the id value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param id
     */
    public void setId(com.hp.schemas.SM._7.Common.DecimalType id) {
        this.id = id;
    }


    /**
     * Gets the central value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return central
     */
    public com.hp.schemas.SM._7.Common.StringType getCentral() {
        return central;
    }


    /**
     * Sets the central value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param central
     */
    public void setCentral(com.hp.schemas.SM._7.Common.StringType central) {
        this.central = central;
    }


    /**
     * Gets the ido value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return ido
     */
    public com.hp.schemas.SM._7.Common.StringType getIdo() {
        return ido;
    }


    /**
     * Sets the ido value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param ido
     */
    public void setIdo(com.hp.schemas.SM._7.Common.StringType ido) {
        this.ido = ido;
    }


    /**
     * Gets the idd value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return idd
     */
    public com.hp.schemas.SM._7.Common.StringType getIdd() {
        return idd;
    }


    /**
     * Sets the idd value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param idd
     */
    public void setIdd(com.hp.schemas.SM._7.Common.StringType idd) {
        this.idd = idd;
    }


    /**
     * Gets the bcd value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return bcd
     */
    public com.hp.schemas.SM._7.Common.StringType getBcd() {
        return bcd;
    }


    /**
     * Sets the bcd value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param bcd
     */
    public void setBcd(com.hp.schemas.SM._7.Common.StringType bcd) {
        this.bcd = bcd;
    }


    /**
     * Gets the activo value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return activo
     */
    public com.hp.schemas.SM._7.Common.StringType getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param activo
     */
    public void setActivo(com.hp.schemas.SM._7.Common.StringType activo) {
        this.activo = activo;
    }


    /**
     * Gets the attachments value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this TmxCatCaoOpcDpcIpInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TmxCatCaoOpcDpcIpInstanceType)) return false;
        TmxCatCaoOpcDpcIpInstanceType other = (TmxCatCaoOpcDpcIpInstanceType) obj;
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
            ((this.central==null && other.getCentral()==null) || 
             (this.central!=null &&
              this.central.equals(other.getCentral()))) &&
            ((this.ido==null && other.getIdo()==null) || 
             (this.ido!=null &&
              this.ido.equals(other.getIdo()))) &&
            ((this.idd==null && other.getIdd()==null) || 
             (this.idd!=null &&
              this.idd.equals(other.getIdd()))) &&
            ((this.bcd==null && other.getBcd()==null) || 
             (this.bcd!=null &&
              this.bcd.equals(other.getBcd()))) &&
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
        if (getCentral() != null) {
            _hashCode += getCentral().hashCode();
        }
        if (getIdo() != null) {
            _hashCode += getIdo().hashCode();
        }
        if (getIdd() != null) {
            _hashCode += getIdd().hashCode();
        }
        if (getBcd() != null) {
            _hashCode += getBcd().hashCode();
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
        new org.apache.axis.description.TypeDesc(TmxCatCaoOpcDpcIpInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxCatCaoOpcDpcIpInstanceType"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("central");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "idd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "bcd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "activo"));
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
