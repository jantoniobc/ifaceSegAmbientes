/**
 * TmxsfsegsidecciInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class TmxsfsegsidecciInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNoNal;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegClliSist;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegCvecensal;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegRed;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegEstado;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegCentral;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegDirDiv;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegEdificio;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegHost;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegAsl;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegPC;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegTE;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegCL;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegSerie;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNumIni;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNumFin;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegTN;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegId;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegStatus;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegIdesp;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegTS;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegObser;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIdo;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIda;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegTSer;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegIdDiv;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegIdTNum;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegTClli;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegFolioPlan;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegCompania;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegSiglasPis;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegDpc;

    private com.hp.schemas.SM._7.Common.StringType tmxsfsegTecnologia;

    private com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIdCia;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public TmxsfsegsidecciInstanceType() {
    }

    public TmxsfsegsidecciInstanceType(
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNoNal,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegClliSist,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegCvecensal,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegRed,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegEstado,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegCentral,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegDirDiv,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegEdificio,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegHost,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegAsl,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegPC,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegTE,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegCL,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegSerie,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNumIni,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNumFin,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegTN,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegId,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegStatus,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegIdesp,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegTS,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegObser,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIdo,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIda,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegTSer,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegIdDiv,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegIdTNum,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegTClli,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegFolioPlan,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegCompania,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegSiglasPis,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegDpc,
           com.hp.schemas.SM._7.Common.StringType tmxsfsegTecnologia,
           com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIdCia,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.tmxsfsegNoNal = tmxsfsegNoNal;
           this.tmxsfsegClliSist = tmxsfsegClliSist;
           this.tmxsfsegCvecensal = tmxsfsegCvecensal;
           this.tmxsfsegRed = tmxsfsegRed;
           this.tmxsfsegEstado = tmxsfsegEstado;
           this.tmxsfsegCentral = tmxsfsegCentral;
           this.tmxsfsegDirDiv = tmxsfsegDirDiv;
           this.tmxsfsegEdificio = tmxsfsegEdificio;
           this.tmxsfsegHost = tmxsfsegHost;
           this.tmxsfsegAsl = tmxsfsegAsl;
           this.tmxsfsegPC = tmxsfsegPC;
           this.tmxsfsegTE = tmxsfsegTE;
           this.tmxsfsegCL = tmxsfsegCL;
           this.tmxsfsegSerie = tmxsfsegSerie;
           this.tmxsfsegNumIni = tmxsfsegNumIni;
           this.tmxsfsegNumFin = tmxsfsegNumFin;
           this.tmxsfsegTN = tmxsfsegTN;
           this.tmxsfsegId = tmxsfsegId;
           this.tmxsfsegStatus = tmxsfsegStatus;
           this.tmxsfsegIdesp = tmxsfsegIdesp;
           this.tmxsfsegTS = tmxsfsegTS;
           this.tmxsfsegObser = tmxsfsegObser;
           this.tmxsfsegIdo = tmxsfsegIdo;
           this.tmxsfsegIda = tmxsfsegIda;
           this.tmxsfsegTSer = tmxsfsegTSer;
           this.tmxsfsegIdDiv = tmxsfsegIdDiv;
           this.tmxsfsegIdTNum = tmxsfsegIdTNum;
           this.tmxsfsegTClli = tmxsfsegTClli;
           this.tmxsfsegFolioPlan = tmxsfsegFolioPlan;
           this.tmxsfsegCompania = tmxsfsegCompania;
           this.tmxsfsegSiglasPis = tmxsfsegSiglasPis;
           this.tmxsfsegDpc = tmxsfsegDpc;
           this.tmxsfsegTecnologia = tmxsfsegTecnologia;
           this.tmxsfsegIdCia = tmxsfsegIdCia;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the tmxsfsegNoNal value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegNoNal
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegNoNal() {
        return tmxsfsegNoNal;
    }


    /**
     * Sets the tmxsfsegNoNal value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegNoNal
     */
    public void setTmxsfsegNoNal(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNoNal) {
        this.tmxsfsegNoNal = tmxsfsegNoNal;
    }


    /**
     * Gets the tmxsfsegClliSist value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegClliSist
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegClliSist() {
        return tmxsfsegClliSist;
    }


    /**
     * Sets the tmxsfsegClliSist value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegClliSist
     */
    public void setTmxsfsegClliSist(com.hp.schemas.SM._7.Common.StringType tmxsfsegClliSist) {
        this.tmxsfsegClliSist = tmxsfsegClliSist;
    }


    /**
     * Gets the tmxsfsegCvecensal value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegCvecensal
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegCvecensal() {
        return tmxsfsegCvecensal;
    }


    /**
     * Sets the tmxsfsegCvecensal value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegCvecensal
     */
    public void setTmxsfsegCvecensal(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegCvecensal) {
        this.tmxsfsegCvecensal = tmxsfsegCvecensal;
    }


    /**
     * Gets the tmxsfsegRed value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegRed
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegRed() {
        return tmxsfsegRed;
    }


    /**
     * Sets the tmxsfsegRed value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegRed
     */
    public void setTmxsfsegRed(com.hp.schemas.SM._7.Common.StringType tmxsfsegRed) {
        this.tmxsfsegRed = tmxsfsegRed;
    }


    /**
     * Gets the tmxsfsegEstado value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegEstado
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegEstado() {
        return tmxsfsegEstado;
    }


    /**
     * Sets the tmxsfsegEstado value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegEstado
     */
    public void setTmxsfsegEstado(com.hp.schemas.SM._7.Common.StringType tmxsfsegEstado) {
        this.tmxsfsegEstado = tmxsfsegEstado;
    }


    /**
     * Gets the tmxsfsegCentral value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegCentral
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegCentral() {
        return tmxsfsegCentral;
    }


    /**
     * Sets the tmxsfsegCentral value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegCentral
     */
    public void setTmxsfsegCentral(com.hp.schemas.SM._7.Common.StringType tmxsfsegCentral) {
        this.tmxsfsegCentral = tmxsfsegCentral;
    }


    /**
     * Gets the tmxsfsegDirDiv value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegDirDiv
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegDirDiv() {
        return tmxsfsegDirDiv;
    }


    /**
     * Sets the tmxsfsegDirDiv value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegDirDiv
     */
    public void setTmxsfsegDirDiv(com.hp.schemas.SM._7.Common.StringType tmxsfsegDirDiv) {
        this.tmxsfsegDirDiv = tmxsfsegDirDiv;
    }


    /**
     * Gets the tmxsfsegEdificio value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegEdificio
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegEdificio() {
        return tmxsfsegEdificio;
    }


    /**
     * Sets the tmxsfsegEdificio value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegEdificio
     */
    public void setTmxsfsegEdificio(com.hp.schemas.SM._7.Common.StringType tmxsfsegEdificio) {
        this.tmxsfsegEdificio = tmxsfsegEdificio;
    }


    /**
     * Gets the tmxsfsegHost value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegHost
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegHost() {
        return tmxsfsegHost;
    }


    /**
     * Sets the tmxsfsegHost value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegHost
     */
    public void setTmxsfsegHost(com.hp.schemas.SM._7.Common.StringType tmxsfsegHost) {
        this.tmxsfsegHost = tmxsfsegHost;
    }


    /**
     * Gets the tmxsfsegAsl value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegAsl
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegAsl() {
        return tmxsfsegAsl;
    }


    /**
     * Sets the tmxsfsegAsl value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegAsl
     */
    public void setTmxsfsegAsl(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegAsl) {
        this.tmxsfsegAsl = tmxsfsegAsl;
    }


    /**
     * Gets the tmxsfsegPC value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegPC
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegPC() {
        return tmxsfsegPC;
    }


    /**
     * Sets the tmxsfsegPC value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegPC
     */
    public void setTmxsfsegPC(com.hp.schemas.SM._7.Common.StringType tmxsfsegPC) {
        this.tmxsfsegPC = tmxsfsegPC;
    }


    /**
     * Gets the tmxsfsegTE value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegTE
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegTE() {
        return tmxsfsegTE;
    }


    /**
     * Sets the tmxsfsegTE value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegTE
     */
    public void setTmxsfsegTE(com.hp.schemas.SM._7.Common.StringType tmxsfsegTE) {
        this.tmxsfsegTE = tmxsfsegTE;
    }


    /**
     * Gets the tmxsfsegCL value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegCL
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegCL() {
        return tmxsfsegCL;
    }


    /**
     * Sets the tmxsfsegCL value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegCL
     */
    public void setTmxsfsegCL(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegCL) {
        this.tmxsfsegCL = tmxsfsegCL;
    }


    /**
     * Gets the tmxsfsegSerie value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegSerie
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegSerie() {
        return tmxsfsegSerie;
    }


    /**
     * Sets the tmxsfsegSerie value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegSerie
     */
    public void setTmxsfsegSerie(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegSerie) {
        this.tmxsfsegSerie = tmxsfsegSerie;
    }


    /**
     * Gets the tmxsfsegNumIni value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegNumIni
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegNumIni() {
        return tmxsfsegNumIni;
    }


    /**
     * Sets the tmxsfsegNumIni value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegNumIni
     */
    public void setTmxsfsegNumIni(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNumIni) {
        this.tmxsfsegNumIni = tmxsfsegNumIni;
    }


    /**
     * Gets the tmxsfsegNumFin value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegNumFin
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegNumFin() {
        return tmxsfsegNumFin;
    }


    /**
     * Sets the tmxsfsegNumFin value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegNumFin
     */
    public void setTmxsfsegNumFin(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegNumFin) {
        this.tmxsfsegNumFin = tmxsfsegNumFin;
    }


    /**
     * Gets the tmxsfsegTN value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegTN
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegTN() {
        return tmxsfsegTN;
    }


    /**
     * Sets the tmxsfsegTN value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegTN
     */
    public void setTmxsfsegTN(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegTN) {
        this.tmxsfsegTN = tmxsfsegTN;
    }


    /**
     * Gets the tmxsfsegId value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegId
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegId() {
        return tmxsfsegId;
    }


    /**
     * Sets the tmxsfsegId value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegId
     */
    public void setTmxsfsegId(com.hp.schemas.SM._7.Common.StringType tmxsfsegId) {
        this.tmxsfsegId = tmxsfsegId;
    }


    /**
     * Gets the tmxsfsegStatus value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegStatus
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegStatus() {
        return tmxsfsegStatus;
    }


    /**
     * Sets the tmxsfsegStatus value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegStatus
     */
    public void setTmxsfsegStatus(com.hp.schemas.SM._7.Common.StringType tmxsfsegStatus) {
        this.tmxsfsegStatus = tmxsfsegStatus;
    }


    /**
     * Gets the tmxsfsegIdesp value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegIdesp
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegIdesp() {
        return tmxsfsegIdesp;
    }


    /**
     * Sets the tmxsfsegIdesp value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegIdesp
     */
    public void setTmxsfsegIdesp(com.hp.schemas.SM._7.Common.StringType tmxsfsegIdesp) {
        this.tmxsfsegIdesp = tmxsfsegIdesp;
    }


    /**
     * Gets the tmxsfsegTS value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegTS
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegTS() {
        return tmxsfsegTS;
    }


    /**
     * Sets the tmxsfsegTS value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegTS
     */
    public void setTmxsfsegTS(com.hp.schemas.SM._7.Common.StringType tmxsfsegTS) {
        this.tmxsfsegTS = tmxsfsegTS;
    }


    /**
     * Gets the tmxsfsegObser value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegObser
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegObser() {
        return tmxsfsegObser;
    }


    /**
     * Sets the tmxsfsegObser value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegObser
     */
    public void setTmxsfsegObser(com.hp.schemas.SM._7.Common.StringType tmxsfsegObser) {
        this.tmxsfsegObser = tmxsfsegObser;
    }


    /**
     * Gets the tmxsfsegIdo value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegIdo
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegIdo() {
        return tmxsfsegIdo;
    }


    /**
     * Sets the tmxsfsegIdo value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegIdo
     */
    public void setTmxsfsegIdo(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIdo) {
        this.tmxsfsegIdo = tmxsfsegIdo;
    }


    /**
     * Gets the tmxsfsegIda value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegIda
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegIda() {
        return tmxsfsegIda;
    }


    /**
     * Sets the tmxsfsegIda value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegIda
     */
    public void setTmxsfsegIda(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIda) {
        this.tmxsfsegIda = tmxsfsegIda;
    }


    /**
     * Gets the tmxsfsegTSer value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegTSer
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegTSer() {
        return tmxsfsegTSer;
    }


    /**
     * Sets the tmxsfsegTSer value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegTSer
     */
    public void setTmxsfsegTSer(com.hp.schemas.SM._7.Common.StringType tmxsfsegTSer) {
        this.tmxsfsegTSer = tmxsfsegTSer;
    }


    /**
     * Gets the tmxsfsegIdDiv value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegIdDiv
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegIdDiv() {
        return tmxsfsegIdDiv;
    }


    /**
     * Sets the tmxsfsegIdDiv value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegIdDiv
     */
    public void setTmxsfsegIdDiv(com.hp.schemas.SM._7.Common.StringType tmxsfsegIdDiv) {
        this.tmxsfsegIdDiv = tmxsfsegIdDiv;
    }


    /**
     * Gets the tmxsfsegIdTNum value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegIdTNum
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegIdTNum() {
        return tmxsfsegIdTNum;
    }


    /**
     * Sets the tmxsfsegIdTNum value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegIdTNum
     */
    public void setTmxsfsegIdTNum(com.hp.schemas.SM._7.Common.StringType tmxsfsegIdTNum) {
        this.tmxsfsegIdTNum = tmxsfsegIdTNum;
    }


    /**
     * Gets the tmxsfsegTClli value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegTClli
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegTClli() {
        return tmxsfsegTClli;
    }


    /**
     * Sets the tmxsfsegTClli value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegTClli
     */
    public void setTmxsfsegTClli(com.hp.schemas.SM._7.Common.StringType tmxsfsegTClli) {
        this.tmxsfsegTClli = tmxsfsegTClli;
    }


    /**
     * Gets the tmxsfsegFolioPlan value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegFolioPlan
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegFolioPlan() {
        return tmxsfsegFolioPlan;
    }


    /**
     * Sets the tmxsfsegFolioPlan value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegFolioPlan
     */
    public void setTmxsfsegFolioPlan(com.hp.schemas.SM._7.Common.StringType tmxsfsegFolioPlan) {
        this.tmxsfsegFolioPlan = tmxsfsegFolioPlan;
    }


    /**
     * Gets the tmxsfsegCompania value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegCompania
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegCompania() {
        return tmxsfsegCompania;
    }


    /**
     * Sets the tmxsfsegCompania value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegCompania
     */
    public void setTmxsfsegCompania(com.hp.schemas.SM._7.Common.StringType tmxsfsegCompania) {
        this.tmxsfsegCompania = tmxsfsegCompania;
    }


    /**
     * Gets the tmxsfsegSiglasPis value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegSiglasPis
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegSiglasPis() {
        return tmxsfsegSiglasPis;
    }


    /**
     * Sets the tmxsfsegSiglasPis value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegSiglasPis
     */
    public void setTmxsfsegSiglasPis(com.hp.schemas.SM._7.Common.StringType tmxsfsegSiglasPis) {
        this.tmxsfsegSiglasPis = tmxsfsegSiglasPis;
    }


    /**
     * Gets the tmxsfsegDpc value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegDpc
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegDpc() {
        return tmxsfsegDpc;
    }


    /**
     * Sets the tmxsfsegDpc value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegDpc
     */
    public void setTmxsfsegDpc(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegDpc) {
        this.tmxsfsegDpc = tmxsfsegDpc;
    }


    /**
     * Gets the tmxsfsegTecnologia value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegTecnologia
     */
    public com.hp.schemas.SM._7.Common.StringType getTmxsfsegTecnologia() {
        return tmxsfsegTecnologia;
    }


    /**
     * Sets the tmxsfsegTecnologia value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegTecnologia
     */
    public void setTmxsfsegTecnologia(com.hp.schemas.SM._7.Common.StringType tmxsfsegTecnologia) {
        this.tmxsfsegTecnologia = tmxsfsegTecnologia;
    }


    /**
     * Gets the tmxsfsegIdCia value for this TmxsfsegsidecciInstanceType.
     * 
     * @return tmxsfsegIdCia
     */
    public com.hp.schemas.SM._7.Common.DecimalType getTmxsfsegIdCia() {
        return tmxsfsegIdCia;
    }


    /**
     * Sets the tmxsfsegIdCia value for this TmxsfsegsidecciInstanceType.
     * 
     * @param tmxsfsegIdCia
     */
    public void setTmxsfsegIdCia(com.hp.schemas.SM._7.Common.DecimalType tmxsfsegIdCia) {
        this.tmxsfsegIdCia = tmxsfsegIdCia;
    }


    /**
     * Gets the attachments value for this TmxsfsegsidecciInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this TmxsfsegsidecciInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this TmxsfsegsidecciInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this TmxsfsegsidecciInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this TmxsfsegsidecciInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this TmxsfsegsidecciInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this TmxsfsegsidecciInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this TmxsfsegsidecciInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this TmxsfsegsidecciInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this TmxsfsegsidecciInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TmxsfsegsidecciInstanceType)) return false;
        TmxsfsegsidecciInstanceType other = (TmxsfsegsidecciInstanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tmxsfsegNoNal==null && other.getTmxsfsegNoNal()==null) || 
             (this.tmxsfsegNoNal!=null &&
              this.tmxsfsegNoNal.equals(other.getTmxsfsegNoNal()))) &&
            ((this.tmxsfsegClliSist==null && other.getTmxsfsegClliSist()==null) || 
             (this.tmxsfsegClliSist!=null &&
              this.tmxsfsegClliSist.equals(other.getTmxsfsegClliSist()))) &&
            ((this.tmxsfsegCvecensal==null && other.getTmxsfsegCvecensal()==null) || 
             (this.tmxsfsegCvecensal!=null &&
              this.tmxsfsegCvecensal.equals(other.getTmxsfsegCvecensal()))) &&
            ((this.tmxsfsegRed==null && other.getTmxsfsegRed()==null) || 
             (this.tmxsfsegRed!=null &&
              this.tmxsfsegRed.equals(other.getTmxsfsegRed()))) &&
            ((this.tmxsfsegEstado==null && other.getTmxsfsegEstado()==null) || 
             (this.tmxsfsegEstado!=null &&
              this.tmxsfsegEstado.equals(other.getTmxsfsegEstado()))) &&
            ((this.tmxsfsegCentral==null && other.getTmxsfsegCentral()==null) || 
             (this.tmxsfsegCentral!=null &&
              this.tmxsfsegCentral.equals(other.getTmxsfsegCentral()))) &&
            ((this.tmxsfsegDirDiv==null && other.getTmxsfsegDirDiv()==null) || 
             (this.tmxsfsegDirDiv!=null &&
              this.tmxsfsegDirDiv.equals(other.getTmxsfsegDirDiv()))) &&
            ((this.tmxsfsegEdificio==null && other.getTmxsfsegEdificio()==null) || 
             (this.tmxsfsegEdificio!=null &&
              this.tmxsfsegEdificio.equals(other.getTmxsfsegEdificio()))) &&
            ((this.tmxsfsegHost==null && other.getTmxsfsegHost()==null) || 
             (this.tmxsfsegHost!=null &&
              this.tmxsfsegHost.equals(other.getTmxsfsegHost()))) &&
            ((this.tmxsfsegAsl==null && other.getTmxsfsegAsl()==null) || 
             (this.tmxsfsegAsl!=null &&
              this.tmxsfsegAsl.equals(other.getTmxsfsegAsl()))) &&
            ((this.tmxsfsegPC==null && other.getTmxsfsegPC()==null) || 
             (this.tmxsfsegPC!=null &&
              this.tmxsfsegPC.equals(other.getTmxsfsegPC()))) &&
            ((this.tmxsfsegTE==null && other.getTmxsfsegTE()==null) || 
             (this.tmxsfsegTE!=null &&
              this.tmxsfsegTE.equals(other.getTmxsfsegTE()))) &&
            ((this.tmxsfsegCL==null && other.getTmxsfsegCL()==null) || 
             (this.tmxsfsegCL!=null &&
              this.tmxsfsegCL.equals(other.getTmxsfsegCL()))) &&
            ((this.tmxsfsegSerie==null && other.getTmxsfsegSerie()==null) || 
             (this.tmxsfsegSerie!=null &&
              this.tmxsfsegSerie.equals(other.getTmxsfsegSerie()))) &&
            ((this.tmxsfsegNumIni==null && other.getTmxsfsegNumIni()==null) || 
             (this.tmxsfsegNumIni!=null &&
              this.tmxsfsegNumIni.equals(other.getTmxsfsegNumIni()))) &&
            ((this.tmxsfsegNumFin==null && other.getTmxsfsegNumFin()==null) || 
             (this.tmxsfsegNumFin!=null &&
              this.tmxsfsegNumFin.equals(other.getTmxsfsegNumFin()))) &&
            ((this.tmxsfsegTN==null && other.getTmxsfsegTN()==null) || 
             (this.tmxsfsegTN!=null &&
              this.tmxsfsegTN.equals(other.getTmxsfsegTN()))) &&
            ((this.tmxsfsegId==null && other.getTmxsfsegId()==null) || 
             (this.tmxsfsegId!=null &&
              this.tmxsfsegId.equals(other.getTmxsfsegId()))) &&
            ((this.tmxsfsegStatus==null && other.getTmxsfsegStatus()==null) || 
             (this.tmxsfsegStatus!=null &&
              this.tmxsfsegStatus.equals(other.getTmxsfsegStatus()))) &&
            ((this.tmxsfsegIdesp==null && other.getTmxsfsegIdesp()==null) || 
             (this.tmxsfsegIdesp!=null &&
              this.tmxsfsegIdesp.equals(other.getTmxsfsegIdesp()))) &&
            ((this.tmxsfsegTS==null && other.getTmxsfsegTS()==null) || 
             (this.tmxsfsegTS!=null &&
              this.tmxsfsegTS.equals(other.getTmxsfsegTS()))) &&
            ((this.tmxsfsegObser==null && other.getTmxsfsegObser()==null) || 
             (this.tmxsfsegObser!=null &&
              this.tmxsfsegObser.equals(other.getTmxsfsegObser()))) &&
            ((this.tmxsfsegIdo==null && other.getTmxsfsegIdo()==null) || 
             (this.tmxsfsegIdo!=null &&
              this.tmxsfsegIdo.equals(other.getTmxsfsegIdo()))) &&
            ((this.tmxsfsegIda==null && other.getTmxsfsegIda()==null) || 
             (this.tmxsfsegIda!=null &&
              this.tmxsfsegIda.equals(other.getTmxsfsegIda()))) &&
            ((this.tmxsfsegTSer==null && other.getTmxsfsegTSer()==null) || 
             (this.tmxsfsegTSer!=null &&
              this.tmxsfsegTSer.equals(other.getTmxsfsegTSer()))) &&
            ((this.tmxsfsegIdDiv==null && other.getTmxsfsegIdDiv()==null) || 
             (this.tmxsfsegIdDiv!=null &&
              this.tmxsfsegIdDiv.equals(other.getTmxsfsegIdDiv()))) &&
            ((this.tmxsfsegIdTNum==null && other.getTmxsfsegIdTNum()==null) || 
             (this.tmxsfsegIdTNum!=null &&
              this.tmxsfsegIdTNum.equals(other.getTmxsfsegIdTNum()))) &&
            ((this.tmxsfsegTClli==null && other.getTmxsfsegTClli()==null) || 
             (this.tmxsfsegTClli!=null &&
              this.tmxsfsegTClli.equals(other.getTmxsfsegTClli()))) &&
            ((this.tmxsfsegFolioPlan==null && other.getTmxsfsegFolioPlan()==null) || 
             (this.tmxsfsegFolioPlan!=null &&
              this.tmxsfsegFolioPlan.equals(other.getTmxsfsegFolioPlan()))) &&
            ((this.tmxsfsegCompania==null && other.getTmxsfsegCompania()==null) || 
             (this.tmxsfsegCompania!=null &&
              this.tmxsfsegCompania.equals(other.getTmxsfsegCompania()))) &&
            ((this.tmxsfsegSiglasPis==null && other.getTmxsfsegSiglasPis()==null) || 
             (this.tmxsfsegSiglasPis!=null &&
              this.tmxsfsegSiglasPis.equals(other.getTmxsfsegSiglasPis()))) &&
            ((this.tmxsfsegDpc==null && other.getTmxsfsegDpc()==null) || 
             (this.tmxsfsegDpc!=null &&
              this.tmxsfsegDpc.equals(other.getTmxsfsegDpc()))) &&
            ((this.tmxsfsegTecnologia==null && other.getTmxsfsegTecnologia()==null) || 
             (this.tmxsfsegTecnologia!=null &&
              this.tmxsfsegTecnologia.equals(other.getTmxsfsegTecnologia()))) &&
            ((this.tmxsfsegIdCia==null && other.getTmxsfsegIdCia()==null) || 
             (this.tmxsfsegIdCia!=null &&
              this.tmxsfsegIdCia.equals(other.getTmxsfsegIdCia()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.uniquequery==null && other.getUniquequery()==null) || 
             (this.uniquequery!=null &&
              this.uniquequery.equals(other.getUniquequery()))) &&
            ((this.recordid==null && other.getRecordid()==null) || 
             (this.recordid!=null &&
              this.recordid.equals(other.getRecordid()))) &&
            ((this.updatecounter==null && other.getUpdatecounter()==null) || 
             (this.updatecounter!=null &&
              this.updatecounter.equals(other.getUpdatecounter())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTmxsfsegNoNal() != null) {
            _hashCode += getTmxsfsegNoNal().hashCode();
        }
        if (getTmxsfsegClliSist() != null) {
            _hashCode += getTmxsfsegClliSist().hashCode();
        }
        if (getTmxsfsegCvecensal() != null) {
            _hashCode += getTmxsfsegCvecensal().hashCode();
        }
        if (getTmxsfsegRed() != null) {
            _hashCode += getTmxsfsegRed().hashCode();
        }
        if (getTmxsfsegEstado() != null) {
            _hashCode += getTmxsfsegEstado().hashCode();
        }
        if (getTmxsfsegCentral() != null) {
            _hashCode += getTmxsfsegCentral().hashCode();
        }
        if (getTmxsfsegDirDiv() != null) {
            _hashCode += getTmxsfsegDirDiv().hashCode();
        }
        if (getTmxsfsegEdificio() != null) {
            _hashCode += getTmxsfsegEdificio().hashCode();
        }
        if (getTmxsfsegHost() != null) {
            _hashCode += getTmxsfsegHost().hashCode();
        }
        if (getTmxsfsegAsl() != null) {
            _hashCode += getTmxsfsegAsl().hashCode();
        }
        if (getTmxsfsegPC() != null) {
            _hashCode += getTmxsfsegPC().hashCode();
        }
        if (getTmxsfsegTE() != null) {
            _hashCode += getTmxsfsegTE().hashCode();
        }
        if (getTmxsfsegCL() != null) {
            _hashCode += getTmxsfsegCL().hashCode();
        }
        if (getTmxsfsegSerie() != null) {
            _hashCode += getTmxsfsegSerie().hashCode();
        }
        if (getTmxsfsegNumIni() != null) {
            _hashCode += getTmxsfsegNumIni().hashCode();
        }
        if (getTmxsfsegNumFin() != null) {
            _hashCode += getTmxsfsegNumFin().hashCode();
        }
        if (getTmxsfsegTN() != null) {
            _hashCode += getTmxsfsegTN().hashCode();
        }
        if (getTmxsfsegId() != null) {
            _hashCode += getTmxsfsegId().hashCode();
        }
        if (getTmxsfsegStatus() != null) {
            _hashCode += getTmxsfsegStatus().hashCode();
        }
        if (getTmxsfsegIdesp() != null) {
            _hashCode += getTmxsfsegIdesp().hashCode();
        }
        if (getTmxsfsegTS() != null) {
            _hashCode += getTmxsfsegTS().hashCode();
        }
        if (getTmxsfsegObser() != null) {
            _hashCode += getTmxsfsegObser().hashCode();
        }
        if (getTmxsfsegIdo() != null) {
            _hashCode += getTmxsfsegIdo().hashCode();
        }
        if (getTmxsfsegIda() != null) {
            _hashCode += getTmxsfsegIda().hashCode();
        }
        if (getTmxsfsegTSer() != null) {
            _hashCode += getTmxsfsegTSer().hashCode();
        }
        if (getTmxsfsegIdDiv() != null) {
            _hashCode += getTmxsfsegIdDiv().hashCode();
        }
        if (getTmxsfsegIdTNum() != null) {
            _hashCode += getTmxsfsegIdTNum().hashCode();
        }
        if (getTmxsfsegTClli() != null) {
            _hashCode += getTmxsfsegTClli().hashCode();
        }
        if (getTmxsfsegFolioPlan() != null) {
            _hashCode += getTmxsfsegFolioPlan().hashCode();
        }
        if (getTmxsfsegCompania() != null) {
            _hashCode += getTmxsfsegCompania().hashCode();
        }
        if (getTmxsfsegSiglasPis() != null) {
            _hashCode += getTmxsfsegSiglasPis().hashCode();
        }
        if (getTmxsfsegDpc() != null) {
            _hashCode += getTmxsfsegDpc().hashCode();
        }
        if (getTmxsfsegTecnologia() != null) {
            _hashCode += getTmxsfsegTecnologia().hashCode();
        }
        if (getTmxsfsegIdCia() != null) {
            _hashCode += getTmxsfsegIdCia().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getUniquequery() != null) {
            _hashCode += getUniquequery().hashCode();
        }
        if (getRecordid() != null) {
            _hashCode += getRecordid().hashCode();
        }
        if (getUpdatecounter() != null) {
            _hashCode += getUpdatecounter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TmxsfsegsidecciInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfsegsidecciInstanceType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("query");
        attrField.setXmlName(new javax.xml.namespace.QName("", "query"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("uniquequery");
        attrField.setXmlName(new javax.xml.namespace.QName("", "uniquequery"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recordid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "recordid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("updatecounter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "updatecounter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegNoNal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.no.nal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegClliSist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.clli.sist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegCvecensal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.cvecensal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegRed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.red"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegCentral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegDirDiv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.dir.div"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegEdificio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.edificio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegHost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegAsl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.asl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.p.c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegTE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.t.e"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegCL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.c.l"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegNumIni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.num.ini"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegNumFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.num.fin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegTN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.t.n"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegIdesp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.idesp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.t.s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegObser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.obser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegIdo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.ido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegIda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.ida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegTSer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.t.ser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegIdDiv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.id.div"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegIdTNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.id.t.num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegTClli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.t.clli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegFolioPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.folio.plan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegCompania");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.compania"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegSiglasPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.siglas.pis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegDpc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.dpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegTecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.tecnologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmxsfsegIdCia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tmxsfseg.id.cia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DecimalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "AttachmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "attachment"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
