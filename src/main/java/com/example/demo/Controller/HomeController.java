package com.example.demo.Controller;

import com.example.demo.Model.Product;
import com.example.demo.Service.CompanyService;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ProductService productService;
    @Autowired
    CompanyService companyService;


    @GetMapping("/")
    public String index(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "index";
    }

    @GetMapping("/createProduct")
    public String createProduct(Model model){
        model.addAttribute("companies", companyService.findAll());
        return "createProduct";
    }

    @PostMapping("/createProduct")
    public String createProduct(@ModelAttribute Product p){
        productService.save(p);
        return "redirect:/";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") long id){
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable("id") long id, Model model){
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("companies", companyService.findAll());
        return "updateProduct";
    }
    @PostMapping("/updateProduct")
    public String updateProduct(@ModelAttribute Product p){
        productService.update(p);
        return "redirect:/";
    }
}
