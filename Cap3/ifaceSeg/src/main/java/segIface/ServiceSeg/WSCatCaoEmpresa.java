package segIface.ServiceSeg;

import java.util.ArrayList;
import com.lib.bean.BeanCatCaoEmpresa;
import com.lib.cont.ctrCatCaoEmpresa;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("operador")
public class WSCatCaoEmpresa {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<BeanCatCaoEmpresa> 
    getCatCaoEmpresa (@QueryParam("querry")  String querry)
    {
		ctrCatCaoEmpresa ctrl = new ctrCatCaoEmpresa ();
		
		return ctrl. getCatCaoEmpresa(querry);
    }	
}
