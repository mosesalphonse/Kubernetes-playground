package org.acme.rest.client;

import java.util.Set;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import io.smallrye.mutiny.Uni;

@Path("/quarkus")
public class HelloResource {

    @Inject
    @RestClient
    HelloService helloService;

    @GET
    @Path("/greeting")
    public String name() {
        System.out.println("HelloResource's name method invoked");
        return helloService.hello();
    }
    
}
