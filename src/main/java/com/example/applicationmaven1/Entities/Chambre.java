package com.example.applicationmaven1.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import org.hibernate.bytecode.enhance.spi.EnhancementInfo;

@Entity
@Getter
@Setter
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idChambre;

    int nombreChambre;

    TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;

    @OneToMany
    private Set<Reservation> reservations;
}