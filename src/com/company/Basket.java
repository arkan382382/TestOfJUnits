package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {
    private String nameOfBasket;
    protected List<String> items;
    ArrayList<Product> test;

    public Basket(String name){
        this.nameOfBasket = name;
    }

    public void AddItem(String nameFromBasket){
        items = new ArrayList<String>();
        items.add(0,nameFromBasket);
    }
    public void AddItem2(String nameFromBasket, float priceFromBasket){
        test = new ArrayList<Product>();
                test.add(new Product(nameFromBasket, priceFromBasket));
    }


    public String getNameOfBasket(){
        return this.nameOfBasket;
    }
    public boolean getNumberOfProducts(){ return this.items.isEmpty(); }
    public boolean getNumberOfProducts_twice(){ return this.test.isEmpty();   }
}
