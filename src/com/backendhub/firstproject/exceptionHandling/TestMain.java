package com.backendhub.firstproject.exceptionHandling;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        try{
            System.out.println("Please enter valid id of employee: ");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            if(id < 0){
                throw new InvalidDataException("Your id is not valid..");
            }
        } catch (InvalidDataException e) {
            System.out.println(" "+e.getMessage());
            //throw new RuntimeException(e);
        }
    }
}
