package com.cristianml.dao;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class daoClient {
    public void connect() {
        String database = "java";
        String user = "root";
        String password = "";
        String host = "localhost";
        String port = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false";

        Connection connect = null;

        //Class.forName(driver);

        try {
            Class.forName(driver);
            connect = DriverManager.getConnection(urlConnection, user, password);
        } catch (Exception e) {
            Logger.getLogger(daoClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
