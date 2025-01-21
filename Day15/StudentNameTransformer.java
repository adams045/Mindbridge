import java.util.ArrayList;
import java.util.List;

public class StudentNameTransformer {
    public static List<String> transformNames(List<String> studentNames) {
        List<String> transformedNames = new ArrayList<>();
        for (String name : studentNames) {
            transformedNames.add("Student: " + name.toUpperCase());
        }
        return transformedNames;
    }

    public static void main(String[] args) {
        List<String> students = List.of("Aadams", "Shan", "Ram");
        List<String> transformedNames = transformNames(students);
        for (String name : transformedNames) {
            System.out.println(name);
        }
    }
}
