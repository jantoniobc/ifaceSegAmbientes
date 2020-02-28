package com.lib.bean;
import java.io.Serializable;
public class BeanCatCaoCentralEqp implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Number Id;
	private String CentralEqp;
	private String DpcOpcIp;
	private String Activo;
	private String Mensaje;
	
	public Number getId() {
		return Id;
	}
	public void setId(Number id) {
		Id = id;
	}
	public String getCentralEqp() {
		return CentralEqp;
	}
	public void setCentralEqp(String centralEqp) {
		CentralEqp = centralEqp;
	}
	public String getDpcOpcIp() {
		return DpcOpcIp;
	}
	public void setDpcOpcIp(String dpcOpcIp) {
		DpcOpcIp = dpcOpcIp;
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
