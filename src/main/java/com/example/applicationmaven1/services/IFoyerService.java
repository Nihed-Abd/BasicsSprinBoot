package com.example.applicationmaven1.services;

import com.example.applicationmaven1.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);

    Foyer getFoyerById(long idFoyer);

    Foyer updateFoyer(Foyer foyer);

    void deleteFoyer(Foyer foyer);

    List<Foyer> getAllFoyer();
}
