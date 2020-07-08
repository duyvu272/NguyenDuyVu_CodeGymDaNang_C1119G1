package com.example.springangular.controller;

import com.example.springangular.Service.userService;
import com.example.springangular.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Base64;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class userController {

    @Autowired
    userService userService;
//
//    @GetMapping("/")
//    public ModelAndView homePage(){
//        System.out.println(userService.findAllUser());
//    return new ModelAndView("index","list",userService.findAllUser());
//    }

    @PostMapping("/addUser")
    public String addUser(User user){
        userService.save(user);
        return "redirect:/";
    }

//    @GetMapping("/users")
//    public List<User> showUser(){
//        return userService.findAllUser();
//    }

//    @GetMapping("/login")
//    public boolean login(@RequestBody User user){
//        return user.getUsername().equals("user") && user.getPassword().equals("password");
//    }
//
//    @RequestMapping("/user")
//    public Principal user(HttpServletRequest request) {
//        String authToken = request.getHeader("Authorization")
//                .substring("Basic".length()).trim();
//        return () ->  new String(Base64.getDecoder()
//                .decode(authToken)).split(":")[0];
//    }
    @GetMapping("/")
    public ModelAndView homePage(){

        return new ModelAndView("index");
    }

    @GetMapping("/login")
    public ModelAndView loginPage(){
        return new ModelAndView("login");
    }

    @GetMapping("/admin")
    public ModelAndView adminPage(){
        return new ModelAndView("admin");
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }

    @GetMapping("/403")
    public ModelAndView deniedPage(){
        return new ModelAndView("403");
    }


}
