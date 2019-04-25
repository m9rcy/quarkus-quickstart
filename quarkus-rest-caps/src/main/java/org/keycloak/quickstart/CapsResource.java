package org.keycloak.quickstart;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("caps/{username}")
@RequestScoped
public class CapsResource {

    @GET
    @RolesAllowed({"user"})
    @Produces("application/json")
    public String toCaps(@PathParam("username") String username) {
        return username.toUpperCase();
    }
}