package com.college.placement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.college.placement.model.Drive;
import com.college.placement.service.DriveService;

@RestController
@RequestMapping("/drive")
@CrossOrigin("*")
public class DriveController {

    @Autowired
    private DriveService service;

    @PostMapping("/add")
    public Drive addDrive(@RequestBody Drive d) {
        return service.addDrive(d);
    }

    @GetMapping("/all")
    public List<Drive> getAllDrives() {
        return service.getAllDrives();
    }

    @PutMapping("/update/{id}")
    public Drive updateDrive(@PathVariable Long id, @RequestBody Drive d) {
        return service.updateDrive(id, d);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDrive(@PathVariable Long id) {
        service.deleteDrive(id);
        return "Drive Deleted";
    }
}
