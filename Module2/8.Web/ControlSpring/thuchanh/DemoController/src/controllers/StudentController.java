package controllers;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;
import service.impl.StudentServiceImpl;

import java.util.List;

@Controller
public class StudentController {
    StudentService studentService = new StudentServiceImpl();

    @GetMapping("/students")
    public ModelAndView getListStudent(Model model){
        List<Student>  list = studentService.getAllStudents();
        ModelAndView modelAndView = new ModelAndView("listStudent", "listStudent", list);
        return modelAndView;
    }

    @GetMapping("student/delete/{id}")
    public String DeleteStudent(@PathVariable(name = "id")int id, Model model){
        studentService.deleteaById(id);
        return "redirect:/students/";
    }

    @GetMapping("student/addnew")
    public ModelAndView getNewStudent(){
        ModelAndView modelAndView = new ModelAndView("addnew", "student", new Student());
        return modelAndView;
    }

    @PostMapping("/student/addnew")
    public String addnewStudent(@ModelAttribute(name = "student")Student student){
        studentService.save(student);
        return "redirect:/students/";
    }
}
