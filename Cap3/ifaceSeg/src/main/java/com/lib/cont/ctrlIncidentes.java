package com.lib.cont;

import java.rmi.RemoteException;

import com.hp.schemas.SM._7.IncidenteSP_SEGInstanceType;
import com.hp.schemas.SM._7.IncidenteSP_SEGModelType;
import com.hp.schemas.SM._7.IncidenteSP_SEGProxy;
import com.hp.schemas.SM._7.RetrieveContactosSEGListResponse;
import com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGKeysListRequest;
import com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGListResponse;
import com.hp.schemas.SM._7.RetrieveIncidenteSP_SEGRequest;
import com.hp.schemas.SM._7.IncidenteSP_SEGKeysType;

public class ctrlIncidentes {

	public ctrlIncidentes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  {
		
		String querry = "incident.id=\"SDC00004288\""; 		
		
		IncidenteSP_SEGProxy px = new IncidenteSP_SEGProxy();
		RetrieveIncidenteSP_SEGRequest req = new RetrieveIncidenteSP_SEGRequest();
		//RetrieveContactosSEGRequest
		IncidenteSP_SEGModelType model = new IncidenteSP_SEGModelType();		
		IncidenteSP_SEGInstanceType instance = new IncidenteSP_SEGInstanceType();		
		IncidenteSP_SEGKeysType[] keysArray  = new IncidenteSP_SEGKeysType[1];
		IncidenteSP_SEGKeysType keys  = new IncidenteSP_SEGKeysType();
		RetrieveIncidenteSP_SEGListResponse resp;

		keys.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(keys);
		req.setModel(model);		
		keysArray[0]= keys;
		
		
		
		try {
			resp = px.retrieveIncidenteSP_SEGList(keysArray);
			
			System.out.println("Responde el servidor");
			
			System.out.println(resp.getMessage()+ resp.getStatus());
			
			System.out.println("el resultadpo arrojo "+ resp.getInstance().length +" elementos");
			
		
		//	System.out.println(resp.getInstance(0).getProblemaReportado() + " "+ resp.getInstance(0).getNumber());
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
