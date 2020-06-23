package com.revature.dmv.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/login")

public class LoginService {
@GET
@Path("/check")
@Consumes("application/json")
    public Response check(String username, String password){
    if(username.equals("admin")&& password.equals("password")){
        System.out.println("Successfully logged in");
    }
    return Response
            .status(Response.Status.OK).build();
}

}
