package com.example.demo.Repository;

import com.example.demo.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    JdbcTemplate template;

    public void create(Product p){
        String sql = "INSERT INTO products() VALUES (DEFAULT, ?, ?, ?)";
        template.update(sql, p.getName(), p.getPrice(), p.getDescription());
    }

    public Product read(int id){
        String sql = "SELECT * FROM products WHERE id = ?";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.queryForObject(sql, rowMapper, id);
    }

    public List<Product> readAll(){
        String sql = "SELECT * FROM products";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.query(sql, rowMapper);
    }

    public void update(Product p){
        String sql = "UPDATE products SET `name` = ?, price = ?, description = ? WHERE id = ?";
        template.update(sql, p.getName(), p.getPrice(), p.getDescription(), p.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM products WHERE id = ?";
        template.update(sql, id);
    }
}