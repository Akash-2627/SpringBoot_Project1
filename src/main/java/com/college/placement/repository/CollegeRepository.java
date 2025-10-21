package com.college.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.college.placement.model.*;

public interface CollegeRepository extends JpaRepository<College, Long> {}
