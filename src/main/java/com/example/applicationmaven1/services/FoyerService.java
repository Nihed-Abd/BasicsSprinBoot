package com.example.applicationmaven1.services;


import com.example.applicationmaven1.Entities.Foyer;
import com.example.applicationmaven1.repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;


    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer getFoyerById(long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Foyer foyer) {
        foyerRepository.delete(foyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepository.findAll();
    }
}




