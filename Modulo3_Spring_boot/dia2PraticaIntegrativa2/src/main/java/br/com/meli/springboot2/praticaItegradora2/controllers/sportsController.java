package br.com.meli.springboot2.praticaItegradora2.controllers;
import br.com.meli.springboot2.praticaItegradora2.models.Esporte;
import br.com.meli.springboot2.praticaItegradora2.models.Pessoa;
import br.com.meli.springboot2.praticaItegradora2.models.repository.EsportesRepo;
import br.com.meli.springboot2.praticaItegradora2.models.repository.PessoasRepo;
import br.com.meli.springboot2.praticaItegradora2.DTOs.EsporteDTO;

import br.com.meli.springboot2.praticaItegradora2.DTOs.PessoaEsporteDTO;
import br.com.meli.springboot2.praticaItegradora2.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class sportsController {

    @Autowired
    private Service myService;


    @GetMapping("/findSports")
    public ResponseEntity<List<EsporteDTO>> getAllSports() {
        return ResponseEntity.ok(EsporteDTO.converterParaDTO(myService.getAllSports()));
    }

    @GetMapping(path = "/findSport/{name}")
    public ResponseEntity<EsporteDTO> findSport(@PathVariable String name) {
        return ResponseEntity.ok(myService.findByName(name));
    }

    @GetMapping(path = "/findSportsPersons")
    public PessoaEsporteDTO findSportPerson() {
        return new PessoaEsporteDTO();
    }

}