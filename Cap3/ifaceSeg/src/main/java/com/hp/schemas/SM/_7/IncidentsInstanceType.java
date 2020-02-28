/**
 * IncidentsInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hp.schemas.SM._7;

public class IncidentsInstanceType  implements java.io.Serializable {
    private com.hp.schemas.SM._7.Common.StringType ID;

    private com.hp.schemas.SM._7.Common.StringType nombreDeEmpresa;

    private com.hp.schemas.SM._7.Common.StringType severidadDeLaFalla;

    private com.hp.schemas.SM._7.IncidentsInstanceTypeDescripcionDetalladaDeFalla descripcionDetalladaDeFalla;

    private com.hp.schemas.SM._7.Common.StringType identificadorNISDeServicio;

    private com.hp.schemas.SM._7.Common.StringType estado;

    private com.hp.schemas.SM._7.IncidentsInstanceTypeMotivoDeCancelacion motivoDeCancelacion;

    private com.hp.schemas.SM._7.IncidentsInstanceTypeGrupoAsignacion grupoAsignacion;

    private com.hp.schemas.SM._7.Common.StringType movilDeContactoEnSitio;

    private com.hp.schemas.SM._7.Common.StringType nombreDeContactoParaSeguimiento;

    private com.hp.schemas.SM._7.Common.StringType nombreUsuarioEmpresa;

    private com.hp.schemas.SM._7.Common.StringType faseSISA;

    private com.hp.schemas.SM._7.Common.StringType telefonoDeContactoParaSeguimiento;

    private com.hp.schemas.SM._7.Common.StringType correoDeContactoParaSeguimiento;

    private com.hp.schemas.SM._7.Common.StringType contactoSitio;

    private com.hp.schemas.SM._7.Common.StringType telefonoSitio;

    private com.hp.schemas.SM._7.Common.StringType poblacionA;

    private com.hp.schemas.SM._7.Common.StringType direccionDeEmpresa;

    private com.hp.schemas.SM._7.Common.StringType descripcionQueja;

    private com.hp.schemas.SM._7.Common.StringType tipoDeServicio;

    private com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioDiaInicio;

    private com.hp.schemas.SM._7.Common.StringType CUCEmpresarial;

    private com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioDiaFin;

    private com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioHoraInicio;

    private com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioHoraFin;

    private com.hp.schemas.SM._7.Common.StringType catalogacionDeFalla;

    private com.hp.schemas.SM._7.Common.StringType movilDeContactoParaSeguimiento;

    private com.hp.schemas.SM._7.Common.BooleanType fallaMasiva;

    private com.hp.schemas.SM._7.Common.StringType idCorrelationSpwA;

    private com.hp.schemas.SM._7.Common.DateTimeType fechaDeDeteccionDeFalla;

    private com.hp.schemas.SM._7.Common.StringType estadoGeneralDeLaQueja;

    private com.hp.schemas.SM._7.Common.BooleanType codigoValidacion;

    private com.hp.schemas.SM._7.Common.StringType identificadorNISDeServicio2;

    private com.hp.schemas.SM._7.Common.StringType geolocalizacionLatitud;

    private com.hp.schemas.SM._7.Common.StringType geolocalizacionLongitud;

    private com.hp.schemas.SM._7.Common.StringType tipoDeElemento;

    private com.hp.schemas.SM._7.Common.StringType identificadorElemento;

    private com.hp.schemas.SM._7.Common.StringType IPOrigenOPC;

    private com.hp.schemas.SM._7.Common.StringType IPDestinoDPC;

    private com.hp.schemas.SM._7.Common.StringType centralOrigenOCPIP;

    private com.hp.schemas.SM._7.Common.StringType centralDestinoDCPIP;

    private com.hp.schemas.SM._7.Common.StringType CIC;

    private com.hp.schemas.SM._7.Common.StringType prioridad;

    private com.hp.schemas.SM._7.Common.StringType ciudadOrigenNIR;

    private com.hp.schemas.SM._7.Common.StringType ciudadDestinoNIR;

    private com.hp.schemas.SM._7.Common.StringType origen;

    private com.hp.schemas.SM._7.Common.StringType destino;

    private com.hp.schemas.SM._7.Common.StringType IDO;

    private com.hp.schemas.SM._7.Common.StringType IDD;

    private com.hp.schemas.SM._7.Common.StringType diezDigitos;

    private com.hp.schemas.SM._7.Common.StringType operadorOrigenIDO;

    private com.hp.schemas.SM._7.Common.StringType operadorDestinoIDD;

    private com.hp.schemas.SM._7.Common.StringType portID;

    private com.hp.schemas.SM._7.Common.StringType origen1;

    private com.hp.schemas.SM._7.Common.StringType origen2;

    private com.hp.schemas.SM._7.Common.StringType destino1;

    private com.hp.schemas.SM._7.Common.StringType destino2;

    private com.hp.schemas.SM._7.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public IncidentsInstanceType() {
    }

    public IncidentsInstanceType(
           com.hp.schemas.SM._7.Common.StringType ID,
           com.hp.schemas.SM._7.Common.StringType nombreDeEmpresa,
           com.hp.schemas.SM._7.Common.StringType severidadDeLaFalla,
           com.hp.schemas.SM._7.IncidentsInstanceTypeDescripcionDetalladaDeFalla descripcionDetalladaDeFalla,
           com.hp.schemas.SM._7.Common.StringType identificadorNISDeServicio,
           com.hp.schemas.SM._7.Common.StringType estado,
           com.hp.schemas.SM._7.IncidentsInstanceTypeMotivoDeCancelacion motivoDeCancelacion,
           com.hp.schemas.SM._7.IncidentsInstanceTypeGrupoAsignacion grupoAsignacion,
           com.hp.schemas.SM._7.Common.StringType movilDeContactoEnSitio,
           com.hp.schemas.SM._7.Common.StringType nombreDeContactoParaSeguimiento,
           com.hp.schemas.SM._7.Common.StringType nombreUsuarioEmpresa,
           com.hp.schemas.SM._7.Common.StringType faseSISA,
           com.hp.schemas.SM._7.Common.StringType telefonoDeContactoParaSeguimiento,
           com.hp.schemas.SM._7.Common.StringType correoDeContactoParaSeguimiento,
           com.hp.schemas.SM._7.Common.StringType contactoSitio,
           com.hp.schemas.SM._7.Common.StringType telefonoSitio,
           com.hp.schemas.SM._7.Common.StringType poblacionA,
           com.hp.schemas.SM._7.Common.StringType direccionDeEmpresa,
           com.hp.schemas.SM._7.Common.StringType descripcionQueja,
           com.hp.schemas.SM._7.Common.StringType tipoDeServicio,
           com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioDiaInicio,
           com.hp.schemas.SM._7.Common.StringType CUCEmpresarial,
           com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioDiaFin,
           com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioHoraInicio,
           com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioHoraFin,
           com.hp.schemas.SM._7.Common.StringType catalogacionDeFalla,
           com.hp.schemas.SM._7.Common.StringType movilDeContactoParaSeguimiento,
           com.hp.schemas.SM._7.Common.BooleanType fallaMasiva,
           com.hp.schemas.SM._7.Common.StringType idCorrelationSpwA,
           com.hp.schemas.SM._7.Common.DateTimeType fechaDeDeteccionDeFalla,
           com.hp.schemas.SM._7.Common.StringType estadoGeneralDeLaQueja,
           com.hp.schemas.SM._7.Common.BooleanType codigoValidacion,
           com.hp.schemas.SM._7.Common.StringType identificadorNISDeServicio2,
           com.hp.schemas.SM._7.Common.StringType geolocalizacionLatitud,
           com.hp.schemas.SM._7.Common.StringType geolocalizacionLongitud,
           com.hp.schemas.SM._7.Common.StringType tipoDeElemento,
           com.hp.schemas.SM._7.Common.StringType identificadorElemento,
           com.hp.schemas.SM._7.Common.StringType IPOrigenOPC,
           com.hp.schemas.SM._7.Common.StringType IPDestinoDPC,
           com.hp.schemas.SM._7.Common.StringType centralOrigenOCPIP,
           com.hp.schemas.SM._7.Common.StringType centralDestinoDCPIP,
           com.hp.schemas.SM._7.Common.StringType CIC,
           com.hp.schemas.SM._7.Common.StringType prioridad,
           com.hp.schemas.SM._7.Common.StringType ciudadOrigenNIR,
           com.hp.schemas.SM._7.Common.StringType ciudadDestinoNIR,
           com.hp.schemas.SM._7.Common.StringType origen,
           com.hp.schemas.SM._7.Common.StringType destino,
           com.hp.schemas.SM._7.Common.StringType IDO,
           com.hp.schemas.SM._7.Common.StringType IDD,
           com.hp.schemas.SM._7.Common.StringType diezDigitos,
           com.hp.schemas.SM._7.Common.StringType operadorOrigenIDO,
           com.hp.schemas.SM._7.Common.StringType operadorDestinoIDD,
           com.hp.schemas.SM._7.Common.StringType portID,
           com.hp.schemas.SM._7.Common.StringType origen1,
           com.hp.schemas.SM._7.Common.StringType origen2,
           com.hp.schemas.SM._7.Common.StringType destino1,
           com.hp.schemas.SM._7.Common.StringType destino2,
           com.hp.schemas.SM._7.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.ID = ID;
           this.nombreDeEmpresa = nombreDeEmpresa;
           this.severidadDeLaFalla = severidadDeLaFalla;
           this.descripcionDetalladaDeFalla = descripcionDetalladaDeFalla;
           this.identificadorNISDeServicio = identificadorNISDeServicio;
           this.estado = estado;
           this.motivoDeCancelacion = motivoDeCancelacion;
           this.grupoAsignacion = grupoAsignacion;
           this.movilDeContactoEnSitio = movilDeContactoEnSitio;
           this.nombreDeContactoParaSeguimiento = nombreDeContactoParaSeguimiento;
           this.nombreUsuarioEmpresa = nombreUsuarioEmpresa;
           this.faseSISA = faseSISA;
           this.telefonoDeContactoParaSeguimiento = telefonoDeContactoParaSeguimiento;
           this.correoDeContactoParaSeguimiento = correoDeContactoParaSeguimiento;
           this.contactoSitio = contactoSitio;
           this.telefonoSitio = telefonoSitio;
           this.poblacionA = poblacionA;
           this.direccionDeEmpresa = direccionDeEmpresa;
           this.descripcionQueja = descripcionQueja;
           this.tipoDeServicio = tipoDeServicio;
           this.horarioDeAccesoASitioDiaInicio = horarioDeAccesoASitioDiaInicio;
           this.CUCEmpresarial = CUCEmpresarial;
           this.horarioDeAccesoASitioDiaFin = horarioDeAccesoASitioDiaFin;
           this.horarioDeAccesoASitioHoraInicio = horarioDeAccesoASitioHoraInicio;
           this.horarioDeAccesoASitioHoraFin = horarioDeAccesoASitioHoraFin;
           this.catalogacionDeFalla = catalogacionDeFalla;
           this.movilDeContactoParaSeguimiento = movilDeContactoParaSeguimiento;
           this.fallaMasiva = fallaMasiva;
           this.idCorrelationSpwA = idCorrelationSpwA;
           this.fechaDeDeteccionDeFalla = fechaDeDeteccionDeFalla;
           this.estadoGeneralDeLaQueja = estadoGeneralDeLaQueja;
           this.codigoValidacion = codigoValidacion;
           this.identificadorNISDeServicio2 = identificadorNISDeServicio2;
           this.geolocalizacionLatitud = geolocalizacionLatitud;
           this.geolocalizacionLongitud = geolocalizacionLongitud;
           this.tipoDeElemento = tipoDeElemento;
           this.identificadorElemento = identificadorElemento;
           this.IPOrigenOPC = IPOrigenOPC;
           this.IPDestinoDPC = IPDestinoDPC;
           this.centralOrigenOCPIP = centralOrigenOCPIP;
           this.centralDestinoDCPIP = centralDestinoDCPIP;
           this.CIC = CIC;
           this.prioridad = prioridad;
           this.ciudadOrigenNIR = ciudadOrigenNIR;
           this.ciudadDestinoNIR = ciudadDestinoNIR;
           this.origen = origen;
           this.destino = destino;
           this.IDO = IDO;
           this.IDD = IDD;
           this.diezDigitos = diezDigitos;
           this.operadorOrigenIDO = operadorOrigenIDO;
           this.operadorDestinoIDD = operadorDestinoIDD;
           this.portID = portID;
           this.origen1 = origen1;
           this.origen2 = origen2;
           this.destino1 = destino1;
           this.destino2 = destino2;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the ID value for this IncidentsInstanceType.
     * 
     * @return ID
     */
    public com.hp.schemas.SM._7.Common.StringType getID() {
        return ID;
    }


    /**
     * Sets the ID value for this IncidentsInstanceType.
     * 
     * @param ID
     */
    public void setID(com.hp.schemas.SM._7.Common.StringType ID) {
        this.ID = ID;
    }


    /**
     * Gets the nombreDeEmpresa value for this IncidentsInstanceType.
     * 
     * @return nombreDeEmpresa
     */
    public com.hp.schemas.SM._7.Common.StringType getNombreDeEmpresa() {
        return nombreDeEmpresa;
    }


    /**
     * Sets the nombreDeEmpresa value for this IncidentsInstanceType.
     * 
     * @param nombreDeEmpresa
     */
    public void setNombreDeEmpresa(com.hp.schemas.SM._7.Common.StringType nombreDeEmpresa) {
        this.nombreDeEmpresa = nombreDeEmpresa;
    }


    /**
     * Gets the severidadDeLaFalla value for this IncidentsInstanceType.
     * 
     * @return severidadDeLaFalla
     */
    public com.hp.schemas.SM._7.Common.StringType getSeveridadDeLaFalla() {
        return severidadDeLaFalla;
    }


    /**
     * Sets the severidadDeLaFalla value for this IncidentsInstanceType.
     * 
     * @param severidadDeLaFalla
     */
    public void setSeveridadDeLaFalla(com.hp.schemas.SM._7.Common.StringType severidadDeLaFalla) {
        this.severidadDeLaFalla = severidadDeLaFalla;
    }


    /**
     * Gets the descripcionDetalladaDeFalla value for this IncidentsInstanceType.
     * 
     * @return descripcionDetalladaDeFalla
     */
    public com.hp.schemas.SM._7.IncidentsInstanceTypeDescripcionDetalladaDeFalla getDescripcionDetalladaDeFalla() {
        return descripcionDetalladaDeFalla;
    }


    /**
     * Sets the descripcionDetalladaDeFalla value for this IncidentsInstanceType.
     * 
     * @param descripcionDetalladaDeFalla
     */
    public void setDescripcionDetalladaDeFalla(com.hp.schemas.SM._7.IncidentsInstanceTypeDescripcionDetalladaDeFalla descripcionDetalladaDeFalla) {
        this.descripcionDetalladaDeFalla = descripcionDetalladaDeFalla;
    }


    /**
     * Gets the identificadorNISDeServicio value for this IncidentsInstanceType.
     * 
     * @return identificadorNISDeServicio
     */
    public com.hp.schemas.SM._7.Common.StringType getIdentificadorNISDeServicio() {
        return identificadorNISDeServicio;
    }


    /**
     * Sets the identificadorNISDeServicio value for this IncidentsInstanceType.
     * 
     * @param identificadorNISDeServicio
     */
    public void setIdentificadorNISDeServicio(com.hp.schemas.SM._7.Common.StringType identificadorNISDeServicio) {
        this.identificadorNISDeServicio = identificadorNISDeServicio;
    }


    /**
     * Gets the estado value for this IncidentsInstanceType.
     * 
     * @return estado
     */
    public com.hp.schemas.SM._7.Common.StringType getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this IncidentsInstanceType.
     * 
     * @param estado
     */
    public void setEstado(com.hp.schemas.SM._7.Common.StringType estado) {
        this.estado = estado;
    }


    /**
     * Gets the motivoDeCancelacion value for this IncidentsInstanceType.
     * 
     * @return motivoDeCancelacion
     */
    public com.hp.schemas.SM._7.IncidentsInstanceTypeMotivoDeCancelacion getMotivoDeCancelacion() {
        return motivoDeCancelacion;
    }


    /**
     * Sets the motivoDeCancelacion value for this IncidentsInstanceType.
     * 
     * @param motivoDeCancelacion
     */
    public void setMotivoDeCancelacion(com.hp.schemas.SM._7.IncidentsInstanceTypeMotivoDeCancelacion motivoDeCancelacion) {
        this.motivoDeCancelacion = motivoDeCancelacion;
    }


    /**
     * Gets the grupoAsignacion value for this IncidentsInstanceType.
     * 
     * @return grupoAsignacion
     */
    public com.hp.schemas.SM._7.IncidentsInstanceTypeGrupoAsignacion getGrupoAsignacion() {
        return grupoAsignacion;
    }


    /**
     * Sets the grupoAsignacion value for this IncidentsInstanceType.
     * 
     * @param grupoAsignacion
     */
    public void setGrupoAsignacion(com.hp.schemas.SM._7.IncidentsInstanceTypeGrupoAsignacion grupoAsignacion) {
        this.grupoAsignacion = grupoAsignacion;
    }


    /**
     * Gets the movilDeContactoEnSitio value for this IncidentsInstanceType.
     * 
     * @return movilDeContactoEnSitio
     */
    public com.hp.schemas.SM._7.Common.StringType getMovilDeContactoEnSitio() {
        return movilDeContactoEnSitio;
    }


    /**
     * Sets the movilDeContactoEnSitio value for this IncidentsInstanceType.
     * 
     * @param movilDeContactoEnSitio
     */
    public void setMovilDeContactoEnSitio(com.hp.schemas.SM._7.Common.StringType movilDeContactoEnSitio) {
        this.movilDeContactoEnSitio = movilDeContactoEnSitio;
    }


    /**
     * Gets the nombreDeContactoParaSeguimiento value for this IncidentsInstanceType.
     * 
     * @return nombreDeContactoParaSeguimiento
     */
    public com.hp.schemas.SM._7.Common.StringType getNombreDeContactoParaSeguimiento() {
        return nombreDeContactoParaSeguimiento;
    }


    /**
     * Sets the nombreDeContactoParaSeguimiento value for this IncidentsInstanceType.
     * 
     * @param nombreDeContactoParaSeguimiento
     */
    public void setNombreDeContactoParaSeguimiento(com.hp.schemas.SM._7.Common.StringType nombreDeContactoParaSeguimiento) {
        this.nombreDeContactoParaSeguimiento = nombreDeContactoParaSeguimiento;
    }


    /**
     * Gets the nombreUsuarioEmpresa value for this IncidentsInstanceType.
     * 
     * @return nombreUsuarioEmpresa
     */
    public com.hp.schemas.SM._7.Common.StringType getNombreUsuarioEmpresa() {
        return nombreUsuarioEmpresa;
    }


    /**
     * Sets the nombreUsuarioEmpresa value for this IncidentsInstanceType.
     * 
     * @param nombreUsuarioEmpresa
     */
    public void setNombreUsuarioEmpresa(com.hp.schemas.SM._7.Common.StringType nombreUsuarioEmpresa) {
        this.nombreUsuarioEmpresa = nombreUsuarioEmpresa;
    }


    /**
     * Gets the faseSISA value for this IncidentsInstanceType.
     * 
     * @return faseSISA
     */
    public com.hp.schemas.SM._7.Common.StringType getFaseSISA() {
        return faseSISA;
    }


    /**
     * Sets the faseSISA value for this IncidentsInstanceType.
     * 
     * @param faseSISA
     */
    public void setFaseSISA(com.hp.schemas.SM._7.Common.StringType faseSISA) {
        this.faseSISA = faseSISA;
    }


    /**
     * Gets the telefonoDeContactoParaSeguimiento value for this IncidentsInstanceType.
     * 
     * @return telefonoDeContactoParaSeguimiento
     */
    public com.hp.schemas.SM._7.Common.StringType getTelefonoDeContactoParaSeguimiento() {
        return telefonoDeContactoParaSeguimiento;
    }


    /**
     * Sets the telefonoDeContactoParaSeguimiento value for this IncidentsInstanceType.
     * 
     * @param telefonoDeContactoParaSeguimiento
     */
    public void setTelefonoDeContactoParaSeguimiento(com.hp.schemas.SM._7.Common.StringType telefonoDeContactoParaSeguimiento) {
        this.telefonoDeContactoParaSeguimiento = telefonoDeContactoParaSeguimiento;
    }


    /**
     * Gets the correoDeContactoParaSeguimiento value for this IncidentsInstanceType.
     * 
     * @return correoDeContactoParaSeguimiento
     */
    public com.hp.schemas.SM._7.Common.StringType getCorreoDeContactoParaSeguimiento() {
        return correoDeContactoParaSeguimiento;
    }


    /**
     * Sets the correoDeContactoParaSeguimiento value for this IncidentsInstanceType.
     * 
     * @param correoDeContactoParaSeguimiento
     */
    public void setCorreoDeContactoParaSeguimiento(com.hp.schemas.SM._7.Common.StringType correoDeContactoParaSeguimiento) {
        this.correoDeContactoParaSeguimiento = correoDeContactoParaSeguimiento;
    }


    /**
     * Gets the contactoSitio value for this IncidentsInstanceType.
     * 
     * @return contactoSitio
     */
    public com.hp.schemas.SM._7.Common.StringType getContactoSitio() {
        return contactoSitio;
    }


    /**
     * Sets the contactoSitio value for this IncidentsInstanceType.
     * 
     * @param contactoSitio
     */
    public void setContactoSitio(com.hp.schemas.SM._7.Common.StringType contactoSitio) {
        this.contactoSitio = contactoSitio;
    }


    /**
     * Gets the telefonoSitio value for this IncidentsInstanceType.
     * 
     * @return telefonoSitio
     */
    public com.hp.schemas.SM._7.Common.StringType getTelefonoSitio() {
        return telefonoSitio;
    }


    /**
     * Sets the telefonoSitio value for this IncidentsInstanceType.
     * 
     * @param telefonoSitio
     */
    public void setTelefonoSitio(com.hp.schemas.SM._7.Common.StringType telefonoSitio) {
        this.telefonoSitio = telefonoSitio;
    }


    /**
     * Gets the poblacionA value for this IncidentsInstanceType.
     * 
     * @return poblacionA
     */
    public com.hp.schemas.SM._7.Common.StringType getPoblacionA() {
        return poblacionA;
    }


    /**
     * Sets the poblacionA value for this IncidentsInstanceType.
     * 
     * @param poblacionA
     */
    public void setPoblacionA(com.hp.schemas.SM._7.Common.StringType poblacionA) {
        this.poblacionA = poblacionA;
    }


    /**
     * Gets the direccionDeEmpresa value for this IncidentsInstanceType.
     * 
     * @return direccionDeEmpresa
     */
    public com.hp.schemas.SM._7.Common.StringType getDireccionDeEmpresa() {
        return direccionDeEmpresa;
    }


    /**
     * Sets the direccionDeEmpresa value for this IncidentsInstanceType.
     * 
     * @param direccionDeEmpresa
     */
    public void setDireccionDeEmpresa(com.hp.schemas.SM._7.Common.StringType direccionDeEmpresa) {
        this.direccionDeEmpresa = direccionDeEmpresa;
    }


    /**
     * Gets the descripcionQueja value for this IncidentsInstanceType.
     * 
     * @return descripcionQueja
     */
    public com.hp.schemas.SM._7.Common.StringType getDescripcionQueja() {
        return descripcionQueja;
    }


    /**
     * Sets the descripcionQueja value for this IncidentsInstanceType.
     * 
     * @param descripcionQueja
     */
    public void setDescripcionQueja(com.hp.schemas.SM._7.Common.StringType descripcionQueja) {
        this.descripcionQueja = descripcionQueja;
    }


    /**
     * Gets the tipoDeServicio value for this IncidentsInstanceType.
     * 
     * @return tipoDeServicio
     */
    public com.hp.schemas.SM._7.Common.StringType getTipoDeServicio() {
        return tipoDeServicio;
    }


    /**
     * Sets the tipoDeServicio value for this IncidentsInstanceType.
     * 
     * @param tipoDeServicio
     */
    public void setTipoDeServicio(com.hp.schemas.SM._7.Common.StringType tipoDeServicio) {
        this.tipoDeServicio = tipoDeServicio;
    }


    /**
     * Gets the horarioDeAccesoASitioDiaInicio value for this IncidentsInstanceType.
     * 
     * @return horarioDeAccesoASitioDiaInicio
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioDeAccesoASitioDiaInicio() {
        return horarioDeAccesoASitioDiaInicio;
    }


    /**
     * Sets the horarioDeAccesoASitioDiaInicio value for this IncidentsInstanceType.
     * 
     * @param horarioDeAccesoASitioDiaInicio
     */
    public void setHorarioDeAccesoASitioDiaInicio(com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioDiaInicio) {
        this.horarioDeAccesoASitioDiaInicio = horarioDeAccesoASitioDiaInicio;
    }


    /**
     * Gets the CUCEmpresarial value for this IncidentsInstanceType.
     * 
     * @return CUCEmpresarial
     */
    public com.hp.schemas.SM._7.Common.StringType getCUCEmpresarial() {
        return CUCEmpresarial;
    }


    /**
     * Sets the CUCEmpresarial value for this IncidentsInstanceType.
     * 
     * @param CUCEmpresarial
     */
    public void setCUCEmpresarial(com.hp.schemas.SM._7.Common.StringType CUCEmpresarial) {
        this.CUCEmpresarial = CUCEmpresarial;
    }


    /**
     * Gets the horarioDeAccesoASitioDiaFin value for this IncidentsInstanceType.
     * 
     * @return horarioDeAccesoASitioDiaFin
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioDeAccesoASitioDiaFin() {
        return horarioDeAccesoASitioDiaFin;
    }


    /**
     * Sets the horarioDeAccesoASitioDiaFin value for this IncidentsInstanceType.
     * 
     * @param horarioDeAccesoASitioDiaFin
     */
    public void setHorarioDeAccesoASitioDiaFin(com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioDiaFin) {
        this.horarioDeAccesoASitioDiaFin = horarioDeAccesoASitioDiaFin;
    }


    /**
     * Gets the horarioDeAccesoASitioHoraInicio value for this IncidentsInstanceType.
     * 
     * @return horarioDeAccesoASitioHoraInicio
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioDeAccesoASitioHoraInicio() {
        return horarioDeAccesoASitioHoraInicio;
    }


    /**
     * Sets the horarioDeAccesoASitioHoraInicio value for this IncidentsInstanceType.
     * 
     * @param horarioDeAccesoASitioHoraInicio
     */
    public void setHorarioDeAccesoASitioHoraInicio(com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioHoraInicio) {
        this.horarioDeAccesoASitioHoraInicio = horarioDeAccesoASitioHoraInicio;
    }


    /**
     * Gets the horarioDeAccesoASitioHoraFin value for this IncidentsInstanceType.
     * 
     * @return horarioDeAccesoASitioHoraFin
     */
    public com.hp.schemas.SM._7.Common.StringType getHorarioDeAccesoASitioHoraFin() {
        return horarioDeAccesoASitioHoraFin;
    }


    /**
     * Sets the horarioDeAccesoASitioHoraFin value for this IncidentsInstanceType.
     * 
     * @param horarioDeAccesoASitioHoraFin
     */
    public void setHorarioDeAccesoASitioHoraFin(com.hp.schemas.SM._7.Common.StringType horarioDeAccesoASitioHoraFin) {
        this.horarioDeAccesoASitioHoraFin = horarioDeAccesoASitioHoraFin;
    }


    /**
     * Gets the catalogacionDeFalla value for this IncidentsInstanceType.
     * 
     * @return catalogacionDeFalla
     */
    public com.hp.schemas.SM._7.Common.StringType getCatalogacionDeFalla() {
        return catalogacionDeFalla;
    }


    /**
     * Sets the catalogacionDeFalla value for this IncidentsInstanceType.
     * 
     * @param catalogacionDeFalla
     */
    public void setCatalogacionDeFalla(com.hp.schemas.SM._7.Common.StringType catalogacionDeFalla) {
        this.catalogacionDeFalla = catalogacionDeFalla;
    }


    /**
     * Gets the movilDeContactoParaSeguimiento value for this IncidentsInstanceType.
     * 
     * @return movilDeContactoParaSeguimiento
     */
    public com.hp.schemas.SM._7.Common.StringType getMovilDeContactoParaSeguimiento() {
        return movilDeContactoParaSeguimiento;
    }


    /**
     * Sets the movilDeContactoParaSeguimiento value for this IncidentsInstanceType.
     * 
     * @param movilDeContactoParaSeguimiento
     */
    public void setMovilDeContactoParaSeguimiento(com.hp.schemas.SM._7.Common.StringType movilDeContactoParaSeguimiento) {
        this.movilDeContactoParaSeguimiento = movilDeContactoParaSeguimiento;
    }


    /**
     * Gets the fallaMasiva value for this IncidentsInstanceType.
     * 
     * @return fallaMasiva
     */
    public com.hp.schemas.SM._7.Common.BooleanType getFallaMasiva() {
        return fallaMasiva;
    }


    /**
     * Sets the fallaMasiva value for this IncidentsInstanceType.
     * 
     * @param fallaMasiva
     */
    public void setFallaMasiva(com.hp.schemas.SM._7.Common.BooleanType fallaMasiva) {
        this.fallaMasiva = fallaMasiva;
    }


    /**
     * Gets the idCorrelationSpwA value for this IncidentsInstanceType.
     * 
     * @return idCorrelationSpwA
     */
    public com.hp.schemas.SM._7.Common.StringType getIdCorrelationSpwA() {
        return idCorrelationSpwA;
    }


    /**
     * Sets the idCorrelationSpwA value for this IncidentsInstanceType.
     * 
     * @param idCorrelationSpwA
     */
    public void setIdCorrelationSpwA(com.hp.schemas.SM._7.Common.StringType idCorrelationSpwA) {
        this.idCorrelationSpwA = idCorrelationSpwA;
    }


    /**
     * Gets the fechaDeDeteccionDeFalla value for this IncidentsInstanceType.
     * 
     * @return fechaDeDeteccionDeFalla
     */
    public com.hp.schemas.SM._7.Common.DateTimeType getFechaDeDeteccionDeFalla() {
        return fechaDeDeteccionDeFalla;
    }


    /**
     * Sets the fechaDeDeteccionDeFalla value for this IncidentsInstanceType.
     * 
     * @param fechaDeDeteccionDeFalla
     */
    public void setFechaDeDeteccionDeFalla(com.hp.schemas.SM._7.Common.DateTimeType fechaDeDeteccionDeFalla) {
        this.fechaDeDeteccionDeFalla = fechaDeDeteccionDeFalla;
    }


    /**
     * Gets the estadoGeneralDeLaQueja value for this IncidentsInstanceType.
     * 
     * @return estadoGeneralDeLaQueja
     */
    public com.hp.schemas.SM._7.Common.StringType getEstadoGeneralDeLaQueja() {
        return estadoGeneralDeLaQueja;
    }


    /**
     * Sets the estadoGeneralDeLaQueja value for this IncidentsInstanceType.
     * 
     * @param estadoGeneralDeLaQueja
     */
    public void setEstadoGeneralDeLaQueja(com.hp.schemas.SM._7.Common.StringType estadoGeneralDeLaQueja) {
        this.estadoGeneralDeLaQueja = estadoGeneralDeLaQueja;
    }


    /**
     * Gets the codigoValidacion value for this IncidentsInstanceType.
     * 
     * @return codigoValidacion
     */
    public com.hp.schemas.SM._7.Common.BooleanType getCodigoValidacion() {
        return codigoValidacion;
    }


    /**
     * Sets the codigoValidacion value for this IncidentsInstanceType.
     * 
     * @param codigoValidacion
     */
    public void setCodigoValidacion(com.hp.schemas.SM._7.Common.BooleanType codigoValidacion) {
        this.codigoValidacion = codigoValidacion;
    }


    /**
     * Gets the identificadorNISDeServicio2 value for this IncidentsInstanceType.
     * 
     * @return identificadorNISDeServicio2
     */
    public com.hp.schemas.SM._7.Common.StringType getIdentificadorNISDeServicio2() {
        return identificadorNISDeServicio2;
    }


    /**
     * Sets the identificadorNISDeServicio2 value for this IncidentsInstanceType.
     * 
     * @param identificadorNISDeServicio2
     */
    public void setIdentificadorNISDeServicio2(com.hp.schemas.SM._7.Common.StringType identificadorNISDeServicio2) {
        this.identificadorNISDeServicio2 = identificadorNISDeServicio2;
    }


    /**
     * Gets the geolocalizacionLatitud value for this IncidentsInstanceType.
     * 
     * @return geolocalizacionLatitud
     */
    public com.hp.schemas.SM._7.Common.StringType getGeolocalizacionLatitud() {
        return geolocalizacionLatitud;
    }


    /**
     * Sets the geolocalizacionLatitud value for this IncidentsInstanceType.
     * 
     * @param geolocalizacionLatitud
     */
    public void setGeolocalizacionLatitud(com.hp.schemas.SM._7.Common.StringType geolocalizacionLatitud) {
        this.geolocalizacionLatitud = geolocalizacionLatitud;
    }


    /**
     * Gets the geolocalizacionLongitud value for this IncidentsInstanceType.
     * 
     * @return geolocalizacionLongitud
     */
    public com.hp.schemas.SM._7.Common.StringType getGeolocalizacionLongitud() {
        return geolocalizacionLongitud;
    }


    /**
     * Sets the geolocalizacionLongitud value for this IncidentsInstanceType.
     * 
     * @param geolocalizacionLongitud
     */
    public void setGeolocalizacionLongitud(com.hp.schemas.SM._7.Common.StringType geolocalizacionLongitud) {
        this.geolocalizacionLongitud = geolocalizacionLongitud;
    }


    /**
     * Gets the tipoDeElemento value for this IncidentsInstanceType.
     * 
     * @return tipoDeElemento
     */
    public com.hp.schemas.SM._7.Common.StringType getTipoDeElemento() {
        return tipoDeElemento;
    }


    /**
     * Sets the tipoDeElemento value for this IncidentsInstanceType.
     * 
     * @param tipoDeElemento
     */
    public void setTipoDeElemento(com.hp.schemas.SM._7.Common.StringType tipoDeElemento) {
        this.tipoDeElemento = tipoDeElemento;
    }


    /**
     * Gets the identificadorElemento value for this IncidentsInstanceType.
     * 
     * @return identificadorElemento
     */
    public com.hp.schemas.SM._7.Common.StringType getIdentificadorElemento() {
        return identificadorElemento;
    }


    /**
     * Sets the identificadorElemento value for this IncidentsInstanceType.
     * 
     * @param identificadorElemento
     */
    public void setIdentificadorElemento(com.hp.schemas.SM._7.Common.StringType identificadorElemento) {
        this.identificadorElemento = identificadorElemento;
    }


    /**
     * Gets the IPOrigenOPC value for this IncidentsInstanceType.
     * 
     * @return IPOrigenOPC
     */
    public com.hp.schemas.SM._7.Common.StringType getIPOrigenOPC() {
        return IPOrigenOPC;
    }


    /**
     * Sets the IPOrigenOPC value for this IncidentsInstanceType.
     * 
     * @param IPOrigenOPC
     */
    public void setIPOrigenOPC(com.hp.schemas.SM._7.Common.StringType IPOrigenOPC) {
        this.IPOrigenOPC = IPOrigenOPC;
    }


    /**
     * Gets the IPDestinoDPC value for this IncidentsInstanceType.
     * 
     * @return IPDestinoDPC
     */
    public com.hp.schemas.SM._7.Common.StringType getIPDestinoDPC() {
        return IPDestinoDPC;
    }


    /**
     * Sets the IPDestinoDPC value for this IncidentsInstanceType.
     * 
     * @param IPDestinoDPC
     */
    public void setIPDestinoDPC(com.hp.schemas.SM._7.Common.StringType IPDestinoDPC) {
        this.IPDestinoDPC = IPDestinoDPC;
    }


    /**
     * Gets the centralOrigenOCPIP value for this IncidentsInstanceType.
     * 
     * @return centralOrigenOCPIP
     */
    public com.hp.schemas.SM._7.Common.StringType getCentralOrigenOCPIP() {
        return centralOrigenOCPIP;
    }


    /**
     * Sets the centralOrigenOCPIP value for this IncidentsInstanceType.
     * 
     * @param centralOrigenOCPIP
     */
    public void setCentralOrigenOCPIP(com.hp.schemas.SM._7.Common.StringType centralOrigenOCPIP) {
        this.centralOrigenOCPIP = centralOrigenOCPIP;
    }


    /**
     * Gets the centralDestinoDCPIP value for this IncidentsInstanceType.
     * 
     * @return centralDestinoDCPIP
     */
    public com.hp.schemas.SM._7.Common.StringType getCentralDestinoDCPIP() {
        return centralDestinoDCPIP;
    }


    /**
     * Sets the centralDestinoDCPIP value for this IncidentsInstanceType.
     * 
     * @param centralDestinoDCPIP
     */
    public void setCentralDestinoDCPIP(com.hp.schemas.SM._7.Common.StringType centralDestinoDCPIP) {
        this.centralDestinoDCPIP = centralDestinoDCPIP;
    }


    /**
     * Gets the CIC value for this IncidentsInstanceType.
     * 
     * @return CIC
     */
    public com.hp.schemas.SM._7.Common.StringType getCIC() {
        return CIC;
    }


    /**
     * Sets the CIC value for this IncidentsInstanceType.
     * 
     * @param CIC
     */
    public void setCIC(com.hp.schemas.SM._7.Common.StringType CIC) {
        this.CIC = CIC;
    }


    /**
     * Gets the prioridad value for this IncidentsInstanceType.
     * 
     * @return prioridad
     */
    public com.hp.schemas.SM._7.Common.StringType getPrioridad() {
        return prioridad;
    }


    /**
     * Sets the prioridad value for this IncidentsInstanceType.
     * 
     * @param prioridad
     */
    public void setPrioridad(com.hp.schemas.SM._7.Common.StringType prioridad) {
        this.prioridad = prioridad;
    }


    /**
     * Gets the ciudadOrigenNIR value for this IncidentsInstanceType.
     * 
     * @return ciudadOrigenNIR
     */
    public com.hp.schemas.SM._7.Common.StringType getCiudadOrigenNIR() {
        return ciudadOrigenNIR;
    }


    /**
     * Sets the ciudadOrigenNIR value for this IncidentsInstanceType.
     * 
     * @param ciudadOrigenNIR
     */
    public void setCiudadOrigenNIR(com.hp.schemas.SM._7.Common.StringType ciudadOrigenNIR) {
        this.ciudadOrigenNIR = ciudadOrigenNIR;
    }


    /**
     * Gets the ciudadDestinoNIR value for this IncidentsInstanceType.
     * 
     * @return ciudadDestinoNIR
     */
    public com.hp.schemas.SM._7.Common.StringType getCiudadDestinoNIR() {
        return ciudadDestinoNIR;
    }


    /**
     * Sets the ciudadDestinoNIR value for this IncidentsInstanceType.
     * 
     * @param ciudadDestinoNIR
     */
    public void setCiudadDestinoNIR(com.hp.schemas.SM._7.Common.StringType ciudadDestinoNIR) {
        this.ciudadDestinoNIR = ciudadDestinoNIR;
    }


    /**
     * Gets the origen value for this IncidentsInstanceType.
     * 
     * @return origen
     */
    public com.hp.schemas.SM._7.Common.StringType getOrigen() {
        return origen;
    }


    /**
     * Sets the origen value for this IncidentsInstanceType.
     * 
     * @param origen
     */
    public void setOrigen(com.hp.schemas.SM._7.Common.StringType origen) {
        this.origen = origen;
    }


    /**
     * Gets the destino value for this IncidentsInstanceType.
     * 
     * @return destino
     */
    public com.hp.schemas.SM._7.Common.StringType getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this IncidentsInstanceType.
     * 
     * @param destino
     */
    public void setDestino(com.hp.schemas.SM._7.Common.StringType destino) {
        this.destino = destino;
    }


    /**
     * Gets the IDO value for this IncidentsInstanceType.
     * 
     * @return IDO
     */
    public com.hp.schemas.SM._7.Common.StringType getIDO() {
        return IDO;
    }


    /**
     * Sets the IDO value for this IncidentsInstanceType.
     * 
     * @param IDO
     */
    public void setIDO(com.hp.schemas.SM._7.Common.StringType IDO) {
        this.IDO = IDO;
    }


    /**
     * Gets the IDD value for this IncidentsInstanceType.
     * 
     * @return IDD
     */
    public com.hp.schemas.SM._7.Common.StringType getIDD() {
        return IDD;
    }


    /**
     * Sets the IDD value for this IncidentsInstanceType.
     * 
     * @param IDD
     */
    public void setIDD(com.hp.schemas.SM._7.Common.StringType IDD) {
        this.IDD = IDD;
    }


    /**
     * Gets the diezDigitos value for this IncidentsInstanceType.
     * 
     * @return diezDigitos
     */
    public com.hp.schemas.SM._7.Common.StringType getDiezDigitos() {
        return diezDigitos;
    }


    /**
     * Sets the diezDigitos value for this IncidentsInstanceType.
     * 
     * @param diezDigitos
     */
    public void setDiezDigitos(com.hp.schemas.SM._7.Common.StringType diezDigitos) {
        this.diezDigitos = diezDigitos;
    }


    /**
     * Gets the operadorOrigenIDO value for this IncidentsInstanceType.
     * 
     * @return operadorOrigenIDO
     */
    public com.hp.schemas.SM._7.Common.StringType getOperadorOrigenIDO() {
        return operadorOrigenIDO;
    }


    /**
     * Sets the operadorOrigenIDO value for this IncidentsInstanceType.
     * 
     * @param operadorOrigenIDO
     */
    public void setOperadorOrigenIDO(com.hp.schemas.SM._7.Common.StringType operadorOrigenIDO) {
        this.operadorOrigenIDO = operadorOrigenIDO;
    }


    /**
     * Gets the operadorDestinoIDD value for this IncidentsInstanceType.
     * 
     * @return operadorDestinoIDD
     */
    public com.hp.schemas.SM._7.Common.StringType getOperadorDestinoIDD() {
        return operadorDestinoIDD;
    }


    /**
     * Sets the operadorDestinoIDD value for this IncidentsInstanceType.
     * 
     * @param operadorDestinoIDD
     */
    public void setOperadorDestinoIDD(com.hp.schemas.SM._7.Common.StringType operadorDestinoIDD) {
        this.operadorDestinoIDD = operadorDestinoIDD;
    }


    /**
     * Gets the portID value for this IncidentsInstanceType.
     * 
     * @return portID
     */
    public com.hp.schemas.SM._7.Common.StringType getPortID() {
        return portID;
    }


    /**
     * Sets the portID value for this IncidentsInstanceType.
     * 
     * @param portID
     */
    public void setPortID(com.hp.schemas.SM._7.Common.StringType portID) {
        this.portID = portID;
    }


    /**
     * Gets the origen1 value for this IncidentsInstanceType.
     * 
     * @return origen1
     */
    public com.hp.schemas.SM._7.Common.StringType getOrigen1() {
        return origen1;
    }


    /**
     * Sets the origen1 value for this IncidentsInstanceType.
     * 
     * @param origen1
     */
    public void setOrigen1(com.hp.schemas.SM._7.Common.StringType origen1) {
        this.origen1 = origen1;
    }


    /**
     * Gets the origen2 value for this IncidentsInstanceType.
     * 
     * @return origen2
     */
    public com.hp.schemas.SM._7.Common.StringType getOrigen2() {
        return origen2;
    }


    /**
     * Sets the origen2 value for this IncidentsInstanceType.
     * 
     * @param origen2
     */
    public void setOrigen2(com.hp.schemas.SM._7.Common.StringType origen2) {
        this.origen2 = origen2;
    }


    /**
     * Gets the destino1 value for this IncidentsInstanceType.
     * 
     * @return destino1
     */
    public com.hp.schemas.SM._7.Common.StringType getDestino1() {
        return destino1;
    }


    /**
     * Sets the destino1 value for this IncidentsInstanceType.
     * 
     * @param destino1
     */
    public void setDestino1(com.hp.schemas.SM._7.Common.StringType destino1) {
        this.destino1 = destino1;
    }


    /**
     * Gets the destino2 value for this IncidentsInstanceType.
     * 
     * @return destino2
     */
    public com.hp.schemas.SM._7.Common.StringType getDestino2() {
        return destino2;
    }


    /**
     * Sets the destino2 value for this IncidentsInstanceType.
     * 
     * @param destino2
     */
    public void setDestino2(com.hp.schemas.SM._7.Common.StringType destino2) {
        this.destino2 = destino2;
    }


    /**
     * Gets the attachments value for this IncidentsInstanceType.
     * 
     * @return attachments
     */
    public com.hp.schemas.SM._7.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this IncidentsInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.hp.schemas.SM._7.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this IncidentsInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this IncidentsInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this IncidentsInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this IncidentsInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this IncidentsInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this IncidentsInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this IncidentsInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this IncidentsInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncidentsInstanceType)) return false;
        IncidentsInstanceType other = (IncidentsInstanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.nombreDeEmpresa==null && other.getNombreDeEmpresa()==null) || 
             (this.nombreDeEmpresa!=null &&
              this.nombreDeEmpresa.equals(other.getNombreDeEmpresa()))) &&
            ((this.severidadDeLaFalla==null && other.getSeveridadDeLaFalla()==null) || 
             (this.severidadDeLaFalla!=null &&
              this.severidadDeLaFalla.equals(other.getSeveridadDeLaFalla()))) &&
            ((this.descripcionDetalladaDeFalla==null && other.getDescripcionDetalladaDeFalla()==null) || 
             (this.descripcionDetalladaDeFalla!=null &&
              this.descripcionDetalladaDeFalla.equals(other.getDescripcionDetalladaDeFalla()))) &&
            ((this.identificadorNISDeServicio==null && other.getIdentificadorNISDeServicio()==null) || 
             (this.identificadorNISDeServicio!=null &&
              this.identificadorNISDeServicio.equals(other.getIdentificadorNISDeServicio()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.motivoDeCancelacion==null && other.getMotivoDeCancelacion()==null) || 
             (this.motivoDeCancelacion!=null &&
              this.motivoDeCancelacion.equals(other.getMotivoDeCancelacion()))) &&
            ((this.grupoAsignacion==null && other.getGrupoAsignacion()==null) || 
             (this.grupoAsignacion!=null &&
              this.grupoAsignacion.equals(other.getGrupoAsignacion()))) &&
            ((this.movilDeContactoEnSitio==null && other.getMovilDeContactoEnSitio()==null) || 
             (this.movilDeContactoEnSitio!=null &&
              this.movilDeContactoEnSitio.equals(other.getMovilDeContactoEnSitio()))) &&
            ((this.nombreDeContactoParaSeguimiento==null && other.getNombreDeContactoParaSeguimiento()==null) || 
             (this.nombreDeContactoParaSeguimiento!=null &&
              this.nombreDeContactoParaSeguimiento.equals(other.getNombreDeContactoParaSeguimiento()))) &&
            ((this.nombreUsuarioEmpresa==null && other.getNombreUsuarioEmpresa()==null) || 
             (this.nombreUsuarioEmpresa!=null &&
              this.nombreUsuarioEmpresa.equals(other.getNombreUsuarioEmpresa()))) &&
            ((this.faseSISA==null && other.getFaseSISA()==null) || 
             (this.faseSISA!=null &&
              this.faseSISA.equals(other.getFaseSISA()))) &&
            ((this.telefonoDeContactoParaSeguimiento==null && other.getTelefonoDeContactoParaSeguimiento()==null) || 
             (this.telefonoDeContactoParaSeguimiento!=null &&
              this.telefonoDeContactoParaSeguimiento.equals(other.getTelefonoDeContactoParaSeguimiento()))) &&
            ((this.correoDeContactoParaSeguimiento==null && other.getCorreoDeContactoParaSeguimiento()==null) || 
             (this.correoDeContactoParaSeguimiento!=null &&
              this.correoDeContactoParaSeguimiento.equals(other.getCorreoDeContactoParaSeguimiento()))) &&
            ((this.contactoSitio==null && other.getContactoSitio()==null) || 
             (this.contactoSitio!=null &&
              this.contactoSitio.equals(other.getContactoSitio()))) &&
            ((this.telefonoSitio==null && other.getTelefonoSitio()==null) || 
             (this.telefonoSitio!=null &&
              this.telefonoSitio.equals(other.getTelefonoSitio()))) &&
            ((this.poblacionA==null && other.getPoblacionA()==null) || 
             (this.poblacionA!=null &&
              this.poblacionA.equals(other.getPoblacionA()))) &&
            ((this.direccionDeEmpresa==null && other.getDireccionDeEmpresa()==null) || 
             (this.direccionDeEmpresa!=null &&
              this.direccionDeEmpresa.equals(other.getDireccionDeEmpresa()))) &&
            ((this.descripcionQueja==null && other.getDescripcionQueja()==null) || 
             (this.descripcionQueja!=null &&
              this.descripcionQueja.equals(other.getDescripcionQueja()))) &&
            ((this.tipoDeServicio==null && other.getTipoDeServicio()==null) || 
             (this.tipoDeServicio!=null &&
              this.tipoDeServicio.equals(other.getTipoDeServicio()))) &&
            ((this.horarioDeAccesoASitioDiaInicio==null && other.getHorarioDeAccesoASitioDiaInicio()==null) || 
             (this.horarioDeAccesoASitioDiaInicio!=null &&
              this.horarioDeAccesoASitioDiaInicio.equals(other.getHorarioDeAccesoASitioDiaInicio()))) &&
            ((this.CUCEmpresarial==null && other.getCUCEmpresarial()==null) || 
             (this.CUCEmpresarial!=null &&
              this.CUCEmpresarial.equals(other.getCUCEmpresarial()))) &&
            ((this.horarioDeAccesoASitioDiaFin==null && other.getHorarioDeAccesoASitioDiaFin()==null) || 
             (this.horarioDeAccesoASitioDiaFin!=null &&
              this.horarioDeAccesoASitioDiaFin.equals(other.getHorarioDeAccesoASitioDiaFin()))) &&
            ((this.horarioDeAccesoASitioHoraInicio==null && other.getHorarioDeAccesoASitioHoraInicio()==null) || 
             (this.horarioDeAccesoASitioHoraInicio!=null &&
              this.horarioDeAccesoASitioHoraInicio.equals(other.getHorarioDeAccesoASitioHoraInicio()))) &&
            ((this.horarioDeAccesoASitioHoraFin==null && other.getHorarioDeAccesoASitioHoraFin()==null) || 
             (this.horarioDeAccesoASitioHoraFin!=null &&
              this.horarioDeAccesoASitioHoraFin.equals(other.getHorarioDeAccesoASitioHoraFin()))) &&
            ((this.catalogacionDeFalla==null && other.getCatalogacionDeFalla()==null) || 
             (this.catalogacionDeFalla!=null &&
              this.catalogacionDeFalla.equals(other.getCatalogacionDeFalla()))) &&
            ((this.movilDeContactoParaSeguimiento==null && other.getMovilDeContactoParaSeguimiento()==null) || 
             (this.movilDeContactoParaSeguimiento!=null &&
              this.movilDeContactoParaSeguimiento.equals(other.getMovilDeContactoParaSeguimiento()))) &&
            ((this.fallaMasiva==null && other.getFallaMasiva()==null) || 
             (this.fallaMasiva!=null &&
              this.fallaMasiva.equals(other.getFallaMasiva()))) &&
            ((this.idCorrelationSpwA==null && other.getIdCorrelationSpwA()==null) || 
             (this.idCorrelationSpwA!=null &&
              this.idCorrelationSpwA.equals(other.getIdCorrelationSpwA()))) &&
            ((this.fechaDeDeteccionDeFalla==null && other.getFechaDeDeteccionDeFalla()==null) || 
             (this.fechaDeDeteccionDeFalla!=null &&
              this.fechaDeDeteccionDeFalla.equals(other.getFechaDeDeteccionDeFalla()))) &&
            ((this.estadoGeneralDeLaQueja==null && other.getEstadoGeneralDeLaQueja()==null) || 
             (this.estadoGeneralDeLaQueja!=null &&
              this.estadoGeneralDeLaQueja.equals(other.getEstadoGeneralDeLaQueja()))) &&
            ((this.codigoValidacion==null && other.getCodigoValidacion()==null) || 
             (this.codigoValidacion!=null &&
              this.codigoValidacion.equals(other.getCodigoValidacion()))) &&
            ((this.identificadorNISDeServicio2==null && other.getIdentificadorNISDeServicio2()==null) || 
             (this.identificadorNISDeServicio2!=null &&
              this.identificadorNISDeServicio2.equals(other.getIdentificadorNISDeServicio2()))) &&
            ((this.geolocalizacionLatitud==null && other.getGeolocalizacionLatitud()==null) || 
             (this.geolocalizacionLatitud!=null &&
              this.geolocalizacionLatitud.equals(other.getGeolocalizacionLatitud()))) &&
            ((this.geolocalizacionLongitud==null && other.getGeolocalizacionLongitud()==null) || 
             (this.geolocalizacionLongitud!=null &&
              this.geolocalizacionLongitud.equals(other.getGeolocalizacionLongitud()))) &&
            ((this.tipoDeElemento==null && other.getTipoDeElemento()==null) || 
             (this.tipoDeElemento!=null &&
              this.tipoDeElemento.equals(other.getTipoDeElemento()))) &&
            ((this.identificadorElemento==null && other.getIdentificadorElemento()==null) || 
             (this.identificadorElemento!=null &&
              this.identificadorElemento.equals(other.getIdentificadorElemento()))) &&
            ((this.IPOrigenOPC==null && other.getIPOrigenOPC()==null) || 
             (this.IPOrigenOPC!=null &&
              this.IPOrigenOPC.equals(other.getIPOrigenOPC()))) &&
            ((this.IPDestinoDPC==null && other.getIPDestinoDPC()==null) || 
             (this.IPDestinoDPC!=null &&
              this.IPDestinoDPC.equals(other.getIPDestinoDPC()))) &&
            ((this.centralOrigenOCPIP==null && other.getCentralOrigenOCPIP()==null) || 
             (this.centralOrigenOCPIP!=null &&
              this.centralOrigenOCPIP.equals(other.getCentralOrigenOCPIP()))) &&
            ((this.centralDestinoDCPIP==null && other.getCentralDestinoDCPIP()==null) || 
             (this.centralDestinoDCPIP!=null &&
              this.centralDestinoDCPIP.equals(other.getCentralDestinoDCPIP()))) &&
            ((this.CIC==null && other.getCIC()==null) || 
             (this.CIC!=null &&
              this.CIC.equals(other.getCIC()))) &&
            ((this.prioridad==null && other.getPrioridad()==null) || 
             (this.prioridad!=null &&
              this.prioridad.equals(other.getPrioridad()))) &&
            ((this.ciudadOrigenNIR==null && other.getCiudadOrigenNIR()==null) || 
             (this.ciudadOrigenNIR!=null &&
              this.ciudadOrigenNIR.equals(other.getCiudadOrigenNIR()))) &&
            ((this.ciudadDestinoNIR==null && other.getCiudadDestinoNIR()==null) || 
             (this.ciudadDestinoNIR!=null &&
              this.ciudadDestinoNIR.equals(other.getCiudadDestinoNIR()))) &&
            ((this.origen==null && other.getOrigen()==null) || 
             (this.origen!=null &&
              this.origen.equals(other.getOrigen()))) &&
            ((this.destino==null && other.getDestino()==null) || 
             (this.destino!=null &&
              this.destino.equals(other.getDestino()))) &&
            ((this.IDO==null && other.getIDO()==null) || 
             (this.IDO!=null &&
              this.IDO.equals(other.getIDO()))) &&
            ((this.IDD==null && other.getIDD()==null) || 
             (this.IDD!=null &&
              this.IDD.equals(other.getIDD()))) &&
            ((this.diezDigitos==null && other.getDiezDigitos()==null) || 
             (this.diezDigitos!=null &&
              this.diezDigitos.equals(other.getDiezDigitos()))) &&
            ((this.operadorOrigenIDO==null && other.getOperadorOrigenIDO()==null) || 
             (this.operadorOrigenIDO!=null &&
              this.operadorOrigenIDO.equals(other.getOperadorOrigenIDO()))) &&
            ((this.operadorDestinoIDD==null && other.getOperadorDestinoIDD()==null) || 
             (this.operadorDestinoIDD!=null &&
              this.operadorDestinoIDD.equals(other.getOperadorDestinoIDD()))) &&
            ((this.portID==null && other.getPortID()==null) || 
             (this.portID!=null &&
              this.portID.equals(other.getPortID()))) &&
            ((this.origen1==null && other.getOrigen1()==null) || 
             (this.origen1!=null &&
              this.origen1.equals(other.getOrigen1()))) &&
            ((this.origen2==null && other.getOrigen2()==null) || 
             (this.origen2!=null &&
              this.origen2.equals(other.getOrigen2()))) &&
            ((this.destino1==null && other.getDestino1()==null) || 
             (this.destino1!=null &&
              this.destino1.equals(other.getDestino1()))) &&
            ((this.destino2==null && other.getDestino2()==null) || 
             (this.destino2!=null &&
              this.destino2.equals(other.getDestino2()))) &&
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getNombreDeEmpresa() != null) {
            _hashCode += getNombreDeEmpresa().hashCode();
        }
        if (getSeveridadDeLaFalla() != null) {
            _hashCode += getSeveridadDeLaFalla().hashCode();
        }
        if (getDescripcionDetalladaDeFalla() != null) {
            _hashCode += getDescripcionDetalladaDeFalla().hashCode();
        }
        if (getIdentificadorNISDeServicio() != null) {
            _hashCode += getIdentificadorNISDeServicio().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getMotivoDeCancelacion() != null) {
            _hashCode += getMotivoDeCancelacion().hashCode();
        }
        if (getGrupoAsignacion() != null) {
            _hashCode += getGrupoAsignacion().hashCode();
        }
        if (getMovilDeContactoEnSitio() != null) {
            _hashCode += getMovilDeContactoEnSitio().hashCode();
        }
        if (getNombreDeContactoParaSeguimiento() != null) {
            _hashCode += getNombreDeContactoParaSeguimiento().hashCode();
        }
        if (getNombreUsuarioEmpresa() != null) {
            _hashCode += getNombreUsuarioEmpresa().hashCode();
        }
        if (getFaseSISA() != null) {
            _hashCode += getFaseSISA().hashCode();
        }
        if (getTelefonoDeContactoParaSeguimiento() != null) {
            _hashCode += getTelefonoDeContactoParaSeguimiento().hashCode();
        }
        if (getCorreoDeContactoParaSeguimiento() != null) {
            _hashCode += getCorreoDeContactoParaSeguimiento().hashCode();
        }
        if (getContactoSitio() != null) {
            _hashCode += getContactoSitio().hashCode();
        }
        if (getTelefonoSitio() != null) {
            _hashCode += getTelefonoSitio().hashCode();
        }
        if (getPoblacionA() != null) {
            _hashCode += getPoblacionA().hashCode();
        }
        if (getDireccionDeEmpresa() != null) {
            _hashCode += getDireccionDeEmpresa().hashCode();
        }
        if (getDescripcionQueja() != null) {
            _hashCode += getDescripcionQueja().hashCode();
        }
        if (getTipoDeServicio() != null) {
            _hashCode += getTipoDeServicio().hashCode();
        }
        if (getHorarioDeAccesoASitioDiaInicio() != null) {
            _hashCode += getHorarioDeAccesoASitioDiaInicio().hashCode();
        }
        if (getCUCEmpresarial() != null) {
            _hashCode += getCUCEmpresarial().hashCode();
        }
        if (getHorarioDeAccesoASitioDiaFin() != null) {
            _hashCode += getHorarioDeAccesoASitioDiaFin().hashCode();
        }
        if (getHorarioDeAccesoASitioHoraInicio() != null) {
            _hashCode += getHorarioDeAccesoASitioHoraInicio().hashCode();
        }
        if (getHorarioDeAccesoASitioHoraFin() != null) {
            _hashCode += getHorarioDeAccesoASitioHoraFin().hashCode();
        }
        if (getCatalogacionDeFalla() != null) {
            _hashCode += getCatalogacionDeFalla().hashCode();
        }
        if (getMovilDeContactoParaSeguimiento() != null) {
            _hashCode += getMovilDeContactoParaSeguimiento().hashCode();
        }
        if (getFallaMasiva() != null) {
            _hashCode += getFallaMasiva().hashCode();
        }
        if (getIdCorrelationSpwA() != null) {
            _hashCode += getIdCorrelationSpwA().hashCode();
        }
        if (getFechaDeDeteccionDeFalla() != null) {
            _hashCode += getFechaDeDeteccionDeFalla().hashCode();
        }
        if (getEstadoGeneralDeLaQueja() != null) {
            _hashCode += getEstadoGeneralDeLaQueja().hashCode();
        }
        if (getCodigoValidacion() != null) {
            _hashCode += getCodigoValidacion().hashCode();
        }
        if (getIdentificadorNISDeServicio2() != null) {
            _hashCode += getIdentificadorNISDeServicio2().hashCode();
        }
        if (getGeolocalizacionLatitud() != null) {
            _hashCode += getGeolocalizacionLatitud().hashCode();
        }
        if (getGeolocalizacionLongitud() != null) {
            _hashCode += getGeolocalizacionLongitud().hashCode();
        }
        if (getTipoDeElemento() != null) {
            _hashCode += getTipoDeElemento().hashCode();
        }
        if (getIdentificadorElemento() != null) {
            _hashCode += getIdentificadorElemento().hashCode();
        }
        if (getIPOrigenOPC() != null) {
            _hashCode += getIPOrigenOPC().hashCode();
        }
        if (getIPDestinoDPC() != null) {
            _hashCode += getIPDestinoDPC().hashCode();
        }
        if (getCentralOrigenOCPIP() != null) {
            _hashCode += getCentralOrigenOCPIP().hashCode();
        }
        if (getCentralDestinoDCPIP() != null) {
            _hashCode += getCentralDestinoDCPIP().hashCode();
        }
        if (getCIC() != null) {
            _hashCode += getCIC().hashCode();
        }
        if (getPrioridad() != null) {
            _hashCode += getPrioridad().hashCode();
        }
        if (getCiudadOrigenNIR() != null) {
            _hashCode += getCiudadOrigenNIR().hashCode();
        }
        if (getCiudadDestinoNIR() != null) {
            _hashCode += getCiudadDestinoNIR().hashCode();
        }
        if (getOrigen() != null) {
            _hashCode += getOrigen().hashCode();
        }
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getIDO() != null) {
            _hashCode += getIDO().hashCode();
        }
        if (getIDD() != null) {
            _hashCode += getIDD().hashCode();
        }
        if (getDiezDigitos() != null) {
            _hashCode += getDiezDigitos().hashCode();
        }
        if (getOperadorOrigenIDO() != null) {
            _hashCode += getOperadorOrigenIDO().hashCode();
        }
        if (getOperadorDestinoIDD() != null) {
            _hashCode += getOperadorDestinoIDD().hashCode();
        }
        if (getPortID() != null) {
            _hashCode += getPortID().hashCode();
        }
        if (getOrigen1() != null) {
            _hashCode += getOrigen1().hashCode();
        }
        if (getOrigen2() != null) {
            _hashCode += getOrigen2().hashCode();
        }
        if (getDestino1() != null) {
            _hashCode += getDestino1().hashCode();
        }
        if (getDestino2() != null) {
            _hashCode += getDestino2().hashCode();
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
        new org.apache.axis.description.TypeDesc(IncidentsInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "incidentsInstanceType"));
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
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreDeEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "NombreDeEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severidadDeLaFalla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "SeveridadDeLaFalla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionDetalladaDeFalla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "DescripcionDetalladaDeFalla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">incidentsInstanceType>DescripcionDetalladaDeFalla"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorNISDeServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IdentificadorNISDeServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoDeCancelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "MotivoDeCancelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">incidentsInstanceType>MotivoDeCancelacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoAsignacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "GrupoAsignacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", ">incidentsInstanceType>GrupoAsignacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movilDeContactoEnSitio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "MovilDeContactoEnSitio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreDeContactoParaSeguimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "NombreDeContactoParaSeguimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreUsuarioEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "NombreUsuarioEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faseSISA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "FaseSISA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoDeContactoParaSeguimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TelefonoDeContactoParaSeguimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correoDeContactoParaSeguimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CorreoDeContactoParaSeguimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactoSitio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "ContactoSitio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoSitio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TelefonoSitio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poblacionA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "PoblacionA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionDeEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "DireccionDeEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionQueja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "DescripcionQueja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDeServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TipoDeServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioDeAccesoASitioDiaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioDeAccesoASitioDiaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUCEmpresarial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CUCEmpresarial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioDeAccesoASitioDiaFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioDeAccesoASitioDiaFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioDeAccesoASitioHoraInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioDeAccesoASitioHoraInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioDeAccesoASitioHoraFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "HorarioDeAccesoASitioHoraFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogacionDeFalla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CatalogacionDeFalla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movilDeContactoParaSeguimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "MovilDeContactoParaSeguimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallaMasiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "FallaMasiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCorrelationSpwA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "idCorrelationSpwA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDeDeteccionDeFalla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "FechaDeDeteccionDeFalla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoGeneralDeLaQueja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "EstadoGeneralDeLaQueja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoValidacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CodigoValidacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorNISDeServicio2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IdentificadorNISDeServicio2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geolocalizacionLatitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "GeolocalizacionLatitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geolocalizacionLongitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "GeolocalizacionLongitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDeElemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "TipoDeElemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorElemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IdentificadorElemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPOrigenOPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IPOrigenOPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPDestinoDPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IPDestinoDPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralOrigenOCPIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CentralOrigenOCPIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralDestinoDCPIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CentralDestinoDCPIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Prioridad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudadOrigenNIR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CiudadOrigenNIR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudadDestinoNIR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "CiudadDestinoNIR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Origen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IDO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "IDD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diezDigitos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "DiezDigitos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadorOrigenIDO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "OperadorOrigenIDO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadorDestinoIDD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "OperadorDestinoIDD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "PortID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origen1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Origen1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origen2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Origen2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Destino1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.hp.com/SM/7", "Destino2"));
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
