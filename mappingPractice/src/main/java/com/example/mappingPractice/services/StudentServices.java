package com.example.mappingPractice.services;

import com.example.mappingPractice.models.Student;
import com.example.mappingPractice.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {
    @Autowired
    IStudentRepository iStudentRepository;


    public void addStudent(Student myStudent)
    {
        iStudentRepository.save(myStudent);
    }


    public void updateStudentById(Student myStudent, Integer id) {
        myStudent.setStudentID(id);
        iStudentRepository.save(myStudent);
    }

    public void deleteStudentById(Integer id) {
        iStudentRepository.deleteById(id);
    }

    public List<Student> getAllStudents() {
        return iStudentRepository.findAll();
    }

    public Optional<Student> getStudentById(Integer id) {
        return iStudentRepository.findById(id);
    }
}
