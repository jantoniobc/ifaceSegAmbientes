/**
 * TmxQuejaSmSeg_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public interface TmxQuejaSmSeg_PortType extends java.rmi.Remote {
    public com.hp.schemas.SM._7.RetrievetmxQuejaSmSegResponse retrievetmxQuejaSmSeg(com.hp.schemas.SM._7.RetrievetmxQuejaSmSegRequest retrievetmxQuejaSmSegRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrievetmxQuejaSmSegKeysListResponse retrievetmxQuejaSmSegKeysList(com.hp.schemas.SM._7.RetrievetmxQuejaSmSegKeysListRequest retrievetmxQuejaSmSegKeysListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.RetrievetmxQuejaSmSegListResponse retrievetmxQuejaSmSegList(com.hp.schemas.SM._7.TmxQuejaSmSegKeysType[] retrievetmxQuejaSmSegListRequest) throws java.rmi.RemoteException;
    public com.hp.schemas.SM._7.GettmxQuejaSmSegResponse gettmxQuejaSmSeg(com.hp.schemas.SM._7.GettmxQuejaSmSegRequest gettmxQuejaSmSegRequest) throws java.rmi.RemoteException;
}
