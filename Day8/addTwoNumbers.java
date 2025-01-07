import java.util.Scanner;

public class addTwoNumbers {

    public String show(int[] arr , int target){

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    return "["+i+","+j+"]";
                }
            }
        }

        return "-1";
    }
    public static void main(String[] args) {
        addTwoNumbers add  = new addTwoNumbers();
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]= new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(add.show(arr,target));

    }
}
