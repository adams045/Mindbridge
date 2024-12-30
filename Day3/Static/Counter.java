package com.java.day3;

public class Counter {
    static private int count=0;

    public Counter(){
        count++;
    }
    public static int show(){
        return count;
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println(Counter.show());
    }
}
