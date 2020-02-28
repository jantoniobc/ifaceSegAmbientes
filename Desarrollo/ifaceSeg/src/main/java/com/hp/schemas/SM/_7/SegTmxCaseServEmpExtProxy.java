package com.hp.schemas.SM._7;
import javax.xml.rpc.Call ;


public class SegTmxCaseServEmpExtProxy implements com.hp.schemas.SM._7.SegTmxCaseServEmpExt_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.SegTmxCaseServEmpExt_PortType segTmxCaseServEmpExt_PortType = null;
  
  public SegTmxCaseServEmpExtProxy() {
    _initSegTmxCaseServEmpExtProxy();
  }
  
  public SegTmxCaseServEmpExtProxy(String endpoint) {
    _endpoint = endpoint;
    _initSegTmxCaseServEmpExtProxy();
  }
  
  private void _initSegTmxCaseServEmpExtProxy() {
    try {
      segTmxCaseServEmpExt_PortType = (new com.hp.schemas.SM._7.SegTmxCaseServEmpExt_ServiceLocator()).getSegTmxCaseServEmpExt();
      if (segTmxCaseServEmpExt_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)segTmxCaseServEmpExt_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)segTmxCaseServEmpExt_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        ((javax.xml.rpc.Stub)segTmxCaseServEmpExt_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
        ((javax.xml.rpc.Stub)segTmxCaseServEmpExt_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");

      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (segTmxCaseServEmpExt_PortType != null) {
      ((javax.xml.rpc.Stub)segTmxCaseServEmpExt_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)segTmxCaseServEmpExt_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)segTmxCaseServEmpExt_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
    }
  }
  
  public com.hp.schemas.SM._7.SegTmxCaseServEmpExt_PortType getSegTmxCaseServEmpExt_PortType() {
    if (segTmxCaseServEmpExt_PortType == null)
      _initSegTmxCaseServEmpExtProxy();
    return segTmxCaseServEmpExt_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrieveSegTmxCaseServEmpExtResponse retrieveSegTmxCaseServEmpExt(com.hp.schemas.SM._7.RetrieveSegTmxCaseServEmpExtRequest retrieveSegTmxCaseServEmpExtRequest) throws java.rmi.RemoteException{
    if (segTmxCaseServEmpExt_PortType == null)
      _initSegTmxCaseServEmpExtProxy();
    return segTmxCaseServEmpExt_PortType.retrieveSegTmxCaseServEmpExt(retrieveSegTmxCaseServEmpExtRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveSegTmxCaseServEmpExtKeysListResponse retrieveSegTmxCaseServEmpExtKeysList(com.hp.schemas.SM._7.RetrieveSegTmxCaseServEmpExtKeysListRequest retrieveSegTmxCaseServEmpExtKeysListRequest) throws java.rmi.RemoteException{
    if (segTmxCaseServEmpExt_PortType == null)
      _initSegTmxCaseServEmpExtProxy();
    return segTmxCaseServEmpExt_PortType.retrieveSegTmxCaseServEmpExtKeysList(retrieveSegTmxCaseServEmpExtKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveSegTmxCaseServEmpExtListResponse retrieveSegTmxCaseServEmpExtList(com.hp.schemas.SM._7.SegTmxCaseServEmpExtKeysType[] retrieveSegTmxCaseServEmpExtListRequest) throws java.rmi.RemoteException{
    if (segTmxCaseServEmpExt_PortType == null)
      _initSegTmxCaseServEmpExtProxy();
    return segTmxCaseServEmpExt_PortType.retrieveSegTmxCaseServEmpExtList(retrieveSegTmxCaseServEmpExtListRequest);
  }
  
  public com.hp.schemas.SM._7.CreateSegTmxCaseServEmpExtResponse createSegTmxCaseServEmpExt(com.hp.schemas.SM._7.CreateSegTmxCaseServEmpExtRequest createSegTmxCaseServEmpExtRequest) throws java.rmi.RemoteException{
    if (segTmxCaseServEmpExt_PortType == null)
      _initSegTmxCaseServEmpExtProxy();
    return segTmxCaseServEmpExt_PortType.createSegTmxCaseServEmpExt(createSegTmxCaseServEmpExtRequest);
  }
  
  
}