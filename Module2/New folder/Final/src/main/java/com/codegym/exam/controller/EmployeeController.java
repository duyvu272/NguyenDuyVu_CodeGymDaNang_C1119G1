package com.codegym.exam.controller;

import com.codegym.exam.model.Employee;
import com.codegym.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;


    @GetMapping("/employees")
    public ModelAndView vewList(@RequestParam("search") Optional<String> name, Pageable pageable) {
        Page<Employee> Employees;
        ModelAndView modelAndView = new ModelAndView("employees");
        if (name.isPresent()) {
            Employees = service.findByName(name.get(), pageable);
            modelAndView.addObject("nameEmployee", name);
        } else {
            Employees = service.findAll(pageable);
        }
        modelAndView.addObject("listEmployee", Employees);

        return modelAndView;
    }

    @GetMapping("/addNewEmployee")
    public ModelAndView viewAdd() {

        return new ModelAndView("create_employee", "employee", new Employee());
    }

    @PostMapping("/employee/save")
    public String addNewEmployee(@Validated Employee Employee, BindingResult result, RedirectAttributes attributes) {
        new Employee().validate(Employee, result);

        if (result.hasErrors()) {
            return "create_employee";
        } else {
            service.save(Employee);
            attributes.addFlashAttribute("mess", "add successfully");
        }
        return "redirect:/employees";
    }

    @PostMapping("/employee/saveEdit")
    public String editEmployee(Employee employee, RedirectAttributes attributes) {
        service.save(employee);
        attributes.addFlashAttribute("mess", "Edit successfully");

        return "redirect:/employees";
    }

    @GetMapping("/employee/{id}/edit")
    public ModelAndView viewEdit(@PathVariable("id") Long id) {
        return new ModelAndView("edit_employee", "employeeEd", service.findByIdL(id));
    }

    @GetMapping("/employee/{id}/delete")
    public ModelAndView viewDelete(@PathVariable("id") Long id) {
        return new ModelAndView("delete_employee", "employee", service.findByIdL(id));
    }

    @GetMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Long id, RedirectAttributes attributes) {
        service.delete(id);
        attributes.addFlashAttribute("mess", "Delete successfully");
        return "redirect:/employees";
    }


}
