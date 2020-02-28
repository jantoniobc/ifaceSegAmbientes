package com.lib.cont;



public class ctrABCQuejas {


	
	public String getCadena( String cadenaPrincipal , String cadenaInicio , String cadenaFin)
	{
		String resul="";
		
		int tam = cadenaInicio.length();
		int interIni = cadenaPrincipal.indexOf(cadenaInicio);
		int interFin =cadenaPrincipal.indexOf(cadenaFin);
		
		resul =  cadenaPrincipal.substring(interIni +tam , interFin);
		
		
		return resul;
	}
	
	

	public String getResponse( )
	{
		return "<AseguramientoQuejas>"
				+ "<RespuestaAseguramiento>"
				+ "<IdentificadorDeQueja/><EstadoGeneralDeLaQueja/>"
				+ "<FechaDeRespuesta>11/10/2019 17:05:31</FechaDeRespuesta>"
				+ "<CodigoDeRespuesta>10000</CodigoDeRespuesta>"
				+ "<DescripcionDelError/>El valor enviado para el tag TelefonoDeContactoEnSitio, no cumple el formato de 10 posiciones	null	El valor enviado para el tag TelefonoDeContactoParaSeguimiento,"
				+ " no cumple el formato de 10 posiciones	El valor enviado para el tag MovilDeContactoParaSeguimiento, "
				+ "no cumple el formato de 10 posiciones	No se envio el valor en DescripcionDetalladaDeFalla	</DescripcionDelError>"
				+ "</RespuestaAseguramiento>"
				+ "<DatosControl>"
				+ "<IdCorrelacion>SEG123A32-0001-1123</IdCorrelacion>"
				+ "</DatosControl>"
				+ "</AseguramientoQuejas>";
	}
	
	
	
	
	
	
}
