import java.util.Arrays;
import java.util.Scanner;

public class biker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int newArray[] = new int[len+1];
        newArray[0]=0;
        for(int i=0;i<len;i++){
            newArray[i+1]=newArray[i]+arr[i];
        }
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(newArray[len]);
    }
}
