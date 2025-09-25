package com.sms.studentmanagementsystem.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.studentmanagementsystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}