package com.cristianml.dao;

import com.cristianml.models.Client;
import com.mysql.cj.util.StringUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoClient {
    public Connection connect() {
        String database = "managementsystem";
        String user = "root";
        String password = "";
        String host = "localhost";
        String port = "3306";
        String driver = "com.mysql.cj.jdbc.Driver";
        String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false";

        Connection connect = null;

        try {
            Class.forName(driver);
            // DriverManager is for connect the urlConnection, user and password to database
            connect = DriverManager.getConnection(urlConnection, user, password);

        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }
        return connect;
    }

    public void add(Client client) {
        try {
            Connection connect = connect();
            String sql = "INSERT INTO `clients` (`id_clients`, `name`, `last_name`, `email`, `phone`) VALUES (NULL, '" +
                    client.getName() + "', '" + client.getLastname() + "', '" + client.getEmail() + "', '" + client.getPhone() + "');";
            Statement statement = connect.createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    // List Client to load the program
    public List<Client> list() {
        List<Client> list = new ArrayList<>();

        try {

            Connection connect = connect();
            String sql = "SELECT * FROM `clients`;";

            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(sql); // executeQuery(sql) = stores lists(rows from database) in an object called resultset

            // we go through the list
            while (result.next()) {
                Client client = new Client();
                client.setId(result.getString("id_clients"));
                client.setName(result.getString("name"));
                client.setLastname(result.getString("last_name"));
                client.setEmail(result.getString("email"));
                client.setPhone(result.getString("phone"));

                list.add(client);
            }
        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public void delete(String id) {
        try {
            Connection connect = connect();
            String sql = "DELETE FROM `clients` WHERE `clients`.`id_clients` = " + id;
            Statement statement = connect.createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void update(Client client) {
        try {
            Connection connect = connect();
            String sql = "UPDATE `clients` SET `name` = '"+ client.getName() +"', `last_name` = '"
                    + client.getLastname() +"', `email` = '"+ client.getEmail() +"', `phone` = '"+ client.getPhone()
                    +"' WHERE `clients`.`id_clients` = " + client.getId()+ "; ";
            Statement statement = connect.createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void save(Client client) {
        if (!StringUtils.isEmptyOrWhitespaceOnly(client.getId())) {
            update(client);
        } else {
            add(client);
        }
    }
}
