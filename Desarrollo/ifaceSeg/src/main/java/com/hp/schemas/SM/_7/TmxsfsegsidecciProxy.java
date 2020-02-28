package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class TmxsfsegsidecciProxy implements com.hp.schemas.SM._7.Tmxsfsegsidecci_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.Tmxsfsegsidecci_PortType tmxsfsegsidecci_PortType = null;
  
  public TmxsfsegsidecciProxy() {
    _initTmxsfsegsidecciProxy();
  }
  
  public TmxsfsegsidecciProxy(String endpoint) {
    _endpoint = endpoint;
    _initTmxsfsegsidecciProxy();
  }
  
  private void _initTmxsfsegsidecciProxy() {
    try {
      tmxsfsegsidecci_PortType = (new com.hp.schemas.SM._7.Tmxsfsegsidecci_ServiceLocator()).gettmxsfsegsidecci();
      if (tmxsfsegsidecci_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tmxsfsegsidecci_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)tmxsfsegsidecci_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)tmxsfsegsidecci_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)tmxsfsegsidecci_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (tmxsfsegsidecci_PortType != null) {
      ((javax.xml.rpc.Stub)tmxsfsegsidecci_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)tmxsfsegsidecci_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)tmxsfsegsidecci_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
  }
  public com.hp.schemas.SM._7.Tmxsfsegsidecci_PortType getTmxsfsegsidecci_PortType() {
    if (tmxsfsegsidecci_PortType == null)
      _initTmxsfsegsidecciProxy();
    return tmxsfsegsidecci_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrievetmxsfsegsidecciResponse retrievetmxsfsegsidecci(com.hp.schemas.SM._7.RetrievetmxsfsegsidecciRequest retrievetmxsfsegsidecciRequest) throws java.rmi.RemoteException{
    if (tmxsfsegsidecci_PortType == null)
      _initTmxsfsegsidecciProxy();
    return tmxsfsegsidecci_PortType.retrievetmxsfsegsidecci(retrievetmxsfsegsidecciRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListResponse retrievetmxsfsegsidecciKeysList(com.hp.schemas.SM._7.RetrievetmxsfsegsidecciKeysListRequest retrievetmxsfsegsidecciKeysListRequest) throws java.rmi.RemoteException{
    if (tmxsfsegsidecci_PortType == null)
      _initTmxsfsegsidecciProxy();
    return tmxsfsegsidecci_PortType.retrievetmxsfsegsidecciKeysList(retrievetmxsfsegsidecciKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxsfsegsidecciListResponse retrievetmxsfsegsidecciList(com.hp.schemas.SM._7.TmxsfsegsidecciKeysType[] retrievetmxsfsegsidecciListRequest) throws java.rmi.RemoteException{
    if (tmxsfsegsidecci_PortType == null)
      _initTmxsfsegsidecciProxy();
    return tmxsfsegsidecci_PortType.retrievetmxsfsegsidecciList(retrievetmxsfsegsidecciListRequest);
  }
  
  public com.hp.schemas.SM._7.CreatetmxsfsegsidecciResponse createtmxsfsegsidecci(com.hp.schemas.SM._7.CreatetmxsfsegsidecciRequest createtmxsfsegsidecciRequest) throws java.rmi.RemoteException{
    if (tmxsfsegsidecci_PortType == null)
      _initTmxsfsegsidecciProxy();
    return tmxsfsegsidecci_PortType.createtmxsfsegsidecci(createtmxsfsegsidecciRequest);
  }
  
  public com.hp.schemas.SM._7.DeletetmxsfsegsidecciResponse deletetmxsfsegsidecci(com.hp.schemas.SM._7.DeletetmxsfsegsidecciRequest deletetmxsfsegsidecciRequest) throws java.rmi.RemoteException{
    if (tmxsfsegsidecci_PortType == null)
      _initTmxsfsegsidecciProxy();
    return tmxsfsegsidecci_PortType.deletetmxsfsegsidecci(deletetmxsfsegsidecciRequest);
  }
  
  public com.hp.schemas.SM._7.UpdatetmxsfsegsidecciResponse updatetmxsfsegsidecci(com.hp.schemas.SM._7.UpdatetmxsfsegsidecciRequest updatetmxsfsegsidecciRequest) throws java.rmi.RemoteException{
    if (tmxsfsegsidecci_PortType == null)
      _initTmxsfsegsidecciProxy();
    return tmxsfsegsidecci_PortType.updatetmxsfsegsidecci(updatetmxsfsegsidecciRequest);
  }
  
  
}