package com.lib.cont;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.hp.schemas.SM._7.IncidenteSP_SEGInstanceType;
import com.hp.schemas.SM._7.IncidenteSP_SEGKeysType;
import com.hp.schemas.SM._7.IncidenteSP_SEGModelType;
import com.hp.schemas.SM._7.IncidenteSP_SEGProxy;
import com.hp.schemas.SM._7.IncidentsInstanceType;
import com.hp.schemas.SM._7.IncidentsKeysType;
import com.hp.schemas.SM._7.IncidentsModelType;
import com.hp.schemas.SM._7.InteraccionSPProxy;
import com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGRequest;
import com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGResponse;
import com.hp.schemas.SM._7.RetrieveincidentsListResponse;
import com.hp.schemas.SM._7.RetrieveincidentsRequest;
import com.hp.schemas.SM._7.TmxQuejaSmSegProxy;
import com.lib.bean.BeanQuejaResp;

public class CtrQuejaResp {

	public ArrayList<BeanQuejaResp> getQuejas (String querry) {
		
		ArrayList<BeanQuejaResp> setQueja = new ArrayList<>();
		
		System.out.println("enta a consultar queja : " +querry );
		
		TmxQuejaSmSegProxy px =  new TmxQuejaSmSegProxy();
		
		System.out.println("crea otro end point : " +px.getEndpoint() );
		
		InteraccionSPProxy proxy = new InteraccionSPProxy();
		RetrieveincidentsRequest req = new RetrieveincidentsRequest();
		IncidentsModelType model = new IncidentsModelType();
		IncidentsInstanceType  instance = new IncidentsInstanceType();
		IncidentsKeysType[] keysArray  = new IncidentsKeysType[1];
		IncidentsKeysType keys  = new IncidentsKeysType();
		
		keys.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(keys);
		req.setModel(model);
		RetrieveincidentsListResponse resp;
		keysArray[0]=keys;
		
		try {
				
				resp = proxy.retrieveincidentsList(keysArray);
			
				if (resp.getMessage().toString().equals("Correcto"))
				{	
					String ID;
					String Estado;
					String FolioConsecionario;
					String FechaEstimadaReparacion;
					String IdentificadorNISDeServicio;
					String ProblemaReportado;
					String Asignado;
					String Prioridad;
					String Mensaje = resp.getMessage().toString() ;
					String DiaInicio;
					String DiaFin;
					String HoraInicio;
					String HoraFin;
					
					
					
					for (int i =0 ; i< resp.getInstance().length ; i++)
					{
						
						BeanQuejaResp bqueja = new BeanQuejaResp();  						
						ID="";
						Estado="";
						Asignado="";
						FolioConsecionario="";
						FechaEstimadaReparacion="";
						IdentificadorNISDeServicio="";
						ProblemaReportado="";
						Prioridad="";
						DiaInicio="";
						DiaFin="";
						HoraInicio="";
						HoraFin="";
						
						if(resp.getInstance(i).getID()!=null)
							ID = resp.getInstance(i).getID().toString();
						if(resp.getInstance(i).getEstadoGeneralDeLaQueja()!=null)
							Estado = resp.getInstance(i).getEstadoGeneralDeLaQueja().toString();
						//if(resp.getInstance(i).get)
						if (resp.getInstance(i).getIdentificadorNISDeServicio()!=null)
							IdentificadorNISDeServicio= resp.getInstance(i).getIdentificadorNISDeServicio().toString();
						if (resp.getInstance(i).getCatalogacionDeFalla()!=null)
							ProblemaReportado = resp.getInstance(i).getCatalogacionDeFalla().toString();
						if(resp.getInstance(i).getPrioridad()!=null)
							Prioridad = resp.getInstance(i).getPrioridad().toString();
						if(resp.getInstance(i).getHorarioDeAccesoASitioDiaInicio()!=null)
							DiaInicio = resp.getInstance(i).getHorarioDeAccesoASitioDiaInicio().toString();
						if(resp.getInstance(i).getHorarioDeAccesoASitioDiaFin()!=null)
							DiaFin = resp.getInstance(i).getHorarioDeAccesoASitioDiaFin().toString();
						if(resp.getInstance(i).getHorarioDeAccesoASitioHoraInicio()!=null)
							HoraInicio = resp.getInstance(i).getHorarioDeAccesoASitioHoraInicio().toString();
						if(resp.getInstance(i).getHorarioDeAccesoASitioHoraFin()!=null)
							HoraFin = resp.getInstance(i).getHorarioDeAccesoASitioHoraFin().toString();
						
						if(resp.getInstance(i).getGrupoAsignacion()!=null)
							Asignado = resp.getInstance(i).getGrupoAsignacion().getGrupoAsignacion(0).toString();
						//FechaEstimadaReparacion = this.getFechaResolucion(ID);
						
						bqueja.setID(ID);
						bqueja.setEstado(Estado);
						bqueja.setFechaEstimadaReparacion(FechaEstimadaReparacion);
						bqueja.setFolioConsecionario(FolioConsecionario);
						bqueja.setHorarioAcceso( "De "+ DiaInicio+" A "+DiaFin+" En horario de : " + HoraInicio	+ " A " + HoraFin );
						bqueja.setIdentificadorNISDeServicio(IdentificadorNISDeServicio);
						bqueja.setMensaje(Mensaje);
						bqueja.setPrioridad(Prioridad);
						bqueja.setAsignado(Asignado);
						bqueja.setProblemaReportado(ProblemaReportado);
						
						setQueja.add(bqueja);
					}
				}
			else {
				BeanQuejaResp bqueja = new BeanQuejaResp();  
				bqueja.setMensaje("No se encontraron registros");
				setQueja.add(bqueja);
			}
			
		} catch (RemoteException e) 
		{
			BeanQuejaResp bqueja = new BeanQuejaResp();  
			bqueja.setMensaje("ERROR");
			setQueja.add(bqueja);
		}
		return setQueja;
	}
		
	public String getFechaResolucion (String IDInteraccion) 
	{
	
		String FechaReparacion="";
		String Querry = "incident.id = \""+IDInteraccion+"\"";
		
		IncidenteSP_SEGProxy proxy = new IncidenteSP_SEGProxy();
		RetrieveIncidenteSP_SEGRequest req = new RetrieveIncidenteSP_SEGRequest();		
		IncidenteSP_SEGModelType model = new IncidenteSP_SEGModelType();
		
		IncidenteSP_SEGInstanceType instance = new IncidenteSP_SEGInstanceType();
	
		IncidenteSP_SEGKeysType keys  = new IncidenteSP_SEGKeysType();
		
		keys.setQuery(Querry);
		model.setInstance(instance);
		model.setKeys(keys);
		req.setModel(model);
		RetrieveIncidenteSP_SEGResponse resp;
		
		try {
		
			resp = proxy.retrieveIncidenteSP_SEG(req);//RetrieveIncidenteSP
			if (resp.getMessage().equals("Correcto"))
			{				
				if(resp.getModel().getInstance().getFechaResolucionPrevista()!=null)
					FechaReparacion = resp.getModel().getInstance().getFechaResolucionPrevista().toString();
			}	
			
		} catch (RemoteException e) 
		{
			FechaReparacion="";
		}

		return FechaReparacion;
	}
}
