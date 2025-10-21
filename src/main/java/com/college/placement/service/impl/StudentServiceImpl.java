package com.college.placement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.placement.model.Student;
import com.college.placement.repository.StudentRepository;
import com.college.placement.service.StudentService;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudent(Student s) { return repo.save(s); }
    public List<Student> getAllStudents() { return repo.findAll(); }
    public Student updateStudent(Long id, Student s) { s.setId(id); return repo.save(s); }
    public void deleteStudent(Long id) { repo.deleteById(id); }
}
