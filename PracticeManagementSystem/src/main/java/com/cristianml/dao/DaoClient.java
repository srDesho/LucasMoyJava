package com.cristianml.dao;

import com.cristianml.models.Client;
import com.mysql.cj.util.StringUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoClient {
    public Connection connect() {
        String dataBase = "managementsystem";
        String user = "root";
        String password = "";
        String host = "localhost";
        String port = "3306";
        String driver = "com.mysql.cj.jdbc.Driver";
        String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + dataBase + "?useSSL=false";
        Connection connect = null;

        try {
            Class.forName(driver);
            connect = DriverManager.getConnection(urlConnection, user, password);
        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }

        return connect;
    }
    public void save(Client client) {
        if(!StringUtils.isEmptyOrWhitespaceOnly(client.getId())) {
            update(client);
        } else {
            add(client);
        }
    }
    public void add(Client client) {
        try {
            connect();
            String sql = "INSERT INTO `clients` (`id_clients`, `name`, `last_name`, `email`, `phone`) VALUES (NULL, '" +
                    client.getName() + "', '" + client.getLastname() + "', '" + client.getEmail() + "', '" + client.getPhone() + "');";
            Statement statement = connect().createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public List<Client> list(){
        connect();
        List<Client> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM `clients`;";
            Statement statement = connect().createStatement();
            ResultSet result = statement.executeQuery(sql);

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
        connect();
        String sql = "DELETE FROM `clients` WHERE `clients`.`id_clients` = " + id;

        try {
            Statement statement = connect().createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void update(Client client) {
        connect();
        String sql = "UPDATE `clients` SET `name` = '"+ client.getName() +"', `last_name` = '"
                + client.getLastname() +"', `email` = '"+ client.getEmail() +"', `phone` = '"+ client.getPhone()
                +"' WHERE `clients`.`id_clients` = " + client.getId()+ "; ";

        try {
            Statement statement = connect().createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
