package segIface.ServiceSeg;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.lib.bean.SetReferencia;
import com.lib.cont.CtrReferencia;


@Path("referencia")
public class WSReferencia {

	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public ArrayList<SetReferencia>  
	    getGrid (@QueryParam("querry")  String querry)
	    {
		 System.out.println("Inicia la consulta de servicios "+ querry );
	    	ArrayList<SetReferencia> set ;
	    	CtrReferencia ctr = new CtrReferencia();
	    	set =  ctr.getSetReferencia( querry );
	    	
	    	return	set;
	    }
}
