/**
 * ContactosSEG_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public interface ContactosSEG_PortType extends java.rmi.Remote {
    public com.hp.schemas.SM._7.RetrieveContactosSEGResponse retrieveContactosSEG(com.hp.schemas.SM._7.RetrieveContactosSEGRequest retrieveContactosSEGRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrieveContactosSEGKeysListResponse retrieveContactosSEGKeysList(com.hp.schemas.SM._7.RetrieveContactosSEGKeysListRequest retrieveContactosSEGKeysListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrieveContactosSEGListResponse retrieveContactosSEGList(com.hp.schemas.SM._7.ContactosSEGKeysType[] retrieveContactosSEGListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.CreateContactosSEGResponse createContactosSEG(com.hp.schemas.SM._7.CreateContactosSEGRequest createContactosSEGRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.UpdateContactosSEGResponse updateContactosSEG(com.hp.schemas.SM._7.UpdateContactosSEGRequest updateContactosSEGRequest) throws java.rmi.RemoteException;
}
