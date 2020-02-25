package com.codegym.case_study_2.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");

    }

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("User/login");
    }

    @GetMapping("/register")
    public ModelAndView register(){
        return new ModelAndView("User/register");
    }
}
