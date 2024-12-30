package Day1;
import java.util.*;
public class Bitwise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println(((number>>2)));
        System.out.println((number<<2));
        System.out.println(number ^ number2);
    }
}
