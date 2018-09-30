package com.company;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private String nameOfBasket;
    protected List<String> items = new ArrayList<String>();
    ArrayList<Product> test = new ArrayList<Product>();

    public Basket(String name){
        this.nameOfBasket = name;
    }

    public void AddItem(String nameFromBasket){

        items.add(nameFromBasket);
    }
    public void AddItem2(String nameFromBasket, float priceFromBasket){
            test.add(new Product(nameFromBasket, priceFromBasket));
    }


    public String getNameOfBasket(){
        return this.nameOfBasket;
    }
    public int getNumberOfProducts(){ return this.items.size(); }
    public int getNumberOfProducts_twice(){ return this.test.size();   }
    public void getTheProducts(){
        for(int i=0; i<test.size(); i++){
            System.out.println(test.get(i).getProductName() + ", " + test.get(i).getProductPrice());
        }
    }
    public float getTheAmountOfBasket(){
        float summary = 0;
        for(int i=0; i<getNumberOfProducts_twice(); i++){
            summary += test.get(i).getProductPrice();
        }
        return summary;
    }
}
