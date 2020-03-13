package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import com.codegym.services.product_services_implement.ProductServicesImlement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
   private ProductService productService = new ProductServicesImlement();
    @GetMapping("/")
    public ModelAndView home(){
       ModelAndView modelAndView = new ModelAndView("index","products",productService.getAllProducts());
        return modelAndView;
    }

    @RequestMapping("/product/add")
    public String add(Model model){
        model.addAttribute("product",new Product());
        return "add";
    }

    @RequestMapping("/product/save")
    public String saveProduct(Product product, RedirectAttributes redirect){
        product.setId((int)Math.random()*100);
        productService.save(product);
        redirect.addFlashAttribute("success","Add new product success");
        return "redirect:/";
    }

    @RequestMapping("/product/{id}/edit")
    public String edit(@PathVariable(value = "id") int id, Model model){
        model.addAttribute("productE",productService.findById(id));
        return "edit";
    }
    @RequestMapping("/product/{id}/delete")
    public String delete(@PathVariable(value = "id") int id, Model model){
        model.addAttribute("productE",productService.delete(id););
        return "delete";
    }
}
