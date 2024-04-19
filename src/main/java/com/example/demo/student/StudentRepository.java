package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This interface in charge of data access
@Repository
public interface StudentRepository 
    extends JpaRepository<Student, Long> {
         
}
