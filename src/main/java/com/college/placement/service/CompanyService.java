package com.college.placement.service;

import java.util.List;
import com.college.placement.model.Company;

public interface CompanyService {
    Company addCompany(Company c);
    List<Company> getAllCompanies();
    Company updateCompany(Long id, Company c);
    void deleteCompany(Long id);
}
