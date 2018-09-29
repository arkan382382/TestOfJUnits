package com.company;

import com.sun.accessibility.internal.resources.accessibility;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 0;

        int b = a;
        System.out.println("a = " + b);
        List<String> aa = new ArrayList<>();
        aa.add(0,"abba");


    }
    @Test
    public void shouldSayThat15rIsInRange() {
        Range range = new Range(10, 20);
        Assert.assertTrue(range.isInRange(15));
    }






}

