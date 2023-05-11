package com.backendhub.firstproject.inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        HondaCity hondaCity = new HondaCity(6, 150, 4);
        System.out.println(hondaCity.toString());
        hondaCity.applyBrake(100);
        System.out.println(hondaCity.toString());
        hondaCity.speedUp(70);
        System.out.println(hondaCity.toString());
    }
}
