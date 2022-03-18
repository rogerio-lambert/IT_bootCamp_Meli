package br.com.meli.springBoot2.praticaIntegradora1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
public class ageController {
    @GetMapping(path = "{day}/{month}/{year}")
    public ResponseEntity<Long> determineAge(@PathVariable int day,
                                       @PathVariable int month,
                                       @PathVariable int year) {
        LocalDate birthday = LocalDate.of(year, month, day);

        return ResponseEntity.ok(birthday.until(LocalDate.now(), ChronoUnit.YEARS));
    }
}
