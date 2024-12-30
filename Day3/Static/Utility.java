package com.java.day3;
import java.util.*;
public class Utility {

    private String nameToUpper;

    public static String convertToUpper(String name){
        return name.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(Utility.convertToUpper(name));
    }
}
