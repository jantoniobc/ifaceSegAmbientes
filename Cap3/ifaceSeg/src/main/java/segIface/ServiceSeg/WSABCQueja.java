package segIface.ServiceSeg;

import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.lib.bean.BeanABCQueja;
import com.lib.cont.ctrABCQuejas;
import com.sp.mx.sm.ws.InterfazSIPOProxy;

@Path("abcquejas")
public class WSABCQueja {
	
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	public BeanABCQueja abcQuejas(@QueryParam("mov")  String movimiento, @QueryParam("param") String parameters) 
	{
		 
		
		System.out.println("movimiento " + movimiento );
		System.out.println("*************************************************************");
		System.out.println("REQUEST " );
		System.out.println( parameters );
		 
		 InterfazSIPOProxy px = new InterfazSIPOProxy();
		 BeanABCQueja bean = new BeanABCQueja();
		 ctrABCQuejas ctrlabcqueja =  new ctrABCQuejas();
		 String resp ="";
		 String CodigoDeRespuesta=""; 
		 String  FechaDeRespuesta ="";
		 String DescripcionDelError ="";
		 String EstadoGeneralDeLaQueja ="";
		 String IdentificadorDeQueja ="";		 
		 String IdCorrelacion ="";
		 
		 

		
		 try {
		
		 		resp = px.abcQuejas(movimiento,parameters);
		 		
		 		System.out.println("*************************************************************");
				System.out.println("RESPONSE " );
		 		System.out.println( resp );
			
				CodigoDeRespuesta = ctrlabcqueja.getCadena ( resp,"<CodigoDeRespuesta>","</CodigoDeRespuesta>" );

				FechaDeRespuesta = ctrlabcqueja.getCadena ( resp,"<FechaDeRespuesta>" , "</FechaDeRespuesta>");

				IdCorrelacion  = ctrlabcqueja.getCadena ( resp,"<IdCorrelacion>" , "</IdCorrelacion>");

				if(!CodigoDeRespuesta.equals( "10000"))
				{
					DescripcionDelError = ctrlabcqueja.getCadena ( resp,"<DescripcionDelError>" , "</DescripcionDelError>");

				}
				if(CodigoDeRespuesta.equals( "10000"))
				{
				EstadoGeneralDeLaQueja = ctrlabcqueja.getCadena ( resp,"<EstadoGeneralDeLaQueja>","</EstadoGeneralDeLaQueja>");
			
				IdentificadorDeQueja = ctrlabcqueja.getCadena ( resp,"<IdentificadorDeQueja>" , "</IdentificadorDeQueja>");

				}
		
				bean.setCodigoDeRespuesta(CodigoDeRespuesta);
				bean.setEstadoGeneralDeLaQueja(EstadoGeneralDeLaQueja);
				bean.setFechaDeRespuesta(FechaDeRespuesta);
				bean.setIdCorrelacion(IdCorrelacion);
				bean.setIdentificadorDeQueja(IdentificadorDeQueja);
				bean.setDescripcionDelError(DescripcionDelError);
			}
		 catch (RemoteException e) {
			 bean.setCodigoDeRespuesta("-10000");
			 bean.setDescripcionDelError("Ha ocurrido un error interno. Por favor intenta la operación más tarde");
			 e.printStackTrace();
		 }		 
		 
		 return bean;
}

}
