package com.prueba;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Hello world!
 *
 */
@Path("prueba")
public class App 
{
   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "vamos!";
    }




}
