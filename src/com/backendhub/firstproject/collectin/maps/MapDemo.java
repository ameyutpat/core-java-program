package com.backendhub.firstproject.collectin.maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Amey");
        map1.put(2,"Sai");
        map1.put(1,"Amit");
        map1.put(3,"Amit");
        map1.put(null,"Amit");
        map1.put(null,null);
        map1.put(3,null);
        System.out.println(map1.hashCode());

        map1.put(5,"Raj");
        //hashcode=5, k = 5 , v = "Raj", nextNode
        map1.get(100);
    }
}
