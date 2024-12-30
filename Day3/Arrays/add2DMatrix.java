package com.java.day3;
import java.util.*;
public class add2DMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr1[][]= new int[2][2];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j< arr1.length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[2][2];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j< arr2.length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        int finalArray[][]=new int[2][2];

        for(int i=0;i< arr1.length;i++){
            for(int j=0; j< arr1.length;j++){
                finalArray[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<finalArray.length;i++){
            for(int j=0;j< finalArray.length;j++){
                System.out.print(finalArray[i][j]+" ");
            }
            System.out.println();
        }

    }
}
