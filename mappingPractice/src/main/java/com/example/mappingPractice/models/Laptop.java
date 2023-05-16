package com.example.mappingPractice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne(cascade = CascadeType.ALL)
    private Student student;
}
