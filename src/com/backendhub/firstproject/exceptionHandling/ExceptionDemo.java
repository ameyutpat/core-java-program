package com.backendhub.firstproject.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws FileNotFoundException {
        int a =10;
        // Checked or compile time exception
        FileInputStream fileInputStream = new FileInputStream("A");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter divisior: ");
        int b = scanner.nextInt();
        System.out.println(" output: "+ a/b);
        // Unchecked exception or Runtime exception
        // developers mistake or end user mistake
        String s = null;
        System.out.println(""+ s.concat("Sai"));
        System.out.println("End of program");

    }
}
