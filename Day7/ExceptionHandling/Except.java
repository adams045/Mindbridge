import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println(num1/num2);
        }
        catch (InputMismatchException e){
            System.out.println("Please enter numerical values");
        }
        catch (ArithmeticException e){
            System.out.println("Divison by zero not allowed");
        }
        catch (Exception e){
            System.out.println("An error occured");
        }

    }

}
