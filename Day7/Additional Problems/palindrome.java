import java.util.Scanner;

public class palindrome {

    public boolean palindrom(String s){
        int length=s.length();
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            return true;
        }
        else{
            StringBuilder sb1= new StringBuilder(s).deleteCharAt(length-1);
            StringBuilder sb2 = sb1;
            System.out.println(sb1.toString());
            sb2.reverse();
            System.out.println(sb2.toString());
            if(sb1.toString().equals(sb2.toString())){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        palindrome pd = new palindrome();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(pd.palindrom(s));
    }
}