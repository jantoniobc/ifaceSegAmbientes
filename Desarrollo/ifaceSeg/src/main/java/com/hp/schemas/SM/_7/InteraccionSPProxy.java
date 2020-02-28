package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class InteraccionSPProxy implements com.hp.schemas.SM._7.InteraccionSP_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.InteraccionSP_PortType interaccionSP_PortType = null;
  
  public InteraccionSPProxy() {
    _initInteraccionSPProxy();
  }
  
  public InteraccionSPProxy(String endpoint) {
    _endpoint = endpoint;
    _initInteraccionSPProxy();
  }
  
  private void _initInteraccionSPProxy() {
    try {
      interaccionSP_PortType = (new com.hp.schemas.SM._7.InteraccionSP_ServiceLocator()).getInteraccionSP();
      if (interaccionSP_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)interaccionSP_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)interaccionSP_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)interaccionSP_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)interaccionSP_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
      }}
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (interaccionSP_PortType != null) {
      ((javax.xml.rpc.Stub)interaccionSP_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)interaccionSP_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)interaccionSP_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
  }
  public com.hp.schemas.SM._7.InteraccionSP_PortType getInteraccionSP_PortType() {
    if (interaccionSP_PortType == null)
      _initInteraccionSPProxy();
    return interaccionSP_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrieveincidentsResponse retrieveincidents(com.hp.schemas.SM._7.RetrieveincidentsRequest retrieveincidentsRequest) throws java.rmi.RemoteException{
    if (interaccionSP_PortType == null)
      _initInteraccionSPProxy();
    return interaccionSP_PortType.retrieveincidents(retrieveincidentsRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveincidentsKeysListResponse retrieveincidentsKeysList(com.hp.schemas.SM._7.RetrieveincidentsKeysListRequest retrieveincidentsKeysListRequest) throws java.rmi.RemoteException{
    if (interaccionSP_PortType == null)
      _initInteraccionSPProxy();
    return interaccionSP_PortType.retrieveincidentsKeysList(retrieveincidentsKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveincidentsListResponse retrieveincidentsList(com.hp.schemas.SM._7.IncidentsKeysType[] retrieveincidentsListRequest) throws java.rmi.RemoteException{
    if (interaccionSP_PortType == null)
      _initInteraccionSPProxy();
    return interaccionSP_PortType.retrieveincidentsList(retrieveincidentsListRequest);
  }
  
  public com.hp.schemas.SM._7.CreateincidentsResponse createincidents(com.hp.schemas.SM._7.CreateincidentsRequest createincidentsRequest) throws java.rmi.RemoteException{
    if (interaccionSP_PortType == null)
      _initInteraccionSPProxy();
    return interaccionSP_PortType.createincidents(createincidentsRequest);
  }
  
  public com.hp.schemas.SM._7.UpdateincidentsResponse updateincidents(com.hp.schemas.SM._7.UpdateincidentsRequest updateincidentsRequest) throws java.rmi.RemoteException{
    if (interaccionSP_PortType == null)
      _initInteraccionSPProxy();
    return interaccionSP_PortType.updateincidents(updateincidentsRequest);
  }
  
  public com.hp.schemas.SM._7.CloseincidentsResponse closeincidents(com.hp.schemas.SM._7.CloseincidentsRequest closeincidentsRequest) throws java.rmi.RemoteException{
    if (interaccionSP_PortType == null)
      _initInteraccionSPProxy();
    return interaccionSP_PortType.closeincidents(closeincidentsRequest);
  }
  
  
}