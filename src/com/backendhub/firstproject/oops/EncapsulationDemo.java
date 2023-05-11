package com.backendhub.firstproject.oops;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Area a = new Area();
        a.length = 5;
        a.setLength(5);
        a.setBreadth(10);
        a.getArea();

        Area b = new Area();
    }
}
