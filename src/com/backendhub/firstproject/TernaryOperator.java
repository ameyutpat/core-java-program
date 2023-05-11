package com.backendhub.firstproject;

import java.util.concurrent.locks.Condition;

public class TernaryOperator {


    public static void main(String[] args) {
        int a=30 , b = 20;
        int result = (a != b) ? (a + b) : (a - b);
        System.out.println("Result: "+result);
        int result2;
       // (Condition) ? //it will work :  // negative case will work
        if(a != b){
            result2=a + b;
        }else{
            result2= a-b;
        }
    }

}
