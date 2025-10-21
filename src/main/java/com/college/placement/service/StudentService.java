package com.college.placement.service;

import java.util.List;
import com.college.placement.model.Student;

public interface StudentService {
    Student addStudent(Student s);
    List<Student> getAllStudents();
    Student updateStudent(Long id, Student s);
    void deleteStudent(Long id);
}
