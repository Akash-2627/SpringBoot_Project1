package com.college.placement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.placement.model.Result;
import com.college.placement.repository.ResultRepository;
import com.college.placement.service.ResultService;
import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultRepository repo;

    public Result addResult(Result r) { return repo.save(r); }
    public List<Result> getAllResults() { return repo.findAll(); }
    public Result updateResult(Long id, Result r) { r.setId(id); return repo.save(r); }
    public void deleteResult(Long id) { repo.deleteById(id); }
}
