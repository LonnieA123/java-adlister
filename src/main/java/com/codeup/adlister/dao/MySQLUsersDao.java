package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import dao.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users{


    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.giveURL(),
                    Config.giveUSER(),
                    Config.givePSWD()
            );
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("Error connecting to the database!", e);

        }
    }

    @Override
    public User findByUsername(String username) throws SQLException {
        User user = null;

        String sql = "SELECT * from users WHERE username LIKE ?";
        String name = "" + username + "%";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);
        ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()){
            user = new User(
                    resultSet.getLong("id"),
                    resultSet.getString("username"),
                    resultSet.getString("email"),
                    resultSet.getString("password")
                    );

        }

        return user;
    }

    @Override
    public Long insert(User user) throws SQLException {
        String sql = "INSERT into users(username,email,password) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getPassword());


        ResultSet resultSet = statement.getGeneratedKeys();

        if (resultSet.next()){
            return resultSet.getLong(1);
        }

        int rows = statement.executeUpdate();
        System.out.println(rows);

        return null;
    }
}
