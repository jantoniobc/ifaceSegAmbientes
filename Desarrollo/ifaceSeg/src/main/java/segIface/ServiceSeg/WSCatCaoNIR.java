package segIface.ServiceSeg;

import java.util.ArrayList;
import com.lib.bean.BeanCatCaoNIR;
import com.lib.cont.ctrCatCaoNIR;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("ciudad")
public class WSCatCaoNIR {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<BeanCatCaoNIR> 
    getCatCaoEmpresa (@QueryParam("querry")  String querry)
    {
		ctrCatCaoNIR ctrl = new ctrCatCaoNIR ();
		
		return ctrl. getCatCaoNIR(querry);
    }	
}
