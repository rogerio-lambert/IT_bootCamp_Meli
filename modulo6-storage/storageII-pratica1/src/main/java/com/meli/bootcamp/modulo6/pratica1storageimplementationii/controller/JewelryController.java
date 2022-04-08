package com.meli.bootcamp.modulo6.pratica1storageimplementationii.controller;

import com.meli.bootcamp.modulo6.pratica1storageimplementationii.DTO.JewelryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

@RestController
public class JewelryController {
    @PostMapping("/joia/inserir")
    ResponseEntity<JewelryDTO> createJewelry(@RequestBody JewelryDTO newJewelry, HttpServletRequest httpServletRequest) {
        return ResponseEntity.created(URI.create(httpServletRequest.getRequestURI())).body(newJewelry);
    }
}
