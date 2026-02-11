package controller;

import java.util.Scanner;
import service.StudentService;

public class StudentController {

    public void start() {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;
        do {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. View Student");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.showStudent();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 2);
    }
}
