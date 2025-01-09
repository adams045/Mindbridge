import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetProgram {

    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;

        while(isTrue){
            System.out.print("1: Add-----");
            System.out.print("2: Display-----");
            System.out.println("3: Exit");
            System.out.println("Enter the choise");
            int choice = sc.nextInt();

            sc.nextLine();
            switch (choice) {
                case 1:
                        System.out.println("Enter a Name to add");
                        String s =  sc.nextLine();
                        set.add(s);
                        System.out.println("Added");
                        break;
                case 2:
                        System.out.print(set.toString());
                        System.out.println();
                        break;
                case 3:
                        isTrue = false;
                        break;
                default:
                    break;
            }
        }
    }
}