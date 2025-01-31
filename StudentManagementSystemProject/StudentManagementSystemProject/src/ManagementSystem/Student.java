package ManagementSystem;

import java.io.Serializable;

// This Class is created for the Purpose of creating and initializing the variables using 
// constructor,getter and setters. And overriding toString method to write into the file as
// CSV(Comma Separated Values) format. And Serializing which is used to convert Bytes to Java Objects.

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private float cgpa;  
    private String grade;  
    private String email;

    public Student(int id, String name, int age, float cgpa,String grade,String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.email = email;
        this.grade = calculateGrade(cgpa);
    }

    private String calculateGrade(float cgpa) {
        if (cgpa >= 9)
        	return "O";
        else if (cgpa >= 8)
        	return "A+";
        else if (cgpa >= 7)
        	return "A";
        else if (cgpa >= 6)
        	return "B";
        else if (cgpa >= 5)
        	return "C";
        return "F";
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + cgpa + "," + grade + "," + email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
        this.grade = calculateGrade(cgpa);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Student fromFile(String file) {
        String[] data = file.split(",");
        float cgpa = 0;

        try {
        	// As it is a Static method Cannot parse before the value Submission
            cgpa = Float.parseFloat(data[3]);
        } catch (NumberFormatException e) {
            System.out.println(); //Which Leaves a First Line while Running
            
            // Marked 0 if the marks are not a valid number
            cgpa = 0; 
        }

        return new Student(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                Float.parseFloat(data[3]),  // CGPA as float
                data[4], // Grade
                data[5]
            );
    }

}
