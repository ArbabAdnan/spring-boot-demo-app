package com.arbab.springbootDemo.service;

import com.arbab.springbootDemo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student save(Student student);
    Optional<Student> studentFindById(Student student, Integer studentId);
    List<Student> getAllStudent();
    Student updateStudent(Student student, Integer studentId);
    void  deleteStudent(Integer studentId);


}
