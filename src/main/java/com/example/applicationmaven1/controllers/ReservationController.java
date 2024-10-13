package com.example.applicationmaven1.controllers;

import com.example.applicationmaven1.Entities.Reservation;
import com.example.applicationmaven1.services.IReservationService;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults
@RequestMapping("api/reservations")
public class ReservationController {
    IReservationService reservationService;
    @PostMapping("addreservation")
    public Reservation ajoutReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("getreservation/{idReservation}")
    public Reservation getReservation(@PathVariable("idReservation") int idReservation) {
        return reservationService.getReservationById(idReservation);
    }

    @DeleteMapping("deletereservation")
    public void deleteReservation(@RequestBody Reservation reservation) {
        reservationService.deleteReservation(reservation);
    }

    @PutMapping("updatereservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @GetMapping("getallreservation")
    public List<Reservation> getAllReservation() {
        return reservationService.getAllReservation();
    }
}
