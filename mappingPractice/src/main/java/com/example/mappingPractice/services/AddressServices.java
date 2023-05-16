package com.example.mappingPractice.services;

import com.example.mappingPractice.models.Address;
import com.example.mappingPractice.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServices {

    @Autowired
    IAddressRepository iAddressRepository;

    public void addAddress(Address myAddress) {
        iAddressRepository.save(myAddress);
    }

    public void deleteAddressById(Integer id) {
        iAddressRepository.deleteById(id);
    }

    public void updateAddressById(Address myAddress, Long id) {
        myAddress.setAddressId(id);
        iAddressRepository.save(myAddress);
    }

    public List<Address> getAllAddresses() {
        return iAddressRepository.findAll();
    }

    public Optional<Address> getAddressById(Integer id) {
        return iAddressRepository.findById(id);
    }
}
