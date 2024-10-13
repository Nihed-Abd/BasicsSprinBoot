package com.example.applicationmaven1.controllers;

import com.example.applicationmaven1.Entities.Bloc;
import com.example.applicationmaven1.services.IBlocService;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults
@RequestMapping("api/blocs")
public class BlocController {





    IBlocService blocService;
    @PostMapping("addbloc")
    public Bloc ajoutBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @GetMapping("getbloc/{idBloc}")
    public Bloc getBloc(@PathVariable("idBloc") long idBloc) {
        return blocService.getBlocById(idBloc);
    }

    @DeleteMapping("deletebloc")
    public void deleteBloc(@RequestBody Bloc bloc) {
        blocService.deleteBloc(bloc);
    }

    @PutMapping("updatebloc")
    public Bloc modifierBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping("getallbloc")
    public List<Bloc> getAllBloc() {
        return blocService.getAllBloc();
    }

}

