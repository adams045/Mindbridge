import java.util.*;
public class jumpMultipleFive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%5==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
