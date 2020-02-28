package com.lib.bean;

import java.io.Serializable;

public class SetReferencia implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Referencia;
	private String CUCEmpresarial;
	private String Cliente;
	private String Folio;
	private String Familia;
	private String Puntas;
	private String Domicilio;
	private String Empresa;
	private String Mensaje;
	
	public String getReferencia() {
		return Referencia;
	}
	public void setReferencia(String referencia) {
		Referencia = referencia;
	}
	public String getCUCEmpresarial() {
		return CUCEmpresarial;
	}
	public void setCUCEmpresarial(String cUCEmpresarial) {
		CUCEmpresarial = cUCEmpresarial;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public String getFolio() {
		return Folio;
	}
	public void setFolio(String folio) {
		Folio = folio;
	}
	public String getFamilia() {
		return Familia;
	}
	public void setFamilia(String familia) {
		Familia = familia;
	}
	public String getPuntas() {
		return Puntas;
	}
	public void setPuntas(String puntas) {
		Puntas = puntas;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}

	
}
