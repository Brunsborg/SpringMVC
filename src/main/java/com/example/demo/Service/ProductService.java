package com.example.demo.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void save(Product p){
        productRepository.save(p);
    }

    public Product findById(long id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }else
            throw new RuntimeException();
    }

    public List<Product> findAll(){
        //create list
        List<Product> products = new ArrayList<>();
        for(Product p : productRepository.findAll()){
            products.add(p);
        }
        return products;
    }

    public void update(Product p){
        productRepository.save(p);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }
}
