/**
 * Tmxsfsegsidecci_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class Tmxsfsegsidecci_ServiceLocator extends org.apache.axis.client.Service implements com.hp.schemas.SM._7.Tmxsfsegsidecci_Service {

    public Tmxsfsegsidecci_ServiceLocator() {
    }


    public Tmxsfsegsidecci_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Tmxsfsegsidecci_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for tmxsfsegsidecci
    private java.lang.String tmxsfsegsidecci_address = "http://10.205.56.39:13093/SM/7/ws";

    public java.lang.String gettmxsfsegsidecciAddress() {
        return tmxsfsegsidecci_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String tmxsfsegsidecciWSDDServiceName = "tmxsfsegsidecci";

    public java.lang.String gettmxsfsegsidecciWSDDServiceName() {
        return tmxsfsegsidecciWSDDServiceName;
    }

    public void settmxsfsegsidecciWSDDServiceName(java.lang.String name) {
        tmxsfsegsidecciWSDDServiceName = name;
    }

    public com.hp.schemas.SM._7.Tmxsfsegsidecci_PortType gettmxsfsegsidecci() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(tmxsfsegsidecci_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return gettmxsfsegsidecci(endpoint);
    }

    public com.hp.schemas.SM._7.Tmxsfsegsidecci_PortType gettmxsfsegsidecci(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hp.schemas.SM._7.Tmxsfsegsidecci_BindingStub _stub = new com.hp.schemas.SM._7.Tmxsfsegsidecci_BindingStub(portAddress, this);
            _stub.setPortName(gettmxsfsegsidecciWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void settmxsfsegsidecciEndpointAddress(java.lang.String address) {
        tmxsfsegsidecci_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hp.schemas.SM._7.Tmxsfsegsidecci_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hp.schemas.SM._7.Tmxsfsegsidecci_BindingStub _stub = new com.hp.schemas.SM._7.Tmxsfsegsidecci_BindingStub(new java.net.URL(tmxsfsegsidecci_address), this);
                _stub.setPortName(gettmxsfsegsidecciWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("tmxsfsegsidecci".equals(inputPortName)) {
            return gettmxsfsegsidecci();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfsegsidecci");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfsegsidecci"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("tmxsfsegsidecci".equals(portName)) {
            settmxsfsegsidecciEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
