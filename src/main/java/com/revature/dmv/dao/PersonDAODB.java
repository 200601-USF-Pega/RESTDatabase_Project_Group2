package com.revature.dmv.dao;

import com.revature.dmv.model.Person;
import com.revature.dmv.web.ConnectionService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAODB implements  IPersonDAO {

    ConnectionService connectionService = (ConnectionService) ConnectionService.getConnection();

    @Override
    public Person addPerson(Person person) {
        try {

            PreparedStatement adminStatement = connectionService.getConnection().prepareStatement("INSERT INTO dmvLine " +
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
    public ArrayList<ArrayList<String>> getAllPeople() {
        ArrayList<String> inner;
        ArrayList<ArrayList<String>> outer = new ArrayList<>();
        try {


            PreparedStatement selectAllStatement = connectionService.getConnection().prepareStatement("SELECT * FROM dmvLine");

            ResultSet rs = selectAllStatement.executeQuery();

            while(rs.next()){
                inner = new ArrayList<>();
                for(int i = 1; i <= 4; i++)
                {
                    inner.add(rs.getString(i));
                }
                outer.add(inner);
            }

            return outer;


        }catch (Exception e){
            e.getMessage();
        }

        return null;
    }
}
