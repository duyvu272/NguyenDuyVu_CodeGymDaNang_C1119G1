package com.codegym.finalexam.controller;

import com.codegym.finalexam.model.Product;
import com.codegym.finalexam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public ModelAndView vewList(@RequestParam("search") Optional<String> name, Pageable pageable) {
        Page<Product> products;
        ModelAndView modelAndView = new ModelAndView("products");
        if (name.isPresent()) {
            products = service.findByName(name.get(), pageable);
            modelAndView.addObject("nameProduct", name);
        } else {
            products = service.findAll(pageable);
        }
        modelAndView.addObject("listProduct", products);

        return modelAndView;
    }

    @GetMapping("/addNewProduct")
    public ModelAndView viewAdd() {

        return new ModelAndView("create_product", "product", new Product());
    }

    @PostMapping("/product/save")
    public String addNewProduct(@Validated Product product, BindingResult result, RedirectAttributes attributes) {
        new Product().validate(product,result);

        if(result.hasErrors()){
            return "create_product";
        }else{
                Date date = new Date();
                product.setDate(date);
                service.save(product);
                attributes.addFlashAttribute("mess", "add successfully");
            }
        return "redirect:/products";
    }


    @PostMapping("/product/saveEdit")
    public String editProduct(@Validated Product product, BindingResult result, RedirectAttributes attributes) {
        new Product().validate(product,result);
        if(result.hasErrors()){
            return "create_product";
        }else{
                service.save(product);
                attributes.addFlashAttribute("mess", "Edit successfully");
        }

        return "redirect:/products";
    }

    @GetMapping("/product/{id}/edit")
    public ModelAndView viewEdit(@PathVariable("id") Long id) {
        return new ModelAndView("edit_product", "productEdit", service.findByIdL(id));
    }

    @GetMapping("/product/{id}/delete")
    public ModelAndView viewDelete(@PathVariable("id") Long id) {
        return new ModelAndView("delete_product", "product", service.findByIdL(id));
    }

    @GetMapping("/product/{id}")
    public String deleteProduct(@PathVariable("id") Long id, RedirectAttributes attributes) {
        service.delete(id);
        attributes.addFlashAttribute("mess", "Delete successfully");
        return "redirect:/products";
    }

}
