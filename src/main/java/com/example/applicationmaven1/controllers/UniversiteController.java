package com.example.applicationmaven1.controllers;

import com.example.applicationmaven1.Entities.Etudiant;
import com.example.applicationmaven1.Entities.Universite;
import com.example.applicationmaven1.services.IEtudiantService;
import com.example.applicationmaven1.services.IUniversiteService;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults
@RequestMapping("api/universites")
public class UniversiteController {
    IUniversiteService universiteService;
    @PostMapping("adduniversite")
    public Universite ajoutUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @GetMapping("getuniversite/{idUniversite}")
    public Universite getUniversite(@PathVariable("idUniversite") long idUniversite) {
        return universiteService.getUniversiteById(idUniversite);
    }

    @DeleteMapping("deleteuniversite")
    public void deleteUniversite(@RequestBody Universite universite) {
        universiteService.deleteUniversite(universite);
    }

    @PutMapping("updateuniversite")
    public Universite modifierUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @GetMapping("getalluniversite")
    public List<Universite> getAllUniversite() {
        return universiteService.getAllUniversite();
    }
}
