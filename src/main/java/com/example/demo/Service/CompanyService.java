package com.example.demo.Service;

import com.example.demo.Model.Company;
import com.example.demo.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public void save(Company c){
        companyRepository.save(c);
    }

    public Company findById(long id){
        Optional<Company> optionalCompany = companyRepository.findById(id);
        if(optionalCompany.isPresent()){
            return optionalCompany.get();
        }else
            throw new RuntimeException();
    }

    public List<Company> findAll(){
        //create list
        List<Company> companies = new ArrayList<>();
        for(Company c : companyRepository.findAll()){
            companies.add(c);
        }
        return companies;
    }

    public void update(Company c){
        companyRepository.save(c);
    }

    public void deleteById(long id) {
        companyRepository.deleteById(id);
    }
}
