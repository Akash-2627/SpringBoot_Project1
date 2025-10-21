package com.college.placement.service;

import java.util.List;
import com.college.placement.model.Result;

public interface ResultService {
    Result addResult(Result r);
    List<Result> getAllResults();
    Result updateResult(Long id, Result r);
    void deleteResult(Long id);
}
