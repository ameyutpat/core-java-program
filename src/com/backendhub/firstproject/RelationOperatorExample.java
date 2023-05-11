package com.backendhub.firstproject;

import java.util.Scanner;

public class RelationOperatorExample {

    // Unary op


    // Assignment Op =  and ==

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc  = new Scanner(System.in);
        int input = sc.nextInt();
        checkGreaterThan100(input);
        System.out.println("Whether number is 100 : "+ (input != 100));

    }

    public static  void checkGreaterThan100(int i){
        if(i >= 100){
            System.out.println("Number is greater than 100");
        }else if(i < 100){
            System.out.println("Number is smaller than 100");
        }else if (i == 100){
            System.out.println("Number is smaller than 100");
        }else{

        }

    }

}
