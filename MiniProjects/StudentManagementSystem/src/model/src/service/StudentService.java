package service;

import model.Student;

public class StudentService {

    public void addStudent() {
        Student s1 = new Student(1, "Rohini", 21);
        s1.display();
    }
}
