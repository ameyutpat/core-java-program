package com.backendhub.firstproject.constructors;

public class Student {

    int id;
    String name;

    Student(){
        System.out.println("Student constructor is called.");
    }

    Student(int id1, String name1){
        this.id = id1;
        this.name = name1;
    }


    void print(){
        System.out.println("This is method.."+this.id + " name: "+this.name);
    }
}
