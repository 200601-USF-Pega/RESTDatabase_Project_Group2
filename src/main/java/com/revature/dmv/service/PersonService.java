package com.revature.dmv.service;

import com.revature.dmv.dao.IPersonDAO;
import com.revature.dmv.dao.PersonDAODB;
import com.revature.dmv.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.security.URIParameter;
import java.util.ArrayList;


@Path("/person")
public class PersonService {
IPersonDAO personRepo = new PersonDAODB();

    @POST
    @Path("/newperson/form")
    public Response addNewPersonForm (@FormParam("firstname") String firstname, @FormParam("lastname") String lastname, @FormParam("reason") String reason) throws IOException {

        PersonDAODB persondaodb = new PersonDAODB();

        persondaodb.addPerson(new Person(firstname,lastname,reason));


        return this.getAllPeople();
    }




    @POST
    @Path("/newperson")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addNewPerson (Person person){
        PersonDAODB persondaodb = new PersonDAODB();
        persondaodb.addPerson(person);

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

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() throws IOException {

        return Response.ok((ArrayList<Person>)personRepo.getAllPeople()).build();
    }



}
