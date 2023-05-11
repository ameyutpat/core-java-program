package com.backendhub.firstproject.exceptionHandling;

public class ThrowDemo {

    public static void main(String[] args) {
        try{
            method1(null);
        }catch (NullPointerException f){
            System.out.println("Caught inside main method..");
        }
    }

    static void method1(String s){
        try{
            if(s == null){
                throw  new NullPointerException("Demo of throw");
            }else{
                System.out.println("You can proceed with code..");
            }
        }catch (NullPointerException e){
            System.out.println("Caught that exception.."+ e.getMessage());
            throw e;
        }
    }
}
