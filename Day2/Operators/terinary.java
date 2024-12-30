import java.util.*;
public class terinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        int temp=n1;
        int ans=0;
        n1= n2>n3 ? n2 : n3;
        ans=temp>n1 ? temp : n1;
        System.out.println(ans);
    }    
}
