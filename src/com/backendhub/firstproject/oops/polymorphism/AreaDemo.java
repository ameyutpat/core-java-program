package com.backendhub.firstproject.oops.polymorphism;

class Shape{

    void findArea(int radius){

    }
}

class Circle extends Shape{

    void findArea(int radius){
        System.out.println("Area of Circle: "+ 3.14*radius*radius);
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.findArea(2);
    }
}
