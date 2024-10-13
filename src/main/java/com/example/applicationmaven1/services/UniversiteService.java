package com.example.applicationmaven1.services;


import com.example.applicationmaven1.Entities.Universite;
import com.example.applicationmaven1.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;


    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversiteById(long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Universite universite) {
        universiteRepository.delete(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }
}
