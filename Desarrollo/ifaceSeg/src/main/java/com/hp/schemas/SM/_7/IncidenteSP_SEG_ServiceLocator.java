/**
 * IncidenteSP_SEG_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class IncidenteSP_SEG_ServiceLocator extends org.apache.axis.client.Service implements com.hp.schemas.SM._7.IncidenteSP_SEG_Service {

    public IncidenteSP_SEG_ServiceLocator() {
    }


    public IncidenteSP_SEG_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IncidenteSP_SEG_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IncidenteSP_SEG
    private java.lang.String IncidenteSP_SEG_address = "http://10.205.56.39:13093/SM/7/ws";

    public java.lang.String getIncidenteSP_SEGAddress() {
        return IncidenteSP_SEG_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IncidenteSP_SEGWSDDServiceName = "IncidenteSP_SEG";

    public java.lang.String getIncidenteSP_SEGWSDDServiceName() {
        return IncidenteSP_SEGWSDDServiceName;
    }

    public void setIncidenteSP_SEGWSDDServiceName(java.lang.String name) {
        IncidenteSP_SEGWSDDServiceName = name;
    }

    public com.hp.schemas.SM._7.IncidenteSP_SEG_PortType getIncidenteSP_SEG() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IncidenteSP_SEG_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIncidenteSP_SEG(endpoint);
    }

    public com.hp.schemas.SM._7.IncidenteSP_SEG_PortType getIncidenteSP_SEG(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hp.schemas.SM._7.IncidenteSP_SEG_BindingStub _stub = new com.hp.schemas.SM._7.IncidenteSP_SEG_BindingStub(portAddress, this);
            _stub.setPortName(getIncidenteSP_SEGWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIncidenteSP_SEGEndpointAddress(java.lang.String address) {
        IncidenteSP_SEG_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hp.schemas.SM._7.IncidenteSP_SEG_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hp.schemas.SM._7.IncidenteSP_SEG_BindingStub _stub = new com.hp.schemas.SM._7.IncidenteSP_SEG_BindingStub(new java.net.URL(IncidenteSP_SEG_address), this);
                _stub.setPortName(getIncidenteSP_SEGWSDDServiceName());
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
        if ("IncidenteSP_SEG".equals(inputPortName)) {
            return getIncidenteSP_SEG();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IncidenteSP_SEG");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IncidenteSP_SEG"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IncidenteSP_SEG".equals(portName)) {
            setIncidenteSP_SEGEndpointAddress(address);
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
