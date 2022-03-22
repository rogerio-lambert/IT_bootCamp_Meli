package br.com.meli.springboot2.praticaItegradora2.DTOs;

import br.com.meli.springboot2.praticaItegradora2.models.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaEsporteDTO {
    private String nomeCompleto;
    private String esporte;

    public static PessoaEsporteDTO generate(Pessoa pessoa) {
        return new PessoaEsporteDTO(pessoa.getNome() + " " + pessoa.getSobrenome(), pessoa.getEsporte().getNome());
    }

    public static List<PessoaEsporteDTO> generate(Map<UUID, Pessoa> pessoas) {
        return pessoas
                .entrySet()
                .stream()
                .map(p -> new PessoaEsporteDTO(p.getValue().getNome() + " " + p.getValue().getSobrenome(), p.getValue().getEsporte().getNome()))
                .collect(Collectors.toList());

    }

}
