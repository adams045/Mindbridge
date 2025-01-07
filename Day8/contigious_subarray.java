import java.util.*;
public class contigious_subarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int start=0;
        int end=0;
        int max=0;
        for(int i=0;i<len;i++){
            int high=0;
            for(int j=i;j<len;j++){
                high=high+arr[j];
                if(high>max){
                    start=i;
                    end=j;
                    max=high;
                }
            }
        }
        System.out.println(max);
    }
}