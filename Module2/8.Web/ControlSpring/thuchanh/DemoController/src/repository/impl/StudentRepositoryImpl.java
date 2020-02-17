package repository.impl;

import Dao.StudentDao;
import entity.Student;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public List<Student> getAll() {
        List<Student> list = new ArrayList<>(StudentDao.listStudent.values());
        return list;
    }

    @Override
    public Student getById(int id) {
        return StudentDao.listStudent.get(id);
    }

    @Override
    public void deleteById(int id) {
        StudentDao.listStudent.remove(id);
    }

    @Override
    public void save(Student student) {
        StudentDao.listStudent.put(student.getId(),student);
    }
}
