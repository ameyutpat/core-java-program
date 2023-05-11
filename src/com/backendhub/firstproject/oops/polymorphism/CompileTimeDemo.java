package com.backendhub.firstproject.oops.polymorphism;

public class CompileTimeDemo {

    int sum(int a , int b){
        return a+b;
    }

    String sum(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        CompileTimeDemo compileTimeDemo = new CompileTimeDemo();
        String s = compileTimeDemo.sum("Amey ", " Utpat");
        System.out.println(s);
        int c  = compileTimeDemo.sum(10,20);
        System.out.println("Sum: "+c);
    }
}
