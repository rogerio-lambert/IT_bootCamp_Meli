package POO_Java_IV.repository.implementations;

import POO_Java_IV.entites.Item;
import POO_Java_IV.repository.CRUDRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ItemRepo implements CRUDRepository<Item, UUID> {
    Map<UUID, Item> itens = new HashMap();

    @Override
    public void create(Item entity) {
        itens.put(entity.getId(), entity);
    }

    @Override
    public void update(UUID ID, Item entity) {
        itens.put(ID, entity);
    }

    @Override
    public void remove(UUID ID) {
        itens.remove(ID);
    }

    @Override
    public Item get(UUID ID) {
        return itens.get(ID);
    }

    public Map<UUID, Item> getItens() {
        return itens;
    }
}
