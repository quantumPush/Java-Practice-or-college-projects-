package main;

import controller.StudentController;

public class MainApp {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.start();
    }
}
