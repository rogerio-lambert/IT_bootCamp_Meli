package br.com.meli.springboot2.praticaItegradora2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String nome;
    private String Sobrenome;
    private int Idade;
    private final UUID id = UUID.randomUUID();
    private Esporte esporte;
}
