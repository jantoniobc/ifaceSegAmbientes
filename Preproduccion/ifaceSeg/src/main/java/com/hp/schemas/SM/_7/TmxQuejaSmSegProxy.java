package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class TmxQuejaSmSegProxy implements com.hp.schemas.SM._7.TmxQuejaSmSeg_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.TmxQuejaSmSeg_PortType tmxQuejaSmSeg_PortType = null;
  
  public TmxQuejaSmSegProxy() {
    _initTmxQuejaSmSegProxy();
  }
  
  public TmxQuejaSmSegProxy(String endpoint) {
    _endpoint = endpoint;
    _initTmxQuejaSmSegProxy();
  }
  
  private void _initTmxQuejaSmSegProxy() {
    try {
      tmxQuejaSmSeg_PortType = (new com.hp.schemas.SM._7.TmxQuejaSmSeg_ServiceLocator()).gettmxQuejaSmSeg();
      if (tmxQuejaSmSeg_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tmxQuejaSmSeg_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)tmxQuejaSmSeg_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)tmxQuejaSmSeg_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)tmxQuejaSmSeg_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
        }
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tmxQuejaSmSeg_PortType != null) {
      ((javax.xml.rpc.Stub)tmxQuejaSmSeg_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)tmxQuejaSmSeg_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)tmxQuejaSmSeg_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
    }
  }
  
  public com.hp.schemas.SM._7.TmxQuejaSmSeg_PortType getTmxQuejaSmSeg_PortType() {
    if (tmxQuejaSmSeg_PortType == null)
      _initTmxQuejaSmSegProxy();
    return tmxQuejaSmSeg_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrievetmxQuejaSmSegResponse retrievetmxQuejaSmSeg(com.hp.schemas.SM._7.RetrievetmxQuejaSmSegRequest retrievetmxQuejaSmSegRequest) throws java.rmi.RemoteException{
    if (tmxQuejaSmSeg_PortType == null)
      _initTmxQuejaSmSegProxy();
    return tmxQuejaSmSeg_PortType.retrievetmxQuejaSmSeg(retrievetmxQuejaSmSegRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxQuejaSmSegKeysListResponse retrievetmxQuejaSmSegKeysList(com.hp.schemas.SM._7.RetrievetmxQuejaSmSegKeysListRequest retrievetmxQuejaSmSegKeysListRequest) throws java.rmi.RemoteException{
    if (tmxQuejaSmSeg_PortType == null)
      _initTmxQuejaSmSegProxy();
    return tmxQuejaSmSeg_PortType.retrievetmxQuejaSmSegKeysList(retrievetmxQuejaSmSegKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxQuejaSmSegListResponse retrievetmxQuejaSmSegList(com.hp.schemas.SM._7.TmxQuejaSmSegKeysType[] retrievetmxQuejaSmSegListRequest) throws java.rmi.RemoteException{
    if (tmxQuejaSmSeg_PortType == null)
      _initTmxQuejaSmSegProxy();
    return tmxQuejaSmSeg_PortType.retrievetmxQuejaSmSegList(retrievetmxQuejaSmSegListRequest);
  }
  
  public com.hp.schemas.SM._7.GettmxQuejaSmSegResponse gettmxQuejaSmSeg(com.hp.schemas.SM._7.GettmxQuejaSmSegRequest gettmxQuejaSmSegRequest) throws java.rmi.RemoteException{
    if (tmxQuejaSmSeg_PortType == null)
      _initTmxQuejaSmSegProxy();
    return tmxQuejaSmSeg_PortType.gettmxQuejaSmSeg(gettmxQuejaSmSegRequest);
  }
  
  
}