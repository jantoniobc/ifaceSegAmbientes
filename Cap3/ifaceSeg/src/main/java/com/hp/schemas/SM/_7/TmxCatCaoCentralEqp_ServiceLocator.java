/**
 * TmxCatCaoCentralEqp_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class TmxCatCaoCentralEqp_ServiceLocator extends org.apache.axis.client.Service implements com.hp.schemas.SM._7.TmxCatCaoCentralEqp_Service {

    public TmxCatCaoCentralEqp_ServiceLocator() {
    }


    public TmxCatCaoCentralEqp_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TmxCatCaoCentralEqp_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for tmxCatCaoCentralEqp
    private java.lang.String tmxCatCaoCentralEqp_address = "http://10.205.56.43:13082/SM/7/ws";

    public java.lang.String gettmxCatCaoCentralEqpAddress() {
        return tmxCatCaoCentralEqp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String tmxCatCaoCentralEqpWSDDServiceName = "tmxCatCaoCentralEqp";

    public java.lang.String gettmxCatCaoCentralEqpWSDDServiceName() {
        return tmxCatCaoCentralEqpWSDDServiceName;
    }

    public void settmxCatCaoCentralEqpWSDDServiceName(java.lang.String name) {
        tmxCatCaoCentralEqpWSDDServiceName = name;
    }

    public com.hp.schemas.SM._7.TmxCatCaoCentralEqp_PortType gettmxCatCaoCentralEqp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(tmxCatCaoCentralEqp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return gettmxCatCaoCentralEqp(endpoint);
    }

    public com.hp.schemas.SM._7.TmxCatCaoCentralEqp_PortType gettmxCatCaoCentralEqp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hp.schemas.SM._7.TmxCatCaoCentralEqp_BindingStub _stub = new com.hp.schemas.SM._7.TmxCatCaoCentralEqp_BindingStub(portAddress, this);
            _stub.setPortName(gettmxCatCaoCentralEqpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void settmxCatCaoCentralEqpEndpointAddress(java.lang.String address) {
        tmxCatCaoCentralEqp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hp.schemas.SM._7.TmxCatCaoCentralEqp_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hp.schemas.SM._7.TmxCatCaoCentralEqp_BindingStub _stub = new com.hp.schemas.SM._7.TmxCatCaoCentralEqp_BindingStub(new java.net.URL(tmxCatCaoCentralEqp_address), this);
                _stub.setPortName(gettmxCatCaoCentralEqpWSDDServiceName());
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
        if ("tmxCatCaoCentralEqp".equals(inputPortName)) {
            return gettmxCatCaoCentralEqp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxCatCaoCentralEqp");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxCatCaoCentralEqp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("tmxCatCaoCentralEqp".equals(portName)) {
            settmxCatCaoCentralEqpEndpointAddress(address);
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
