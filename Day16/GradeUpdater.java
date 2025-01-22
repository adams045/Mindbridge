import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GradeUpdater {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("John", 70),
            new Student("Alice", 60)
        );
        Consumer<Student> increaseGrade = student -> student.setGrade(student.getGrade() + 10);
        updateGrades(students, increaseGrade);
        students.forEach(System.out::println);
    }
    public static void updateGrades(List<Student> students, Consumer<Student> consumer) {
        for (Student student : students) {
            consumer.accept(student);
        }
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

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}
