import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenNumberFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(52, 35, 12, 48, 64);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> evenNumbers = filterList(numbers, isEven);
        System.out.println(evenNumbers);
    }
    public static List<Integer> filterList(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}
