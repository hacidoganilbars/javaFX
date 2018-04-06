package com.hacidoganilbars.dao;

import com.hacidoganilbars.entity.Filmler;

import java.sql.*;
import java.util.ArrayList;

public class FilmlerDao {
    public ArrayList<Filmler> butunFilmleriGetir(){
        ArrayList<Filmler> filmler=new ArrayList<Filmler>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/sinema","root","8124782.Aa");
                String SQL="SELECT * FROM film";
                Statement statement=conn.createStatement();
                ResultSet resultSet= statement.executeQuery(SQL);
                Filmler film=null;

                while(resultSet.next()){
                    film=new Filmler(resultSet.getInt("id"),resultSet.getString("isim"),resultSet.getInt("sene"));
                    filmler.add(film);
                }



            } catch (SQLException e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return filmler;



    }


}
