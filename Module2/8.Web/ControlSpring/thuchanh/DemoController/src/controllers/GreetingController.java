package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class GreetingController {

    @GetMapping(value = "/hello/{id}")
    public String handle(Model model,
                         @PathVariable(name = "id") Integer id) {
        model.addAttribute("id", id);
        model.addAttribute("message", "Hello World!");
        return "index";
    }
}
