package com.example.mappingPractice.controllers;

import com.example.mappingPractice.models.Laptop;
import com.example.mappingPractice.services.LaptopServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    @Autowired
    LaptopServices laptopServices;

    @PostMapping("/laptop")
    public void addLaptop(@RequestBody Laptop myLaptop) {
        laptopServices.addLaptop(myLaptop);
    }

    @PutMapping("/laptop/{id}")
    public void updateLaptopById(@RequestBody Laptop myLaptop, @PathVariable Integer id) {
        laptopServices.updateLaptopById(myLaptop, id);
    }

    @DeleteMapping("/laptop/{id}")
    public void deleteLaptopById(@PathVariable Integer id) {
        laptopServices.deleteLaptopById(id);
    }

    @GetMapping("/laptop/all")
    public List<Laptop> getAllLaptops() {
        return laptopServices.getAllLaptops();
    }

    @GetMapping("/laptop/{id}")
    public Optional<Laptop> getLaptopById(@PathVariable Integer id) {
        return laptopServices.getLaptopById(id);
    }
}