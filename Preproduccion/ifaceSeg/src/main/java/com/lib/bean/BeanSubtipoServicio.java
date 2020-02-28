package com.lib.bean;

import java.io.Serializable;

public class BeanSubtipoServicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Id;
	private String Nemonico;
	private String TipoServicio;
	private String TipoInteraccion;
	private String Mensaje;
	private String Activo;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNemonico() {
		return Nemonico;
	}
	public void setNemonico(String nemonico) {
		Nemonico = nemonico;
	}
	public String getTipoServicio() {
		return TipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		TipoServicio = tipoServicio;
	}
	public String getTipoInteraccion() {
		return TipoInteraccion;
	}
	public void setTipoInteraccion(String tipoInteraccion) {
		TipoInteraccion = tipoInteraccion;
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
