package Day1;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber; // Cast to double for accurate division
        int modulus = firstNumber % secondNumber;
        System.out.println("Addition: " + firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + product);
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + quotient);
        }
    }

