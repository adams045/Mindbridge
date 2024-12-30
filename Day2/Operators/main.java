import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if( num==2){
            System.out.println("Prime Number");
        }
        else if(num==1){
            System.out.println("Neither Composite Nor Prime Number");
        }
        else if(num>2){
            for(int i=1;i<=(num/2);i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime Number");
            }
        }
        else{
            System.out.print("Input is Wrong");
        }
    }
}