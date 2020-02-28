package com.lib.cont;

import java.rmi.RemoteException;
import java.util.ArrayList;

import com.hp.schemas.SM._7.RetrievetmxCatCaoOpcDpcIpListResponse;
import com.hp.schemas.SM._7.RetrievetmxCatCaoOpcDpcIpRequest;
import com.hp.schemas.SM._7.TmxCatCaoOpcDpcIpInstanceType;
import com.hp.schemas.SM._7.TmxCatCaoOpcDpcIpKeysType;
import com.hp.schemas.SM._7.TmxCatCaoOpcDpcIpModelType;
import com.hp.schemas.SM._7.TmxCatCaoOpcDpcIpProxy;
import com.lib.bean.BeanCatCaoOpcDpcIp;

public class ctrCatCaoOpcDpcIp {

	public  ArrayList<BeanCatCaoOpcDpcIp> getCatCaoOpcDpcIp(String querry) {
		
		ArrayList<BeanCatCaoOpcDpcIp> setCatCaoOpcDpcIp = new ArrayList<>();
		
		Number Id;
		String Activo;
		String Central;
		String Ido;
		String Idd;
		String Bcd;
		
			TmxCatCaoOpcDpcIpProxy proxy = new TmxCatCaoOpcDpcIpProxy();	
			RetrievetmxCatCaoOpcDpcIpRequest request = new RetrievetmxCatCaoOpcDpcIpRequest();
			TmxCatCaoOpcDpcIpModelType model = new TmxCatCaoOpcDpcIpModelType();
			TmxCatCaoOpcDpcIpInstanceType instance = new TmxCatCaoOpcDpcIpInstanceType();
			TmxCatCaoOpcDpcIpKeysType key = new TmxCatCaoOpcDpcIpKeysType();
			TmxCatCaoOpcDpcIpKeysType[] keysArray = new TmxCatCaoOpcDpcIpKeysType[1];
			RetrievetmxCatCaoOpcDpcIpListResponse response;
		
		key.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(key);
		request.setModel(model);
		keysArray[0] = key;
		
		try {		
			
			response = proxy.retrievetmxCatCaoOpcDpcIpList(keysArray);
		
			if (response.getMessage().toString().equals("Correcto"))
			{
			
				for (int i =0 ; i< response.getInstance().length ; i++)
				{
					BeanCatCaoOpcDpcIp bean = new BeanCatCaoOpcDpcIp();
					
					Id = null;
					Central = "";
					Ido = "";
					Idd = "";
					Bcd = "";
					Activo ="";
					
					if(response.getInstance(i).getId() !=null)
						Id = response.getInstance(i).getId().get_value();
					if(response.getInstance(i).getCentral() !=null)
						Central = response.getInstance(i).getCentral().toString();
					if(response.getInstance(i).getIdo() !=null)
						Ido = response.getInstance(i).getIdo().toString();
					if(response.getInstance(i).getIdd() !=null)
						Idd = response.getInstance(i).getIdd().toString();
					if(response.getInstance(i).getBcd() !=null)
						Bcd = response.getInstance(i).getBcd().toString();
					if(response.getInstance(i).getActivo() !=null)
						Activo = response.getInstance(i).getActivo().toString();
						
					bean.setId(Id);
					bean.setCentral(Central);
					bean.setIdo(Ido);
					bean.setIdd(Idd);
					bean.setBcd(Bcd);
					bean.setActivo(Activo);
					
					setCatCaoOpcDpcIp.add(bean);
				}
			}
			else
			{
				BeanCatCaoOpcDpcIp bean = new BeanCatCaoOpcDpcIp();
				 bean.setMensaje(response.getMessage().toString());
				 setCatCaoOpcDpcIp.add(bean);	
			}
				
		} catch (RemoteException e) 
		{
			BeanCatCaoOpcDpcIp bean = new BeanCatCaoOpcDpcIp();
			 bean.setMensaje("Error");
			 setCatCaoOpcDpcIp.add(bean);		
		}	
		return setCatCaoOpcDpcIp;
	}
}
