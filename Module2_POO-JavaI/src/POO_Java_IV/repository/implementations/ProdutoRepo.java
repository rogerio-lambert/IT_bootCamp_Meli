package POO_Java_IV.repository.implementations;

import POO_Java_IV.entites.Produto;
import POO_Java_IV.repository.CRUDRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProdutoRepo implements CRUDRepository<Produto, UUID>{

    Map<UUID, Produto> produtos = new HashMap();

    @Override
    public void create(Produto entity) {
        produtos.put(entity.getId(), entity);
    }

    @Override
    public void update(UUID ID, Produto entity) {
        produtos.put(ID, entity);
    }

    @Override
    public void remove(UUID ID) {
        produtos.remove(ID);
    }

    @Override
    public Produto get(UUID ID) {
        return produtos.get(ID);
    }

    public Map<UUID, Produto> getProdutos() {
        return produtos;
    }
}
