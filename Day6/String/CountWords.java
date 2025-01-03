import java.util.*;
public class CountWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String array[] = s.split(" ");
        System.out.println("Number of words: "+array.length);
        StringBuilder string = new StringBuilder(s);
        string.reverse();
        System.out.println(string.toString());
        String d= s.replaceAll("[AEIOUaeiou]","*");
        System.out.println("Replaced: "+ d);
    }
}