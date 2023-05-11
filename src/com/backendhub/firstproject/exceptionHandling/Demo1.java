package com.backendhub.firstproject.exceptionHandling;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        String s = "Query Editor expects";
        Arrays.stream(s.split("")).filter(data -> !data.equals(" ")).collect(Collectors.groupingBy(data -> data.toLowerCase(), LinkedHashMap:: new,Collectors.counting())).
                forEach( (k,v) -> System.out.println( k + " " + v));
    }
}
