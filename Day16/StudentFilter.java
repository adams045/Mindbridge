import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("John", 75),
            new Student("Alice", 55),
            new Student("Mark", 88)
        );
        Predicate<Student> gradeAbove60 = student -> student.getGrade() > 60;
        List<Student> filteredStudents = filterStudents(students, gradeAbove60);
        filteredStudents.forEach(student -> System.out.println(student.getName()));
    }
    public static List<Student> filterStudents(List<Student> list, Predicate<Student> predicate) {
        List<Student> filteredList = new ArrayList<>();
        for (Student student : list) {
            if (predicate.test(student)) {
                filteredList.add(student);
            }
        }
        return filteredList;
    }
}
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
