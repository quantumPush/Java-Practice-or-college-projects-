package main;

import service.StudentService;

public class MainApp {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.showStudent();
    }
}
