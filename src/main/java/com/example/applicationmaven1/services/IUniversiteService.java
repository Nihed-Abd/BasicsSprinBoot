package com.example.applicationmaven1.services;

import com.example.applicationmaven1.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);

    Universite getUniversiteById(long idUniversite);

    Universite updateUniversite(Universite universite);

    void deleteUniversite(Universite universite);

    List<Universite> getAllUniversite();
}
