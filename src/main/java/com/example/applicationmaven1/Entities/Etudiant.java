package com.example.applicationmaven1.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Entity
@Getter
@Setter
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEtudiant;
    String nom;
    String prenom;
    int cin;
    String ecole;
    Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL , mappedBy = "etudiants")
    private Set<Reservation> reservations;
}