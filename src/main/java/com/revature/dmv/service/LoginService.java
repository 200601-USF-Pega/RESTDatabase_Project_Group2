package com.revature.dmv.service;

import com.sun.jersey.api.representation.Form;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.net.URISyntaxException;

@Path("/login")

public class LoginService {

@POST
@Consumes(MediaType.MULTIPART_FORM_DATA)
public Response check(@FormDataParam("username") String username, @FormDataParam("password") String password) throws URISyntaxException {


    System.out.println(username + password);

    if(username.equalsIgnoreCase("admin")){

        if(password.equalsIgnoreCase("password")){



            return Response.status(201).build();

        }

    }

    return Response.status(401).build();

}

}
