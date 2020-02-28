package com.lib.bean;
import java.io.Serializable;

public class BeanABCQueja implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String IdentificadorDeQueja;
	private String EstadoGeneralDeLaQueja;
	private String FechaDeRespuesta;
	private String CodigoDeRespuesta;
	private String DescripcionDelError;
	private String IdCorrelacion;
	
	public String getIdentificadorDeQueja() {
		return IdentificadorDeQueja;
	}
	public void setIdentificadorDeQueja(String identificadorDeQueja) {
		IdentificadorDeQueja = identificadorDeQueja;
	}
	public String getEstadoGeneralDeLaQueja() {
		return EstadoGeneralDeLaQueja;
	}
	public void setEstadoGeneralDeLaQueja(String estadoGeneralDeLaQueja) {
		EstadoGeneralDeLaQueja = estadoGeneralDeLaQueja;
	}
	public String getFechaDeRespuesta() {
		return FechaDeRespuesta;
	}
	public void setFechaDeRespuesta(String fechaDeRespuesta) {
		FechaDeRespuesta = fechaDeRespuesta;
	}
	public String getCodigoDeRespuesta() {
		return CodigoDeRespuesta;
	}
	public void setCodigoDeRespuesta(String codigoDeRespuesta) {
		CodigoDeRespuesta = codigoDeRespuesta;
	}
	public String getDescripcionDelError() {
		return DescripcionDelError;
	}
	public void setDescripcionDelError(String descripcionDelError) {
		DescripcionDelError = descripcionDelError;
	}
	public String getIdCorrelacion() {
		return IdCorrelacion;
	}
	public void setIdCorrelacion(String idCorrelacion) {
		IdCorrelacion = idCorrelacion;
	}


	
	
}
