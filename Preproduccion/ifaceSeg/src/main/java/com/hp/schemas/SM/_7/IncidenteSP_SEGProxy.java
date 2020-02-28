package com.hp.schemas.SM._7;
import javax.xml.rpc.Call;

public class IncidenteSP_SEGProxy implements com.hp.schemas.SM._7.IncidenteSP_SEG_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.IncidenteSP_SEG_PortType incidenteSP_SEG_PortType = null;
  
  public IncidenteSP_SEGProxy() {
    _initIncidenteSP_SEGProxy();
  }
  
  public IncidenteSP_SEGProxy(String endpoint) {
    _endpoint = endpoint;
    _initIncidenteSP_SEGProxy();
  }
  
  private void _initIncidenteSP_SEGProxy() {
    try {
      incidenteSP_SEG_PortType = (new com.hp.schemas.SM._7.IncidenteSP_SEG_ServiceLocator()).getIncidenteSP_SEG();
      if (incidenteSP_SEG_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)incidenteSP_SEG_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
            _endpoint = (String)((javax.xml.rpc.Stub)incidenteSP_SEG_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
            ((javax.xml.rpc.Stub)incidenteSP_SEG_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
            ((javax.xml.rpc.Stub)incidenteSP_SEG_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
          }
      
    }}
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (incidenteSP_SEG_PortType != null) {
        ((javax.xml.rpc.Stub)incidenteSP_SEG_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
      ((javax.xml.rpc.Stub)incidenteSP_SEG_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
      ((javax.xml.rpc.Stub)incidenteSP_SEG_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
    }
  }
  
  public com.hp.schemas.SM._7.IncidenteSP_SEG_PortType getIncidenteSP_SEG_PortType() {
    if (incidenteSP_SEG_PortType == null)
      _initIncidenteSP_SEGProxy();
    return incidenteSP_SEG_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGResponse retrieveIncidenteSP_SEG(com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGRequest retrieveIncidenteSP_SEGRequest) throws java.rmi.RemoteException{
    if (incidenteSP_SEG_PortType == null)
      _initIncidenteSP_SEGProxy();
    return incidenteSP_SEG_PortType.retrieveIncidenteSP_SEG(retrieveIncidenteSP_SEGRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGKeysListResponse retrieveIncidenteSP_SEGKeysList(com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGKeysListRequest retrieveIncidenteSP_SEGKeysListRequest) throws java.rmi.RemoteException{
    if (incidenteSP_SEG_PortType == null)
      _initIncidenteSP_SEGProxy();
    return incidenteSP_SEG_PortType.retrieveIncidenteSP_SEGKeysList(retrieveIncidenteSP_SEGKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGListResponse retrieveIncidenteSP_SEGList(com.hp.schemas.SM._7.IncidenteSP_SEGKeysType[] retrieveIncidenteSP_SEGListRequest) throws java.rmi.RemoteException{
    if (incidenteSP_SEG_PortType == null)
      _initIncidenteSP_SEGProxy();
    return incidenteSP_SEG_PortType.retrieveIncidenteSP_SEGList(retrieveIncidenteSP_SEGListRequest);
  }
  
  public com.hp.schemas.SM._7.CreateIncidenteSP_SEGResponse createIncidenteSP_SEG(com.hp.schemas.SM._7.CreateIncidenteSP_SEGRequest createIncidenteSP_SEGRequest) throws java.rmi.RemoteException{
    if (incidenteSP_SEG_PortType == null)
      _initIncidenteSP_SEGProxy();
    return incidenteSP_SEG_PortType.createIncidenteSP_SEG(createIncidenteSP_SEGRequest);
  }
  
  
}