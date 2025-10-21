package com.college.placement.service;

import java.util.List;
import com.college.placement.model.Drive;

public interface DriveService {
    Drive addDrive(Drive d);
    List<Drive> getAllDrives();
    Drive updateDrive(Long id, Drive d);
    void deleteDrive(Long id);
}
