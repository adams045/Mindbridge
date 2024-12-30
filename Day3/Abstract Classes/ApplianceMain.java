package com.java.day3;

abstract  class Appliance{
    abstract void turnOn();

    public void turnOff(){
        System.out.println("Fan Turned Off");
    }
}
public class ApplianceMain extends Appliance{
    void turnOn(){
        System.out.println("Fan Turned On");
    }

    public static void main(String[] args) {
        ApplianceMain applianceMain = new ApplianceMain();
        applianceMain.turnOn();
    }
}
