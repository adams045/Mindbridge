import java.util.Scanner;

public class calculator {
    
    public int add(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    public double add(double num1, double num2){
        double sum = num1+num2;
        return sum;
    }
    public int add(int arr[]){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }


    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(8,10));
        System.out.println(obj.add(16.34, 12.25));
        int arr[]={2,4,5,6,8};
        System.out.println(obj.add(arr));
    }
}
