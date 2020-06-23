package com.revature.dmv.dao;

import com.revature.dmv.model.Person;

import java.util.ArrayList;

public interface IPersonDAO {

    public Person addPerson(Person person);
    public ArrayList<ArrayList<String>> getAllPeople();


}