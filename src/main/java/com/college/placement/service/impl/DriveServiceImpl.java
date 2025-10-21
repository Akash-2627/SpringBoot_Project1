package com.college.placement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.placement.model.Drive;
import com.college.placement.repository.DriveRepository;
import com.college.placement.service.DriveService;
import java.util.List;

@Service
public class DriveServiceImpl implements DriveService {

    @Autowired
    private DriveRepository repo;

    public Drive addDrive(Drive d) { return repo.save(d); }
    public List<Drive> getAllDrives() { return repo.findAll(); }
    public Drive updateDrive(Long id, Drive d) { d.setId(id); return repo.save(d); }
    public void deleteDrive(Long id) { repo.deleteById(id); }
}
