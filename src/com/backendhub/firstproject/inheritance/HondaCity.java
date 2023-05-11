package com.backendhub.firstproject.inheritance;

public class HondaCity extends Car{

    public int airbaloons;

    @Override
    public String toString() {
        return "HondaCity{" +
                "airbaloons=" + airbaloons +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public HondaCity(int gear, int speed, int c) {
        super(gear, speed);
        this.airbaloons = c;
        System.out.println("Honda city car is created..");
    }

}
