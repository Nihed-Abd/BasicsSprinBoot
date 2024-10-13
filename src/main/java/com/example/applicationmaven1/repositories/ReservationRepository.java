package com.example.applicationmaven1.repositories;

import com.example.applicationmaven1.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
