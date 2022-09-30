package com.cagla;

public class Employee {
    // attributes of the employee
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // constructor
    public Employee(String name_, double salary_, int workHours_, int hireYear){
        this.name = name_;
        this.salary = salary_;
        this.workHours = workHours_;
        this.hireYear= hireYear;
    }

    // tax() function to determine the tax amount which will be cut from salary.
    private double tax(){
        if(this.salary < 1000){
            return 0;
        }
        else{
            return salary * 0.03;
        }
    }

    // bonus() function to add extra money to salary according to work hours.
    private double bonus(){
        if(this.workHours > 40){
            int extraHours = this.workHours - 40;
            return extraHours * 30 * 4; // 4 weeks in a month so
        }
        else return 0;
    }

    // raiseSalary() function is used to raise the salary amount of employee according to
    // how many years worked till 2021.
    public void raiseSalary(){
        this.salary += bonus();

        int yearsWorked = 2021 - this.hireYear;
        double extraSalary;
        if(yearsWorked< 10){
            extraSalary = this.salary*0.05;
        }
        else if(yearsWorked > 9 && yearsWorked < 20){
            extraSalary = this.salary*0.1;
        }
        else{
            extraSalary = this.salary*0.15;
        }

        this.salary += extraSalary;
        this.salary -= tax();


    }

    @Override
    public String toString() {
        return "Employee: " + '\n' +
                "   name: " + name + '\n' +
                "   salary: " + salary + '\n' +
                "   work hours: " + workHours + '\n' +
                "   hire year: " + hireYear + '\n';
    }
}
