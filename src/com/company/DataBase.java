package com.company;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {

    private Connection con;
    private  Statement stmt;


    DataBase() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try {
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shops", "root", "");
            this.stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    Products getProduct(Products product) {
        try {
            ResultSet rs = this.stmt.executeQuery("select * from household_appliances WHERE name='" + product.name + "' LIMIT 1");
            rs.next();
            product.id = rs.getInt(1);
            product.price = rs.getDouble(3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    ArrayList<Products> showAllProduct()
    {
        ArrayList<Products> products = new ArrayList<>();

        try {
            ResultSet rs = this.stmt.executeQuery("select * from household_appliances" );
            while (rs.next())
            {
                Products product = new Products(rs.getString(2));
                product.id = rs.getInt(1);
                product.price = rs.getDouble(3);
                products.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }




  /*  public  static void manageDataBase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shops", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from household_appliances");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }*/
}

