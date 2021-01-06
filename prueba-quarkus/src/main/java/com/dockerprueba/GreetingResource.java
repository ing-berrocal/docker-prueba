package com.dockerprueba;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @Inject
    private GreetingService servicio;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
    
    @GET
    @Path("hola/{nombre}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hola(@PathParam("nombre") String nombre) {
        return servicio.servicioNombre(nombre);
    }
}