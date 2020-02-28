package segIface.ServiceSeg;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.lib.bean.BeanQueja;
import com.lib.cont.CtrQueja;

@Path("consultaqueja")
public class WSQueja {

	
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	public ArrayList<BeanQueja> validaQueja(@QueryParam("querry") String querry )
	{
	
		CtrQueja queja = new CtrQueja();		
		ArrayList<BeanQueja> Quejas = queja.getQuejas(querry);		
		
		return Quejas;
	}
}
