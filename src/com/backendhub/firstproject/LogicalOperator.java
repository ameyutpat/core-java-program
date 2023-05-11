package com.backendhub.firstproject;

public class LogicalOperator {

    public static void main(String[] args) {
        int a = 10, b = 20;
        // AND Operator
        if (a > b && b < 100) {
            System.out.println("AND Codition is true");
        } else {
            System.out.println("AND Condition is false");
        }
        // OR Operator
        if (!(a > b) || b < 100) {
            System.out.println("OR Condition is true");
        } else {
            System.out.println("OR Condition is false");
        }
        // Not Operator
        boolean check = a > b;
        System.out.println("Actual condition: " + check);
        System.out.println("It's negation: " + !check);
    }
}
