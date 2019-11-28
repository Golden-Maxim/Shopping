package com.company;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            DataBase dataBase = new DataBase();
            Wife wife = new Wife();
            Husband husband = new Husband();

            wife.want("Apple");
            wife.want("Asser");
            wife.want("Samsung");

            
            double allPrice = husband.getProductsPrice(wife.getProducts());

            System.out.println("Total list:");
            for (Products temp:dataBase.showAllProduct())
            {
                System.out.println(temp.print());
            }

            System.out.println("List from Wife");
            for (Products temp : wife.getProducts()) {
                System.out.println(temp.print());
            }


            System.out.println(allPrice);


        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}


