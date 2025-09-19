package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;

@Service
public class StudentService {
    
    public List<Student> getAllStudents(){
         return Arrays.asList(
            new Student(1, "Alice"),
            new Student(2, "Bob"),
            new Student(3, "Charlie")
        );
    }
}
