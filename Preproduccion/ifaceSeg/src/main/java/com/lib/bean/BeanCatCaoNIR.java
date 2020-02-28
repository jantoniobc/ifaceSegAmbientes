package com.lib.bean;
import java.io.Serializable;

public class BeanCatCaoNIR implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Number Id;
	private String Lada;
	private String Activo;
	private String Ciudad;
	private String Mensaje;
	
	public Number getId() {
		return Id;
	}
	public void setId(Number id) {
		Id = id;
	}
	public String getLada() {
		return Lada;
	}
	public void setLada(String lada) {
		Lada = lada;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getActivo() {
		return Activo;
	}
	public void setActivo(String activo) {
		Activo = activo;
	}
	
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
}
