import java.io.IOException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            float value = num1/num2;
            System.out.println(value);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        catch(NumberFormatException e){
            System.out.println("Please enter valid Integers");
        }
        catch(Exception e){
            System.out.println("An unexpected error occured");
        }
    }
}
