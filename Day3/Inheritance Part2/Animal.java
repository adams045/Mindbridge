package com.java.day3;

public class Animal {

    public void sound(){
        System.out.println("Sound");
    }

    public static void main(String[] args) {
        Animal animal = new dog();
        animal.sound();
        Animal animal1= new cat();
        animal1.sound();

    }
}
class dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class cat extends Animal{
    @Override
    public  void sound(){
        System.out.println("Cat Meows");
    }
}
