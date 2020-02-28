package com.sp.mx.sm.ws;

public class InterfazSIPOProxy implements com.sp.mx.sm.ws.InterfazSIPO {
  private String _endpoint = null;
  private com.sp.mx.sm.ws.InterfazSIPO interfazSIPO = null;
  
  public InterfazSIPOProxy() {
    _initInterfazSIPOProxy();
  }
  
  public InterfazSIPOProxy(String endpoint) {
    _endpoint = endpoint;
    _initInterfazSIPOProxy();
  }
  
  private void _initInterfazSIPOProxy() {
    try {
      interfazSIPO = (new com.sp.mx.sm.ws.InterfazSIPOServiceLocator()).getInterfazSIPO();
      if (interfazSIPO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)interfazSIPO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)interfazSIPO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (interfazSIPO != null)
      ((javax.xml.rpc.Stub)interfazSIPO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sp.mx.sm.ws.InterfazSIPO getInterfazSIPO() {
    if (interfazSIPO == null)
      _initInterfazSIPOProxy();
    return interfazSIPO;
  }
  
  public java.lang.String notificaQueja(java.lang.String movimiento, java.lang.String xmlData) throws java.rmi.RemoteException{
    if (interfazSIPO == null)
      _initInterfazSIPOProxy();
    return interfazSIPO.notificaQueja(movimiento, xmlData);
  }
  
  public java.lang.String abcQuejas(java.lang.String movimiento, java.lang.String xmlData) throws java.rmi.RemoteException{
    if (interfazSIPO == null)
      _initInterfazSIPOProxy();
    return interfazSIPO.abcQuejas(movimiento, xmlData);
  }
  
  
}