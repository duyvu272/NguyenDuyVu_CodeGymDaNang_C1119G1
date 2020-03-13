package com.codegym.finaltest.controller;

import com.codegym.finaltest.model.Product;
import com.codegym.finaltest.model.TypeOfProduct;
import com.codegym.finaltest.service.ProductService;
import com.codegym.finaltest.service.TypeOfProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    TypeOfProductService typeOfProductService;

    @ModelAttribute("listType")
    public List<TypeOfProduct> typeOfProductList(){
        return typeOfProductService.findAllTypeProduct();
    }


    @GetMapping("/products")
    public ModelAndView viewProducts(@PageableDefault(value = 5) Pageable pageable, @RequestParam("search") Optional<String> n) {
       ModelAndView modelAndView =  new ModelAndView("show_products");
        Page<Product> productPage;
        if(n.isPresent()){
            productPage = productService.findByName(n.get(),pageable);
            modelAndView.addObject("name",n.get());
        }else {
            productPage = productService.findAll(pageable);
        }
        modelAndView.addObject("products",productPage);

        return modelAndView;

    }
    @RequestMapping("/product/add")
    public String add(Model model){
        model.addAttribute("product",new Product());
        return "add";
    }

    @RequestMapping("/product/save")
    public String saveProduct(Product product, RedirectAttributes redirect){
        Date date = new Date();
        product.setCreateDate(date);
        productService.save(product);
        redirect.addFlashAttribute("success","Add new product success");
        return "redirect:/";
    }

    @RequestMapping("/product/{id}/edit")
    public String edit(@PathVariable(value = "id") Long id, Model model){
        model.addAttribute("product",productService.findByIdL(id));
        return "edit";
    }

    @RequestMapping("/product/{id}/view")
    public String view(@PathVariable(value = "id") Long id, Model model){
        model.addAttribute("productV",productService.findByIdL(id));
        return "view_product";
    }


//    @PostMapping("/deleteProduct/{id}")
//    public String delete(@PathVariable("id") Product product, RedirectAttributes redirect){
//        Product product = new Product();
//        for (Product product1:gioHang.getProductList()
//        ) {product = product1;
//        }
//        gioHang.delete(product.getId());
//        redirect.addFlashAttribute("success","delete product to Gio Hang success");
//        return "redirect:/showgiohang";
//    }
//


}
