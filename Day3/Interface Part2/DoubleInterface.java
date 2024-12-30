package com.java.day3;

public class DoubleInterface {
    void speed(){
        System.out.println("Speed of the two wheel is calculated");
    }
    void show(){
        System.out.println("Wheels in fourwheeler is identified");
    }

    public static void main(String[] args){
        DoubleInterface doubleInterface = new DoubleInterface();
        doubleInterface.speed();
        doubleInterface.show();
    }
}

interface Vehicle1{
    public void start();
}

interface twowheel extends Vehicle1{
    public void speed();
}
interface fourwheel extends Vehicle1{
    public void show();
}
