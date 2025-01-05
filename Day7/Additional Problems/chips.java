import java.util.Scanner;

public class chips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd=0;
        int even=0;
        int min=0;
        int len = sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(even<odd)
            min=even;
        else
            min=odd;
        System.out.println(min);
    }
}
