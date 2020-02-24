package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ConvertCurrency  {

    @GetMapping(value = "/greeting")
    public ModelAndView inputValue(){
        return new ModelAndView("index");
    }

@RequestMapping(value ="/convert",method = RequestMethod.POST)
    public ModelAndView convert(HttpServletRequest request){
        String s = request.getParameter("usd");
        float m = Float.parseFloat(request.getParameter("usd"))*20000;
        ModelAndView modelAndView = new ModelAndView("index","ketqua",m);
        modelAndView.addObject("usds",s);
        return modelAndView;
}
}
