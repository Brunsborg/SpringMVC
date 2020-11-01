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

    public Optional<Product> findById(long id){
        return productRepository.findById(id);
    }

    public List<Product> findAll(){
        //create list
        List<Product> products = new ArrayList<>();
        //fetch list, access iterator, use for each remaining method to add products to list
        productRepository.findAll().iterator().forEachRemaining(products::add);
        return products;
    }

    public void update(Product p){
        productRepository.save(p);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }
}
