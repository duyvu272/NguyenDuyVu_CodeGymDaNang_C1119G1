package Dao;

import entity.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDao {
    public static Map<Integer, Student> listStudent;
    static {
        listStudent = new HashMap<>();
        listStudent.put(1, new Student(1, "Hung","Nghe An"));
        listStudent.put(2, new Student(2, "Trieu","Quang Ngai"));
        listStudent.put(3, new Student(3, "Toan","Da Nang"));
        listStudent.put(4, new Student(4, "Kien","Nam O"));
    }
}
