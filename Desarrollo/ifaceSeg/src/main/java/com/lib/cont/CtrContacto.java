package com.lib.cont;

import java.rmi.RemoteException;
import java.util.ArrayList;
import com.hp.schemas.SM._7.ContactosSEGInstanceType;
import com.hp.schemas.SM._7.ContactosSEGModelType;
import com.hp.schemas.SM._7.ContactosSEGProxy;
import com.hp.schemas.SM._7.CreateContactosSEGRequest;
import com.hp.schemas.SM._7.CreateContactosSEGResponse;
import com.hp.schemas.SM._7.CreateincidentsRequest;
import com.hp.schemas.SM._7.RetrieveContactosSEGListResponse;
import com.hp.schemas.SM._7.RetrieveContactosSEGRequest;
import com.hp.schemas.SM._7.UpdateContactosSEGRequest;
import com.hp.schemas.SM._7.UpdateContactosSEGResponse;
import com.hp.schemas.SM._7.Common.StringType;
import com.hp.schemas.SM._7.ContactosSEGKeysType;

import com.lib.bean.BeanContactos;



public class CtrContacto {

	
	public  ArrayList<BeanContactos> getContactos(String querry) {
	
		ArrayList<BeanContactos> setContactos = new ArrayList<>();
		String Tipo;	               
		String Telefono;	               
		String Pais;	               
		String Extension;	             
		String Email;		             
		String CUC;	             
		String Contacto;	               
		String Codigo;           
		String Celular;
		
	
		ContactosSEGProxy proxy = new ContactosSEGProxy();
	
		RetrieveContactosSEGRequest request = new RetrieveContactosSEGRequest();
		ContactosSEGModelType model = new ContactosSEGModelType();
		ContactosSEGInstanceType instance = new ContactosSEGInstanceType();
		ContactosSEGKeysType key = new ContactosSEGKeysType();
		ContactosSEGKeysType[] keysArray = new ContactosSEGKeysType[1];
		RetrieveContactosSEGListResponse response;
		
		
		key.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(key);
		request.setModel(model);
		keysArray[0] = key;
		
		try {		
			
			response = proxy.retrieveContactosSEGList(keysArray);
		
			if (response.getMessage().toString().equals("Correcto"))
			{
			
				for (int i =0 ; i< response.getInstance().length ; i++)
				{
					BeanContactos bean = new BeanContactos();
					Tipo ="";	               
					Telefono ="";	               
					Pais ="";	               
					Extension ="";	             
					Email ="";		             
					CUC ="";	             
					Contacto ="";	               
					Codigo ="";           
					Celular ="";
					
					if(response.getInstance(i).getCelular()!=null)
						Celular = response.getInstance(i).getCelular().toString();
					if(response.getInstance(i).getCodigo()!=null)
						Codigo = response.getInstance(i).getCodigo().toString();
					if(response.getInstance(i).getContacto()!=null)
						Contacto = response.getInstance(i).getContacto().toString();
					if(response.getInstance(i).getCUC()!=null)
						CUC	= response.getInstance(i).getCUC().toString();
					if(response.getInstance(i).getEmail()!=null)
						Email = response.getInstance(i).getEmail().toString();
					if(response.getInstance(i).getExtension()!=null)
						Extension = response.getInstance(i).getExtension().toString();
					if(response.getInstance(i).getPais()!=null)
						Pais = response.getInstance(i).getPais().toString();
					if(response.getInstance(i).getTelefono()!=null)
						Telefono = response.getInstance(i).getTelefono().toString();
					if(response.getInstance(i).getTipo()!=null)
						Tipo = response.getInstance(i).getTipo().toString();
						
					 bean.setCelular(Celular);
					 bean.setCodigo(Codigo);
					 bean.setContacto(Contacto);
					 bean.setCUC(CUC);
					 bean.setEmail(Email);
					 bean.setExtension(Extension);
					 bean.setPais(Pais);
					 bean.setTelefono(Telefono);
					 bean.setTipo(Tipo);
					 bean.setMensaje(response.getMessage().toString());
				
					 setContactos.add(bean);
				}
			}
			else
			{
				BeanContactos bean = new BeanContactos();
				 bean.setMensaje(response.getMessage().toString());
				 setContactos.add(bean);	
			}
				
		} catch (RemoteException e) 
		{
			BeanContactos bean = new BeanContactos();
			 bean.setMensaje("Error");
			 setContactos.add(bean);		
		}
		
		return setContactos;
		
	}
	
	private String getCadena (Object cadena)
	{
		if (cadena!=null) {
	
			return cadena.toString();
		}
		else
			return "";
	}
	
	public  BeanContactos createContacto(BeanContactos obj) 
	{
		ContactosSEGProxy proxy = new ContactosSEGProxy();		
		CreateContactosSEGRequest request = new CreateContactosSEGRequest();
		BeanContactos bean = new BeanContactos();
		
		StringType Tipo = new StringType();	               
		StringType Telefono = new StringType();	               
		StringType Pais = new StringType();	               
		StringType Extension = new StringType();	             
		StringType Email = new StringType();		             
		StringType CUC = new StringType();	             
		StringType Contacto = new StringType();	               
		StringType Codigo = new StringType();           
		StringType Celular = new StringType();
		
	
		ContactosSEGModelType model = new ContactosSEGModelType();		
		ContactosSEGInstanceType instance = new ContactosSEGInstanceType();
		ContactosSEGKeysType key = new ContactosSEGKeysType();		
		CreateContactosSEGResponse response;
		
		Celular.set_value(getCadena( obj.getCelular() ));
		Codigo.set_value(getCadena( obj.getCodigo() ));
		Contacto.set_value(getCadena( obj.getContacto() ));
		CUC.set_value(getCadena( obj.getCUC() ));
		Email.set_value(getCadena( obj.getEmail() ));
		Extension.set_value(getCadena( obj.getExtension() ));
		Pais.set_value(getCadena( obj.getPais() ));
		Telefono.set_value(getCadena( obj.getTelefono() ));
		Tipo.set_value(getCadena( obj.getTipo() ));
	
		instance.setCelular(Celular);
		instance.setCodigo(Codigo);
		instance.setContacto(Contacto);
		instance.setCUC(CUC);
		instance.setEmail(Email);
		instance.setExtension(Extension);
		instance.setPais(Pais);
		instance.setTelefono(Telefono);
		instance.setTipo(Tipo);
		
		model.setInstance(instance);
		model.setKeys(key);
		request.setModel(model);
		

			
		try {
			
				response = proxy.createContactosSEG(request);
				bean.setCelular(getCadena( response.getModel().getInstance().getCelular() ));  
				bean.setCodigo(getCadena( response.getModel().getInstance().getCodigo() ));   
				bean.setContacto(getCadena( response.getModel().getInstance().getContacto() )); 
				bean.setCUC(getCadena( response.getModel().getInstance().getCUC() ));      
				bean.setEmail(getCadena( response.getModel().getInstance().getEmail() ));    
				bean.setExtension(getCadena( response.getModel().getInstance().getExtension() ));
				bean.setPais(getCadena( response.getModel().getInstance().getPais() ));     
				bean.setTelefono(getCadena( response.getModel().getInstance().getTelefono() )); 
				bean.setTipo(getCadena( response.getModel().getInstance().getTipo() ));   
		
		} catch (RemoteException e) {
			
			bean.setContacto("ERROR"); 
		
		}
			
	return bean;
	}
	
	
	public  BeanContactos updateContacto(String querry ,BeanContactos obj) 
	{
		ContactosSEGProxy proxy = new ContactosSEGProxy();		
		UpdateContactosSEGRequest request = new UpdateContactosSEGRequest();
		BeanContactos bean = new BeanContactos();
		
		StringType Tipo = new StringType();	               
		StringType Telefono = new StringType();	               
		StringType Pais = new StringType();	               
		StringType Extension = new StringType();	             
		StringType Email = new StringType();		             
		StringType CUC = new StringType();	             
		StringType Contacto = new StringType();	               
		StringType Codigo = new StringType();           
		StringType Celular = new StringType();
		/*StringType keyCUC = new StringType();
		StringType keyTipo = new StringType();
		StringType keyContacto = new StringType();*/
		
		
		
	
		ContactosSEGModelType model = new ContactosSEGModelType();		
		ContactosSEGInstanceType instance = new ContactosSEGInstanceType();
		ContactosSEGKeysType key = new ContactosSEGKeysType();		
		UpdateContactosSEGResponse response;
		
		/*keyCUC.set_value(pCUC);
		keyTipo.set_value(pTipo);
		keyContacto.set_value(pContacto);
		
		key.setCUC(keyCUC);
		key.setTipo(keyTipo);
		key.setContacto(keyContacto);*/
		key.setQuery(querry);
		Celular.set_value(getCadena( obj.getCelular() ));
		Codigo.set_value(getCadena( obj.getCodigo() ));
		Contacto.set_value(getCadena( obj.getContacto() ));
		CUC.set_value(getCadena( obj.getCUC() ));
		Email.set_value(getCadena( obj.getEmail() ));
		Extension.set_value(getCadena( obj.getExtension() ));
		Pais.set_value(getCadena( obj.getPais() ));
		Telefono.set_value(getCadena( obj.getTelefono() ));
		Tipo.set_value(getCadena( obj.getTipo() ));
	
		instance.setCelular(Celular);
		instance.setCodigo(Codigo);
		instance.setContacto(Contacto);
		instance.setCUC(CUC);
		instance.setEmail(Email);
		instance.setExtension(Extension);
		instance.setPais(Pais);
		instance.setTelefono(Telefono);
		instance.setTipo(Tipo);
		
		model.setInstance(instance);
		model.setKeys(key);
		request.setModel(model);
		

			
		try {
	
				response = proxy.updateContactosSEG(request);
				bean.setCelular(getCadena( response.getModel().getInstance().getCelular() ));  
				bean.setCodigo(getCadena( response.getModel().getInstance().getCodigo() ));   
				bean.setContacto(getCadena( response.getModel().getInstance().getContacto() )); 
				bean.setCUC(getCadena( response.getModel().getInstance().getCUC() ));      
				bean.setEmail(getCadena( response.getModel().getInstance().getEmail() ));    
				bean.setExtension(getCadena( response.getModel().getInstance().getExtension() ));
				bean.setPais(getCadena( response.getModel().getInstance().getPais() ));     
				bean.setTelefono(getCadena( response.getModel().getInstance().getTelefono() )); 
				bean.setTipo(getCadena( response.getModel().getInstance().getTipo() ));   
		
		} catch (RemoteException e) {
			
			bean.setContacto("ERROR"); 
		
		}
			
	return bean;
	}
	
	
}