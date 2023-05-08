package com.arbab.springbootDemo.service.imp;

import com.arbab.springbootDemo.entity.Student;
import com.arbab.springbootDemo.repository.StudentRepository;
import com.arbab.springbootDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;


    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public Optional<Student> studentFindById(Student student, Integer studentId) {
        return repository.findById(studentId);
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student updateStudent(Student student, Integer studentId) {
        return null;
    }

    @Override
    public void deleteStudent(Integer studentId) {

    }
}
