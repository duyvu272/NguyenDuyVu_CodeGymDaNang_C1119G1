package service;

import entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentbyId(int id);
    void deleteaById(int id);
    void save(Student student);
}
