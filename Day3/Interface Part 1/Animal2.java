package com.java.day3;

interface Animal1 {
    public void eat();
    public void sleep();
}
class dog1 implements  Animal1{
    public void sleep(){
        System.out.println("The dog is sleeping");
    }

     public void eat(){
        System.out.println("The dog is eating");
    }
}
class cat1 implements Animal1{

    public void sleep(){
        System.out.println("The cat is sleeping");
    }

    public void eat(){
        System.out.println("The cat is eating");
    }
}

public class Animal2{
    public static void main(String[] args) {
        dog1 obj = new dog1();
        cat1 obj1= new cat1();
        obj.eat();
        obj.sleep();
        obj1.eat();
        obj1.sleep();
    }


}