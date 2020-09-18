package com.example.demo.Service;

import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void create(){
        productRepository.create();
    }

    public void read(){
        productRepository.read();
    }

    public void readAll(){
        productRepository.readAll();
    }

    public void update(){
        productRepository.update();
    }

    public void delete() {
        productRepository.delete();
    }
}
