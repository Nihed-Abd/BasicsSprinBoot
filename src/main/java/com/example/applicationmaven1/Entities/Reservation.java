package com.example.applicationmaven1.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idReservation;
    Date anneeUniversitaire;
    boolean estValide;

    @ManyToMany
    private Set<Etudiant> etudiants;
}