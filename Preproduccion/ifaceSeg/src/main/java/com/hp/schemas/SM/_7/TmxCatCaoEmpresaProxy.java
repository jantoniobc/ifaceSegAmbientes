package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class TmxCatCaoEmpresaProxy implements com.hp.schemas.SM._7.TmxCatCaoEmpresa_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.TmxCatCaoEmpresa_PortType tmxCatCaoEmpresa_PortType = null;
  
  public TmxCatCaoEmpresaProxy() {
    _initTmxCatCaoEmpresaProxy();
  }
  
  public TmxCatCaoEmpresaProxy(String endpoint) {
    _endpoint = endpoint;
    _initTmxCatCaoEmpresaProxy();
  }
  
  private void _initTmxCatCaoEmpresaProxy() {
    try {
      tmxCatCaoEmpresa_PortType = (new com.hp.schemas.SM._7.TmxCatCaoEmpresa_ServiceLocator()).gettmxCatCaoEmpresa();
      if (tmxCatCaoEmpresa_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tmxCatCaoEmpresa_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)tmxCatCaoEmpresa_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)tmxCatCaoEmpresa_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)tmxCatCaoEmpresa_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (tmxCatCaoEmpresa_PortType != null) {
      ((javax.xml.rpc.Stub)tmxCatCaoEmpresa_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)tmxCatCaoEmpresa_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)tmxCatCaoEmpresa_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
  }
  public com.hp.schemas.SM._7.TmxCatCaoEmpresa_PortType getTmxCatCaoEmpresa_PortType() {
    if (tmxCatCaoEmpresa_PortType == null)
      _initTmxCatCaoEmpresaProxy();
    return tmxCatCaoEmpresa_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoEmpresaResponse retrievetmxCatCaoEmpresa(com.hp.schemas.SM._7.RetrievetmxCatCaoEmpresaRequest retrievetmxCatCaoEmpresaRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoEmpresa_PortType == null)
      _initTmxCatCaoEmpresaProxy();
    return tmxCatCaoEmpresa_PortType.retrievetmxCatCaoEmpresa(retrievetmxCatCaoEmpresaRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoEmpresaKeysListResponse retrievetmxCatCaoEmpresaKeysList(com.hp.schemas.SM._7.RetrievetmxCatCaoEmpresaKeysListRequest retrievetmxCatCaoEmpresaKeysListRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoEmpresa_PortType == null)
      _initTmxCatCaoEmpresaProxy();
    return tmxCatCaoEmpresa_PortType.retrievetmxCatCaoEmpresaKeysList(retrievetmxCatCaoEmpresaKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoEmpresaListResponse retrievetmxCatCaoEmpresaList(com.hp.schemas.SM._7.TmxCatCaoEmpresaKeysType[] retrievetmxCatCaoEmpresaListRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoEmpresa_PortType == null)
      _initTmxCatCaoEmpresaProxy();
    return tmxCatCaoEmpresa_PortType.retrievetmxCatCaoEmpresaList(retrievetmxCatCaoEmpresaListRequest);
  }
  
  public com.hp.schemas.SM._7.CreatetmxCatCaoEmpresaResponse createtmxCatCaoEmpresa(com.hp.schemas.SM._7.CreatetmxCatCaoEmpresaRequest createtmxCatCaoEmpresaRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoEmpresa_PortType == null)
      _initTmxCatCaoEmpresaProxy();
    return tmxCatCaoEmpresa_PortType.createtmxCatCaoEmpresa(createtmxCatCaoEmpresaRequest);
  }
  
  public com.hp.schemas.SM._7.DeletetmxCatCaoEmpresaResponse deletetmxCatCaoEmpresa(com.hp.schemas.SM._7.DeletetmxCatCaoEmpresaRequest deletetmxCatCaoEmpresaRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoEmpresa_PortType == null)
      _initTmxCatCaoEmpresaProxy();
    return tmxCatCaoEmpresa_PortType.deletetmxCatCaoEmpresa(deletetmxCatCaoEmpresaRequest);
  }
  
  public com.hp.schemas.SM._7.UpdatetmxCatCaoEmpresaResponse updatetmxCatCaoEmpresa(com.hp.schemas.SM._7.UpdatetmxCatCaoEmpresaRequest updatetmxCatCaoEmpresaRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoEmpresa_PortType == null)
      _initTmxCatCaoEmpresaProxy();
    return tmxCatCaoEmpresa_PortType.updatetmxCatCaoEmpresa(updatetmxCatCaoEmpresaRequest);
  }
  
  
}