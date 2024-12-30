package com.java.day3;

public class Student extends Person {
    private int rollNumber;
    private int marks;


    public void show(String name,int age, int rollNumber,int marks){
        this.marks=marks;
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
        super.show(name,age);
        System.out.println(rollNumber);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student sc=new Student();
        sc.show("Adams",20,21,400);
    }
}
