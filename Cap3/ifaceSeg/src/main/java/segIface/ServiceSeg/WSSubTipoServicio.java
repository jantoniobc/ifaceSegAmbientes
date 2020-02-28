package segIface.ServiceSeg;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.lib.bean.BeanSubtipoServicio;
import com.lib.cont.CtrSubtipoServicio;


@Path("subtiposervicio")
public class WSSubTipoServicio {

	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public ArrayList<BeanSubtipoServicio> getSubtiposServicios (@QueryParam("subtiposerv")  String subtiposerv)
	{
		CtrSubtipoServicio ctr = new CtrSubtipoServicio();
		
		return ctr.getSubtipoServicio(subtiposerv);
		
	}
	
	
	
	
	
}
