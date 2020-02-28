/**
 * TmxCatCaoNIR_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class TmxCatCaoNIR_BindingStub extends org.apache.axis.client.Stub implements com.hp.schemas.SM._7.TmxCatCaoNIR_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrievetmxCatCaoNIR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxCatCaoNIRRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRRequest"), com.hp.schemas.SM._7.RetrievetmxCatCaoNIRRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxCatCaoNIRResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrievetmxCatCaoNIRKeysList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxCatCaoNIRKeysListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRKeysListRequest"), com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRKeysListResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxCatCaoNIRKeysListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrievetmxCatCaoNIRList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxCatCaoNIRListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRListRequest"), com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "keys"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRListResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxCatCaoNIRListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatetmxCatCaoNIR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CreatetmxCatCaoNIRRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreatetmxCatCaoNIRRequest"), com.hp.schemas.SM._7.CreatetmxCatCaoNIRRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreatetmxCatCaoNIRResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.CreatetmxCatCaoNIRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CreatetmxCatCaoNIRResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeletetmxCatCaoNIR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "DeletetmxCatCaoNIRRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">DeletetmxCatCaoNIRRequest"), com.hp.schemas.SM._7.DeletetmxCatCaoNIRRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">DeletetmxCatCaoNIRResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.DeletetmxCatCaoNIRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "DeletetmxCatCaoNIRResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatetmxCatCaoNIR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "UpdatetmxCatCaoNIRRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">UpdatetmxCatCaoNIRRequest"), com.hp.schemas.SM._7.UpdatetmxCatCaoNIRRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">UpdatetmxCatCaoNIRResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.UpdatetmxCatCaoNIRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "UpdatetmxCatCaoNIRResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public TmxCatCaoNIR_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TmxCatCaoNIR_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TmxCatCaoNIR_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreatetmxCatCaoNIRRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.CreatetmxCatCaoNIRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreatetmxCatCaoNIRResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.CreatetmxCatCaoNIRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">DeletetmxCatCaoNIRRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.DeletetmxCatCaoNIRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">DeletetmxCatCaoNIRResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.DeletetmxCatCaoNIRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRKeysListRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRKeysListResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRListRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxCatCaoNIRKeysType");
            qName2 = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "keys");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRListResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxCatCaoNIRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxCatCaoNIRResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxCatCaoNIRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">UpdatetmxCatCaoNIRRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.UpdatetmxCatCaoNIRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">UpdatetmxCatCaoNIRResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.UpdatetmxCatCaoNIRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxCatCaoNIRInstanceType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCatCaoNIRInstanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxCatCaoNIRKeysType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCatCaoNIRKeysType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxCatCaoNIRModelType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxCatCaoNIRModelType.class;
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

    public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRResponse retrievetmxCatCaoNIR(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRRequest retrievetmxCatCaoNIRRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrievetmxCatCaoNIR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrievetmxCatCaoNIRRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrievetmxCatCaoNIRResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrievetmxCatCaoNIRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrievetmxCatCaoNIRResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListResponse retrievetmxCatCaoNIRKeysList(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListRequest retrievetmxCatCaoNIRKeysListRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrievetmxCatCaoNIRKeysList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrievetmxCatCaoNIRKeysListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse retrievetmxCatCaoNIRList(com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[] retrievetmxCatCaoNIRListRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrievetmxCatCaoNIRList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrievetmxCatCaoNIRListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.CreatetmxCatCaoNIRResponse createtmxCatCaoNIR(com.hp.schemas.SM._7.CreatetmxCatCaoNIRRequest createtmxCatCaoNIRRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatetmxCatCaoNIR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createtmxCatCaoNIRRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.CreatetmxCatCaoNIRResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.CreatetmxCatCaoNIRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.CreatetmxCatCaoNIRResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.DeletetmxCatCaoNIRResponse deletetmxCatCaoNIR(com.hp.schemas.SM._7.DeletetmxCatCaoNIRRequest deletetmxCatCaoNIRRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeletetmxCatCaoNIR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deletetmxCatCaoNIRRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.DeletetmxCatCaoNIRResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.DeletetmxCatCaoNIRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.DeletetmxCatCaoNIRResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.UpdatetmxCatCaoNIRResponse updatetmxCatCaoNIR(com.hp.schemas.SM._7.UpdatetmxCatCaoNIRRequest updatetmxCatCaoNIRRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdatetmxCatCaoNIR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updatetmxCatCaoNIRRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.UpdatetmxCatCaoNIRResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.UpdatetmxCatCaoNIRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.UpdatetmxCatCaoNIRResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
