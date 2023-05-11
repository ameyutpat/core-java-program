package com.backendhub.firstproject;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing
        int i = 10;
        Integer k = Integer.valueOf(i); // Before java 5
        k = i;
        System.out.println("Value of k:"+k);
        //Unboxing
        Integer num1 = new Integer(5);
        int num2 = num1;

        float f2 = 12;
        Float f = f2;

    }
}
