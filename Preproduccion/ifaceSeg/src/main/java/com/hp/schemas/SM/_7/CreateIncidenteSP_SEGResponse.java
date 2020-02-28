/**
 * CreateIncidenteSP_SEGResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class CreateIncidenteSP_SEGResponse  implements java.io.Serializable {
    private com.hp.schemas.SM._7.IncidenteSP_SEGModelType model;

    private com.hp.schemas.SM._7.Common.MessageType[] messages;

    private com.hp.schemas.SM._7.Common.StatusType status;  // attribute

    private java.lang.String message;  // attribute

    private java.util.Date schemaRevisionDate;  // attribute

    private int schemaRevisionLevel;  // attribute

    private java.math.BigDecimal returnCode;  // attribute

    private java.lang.String query;  // attribute

    public CreateIncidenteSP_SEGResponse() {
    }

    public CreateIncidenteSP_SEGResponse(
           com.hp.schemas.SM._7.IncidenteSP_SEGModelType model,
           com.hp.schemas.SM._7.Common.MessageType[] messages,
           com.hp.schemas.SM._7.Common.StatusType status,
           java.lang.String message,
           java.util.Date schemaRevisionDate,
           int schemaRevisionLevel,
           java.math.BigDecimal returnCode,
           java.lang.String query) {
           this.model = model;
           this.messages = messages;
           this.status = status;
           this.message = message;
           this.schemaRevisionDate = schemaRevisionDate;
           this.schemaRevisionLevel = schemaRevisionLevel;
           this.returnCode = returnCode;
           this.query = query;
    }


    /**
     * Gets the model value for this CreateIncidenteSP_SEGResponse.
     * 
     * @return model
     */
    public com.hp.schemas.SM._7.IncidenteSP_SEGModelType getModel() {
        return model;
    }


    /**
     * Sets the model value for this CreateIncidenteSP_SEGResponse.
     * 
     * @param model
     */
    public void setModel(com.hp.schemas.SM._7.IncidenteSP_SEGModelType model) {
        this.model = model;
    }


    /**
     * Gets the messages value for this CreateIncidenteSP_SEGResponse.
     * 
     * @return messages
     */
    public com.hp.schemas.SM._7.Common.MessageType[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this CreateIncidenteSP_SEGResponse.
     * 
     * @param messages
     */
    public void setMessages(com.hp.schemas.SM._7.Common.MessageType[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the status value for this CreateIncidenteSP_SEGResponse.
     * 
     * @return status
     */
    public com.hp.schemas.SM._7.Common.StatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreateIncidenteSP_SEGResponse.
     * 
     * @param status
     */
    public void setStatus(com.hp.schemas.SM._7.Common.StatusType status) {
        this.status = status;
    }


    /**
     * Gets the message value for this CreateIncidenteSP_SEGResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CreateIncidenteSP_SEGResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the schemaRevisionDate value for this CreateIncidenteSP_SEGResponse.
     * 
     * @return schemaRevisionDate
     */
    public java.util.Date getSchemaRevisionDate() {
        return schemaRevisionDate;
    }


    /**
     * Sets the schemaRevisionDate value for this CreateIncidenteSP_SEGResponse.
     * 
     * @param schemaRevisionDate
     */
    public void setSchemaRevisionDate(java.util.Date schemaRevisionDate) {
        this.schemaRevisionDate = schemaRevisionDate;
    }


    /**
     * Gets the schemaRevisionLevel value for this CreateIncidenteSP_SEGResponse.
     * 
     * @return schemaRevisionLevel
     */
    public int getSchemaRevisionLevel() {
        return schemaRevisionLevel;
    }


    /**
     * Sets the schemaRevisionLevel value for this CreateIncidenteSP_SEGResponse.
     * 
     * @param schemaRevisionLevel
     */
    public void setSchemaRevisionLevel(int schemaRevisionLevel) {
        this.schemaRevisionLevel = schemaRevisionLevel;
    }


    /**
     * Gets the returnCode value for this CreateIncidenteSP_SEGResponse.
     * 
     * @return returnCode
     */
    public java.math.BigDecimal getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this CreateIncidenteSP_SEGResponse.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.math.BigDecimal returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the query value for this CreateIncidenteSP_SEGResponse.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this CreateIncidenteSP_SEGResponse.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateIncidenteSP_SEGResponse)) return false;
        CreateIncidenteSP_SEGResponse other = (CreateIncidenteSP_SEGResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.schemaRevisionDate==null && other.getSchemaRevisionDate()==null) || 
             (this.schemaRevisionDate!=null &&
              this.schemaRevisionDate.equals(other.getSchemaRevisionDate()))) &&
            this.schemaRevisionLevel == other.getSchemaRevisionLevel() &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery())));
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
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getSchemaRevisionDate() != null) {
            _hashCode += getSchemaRevisionDate().hashCode();
        }
        _hashCode += getSchemaRevisionLevel();
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateIncidenteSP_SEGResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreateIncidenteSP_SEGResponse"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StatusType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "message"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaRevisionDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "schemaRevisionDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaRevisionLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "schemaRevisionLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("query");
        attrField.setXmlName(new javax.xml.namespace.QName("", "query"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IncidenteSP_SEGModelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "MessageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "message"));
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
