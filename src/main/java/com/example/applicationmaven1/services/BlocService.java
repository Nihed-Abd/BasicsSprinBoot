package com.example.applicationmaven1.services;

import com.example.applicationmaven1.Entities.Bloc;
import com.example.applicationmaven1.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocService implements IBlocService{

    BlocRepository blocRepository;


    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocById(long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Bloc bloc) {
        blocRepository.delete(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }
}
