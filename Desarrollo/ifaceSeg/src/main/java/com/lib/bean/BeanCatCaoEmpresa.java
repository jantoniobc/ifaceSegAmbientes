package com.lib.bean;
import java.io.Serializable;

public class BeanCatCaoEmpresa implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Number Id;
	private String Empresa;
	private String Activo;
	private String CucEmpresarial;
	private String Mensaje;
	
	public Number getId() {
		return Id;
	}
	public void setId(Number id) {
		Id = id;
	}
	
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getCucEmpresarial() {
		return CucEmpresarial;
	}
	public void setCucEmpresarial(String cucEmpresarial) {
		CucEmpresarial = cucEmpresarial;
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
