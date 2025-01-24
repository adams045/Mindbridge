import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    List<Integer> marks;
    String department;
    String grade;

    public Student(String name, List<Integer> marks, String department) {
        this.name = name;
        this.marks = marks;
        this.department = department;
    }

    public double getAverageMarks() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public void assignGrade() {
        double average = getAverageMarks();
        if (average >= 85) {
            this.grade = "A";
        } else if (average >= 70) {
            this.grade = "B";
        } else if (average >= 50) {
            this.grade = "C";
        } else {
            this.grade = "D";
        }
    }

    @Override
    public String toString() {
        return name + " (Avg: " + getAverageMarks() + ", Grade: " + grade + ")";
    }
}

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", Arrays.asList(85, 90, 80, 70, 95), "Computer Science"),
            new Student("Bob", Arrays.asList(60, 65, 70, 75, 80), "Mathematics"),
            new Student("Charlie", Arrays.asList(40, 45, 35, 50, 55), "Physics"),
            new Student("David", Arrays.asList(90, 85, 95, 88, 92), "Computer Science"),
            new Student("Eve", Arrays.asList(55, 60, 50, 65, 70), "Mathematics"),
            new Student("Frank", Arrays.asList(30, 40, 20, 50, 35), "Physics")
        );
        students.forEach(Student::assignGrade);

        
        List<Student> topStudents = students.stream()
            .sorted(Comparator.comparingDouble(Student::getAverageMarks).reversed())
            .limit(3)
            .collect(Collectors.toList());

        System.out.println("Top 3 Students:");
        topStudents.forEach(System.out::println);

 
        Map<String, Double> averageMarksPerDepartment = students.stream()
            .collect(Collectors.groupingBy(
                student -> student.department,
                Collectors.averagingDouble(Student::getAverageMarks)
            ));

        System.out.println("\nAverage Marks Per Department:");
        averageMarksPerDepartment.forEach((department, avgMarks) -> 
            System.out.println(department + ": " + avgMarks)
        );

        
        Map<String, Optional<Student>> topStudentPerDepartment = students.stream()
            .collect(Collectors.groupingBy(
                student -> student.department,
                Collectors.maxBy(Comparator.comparingDouble(Student::getAverageMarks))
            ));

        System.out.println("\nTop Student in Each Department:");
        topStudentPerDepartment.forEach((department, topStudent) -> 
            System.out.println(department + ": " + topStudent.orElse(null))
        );

     
        Map<String, Long> failingStudentsPerDepartment = students.stream()
            .filter(student -> student.getAverageMarks() < 50)
            .collect(Collectors.groupingBy(
                student -> student.department,
                Collectors.counting()
            ));

        System.out.println("\nFailing Students");
        failingStudentsPerDepartment.forEach((department, count) -> 
            System.out.println(department + ": " + count)
        );
    }
}
