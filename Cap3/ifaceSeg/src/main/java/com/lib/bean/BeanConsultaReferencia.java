package com.lib.bean;
import java.io.Serializable;


public class BeanConsultaReferencia implements Serializable   {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String QuejaID;
	private String Estado;
	private String Mensaje;
	private String Fase;
	private String Referencia;
	
	public String getQuejaID() {
		return QuejaID;
	}
	public void setQuejaID(String quejaID) {
		QuejaID = quejaID;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	public String getFase() {
		return Fase;
	}
	public void setFase(String fase) {
		Fase = fase;
	}
	public String getReferencia() {
		return Referencia;
	}
	public void setReferencia(String referencia) {
		Referencia = referencia;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	
}
