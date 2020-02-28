package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class SubtipoServicioSEGProxy implements com.hp.schemas.SM._7.SubtipoServicioSEG_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.SubtipoServicioSEG_PortType subtipoServicioSEG_PortType = null;
  
  public SubtipoServicioSEGProxy() {
    _initSubtipoServicioSEGProxy();
  }
  
  public SubtipoServicioSEGProxy(String endpoint) {
    _endpoint = endpoint;
    _initSubtipoServicioSEGProxy();
  }
  
  private void _initSubtipoServicioSEGProxy() {
    try {
      subtipoServicioSEG_PortType = (new com.hp.schemas.SM._7.SubtipoServicioSEG_ServiceLocator()).getSubtipoServicioSEG();
      if (subtipoServicioSEG_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)subtipoServicioSEG_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
        {
          _endpoint = (String)((javax.xml.rpc.Stub)subtipoServicioSEG_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
          ((javax.xml.rpc.Stub)subtipoServicioSEG_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
          ((javax.xml.rpc.Stub)subtipoServicioSEG_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (subtipoServicioSEG_PortType != null)
    {
      ((javax.xml.rpc.Stub)subtipoServicioSEG_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
      ((javax.xml.rpc.Stub)subtipoServicioSEG_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
      ((javax.xml.rpc.Stub)subtipoServicioSEG_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
    }
    
  }
  
  public com.hp.schemas.SM._7.SubtipoServicioSEG_PortType getSubtipoServicioSEG_PortType() {
    if (subtipoServicioSEG_PortType == null)
      _initSubtipoServicioSEGProxy();
    return subtipoServicioSEG_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrieveSubtipoServicioSEGResponse retrieveSubtipoServicioSEG(com.hp.schemas.SM._7.RetrieveSubtipoServicioSEGRequest retrieveSubtipoServicioSEGRequest) throws java.rmi.RemoteException{
    if (subtipoServicioSEG_PortType == null)
      _initSubtipoServicioSEGProxy();
    return subtipoServicioSEG_PortType.retrieveSubtipoServicioSEG(retrieveSubtipoServicioSEGRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveSubtipoServicioSEGKeysListResponse retrieveSubtipoServicioSEGKeysList(com.hp.schemas.SM._7.RetrieveSubtipoServicioSEGKeysListRequest retrieveSubtipoServicioSEGKeysListRequest) throws java.rmi.RemoteException{
    if (subtipoServicioSEG_PortType == null)
      _initSubtipoServicioSEGProxy();
    return subtipoServicioSEG_PortType.retrieveSubtipoServicioSEGKeysList(retrieveSubtipoServicioSEGKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveSubtipoServicioSEGListResponse retrieveSubtipoServicioSEGList(com.hp.schemas.SM._7.SubtipoServicioSEGKeysType[] retrieveSubtipoServicioSEGListRequest) throws java.rmi.RemoteException{
    if (subtipoServicioSEG_PortType == null)
      _initSubtipoServicioSEGProxy();
    return subtipoServicioSEG_PortType.retrieveSubtipoServicioSEGList(retrieveSubtipoServicioSEGListRequest);
  }
  
  
}