package br.com.meli.springboot2.praticaItegradora2.services.DTOs;

import br.com.meli.springboot2.praticaItegradora2.models.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaEsporteDTO {
    private String nomeCompleto;
    private String esporte;

    public static PessoaEsporteDTO generate(Pessoa pessoa) {
        return new PessoaEsporteDTO(pessoa.getNome() + " " + pessoa.getSobrenome(), pessoa.getEsporte().getNome());
    }
}
