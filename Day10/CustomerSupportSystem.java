import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportSystem {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        boolean isTrue = true;

        while(isTrue){
            System.out.print("1: Add-----");
            System.out.print("2: Serve-----");
            System.out.print("3: Display-----");
            System.out.println("4: Exit");
            System.out.println("Enter the choise");
            int choice = sc.nextInt();

            sc.nextLine();
        switch (choice) {
            case 1:
                    System.out.println("Enter a Element to add");
                    String s =  sc.nextLine();
                    queue.add(s);
                    System.out.println("Added");
                    break;
            case 2:
                    String serve= queue.poll();
                    System.out.println("Served: "+ serve);
                    break;
            case 3:
                    for(String i : queue)
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
