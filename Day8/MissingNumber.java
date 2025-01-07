import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

    public int show(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(missingNumber.show(arr));


    }
}
