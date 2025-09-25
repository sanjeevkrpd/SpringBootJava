package com.sms.studentmanagementsystem.controller;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sms.studentmanagementsystem.entity.Student;
import com.sms.studentmanagementsystem.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
    
    private StudentService _studentService = null;

    public StudentController(StudentService studentService){
        this._studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student){
        return ResponseEntity.ok(_studentService.createStudent(student));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAll(){
        return ResponseEntity.ok(_studentService.getAllStudents());
    } 

      @GetMapping("/{id}")
    public ResponseEntity<Student> getById(@PathVariable Long id){
        return ResponseEntity.ok(_studentService.getStudentById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student){
        return ResponseEntity.ok(_studentService.updateStudent(id, student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        _studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }
}
