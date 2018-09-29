package com.company;

public class Product {
    private String name;
    private float price;


    public Product(String name){
        this.name = name;
    }

    public Product(String name, float price){
        this.name = name;
        this.price = price;
    }
    public String getProductName(){
        return name;
    }

}
