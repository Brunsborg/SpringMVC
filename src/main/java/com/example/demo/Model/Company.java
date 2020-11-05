package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;

    public Company(){}

    @OneToOne
    private Product product;

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
