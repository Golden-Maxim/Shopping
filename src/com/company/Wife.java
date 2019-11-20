package com.company;
import java.util.ArrayList;
import java.util.Arrays;


public class Wife extends DataBase {
    ArrayList<Products> needs = new ArrayList<>();

    Wife() throws ClassNotFoundException {

    }

    public void want(String product)
    {
        Products products = new Products(product);
        this.needs.add(products);
    }

    public ArrayList<Products> getProducts() {
        return this.needs;
    }
}
