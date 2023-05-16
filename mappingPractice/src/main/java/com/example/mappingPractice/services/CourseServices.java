package com.example.mappingPractice.services;

import com.example.mappingPractice.models.Course;
import com.example.mappingPractice.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServices {

    @Autowired
    ICourseRepository iCourseRepository;
    public void addCourse(Course myCourse) {
        iCourseRepository.save(myCourse);
    }

    public void updateCourseById(Course myCourse, Long id) {
        myCourse.setCourseID(id);
        iCourseRepository.save(myCourse);
    }

    public void deleteCourseById(Integer id) {
        iCourseRepository.deleteById(id);
    }

    public List<Course> getAllCourses() {
       return iCourseRepository.findAll();
    }

    public Optional<Course> getCourseById(Integer id) {
        return iCourseRepository.findById(id);
    }
}
