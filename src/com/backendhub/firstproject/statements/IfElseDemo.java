package com.backendhub.firstproject.statements;

public class IfElseDemo {

    public static void main(String[] args) {
        String equipment = "fan";
        if(equipment.equals("fan")){
            System.out.println("Code to turn on the fan");
        }else if(equipment.equals("tv")){
            System.out.println("Code to turn on the tv");
        }else if(equipment.equals("tubelight")){
            System.out.println("Code to turn on the tubelight");
        }else{
            System.out.println("Equipment is not in the menu..");
        }





    }
}
