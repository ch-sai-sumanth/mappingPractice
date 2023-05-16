package com.example.mappingPractice.repository;

import com.example.mappingPractice.models.Course;
import com.example.mappingPractice.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ILaptopRepository extends JpaRepository<Laptop,Integer> {

}
