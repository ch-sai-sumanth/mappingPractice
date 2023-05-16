package com.example.mappingPractice.repository;

import com.example.mappingPractice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course,Integer> {
}
