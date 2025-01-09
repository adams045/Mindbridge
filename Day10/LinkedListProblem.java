import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProblem {

    public void show(){
           }
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedListProblem obj = new LinkedListProblem();
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;

        while(isTrue){
            System.out.print("1: Add-----");
            System.out.print("2: Remove-----");
            System.out.print("3: Display-----");
            System.out.println("4: Exit");
            System.out.println("Enter the choise");
            int choice = sc.nextInt();

            sc.nextLine();
            switch (choice) {
                case 1:
                        System.out.println("Enter a Element to add");
                        String s =  sc.nextLine();
                        linkedList.add(s);
                        System.out.println("Added");
                        break;
                case 2:
                        System.out.println("Enter the task to delete");
                        String st = sc.nextLine();
                        linkedList.remove(st);
                        System.out.println("Removed");
                        break;
                case 3:
                        for(String i : linkedList)
                        {
                            System.out.println(i);
                        }
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