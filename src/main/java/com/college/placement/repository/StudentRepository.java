package com.college.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.college.placement.model.*;


public interface StudentRepository extends JpaRepository<Student, Long> {}
