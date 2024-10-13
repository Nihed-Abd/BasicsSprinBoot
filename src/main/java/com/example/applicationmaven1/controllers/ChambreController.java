package com.example.applicationmaven1.controllers;

import com.example.applicationmaven1.Entities.Chambre;
import com.example.applicationmaven1.services.IChambreService;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults
@RequestMapping("api/chambres")
public class ChambreController {
    IChambreService chambreService;
    @PostMapping("addchambre")
    public Chambre ajoutChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @GetMapping("getchambre/{idChambre}")
    public Chambre getChambre(@PathVariable("idChambre") long idChambre) {
        return chambreService.getChambreById(idChambre);
    }

    @DeleteMapping("deletechambre")
    public void deleteChambre(@RequestBody Chambre chambre) {
        chambreService.deleteChambre(chambre);
    }

    @PutMapping("updatechambre")
    public Chambre modifierChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @GetMapping("getallchambre")
    public List<Chambre> getAllChambre() {
        return chambreService.getAllChambre();
    }

}
