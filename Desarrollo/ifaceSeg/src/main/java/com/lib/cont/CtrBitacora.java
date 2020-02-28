package com.lib.cont;
import java.util.Date;
import java.util.TimeZone;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;

import com.lib.bean.BeanBitacora;
import com.hp.schemas.SM._7.InteraccionSPHistoryInstanceType;
import com.hp.schemas.SM._7.InteraccionSPHistoryKeysType;
import com.hp.schemas.SM._7.InteraccionSPHistoryModelType;
import com.hp.schemas.SM._7.InteraccionSPHistoryProxy;
import com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryListResponse;
import com.hp.schemas.SM._7.RetrieveInteraccionSPHistoryRequest;
import com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunListResponse;
import com.hp.schemas.SM._7.RetrieveTmxCaoBitaComunRequest;
import com.hp.schemas.SM._7.TmxCaoBitaComunInstanceType;
import com.hp.schemas.SM._7.TmxCaoBitaComunInstanceTypeComentario;
import com.hp.schemas.SM._7.TmxCaoBitaComunKeysType;
import com.hp.schemas.SM._7.TmxCaoBitaComunModelType;
import com.hp.schemas.SM._7.TmxCaoBitaComunProxy;
import com.hp.schemas.SM._7.Common.BooleanType;
import com.hp.schemas.SM._7.Common.DateTimeType;
import com.hp.schemas.SM._7.Common.DecimalType;
import com.hp.schemas.SM._7.Common.StringType;

public class CtrBitacora {

	
	public ArrayList< BeanBitacora> getBitacoras (String querry)
	{
		System.out.println("Inicia getBitacoras " + querry );
		
		ArrayList<BeanBitacora> setBitacora = new ArrayList<>();
		
		TmxCaoBitaComunProxy proxy = new TmxCaoBitaComunProxy();		
		RetrieveTmxCaoBitaComunRequest req = new RetrieveTmxCaoBitaComunRequest();		
		TmxCaoBitaComunModelType model = new TmxCaoBitaComunModelType();
		TmxCaoBitaComunInstanceType  instance = new TmxCaoBitaComunInstanceType();
		TmxCaoBitaComunKeysType[] keysArray  = new TmxCaoBitaComunKeysType[1];
		TmxCaoBitaComunKeysType keys  = new TmxCaoBitaComunKeysType();
		
		keys.setQuery(querry);
		model.setInstance(instance);
		model.setKeys(keys);
		req.setModel(model);
		RetrieveTmxCaoBitaComunListResponse resp;
		keysArray[0]=keys;

		try {
			System.out.println("En el try de  getBitacoras " );
		
			resp= proxy.retrieveTmxCaoBitaComunList(keysArray);					
					
			if (resp.getMessage().toString().equals("Correcto"))
			{	
				System.out.println("No Mensajes "+ resp.getInstance().length);
			/*	if(resp.getInstance().length == 1)
				{
					BeanBitacora bbitacora = new BeanBitacora();
					bbitacora.setMensaje("No hay mensajes");
					setBitacora.add(bbitacora);					
				}
				*/
				for (int i =0 ; i< resp.getInstance().length ; i++)
				{
				
					BeanBitacora bean = new BeanBitacora();
					
					bean.setAcuse(validabool(resp.getInstance(i).getAcuse()) );
					bean.setComentario(convierteComentarios(resp.getInstance(i).getComentario()));
					bean.setFase(validaCadena(resp.getInstance(i).getFase()));
					bean.setFecha(validaFecha(resp.getInstance(i).getFecha()) );
					bean.setFechaAcuse(validaFecha(resp.getInstance(i).getAcuseFecha()));
					bean.setGrupo(validaCadena(resp.getInstance(i).getGrupo()));
					bean.setIDEvento( validaCadena( resp.getInstance(i).getEvento() ));
					bean.setIDExterno( validaCadena(resp.getInstance(i).getIdExterno()) );
					bean.setIDRegistro(validaNumero(resp.getInstance(i).getId() ));
					bean.setMensaje("Correcto");
					bean.setNombre(validaCadena(resp.getInstance(i).getNombre()));
					bean.setTipoActualizacion(validaCadena(resp.getInstance(i).getTipoActualizacion()));
					bean.setUsuario(validaCadena(resp.getInstance(i).getUsuario()));
					bean.setUsuarioAcuse(validaCadena(resp.getInstance(i).getAcusoUsuario()));

					setBitacora.add(bean);
				}
				
				Collections.sort(setBitacora);
				
			}
			else
			{
				BeanBitacora bbitacora = new BeanBitacora();
				bbitacora.setMensaje("No hay mensajes");
				setBitacora.add(bbitacora);
			}
			
		} catch (RemoteException e) 
		{
			BeanBitacora bbitacora = new BeanBitacora();
			bbitacora.setMensaje("Error");
			setBitacora.add(bbitacora);
		}
		 //Collections.sort(setBitacora);


		return setBitacora;
	}

	private String validaFecha(DateTimeType date)
	{
		String strFecha="";
		if(date != null){
			Calendar cal = date.get_value();
			strFecha = cal.get(Calendar.DAY_OF_MONTH) +"/"+ cal.get(Calendar.MONTH)+"/"+ cal.get(Calendar.YEAR)
					+ " " + cal.get(Calendar.HOUR_OF_DAY)+ ":" +cal.get(Calendar.MINUTE) +":"+cal.get(Calendar.SECOND);
		}
		return strFecha;
	}
	
	private boolean validabool(BooleanType booleanType)
	{
		return (boolean) ((booleanType == null)? "" : booleanType.is_value());
	}
	
	private String validaNumero(DecimalType decimalType)
	{
		return (decimalType == null)?"":decimalType.toString();
	}
	
	
	private String validaCadena(StringType stringType)
	{
		return (stringType ==null)?"":stringType.toString();
	}
	
	private String[] convierteComentarios(TmxCaoBitaComunInstanceTypeComentario tmxCaoBitaComunComentario)
	{
		if (tmxCaoBitaComunComentario == null)
		{
			String[] arrayComentario = new String[1];
			arrayComentario[0] =""; 
			
			return arrayComentario;
		}else 
		{
			int NoComentarios =	tmxCaoBitaComunComentario.getComentario().length;	
			String[] arrayComentario  = new String[NoComentarios];
			
			for(int i = 0 ;i < NoComentarios ;i++ )
				arrayComentario[i] = tmxCaoBitaComunComentario.getComentario(i).toString();
			return arrayComentario;
		}
		
	}
	
	
/*	private String getFormatoFecha(com.hp.schemas.SM._7.Common.DateTimeType datetype) 
	{

		String strFecha="";
		String dateInString = datetype.toString();
		
		 SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 SimpleDateFormat formatoVista = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	     
		 try {
	        	
	        	strFecha = dateInString.replaceAll(".000Z", "");
	        	strFecha = strFecha.replace('T', ' ');	        	
	        	Date date = formato.parse(strFecha);
	     
	        	strFecha = formatoVista.format(date).toString();

	        } catch (ParseException e) {
	        	strFecha="";
	        }
		 return strFecha;
	}*/


	public ArrayList< BeanBitacora> getPruebas (String querry)
	{
		System.out.println("y el querry es : *******************  " + querry);
		ArrayList<BeanBitacora> setBitacora = new ArrayList<>();
		int divOp=0; 
		for (int i =1 ; i< 15 ; i++)
			{
				divOp=i%2;
				String[] coment = new String[1];
				coment[0]="Hola"+i;
				
				
				BeanBitacora bean = new BeanBitacora();
				
				Date objDate = new Date();
				 
				bean.setMensaje("Correcto");
				bean.setFase("Fase "+ i);
			//	bean.setFecha(objDate );
				bean.setComentario(coment);
				bean.setIDEvento( "Evento"+i);
				bean.setIDExterno( "IdExterno"+i);
				bean.setIDRegistro("Registro"+i);
				
				if (divOp==0)
				{
					bean.setAcuse(false);
					bean.setGrupo("consecionario");
					bean.setNombre("Rulo");
					bean.setUsuario("Rulo");
					bean.setTipoActualizacion("Comunicación concesionario");			
				}
				else 
				{
					bean.setAcuse(true);
					//bean.setFechaAcuse(objDate);
					bean.setUsuario("maquina");
					bean.setNombre("maquina");
					bean.setTipoActualizacion("Actualización concesionario");			
				}			
				setBitacora.add(bean);
			}
		return setBitacora;
	}


	public static void main(String[] args) {

		String querry ="id.evento= \"SDCAO-00001367\"";
		
		CtrBitacora obj = new CtrBitacora();
		ArrayList<BeanBitacora> bta = obj.getPruebas(querry);
				
	}





}
