package com.revature.dmv.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.net.URISyntaxException;

@Path("/login")

public class LoginService {

@POST
    public Response check(@FormParam("username") String username, @FormParam("password") String password) throws URISyntaxException {

    if(username.equalsIgnoreCase("admin")){

        if(password.equalsIgnoreCase("password")){

            URI uri = UriBuilder.fromUri("../dmv.html").build();

            return Response.temporaryRedirect(uri).build();

        }

    }

    return Response.status(401).build();

}

}
