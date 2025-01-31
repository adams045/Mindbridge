package ManagementSystem;

import java.io.*;
import java.util.*;


// This Class is used to Read and Write the Data from the Csv file using BufferedReader and BufferedWriter

public class StudentFileReadWrite {
    private static final String FILE_NAME = "studentsData.csv";

    public List<Student> readFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String value;
            
            //This Line is to skip the first line
            br.readLine();
            while ((value = br.readLine()) != null) {
                students.add(Student.fromFile(value));
            }
        } catch (IOException e) {
            System.out.println();
        }
        return students;
    }

    
    public void saveToFileAsync(List<Student> students) {
        new Thread(() -> saveToFile(students)).start();
    }
    
    public void saveToFile(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            File file = new File(FILE_NAME);
            if (file.length() == 0) {
                bw.write("Std_id,Std_name,Std_age,Std_CGPA,Std_grade,Std_email");
                bw.newLine();
            }

            for (Student student : students) {
                bw.write(student.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
