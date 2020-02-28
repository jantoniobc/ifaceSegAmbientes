/**
 * Tmxsfsegsidecci_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class Tmxsfsegsidecci_BindingStub extends org.apache.axis.client.Stub implements com.hp.schemas.SM._7.Tmxsfsegsidecci_PortType {
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
        oper.setName("Retrievetmxsfsegsidecci");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxsfsegsidecciRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciRequest"), com.hp.schemas.SM._7.RetrievetmxsfsegsidecciRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrievetmxsfsegsidecciResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxsfsegsidecciResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrievetmxsfsegsidecciKeysList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxsfsegsidecciKeysListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciKeysListRequest"), com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciKeysListResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxsfsegsidecciKeysListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrievetmxsfsegsidecciList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxsfsegsidecciListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciListRequest"), com.hp.schemas.SM._7.TmxsfsegsidecciKeysType[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "keys"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciListResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.RetrievetmxsfsegsidecciListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "RetrievetmxsfsegsidecciListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Createtmxsfsegsidecci");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CreatetmxsfsegsidecciRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreatetmxsfsegsidecciRequest"), com.hp.schemas.SM._7.CreatetmxsfsegsidecciRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreatetmxsfsegsidecciResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.CreatetmxsfsegsidecciResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CreatetmxsfsegsidecciResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Deletetmxsfsegsidecci");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "DeletetmxsfsegsidecciRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">DeletetmxsfsegsidecciRequest"), com.hp.schemas.SM._7.DeletetmxsfsegsidecciRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">DeletetmxsfsegsidecciResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.DeletetmxsfsegsidecciResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "DeletetmxsfsegsidecciResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Updatetmxsfsegsidecci");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "UpdatetmxsfsegsidecciRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">UpdatetmxsfsegsidecciRequest"), com.hp.schemas.SM._7.UpdatetmxsfsegsidecciRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">UpdatetmxsfsegsidecciResponse"));
        oper.setReturnClass(com.hp.schemas.SM._7.UpdatetmxsfsegsidecciResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "UpdatetmxsfsegsidecciResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public Tmxsfsegsidecci_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Tmxsfsegsidecci_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Tmxsfsegsidecci_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreatetmxsfsegsidecciRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.CreatetmxsfsegsidecciRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">CreatetmxsfsegsidecciResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.CreatetmxsfsegsidecciResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">DeletetmxsfsegsidecciRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.DeletetmxsfsegsidecciRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">DeletetmxsfsegsidecciResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.DeletetmxsfsegsidecciResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciKeysListRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciKeysListResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciListRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxsfsegsidecciKeysType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfsegsidecciKeysType");
            qName2 = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "keys");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciListResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxsfsegsidecciListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxsfsegsidecciRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">RetrievetmxsfsegsidecciResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.RetrievetmxsfsegsidecciResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">UpdatetmxsfsegsidecciRequest");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.UpdatetmxsfsegsidecciRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">UpdatetmxsfsegsidecciResponse");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.UpdatetmxsfsegsidecciResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfsegsidecciInstanceType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxsfsegsidecciInstanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfsegsidecciKeysType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxsfsegsidecciKeysType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfsegsidecciModelType");
            cachedSerQNames.add(qName);
            cls = com.hp.schemas.SM._7.TmxsfsegsidecciModelType.class;
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

    public com.hp.schemas.SM._7.RetrievetmxsfsegsidecciResponse retrievetmxsfsegsidecci(com.hp.schemas.SM._7.RetrievetmxsfsegsidecciRequest retrievetmxsfsegsidecciRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "Retrievetmxsfsegsidecci"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrievetmxsfsegsidecciRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrievetmxsfsegsidecciResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrievetmxsfsegsidecciResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrievetmxsfsegsidecciResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListResponse retrievetmxsfsegsidecciKeysList(com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListRequest retrievetmxsfsegsidecciKeysListRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrievetmxsfsegsidecciKeysList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrievetmxsfsegsidecciKeysListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.RetrievetmxsfsegsidecciListResponse retrievetmxsfsegsidecciList(com.hp.schemas.SM._7.TmxsfsegsidecciKeysType[] retrievetmxsfsegsidecciListRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrievetmxsfsegsidecciList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrievetmxsfsegsidecciListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.RetrievetmxsfsegsidecciListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.RetrievetmxsfsegsidecciListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.RetrievetmxsfsegsidecciListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.CreatetmxsfsegsidecciResponse createtmxsfsegsidecci(com.hp.schemas.SM._7.CreatetmxsfsegsidecciRequest createtmxsfsegsidecciRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "Createtmxsfsegsidecci"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createtmxsfsegsidecciRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.CreatetmxsfsegsidecciResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.CreatetmxsfsegsidecciResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.CreatetmxsfsegsidecciResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.DeletetmxsfsegsidecciResponse deletetmxsfsegsidecci(com.hp.schemas.SM._7.DeletetmxsfsegsidecciRequest deletetmxsfsegsidecciRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "Deletetmxsfsegsidecci"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deletetmxsfsegsidecciRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.DeletetmxsfsegsidecciResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.DeletetmxsfsegsidecciResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.DeletetmxsfsegsidecciResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hp.schemas.SM._7.UpdatetmxsfsegsidecciResponse updatetmxsfsegsidecci(com.hp.schemas.SM._7.UpdatetmxsfsegsidecciRequest updatetmxsfsegsidecciRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "Updatetmxsfsegsidecci"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updatetmxsfsegsidecciRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hp.schemas.SM._7.UpdatetmxsfsegsidecciResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hp.schemas.SM._7.UpdatetmxsfsegsidecciResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hp.schemas.SM._7.UpdatetmxsfsegsidecciResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
