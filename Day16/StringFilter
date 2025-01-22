import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        char letter = 'A';
        Predicate<String> startsWithLetter = s -> s.startsWith(String.valueOf(letter));
        List<String> filteredStrings = filterStrings(strings, startsWithLetter);
        System.out.println(filteredStrings);
    }
    public static List<String> filterStrings(List<String> list, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();
        for (String item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}
