package com.lib.bean;

import java.io.Serializable;

public class BeanQueja implements Serializable {

	
	private static final long serialVersionUID = 7428955616552061158L;
	private String IDqueja;
	private String FolioConcesionario;
	private String Referencia;
	private String NIS;
	private String ProblemaReportado;
	private String EstadoGlobal;
	private String FechaHorareparacion;
	private String Prioridad;
	private String HorarioAcceso;
	private String Asignado;
	private String IdIncidente;
	private String ValidacionCliente;
	private String Causa;
	private String Mensaje;
	
	public String getIDqueja() {
		return IDqueja;
	}
	public void setIDqueja(String iDqueja) {
		IDqueja = iDqueja;
	}
	public String getFolioConcesionario() {
		return FolioConcesionario;
	}
	public void setFolioConcesionario(String folioConcesionario) {
		FolioConcesionario = folioConcesionario;
	}
	public String getReferencia() {
		return Referencia;
	}
	public void setReferencia(String referencia) {
		Referencia = referencia;
	}
	public String getNIS() {
		return NIS;
	}
	public void setNIS(String nIS) {
		NIS = nIS;
	}
	public String getProblemaReportado() {
		return ProblemaReportado;
	}
	public void setProblemaReportado(String problemaReportado) {
		ProblemaReportado = problemaReportado;
	}
	public String getEstadoGlobal() {
		return EstadoGlobal;
	}
	public void setEstadoGlobal(String estadoGlobal) {
		EstadoGlobal = estadoGlobal;
	}
	public String getFechaHorareparacion() {
		return FechaHorareparacion;
	}
	public void setFechaHorareparacion(String fechaHorareparacion) {
		FechaHorareparacion = fechaHorareparacion;
	}
	public String getPrioridad() {
		return Prioridad;
	}
	public void setPrioridad(String prioridad) {
		Prioridad = prioridad;
	}
	public String getHorarioAcceso() {
		return HorarioAcceso;
	}
	public void setHorarioAcceso(String horarioAcceso) {
		HorarioAcceso = horarioAcceso;
	}
	
	public String getAsignado() {
		return Asignado;
	}
	public void setAsignado(String asignado) {
		Asignado = asignado;
	}
	public String getIdIncidente() {
		return IdIncidente;
	}
	public void setIdIncidente(String idIncidente) {
		IdIncidente = idIncidente;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	public String getValidacionCliente() {
		return ValidacionCliente;
	}
	public void setValidacionCliente(String validacionCliente) {
		ValidacionCliente = validacionCliente;
	}
	public String getCausa() {
		return Causa;
	}
	public void setCausa(String causa) {
		Causa = causa;
	}
	
}
