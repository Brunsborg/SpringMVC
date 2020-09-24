package com.example.demo.Controller;

import com.example.demo.Model.Product;
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


    @GetMapping("/")
    public String index(Model model){
        List<Product> productList = productService.readAll();
        model.addAttribute("products", productList);
        return "index.html";
    }

    @GetMapping("/createProduct")
    public String createProduct(){
        return "createProduct";
    }

    @PostMapping("/createProduct")
    public String createProduct(@ModelAttribute Product p){
        productService.create(p);
        return "redirect:/";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("product", productService.read(id));
        return "updateProduct";
    }
    @PostMapping("/updateProduct")
    public String updateProduct(@ModelAttribute Product p){
        productService.update(p);
        return "redirect:/";
    }
}
