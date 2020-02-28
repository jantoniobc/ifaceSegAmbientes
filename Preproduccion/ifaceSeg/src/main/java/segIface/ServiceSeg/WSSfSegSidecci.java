package segIface.ServiceSeg;

import java.util.ArrayList;
import com.lib.bean.BeanSfSegSidecci;
import com.lib.cont.ctrSfSegSidecci;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("sidecci")
public class WSSfSegSidecci {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<BeanSfSegSidecci> 
    getSfSegSidecci (@QueryParam("cuc")  String querry, @QueryParam("numero")String numero)
    {
		ctrSfSegSidecci ctrl = new ctrSfSegSidecci ();
		
		return ctrl. getSfSegSidecci(querry,numero);
    }	
}
