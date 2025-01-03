import java.util.Scanner;

public class String_problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        int count = one.compareTo(two);
        if(count==0){
            System.out.println("Equal");
        }
        else if(count<0){
            System.out.println("2nd is higher");
        }
        else{
            System.out.println("1st is higher");
        }
        if(one.equals(two)){
            System.out.println("Equal(case-sensitive)");
        }
        else{
            System.out.println("Not Equal(case-sensitive)");
        }
        if(one.equalsIgnoreCase(two)){
            System.out.println("Equals(case-insensitive)");
        }
        else{
            System.out.println("Not Equal(case-insensitive)");
        }

        System.out.println(one+two);
    }
}