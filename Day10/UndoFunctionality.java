import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class UndoFunctionality {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;

        while(isTrue){
            System.out.print("1: Add-----");
            System.out.print("2: Undo-----");
            System.out.print("3: Display-----");
            System.out.println("4: Exit");
            System.out.println("Enter the choise");
            int choice = sc.nextInt();

            sc.nextLine();
            switch (choice) {
                case 1:
                        System.out.println("Enter a Name to add");
                        String s =  sc.nextLine();
                        stack.push(s);
                        System.out.println("Added");
                        break;

                case 2:
                        stack.pop();
                        System.out.println("UNDO Successfully");
                        break;

                case 3:
                        System.out.println(stack);
                        break;
                case 4:
                        isTrue = false;
                        break;
                default:
                    break;
            }
        }
    }
}
