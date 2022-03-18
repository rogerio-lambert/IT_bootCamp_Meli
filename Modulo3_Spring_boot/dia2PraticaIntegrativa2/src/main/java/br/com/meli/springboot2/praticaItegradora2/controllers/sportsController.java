package br.com.meli.springboot2.praticaItegradora2.controllers;
import br.com.meli.springboot2.praticaItegradora2.services.DTOs.EsporteDTO;

import br.com.meli.springboot2.praticaItegradora2.services.DTOs.PessoaEsporteDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class sportsController {
    @GetMapping("/findSports")
    public List<EsporteDTO> getAllSports() {
        return new ArrayList<EsporteDTO>();
    }

    @GetMapping(path = "/findSport/{name}")
    public EsporteDTO findSport() {
        return new EsporteDTO();
    }

    @GetMapping(path = "/findSportsPersons")
    public PessoaEsporteDTO findSportPerson() {
        return new PessoaEsporteDTO();
    }

}