package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class CompanyDescription {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String description;

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

    @Override
    public String toString(){
        return "CompanyDescription{" +
                "Id = " + id +
                ", Description = " + description;
    }
}
