package com.college.placement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.college.placement.model.College;
import com.college.placement.service.CollegeService;

@RestController
@RequestMapping("/college")
@CrossOrigin("*")
public class CollegeController {

    @Autowired
    private CollegeService service;

    @PostMapping("/add")
    public College addCollege(@RequestBody College c) {
        return service.addCollege(c);
    }

    @GetMapping("/all")
    public List<College> getAll() {
        return service.getAllColleges();
    }

    @PutMapping("/update/{id}")
    public College update(@PathVariable Long id, @RequestBody College c) {
        return service.updateCollege(id, c);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteCollege(id);
        return "College Deleted";
    }
}
