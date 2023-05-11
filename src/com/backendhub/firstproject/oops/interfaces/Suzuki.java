package com.backendhub.firstproject.oops.interfaces;

public class Suzuki implements Car,Base,Demo1{

    @Override
    public void method1() {
        System.out.println("This is Suzuki car METHOD1..");
    }

    @Override
    public void display() {
        //Car.super.display();
        //Demo1.super.display();
        System.out.println("Z");
    }
}
