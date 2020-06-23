package com.revature.dmv.service;

import com.revature.dmv.dao.IPersonDAO;
import com.revature.dmv.dao.PersonDAODB;
import com.revature.dmv.model.Person;

import java.util.ArrayList;

public class PersonDAOService {

    IPersonDAO repo;
    ValidationService inputValidation = new ValidationService();

    PersonDAODB personDAODB = null;



    public void createNewPerson(){
        boolean success = false;

        try{

            personDAODB = new PersonDAODB();

        }catch(Exception e){

            e.getMessage();
        }

        do {

            String firstName = inputValidation.getValidStringInput("Enter first name: ");
            String lastName = inputValidation.getValidStringInput("Enter last name: ");
            String reason = inputValidation.getValidStringInput("Enter reason: ");

            try {
                Person newPerson = new Person(firstName, lastName, reason);


                personDAODB.addPerson(newPerson);
                success = true;
            } catch (Exception e){
                //For now just have this plain message
                System.out.println("Failed to create account");
            }


        }while(!success); //

    }

//    public void getPeople() {
//        try{
//
//            personDAODB = new PersonDAODB();
//
//        } catch(Exception e) {
//
//            e.getMessage();
//
//
//        }
//
//        ArrayList<ArrayList<String>> retrivedPerson = personDAODB.getAllPeople();
//        for (ArrayList<String> person : retrivedPerson){
//            System.out.println(person);
//        }
//
//    }


}
