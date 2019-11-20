package com.company;

import com.sun.corba.se.spi.monitoring.StatisticsAccumulator;

import java.util.ArrayList;

public class Husban {
    private DataBase db;
    Husban() {
        try {
            this.db = new DataBase();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public double getProductsPrice(ArrayList<Products> productsList) {

        double price = 0;
        for(Products product : productsList) {
            this.db.getProduct(product);
            price += product.price;
        }

        return price;
    }

}
