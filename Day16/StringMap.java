import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;

public class StringMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java");
        Function<String, Integer> stringMap = String::length;
        List<Integer> lengths = strings.stream()
                                       .map(stringMap)
                                       .collect(Collectors.toList());
        System.out.println(lengths);
    }
}
