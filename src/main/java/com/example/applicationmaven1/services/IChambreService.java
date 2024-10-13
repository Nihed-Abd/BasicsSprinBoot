package com.example.applicationmaven1.services;

import com.example.applicationmaven1.Entities.Chambre;
import com.example.applicationmaven1.repositories.ChambreRepository;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);

    Chambre getChambreById(long idChambre);

    Chambre updateChambre(Chambre chambre);

    void deleteChambre(Chambre chambre);

    List<Chambre> getAllChambre();
}