package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Caculation {
    @GetMapping("/greeting")
    public String home() {
        return "index";
    }

    @RequestMapping("op")
    public ModelAndView implementC(@RequestParam("operator") String op1,
                                   @RequestParam("num1") Integer nu1,
                                   @RequestParam("num2") Integer nu2) {
        float result = 0;
        switch (op1) {
            case "cong":
                result = nu1 + nu2;
                break;
            case "tru":
                result = nu1 - nu2;
                break;
            case "chia":
                result = nu1 / nu2;
                break;
            case "nhan":
                result = nu1 * nu2;
                break;
            default:

        }
        return new ModelAndView("index", "sum", result);
    }
}
