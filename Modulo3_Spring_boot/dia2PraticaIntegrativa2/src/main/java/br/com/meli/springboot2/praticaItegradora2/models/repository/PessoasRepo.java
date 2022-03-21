package br.com.meli.springboot2.praticaItegradora2.models.repository;

import br.com.meli.springboot2.praticaItegradora2.models.CRUDRepository;
import br.com.meli.springboot2.praticaItegradora2.models.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PessoasRepo implements CRUDRepository<Pessoa, UUID> {
    private Map<UUID, Pessoa> pessoas = new HashMap<>();
    @Override
    public void create(Pessoa entity) {
        pessoas.put(entity.getId(), entity);
    }

    @Override
    public void update(UUID ID, Pessoa entity) {
        pessoas.put(entity.getId(), entity);
    }

    @Override
    public void remove(UUID ID) {
        pessoas.remove(ID);
    }

    @Override
    public Pessoa get(UUID ID) {
        return pessoas.get(ID);
    }
}
