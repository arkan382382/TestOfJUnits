package com.company;


import org.junit.Assert;
import org.junit.Test;

public class TestjUnit {

    @Test
    public void createNewBasket(){
        Basket basket_1 = new Basket("pierwszy");
        Assert.assertFalse(basket_1.getNameOfBasket().isEmpty());
    }
//ssd
    @Test
    public void checkProductsInsideOfBasket(){
        Basket basket_2 = new Basket("drugi");
        basket_2.AddItem("milk");
        Assert.assertFalse(basket_2.getNumberOfProducts() == true);
    }

    @Test
    public void checkProductsInsideOfBasket_differentWay(){
        Basket basket_3 = new Basket("trzeci");
        basket_3.AddItem2("milk", (float) 24.5);
        Assert.assertTrue(basket_3.getNumberOfProducts_twice() == false);
    }



}
