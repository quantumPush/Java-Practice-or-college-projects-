import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter ID:");
            int id = sc.nextInt();

            System.out.println("Enter Name:");
            String name = sc.next();

            System.out.println("Enter Marks:");
            int marks = sc.nextInt();

            students[i] = new Student(id, name, marks);
        }

        System.out.println("\nID\tName\tMarks");
        for (Student s : students) {
            s.display();
        }
    }
}
