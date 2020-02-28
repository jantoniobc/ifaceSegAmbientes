package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class GetinfoSidecciEmpresaProxy implements com.hp.schemas.SM._7.GetinfoSidecciEmpresa_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.GetinfoSidecciEmpresa_PortType getinfoSidecciEmpresa_PortType = null;
  
  public GetinfoSidecciEmpresaProxy() {
    _initGetinfoSidecciEmpresaProxy();
  }
  
  public GetinfoSidecciEmpresaProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetinfoSidecciEmpresaProxy();
  }
  
  private void _initGetinfoSidecciEmpresaProxy() {
    try {
      getinfoSidecciEmpresa_PortType = (new com.hp.schemas.SM._7.GetinfoSidecciEmpresa_ServiceLocator()).getgetinfoSidecciEmpresa();
      if (getinfoSidecciEmpresa_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getinfoSidecciEmpresa_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)getinfoSidecciEmpresa_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)getinfoSidecciEmpresa_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)getinfoSidecciEmpresa_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (getinfoSidecciEmpresa_PortType != null) {
      ((javax.xml.rpc.Stub)getinfoSidecciEmpresa_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)getinfoSidecciEmpresa_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)getinfoSidecciEmpresa_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
  }
  public com.hp.schemas.SM._7.GetinfoSidecciEmpresa_PortType getGetinfoSidecciEmpresa_PortType() {
    if (getinfoSidecciEmpresa_PortType == null)
      _initGetinfoSidecciEmpresaProxy();
    return getinfoSidecciEmpresa_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrieveinfoSidecciEmpresaSmSegResponse retrieveinfoSidecciEmpresaSmSeg(com.hp.schemas.SM._7.RetrieveinfoSidecciEmpresaSmSegRequest retrieveinfoSidecciEmpresaSmSegRequest) throws java.rmi.RemoteException{
    if (getinfoSidecciEmpresa_PortType == null)
      _initGetinfoSidecciEmpresaProxy();
    return getinfoSidecciEmpresa_PortType.retrieveinfoSidecciEmpresaSmSeg(retrieveinfoSidecciEmpresaSmSegRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveinfoSidecciEmpresaSmSegKeysListResponse retrieveinfoSidecciEmpresaSmSegKeysList(com.hp.schemas.SM._7.RetrieveinfoSidecciEmpresaSmSegKeysListRequest retrieveinfoSidecciEmpresaSmSegKeysListRequest) throws java.rmi.RemoteException{
    if (getinfoSidecciEmpresa_PortType == null)
      _initGetinfoSidecciEmpresaProxy();
    return getinfoSidecciEmpresa_PortType.retrieveinfoSidecciEmpresaSmSegKeysList(retrieveinfoSidecciEmpresaSmSegKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveinfoSidecciEmpresaSmSegListResponse retrieveinfoSidecciEmpresaSmSegList(com.hp.schemas.SM._7.InfoSidecciEmpresaSmSegKeysType[] retrieveinfoSidecciEmpresaSmSegListRequest) throws java.rmi.RemoteException{
    if (getinfoSidecciEmpresa_PortType == null)
      _initGetinfoSidecciEmpresaProxy();
    return getinfoSidecciEmpresa_PortType.retrieveinfoSidecciEmpresaSmSegList(retrieveinfoSidecciEmpresaSmSegListRequest);
  }
  
  public com.hp.schemas.SM._7.GetinfoSidecciEmpresaSmSegResponse getinfoSidecciEmpresaSmSeg(com.hp.schemas.SM._7.GetinfoSidecciEmpresaSmSegRequest getinfoSidecciEmpresaSmSegRequest) throws java.rmi.RemoteException{
    if (getinfoSidecciEmpresa_PortType == null)
      _initGetinfoSidecciEmpresaProxy();
    return getinfoSidecciEmpresa_PortType.getinfoSidecciEmpresaSmSeg(getinfoSidecciEmpresaSmSegRequest);
  }
  
  
}