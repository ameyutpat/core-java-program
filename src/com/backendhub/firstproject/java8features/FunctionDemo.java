package com.backendhub.firstproject.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer,Integer> function = i -> i*i;
        System.out.println("Square: "+ function.apply(5));

        Predicate<Integer> p = i -> i % 2 ==0;
        System.out.println("is it even: "+ p.test(5));
    }
}
