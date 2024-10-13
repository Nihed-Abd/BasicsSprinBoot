package com.example.applicationmaven1.repositories;

import com.example.applicationmaven1.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
