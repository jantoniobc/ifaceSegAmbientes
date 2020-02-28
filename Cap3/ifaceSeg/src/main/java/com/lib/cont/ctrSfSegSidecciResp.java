package com.lib.cont;

import java.rmi.RemoteException;
import java.util.ArrayList;

import com.hp.schemas.SM._7.RetrievetmxsfsegsidecciListResponse;
import com.hp.schemas.SM._7.RetrievetmxsfsegsidecciRequest;
import com.hp.schemas.SM._7.TmxsfsegsidecciInstanceType;
import com.hp.schemas.SM._7.TmxsfsegsidecciKeysType;
import com.hp.schemas.SM._7.TmxsfsegsidecciModelType;
import com.hp.schemas.SM._7.TmxsfsegsidecciProxy;
import com.lib.bean.BeanSfSegSidecciResp;

public class ctrSfSegSidecciResp {

	public  ArrayList<BeanSfSegSidecciResp> getSfSegSidecci(String querry) {
		
		ArrayList<BeanSfSegSidecciResp> setSfSegSidecci = new ArrayList<>();
		
		 Number NoNal;
		 String ClliSist;
		 Number Cvecensal;
		 String Red;
		 String Estado;
		 String Central;
		 String DirDiv;
		 String Edificio;
		 String Host;
		 Number Asl;
		 String PC;
		 String TE;
		 Number CL;
		 Number Serie;
		 Number NumIni;
		 Number NumFin;
		 Number TN;
		 String Id;
		 String Status;
		 String Idesp;
		 String Ts;
		 String Obser;
		 Number Ido;
		 Number Ida;
		 String TSer;
		 String IdDiv;
		 String IdTNum;
		 String TClli;
		 String FolioPlan;
		 String Compania;
		 String SiglasPis;
		 Number Dpc;
		 String Tecnologia;
		 Number IdCia;
		
			TmxsfsegsidecciProxy proxy = new TmxsfsegsidecciProxy();	
			RetrievetmxsfsegsidecciRequest request = new RetrievetmxsfsegsidecciRequest();
			TmxsfsegsidecciModelType model = new TmxsfsegsidecciModelType();
			TmxsfsegsidecciInstanceType instance = new TmxsfsegsidecciInstanceType();
			TmxsfsegsidecciKeysType key = new TmxsfsegsidecciKeysType();
			TmxsfsegsidecciKeysType[] keysArray = new TmxsfsegsidecciKeysType[1];
			RetrievetmxsfsegsidecciListResponse response;
		
		key.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(key);
		request.setModel(model);
		keysArray[0] = key;
		
		try {		
			
			response = proxy.retrievetmxsfsegsidecciList(keysArray);
		
			if (response.getMessage().toString().equals("Correcto"))
			{
			
				for (int i =0 ; i< response.getInstance().length ; i++)
				{
					BeanSfSegSidecciResp bean = new BeanSfSegSidecciResp();
					
					  NoNal = null;
					  ClliSist = "";
					  Cvecensal = null;
					  Red = "";
					  Estado = "";
					  Central = "";
					  DirDiv = "";
					  Edificio = "";
					  Host = "";
					  Asl = null;
					  PC = "";
					  TE = "";
					  CL = null;
					  Serie = null;
					  NumIni = null;
					  NumFin = null;
					  TN = null;
					  Id = "";
					  Status = "";
					  Idesp = "";
					  Ts = "";
					  Obser = "";
					  Ido = null;
					  Ida = null;
					  TSer = "";
					  IdDiv = "";
					  IdTNum = "";
					  TClli = "";
					  FolioPlan = "";
					  Compania = "";
					  SiglasPis = "";
					  Dpc = null;
					  Tecnologia = "";
					  IdCia = null;
					
					  
						if(response.getInstance(i).getTmxsfsegNoNal() !=null)
							NoNal = response.getInstance(i).getTmxsfsegNoNal().get_value();
						if(response.getInstance(i).getTmxsfsegClliSist() !=null)
							ClliSist = response.getInstance(i).getTmxsfsegClliSist().toString();
						if(response.getInstance(i).getTmxsfsegCvecensal() !=null)
							Cvecensal = response.getInstance(i).getTmxsfsegCvecensal().get_value();
						if(response.getInstance(i).getTmxsfsegRed() !=null)
							Red = response.getInstance(i).getTmxsfsegRed().toString();
						if(response.getInstance(i).getTmxsfsegEstado() !=null)
						   	Estado = response.getInstance(i).getTmxsfsegEstado().toString();
						if(response.getInstance(i).getTmxsfsegCentral() !=null)
						    Central = response.getInstance(i).getTmxsfsegCentral().toString();
						if(response.getInstance(i).getTmxsfsegDirDiv() !=null)
							DirDiv = response.getInstance(i).getTmxsfsegDirDiv().toString();
						if(response.getInstance(i).getTmxsfsegEdificio() !=null)
							Edificio = response.getInstance(i).getTmxsfsegEdificio().toString();
						if(response.getInstance(i).getTmxsfsegHost() !=null)
							Host = response.getInstance(i).getTmxsfsegHost().toString();
						if(response.getInstance(i).getTmxsfsegAsl() !=null)
							Asl = response.getInstance(i).getTmxsfsegAsl().get_value();
						if(response.getInstance(i).getTmxsfsegPC() !=null)
							PC = response.getInstance(i).getTmxsfsegPC().toString();
						if(response.getInstance(i).getTmxsfsegTE() !=null)
							TE = response.getInstance(i).getTmxsfsegTE().toString();
						if(response.getInstance(i).getTmxsfsegCL() !=null)
							CL = response.getInstance(i).getTmxsfsegCL().get_value();
						if(response.getInstance(i).getTmxsfsegSerie() !=null)
							Serie = response.getInstance(i).getTmxsfsegSerie().get_value();
						if(response.getInstance(i).getTmxsfsegNumIni() !=null)
							NumIni = response.getInstance(i).getTmxsfsegNumIni().get_value();
						if(response.getInstance(i).getTmxsfsegNumFin() !=null)
							NumFin = response.getInstance(i).getTmxsfsegNumFin().get_value();
						if(response.getInstance(i).getTmxsfsegTN() !=null)
							TN = response.getInstance(i).getTmxsfsegTN().get_value();
						if(response.getInstance(i).getTmxsfsegId() !=null)
							Id = response.getInstance(i).getTmxsfsegId().toString();
						if(response.getInstance(i).getTmxsfsegStatus() !=null)
							Status = response.getInstance(i).getTmxsfsegStatus().toString();
						if(response.getInstance(i).getTmxsfsegIdesp() !=null)
							Idesp = response.getInstance(i).getTmxsfsegIdesp().toString();
						if(response.getInstance(i).getTmxsfsegTS() !=null)
							Ts = response.getInstance(i).getTmxsfsegTS().toString();
						if(response.getInstance(i).getTmxsfsegObser() !=null)
							Obser = response.getInstance(i).getTmxsfsegObser().toString();
						if(response.getInstance(i).getTmxsfsegIdo() !=null)
							Ido = response.getInstance(i).getTmxsfsegIdo().get_value();
						if(response.getInstance(i).getTmxsfsegIda() !=null)
							Ida = response.getInstance(i).getTmxsfsegIda().get_value();
						if(response.getInstance(i).getTmxsfsegTSer() !=null)
							TSer = response.getInstance(i).getTmxsfsegTSer().toString();
						if(response.getInstance(i).getTmxsfsegIdDiv() !=null)
							IdDiv = response.getInstance(i).getTmxsfsegIdDiv().toString();
						if(response.getInstance(i).getTmxsfsegIdTNum() !=null)
							IdTNum = response.getInstance(i).getTmxsfsegIdTNum().toString();
						if(response.getInstance(i).getTmxsfsegTClli() !=null)
							TClli = response.getInstance(i).getTmxsfsegTClli().toString();
						if(response.getInstance(i).getTmxsfsegFolioPlan() !=null)
							FolioPlan = response.getInstance(i).getTmxsfsegFolioPlan().toString();
						if(response.getInstance(i).getTmxsfsegCompania() !=null)
							Compania = response.getInstance(i).getTmxsfsegCompania().toString();
						if(response.getInstance(i).getTmxsfsegSiglasPis() !=null)
							SiglasPis = response.getInstance(i).getTmxsfsegSiglasPis().toString();
						if(response.getInstance(i).getTmxsfsegDpc() !=null)
							Dpc = response.getInstance(i).getTmxsfsegDpc().get_value();
						if(response.getInstance(i).getTmxsfsegTecnologia() !=null)
							Tecnologia = response.getInstance(i).getTmxsfsegTecnologia().toString();
						if(response.getInstance(i).getTmxsfsegIdCia() !=null)
							IdCia = response.getInstance(i).getTmxsfsegIdCia().get_value();	
					
						bean.setNoNal(NoNal);
						bean.setClliSist(ClliSist);
						bean.setCvecensal(Cvecensal);
						bean.setRed(Red);
						bean.setEstado(Estado);
						bean.setCentral(Central);
						bean.setDirDiv(DirDiv);
						bean.setEdificio(Edificio);
						bean.setHost(Host);
						bean.setAsl(Asl);
						bean.setPC(PC);
						bean.setTE(TE);
						bean.setCL(CL);
						bean.setSerie(Serie);
						bean.setNumIni(NumIni);
						bean.setNumFin(NumFin);
						bean.setTN(TN);
						bean.setId(Id);
						bean.setStatus(Status);
						bean.setIdesp(Idesp);
						bean.setTs(Ts);
						bean.setObser(Obser);
						bean.setIdo(Ido);
						bean.setIda(Ida);
						bean.setTSer(TSer);
						bean.setIdDiv(IdDiv);
						bean.setIdTNum(IdTNum);
						bean.setTClli(TClli);
						bean.setFolioPlan(FolioPlan);
						bean.setCompania(Compania);
						bean.setSiglasPis(SiglasPis);
						bean.setDpc(Dpc);
						bean.setTecnologia(Tecnologia);
						bean.setIdCia(IdCia);
						
					setSfSegSidecci.add(bean);
				}
			}
			else
			{
				BeanSfSegSidecciResp bean = new BeanSfSegSidecciResp();
				 bean.setMensaje(response.getMessage().toString());
				 setSfSegSidecci.add(bean);	
			}
				
		} catch (RemoteException e) 
		{
			BeanSfSegSidecciResp bean = new BeanSfSegSidecciResp();
			 bean.setMensaje("Error");
			 setSfSegSidecci.add(bean);		
		}	
		return setSfSegSidecci;
	}
}
