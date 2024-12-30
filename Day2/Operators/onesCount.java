import java.util.*;
public class onesCount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int value = (num/2)+1;
        int a[]= new int[value];

        while(num!=0){
            int rem=num%2;
            a[--value]=rem;
            num/=2;
        }
        for(int i:a){
            if(i==1){
                count++;
            }
        }
        System.out.print(count);
    }
}