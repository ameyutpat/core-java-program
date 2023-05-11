package com.backendhub.firstproject.exceptionHandling;

public class ThrowsDemo {
    public static void main(String[] args)  {
        try {
            method2();
        } catch (InvalidDataException e) {
            System.out.println("Data is invalid..");
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

    public static void method1() throws InvalidDataException, NullPointerException, ArithmeticException {
        // n no of lines
        System.out.println("Hello world");
    }
    public static void method2() throws InvalidDataException,NullPointerException,ArithmeticException {
        method1();
    }
}
