package com.backendhub.firstproject.statements;

public class WhileLoop {

    public static void main(String[] args) {
        int i=1;

        while(i <= 5){
            System.out.println("In while loop..");
            i++;
        }
        System.out.println("Out of while loop..");

        // do-while loop
        int k=1;
        do{
            System.out.println("In  do while loop..");
            k++;
        }while(k<=5);
    }
}
