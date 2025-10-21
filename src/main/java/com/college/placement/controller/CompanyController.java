package com.college.placement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.college.placement.model.Company;
import com.college.placement.service.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin("*")
public class CompanyController {

    @Autowired
    private CompanyService service;

    @PostMapping("/add")
    public Company addCompany(@RequestBody Company c) {
        return service.addCompany(c);
    }

    @GetMapping("/all")
    public List<Company> getAllCompanies() {
        return service.getAllCompanies();
    }

    @PutMapping("/update/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company c) {
        return service.updateCompany(id, c);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCompany(@PathVariable Long id) {
        service.deleteCompany(id);
        return "Company Deleted";
    }
}
