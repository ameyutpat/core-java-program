package com.backendhub.firstproject;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveDataTypeExample {
    public static void main(String[] args) {
        byte var1 = 127;
        short var2 = -3000;
        var2 = var1;
        int var3 = 4000;
        //var3 = var2;
        long var4 = 234566L;
         //var4 = var3;
         //var3 = var4;
        float f1 = 14.34f;
        double d1 = 145.6d;

        RelationOperatorExample.checkGreaterThan100(100);
        int num1= 10;
        num1= 20;
        char letter ='a';
        List<Integer> list1 = new ArrayList<>();
        list1.add(num1);
        list1.add(2);
        list1.forEach(data -> System.out.println(""+data));
    }
}
