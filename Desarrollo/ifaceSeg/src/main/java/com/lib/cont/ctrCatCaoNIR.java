package com.lib.cont;

import java.rmi.RemoteException;
import java.util.ArrayList;

import com.hp.schemas.SM._7.RetrievetmxCatCaoNIRListResponse;
import com.hp.schemas.SM._7.RetrievetmxCatCaoNIRRequest;
import com.hp.schemas.SM._7.TmxCatCaoNIRInstanceType;
import com.hp.schemas.SM._7.TmxCatCaoNIRKeysType;
import com.hp.schemas.SM._7.TmxCatCaoNIRModelType;
import com.hp.schemas.SM._7.TmxCatCaoNIRProxy;
import com.lib.bean.BeanCatCaoNIR;


public class ctrCatCaoNIR {

	public  ArrayList<BeanCatCaoNIR> getCatCaoNIR(String querry) {
		
		ArrayList<BeanCatCaoNIR> setCatCaoNIR = new ArrayList<>();
		
		Number Id;
		String Lada;
		String Ciudad;
		String Activo;
		
			TmxCatCaoNIRProxy proxy = new TmxCatCaoNIRProxy();	
			RetrievetmxCatCaoNIRRequest request = new RetrievetmxCatCaoNIRRequest();
			TmxCatCaoNIRModelType model = new TmxCatCaoNIRModelType();
			TmxCatCaoNIRInstanceType instance = new TmxCatCaoNIRInstanceType();
			TmxCatCaoNIRKeysType key = new TmxCatCaoNIRKeysType();
			TmxCatCaoNIRKeysType[] keysArray = new TmxCatCaoNIRKeysType[1];
			RetrievetmxCatCaoNIRListResponse response;
		
		key.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(key);
		request.setModel(model);
		keysArray[0] = key;
		
		try {		
			
			response = proxy.retrievetmxCatCaoNIRList(keysArray);
		
			if (response.getMessage().toString().equals("Correcto"))
			{
			
				for (int i =0 ; i< response.getInstance().length ; i++)
				{
					BeanCatCaoNIR bean = new BeanCatCaoNIR();
					
					Id = null;
					Lada="";
					Ciudad="";
					Activo ="";
					
					if(response.getInstance(i).getId() !=null)
						Id = response.getInstance(i).getId().get_value();
					if(response.getInstance(i).getLada() !=null)
						Lada = response.getInstance(i).getLada().toString();
					if(response.getInstance(i).getCiudad() !=null)
						Ciudad = response.getInstance(i).getCiudad().toString();
					if(response.getInstance(i).getActivo() !=null)
						Activo = response.getInstance(i).getActivo().toString();
						
					bean.setId(Id);
					bean.setCiudad(Ciudad);
					bean.setLada(Lada);
					bean.setActivo(Activo);
					
					setCatCaoNIR.add(bean);
				}
			}
			else
			{
				 BeanCatCaoNIR bean = new BeanCatCaoNIR();
				 bean.setMensaje(response.getMessage().toString());
				 setCatCaoNIR.add(bean);	
			}
				
		} catch (RemoteException e) 
		{
			 BeanCatCaoNIR bean = new BeanCatCaoNIR();
			 bean.setMensaje("Error");
			 setCatCaoNIR.add(bean);		
		}	
		return setCatCaoNIR;
	}
}
