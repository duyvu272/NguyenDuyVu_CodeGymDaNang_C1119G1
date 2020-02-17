package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DirectoryEV {

    @GetMapping(value = "/greeting")
    public String homePage(){
        return "index";
    }

    @RequestMapping(value = "/input",method = RequestMethod.POST)
    public ModelAndView translate(@RequestParam("english")String word){
        //String word = request.getParameter("english");
        Map<String,String> books = new HashMap<>();
        books.put("hello","xin chào");
        books.put("chicken","gà");
        books.put("cow","bò");
        books.put("dog","chó");
        String translate = books.get(word);
        ModelAndView modelAndView = new ModelAndView("index","vn",translate);
        modelAndView.addObject("en",word);
        return modelAndView;
    }


}
