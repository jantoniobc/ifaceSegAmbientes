package segIface.ServiceSeg;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.lib.cont.CtrBitacora;
import com.lib.bean.BeanBitacora;;


@Path("bitacora")
public class WSBitacora {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
	public ArrayList< BeanBitacora> getBitacora (@QueryParam("querry") String querry)
	{
	  System.out.println("Inicia el ws de busqueda de la bitacora " + querry );
		ArrayList<BeanBitacora> setBitacora = new ArrayList<>();
		CtrBitacora bitacora = new CtrBitacora ();
		  System.out.println("WS ctrl");
		setBitacora = bitacora.getBitacoras(querry);
		//setBitacora = bitacora.getPruebas(querry);
		return setBitacora;

	}
	
	
}
