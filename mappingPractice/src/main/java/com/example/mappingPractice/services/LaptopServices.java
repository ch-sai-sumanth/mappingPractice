package com.example.mappingPractice.services;

import com.example.mappingPractice.models.Laptop;
import com.example.mappingPractice.repository.ILaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopServices {

    @Autowired
    ILaptopRepository iLaptopRepository;

    public void updateLaptopById(Laptop myLaptop, Integer id) {
        myLaptop.setLaptopID(id);
        iLaptopRepository.save(myLaptop);
    }

    public void addLaptop(Laptop myLaptop) {
        iLaptopRepository.save(myLaptop);
    }

    public void deleteLaptopById(Integer id) {
        iLaptopRepository.deleteById(id);
    }

    public List<Laptop> getAllLaptops() {
        return iLaptopRepository.findAll();
    }

    public Optional<Laptop> getLaptopById(Integer id) {
        return iLaptopRepository.findById(id);
    }
}
