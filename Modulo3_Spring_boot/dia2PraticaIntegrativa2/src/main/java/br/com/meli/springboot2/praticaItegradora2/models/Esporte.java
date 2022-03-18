package br.com.meli.springboot2.praticaItegradora2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Esporte {
    private String nome;
    private String nivel;
}
