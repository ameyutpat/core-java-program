package com.backendhub.firstproject.collectin.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> ref = new LinkedList<>();
        ref.add(1);
        ref.add(2);
        ref.get(1);
        //ref.add(5,20);
        ref.forEach(data -> System.out.println(" "+ data));
    }
}
