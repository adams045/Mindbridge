package com.java.day3;

abstract class Shap {
    abstract double calculateArea();
}
class Circle extends Shap{
    public int radius;
    Circle(int radius){
        this.radius=radius;
    }
    double calculateArea(){
        return (3.14*radius*radius);
    }
}
class Rectangle extends Shap{
    private int length;
    private int breadth;
    Rectangle(int length,int breadth){
        this.breadth=breadth;
        this.length=length;
    }

    double calculateArea(){
        return 0.5*length*breadth;
    }
}
public  class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
    }
}