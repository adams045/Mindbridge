package com.java.day3;
class Manager extends  Employee{
    @Override
    public void calculateSalary(){
        System.out.println("Manager Salary");
    }
}

class Developer extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("Developer Salary");
    }
}


public class Employee {
    public void calculateSalary(){
        System.out.println("Salary Calculated");
    }

    public static void main(String[] args) {
        Employee emp = new Manager();
        Employee emp2= new Developer();
        emp.calculateSalary();
        emp2.calculateSalary();
    }
}
