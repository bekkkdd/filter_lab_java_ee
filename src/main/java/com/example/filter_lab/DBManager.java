package com.example.filter_lab;


import com.example.filter_lab.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class DBManager {

    private static Connection connection;

    static  {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filter_lab_db?useUnicode=true&serverTimezone=UTC", "root", ""
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getAllUsers() {

        ArrayList<User> userList = new ArrayList<>();

        try{

            PreparedStatement statement = connection.prepareStatement(" SELECT * FROM users");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String full_name = resultSet.getString("full_name");

                userList.add(new User(id, email, password, full_name));
            }

            statement.close();


        }catch (Exception e){
            e.printStackTrace();
        }
        
        return userList;

    }

    public static User getUserByEmailAndPassword(String email, String password){
        User user = null;

        return user;

    }
}
