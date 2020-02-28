/**
 * TmxCaoBitaComun_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class TmxCaoBitaComun_BindingStub extends org.apache.axis.client.Stub implements com.hp.schemas.SM._7.TmxCaoBitaComun_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveTmxCaoBitaComun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrieveTmxCaoBitaComunRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunRequest"), com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrieveTmxCaoBitaComunResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveTmxCaoBitaComunKeysList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrieveTmxCaoBitaComunKeysListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunKeysListRequest"), com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunKeysListResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrieveTmxCaoBitaComunKeysListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveTmxCaoBitaComunList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrieveTmxCaoBitaComunListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunListRequest"), com.hp.schemas.SM._7.TmxCaoBitaComunKeysType[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "keys"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunListResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrieveTmxCaoBitaComunListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public TmxCaoBitaComun_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TmxCaoBitaComun_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TmxCaoBitaComun_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "ArrayType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.ArrayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "AttachmentsType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.AttachmentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "AttachmentType");
            qName2 = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "AttachmentType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.AttachmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "BooleanType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.BooleanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.DateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.DecimalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "MessagesType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.MessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "MessageType");
            qName2 = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "MessageType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.MessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.Common.StringType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunKeysListRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunKeysListResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunListRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCaoBitaComunKeysType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TmxCaoBitaComunKeysType");
            qName2 = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "keys");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunListResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrieveTmxCaoBitaComunResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">TmxCaoBitaComunInstanceType>Comentario");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCaoBitaComunInstanceTypeComentario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TmxCaoBitaComunInstanceType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCaoBitaComunInstanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TmxCaoBitaComunKeysType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCaoBitaComunKeysType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TmxCaoBitaComunModelType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCaoBitaComunModelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", ">contentType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunResponse retrieveTmxCaoBitaComun(com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunRequest retrieveTmxCaoBitaComunRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrieveTmxCaoBitaComun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveTmxCaoBitaComunRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListResponse retrieveTmxCaoBitaComunKeysList(com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListRequest retrieveTmxCaoBitaComunKeysListRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("RetrieveKeysList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrieveTmxCaoBitaComunKeysList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveTmxCaoBitaComunKeysListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunListResponse retrieveTmxCaoBitaComunList(com.hp.schemas.SM._7.TmxCaoBitaComunKeysType[] retrieveTmxCaoBitaComunListRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("RetrieveList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrieveTmxCaoBitaComunList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveTmxCaoBitaComunListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
