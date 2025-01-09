import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProgram {

    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("1: -----Add-----");
        System.out.print("2: Update Grade-----");
        System.out.println("3: Retrive Name-----");
        System.out.println("4: Display-----");

        System.out.println("Enter the Choise");
        boolean isTrue = true;

        // sc.nextLine();
        while(isTrue){
            System.out.print("1: -----Add-----");
            System.out.print("2: Retrive Name-----");
            System.out.print("3: Display-----");
            System.out.println("4: Exit-----");

        System.out.println("Enter the Choise");
            
            int choice = sc.nextInt();
            

            switch (choice) {
                case 1:

                    System.out.println("Enter the Student Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter the Students Grade");
                    int mark = sc.nextInt();
                    sc.nextLine();
                    if(map.containsKey(name)){
                        map.replace(name, mark);
                        break;
                    }
                    else{
                        map.put(name, mark);
                        break;
                    }
                case 2:
                    
                    System.out.println("Enter the students name to retrieve grade");
                    String str = sc.next();

                    if(map.containsKey(str)){
                        System.out.println(map.get(str));
                    }
                    else{
                        System.out.println("No Student Found");
                    }
                    break;

                case 3:
                    
                    System.out.println(map);
                    break;

                case 4:

                    break;

                default:
                    break;
            }
        }
    }
}