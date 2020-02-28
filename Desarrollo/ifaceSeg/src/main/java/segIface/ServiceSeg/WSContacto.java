package segIface.ServiceSeg;


import java.util.ArrayList;
import com.lib.bean.BeanContactos;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.lib.cont.CtrContacto;
import javax.ws.rs.POST;



@Path("contacto")
public class WSContacto {

	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<BeanContactos>  
    getGridContactos (@QueryParam("querry")  String querry)
    {
		CtrContacto ctrl = new CtrContacto ();
		
		return ctrl.getContactos(querry);
    }
	
	
	@POST
	@Consumes (MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public BeanContactos 
    setCreateContacto (BeanContactos objt)
    {
		CtrContacto ctrl = new CtrContacto ();
		BeanContactos bean  = ctrl.createContacto(objt);
		return bean;
    }
	
	@PATCH
	@Consumes (MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public BeanContactos 
    setUpdateContacto ( @QueryParam("querry")  String querry,BeanContactos objt )
    {

	
		BeanContactos bean  = new BeanContactos();
		
		CtrContacto ctrl = new CtrContacto ();
	
		bean = ctrl.updateContacto(querry, objt);
		
		return bean;
    }
	
	
}
