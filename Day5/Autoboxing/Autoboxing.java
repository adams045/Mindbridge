import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        int sum =0;
        for(int i:num){
            sum+=i;
        }
        System.out.println(sum);
    }
}
