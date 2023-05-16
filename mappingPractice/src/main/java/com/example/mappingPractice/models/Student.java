package com.example.mappingPractice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_address_addressID")
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> course;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> book;



}
