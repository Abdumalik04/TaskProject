package service.impl;

import Gender.Gender;
import db.DataBase;
import model.Student;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentImpl implements StudentService {
    DataBase dataBase=new DataBase();
    @Override

    public String addStudent(Student student) {
        dataBase.getStudents().add(student);
        return null;
    }

    @Override
    public Student getStudentById() {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public String updateStudentFullName() {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        return null;
    }

    @Override
    public void deleteStudentById() {

    }
}
