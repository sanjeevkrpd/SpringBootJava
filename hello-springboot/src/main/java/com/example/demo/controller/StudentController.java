package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    private StudentService _studentService = new StudentService();

    public StudentController(StudentService studentService){
        this._studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return _studentService.getAllStudents();
    }
}
