import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100!=0 || year%400==0){
                System.out.print("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
    }
}
