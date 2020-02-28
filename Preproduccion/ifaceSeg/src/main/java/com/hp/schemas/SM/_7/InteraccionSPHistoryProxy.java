package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;


public class InteraccionSPHistoryProxy implements com.hp.schemas.SM._7.InteraccionSPHistory_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.InteraccionSPHistory_PortType interaccionSPHistory_PortType = null;
  
  public InteraccionSPHistoryProxy() {
    _initInteraccionSPHistoryProxy();
  }
  
  public InteraccionSPHistoryProxy(String endpoint) {
    _endpoint = endpoint;
    _initInteraccionSPHistoryProxy();
  }
  
  private void _initInteraccionSPHistoryProxy() {
    try {
      interaccionSPHistory_PortType = (new com.hp.schemas.SM._7.InteraccionSPHistory_ServiceLocator()).getInteraccionSPHistory();
      if (interaccionSPHistory_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)interaccionSPHistory_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)interaccionSPHistory_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)interaccionSPHistory_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)interaccionSPHistory_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
      }}
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (interaccionSPHistory_PortType != null)
      ((javax.xml.rpc.Stub)interaccionSPHistory_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)interaccionSPHistory_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)interaccionSPHistory_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
    
  }
  
  public com.hp.schemas.SM._7.InteraccionSPHistory_PortType getInteraccionSPHistory_PortType() {
    if (interaccionSPHistory_PortType == null)
      _initInteraccionSPHistoryProxy();
    return interaccionSPHistory_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryResponse retrieveInteraccionSPHistory(com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryRequest retrieveInteraccionSPHistoryRequest) throws java.rmi.RemoteException{
    if (interaccionSPHistory_PortType == null)
      _initInteraccionSPHistoryProxy();
    return interaccionSPHistory_PortType.retrieveInteraccionSPHistory(retrieveInteraccionSPHistoryRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryKeysListResponse retrieveInteraccionSPHistoryKeysList(com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryKeysListRequest retrieveInteraccionSPHistoryKeysListRequest) throws java.rmi.RemoteException{
    if (interaccionSPHistory_PortType == null)
      _initInteraccionSPHistoryProxy();
    return interaccionSPHistory_PortType.retrieveInteraccionSPHistoryKeysList(retrieveInteraccionSPHistoryKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryListResponse retrieveInteraccionSPHistoryList(com.hp.schemas.SM._7.InteraccionSPHistoryKeysType[] retrieveInteraccionSPHistoryListRequest) throws java.rmi.RemoteException{
    if (interaccionSPHistory_PortType == null)
      _initInteraccionSPHistoryProxy();
    return interaccionSPHistory_PortType.retrieveInteraccionSPHistoryList(retrieveInteraccionSPHistoryListRequest);
  }
  
  
}