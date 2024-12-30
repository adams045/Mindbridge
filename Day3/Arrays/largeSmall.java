package com.java.day3;
import java.util.*;
public class largeSmall {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Smallest Element: "+ arr[0]);
        System.out.println("Largest Element: "+ arr[n-1]);
    }
}
