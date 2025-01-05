import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int count=0;
        StringBuffer sb = new StringBuffer(s2);
        while(s1.contains(sb.toString())){
            count++;
            // sb.append(s2);
            System.out.println(sb.append(s2));
        }
        System.out.println(count);
    }
}
