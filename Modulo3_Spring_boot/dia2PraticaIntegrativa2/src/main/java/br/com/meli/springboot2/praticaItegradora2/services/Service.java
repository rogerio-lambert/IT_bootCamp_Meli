package br.com.meli.springboot2.praticaItegradora2.services;

import br.com.meli.springboot2.praticaItegradora2.DTOs.EsporteDTO;
import br.com.meli.springboot2.praticaItegradora2.exceptions.EsporteNaoCadastradoException;
import br.com.meli.springboot2.praticaItegradora2.models.Esporte;
import br.com.meli.springboot2.praticaItegradora2.models.Pessoa;
import br.com.meli.springboot2.praticaItegradora2.models.repository.EsportesRepo;
import br.com.meli.springboot2.praticaItegradora2.models.repository.PessoasRepo;

import java.util.*;

@org.springframework.stereotype.Service
public class Service {
    private static EsportesRepo esportes = new EsportesRepo();
    private static PessoasRepo atletas = new PessoasRepo();

    static {
        Esporte basqueteBasico = new Esporte("basquete","básico");
        Esporte basqueteAvancado = new Esporte("basquete","avançado");
        Esporte skateBasico = new Esporte("skate","básico");
        Esporte skateAvancado = new Esporte("skate","avançado");
        Esporte canoagemBasica = new Esporte("canoagem","básico");
        Esporte canoagemAvancada = new Esporte("canoagem","avançada");
        esportes.create(basqueteBasico);
        esportes.create(basqueteAvancado);
        esportes.create(skateBasico);
        esportes.create(skateAvancado);
        esportes.create(canoagemBasica);
        esportes.create(canoagemAvancada);
        Pessoa fulano = new Pessoa("Fulano", "Silva", 32, esportes.get(basqueteAvancado.getId()));
        Pessoa cicrano = new Pessoa("Cicrano", "Safo", 58, esportes.get(canoagemBasica.getId()));
        atletas.create(fulano);
        atletas.create(cicrano);
    }
    public Map<UUID, Esporte> getAllSports() {
        return esportes.getEsportes();
    }

    public EsporteDTO findByName(String nome) {
         Optional<Map.Entry<UUID, Esporte>> find = esportes.getEsportes().entrySet().stream().filter(e -> e.getValue().getNome().equals(nome)).findAny();
         if (find.isPresent()) {
             return EsporteDTO.converterParaDTO(find.get().getValue());
         } else {
             throw new EsporteNaoCadastradoException("esporte não cadastrado");
         }
    }
}