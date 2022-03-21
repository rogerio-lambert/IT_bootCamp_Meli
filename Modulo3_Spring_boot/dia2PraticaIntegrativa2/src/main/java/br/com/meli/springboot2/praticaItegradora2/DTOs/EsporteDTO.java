package br.com.meli.springboot2.praticaItegradora2.DTOs;

import br.com.meli.springboot2.praticaItegradora2.models.Esporte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EsporteDTO {
    private String nome;
    private String nivel;

    public Esporte converterParaEsporte() {
        return new Esporte(nome, nivel);
    }

    public static List<Esporte> converterParaEsporte(Map<UUID, EsporteDTO> listaEsporteDTO) {
        return listaEsporteDTO.entrySet().stream().map(e -> e.getValue().converterParaEsporte()).collect(Collectors.toList());
    }

    public static EsporteDTO converterParaDTO(Esporte e) {
        return new EsporteDTO(e.getNome(), e.getNivel());
    }

    public static List<EsporteDTO> converterParaDTO(Map<UUID, Esporte> listaEsportes) {
        return listaEsportes.entrySet().stream().map(e -> EsporteDTO.converterParaDTO(e.getValue())).collect(Collectors.toList());
    }


}
