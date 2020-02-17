package service.impl;

import entity.Student;
import repository.StudentRepository;
import repository.impl.StudentRepositoryImpl;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAll();
    }

    @Override
    public Student getStudentbyId(int id) {
        return studentRepository.getById(id);
    }

    @Override
    public void deleteaById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
}
