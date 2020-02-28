package segIface.ServiceSeg;

import java.util.ArrayList;
import com.lib.bean.BeanCatCaoOpcDpcIp;
import com.lib.cont.ctrCatCaoOpcDpcIp;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("ips")
public class WSCatCaoOpcDpcIp {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<BeanCatCaoOpcDpcIp> 
    getCatCaoEmpresa (@QueryParam("querry")  String querry)
    {
		ctrCatCaoOpcDpcIp ctrl = new ctrCatCaoOpcDpcIp ();
		
		return ctrl. getCatCaoOpcDpcIp(querry);
    }	
}
