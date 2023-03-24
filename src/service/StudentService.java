package service;

import model.Group;
import model.Student;

import java.util.List;

public interface StudentService {

    String addStudent(Student student);
    Student getStudentById();
    List<Student> getAllStudents();
    String updateStudentFullName();
    List<Student> filterByGender();
    void deleteStudentById();
}
