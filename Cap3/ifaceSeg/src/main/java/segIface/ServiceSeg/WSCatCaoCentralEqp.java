package segIface.ServiceSeg;

import java.util.ArrayList;
import com.lib.bean.BeanCatCaoCentralEqp;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.lib.cont.ctrCatCaoCentralEqp;

@Path("central")
public class WSCatCaoCentralEqp {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<BeanCatCaoCentralEqp> 
    getCatCaoCentralEqp (@QueryParam("querry")  String querry)
    {
		ctrCatCaoCentralEqp ctrl = new ctrCatCaoCentralEqp ();
		
		return ctrl.getCatCaoCentralEqp(querry);
    }	
}
