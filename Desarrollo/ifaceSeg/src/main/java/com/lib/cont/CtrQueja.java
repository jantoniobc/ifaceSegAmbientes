package com.lib.cont;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.hp.schemas.SM._7.GettmxQuejaSmSegRequest;
import com.hp.schemas.SM._7.GettmxQuejaSmSegResponse;
import com.hp.schemas.SM._7.SegTmxCaseServEmpExtKeysType;
import com.hp.schemas.SM._7.TmxQuejaSmSegInstanceType;
import com.hp.schemas.SM._7.TmxQuejaSmSegKeysType;
import com.hp.schemas.SM._7.TmxQuejaSmSegModelType;
import com.hp.schemas.SM._7.TmxQuejaSmSegProxy;
import com.hp.schemas.SM._7.Common.MessageType;
import com.hp.schemas.SM._7.Common.StringType;

import com.lib.bean.BeanQueja;

public class CtrQueja {

	
	public ArrayList<BeanQueja> getQuejas (String querry) {
		
	
		ArrayList<BeanQueja> setQueja = new ArrayList<>();
		
		System.out.println("entra a consultar queja : " +querry );
		
		TmxQuejaSmSegProxy px =  new TmxQuejaSmSegProxy();
		
		GettmxQuejaSmSegRequest request = new GettmxQuejaSmSegRequest();
		
		TmxQuejaSmSegModelType model = new TmxQuejaSmSegModelType ();		
		TmxQuejaSmSegKeysType keys = new TmxQuejaSmSegKeysType ();
		TmxQuejaSmSegInstanceType instance = new TmxQuejaSmSegInstanceType();
		StringType query = new StringType() ;
		query.set_value(querry);
		keys.setQuery(query);		
		model.setKeys(keys);
		model.setInstance(instance);		
		request.setModel(model);
		try {
		
			GettmxQuejaSmSegResponse resp = px.gettmxQuejaSmSeg(request) ;
			System.out.println("En la queja "+resp.getMessage());
			if (resp.getMessage().equals( "Correcto"))
			{
				String edoGlobal = "";
				for (int i =1 ; i< resp.getModel().getInstance().getConsultaResultado().getConsultaResultado().length;i++)
				{
					System.out.println(resp.getModel().getInstance().getConsultaResultado().getConsultaResultado(i).toString());
					String[] arrResult = resp.getModel().getInstance().getConsultaResultado().getConsultaResultado(i).toString().split("\\|"); 
					
					//System.out.println(arrResult[6]);
					
					BeanQueja bean = new BeanQueja();
					bean.setAsignado( getValor(arrResult[12] ) );//		12 : Asignado
					bean.setFechaHorareparacion(getFormatoFecha(arrResult[6]) );//6 : FechaHorareparacion
					bean.setFolioConcesionario(getValor(arrResult[1] ));//	1 : FolioConcesionario
					bean.setHorarioAcceso( "De "+  getValor(arrResult[8]) + " a "+ getValor(arrResult[10]) 
											+" en horario de " + getValor(arrResult[9]) +" a " + getValor(arrResult[11])   );
											// 	8 : HorarioAcceso+ 9 : HorarioDe+ 10 : HorarioAcceso2+11 : HorarioA
					bean.setIdIncidente(getValor(arrResult[13] ));//			13 : IdIncidente
					bean.setIDqueja(getValor(arrResult[0] )); //0 : IDqueja
					bean.setMensaje("Correcto");
					bean.setNIS(getValor(arrResult[3] ));//	3 : NIS
					bean.setPrioridad(getValor(arrResult[7]) );//	7 : Prioridad			
					bean.setProblemaReportado(getValor(arrResult[4] ));//4 : ProblemaReportado			
					bean.setReferencia(getValor(arrResult[2] ));//2 : Referencia
					bean.setValidacionCliente(getValor(arrResult[14]));//Validación por el cliente

					if(getValor(arrResult[5]).toString().equals( "PENDIENTE POR PARO RELOJ")){

						edoGlobal =  getValor(arrResult[5]) +" / " + getValor(arrResult[15]);//Causa del paro de Reloj - Incidente
					}else{
						edoGlobal = getValor(arrResult[5]).toString();
					}
			
					bean.setEstadoGlobal(edoGlobal);//	5 : EstadoGlobal
					setQueja.add(bean);
				}
				
			}
			else
				{
					BeanQueja bean = new BeanQueja();
					bean.setMensaje(resp.getMessage().toString());
					setQueja.add(bean);	
				}
			
			
		} catch (RemoteException e) {
			System.out.println("error en : " + e.getMessage());
			BeanQueja bean = new BeanQueja();
			bean.setMensaje("ERROR");
			setQueja.add(bean);	
	
		}
		return setQueja;
	}
	
	private String getValor(String propiedad)
	{
		String valor ="";
		String[] arrPropiedad = propiedad.split(":");
		
		if (arrPropiedad.length ==2)
			{
				valor = arrPropiedad[1].toString().replaceAll("^[ \t]+|[ \t]+$", "");
				if (valor.equals("null") || valor.equals(""))
					valor ="";
			}
		else 
		{ 	if (arrPropiedad.length <2)
				valor ="";
			else 
				valor = propiedad.substring(propiedad.indexOf(":"));
		 }
		return valor;
	}
	
	@SuppressWarnings("unused")
	private String getPropiedad(String cadena)
	{
		String propiedad ="";
		String[] arrcadena = cadena.split(":");
		propiedad = arrcadena[0].toString().replaceAll("^[ \t]+|[ \t]+$", "");
		
		if (propiedad.equals("null") )
			propiedad ="";
	
		return propiedad;
	}
	
	@SuppressWarnings("deprecation")
	private String getFormatoFecha (String pstrFecha)  
	{
		String strFecha = pstrFecha.substring(21) ;
		String strFormatoFecha = "" ;
		
		if(strFecha.equals("") || strFecha.equals(null) || strFecha.equals("null"))
			return strFormatoFecha;
		else
		{
			Date date = new Date(strFecha); 
			return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date); 
		}
			
	}
	
}
