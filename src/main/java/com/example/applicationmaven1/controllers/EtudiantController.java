package com.example.applicationmaven1.controllers;

import com.example.applicationmaven1.Entities.Etudiant;
import com.example.applicationmaven1.services.IEtudiantService;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults
@RequestMapping("api/etudiants")
public class EtudiantController {
    IEtudiantService etudiantService;
    @PostMapping("addetudiant")
    public Etudiant ajoutEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @GetMapping("getetudiant/{idEtudiant}")
    public Etudiant getEtudiant(@PathVariable("idEtudiant") long idEtudiant) {
        return etudiantService.getEtudiantById(idEtudiant);
    }

    @DeleteMapping("deleteetudiant")
    public void deleteEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.deleteEtudiant(etudiant);
    }

    @PutMapping("updateetudiant")
    public Etudiant modifierEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @GetMapping("getalletudiant")
    public List<Etudiant> getAllEtudiant() {
        return etudiantService.getAllEtudiant();
    }
}
