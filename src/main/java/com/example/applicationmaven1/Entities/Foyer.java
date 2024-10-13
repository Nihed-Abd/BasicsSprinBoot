package com.example.applicationmaven1.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;



@Entity
@Getter
@Setter
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idFoyer;
    String nomFoyer;
    int capaciteFoyer;

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "foyer")
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "foyer")
    private Set<Bloc> bloc;
}