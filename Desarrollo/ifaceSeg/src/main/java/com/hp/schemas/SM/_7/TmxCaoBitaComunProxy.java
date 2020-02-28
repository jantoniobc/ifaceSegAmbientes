package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class TmxCaoBitaComunProxy implements com.hp.schemas.SM._7.TmxCaoBitaComun_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.TmxCaoBitaComun_PortType tmxCaoBitaComun_PortType = null;
  
  public TmxCaoBitaComunProxy() {
    _initTmxCaoBitaComunProxy();
  }
  
  public TmxCaoBitaComunProxy(String endpoint) {
    _endpoint = endpoint;
    _initTmxCaoBitaComunProxy();
  }
  
  private void _initTmxCaoBitaComunProxy() {
    try {
      tmxCaoBitaComun_PortType = (new com.hp.schemas.SM._7.TmxCaoBitaComun_ServiceLocator()).getTmxCaoBitaComun();
      if (tmxCaoBitaComun_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tmxCaoBitaComun_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)tmxCaoBitaComun_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)tmxCaoBitaComun_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)tmxCaoBitaComun_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (tmxCaoBitaComun_PortType != null) {
      ((javax.xml.rpc.Stub)tmxCaoBitaComun_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)tmxCaoBitaComun_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)tmxCaoBitaComun_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
  }
  
  public com.hp.schemas.SM._7.TmxCaoBitaComun_PortType getTmxCaoBitaComun_PortType() {
    if (tmxCaoBitaComun_PortType == null)
      _initTmxCaoBitaComunProxy();
    return tmxCaoBitaComun_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunResponse retrieveTmxCaoBitaComun(com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunRequest retrieveTmxCaoBitaComunRequest) throws java.rmi.RemoteException{
    if (tmxCaoBitaComun_PortType == null)
      _initTmxCaoBitaComunProxy();
    return tmxCaoBitaComun_PortType.retrieveTmxCaoBitaComun(retrieveTmxCaoBitaComunRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListResponse retrieveTmxCaoBitaComunKeysList(com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunKeysListRequest retrieveTmxCaoBitaComunKeysListRequest) throws java.rmi.RemoteException{
    if (tmxCaoBitaComun_PortType == null)
      _initTmxCaoBitaComunProxy();
    return tmxCaoBitaComun_PortType.retrieveTmxCaoBitaComunKeysList(retrieveTmxCaoBitaComunKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunListResponse retrieveTmxCaoBitaComunList(com.hp.schemas.SM._7.TmxCaoBitaComunKeysType[] retrieveTmxCaoBitaComunListRequest) throws java.rmi.RemoteException{
    if (tmxCaoBitaComun_PortType == null)
      _initTmxCaoBitaComunProxy();
    return tmxCaoBitaComun_PortType.retrieveTmxCaoBitaComunList(retrieveTmxCaoBitaComunListRequest);
  }
  
  
}