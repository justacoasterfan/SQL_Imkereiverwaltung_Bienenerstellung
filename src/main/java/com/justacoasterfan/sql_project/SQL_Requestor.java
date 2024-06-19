package com.justacoasterfan.sql_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

public class SQL_Requestor {

    // Attributes
    private Connection connection = null;
    
    // Constructor
    public SQL_Requestor() {
        try {
            // Currently set up to connect to local XAMPP MySQL database with global user "java" and password "java"
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/imkerei", "java", "java");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Methods
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(String into, LinkedHashMap<String, String> ColumnsValues) {

        //add quotes to values if they are strings
        for (Map.Entry<String, String> entry : ColumnsValues.entrySet()) {
            if (!entry.getValue().matches("\\d+")) {
                entry.setValue("'" + entry.getValue() + "'");
            }
        }

        //get values into string
        String values = String.join(", ", ColumnsValues.values());

        //get columns into string
        String columns = String.join(", ", ColumnsValues.keySet());

        //ouput for debugging
        System.out.println("INSERT INTO " + into + " (" + columns + ") VALUES (" + values + ")");


        //insert into database
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " + into + " (" + columns + ") VALUES (" + values + ")");
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}