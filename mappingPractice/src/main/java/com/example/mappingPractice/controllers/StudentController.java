package com.example.mappingPractice.controllers;

import com.example.mappingPractice.models.Student;
import com.example.mappingPractice.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;

    @PostMapping("student")
    public void addStudent(@RequestBody Student myStudent)
    {
       studentServices.addStudent(myStudent);
    }

    @PutMapping("/student/{id}")
    public void updateStudentById(@RequestBody Student myStudent, @PathVariable Integer id) {
        studentServices.updateStudentById(myStudent, id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable Integer id) {
        studentServices.deleteStudentById(id);
    }

    @GetMapping("/student/all")
    public List<Student> getAllStudents() {
        return studentServices.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id) {
        return studentServices.getStudentById(id);
    }
}
