package com.sms.studentmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.studentmanagementsystem.entity.Student;
import com.sms.studentmanagementsystem.repository.StudentRepository;

@Service
public class StudentService {
    
    private StudentRepository _studentRepository = null;

    public StudentService(StudentRepository studentRepository){
        this._studentRepository = studentRepository;
    }

    public Student createStudent(Student student){
        return _studentRepository.save(student);
    }
    // just verify

    public List<Student> getAllStudents(){
        return _studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return _studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found"));
    }

    public Student updateStudent(Long id, Student updateStudent){
        Student existing = getStudentById(id);
        existing.setStudentName(updateStudent.getStudentName());
        existing.setAge(updateStudent.getAge());
        existing.setFatherName(updateStudent.getFatherName());
        existing.setDateOfBirth(updateStudent.getDateOfBirth());
        return _studentRepository.save(existing);
    }

    public void deleteStudent(Long id){
        _studentRepository.deleteById(id);
    }

}
