package com.college.placement.service;

import java.util.List;
import com.college.placement.model.College;

public interface CollegeService {
    College addCollege(College c);
    List<College> getAllColleges();
    College updateCollege(Long id, College c);
    void deleteCollege(Long id);
}
