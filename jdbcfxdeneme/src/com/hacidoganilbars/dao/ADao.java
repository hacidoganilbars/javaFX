package com.hacidoganilbars.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ADao {


   public static  Connection getConnection(){
        Connection connection=null;
        try {
          connection = DriverManager.getConnection("jdbc:mysql://localhost/sinema","root","8124782.Aa");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }
}
