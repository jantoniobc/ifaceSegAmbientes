package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class TmxCatCaoNIRProxy implements com.hp.schemas.SM._7.TmxCatCaoNIR_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.TmxCatCaoNIR_PortType tmxCatCaoNIR_PortType = null;
  
  public TmxCatCaoNIRProxy() {
    _initTmxCatCaoNIRProxy();
  }
  
  public TmxCatCaoNIRProxy(String endpoint) {
    _endpoint = endpoint;
    _initTmxCatCaoNIRProxy();
  }
  
  private void _initTmxCatCaoNIRProxy() {
    try {
      tmxCatCaoNIR_PortType = (new com.hp.schemas.SM._7.TmxCatCaoNIR_ServiceLocator()).gettmxCatCaoNIR();
      if (tmxCatCaoNIR_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tmxCatCaoNIR_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)tmxCatCaoNIR_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)tmxCatCaoNIR_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)tmxCatCaoNIR_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (tmxCatCaoNIR_PortType != null) {
      ((javax.xml.rpc.Stub)tmxCatCaoNIR_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)tmxCatCaoNIR_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)tmxCatCaoNIR_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
  }
  public com.hp.schemas.SM._7.TmxCatCaoNIR_PortType getTmxCatCaoNIR_PortType() {
    if (tmxCatCaoNIR_PortType == null)
      _initTmxCatCaoNIRProxy();
    return tmxCatCaoNIR_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRResponse retrievetmxCatCaoNIR(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRRequest retrievetmxCatCaoNIRRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoNIR_PortType == null)
      _initTmxCatCaoNIRProxy();
    return tmxCatCaoNIR_PortType.retrievetmxCatCaoNIR(retrievetmxCatCaoNIRRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListResponse retrievetmxCatCaoNIRKeysList(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListRequest retrievetmxCatCaoNIRKeysListRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoNIR_PortType == null)
      _initTmxCatCaoNIRProxy();
    return tmxCatCaoNIR_PortType.retrievetmxCatCaoNIRKeysList(retrievetmxCatCaoNIRKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse retrievetmxCatCaoNIRList(com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[] retrievetmxCatCaoNIRListRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoNIR_PortType == null)
      _initTmxCatCaoNIRProxy();
    return tmxCatCaoNIR_PortType.retrievetmxCatCaoNIRList(retrievetmxCatCaoNIRListRequest);
  }
  
  public com.hp.schemas.SM._7.CreatetmxCatCaoNIRResponse createtmxCatCaoNIR(com.hp.schemas.SM._7.CreatetmxCatCaoNIRRequest createtmxCatCaoNIRRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoNIR_PortType == null)
      _initTmxCatCaoNIRProxy();
    return tmxCatCaoNIR_PortType.createtmxCatCaoNIR(createtmxCatCaoNIRRequest);
  }
  
  public com.hp.schemas.SM._7.DeletetmxCatCaoNIRResponse deletetmxCatCaoNIR(com.hp.schemas.SM._7.DeletetmxCatCaoNIRRequest deletetmxCatCaoNIRRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoNIR_PortType == null)
      _initTmxCatCaoNIRProxy();
    return tmxCatCaoNIR_PortType.deletetmxCatCaoNIR(deletetmxCatCaoNIRRequest);
  }
  
  public com.hp.schemas.SM._7.UpdatetmxCatCaoNIRResponse updatetmxCatCaoNIR(com.hp.schemas.SM._7.UpdatetmxCatCaoNIRRequest updatetmxCatCaoNIRRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoNIR_PortType == null)
      _initTmxCatCaoNIRProxy();
    return tmxCatCaoNIR_PortType.updatetmxCatCaoNIR(updatetmxCatCaoNIRRequest);
  }
  
  
}