package controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping(value = "/greeting")
    public ModelAndView getPageGreeting(){
        String name = "Hello CodeGym";
        ModelAndView modelAndView = new ModelAndView("index","name",name);
        modelAndView.addObject("message", "Thanh toan thanh cong");
        return modelAndView;
    }
}
