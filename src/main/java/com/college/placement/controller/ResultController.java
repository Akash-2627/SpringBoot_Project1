package com.college.placement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.college.placement.model.Result;
import com.college.placement.service.ResultService;

@RestController
@RequestMapping("/result")
@CrossOrigin("*")
public class ResultController {

    @Autowired
    private ResultService service;

    @PostMapping("/add")
    public Result addResult(@RequestBody Result r) {
        return service.addResult(r);
    }

    @GetMapping("/all")
    public List<Result> getAllResults() {
        return service.getAllResults();
    }

    @PutMapping("/update/{id}")
    public Result updateResult(@PathVariable Long id, @RequestBody Result r) {
        return service.updateResult(id, r);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteResult(@PathVariable Long id) {
        service.deleteResult(id);
        return "Result Deleted";
    }
}
