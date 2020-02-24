package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;



    @GetMapping("/category")
    public ModelAndView homeCate(Pageable pageable){
        ModelAndView modelAndView;
        modelAndView = new ModelAndView("category","cate",categoryService.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/create-category")
    public ModelAndView createCate(){
        ModelAndView modelAndView = new ModelAndView("create_category","category",new Category());
        return modelAndView;
    }
    @PostMapping("/create/saveCate")
    public String saveCategory(Category category){
        if(category.getId() == null){
            long id = (long) (Math.random()*100);
            category.setId(id);
            categoryService.save(category);
        }else{
            categoryService.save(category);
        }


        return "redirect:/create-category";
    }

    @RequestMapping("/category/{id}/edit")
    public ModelAndView editCate(@PathVariable("id") long id, Model model){
        //model.addAttribute("blog",serviceImplement.findByIdL(id));
        return new ModelAndView("edit_category","category",categoryService.findByIdL(id));
    }

    @RequestMapping("/category/{id}/delete")
    public ModelAndView delete(@PathVariable("id") long id, Model model){
        //model.addAttribute("blog",serviceImplement.findByIdL(id));
        return new ModelAndView("delete_category","category",categoryService.findByIdL(id));
    }

    @RequestMapping("/delete1")
    public String deleteAc(Category category){
        categoryService.delete(category.getId());
        return "redirect:/category";
    }

}
