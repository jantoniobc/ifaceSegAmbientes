package com.lib.bean;
import java.io.Serializable;

public class BeanCatCaoOpcDpcIp implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Number Id;
	private String Central;
	private String Ido;
	private String Idd;
	private String Bcd;
	private String Activo;
	private String Mensaje;
	
	public Number getId() {
		return Id;
	}
	public void setId(Number id) {
		Id = id;
	}
	
	public String getCentral() {
		return Central;
	}
	public void setCentral(String central) {
		Central = central;
	}
	public String getIdo() {
		return Ido;
	}
	public void setIdo(String ido) {
		Ido = ido;
	}
	public String getIdd() {
		return Idd;
	}
	public void setIdd(String idd) {
		Idd = idd;
	}
	public String getBcd() {
		return Bcd;
	}
	public void setBcd(String bcd) {
		Bcd = bcd;
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
