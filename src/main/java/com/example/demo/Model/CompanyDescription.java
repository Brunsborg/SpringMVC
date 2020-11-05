package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class CompanyDescription {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String description;
    @OneToOne
    private Product product;

    public CompanyDescription() {
    }

    public CompanyDescription(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString(){
        return "CompanyDescription{" +
                "Id = " + id +
                ", Description = " + description;
    }
}
