package com.backendhub.firstproject.java8features;

public class LambdaDemo {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Method1 is called..");
        runnable.run();
    }
}
