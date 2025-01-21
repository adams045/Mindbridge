import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }
}

public class StudentList {
    public static void sortStudentsByGpa(List<Student> students) {
        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));  // Sorting in descending order using lambda
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 3.8),
                new Student("Bob", 3.5),
                new Student("Charlie", 3.9),
                new Student("David", 3.7)
        ));

        sortStudentsByGpa(students);
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
        }
    }
}
