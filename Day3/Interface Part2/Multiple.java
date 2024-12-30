package com.java.day3;

interface Printer{
    public void print();
}
interface Scanner1{
    public void scan();
}

public class Multiple implements  Printer ,Scanner1{
    public void print() {
        System.out.println("Printer has been Called");
    }
    public void scan() {
        System.out.println("Scanner has been Called");
    }

    public static void main(String[] args) {
        Multiple multiple = new Multiple();
        multiple.print();
        multiple.scan();
    }
}
