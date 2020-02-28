package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class TmxCatCaoCentralEqpProxy implements com.hp.schemas.SM._7.TmxCatCaoCentralEqp_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.TmxCatCaoCentralEqp_PortType tmxCatCaoCentralEqp_PortType = null;
  
  public TmxCatCaoCentralEqpProxy() {
    _initTmxCatCaoCentralEqpProxy();
  }
  
  public TmxCatCaoCentralEqpProxy(String endpoint) {
    _endpoint = endpoint;
    _initTmxCatCaoCentralEqpProxy();
  }
  
  private void _initTmxCatCaoCentralEqpProxy() {
    try {
      tmxCatCaoCentralEqp_PortType = (new com.hp.schemas.SM._7.TmxCatCaoCentralEqp_ServiceLocator()).gettmxCatCaoCentralEqp();
      if (tmxCatCaoCentralEqp_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tmxCatCaoCentralEqp_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)tmxCatCaoCentralEqp_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)tmxCatCaoCentralEqp_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)tmxCatCaoCentralEqp_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (tmxCatCaoCentralEqp_PortType != null) {
      ((javax.xml.rpc.Stub)tmxCatCaoCentralEqp_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)tmxCatCaoCentralEqp_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)tmxCatCaoCentralEqp_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
  }
  public com.hp.schemas.SM._7.TmxCatCaoCentralEqp_PortType getTmxCatCaoCentralEqp_PortType() {
    if (tmxCatCaoCentralEqp_PortType == null)
      _initTmxCatCaoCentralEqpProxy();
    return tmxCatCaoCentralEqp_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoCentralEqpResponse retrievetmxCatCaoCentralEqp(com.hp.schemas.SM._7.RetrievetmxCatCaoCentralEqpRequest retrievetmxCatCaoCentralEqpRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoCentralEqp_PortType == null)
      _initTmxCatCaoCentralEqpProxy();
    return tmxCatCaoCentralEqp_PortType.retrievetmxCatCaoCentralEqp(retrievetmxCatCaoCentralEqpRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoCentralEqpKeysListResponse retrievetmxCatCaoCentralEqpKeysList(com.hp.schemas.SM._7.RetrievetmxCatCaoCentralEqpKeysListRequest retrievetmxCatCaoCentralEqpKeysListRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoCentralEqp_PortType == null)
      _initTmxCatCaoCentralEqpProxy();
    return tmxCatCaoCentralEqp_PortType.retrievetmxCatCaoCentralEqpKeysList(retrievetmxCatCaoCentralEqpKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoCentralEqpListResponse retrievetmxCatCaoCentralEqpList(com.hp.schemas.SM._7.TmxCatCaoCentralEqpKeysType[] retrievetmxCatCaoCentralEqpListRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoCentralEqp_PortType == null)
      _initTmxCatCaoCentralEqpProxy();
    return tmxCatCaoCentralEqp_PortType.retrievetmxCatCaoCentralEqpList(retrievetmxCatCaoCentralEqpListRequest);
  }
  
  public com.hp.schemas.SM._7.CreatetmxCatCaoCentralEqpResponse createtmxCatCaoCentralEqp(com.hp.schemas.SM._7.CreatetmxCatCaoCentralEqpRequest createtmxCatCaoCentralEqpRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoCentralEqp_PortType == null)
      _initTmxCatCaoCentralEqpProxy();
    return tmxCatCaoCentralEqp_PortType.createtmxCatCaoCentralEqp(createtmxCatCaoCentralEqpRequest);
  }
  
  public com.hp.schemas.SM._7.DeletetmxCatCaoCentralEqpResponse deletetmxCatCaoCentralEqp(com.hp.schemas.SM._7.DeletetmxCatCaoCentralEqpRequest deletetmxCatCaoCentralEqpRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoCentralEqp_PortType == null)
      _initTmxCatCaoCentralEqpProxy();
    return tmxCatCaoCentralEqp_PortType.deletetmxCatCaoCentralEqp(deletetmxCatCaoCentralEqpRequest);
  }
  
  public com.hp.schemas.SM._7.UpdatetmxCatCaoCentralEqpResponse updatetmxCatCaoCentralEqp(com.hp.schemas.SM._7.UpdatetmxCatCaoCentralEqpRequest updatetmxCatCaoCentralEqpRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoCentralEqp_PortType == null)
      _initTmxCatCaoCentralEqpProxy();
    return tmxCatCaoCentralEqp_PortType.updatetmxCatCaoCentralEqp(updatetmxCatCaoCentralEqpRequest);
  }
  
  
}