package com.lib.cont;

import java.rmi.RemoteException;
import java.util.ArrayList;
import com.hp.schemas.SM._7.RetrievetmxCatCaoEmpresaListResponse;
import com.hp.schemas.SM._7.RetrievetmxCatCaoEmpresaRequest;
import com.hp.schemas.SM._7.TmxCatCaoEmpresaInstanceType;
import com.hp.schemas.SM._7.TmxCatCaoEmpresaKeysType;
import com.hp.schemas.SM._7.TmxCatCaoEmpresaModelType;
import com.hp.schemas.SM._7.TmxCatCaoEmpresaProxy;
import com.lib.bean.BeanCatCaoEmpresa;

public class ctrCatCaoEmpresa {

	public  ArrayList<BeanCatCaoEmpresa> getCatCaoEmpresa(String querry) {
		
		ArrayList<BeanCatCaoEmpresa> setCatCaoEmpresa = new ArrayList<>();
		
		Number Id;
		String Empresa;
		String CucEmpresarial;
		String Activo;
		
			TmxCatCaoEmpresaProxy proxy = new TmxCatCaoEmpresaProxy();	
			RetrievetmxCatCaoEmpresaRequest request = new RetrievetmxCatCaoEmpresaRequest();
			TmxCatCaoEmpresaModelType model = new TmxCatCaoEmpresaModelType();
			TmxCatCaoEmpresaInstanceType instance = new TmxCatCaoEmpresaInstanceType();
			TmxCatCaoEmpresaKeysType key = new TmxCatCaoEmpresaKeysType();
			TmxCatCaoEmpresaKeysType[] keysArray = new TmxCatCaoEmpresaKeysType[1];
			RetrievetmxCatCaoEmpresaListResponse response;
		
		key.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(key);
		request.setModel(model);
		keysArray[0] = key;
		
		try {		
			
			response = proxy.retrievetmxCatCaoEmpresaList(keysArray);
		
			if (response.getMessage().toString().equals("Correcto"))
			{
			
				for (int i =0 ; i< response.getInstance().length ; i++)
				{
					BeanCatCaoEmpresa bean = new BeanCatCaoEmpresa();
					
					Id = null;
					Empresa="";
					CucEmpresarial="";
					Activo ="";
					
					if(response.getInstance(i).getId() !=null)
						Id = response.getInstance(i).getId().get_value();
					if(response.getInstance(i).getEmpresa() !=null)
						Empresa = response.getInstance(i).getEmpresa().toString();
					if(response.getInstance(i).getCucEmpresarial() !=null)
						CucEmpresarial = response.getInstance(i).getCucEmpresarial().toString();
					if(response.getInstance(i).getActivo() !=null)
						Activo = response.getInstance(i).getActivo().toString();
						
					bean.setId(Id);
					bean.setCucEmpresarial(CucEmpresarial);
					bean.setEmpresa(Empresa);
					bean.setActivo(Activo);
					
					setCatCaoEmpresa.add(bean);
				}
			}
			else
			{
				 BeanCatCaoEmpresa bean = new BeanCatCaoEmpresa();
				 bean.setMensaje(response.getMessage().toString());
				 setCatCaoEmpresa.add(bean);	
			}
				
		} catch (RemoteException e) 
		{
			 BeanCatCaoEmpresa bean = new BeanCatCaoEmpresa();
			 bean.setMensaje("Error");
			 setCatCaoEmpresa.add(bean);		
		}	
		return setCatCaoEmpresa;
	}
}
