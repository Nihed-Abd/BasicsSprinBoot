package com.example.applicationmaven1.repositories;

import com.example.applicationmaven1.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
