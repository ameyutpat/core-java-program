package com.backendhub.firstproject.collectin.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListIterationDemo {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        Employee emp = new Employee(1, "A");
        list1.add(emp);
        list1.add(new Employee(2, "B"));

       /* for(int i=0; i < list1.size(); i++){
            list1.remove(i);
            System.out.println("Emp Details: "+ list1.get(i));
        }

        for (Employee e : list1){
            list1.remove(e);
            System.out.println("Emp Details: "+ e);
        }

        Iterator<Employee> employeeIterable =  list1.iterator();
        while(employeeIterable.hasNext()){
            System.out.println(" emp details : "+ employeeIterable.next());
        }

        list1.forEach( data -> System.out.println(" "+ data));*/
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        for(Integer i : list2){
            list2.remove(0);
        }

        for(int i=0; i < list1.size(); i++){
            list1.remove(0);
            System.out.println("Emp Details: "+ list1.get(i));
        }
    }
}
