package com.example.mappingPractice.controllers;

import com.example.mappingPractice.models.Address;
import com.example.mappingPractice.services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {


    @Autowired
    AddressServices addressServices;

    @PostMapping("/address")
    public void addAddress(@RequestBody Address myAddress)
    {
       addressServices.addAddress(myAddress);
    }
    @DeleteMapping("/address/{id}")
    public void deleteAddressById(@PathVariable Integer id)
    {
        addressServices.deleteAddressById(id);
    }

    @PutMapping("/address/{id}")
    public void updateAddressById(@RequestBody Address myAddress,@PathVariable Long id)
    {
        addressServices.updateAddressById(myAddress,id);
    }

    @GetMapping("/address/all")
    public List<Address> getAllAddresses()
    {
        return addressServices.getAllAddresses();
    }

    @GetMapping("/address/{id}")
    public Optional<Address> getAddressById(@PathVariable Integer id)
    {
        return addressServices.getAddressById(id);
    }
}
