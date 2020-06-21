package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newStudentID;
        String newStudentName;

        System.out.println("Enter your students (or 0 to finish):");

        do {
            System.out.print("Student ID: ");
            newStudentID = input.nextInt();

            if (newStudentID != 0) {
                System.out.print("Name: ");
                newStudentName = input.next();
                students.put(newStudentID, newStudentName);

                // Read in the newline before looping back
                input.nextLine();
            }
        } while (newStudentID != 0);

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }
    }
}
