package com.lib.cont;

import java.rmi.RemoteException;
import java.util.ArrayList;
import com.hp.schemas.SM._7.GetinfoSidecciEmpresaProxy;
import com.hp.schemas.SM._7.GetinfoSidecciEmpresaSmSegRequest;
import com.hp.schemas.SM._7.GetinfoSidecciEmpresaSmSegResponse;
import com.hp.schemas.SM._7.InfoSidecciEmpresaSmSegInstanceType;
import com.hp.schemas.SM._7.InfoSidecciEmpresaSmSegKeysType;
import com.hp.schemas.SM._7.InfoSidecciEmpresaSmSegModelType;
import com.hp.schemas.SM._7.Common.StringType;
import com.lib.bean.BeanSfSegSidecci;

public class ctrSfSegSidecci {

	public  ArrayList<BeanSfSegSidecci> getSfSegSidecci(String querry, String numero){
			
			@SuppressWarnings("unused")
			ArrayList<BeanSfSegSidecci> setSfSegSidecci = new ArrayList<>();
			
			System.out.println("entra a consultar sidecci  empresa : " + querry );
			System.out.println("entra a consultar sidecci  numero : " + numero );
			
			GetinfoSidecciEmpresaProxy px =  new GetinfoSidecciEmpresaProxy();
			GetinfoSidecciEmpresaSmSegRequest request = new GetinfoSidecciEmpresaSmSegRequest();
			InfoSidecciEmpresaSmSegModelType model = new InfoSidecciEmpresaSmSegModelType ();		
			InfoSidecciEmpresaSmSegKeysType keys = new InfoSidecciEmpresaSmSegKeysType ();
			InfoSidecciEmpresaSmSegInstanceType instance = new InfoSidecciEmpresaSmSegInstanceType();
			
			System.out.println("se crea el proxy y se obtiene el request");
			
			StringType query = new StringType();
			query.set_value(querry);
			StringType referencia = new StringType();
			referencia.set_value(numero);
			query.set_value(querry);
			//keys.setQuery(query);
			instance.setReferencia(referencia);
			instance.setQuery(query);
			model.setKeys(keys);
			model.setInstance(instance);		
			request.setModel(model);
			
			try {		
				GetinfoSidecciEmpresaSmSegResponse resp = px.getinfoSidecciEmpresaSmSeg(request);

				if (resp.getMessage().equals( "Correcto"))
				{ System.out.println("se prepara el envío" );
					for (int i =1 ; i< resp.getModel().getInstance().getConsultaResultado().getConsultaResultado().length;i++)
					{	
						System.out.println("Hace la consulta");
						String[] arrResult = resp.getModel().getInstance().getConsultaResultado().getConsultaResultado(i).toString().split("\\|"); 
						
						System.out.println("la consulta es " + i +" " + resp.getModel().getInstance().getConsultaResultado().getConsultaResultado(i).toString());
						
						BeanSfSegSidecci bean = new BeanSfSegSidecci();
						
						System.out.println("Se empieza a llenar el bean");
						
						bean.setNoNal(getValor(arrResult[0]));
						bean.setClliSist(getValor(arrResult[1]));
						bean.setCvecensal(getValor(arrResult[2]));
						bean.setRed(getValor(arrResult[3]));
						bean.setEstado(getValor(arrResult[4]));
						bean.setCentral(getValor(arrResult[5]));
						bean.setDirDiv(getValor(arrResult[6]));
						bean.setEdificio(getValor(arrResult[7]));
						bean.setHost(getValor(arrResult[8]));
						bean.setAsl(getValor(arrResult[9]));
						bean.setPC(getValor(arrResult[10]));
						bean.setTE(getValor(arrResult[11]));
						bean.setCL(getValor(arrResult[12]));
						bean.setSerie(getValor(arrResult[13]));
						bean.setNumIni(getValor(arrResult[14]));
						bean.setNumFin(getValor(arrResult[15]));
						bean.setTN(getValor(arrResult[16]));
						bean.setId(getValor(arrResult[17]));
						bean.setStatus(getValor(arrResult[18]));
						bean.setIdesp(getValor(arrResult[19]));
						bean.setTs(getValor(arrResult[20]));
						bean.setObser(getValor(arrResult[21]));
						bean.setIdo(getValor(arrResult[22]));
						bean.setIda(getValor(arrResult[23]));
						bean.setTSer(getValor(arrResult[24]));
						bean.setIdDiv(getValor(arrResult[25]));
						bean.setIdTNum(getValor(arrResult[26]));
						bean.setTClli(getValor(arrResult[27]));
						bean.setFolioPlan(getValor(arrResult[28]));
						bean.setCompania(getValor(arrResult[29]));
						bean.setSiglasPis(getValor(arrResult[30]));
						bean.setDpc(getValor(arrResult[31]));
						bean.setTecnologia(getValor(arrResult[32]));
						bean.setIdCia(getValor(arrResult[33]));
						bean.setEmpresa(getValor(arrResult[34]));
						bean.setValidacion(getValor(arrResult[35]));
						bean.setMensaje("Correcto");
						setSfSegSidecci.add(bean);
						System.out.println("Se lleno el bean");
					}	
				}else{
					
						for (int i =1 ; i< resp.getModel().getInstance().getConsultaResultado().getConsultaResultado().length;i++)
						{	
							String error = resp.getModel().getInstance().getConsultaResultado().getConsultaResultado(i).toString();
						
							System.out.println("Error de consulta" );
							BeanSfSegSidecci bean1 = new BeanSfSegSidecci();
							
							bean1.setMensaje("No se encontro información relacionada - "+ error);
							System.out.println("Se lleno con error " + error);
							setSfSegSidecci.add(bean1);	
						}
					}
			}catch (RemoteException e){
					BeanSfSegSidecci bean = new BeanSfSegSidecci();
					bean.setMensaje("ERROR no se encontro información relacionada");
					System.out.println("Se lleno el bean del catch");
					setSfSegSidecci.add(bean);	
			}
		return setSfSegSidecci;
	}
	private String getValor(String propiedad)
	{
		String valor ="";
		String[] arrPropiedad = propiedad.split(":");
		valor = arrPropiedad[1].toString().replaceAll("^[ \t]+|[ \t]+$", "");
		
		if (valor.equals("null") )
			valor ="";
	
		return valor;
	}
}