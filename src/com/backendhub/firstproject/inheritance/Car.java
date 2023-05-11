package com.backendhub.firstproject.inheritance;

public class Car {
    public int gear;
    public int speed;

    public Car(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
        System.out.println("Basic functionality of car is added..");
    }

    public void applyBrake(int value){
        speed -= value;
    }

    public void speedUp(int value){
        speed += value;
    }
}
