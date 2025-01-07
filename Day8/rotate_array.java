import java.util.Arrays;
import java.util.Scanner;

public class rotate_array {

    public int[] show(int[]arr,int key){
        while(key>0){
            int n=arr.length;
            int end=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=end;
            key--;
        }
        return arr;
    }
    public static void main(String[] args) {
        rotate_array r = new rotate_array();
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(Arrays.toString(r.show(arr, key)));
    }
}