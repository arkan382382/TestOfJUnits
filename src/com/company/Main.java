package com.company;

import com.sun.accessibility.internal.resources.accessibility;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basket tmp1 = new Basket("testowy_koszyk");
        tmp1.AddItem2("book_1", (float) 2.4);
        tmp1.AddItem2("pencil", (float) 1.8);
        System.out.println(tmp1.getNameOfBasket());
        System.out.println(tmp1.getNumberOfProducts_twice());
        tmp1.getTheProducts();


        tmp1.AddItem("test1");
        tmp1.AddItem("test2");
        System.out.println(tmp1.getNumberOfProducts());

        User firstUser = new User("Adam Kowalski");
        firstUser.createOrder();
        firstUser.addToCart("Pencil", (float)3.5);
        firstUser.addToCart("Book", (float)2.5);
        firstUser.addToCart("MacBook", (float)300);
        firstUser.howManyToPay();
    }

}








