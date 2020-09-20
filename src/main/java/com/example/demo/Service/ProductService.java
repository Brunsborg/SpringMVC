package com.example.demo.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void create(Product p){
        productRepository.create(p);
    }

    public Product read(int id){
        return productRepository.read(id);
    }

    public List<Product> readAll(){
        return productRepository.readAll();
    }

    public void update(Product p){
        productRepository.update(p);
    }

    public void delete(int id) {
        productRepository.delete(id);
    }
}
