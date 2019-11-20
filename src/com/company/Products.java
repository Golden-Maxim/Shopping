package com.company;

import java.util.ArrayList;

public class Products {
    int id;
    String name;
    double price;


    Products() {

    }

    Products(String name) {
        this.name = name;
    }

    Products(double name) {
        this.price = name;
    }


    public String print()
    {
        return this.id + " " + this.name + " " + this.price;
    }


}
