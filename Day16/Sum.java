import java.util.function.BiConsumer;

public class Sum{
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> printSum = (a, b) -> 
            System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        int num1 = 3;
        int num2 = 5;

        printSum.accept(num1, num2);
    }
}
