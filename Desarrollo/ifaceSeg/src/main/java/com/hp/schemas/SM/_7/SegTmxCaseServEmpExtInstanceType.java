/**
 * SegTmxCaseServEmpExtInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class SegTmxCaseServEmpExtInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType pobalnombre;

    private com.hp.schemas.SM._7.Common.StringType pobalnombre2;

    private com.hp.schemas.SM._7.Common.StringType domicilioa;

    private com.hp.schemas.SM._7.Common.StringType domiciliob;

    private com.hp.schemas.SM._7.Common.StringType fasen;

    private com.hp.schemas.SM._7.Common.StringType efase;

    private com.hp.schemas.SM._7.Common.StringType famservrep;

    private com.hp.schemas.SM._7.Common.StringType subtservrep;

    private com.hp.schemas.SM._7.Common.StringType criticidadservicio;

    private com.hp.schemas.SM._7.Common.StringType medioservicio;

    private com.hp.schemas.SM._7.Common.StringType segmentoservicio;

    private com.hp.schemas.SM._7.Common.StringType ctamtraserv;

    private com.hp.schemas.SM._7.Common.StringType ncontratoser;

    private com.hp.schemas.SM._7.Common.StringType cliente;

    private com.hp.schemas.SM._7.Common.StringType clientesitioa;

    private com.hp.schemas.SM._7.Common.StringType clientefinalrsocial;

    private com.hp.schemas.SM._7.Common.StringType clientesitiob;

    private com.hp.schemas.SM._7.Common.StringType cucemp;

    private com.hp.schemas.SM._7.Common.StringType clientetopten;

    private com.hp.schemas.SM._7.Common.StringType nomejecutivo;

    private com.hp.schemas.SM._7.Common.StringType telejecutivo;

    private com.hp.schemas.SM._7.Common.StringType correoejecutivo;

    private com.hp.schemas.SM._7.Common.StringType centroatiende;

    private com.hp.schemas.SM._7.Common.StringType refsisa;

    private com.hp.schemas.SM._7.Common.StringType cpservicio;

    private com.hp.schemas.SM._7.Common.StringType cuccoorporativo;

    private com.hp.schemas.SM._7.Common.StringType dilacionservicio;

    private com.hp.schemas.SM._7.Common.StringType areaservicio;

    private com.hp.schemas.SM._7.Common.StringType movimiento;

    private com.hp.schemas.SM._7.Common.StringType statusresp;

    private com.hp.schemas.SM._7.Common.StringType cppuntab;

    private com.hp.schemas.SM._7.Common.StringType entpuntaa;

    private com.hp.schemas.SM._7.Common.StringType ebtpuntab;

    private com.hp.schemas.SM._7.Common.DateTimeType sysmodtime;

    private com.hp.schemas.SM._7.Common.StringType nombrearchivotopologico;

    private com.hp.schemas.SM._7.Common.StringType folioserv;

    private com.hp.schemas.SM._7.Common.StringType gdntroncal;

    private com.hp.schemas.SM._7.Common.StringType rangoinicial;

    private com.hp.schemas.SM._7.Common.StringType rangofinal;

    private com.hp.schemas.SM._7.Common.StringType estadoa;

    private com.hp.schemas.SM._7.Common.StringType folioempresa;

    private com.hp.schemas.SM._7.Common.DateTimeType serfpes;

    private com.hp.schemas.SM._7.Common.BooleanType flagenvio;

    private com.hp.schemas.SM._7.Common.StringType acal;

    private com.hp.schemas.SM._7.Common.StringType acan;

    private com.hp.schemas.SM._7.Common.StringType tsen;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public SegTmxCaseServEmpExtInstanceType() {
    }

    public SegTmxCaseServEmpExtInstanceType(
           com.hp.schemas.SM._7.Common.StringType pobalnombre,
           com.hp.schemas.SM._7.Common.StringType pobalnombre2,
           com.hp.schemas.SM._7.Common.StringType domicilioa,
           com.hp.schemas.SM._7.Common.StringType domiciliob,
           com.hp.schemas.SM._7.Common.StringType fasen,
           com.hp.schemas.SM._7.Common.StringType efase,
           com.hp.schemas.SM._7.Common.StringType famservrep,
           com.hp.schemas.SM._7.Common.StringType subtservrep,
           com.hp.schemas.SM._7.Common.StringType criticidadservicio,
           com.hp.schemas.SM._7.Common.StringType medioservicio,
           com.hp.schemas.SM._7.Common.StringType segmentoservicio,
           com.hp.schemas.SM._7.Common.StringType ctamtraserv,
           com.hp.schemas.SM._7.Common.StringType ncontratoser,
           com.hp.schemas.SM._7.Common.StringType cliente,
           com.hp.schemas.SM._7.Common.StringType clientesitioa,
           com.hp.schemas.SM._7.Common.StringType clientefinalrsocial,
           com.hp.schemas.SM._7.Common.StringType clientesitiob,
           com.hp.schemas.SM._7.Common.StringType cucemp,
           com.hp.schemas.SM._7.Common.StringType clientetopten,
           com.hp.schemas.SM._7.Common.StringType nomejecutivo,
           com.hp.schemas.SM._7.Common.StringType telejecutivo,
           com.hp.schemas.SM._7.Common.StringType correoejecutivo,
           com.hp.schemas.SM._7.Common.StringType centroatiende,
           com.hp.schemas.SM._7.Common.StringType refsisa,
           com.hp.schemas.SM._7.Common.StringType cpservicio,
           com.hp.schemas.SM._7.Common.StringType cuccoorporativo,
           com.hp.schemas.SM._7.Common.StringType dilacionservicio,
           com.hp.schemas.SM._7.Common.StringType areaservicio,
           com.hp.schemas.SM._7.Common.StringType movimiento,
           com.hp.schemas.SM._7.Common.StringType statusresp,
           com.hp.schemas.SM._7.Common.StringType cppuntab,
           com.hp.schemas.SM._7.Common.StringType entpuntaa,
           com.hp.schemas.SM._7.Common.StringType ebtpuntab,
           com.hp.schemas.SM._7.Common.DateTimeType sysmodtime,
           com.hp.schemas.SM._7.Common.StringType nombrearchivotopologico,
           com.hp.schemas.SM._7.Common.StringType folioserv,
           com.hp.schemas.SM._7.Common.StringType gdntroncal,
           com.hp.schemas.SM._7.Common.StringType rangoinicial,
           com.hp.schemas.SM._7.Common.StringType rangofinal,
           com.hp.schemas.SM._7.Common.StringType estadoa,
           com.hp.schemas.SM._7.Common.StringType folioempresa,
           com.hp.schemas.SM._7.Common.DateTimeType serfpes,
           com.hp.schemas.SM._7.Common.BooleanType flagenvio,
           com.hp.schemas.SM._7.Common.StringType acal,
           com.hp.schemas.SM._7.Common.StringType acan,
           com.hp.schemas.SM._7.Common.StringType tsen,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.pobalnombre = pobalnombre;
           this.pobalnombre2 = pobalnombre2;
           this.domicilioa = domicilioa;
           this.domiciliob = domiciliob;
           this.fasen = fasen;
           this.efase = efase;
           this.famservrep = famservrep;
           this.subtservrep = subtservrep;
           this.criticidadservicio = criticidadservicio;
           this.medioservicio = medioservicio;
           this.segmentoservicio = segmentoservicio;
           this.ctamtraserv = ctamtraserv;
           this.ncontratoser = ncontratoser;
           this.cliente = cliente;
           this.clientesitioa = clientesitioa;
           this.clientefinalrsocial = clientefinalrsocial;
           this.clientesitiob = clientesitiob;
           this.cucemp = cucemp;
           this.clientetopten = clientetopten;
           this.nomejecutivo = nomejecutivo;
           this.telejecutivo = telejecutivo;
           this.correoejecutivo = correoejecutivo;
           this.centroatiende = centroatiende;
           this.refsisa = refsisa;
           this.cpservicio = cpservicio;
           this.cuccoorporativo = cuccoorporativo;
           this.dilacionservicio = dilacionservicio;
           this.areaservicio = areaservicio;
           this.movimiento = movimiento;
           this.statusresp = statusresp;
           this.cppuntab = cppuntab;
           this.entpuntaa = entpuntaa;
           this.ebtpuntab = ebtpuntab;
           this.sysmodtime = sysmodtime;
           this.nombrearchivotopologico = nombrearchivotopologico;
           this.folioserv = folioserv;
           this.gdntroncal = gdntroncal;
           this.rangoinicial = rangoinicial;
           this.rangofinal = rangofinal;
           this.estadoa = estadoa;
           this.folioempresa = folioempresa;
           this.serfpes = serfpes;
           this.flagenvio = flagenvio;
           this.acal = acal;
           this.acan = acan;
           this.tsen = tsen;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the pobalnombre value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return pobalnombre
     */
    public com.hp.schemas.SM._7.Common.StringType getPobalnombre() {
        return pobalnombre;
    }


    /**
     * Sets the pobalnombre value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param pobalnombre
     */
    public void setPobalnombre(com.hp.schemas.SM._7.Common.StringType pobalnombre) {
        this.pobalnombre = pobalnombre;
    }


    /**
     * Gets the pobalnombre2 value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return pobalnombre2
     */
    public com.hp.schemas.SM._7.Common.StringType getPobalnombre2() {
        return pobalnombre2;
    }


    /**
     * Sets the pobalnombre2 value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param pobalnombre2
     */
    public void setPobalnombre2(com.hp.schemas.SM._7.Common.StringType pobalnombre2) {
        this.pobalnombre2 = pobalnombre2;
    }


    /**
     * Gets the domicilioa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return domicilioa
     */
    public com.hp.schemas.SM._7.Common.StringType getDomicilioa() {
        return domicilioa;
    }


    /**
     * Sets the domicilioa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param domicilioa
     */
    public void setDomicilioa(com.hp.schemas.SM._7.Common.StringType domicilioa) {
        this.domicilioa = domicilioa;
    }


    /**
     * Gets the domiciliob value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return domiciliob
     */
    public com.hp.schemas.SM._7.Common.StringType getDomiciliob() {
        return domiciliob;
    }


    /**
     * Sets the domiciliob value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param domiciliob
     */
    public void setDomiciliob(com.hp.schemas.SM._7.Common.StringType domiciliob) {
        this.domiciliob = domiciliob;
    }


    /**
     * Gets the fasen value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return fasen
     */
    public com.hp.schemas.SM._7.Common.StringType getFasen() {
        return fasen;
    }


    /**
     * Sets the fasen value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param fasen
     */
    public void setFasen(com.hp.schemas.SM._7.Common.StringType fasen) {
        this.fasen = fasen;
    }


    /**
     * Gets the efase value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return efase
     */
    public com.hp.schemas.SM._7.Common.StringType getEfase() {
        return efase;
    }


    /**
     * Sets the efase value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param efase
     */
    public void setEfase(com.hp.schemas.SM._7.Common.StringType efase) {
        this.efase = efase;
    }


    /**
     * Gets the famservrep value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return famservrep
     */
    public com.hp.schemas.SM._7.Common.StringType getFamservrep() {
        return famservrep;
    }


    /**
     * Sets the famservrep value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param famservrep
     */
    public void setFamservrep(com.hp.schemas.SM._7.Common.StringType famservrep) {
        this.famservrep = famservrep;
    }


    /**
     * Gets the subtservrep value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return subtservrep
     */
    public com.hp.schemas.SM._7.Common.StringType getSubtservrep() {
        return subtservrep;
    }


    /**
     * Sets the subtservrep value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param subtservrep
     */
    public void setSubtservrep(com.hp.schemas.SM._7.Common.StringType subtservrep) {
        this.subtservrep = subtservrep;
    }


    /**
     * Gets the criticidadservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return criticidadservicio
     */
    public com.hp.schemas.SM._7.Common.StringType getCriticidadservicio() {
        return criticidadservicio;
    }


    /**
     * Sets the criticidadservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param criticidadservicio
     */
    public void setCriticidadservicio(com.hp.schemas.SM._7.Common.StringType criticidadservicio) {
        this.criticidadservicio = criticidadservicio;
    }


    /**
     * Gets the medioservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return medioservicio
     */
    public com.hp.schemas.SM._7.Common.StringType getMedioservicio() {
        return medioservicio;
    }


    /**
     * Sets the medioservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param medioservicio
     */
    public void setMedioservicio(com.hp.schemas.SM._7.Common.StringType medioservicio) {
        this.medioservicio = medioservicio;
    }


    /**
     * Gets the segmentoservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return segmentoservicio
     */
    public com.hp.schemas.SM._7.Common.StringType getSegmentoservicio() {
        return segmentoservicio;
    }


    /**
     * Sets the segmentoservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param segmentoservicio
     */
    public void setSegmentoservicio(com.hp.schemas.SM._7.Common.StringType segmentoservicio) {
        this.segmentoservicio = segmentoservicio;
    }


    /**
     * Gets the ctamtraserv value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return ctamtraserv
     */
    public com.hp.schemas.SM._7.Common.StringType getCtamtraserv() {
        return ctamtraserv;
    }


    /**
     * Sets the ctamtraserv value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param ctamtraserv
     */
    public void setCtamtraserv(com.hp.schemas.SM._7.Common.StringType ctamtraserv) {
        this.ctamtraserv = ctamtraserv;
    }


    /**
     * Gets the ncontratoser value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return ncontratoser
     */
    public com.hp.schemas.SM._7.Common.StringType getNcontratoser() {
        return ncontratoser;
    }


    /**
     * Sets the ncontratoser value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param ncontratoser
     */
    public void setNcontratoser(com.hp.schemas.SM._7.Common.StringType ncontratoser) {
        this.ncontratoser = ncontratoser;
    }


    /**
     * Gets the cliente value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return cliente
     */
    public com.hp.schemas.SM._7.Common.StringType getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param cliente
     */
    public void setCliente(com.hp.schemas.SM._7.Common.StringType cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the clientesitioa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return clientesitioa
     */
    public com.hp.schemas.SM._7.Common.StringType getClientesitioa() {
        return clientesitioa;
    }


    /**
     * Sets the clientesitioa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param clientesitioa
     */
    public void setClientesitioa(com.hp.schemas.SM._7.Common.StringType clientesitioa) {
        this.clientesitioa = clientesitioa;
    }


    /**
     * Gets the clientefinalrsocial value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return clientefinalrsocial
     */
    public com.hp.schemas.SM._7.Common.StringType getClientefinalrsocial() {
        return clientefinalrsocial;
    }


    /**
     * Sets the clientefinalrsocial value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param clientefinalrsocial
     */
    public void setClientefinalrsocial(com.hp.schemas.SM._7.Common.StringType clientefinalrsocial) {
        this.clientefinalrsocial = clientefinalrsocial;
    }


    /**
     * Gets the clientesitiob value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return clientesitiob
     */
    public com.hp.schemas.SM._7.Common.StringType getClientesitiob() {
        return clientesitiob;
    }


    /**
     * Sets the clientesitiob value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param clientesitiob
     */
    public void setClientesitiob(com.hp.schemas.SM._7.Common.StringType clientesitiob) {
        this.clientesitiob = clientesitiob;
    }


    /**
     * Gets the cucemp value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return cucemp
     */
    public com.hp.schemas.SM._7.Common.StringType getCucemp() {
        return cucemp;
    }


    /**
     * Sets the cucemp value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param cucemp
     */
    public void setCucemp(com.hp.schemas.SM._7.Common.StringType cucemp) {
        this.cucemp = cucemp;
    }


    /**
     * Gets the clientetopten value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return clientetopten
     */
    public com.hp.schemas.SM._7.Common.StringType getClientetopten() {
        return clientetopten;
    }


    /**
     * Sets the clientetopten value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param clientetopten
     */
    public void setClientetopten(com.hp.schemas.SM._7.Common.StringType clientetopten) {
        this.clientetopten = clientetopten;
    }


    /**
     * Gets the nomejecutivo value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return nomejecutivo
     */
    public com.hp.schemas.SM._7.Common.StringType getNomejecutivo() {
        return nomejecutivo;
    }


    /**
     * Sets the nomejecutivo value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param nomejecutivo
     */
    public void setNomejecutivo(com.hp.schemas.SM._7.Common.StringType nomejecutivo) {
        this.nomejecutivo = nomejecutivo;
    }


    /**
     * Gets the telejecutivo value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return telejecutivo
     */
    public com.hp.schemas.SM._7.Common.StringType getTelejecutivo() {
        return telejecutivo;
    }


    /**
     * Sets the telejecutivo value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param telejecutivo
     */
    public void setTelejecutivo(com.hp.schemas.SM._7.Common.StringType telejecutivo) {
        this.telejecutivo = telejecutivo;
    }


    /**
     * Gets the correoejecutivo value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return correoejecutivo
     */
    public com.hp.schemas.SM._7.Common.StringType getCorreoejecutivo() {
        return correoejecutivo;
    }


    /**
     * Sets the correoejecutivo value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param correoejecutivo
     */
    public void setCorreoejecutivo(com.hp.schemas.SM._7.Common.StringType correoejecutivo) {
        this.correoejecutivo = correoejecutivo;
    }


    /**
     * Gets the centroatiende value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return centroatiende
     */
    public com.hp.schemas.SM._7.Common.StringType getCentroatiende() {
        return centroatiende;
    }


    /**
     * Sets the centroatiende value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param centroatiende
     */
    public void setCentroatiende(com.hp.schemas.SM._7.Common.StringType centroatiende) {
        this.centroatiende = centroatiende;
    }


    /**
     * Gets the refsisa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return refsisa
     */
    public com.hp.schemas.SM._7.Common.StringType getRefsisa() {
        return refsisa;
    }


    /**
     * Sets the refsisa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param refsisa
     */
    public void setRefsisa(com.hp.schemas.SM._7.Common.StringType refsisa) {
        this.refsisa = refsisa;
    }


    /**
     * Gets the cpservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return cpservicio
     */
    public com.hp.schemas.SM._7.Common.StringType getCpservicio() {
        return cpservicio;
    }


    /**
     * Sets the cpservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param cpservicio
     */
    public void setCpservicio(com.hp.schemas.SM._7.Common.StringType cpservicio) {
        this.cpservicio = cpservicio;
    }


    /**
     * Gets the cuccoorporativo value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return cuccoorporativo
     */
    public com.hp.schemas.SM._7.Common.StringType getCuccoorporativo() {
        return cuccoorporativo;
    }


    /**
     * Sets the cuccoorporativo value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param cuccoorporativo
     */
    public void setCuccoorporativo(com.hp.schemas.SM._7.Common.StringType cuccoorporativo) {
        this.cuccoorporativo = cuccoorporativo;
    }


    /**
     * Gets the dilacionservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return dilacionservicio
     */
    public com.hp.schemas.SM._7.Common.StringType getDilacionservicio() {
        return dilacionservicio;
    }


    /**
     * Sets the dilacionservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param dilacionservicio
     */
    public void setDilacionservicio(com.hp.schemas.SM._7.Common.StringType dilacionservicio) {
        this.dilacionservicio = dilacionservicio;
    }


    /**
     * Gets the areaservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return areaservicio
     */
    public com.hp.schemas.SM._7.Common.StringType getAreaservicio() {
        return areaservicio;
    }


    /**
     * Sets the areaservicio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param areaservicio
     */
    public void setAreaservicio(com.hp.schemas.SM._7.Common.StringType areaservicio) {
        this.areaservicio = areaservicio;
    }


    /**
     * Gets the movimiento value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return movimiento
     */
    public com.hp.schemas.SM._7.Common.StringType getMovimiento() {
        return movimiento;
    }


    /**
     * Sets the movimiento value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param movimiento
     */
    public void setMovimiento(com.hp.schemas.SM._7.Common.StringType movimiento) {
        this.movimiento = movimiento;
    }


    /**
     * Gets the statusresp value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return statusresp
     */
    public com.hp.schemas.SM._7.Common.StringType getStatusresp() {
        return statusresp;
    }


    /**
     * Sets the statusresp value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param statusresp
     */
    public void setStatusresp(com.hp.schemas.SM._7.Common.StringType statusresp) {
        this.statusresp = statusresp;
    }


    /**
     * Gets the cppuntab value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return cppuntab
     */
    public com.hp.schemas.SM._7.Common.StringType getCppuntab() {
        return cppuntab;
    }


    /**
     * Sets the cppuntab value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param cppuntab
     */
    public void setCppuntab(com.hp.schemas.SM._7.Common.StringType cppuntab) {
        this.cppuntab = cppuntab;
    }


    /**
     * Gets the entpuntaa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return entpuntaa
     */
    public com.hp.schemas.SM._7.Common.StringType getEntpuntaa() {
        return entpuntaa;
    }


    /**
     * Sets the entpuntaa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param entpuntaa
     */
    public void setEntpuntaa(com.hp.schemas.SM._7.Common.StringType entpuntaa) {
        this.entpuntaa = entpuntaa;
    }


    /**
     * Gets the ebtpuntab value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return ebtpuntab
     */
    public com.hp.schemas.SM._7.Common.StringType getEbtpuntab() {
        return ebtpuntab;
    }


    /**
     * Sets the ebtpuntab value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param ebtpuntab
     */
    public void setEbtpuntab(com.hp.schemas.SM._7.Common.StringType ebtpuntab) {
        this.ebtpuntab = ebtpuntab;
    }


    /**
     * Gets the sysmodtime value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return sysmodtime
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getSysmodtime() {
        return sysmodtime;
    }


    /**
     * Sets the sysmodtime value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param sysmodtime
     */
    public void setSysmodtime(com.hp.schemas.SM._7.Common.DateTimeType sysmodtime) {
        this.sysmodtime = sysmodtime;
    }


    /**
     * Gets the nombrearchivotopologico value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return nombrearchivotopologico
     */
    public com.hp.schemas.SM._7.Common.StringType getNombrearchivotopologico() {
        return nombrearchivotopologico;
    }


    /**
     * Sets the nombrearchivotopologico value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param nombrearchivotopologico
     */
    public void setNombrearchivotopologico(com.hp.schemas.SM._7.Common.StringType nombrearchivotopologico) {
        this.nombrearchivotopologico = nombrearchivotopologico;
    }


    /**
     * Gets the folioserv value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return folioserv
     */
    public com.hp.schemas.SM._7.Common.StringType getFolioserv() {
        return folioserv;
    }


    /**
     * Sets the folioserv value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param folioserv
     */
    public void setFolioserv(com.hp.schemas.SM._7.Common.StringType folioserv) {
        this.folioserv = folioserv;
    }


    /**
     * Gets the gdntroncal value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return gdntroncal
     */
    public com.hp.schemas.SM._7.Common.StringType getGdntroncal() {
        return gdntroncal;
    }


    /**
     * Sets the gdntroncal value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param gdntroncal
     */
    public void setGdntroncal(com.hp.schemas.SM._7.Common.StringType gdntroncal) {
        this.gdntroncal = gdntroncal;
    }


    /**
     * Gets the rangoinicial value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return rangoinicial
     */
    public com.hp.schemas.SM._7.Common.StringType getRangoinicial() {
        return rangoinicial;
    }


    /**
     * Sets the rangoinicial value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param rangoinicial
     */
    public void setRangoinicial(com.hp.schemas.SM._7.Common.StringType rangoinicial) {
        this.rangoinicial = rangoinicial;
    }


    /**
     * Gets the rangofinal value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return rangofinal
     */
    public com.hp.schemas.SM._7.Common.StringType getRangofinal() {
        return rangofinal;
    }


    /**
     * Sets the rangofinal value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param rangofinal
     */
    public void setRangofinal(com.hp.schemas.SM._7.Common.StringType rangofinal) {
        this.rangofinal = rangofinal;
    }


    /**
     * Gets the estadoa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return estadoa
     */
    public com.hp.schemas.SM._7.Common.StringType getEstadoa() {
        return estadoa;
    }


    /**
     * Sets the estadoa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param estadoa
     */
    public void setEstadoa(com.hp.schemas.SM._7.Common.StringType estadoa) {
        this.estadoa = estadoa;
    }


    /**
     * Gets the folioempresa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return folioempresa
     */
    public com.hp.schemas.SM._7.Common.StringType getFolioempresa() {
        return folioempresa;
    }


    /**
     * Sets the folioempresa value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param folioempresa
     */
    public void setFolioempresa(com.hp.schemas.SM._7.Common.StringType folioempresa) {
        this.folioempresa = folioempresa;
    }


    /**
     * Gets the serfpes value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return serfpes
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getSerfpes() {
        return serfpes;
    }


    /**
     * Sets the serfpes value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param serfpes
     */
    public void setSerfpes(com.hp.schemas.SM._7.Common.DateTimeType serfpes) {
        this.serfpes = serfpes;
    }


    /**
     * Gets the flagenvio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return flagenvio
     */
    public com.hp.schemas.SM._7.Common.BooleanType getFlagenvio() {
        return flagenvio;
    }


    /**
     * Sets the flagenvio value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param flagenvio
     */
    public void setFlagenvio(com.hp.schemas.SM._7.Common.BooleanType flagenvio) {
        this.flagenvio = flagenvio;
    }


    /**
     * Gets the acal value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return acal
     */
    public com.hp.schemas.SM._7.Common.StringType getAcal() {
        return acal;
    }


    /**
     * Sets the acal value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param acal
     */
    public void setAcal(com.hp.schemas.SM._7.Common.StringType acal) {
        this.acal = acal;
    }


    /**
     * Gets the acan value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return acan
     */
    public com.hp.schemas.SM._7.Common.StringType getAcan() {
        return acan;
    }


    /**
     * Sets the acan value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param acan
     */
    public void setAcan(com.hp.schemas.SM._7.Common.StringType acan) {
        this.acan = acan;
    }


    /**
     * Gets the tsen value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return tsen
     */
    public com.hp.schemas.SM._7.Common.StringType getTsen() {
        return tsen;
    }


    /**
     * Sets the tsen value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param tsen
     */
    public void setTsen(com.hp.schemas.SM._7.Common.StringType tsen) {
        this.tsen = tsen;
    }


    /**
     * Gets the attachments value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this SegTmxCaseServEmpExtInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SegTmxCaseServEmpExtInstanceType)) return false;
        SegTmxCaseServEmpExtInstanceType other = (SegTmxCaseServEmpExtInstanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pobalnombre==null && other.getPobalnombre()==null) || 
             (this.pobalnombre!=null &&
              this.pobalnombre.equals(other.getPobalnombre()))) &&
            ((this.pobalnombre2==null && other.getPobalnombre2()==null) || 
             (this.pobalnombre2!=null &&
              this.pobalnombre2.equals(other.getPobalnombre2()))) &&
            ((this.domicilioa==null && other.getDomicilioa()==null) || 
             (this.domicilioa!=null &&
              this.domicilioa.equals(other.getDomicilioa()))) &&
            ((this.domiciliob==null && other.getDomiciliob()==null) || 
             (this.domiciliob!=null &&
              this.domiciliob.equals(other.getDomiciliob()))) &&
            ((this.fasen==null && other.getFasen()==null) || 
             (this.fasen!=null &&
              this.fasen.equals(other.getFasen()))) &&
            ((this.efase==null && other.getEfase()==null) || 
             (this.efase!=null &&
              this.efase.equals(other.getEfase()))) &&
            ((this.famservrep==null && other.getFamservrep()==null) || 
             (this.famservrep!=null &&
              this.famservrep.equals(other.getFamservrep()))) &&
            ((this.subtservrep==null && other.getSubtservrep()==null) || 
             (this.subtservrep!=null &&
              this.subtservrep.equals(other.getSubtservrep()))) &&
            ((this.criticidadservicio==null && other.getCriticidadservicio()==null) || 
             (this.criticidadservicio!=null &&
              this.criticidadservicio.equals(other.getCriticidadservicio()))) &&
            ((this.medioservicio==null && other.getMedioservicio()==null) || 
             (this.medioservicio!=null &&
              this.medioservicio.equals(other.getMedioservicio()))) &&
            ((this.segmentoservicio==null && other.getSegmentoservicio()==null) || 
             (this.segmentoservicio!=null &&
              this.segmentoservicio.equals(other.getSegmentoservicio()))) &&
            ((this.ctamtraserv==null && other.getCtamtraserv()==null) || 
             (this.ctamtraserv!=null &&
              this.ctamtraserv.equals(other.getCtamtraserv()))) &&
            ((this.ncontratoser==null && other.getNcontratoser()==null) || 
             (this.ncontratoser!=null &&
              this.ncontratoser.equals(other.getNcontratoser()))) &&
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.clientesitioa==null && other.getClientesitioa()==null) || 
             (this.clientesitioa!=null &&
              this.clientesitioa.equals(other.getClientesitioa()))) &&
            ((this.clientefinalrsocial==null && other.getClientefinalrsocial()==null) || 
             (this.clientefinalrsocial!=null &&
              this.clientefinalrsocial.equals(other.getClientefinalrsocial()))) &&
            ((this.clientesitiob==null && other.getClientesitiob()==null) || 
             (this.clientesitiob!=null &&
              this.clientesitiob.equals(other.getClientesitiob()))) &&
            ((this.cucemp==null && other.getCucemp()==null) || 
             (this.cucemp!=null &&
              this.cucemp.equals(other.getCucemp()))) &&
            ((this.clientetopten==null && other.getClientetopten()==null) || 
             (this.clientetopten!=null &&
              this.clientetopten.equals(other.getClientetopten()))) &&
            ((this.nomejecutivo==null && other.getNomejecutivo()==null) || 
             (this.nomejecutivo!=null &&
              this.nomejecutivo.equals(other.getNomejecutivo()))) &&
            ((this.telejecutivo==null && other.getTelejecutivo()==null) || 
             (this.telejecutivo!=null &&
              this.telejecutivo.equals(other.getTelejecutivo()))) &&
            ((this.correoejecutivo==null && other.getCorreoejecutivo()==null) || 
             (this.correoejecutivo!=null &&
              this.correoejecutivo.equals(other.getCorreoejecutivo()))) &&
            ((this.centroatiende==null && other.getCentroatiende()==null) || 
             (this.centroatiende!=null &&
              this.centroatiende.equals(other.getCentroatiende()))) &&
            ((this.refsisa==null && other.getRefsisa()==null) || 
             (this.refsisa!=null &&
              this.refsisa.equals(other.getRefsisa()))) &&
            ((this.cpservicio==null && other.getCpservicio()==null) || 
             (this.cpservicio!=null &&
              this.cpservicio.equals(other.getCpservicio()))) &&
            ((this.cuccoorporativo==null && other.getCuccoorporativo()==null) || 
             (this.cuccoorporativo!=null &&
              this.cuccoorporativo.equals(other.getCuccoorporativo()))) &&
            ((this.dilacionservicio==null && other.getDilacionservicio()==null) || 
             (this.dilacionservicio!=null &&
              this.dilacionservicio.equals(other.getDilacionservicio()))) &&
            ((this.areaservicio==null && other.getAreaservicio()==null) || 
             (this.areaservicio!=null &&
              this.areaservicio.equals(other.getAreaservicio()))) &&
            ((this.movimiento==null && other.getMovimiento()==null) || 
             (this.movimiento!=null &&
              this.movimiento.equals(other.getMovimiento()))) &&
            ((this.statusresp==null && other.getStatusresp()==null) || 
             (this.statusresp!=null &&
              this.statusresp.equals(other.getStatusresp()))) &&
            ((this.cppuntab==null && other.getCppuntab()==null) || 
             (this.cppuntab!=null &&
              this.cppuntab.equals(other.getCppuntab()))) &&
            ((this.entpuntaa==null && other.getEntpuntaa()==null) || 
             (this.entpuntaa!=null &&
              this.entpuntaa.equals(other.getEntpuntaa()))) &&
            ((this.ebtpuntab==null && other.getEbtpuntab()==null) || 
             (this.ebtpuntab!=null &&
              this.ebtpuntab.equals(other.getEbtpuntab()))) &&
            ((this.sysmodtime==null && other.getSysmodtime()==null) || 
             (this.sysmodtime!=null &&
              this.sysmodtime.equals(other.getSysmodtime()))) &&
            ((this.nombrearchivotopologico==null && other.getNombrearchivotopologico()==null) || 
             (this.nombrearchivotopologico!=null &&
              this.nombrearchivotopologico.equals(other.getNombrearchivotopologico()))) &&
            ((this.folioserv==null && other.getFolioserv()==null) || 
             (this.folioserv!=null &&
              this.folioserv.equals(other.getFolioserv()))) &&
            ((this.gdntroncal==null && other.getGdntroncal()==null) || 
             (this.gdntroncal!=null &&
              this.gdntroncal.equals(other.getGdntroncal()))) &&
            ((this.rangoinicial==null && other.getRangoinicial()==null) || 
             (this.rangoinicial!=null &&
              this.rangoinicial.equals(other.getRangoinicial()))) &&
            ((this.rangofinal==null && other.getRangofinal()==null) || 
             (this.rangofinal!=null &&
              this.rangofinal.equals(other.getRangofinal()))) &&
            ((this.estadoa==null && other.getEstadoa()==null) || 
             (this.estadoa!=null &&
              this.estadoa.equals(other.getEstadoa()))) &&
            ((this.folioempresa==null && other.getFolioempresa()==null) || 
             (this.folioempresa!=null &&
              this.folioempresa.equals(other.getFolioempresa()))) &&
            ((this.serfpes==null && other.getSerfpes()==null) || 
             (this.serfpes!=null &&
              this.serfpes.equals(other.getSerfpes()))) &&
            ((this.flagenvio==null && other.getFlagenvio()==null) || 
             (this.flagenvio!=null &&
              this.flagenvio.equals(other.getFlagenvio()))) &&
            ((this.acal==null && other.getAcal()==null) || 
             (this.acal!=null &&
              this.acal.equals(other.getAcal()))) &&
            ((this.acan==null && other.getAcan()==null) || 
             (this.acan!=null &&
              this.acan.equals(other.getAcan()))) &&
            ((this.tsen==null && other.getTsen()==null) || 
             (this.tsen!=null &&
              this.tsen.equals(other.getTsen()))) &&
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
        if (getPobalnombre() != null) {
            _hashCode += getPobalnombre().hashCode();
        }
        if (getPobalnombre2() != null) {
            _hashCode += getPobalnombre2().hashCode();
        }
        if (getDomicilioa() != null) {
            _hashCode += getDomicilioa().hashCode();
        }
        if (getDomiciliob() != null) {
            _hashCode += getDomiciliob().hashCode();
        }
        if (getFasen() != null) {
            _hashCode += getFasen().hashCode();
        }
        if (getEfase() != null) {
            _hashCode += getEfase().hashCode();
        }
        if (getFamservrep() != null) {
            _hashCode += getFamservrep().hashCode();
        }
        if (getSubtservrep() != null) {
            _hashCode += getSubtservrep().hashCode();
        }
        if (getCriticidadservicio() != null) {
            _hashCode += getCriticidadservicio().hashCode();
        }
        if (getMedioservicio() != null) {
            _hashCode += getMedioservicio().hashCode();
        }
        if (getSegmentoservicio() != null) {
            _hashCode += getSegmentoservicio().hashCode();
        }
        if (getCtamtraserv() != null) {
            _hashCode += getCtamtraserv().hashCode();
        }
        if (getNcontratoser() != null) {
            _hashCode += getNcontratoser().hashCode();
        }
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getClientesitioa() != null) {
            _hashCode += getClientesitioa().hashCode();
        }
        if (getClientefinalrsocial() != null) {
            _hashCode += getClientefinalrsocial().hashCode();
        }
        if (getClientesitiob() != null) {
            _hashCode += getClientesitiob().hashCode();
        }
        if (getCucemp() != null) {
            _hashCode += getCucemp().hashCode();
        }
        if (getClientetopten() != null) {
            _hashCode += getClientetopten().hashCode();
        }
        if (getNomejecutivo() != null) {
            _hashCode += getNomejecutivo().hashCode();
        }
        if (getTelejecutivo() != null) {
            _hashCode += getTelejecutivo().hashCode();
        }
        if (getCorreoejecutivo() != null) {
            _hashCode += getCorreoejecutivo().hashCode();
        }
        if (getCentroatiende() != null) {
            _hashCode += getCentroatiende().hashCode();
        }
        if (getRefsisa() != null) {
            _hashCode += getRefsisa().hashCode();
        }
        if (getCpservicio() != null) {
            _hashCode += getCpservicio().hashCode();
        }
        if (getCuccoorporativo() != null) {
            _hashCode += getCuccoorporativo().hashCode();
        }
        if (getDilacionservicio() != null) {
            _hashCode += getDilacionservicio().hashCode();
        }
        if (getAreaservicio() != null) {
            _hashCode += getAreaservicio().hashCode();
        }
        if (getMovimiento() != null) {
            _hashCode += getMovimiento().hashCode();
        }
        if (getStatusresp() != null) {
            _hashCode += getStatusresp().hashCode();
        }
        if (getCppuntab() != null) {
            _hashCode += getCppuntab().hashCode();
        }
        if (getEntpuntaa() != null) {
            _hashCode += getEntpuntaa().hashCode();
        }
        if (getEbtpuntab() != null) {
            _hashCode += getEbtpuntab().hashCode();
        }
        if (getSysmodtime() != null) {
            _hashCode += getSysmodtime().hashCode();
        }
        if (getNombrearchivotopologico() != null) {
            _hashCode += getNombrearchivotopologico().hashCode();
        }
        if (getFolioserv() != null) {
            _hashCode += getFolioserv().hashCode();
        }
        if (getGdntroncal() != null) {
            _hashCode += getGdntroncal().hashCode();
        }
        if (getRangoinicial() != null) {
            _hashCode += getRangoinicial().hashCode();
        }
        if (getRangofinal() != null) {
            _hashCode += getRangofinal().hashCode();
        }
        if (getEstadoa() != null) {
            _hashCode += getEstadoa().hashCode();
        }
        if (getFolioempresa() != null) {
            _hashCode += getFolioempresa().hashCode();
        }
        if (getSerfpes() != null) {
            _hashCode += getSerfpes().hashCode();
        }
        if (getFlagenvio() != null) {
            _hashCode += getFlagenvio().hashCode();
        }
        if (getAcal() != null) {
            _hashCode += getAcal().hashCode();
        }
        if (getAcan() != null) {
            _hashCode += getAcan().hashCode();
        }
        if (getTsen() != null) {
            _hashCode += getTsen().hashCode();
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
        new org.apache.axis.description.TypeDesc(SegTmxCaseServEmpExtInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "SegTmxCaseServEmpExtInstanceType"));
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
        elemField.setFieldName("pobalnombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "pobalnombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pobalnombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "pobalnombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "domicilioa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domiciliob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "domiciliob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fasen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "fasen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("efase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "efase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("famservrep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "famservrep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtservrep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "subtservrep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criticidadservicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "criticidadservicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medioservicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "medioservicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentoservicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "segmentoservicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctamtraserv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ctamtraserv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ncontratoser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ncontratoser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientesitioa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "clientesitioa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientefinalrsocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "clientefinalrsocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientesitiob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "clientesitiob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cucemp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "cucemp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientetopten");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "clientetopten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomejecutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "nomejecutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telejecutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "telejecutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correoejecutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "correoejecutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroatiende");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "centroatiende"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refsisa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "refsisa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpservicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "cpservicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuccoorporativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "cuccoorporativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dilacionservicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "dilacionservicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaservicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "areaservicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "movimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusresp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "statusresp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppuntab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "cppuntab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entpuntaa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "entpuntaa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ebtpuntab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ebtpuntab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysmodtime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "sysmodtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrearchivotopologico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "nombrearchivotopologico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioserv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "folioserv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gdntroncal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "gdntroncal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoinicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "rangoinicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangofinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "rangofinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "estadoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioempresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "folioempresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serfpes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "serfpes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagenvio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "flagenvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "acal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "acan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tsen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "tsen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
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
