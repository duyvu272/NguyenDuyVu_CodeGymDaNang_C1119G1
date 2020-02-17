package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class SandwichChoice {
    @GetMapping("/greeting")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/choice")
    public ModelAndView choiceCondiment(@RequestParam(name = "condiments", required = true) String[] cd) {
        List<String> list = Arrays.asList(cd);
        System.out.println(list.size() + " - " + list);
        if (list.size() == 0 && list.equals("None")) {
            ModelAndView modelAndView = new ModelAndView("index", "mess", "No choice");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("index", "list", list);
            modelAndView.addObject("mess", "Sandwich with");
            return modelAndView;
        }
    }

}
