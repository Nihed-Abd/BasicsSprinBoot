package com.example.applicationmaven1.services;

import com.example.applicationmaven1.Entities.Bloc;

import com.example.applicationmaven1.repositories.BlocRepository;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);

    Bloc getBlocById(long idBloc);

    Bloc updateBloc(Bloc bloc);

    void deleteBloc(Bloc bloc);

    List<Bloc> getAllBloc();

}



