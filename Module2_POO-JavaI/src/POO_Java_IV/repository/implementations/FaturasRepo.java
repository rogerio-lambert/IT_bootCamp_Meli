package POO_Java_IV.repository.implementations;

import POO_Java_IV.entites.Fatura;
import POO_Java_IV.repository.CRUDRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FaturasRepo implements CRUDRepository<Fatura, UUID> {
    Map<UUID, Fatura> faturas = new HashMap();

    @Override
    public void create(Fatura entity) {
        faturas.put(entity.getId(), entity);
    }

    @Override
    public void update(UUID ID, Fatura entity) {
        faturas.put(ID, entity);
    }

    @Override
    public void remove(UUID ID) {
        faturas.remove(ID);
    }

    @Override
    public Fatura get(UUID ID) {
        return faturas.get(ID);
//        return null;
    }

    public Map<UUID, Fatura> getFaturas() {
        return faturas;
    }
}
