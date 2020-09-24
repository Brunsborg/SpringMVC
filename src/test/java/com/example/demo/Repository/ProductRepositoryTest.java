/*package com.example.demo.Repository;

import com.example.demo.Model.Product;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository = new ProductRepository();

    @Test
    void createReadTest() {
        Product p = new Product(1,"Soda",20.0,"A type of Drink");
        productRepository.create(p);
        Product pDB = productRepository.read(1);
        assertEquals(1, pDB.getId());
        assertEquals("Soda", pDB.getName());
        assertEquals(20.0, pDB.getPrice());
        assertEquals("A type of Drink", pDB.getDescription());
        //One must assume that, if we can read a product (that we just created) from
        //the database, we just created (and read!) in our database
        productRepository.delete(1);
    }

    @Test
    void read() {
    }

    @Test
    void readAll() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}*/