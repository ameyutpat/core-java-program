package com.backendhub.firstproject.oops.polymorphism;

class Parent{

    void print() {

    }
}


class Child extends Parent{

    void print(){
        System.out.println("I am in child class..");
    }
}
public class RuntimePolymorphismDemo {

    public static void main(String[] args) {
        Parent p;
        p = new Child();
        p.print();
    }
}
