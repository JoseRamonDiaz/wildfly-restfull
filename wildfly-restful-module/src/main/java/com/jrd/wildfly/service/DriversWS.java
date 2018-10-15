package com.jrd.wildfly.service;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by jose.diaz on 14/07/2017.
 */
@Path("drivers")
@Stateless
public class DriversWS {

    public DriversWS() {
    }

    /**
     * Retrieves representation of an instance of com.donde.mermas.ws.MermasPersistenceWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of MermasPersistenceWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("isDriver")
    public Boolean isDriver(){
        return new Boolean(false);
    }
}
