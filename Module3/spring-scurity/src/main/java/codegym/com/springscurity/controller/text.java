package codegym.com.springscurity.controller;

import codegym.com.springscurity.model.Role;
import codegym.com.springscurity.model.User;
import codegym.com.springscurity.repository.RoleRepository;
import codegym.com.springscurity.services.RoleService;
import codegym.com.springscurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class text {
    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;

    @GetMapping("/")
    public ModelAndView homePage(){

        return new ModelAndView("index");
    }

    @GetMapping("/login")
    public ModelAndView loginPage(){

        List<Role> roles = roleService.findAllRole();
        List<User> users = userService.findAllUser();
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("listUser",users);
        modelAndView.addObject("list",roles);
        return modelAndView;
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
