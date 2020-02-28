/**
 * InteraccionSP_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public interface InteraccionSP_PortType extends java.rmi.Remote {
    public com.hp.schemas.SM._7.RetrieveincidentsResponse retrieveincidents(com.hp.schemas.SM._7.RetrieveincidentsRequest retrieveincidentsRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrieveincidentsKeysListResponse retrieveincidentsKeysList(com.hp.schemas.SM._7.RetrieveincidentsKeysListRequest retrieveincidentsKeysListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrieveincidentsListResponse retrieveincidentsList(com.hp.schemas.SM._7.IncidentsKeysType[] retrieveincidentsListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.CreateincidentsResponse createincidents(com.hp.schemas.SM._7.CreateincidentsRequest createincidentsRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.UpdateincidentsResponse updateincidents(com.hp.schemas.SM._7.UpdateincidentsRequest updateincidentsRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.CloseincidentsResponse closeincidents(com.hp.schemas.SM._7.CloseincidentsRequest closeincidentsRequest) throws java.rmi.RemoteException;
}
