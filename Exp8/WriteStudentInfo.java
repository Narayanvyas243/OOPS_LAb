import java.io.*;
import java.util.Scanner;

public class WriteStudentInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = input.nextLine();
        System.out.print("Enter roll number: ");
        String rollNumber = input.nextLine();
        System.out.print("Enter grade: ");
        String grade = input.nextLine();

        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            writer.close();
            System.out.println("Student information written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}