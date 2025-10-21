package com.college.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.college.placement.model.*;


public interface CompanyRepository extends JpaRepository<Company, Long> {}
