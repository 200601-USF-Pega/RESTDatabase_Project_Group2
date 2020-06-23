package com.revature.dmv.service;

import com.revature.dmv.dao.PersonDAODB;
import com.revature.dmv.model.Person;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;


@Path("/person")
public class PersonService {


    @POST
    @Path("/newperson")
    @Consumes("application/json")
    public void addNewPerson (Person person){



        //return Response.ok()
    }


    @GET
    @Path("/allpeople")
    @Consumes("application/json")
    public Response getAllPeople() throws IOException {
        PersonDAODB persondaodb = new PersonDAODB();
        ObjectMapper mapper = new ObjectMapper();
        String response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(persondaodb.getAllPeople());
        return Response
                .status(Response.Status.OK)
                .entity(response)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }



}
