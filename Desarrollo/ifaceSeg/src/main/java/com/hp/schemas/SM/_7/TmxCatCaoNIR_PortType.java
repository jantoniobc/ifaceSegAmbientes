/**
 * TmxCatCaoNIR_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public interface TmxCatCaoNIR_PortType extends java.rmi.Remote {
    public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRResponse retrievetmxCatCaoNIR(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRRequest retrievetmxCatCaoNIRRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListResponse retrievetmxCatCaoNIRKeysList(com.hp.schemas.SM._7.RetrievetmxCatCaoNIRKeysListRequest retrievetmxCatCaoNIRKeysListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse retrievetmxCatCaoNIRList(com.hp.schemas.SM._7.TmxCatCaoNIRKeysType[] retrievetmxCatCaoNIRListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.CreatetmxCatCaoNIRResponse createtmxCatCaoNIR(com.hp.schemas.SM._7.CreatetmxCatCaoNIRRequest createtmxCatCaoNIRRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.DeletetmxCatCaoNIRResponse deletetmxCatCaoNIR(com.hp.schemas.SM._7.DeletetmxCatCaoNIRRequest deletetmxCatCaoNIRRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.UpdatetmxCatCaoNIRResponse updatetmxCatCaoNIR(com.hp.schemas.SM._7.UpdatetmxCatCaoNIRRequest updatetmxCatCaoNIRRequest) throws java.rmi.RemoteException;
}
