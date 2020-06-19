package org.acme.rest.client;

import java.util.Set;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public class DummyHealth {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String name() {
        
        return "UP";
    }
    
}
