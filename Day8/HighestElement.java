import java.util.Arrays;
import java.util.Scanner;

public class HighestElement {

    public int[] show(int[] arr){
        int arr2[] = new int[arr.length];
        arr2[arr.length-1]=-1;
        for(int i=0;i<arr.length-1;i++){
            int max=arr[i];
            for(int j=i+1;j<arr.length;j++){
                   if(arr[j]>max){
                        max=arr[j];
                        break;
                   } 
            }
            if(max==arr[i]){
                arr2[i]= -1;
            }
            else
                arr2[i]=max;
        }
        return arr2;
    }
    public static void main(String[] args) {
        HighestElement highestElement = new HighestElement();
        Scanner sc=new Scanner(System.in);
        int len = sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(highestElement.show(arr)));
    }
}