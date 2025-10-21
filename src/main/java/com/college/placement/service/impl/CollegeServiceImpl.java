package com.college.placement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.placement.model.College;
import com.college.placement.repository.CollegeRepository;
import com.college.placement.service.CollegeService;
import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepository repo;

    public College addCollege(College c) { return repo.save(c); }
    public List<College> getAllColleges() { return repo.findAll(); }
    public College updateCollege(Long id, College c) { c.setId(id); return repo.save(c); }
    public void deleteCollege(Long id) { repo.deleteById(id); }
}
