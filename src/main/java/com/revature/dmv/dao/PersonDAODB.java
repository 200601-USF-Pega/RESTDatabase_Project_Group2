package com.revature.dmv.dao;

import com.revature.dmv.model.Person;
import com.revature.dmv.web.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAODB implements  IPersonDAO {

    Connection connectionService = ConnectionService.getConnection();

    @Override
    public Person addPerson(Person person) {
        try {

            PreparedStatement adminStatement = connectionService.prepareStatement("INSERT INTO dmvLine " +
                    "(firstName, lastName, reason) VALUES (?, ?, ?)");

            adminStatement.setString(1, person.getFirstName());
            adminStatement.setString(2, person.getLastName());
            adminStatement.setString(3, person.getReason());

            adminStatement.executeUpdate();

            return person;


        } catch (SQLException e) {

            System.out.println("Exception " + e.getMessage());
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public ArrayList<Person> getAllPeople() {
        ArrayList<Person> result = new ArrayList<Person>();

        try {

            PreparedStatement selectAllStatement = connectionService.prepareStatement("SELECT * FROM dmvLine");

            ResultSet rs = selectAllStatement.executeQuery();

            while(rs.next()){

                Person p = new Person(rs.getString("firstname"),rs.getString("lastname"),rs.getString("reason"));
                result.add(p);
            }

            return result;


        }catch (Exception e){
            e.getMessage();
        }

        return null;
    }
}
