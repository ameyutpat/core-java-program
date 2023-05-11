package com.backendhub.firstproject.statements;

public class SwitchDemo {
    public static void main(String[] args) {
        String equipment = "fridge";
        switch(equipment){

            case "fan" :
                System.out.println("Code to turn on the fan");
                break;
            case "tubelight" :
                System.out.println("Code to turn on the tubelight");
                break;
            case "tv" :
                System.out.println("Code to turn on the tv");
                break;
            default:
                System.out.println("Equipment is not in the menu..");

        }
    }
}
