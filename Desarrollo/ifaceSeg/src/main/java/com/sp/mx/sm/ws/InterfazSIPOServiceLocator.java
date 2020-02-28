/**
 * InterfazSIPOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sp.mx.sm.ws;

public class InterfazSIPOServiceLocator extends org.apache.axis.client.Service implements com.sp.mx.sm.ws.InterfazSIPOService {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7764954995395394819L;

	public InterfazSIPOServiceLocator() {
    }


    public InterfazSIPOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InterfazSIPOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InterfazSIPO
    private java.lang.String InterfazSIPO_address = "http://10.205.56.43:8080/Aseguramiento/Quejas/InterfazSIPO";

    public java.lang.String getInterfazSIPOAddress() {
        return InterfazSIPO_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InterfazSIPOWSDDServiceName = "InterfazSIPO";

    public java.lang.String getInterfazSIPOWSDDServiceName() {
        return InterfazSIPOWSDDServiceName;
    }

    public void setInterfazSIPOWSDDServiceName(java.lang.String name) {
        InterfazSIPOWSDDServiceName = name;
    }

    public com.sp.mx.sm.ws.InterfazSIPO getInterfazSIPO() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InterfazSIPO_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInterfazSIPO(endpoint);
    }

    public com.sp.mx.sm.ws.InterfazSIPO getInterfazSIPO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sp.mx.sm.ws.InterfazSIPOSoapBindingStub _stub = new com.sp.mx.sm.ws.InterfazSIPOSoapBindingStub(portAddress, this);
            _stub.setPortName(getInterfazSIPOWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInterfazSIPOEndpointAddress(java.lang.String address) {
        InterfazSIPO_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sp.mx.sm.ws.InterfazSIPO.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sp.mx.sm.ws.InterfazSIPOSoapBindingStub _stub = new com.sp.mx.sm.ws.InterfazSIPOSoapBindingStub(new java.net.URL(InterfazSIPO_address), this);
                _stub.setPortName(getInterfazSIPOWSDDServiceName());
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
        if ("InterfazSIPO".equals(inputPortName)) {
            return getInterfazSIPO();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.sm.mx.sp.com", "InterfazSIPOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.sm.mx.sp.com", "InterfazSIPO"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InterfazSIPO".equals(portName)) {
            setInterfazSIPOEndpointAddress(address);
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
