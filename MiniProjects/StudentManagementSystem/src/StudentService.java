packge service;
import model.Student;
import java.util.ArrayList;

public class StudntService{

private ArrayList<Student>studentList=new ArrayList<>();

public void addStudent(Student
student){
  studentList.add(student);
  System.out.println("Student Added Successfullu!");
}
  public void viewStudents(){
    if(studentList.isEmpty()){
      System.out.println("No students available.");
    }else{
      for(Student s:
          studentList){
        System.out.println(s);
      }
    }
  }
}
