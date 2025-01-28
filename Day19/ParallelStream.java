import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        List<Integer> numberArray = new ArrayList<>();
        for(int i =25;i<=75;i++){
            numberArray.add(i);
        }
        numberArray.stream()
                .parallel()
                .filter(num-> num>50)
                .map(num->num*num)
                .limit(10)
                .forEach(System.out::println);
    }
}
