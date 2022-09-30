package com.cagla;

public class Main {
    // main function to test the Employee class.
    public static void main(String[] args) {
        // test data
	    Employee employee = new Employee("Cagla", 5600,50, 2015);
        employee.raiseSalary();
        System.out.println(employee.toString());
    }
}





