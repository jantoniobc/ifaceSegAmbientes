package com.hp.schemas.SM._7;

import javax.xml.rpc.Call;

public class ContactosSEGProxy implements com.hp.schemas.SM._7.ContactosSEG_PortType {
  private String _endpoint = null;
  private com.hp.schemas.SM._7.ContactosSEG_PortType contactosSEG_PortType = null;
  
  public ContactosSEGProxy() {
    _initContactosSEGProxy();
  }
  
  public ContactosSEGProxy(String endpoint) {
    _endpoint = endpoint;
    _initContactosSEGProxy();
  }
  
  private void _initContactosSEGProxy() {
    try {
      contactosSEG_PortType = (new com.hp.schemas.SM._7.ContactosSEG_ServiceLocator()).getContactosSEG();
      if (contactosSEG_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contactosSEG_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
          _endpoint = (String)((javax.xml.rpc.Stub)contactosSEG_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
          ((javax.xml.rpc.Stub)contactosSEG_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
          ((javax.xml.rpc.Stub)contactosSEG_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
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
    if (contactosSEG_PortType != null) {
      ((javax.xml.rpc.Stub)contactosSEG_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    ((javax.xml.rpc.Stub)contactosSEG_PortType)._setProperty(Call.USERNAME_PROPERTY, "operador.seg");
    ((javax.xml.rpc.Stub)contactosSEG_PortType)._setProperty(Call.PASSWORD_PROPERTY, "Operador.seg.1#");
  }
    
  }
  
  public com.hp.schemas.SM._7.ContactosSEG_PortType getContactosSEG_PortType() {
    if (contactosSEG_PortType == null)
      _initContactosSEGProxy();
    return contactosSEG_PortType;
  }
  
  public com.hp.schemas.SM._7.RetrieveContactosSEGResponse retrieveContactosSEG(com.hp.schemas.SM._7.RetrieveContactosSEGRequest retrieveContactosSEGRequest) throws java.rmi.RemoteException{
    if (contactosSEG_PortType == null)
      _initContactosSEGProxy();
    return contactosSEG_PortType.retrieveContactosSEG(retrieveContactosSEGRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveContactosSEGKeysListResponse retrieveContactosSEGKeysList(com.hp.schemas.SM._7.RetrieveContactosSEGKeysListRequest retrieveContactosSEGKeysListRequest) throws java.rmi.RemoteException{
    if (contactosSEG_PortType == null)
      _initContactosSEGProxy();
    return contactosSEG_PortType.retrieveContactosSEGKeysList(retrieveContactosSEGKeysListRequest);
  }
  
  public com.hp.schemas.SM._7.RetrieveContactosSEGListResponse retrieveContactosSEGList(com.hp.schemas.SM._7.ContactosSEGKeysType[] retrieveContactosSEGListRequest) throws java.rmi.RemoteException{
    if (contactosSEG_PortType == null)
      _initContactosSEGProxy();
    return contactosSEG_PortType.retrieveContactosSEGList(retrieveContactosSEGListRequest);
  }
  
  public com.hp.schemas.SM._7.CreateContactosSEGResponse createContactosSEG(com.hp.schemas.SM._7.CreateContactosSEGRequest createContactosSEGRequest) throws java.rmi.RemoteException{
    if (contactosSEG_PortType == null)
      _initContactosSEGProxy();
    return contactosSEG_PortType.createContactosSEG(createContactosSEGRequest);
  }
  
  public com.hp.schemas.SM._7.UpdateContactosSEGResponse updateContactosSEG(com.hp.schemas.SM._7.UpdateContactosSEGRequest updateContactosSEGRequest) throws java.rmi.RemoteException{
    if (contactosSEG_PortType == null)
      _initContactosSEGProxy();
    return contactosSEG_PortType.updateContactosSEG(updateContactosSEGRequest);
  }
  
  
}