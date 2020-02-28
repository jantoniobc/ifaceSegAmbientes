package com.lib.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class BeanBitacora implements Serializable , Comparable<BeanBitacora>{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean Acuse;
	private String FechaAcuse;
	private String UsuarioAcuse;
	private String[] Comentario;
	private String Fase;
	private String Fecha;
	private String Grupo;
	private String IDEvento ;
	private String IDExterno;
	private String IDRegistro; 
	private String Nombre;
	private String TipoActualizacion;
	private String Usuario;
	private String Mensaje;
	
	public boolean getAcuse() {
		return Acuse;
	}
	public void setAcuse(boolean acuse) {
		Acuse = acuse;
	}
	public String getFechaAcuse() {
		return FechaAcuse;
	}
	public void setFechaAcuse(String calendar) {
		FechaAcuse = calendar;
	}
	public String getUsuarioAcuse() {
		return UsuarioAcuse;
	}
	public void setUsuarioAcuse(String usuarioAcuse) {
		UsuarioAcuse = usuarioAcuse;
	}
	public String[] getComentario() {
		return Comentario;
	}
	public void setComentario(String[] comentario) {
		Comentario = comentario;
	}
	public String getFase() {
		return Fase;
	}
	public void setFase(String fase) {
		Fase = fase;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String calendar) {
		Fecha = calendar;
	}
	public String getGrupo() {
		return Grupo;
	}
	public void setGrupo(String grupo) {
		Grupo = grupo;
	}
	public String getIDEvento() {
		return IDEvento;
	}
	public void setIDEvento(String iDEvento) {
		IDEvento = iDEvento;
	}
	public String getIDExterno() {
		return IDExterno;
	}
	public void setIDExterno(String iDExterno) {
		IDExterno = iDExterno;
	}
	public String getIDRegistro() {
		return IDRegistro;
	}
	public void setIDRegistro(String string) {
		IDRegistro = string;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipoActualizacion() {
		return TipoActualizacion;
	}
	public void setTipoActualizacion(String tipoActualizacion) {
		TipoActualizacion = tipoActualizacion;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	@Override
	public int compareTo(BeanBitacora o) {
		// TODO Auto-generated method stub
		return IDRegistro.compareTo(o.getIDRegistro());
	}
	

	

}
