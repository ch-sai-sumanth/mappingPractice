package com.example.mappingPractice.repository;

import com.example.mappingPractice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Integer>{

}
