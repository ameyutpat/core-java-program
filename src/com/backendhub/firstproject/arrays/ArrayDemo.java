package com.backendhub.firstproject.arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40};
        // traverse to array
        System.out.println("index: "+ "0 " + " and value of index: "+ array1[0]);
        for(int i=0; i < array1.length; i++){
            System.out.println("index: "+i + " and value of index: "+ array1[i]);
        }
        int[] array2 = new int[5];

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

       /* array2[0] = sc.nextInt();
        array2[1] = sc.nextInt();
        array2[2] = sc.nextInt();
        array2[3] = sc.nextInt();
        array2[4] = sc.nextInt();*/
        System.out.println("Enter values of array: ");
        // Inserting values of array
        for(int i=0; i < array2.length; i++){
            array2[i] = sc.nextInt();
        }
        // traverse the array
        for(int i=0; i < array2.length; i++){
            System.out.println("index: "+i + " and value of index: "+ array2[i]+5);
        }
    }
}
