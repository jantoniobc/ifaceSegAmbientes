package com.lib.cont;

import java.rmi.RemoteException;
import java.util.ArrayList;


import com.hp.schemas.SM._7.RetrieveSubtipoServicioSEGListResponse;
import com.hp.schemas.SM._7.RetrieveSubtipoServicioSEGRequest;
import com.hp.schemas.SM._7.SubtipoServicioSEGInstanceType;
import com.hp.schemas.SM._7.SubtipoServicioSEGKeysType;
import com.hp.schemas.SM._7.SubtipoServicioSEGModelType;
import com.hp.schemas.SM._7.SubtipoServicioSEGProxy;
import com.lib.bean.BeanSubtipoServicio;


public class CtrSubtipoServicio {

	
	public ArrayList <BeanSubtipoServicio> getSubtipoServicio (String pTipoServicio)
	{
		ArrayList<BeanSubtipoServicio> setSubtipoServicio = new ArrayList<>();
		
		SubtipoServicioSEGProxy proxy = new SubtipoServicioSEGProxy();
		RetrieveSubtipoServicioSEGRequest req = new RetrieveSubtipoServicioSEGRequest();
		SubtipoServicioSEGModelType model = new SubtipoServicioSEGModelType();
		SubtipoServicioSEGInstanceType instancia = new SubtipoServicioSEGInstanceType();
		SubtipoServicioSEGKeysType[] keysArray = new SubtipoServicioSEGKeysType[1];
		SubtipoServicioSEGKeysType keys = new SubtipoServicioSEGKeysType();
		
		keys.setQuery(getQuerry(pTipoServicio));
		model.setInstance(instancia);
		model.setKeys(keys);
		req.setModel(model);
		RetrieveSubtipoServicioSEGListResponse resp;
		keysArray[0]=keys;
		
		try {
				resp = proxy.retrieveSubtipoServicioSEGList(keysArray);

				if (resp.getMessage().toString().equals("Correcto"))
				{	
					for (int i =0 ; i< resp.getInstance().length ; i++)
					{
						BeanSubtipoServicio bean = new BeanSubtipoServicio();
						
						bean.setMensaje(resp.getMessage().toString());
						bean.setId(resp.getInstance(i).getId().toString());
						bean.setNemonico(resp.getInstance(i).getNemonico().toString());
						bean.setTipoServicio(resp.getInstance(i).getTipoServicio().toString());
						bean.setTipoInteraccion(resp.getInstance(i).getTipoInteraccion().toString());
						bean.setActivo(resp.getInstance(i).getActivo().toString());
						
						setSubtipoServicio.add(bean);
						
					}
				}
			
		} catch (RemoteException e) {
			
			BeanSubtipoServicio bean = new BeanSubtipoServicio();
			bean.setMensaje("ERROR");
			setSubtipoServicio.add(bean);
		}
		
		return setSubtipoServicio;		
	}
	
	
	
	
	private String getQuerry (String pTipoServicio)
	{
		String Querry="";
		
		 switch ( pTipoServicio ) 
		 {
		 	case "CM":
		 		Querry = "tipo.servicio isin { \"INTERCONEXION\" } and activo=\"T\" ";
	           break;
		 	case "LE":
		 		Querry = "tipo.servicio isin { \"ENLACE DEDICADO\" } and activo=\"T\" ";
	           break;
	           
		 	case "AUX":
		 		Querry = "tipo.servicio isin { \"PORTABILIDAD\", \"DESAGREGACION\" ,\"SOPORTE UNINET\" } and activo=\"T\" ";
	           break;
		 	case "CMP":
		 		Querry = "tipo.servicio isin { \"COMPARTICION\",\"COUBICACION\" } and activo=\"T\" ";
	           break;
		 }
		return Querry;
	}
	
	
	public static void main(String[] args) 
	{
	
		CtrSubtipoServicio ctrSubTipoServ = new CtrSubtipoServicio();
		
		
		ctrSubTipoServ.getSubtipoServicio("LE");
		
	}
	
	
	
	
}
