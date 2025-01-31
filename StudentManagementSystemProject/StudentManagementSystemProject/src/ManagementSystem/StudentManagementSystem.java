package ManagementSystem;

import java.util.*;


// This Class Builds the Base Logic for all the Operations

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentFileReadWrite fileHandler = new StudentFileReadWrite(); 
        StudentOperations operation = new StudentOperations(fileHandler);
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	 System.out.println("\n--------------------------------------------");
             System.out.println("           STUDENT MANAGEMENT SYSTEM        ");
             System.out.println("--------------------------------------------");
             System.out.println("1. Add Student");
             System.out.println("2. View Students");
             System.out.println("3. Search Student");
             System.out.println("4. Update Student");
             System.out.println("5. Delete Student");
             System.out.println("6. Exit");
             System.out.println("--------------------------------------------");
             System.out.print("Choose an option: ");
             float cgpa =0;
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                	System.out.println("\nEnter Student Details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("CGPA(Out of 10): ");
                    boolean isTrue = true;
                    while(isTrue) {
                    	 cgpa = scanner.nextFloat();
                    	 if(cgpa<=10 && cgpa>0) {
                    		 isTrue = false;
                    	 }
                    	 else {
                    		 System.out.println("Enter the Mark Between 0 - 10");
                    		 System.out.print("Enter CGPA(Out of 10): ");
                    	 }
                    }
                    String grade ="";
                    if(cgpa>=9)
                    	grade="O";
                    else if (cgpa>=8) {
						grade="A+";
					}
                    else if (cgpa>=7) {
						grade="A";
					}
                    else if (cgpa>=6) {
						grade="B";
					}
                    else if (cgpa>=5) {
						grade="C";
					}
                    else if (cgpa<5) {
						grade="F";
					}
                    
                    scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    operation.addStudent(new Student(id, name, age, cgpa, grade,email));
                    break;

                case 2:
                    operation.getAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = scanner.nextInt();
                    operation.searchStudentById(searchId)
                        .ifPresentOrElse(System.out::println, () -> System.out.println("Student not found."));
                    break;

                case 4:
                    System.out.print("Enter Student ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    // This is prompted to user in which they can able to modify and at the same time can leave as it is.
                    
                    System.out.print("Enter New Name (or press Enter to skip): ");
                    String newName = scanner.nextLine();
                    
                    System.out.print("Enter New Age (or press Enter to skip): ");
                    String ageInput = scanner.nextLine();
                    Integer newAge = ageInput.isEmpty() ? null : Integer.parseInt(ageInput);
                    
                    System.out.print("Enter New Marks (or press Enter to skip): ");
                    String marksInput = scanner.nextLine();
                    Float newCgpa = marksInput.isEmpty() ? null : Float.parseFloat(marksInput);
                    
                    System.out.print("Enter New Grade (or press Enter to skip): ");
                    String newGrade = scanner.nextLine();
                    
                    System.out.print("Enter New Email (or press Enter to skip): ");
                    String newEmail = scanner.nextLine();
                    
                    operation.updateStudent(updateId, newName.isEmpty() ? null : newName, newAge, newCgpa, newGrade.isEmpty() ? null : newGrade, newEmail.isEmpty() ? null : newEmail);
                    break;

                case 5:
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    operation.deleteStudent(deleteId);
                    break;

                case 6:
                    scanner.close();
                    System.out.println("Program Ended!..");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
