package com.backendhub.firstproject.collectin;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(5);
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list1.add(6);
        //list1.forEach(data -> System.out.println(""+ data));

        //Set
        Set<Integer> set1 = new HashSet<>(2);
        set1.add(1);
        set1.add(2);
        set1.add(2);
        set1.add(2);
        set1.add(2);
        set1.add(2);
        set1.add(2);
       // System.out.println("set: " + set1);

        //Map
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Amit");
        map1.put(2,"Raj");
        map1.put(2,"John");
        //System.out.println("map: " + map1);

        // Stack LIFO
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(" Stack element: "+ stack1.pop());
        System.out.println(" Stack element: "+ stack1.pop());
        System.out.println(" Stack element: "+ stack1.pop());
        //System.out.println(" Stack element: "+ stack1.pop());

        // Queue FIFO
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(" Queue element: "+ queue.remove());
        System.out.println(" Queue element: "+ queue.remove());
        System.out.println(" Queue element: "+ queue.remove());

    }
}
