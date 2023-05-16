package com.example.mappingPractice.controllers;

import com.example.mappingPractice.models.Course;
import com.example.mappingPractice.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    CourseServices courseServices;

    @PostMapping("/course")
    public void addCourse(@RequestBody Course myCourse)
    {
        courseServices.addCourse(myCourse);
    }

    @PutMapping("/course/{id}")
    public void updateCourseById(@RequestBody Course myCourse, @PathVariable Long id)
    {
        courseServices.updateCourseById(myCourse,id);
    }
    @DeleteMapping("/course/{id}")
    public void deleteCourseById( @PathVariable Integer id)
    {
        courseServices.deleteCourseById(id);
    }
    @GetMapping("/course/all")
    public List<Course> getAllCourses()
    {
        return courseServices.getAllCourses();
    }

    @GetMapping("/course/{id}")
    public Optional<Course> getCourseById(@PathVariable Integer id)
    {
        return courseServices.getCourseById(id);
    }
}
