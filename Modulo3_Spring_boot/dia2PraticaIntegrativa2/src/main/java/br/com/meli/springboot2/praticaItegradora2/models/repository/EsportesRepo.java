package br.com.meli.springboot2.praticaItegradora2.models.repository;

import br.com.meli.springboot2.praticaItegradora2.models.CRUDRepository;
import br.com.meli.springboot2.praticaItegradora2.models.Esporte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class EsportesRepo implements CRUDRepository<Esporte, UUID> {
    private Map<UUID, Esporte> esportes = new HashMap<>();

    @Override
    public void create(Esporte entity) {
        esportes.put(entity.getId(), entity);
    }

    @Override
    public void update(UUID ID, Esporte entity) {
        esportes.put(entity.getId(), entity);
    }

    @Override
    public void remove(UUID ID) {
        esportes.remove(ID);
    }

    @Override
    public Esporte get(UUID ID) {
        return esportes.get(ID);
    }

}