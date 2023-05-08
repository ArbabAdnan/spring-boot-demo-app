package com.arbab.springbootDemo.repository;

import com.arbab.springbootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
