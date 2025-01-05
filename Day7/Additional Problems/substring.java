import java.util.*;
public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[]={"a","abc","bc","d"};
        String word = "abc";
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(word.contains(arr[i])){
                count++;
            }
        }
        System.out.println(count     );

    }
}
