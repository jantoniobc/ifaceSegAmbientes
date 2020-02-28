package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class TmxCatCaoOpcDpcIpProxy implements com.hp.schemas.SM._7.TmxCatCaoOpcDpcIp_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.TmxCatCaoOpcDpcIp_PortType tmxCatCaoOpcDpcIp_PortType = null;
  
  public TmxCatCaoOpcDpcIpProxy() {
    _initTmxCatCaoOpcDpcIpProxy();
  }
  
  public TmxCatCaoOpcDpcIpProxy(String endpoint) {
    _endpoint = endpoint;
    _initTmxCatCaoOpcDpcIpProxy();
  }
  
  private void _initTmxCatCaoOpcDpcIpProxy() {
    try {
      tmxCatCaoOpcDpcIp_PortType = (new com.hp.schemas.SM._7.TmxCatCaoOpcDpcIp_ServiceLocator()).gettmxCatCaoOpcDpcIp();
      if (tmxCatCaoOpcDpcIp_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tmxCatCaoOpcDpcIp_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)tmxCatCaoOpcDpcIp_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
	        ((javax.xml.rpc.Stub)tmxCatCaoOpcDpcIp_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
	        ((javax.xml.rpc.Stub)tmxCatCaoOpcDpcIp_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (tmxCatCaoOpcDpcIp_PortType != null) {
      ((javax.xml.rpc.Stub)tmxCatCaoOpcDpcIp_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
	    ((javax.xml.rpc.Stub)tmxCatCaoOpcDpcIp_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
	    ((javax.xml.rpc.Stub)tmxCatCaoOpcDpcIp_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
  } 
  public com.hp.schemas.SM._7.TmxCatCaoOpcDpcIp_PortType getTmxCatCaoOpcDpcIp_PortType() {
    if (tmxCatCaoOpcDpcIp_PortType == null)
      _initTmxCatCaoOpcDpcIpProxy();
    return tmxCatCaoOpcDpcIp_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoOpcDpcIpResponse retrievetmxCatCaoOpcDpcIp(com.hp.schemas.SM._7.RetrievetmxCatCaoOpcDpcIpRequest retrievetmxCatCaoOpcDpcIpRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoOpcDpcIp_PortType == null)
      _initTmxCatCaoOpcDpcIpProxy();
    return tmxCatCaoOpcDpcIp_PortType.retrievetmxCatCaoOpcDpcIp(retrievetmxCatCaoOpcDpcIpRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoOpcDpcIpKeysListResponse retrievetmxCatCaoOpcDpcIpKeysList(com.hp.schemas.SM._7.RetrievetmxCatCaoOpcDpcIpKeysListRequest retrievetmxCatCaoOpcDpcIpKeysListRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoOpcDpcIp_PortType == null)
      _initTmxCatCaoOpcDpcIpProxy();
    return tmxCatCaoOpcDpcIp_PortType.retrievetmxCatCaoOpcDpcIpKeysList(retrievetmxCatCaoOpcDpcIpKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrievetmxCatCaoOpcDpcIpListResponse retrievetmxCatCaoOpcDpcIpList(com.hp.schemas.SM._7.TmxCatCaoOpcDpcIpKeysType[] retrievetmxCatCaoOpcDpcIpListRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoOpcDpcIp_PortType == null)
      _initTmxCatCaoOpcDpcIpProxy();
    return tmxCatCaoOpcDpcIp_PortType.retrievetmxCatCaoOpcDpcIpList(retrievetmxCatCaoOpcDpcIpListRequest);
  }
  
  public com.hp.schemas.SM._7.CreatetmxCatCaoOpcDpcIpResponse createtmxCatCaoOpcDpcIp(com.hp.schemas.SM._7.CreatetmxCatCaoOpcDpcIpRequest createtmxCatCaoOpcDpcIpRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoOpcDpcIp_PortType == null)
      _initTmxCatCaoOpcDpcIpProxy();
    return tmxCatCaoOpcDpcIp_PortType.createtmxCatCaoOpcDpcIp(createtmxCatCaoOpcDpcIpRequest);
  }
  
  public com.hp.schemas.SM._7.DeletetmxCatCaoOpcDpcIpResponse deletetmxCatCaoOpcDpcIp(com.hp.schemas.SM._7.DeletetmxCatCaoOpcDpcIpRequest deletetmxCatCaoOpcDpcIpRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoOpcDpcIp_PortType == null)
      _initTmxCatCaoOpcDpcIpProxy();
    return tmxCatCaoOpcDpcIp_PortType.deletetmxCatCaoOpcDpcIp(deletetmxCatCaoOpcDpcIpRequest);
  }
  
  public com.hp.schemas.SM._7.UpdatetmxCatCaoOpcDpcIpResponse updatetmxCatCaoOpcDpcIp(com.hp.schemas.SM._7.UpdatetmxCatCaoOpcDpcIpRequest updatetmxCatCaoOpcDpcIpRequest) throws java.rmi.RemoteException{
    if (tmxCatCaoOpcDpcIp_PortType == null)
      _initTmxCatCaoOpcDpcIpProxy();
    return tmxCatCaoOpcDpcIp_PortType.updatetmxCatCaoOpcDpcIp(updatetmxCatCaoOpcDpcIpRequest);
  }
  
  
}