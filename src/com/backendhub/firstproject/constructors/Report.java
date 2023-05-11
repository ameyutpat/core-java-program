package com.backendhub.firstproject.constructors;

public class Report {

    Report(){
        this(50);
        System.out.println("Default constructor is callled.");
    }

    Report(int x){
        this(x,20);
        System.out.println("Value of x: "+ x);
    }

    Report(int x, int y){
        System.out.println("Multiplication of x and y: "+ x*y);
    }

    int sum(int x, int y){
        return x+y;
    }
}
