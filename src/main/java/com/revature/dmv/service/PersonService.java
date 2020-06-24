package com.revature.dmv.service;

import com.revature.dmv.dao.PersonDAODB;
import com.revature.dmv.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.security.URIParameter;


@Path("/person")
public class PersonService {

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



}
