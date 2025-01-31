# Student Management System

This is a simple **Student Management System** built using **Java**. It allows you to manage student records with the ability to add, update, delete, and view students. The system calculates the grade automatically based on the student's CGPA. Data is stored in a CSV file and read using multithreading for efficient performance.

## Features:
- Add, update, delete, and view student records.
- Automatically calculate grades based on CGPA.
- Data stored in a CSV file (`students.csv`).
- Multithreaded saving process for efficiency.
- Simple and interactive console interface.

## Class Breakdown:

### 1. **Student**
The `Student` class represents a student with the following attributes:
- `id` (int): The unique identifier for the student.
- `name` (String): The name of the student.
- `age` (int): The age of the student.
- `cgpa` (float): The CGPA of the student.
- `grade` (String): The grade calculated based on the CGPA.
- `email` (String): The email address of the student.

#### Methods:
- `calculateGrade(float cgpa)`: Calculates the grade based on the CGPA.
- `toString()`: Converts the student data into a CSV string format for easy storage.
- `fromFile(String file)`: Creates a `Student` object from the CSV file data.

### 2. **StudentFileReadWrite**
The `StudentFileReadWrite` class handles the reading and writing of student data from and to a CSV file (`studentsData.csv`).

#### Methods:
- `readFile()`: Reads student data from the file and returns a list of `Student` objects.
- `saveToFile(List<Student> students)`: Writes the list of students to the file. Uses multithreading to improve efficiency during the save process.

### 3. **StudentOperations**
The `StudentOperations` class provides methods for managing student records. It interacts with the `StudentFileReadWrite` class to read and save data.

#### Methods:
- `addStudent(Student student)`: Adds a new student to the list and saves the updated list to the file.
- `getAllStudents()`: Retrieves all students and displays them in a readable format.
- `searchStudentById(int id)`: Searches for a student by their ID.
- `updateStudent(int id, String name, int age, float cgpa, String email)`: Updates the details of an existing student.
- `deleteStudent(int id)`: Deletes a student by their ID.

### 4. **StudentManagementSystem**
The `StudentManagementSystem` class is the entry point for the application. It provides an interactive console interface for the user to manage student records.

#### Features:
- A simple text-based menu to choose operations such as:
  - Add a new student.
  - View all students.
  - Search for a student by ID.
  - Update student details.
  - Delete a student.
- Uses the `StudentService` class to perform operations.

## Below is the Demo code Video:
