package POO_Java_IV.repository.implementations;

import POO_Java_IV.entites.Fatura;
import POO_Java_IV.entites.Item;
import POO_Java_IV.repository.CRUDRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProdutosRepo implements CRUDRepository<Item, UUID> {
    Map<UUID, Item> produtos = new HashMap();

    @Override
    public void create(Item entity) {
        UUID ID = UUID.randomUUID();
        produtos.put(ID, entity);
    }

    @Override
    public void update(UUID ID, Item entity) {
        produtos.put(ID, entity);
    }

    @Override
    public void remove(UUID ID) {
        produtos.remove(ID);
    }

    @Override
    public Item get(UUID ID) {
        return produtos.get(ID);
//        return null;
    }
}
