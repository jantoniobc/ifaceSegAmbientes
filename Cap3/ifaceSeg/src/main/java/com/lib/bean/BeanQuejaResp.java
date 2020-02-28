package com.lib.bean;

import java.io.Serializable;

public class BeanQuejaResp implements Serializable {

	
	private static final long serialVersionUID = 7428955616552061158L;

	private String ID;
	private String Estado;
	private String FechaEstimadaReparacion;
	private String FolioConsecionario;
	private String Asignado;
	private String IdentificadorNISDeServicio;
	private String ProblemaReportado;
	private String HorarioAcceso; 
	private String Prioridad;
	private String Mensaje;
	
	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getEstado() {
		return Estado;
	}
	
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	public String getFechaEstimadaReparacion() {
		return FechaEstimadaReparacion;
	}
	
	public void setFechaEstimadaReparacion(String fechaEstimadaReparacion) {
		FechaEstimadaReparacion = fechaEstimadaReparacion;
	}
	
	public String getFolioConsecionario() {
		return FolioConsecionario;
	}
	
	public void setFolioConsecionario(String folioConsecionario) {
		FolioConsecionario = folioConsecionario;
	}
	
	public String getIdentificadorNISDeServicio() {
		return IdentificadorNISDeServicio;
	}
	
	public void setIdentificadorNISDeServicio(String identificadorNISDeServicio) {
		IdentificadorNISDeServicio = identificadorNISDeServicio;
	}
	
	public String getProblemaReportado() {
		return ProblemaReportado;
	}
	
	public void setProblemaReportado(String problemaReportado) {
		ProblemaReportado = problemaReportado;
	}
	
	public String getHorarioAcceso() {
		return HorarioAcceso;
	}
	
	public void setHorarioAcceso(String horarioAcceso) {
		HorarioAcceso = horarioAcceso;
	}
	
	public String getPrioridad() {
		return Prioridad;
	}
	
	public void setPrioridad(String prioridad) {
		Prioridad = prioridad;
	}
	
	public String getMensaje() {
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}

	public String getAsignado() {
		return Asignado;
	}

	public void setAsignado(String asignado) {
		Asignado = asignado;
	}

}
