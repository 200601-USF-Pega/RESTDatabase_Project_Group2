package com.revature.dmv.service;

import com.revature.dmv.model.Person;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/person")
public class PersonService {


    @POST
    @Path("/newperson")
    @Consumes("application/json")
    public Response addNewPerson (Person person){



        return Response.ok()
    }


    @GET
    @Path("/allpeople")
    @Consumes("application/json")
    public Response getAllPeople(){


        return Response.ok()
    }



}
