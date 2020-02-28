/**
 * IncidenteSP_SEG_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public interface IncidenteSP_SEG_PortType extends java.rmi.Remote {
    public com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGResponse retrieveIncidenteSP_SEG(com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGRequest retrieveIncidenteSP_SEGRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGKeysListResponse retrieveIncidenteSP_SEGKeysList(com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGKeysListRequest retrieveIncidenteSP_SEGKeysListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGListResponse retrieveIncidenteSP_SEGList(com.hp.schemas.SM._7.IncidenteSP_SEGKeysType[] retrieveIncidenteSP_SEGListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.CreateIncidenteSP_SEGResponse createIncidenteSP_SEG(com.hp.schemas.SM._7.CreateIncidenteSP_SEGRequest createIncidenteSP_SEGRequest) throws java.rmi.RemoteException;
}
