package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.service.BlogService;


import com.example.demo.service.CategoryService;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class DemoController {

    @Autowired
    BlogService serviceImplement;

    @Autowired
    CategoryService categoryService;


    @ModelAttribute("category")
    public List<Category> categories() {
        return categoryService.findAllC();
    }


    @GetMapping("/blog")
    public ModelAndView home(@PageableDefault(value = 1) Pageable pageable, @RequestParam("search") Optional<String> n
            , Optional<Blog> blog,@RequestParam("category") Optional<Long> idL) {

        Page<Blog> blogList;
        ModelAndView modelAndView = new ModelAndView("hello");
        if (n.isPresent()) {
            blogList = serviceImplement.findByName(n.get(), pageable);
            modelAndView.addObject("nameBlog", n.get());
            System.out.println("1");
        } else {
            if(blog.isPresent()){
                blogList = serviceImplement.findAll(pageable);
                System.out.println("2   " + idL);
            }else{
                for (Blog bf:serviceImplement.findBlogByCategories(blog.get().getCategory().getId(),pageable)
                     ) {
                    System.out.println(bf.toString());

                }
                blogList = serviceImplement.findAll(pageable);
                System.out.println("3   " );
//                blogList = serviceImplement.findBlogByCategories(blog.get().getCategory().getId(),pageable);
            }
        }
        Blog b = new Blog();
        long id = 41414;
        b.setId(id);
        modelAndView.addObject("cate", b);
        modelAndView.addObject("blog", blogList);
        return modelAndView;
    }

    @GetMapping("hihi")
    public String showByCategory(Model model, Blog blog, Pageable pageable) {
        Page<Blog> blogs = serviceImplement.findBlogByCategories(blog.getCategory().getId(), pageable);
        model.addAttribute("blog", blogs);
        return "redirect:/blog/";
    }


    @GetMapping("/create-blog")
    public ModelAndView create(Pageable pageable) {

        ModelAndView mav = new ModelAndView("create", "blog", new Blog());
        //mav.addObject("categoryA",new Category());
        mav.addObject("category", categoryService.findAllC());
        return mav;
    }

    @PostMapping("/create/save")
    public String save(Blog blog) {
        if (blog.getId() == null) {
            long id = (long) (Math.random() * 100);
            Date date = new Date();
            blog.setId(id);
//           blog.setCategory(category);
            blog.setDatePublish(date);
            serviceImplement.save(blog);
        } else {
            serviceImplement.save(blog);
        }
        return "redirect:/create-blog";
    }

    @RequestMapping("/blog/{id}/edit")
    public ModelAndView edit(@PathVariable("id") long id) {
        return new ModelAndView("edit", "blog", serviceImplement.findByIdL(id));
    }

    @RequestMapping("/blog/{id}/delete")
    public ModelAndView delete(@PathVariable("id") long id) {

        //model.addAttribute("blog",serviceImplement.findByIdL(id));
        return new ModelAndView("delete", "blog", serviceImplement.findByIdL(id));
    }

    @RequestMapping("/delete")
    public String deleteAction(Blog blog) {

        serviceImplement.delete(blog.getId());
        return "redirect:/blog";
    }

    @RequestMapping("/blog/{id}/view")
    public ModelAndView view(@PathVariable("id") long id) {
        //model.addAttribute("blog",serviceImplement.findByIdL(id));
        return new ModelAndView("view", "blog", serviceImplement.findByIdL(id));
    }


}
