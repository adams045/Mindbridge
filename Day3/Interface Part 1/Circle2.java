package com.java.day3;

interface Constants{
    static double PI=3.14;
}

public class Circle2 implements Constants{
    public static void main(String[] args) {
        int radius = 3;
        System.out.println(PI*radius*radius);
    }
}
