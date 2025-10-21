package com.college.placement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.placement.model.Company;
import com.college.placement.repository.CompanyRepository;
import com.college.placement.service.CompanyService;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository repo;

    public Company addCompany(Company c) { return repo.save(c); }
    public List<Company> getAllCompanies() { return repo.findAll(); }
    public Company updateCompany(Long id, Company c) { c.setId(id); return repo.save(c); }
    public void deleteCompany(Long id) { repo.deleteById(id); }
}
