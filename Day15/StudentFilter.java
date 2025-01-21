import java.util.ArrayList;
import java.util.List;

public class StudentFilter {
    public static List<String> findStudentsByLetter(List<String> studentNames, char letter) {
        List<String> filteredStudents = new ArrayList<>();
        for (String name : studentNames) {
            if (name.charAt(0) == letter) {
                filteredStudents.add(name);
            }
        }
        return filteredStudents;
    }

    public static void main(String[] args) {
        List<String> students = List.of("Adams", "Bala", "Shan", "Arun", "Bob");
        char letter = 'A';
        List<String> result = findStudentsByLetter(students, letter);
        System.out.println("Students whose names start with '" + letter + "': " + result);
    }
}
