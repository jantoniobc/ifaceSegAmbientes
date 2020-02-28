/**
 * InteraccionSPHistory_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public interface InteraccionSPHistory_PortType extends java.rmi.Remote {
    public com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryResponse retrieveInteraccionSPHistory(com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryRequest retrieveInteraccionSPHistoryRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryKeysListResponse retrieveInteraccionSPHistoryKeysList(com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryKeysListRequest retrieveInteraccionSPHistoryKeysListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryListResponse retrieveInteraccionSPHistoryList(com.hp.schemas.SM._7.InteraccionSPHistoryKeysType[] retrieveInteraccionSPHistoryListRequest) throws java.rmi.RemoteException;
}
