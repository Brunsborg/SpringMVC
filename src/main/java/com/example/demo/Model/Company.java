package com.example.demo.Model;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;

    public Company(){}

    @OneToMany(mappedBy = "company")
    private List<Product> product;

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "ID: " + id +
                "\nName: " +name;
    }
}
