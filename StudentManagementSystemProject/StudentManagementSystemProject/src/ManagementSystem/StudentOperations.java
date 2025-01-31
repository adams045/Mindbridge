package ManagementSystem;

import java.util.*;


//This Class Performs the CRUD Operations(i.e., Create,Read,Update,Delete)
//And also performs specific tasks such as Search by Std_id

public class StudentOperations {
    private List<Student> students;
    private StudentFileReadWrite fileHandler;

    public StudentOperations(StudentFileReadWrite fileHandler) {
        this.fileHandler = fileHandler;
        this.students = fileHandler.readFile();
    }
    
    
    // This addStudent method First add the student to the List and Sort it using Comparator with the values in the List
    public void addStudent(Student student) {
        students.add(student);
        students.sort(Comparator.comparingInt(Student::getId));
        fileHandler.saveToFileAsync(students);
        System.out.println("Student added successfully.");
    }

    public void getAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo students found.");
            return;
        }

        System.out.println("\n==================== Student List ====================");
        System.out.println("ID   Name   Age   CGPA   Grade  Email");
        System.out.println("------------------------------------------------------");

        for (Student student : students) {
            System.out.println(student.getId() + "    " + student.getName() + 
                               "    " + student.getAge() + "    " + 
                               student.getCgpa() + "    " + student.getGrade() + "    " + 
                               student.getEmail());
        }
        System.out.println("=======================================================");
    }

    public Optional<Student> searchStudentById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst();
    }

    public void updateStudent(int id, String name, Integer age, Float cgpa, String grade, String email) {
        searchStudentById(id).ifPresent(student -> {
            if (name != null)
            	student.setName(name);
            if (age != null)
            	student.setAge(age);
            if (cgpa != null)
            	student.setCgpa(cgpa);
            if (grade != null)
            	student.setGrade(grade);
            if (email != null)
            	student.setEmail(email);
            fileHandler.saveToFileAsync(students);
            
            System.out.println("Student Details Updated Successfully");
        });
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        fileHandler.saveToFileAsync(students);
        
        System.out.println("\nStudent ID-"+ id + ": Has been Deleted");
    }
}
