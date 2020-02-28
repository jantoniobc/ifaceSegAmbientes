package com.lib.cont;

import java.rmi.RemoteException;
import java.util.ArrayList;

import com.hp.schemas.SM._7.RetrieveSegTmxCaseServEmpExtListResponse;
import com.hp.schemas.SM._7.RetrieveSegTmxCaseServEmpExtRequest;
import com.hp.schemas.SM._7.SegTmxCaseServEmpExtInstanceType;
import com.hp.schemas.SM._7.SegTmxCaseServEmpExtKeysType;
import com.hp.schemas.SM._7.SegTmxCaseServEmpExtModelType;
import com.hp.schemas.SM._7.SegTmxCaseServEmpExtProxy;
import com.lib.bean.SetReferencia;

public class CtrReferencia {
	
	public  ArrayList<SetReferencia>  getSetReferencia (String querry)
	{
		ArrayList<SetReferencia> setreferencias ;
		setreferencias = new ArrayList<>();
		
		SegTmxCaseServEmpExtProxy px = new SegTmxCaseServEmpExtProxy();
		RetrieveSegTmxCaseServEmpExtRequest req = new RetrieveSegTmxCaseServEmpExtRequest();
		SegTmxCaseServEmpExtModelType model = new SegTmxCaseServEmpExtModelType();
		SegTmxCaseServEmpExtInstanceType instance = new SegTmxCaseServEmpExtInstanceType();
		SegTmxCaseServEmpExtKeysType[] keysArray  = new SegTmxCaseServEmpExtKeysType[1];
		SegTmxCaseServEmpExtKeysType keys  = new SegTmxCaseServEmpExtKeysType();
		
		keys.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(keys);
		req.setModel(model);
		
		RetrieveSegTmxCaseServEmpExtListResponse resp;
		
		
		String Refsisa="";
		String Cucemp="";
		String FolioServ="";
		String Cliente="";
		String FamServRep="";
		String EntpuntaA ="";
		String EntpuntaB ="";
		String DomicilioA ="";
		String DomicilioB ="";
		String Empresa ="";
		
		keysArray[0] = keys;
		
		try {
			
			System.out.println("Consulta Servicios :  " + px.getEndpoint() );
			resp = px.retrieveSegTmxCaseServEmpExtList(keysArray);
			System.out.println(" Response Consulta Servicios :  "  );
			if (resp.getMessage().toString().equals("Correcto"))
			{
				System.out.println(" No.Servicios :  " + resp.getInstance().length  );
				for (int i =0 ; i< resp.getInstance().length ; i++)
				{
					SetReferencia stref = new SetReferencia ();
					 Refsisa="";
					 Cucemp="";
					 FolioServ="";
					 Cliente="";
					 FamServRep="";
					 EntpuntaA ="";
					 EntpuntaB ="";
					 DomicilioA ="";
					 DomicilioB ="";
					 Empresa ="";
					
					 stref.setMensaje("Correcto"); 
					 if (resp.getInstance(i).getRefsisa()!=null)
						 Refsisa =  resp.getInstance(i).getRefsisa().toString();
					 if (resp.getInstance(i).getCucemp()!= null)
						 Cucemp= resp.getInstance(i).getCucemp().toString();
					 if (resp.getInstance(i).getFolioserv()!= null)
						 FolioServ= resp.getInstance(i).getFolioserv().toString();
					if (resp.getInstance(i).getCliente()!= null)
						 Cliente = resp.getInstance(i).getCliente().toString();
					 if (resp.getInstance(i).getFamservrep()!= null)
						 FamServRep = resp.getInstance(i).getFamservrep().toString();
					 if ( resp.getInstance(i).getEntpuntaa()!= null)
						 EntpuntaA = resp.getInstance(i).getEntpuntaa().toString();
					 if ( resp.getInstance(i).getEbtpuntab()!= null)
						 EntpuntaB = resp.getInstance(i).getEbtpuntab().toString();
					 if ( resp.getInstance(i).getDomicilioa()!= null)  
						 DomicilioA = resp.getInstance(i).getDomicilioa().toString();
					 if ( resp.getInstance(i).getDomiciliob()!= null)
						 DomicilioB = resp.getInstance(i).getDomiciliob().toString();
					 if ( resp.getInstance(i).getClientefinalrsocial()!=null)
						 Empresa = resp.getInstance(i).getClientefinalrsocial().toString();
					 
					stref.setReferencia(Refsisa);
					stref.setCUCEmpresarial(Cucemp);
					stref.setFolio(FolioServ);
					stref.setCliente(Cliente);
					stref.setFamilia(FamServRep);
					stref.setPuntas(EntpuntaA +"/"+ EntpuntaB);
					stref.setDomicilio( DomicilioA+"/"+ DomicilioB);
					stref.setEmpresa(Empresa);
			
					setreferencias.add(stref);
				}
			}
			else {
				SetReferencia stref = new SetReferencia ();
				stref.setMensaje("No encontramos información en nuestra lista de servicios ...");			
				setreferencias.add(stref);
			}
			
		} catch (RemoteException e) 
		{

			SetReferencia stref = new SetReferencia ();
			stref.setMensaje("Error");			
			setreferencias.add(stref);
		}
			
		return setreferencias ;
	}
	

}
