package com.backendhub.firstproject.oops;

public class OOPSMain {

    public static void main(String[] args) {
        Employee employee; // Reference
        employee = new Employee(); // Instance or Actual object is created
        employee.id = 1;
        employee.name= "Amey";
        employee.printEmployee(employee);
    }
}
