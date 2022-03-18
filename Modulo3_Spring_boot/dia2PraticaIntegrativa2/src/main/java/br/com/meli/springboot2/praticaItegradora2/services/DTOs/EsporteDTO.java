package br.com.meli.springboot2.praticaItegradora2.services.DTOs;

import br.com.meli.springboot2.praticaItegradora2.models.Esporte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EsporteDTO {
    private String nome;
    private String nivel;

    public Esporte converter() {
        return new Esporte(nome, nivel);
    }

    public static List<Esporte> converter (List<EsporteDTO> listaEsporteDTO) {
        return listaEsporteDTO.stream().map(e -> e.converter()).collect(Collectors.toList());
    }
}
