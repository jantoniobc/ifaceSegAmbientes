package com.lib.cont;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.hp.schemas.SM._7.RetrievetmxCatCaoCentralEqpListResponse;
import com.hp.schemas.SM._7.RetrievetmxCatCaoCentralEqpRequest;
import com.hp.schemas.SM._7.TmxCatCaoCentralEqpInstanceType;
import com.hp.schemas.SM._7.TmxCatCaoCentralEqpKeysType;
import com.hp.schemas.SM._7.TmxCatCaoCentralEqpModelType;
import com.hp.schemas.SM._7.TmxCatCaoCentralEqpProxy;
import com.lib.bean.BeanCatCaoCentralEqp;



public class ctrCatCaoCentralEqp {

	public  ArrayList<BeanCatCaoCentralEqp> getCatCaoCentralEqp(String querry) {
		
		ArrayList<BeanCatCaoCentralEqp> setCatCaoCentralEqp = new ArrayList<>();
		
		Number Id;
		String CentralEqp;
		String DpcOpcIp;
		String Activo;
		
			TmxCatCaoCentralEqpProxy proxy = new TmxCatCaoCentralEqpProxy();	
			RetrievetmxCatCaoCentralEqpRequest request = new RetrievetmxCatCaoCentralEqpRequest();
			TmxCatCaoCentralEqpModelType model = new TmxCatCaoCentralEqpModelType();
			TmxCatCaoCentralEqpInstanceType instance = new TmxCatCaoCentralEqpInstanceType();
			TmxCatCaoCentralEqpKeysType key = new TmxCatCaoCentralEqpKeysType();
			TmxCatCaoCentralEqpKeysType[] keysArray = new TmxCatCaoCentralEqpKeysType[1];
			RetrievetmxCatCaoCentralEqpListResponse response;
		
		key.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(key);
		request.setModel(model);
		keysArray[0] = key;
		
		try {		
			
			response = proxy.retrievetmxCatCaoCentralEqpList(keysArray);
		
			if (response.getMessage().toString().equals("Correcto"))
			{
			
				for (int i =0 ; i< response.getInstance().length ; i++)
				{
					BeanCatCaoCentralEqp bean = new BeanCatCaoCentralEqp();
					
					Id = null;
					CentralEqp="";
					DpcOpcIp="";
					Activo ="";
					
					if(response.getInstance(i).getId() !=null)
						Id = response.getInstance(i).getId().get_value();
					if(response.getInstance(i).getCentralEqp() !=null)
						CentralEqp = response.getInstance(i).getCentralEqp().toString();
					if(response.getInstance(i).getDpcOpcIp() !=null)
						DpcOpcIp = response.getInstance(i).getDpcOpcIp().toString();
					if(response.getInstance(i).getActivo() !=null)
						Activo = response.getInstance(i).getActivo().toString();
						
					bean.setId(Id);
					bean.setCentralEqp(CentralEqp);
					bean.setDpcOpcIp(DpcOpcIp);
					bean.setActivo(Activo);
					
					setCatCaoCentralEqp.add(bean);
				}
			}
			else
			{
				 BeanCatCaoCentralEqp bean = new BeanCatCaoCentralEqp();
				 bean.setMensaje(response.getMessage().toString());
				 setCatCaoCentralEqp.add(bean);	
			}
				
		} catch (RemoteException e) 
		{
			BeanCatCaoCentralEqp bean = new BeanCatCaoCentralEqp();
			 bean.setMensaje("Error");
			 setCatCaoCentralEqp.add(bean);		
		}	
		return setCatCaoCentralEqp;
	}
}
