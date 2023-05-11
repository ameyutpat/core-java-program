package com.backendhub.firstproject.statements;

public class ForLoop {
    // Print values from 1 to 5
    public static void main(String[] args) {

        for(int i=1; i <= 3 ;i++){
            for(int j=1; j  < 5 ; j++){
                System.out.println("Inner for loop");
                if(j == 1){
                    System.out.println("J's value = "+ j);
                    break;
                }
            }
            if(i <=1){
                System.out.println("Breaking outer for loop as well..");
                break;
            }
            System.out.print(" "+i);
        }
        System.out.println("For loop completed..");
    }
}
